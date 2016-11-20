package com.structurizr.io.plantuml;

import com.structurizr.Workspace;
import com.structurizr.model.*;
import com.structurizr.view.ComponentView;
import com.structurizr.view.ContainerView;
import com.structurizr.view.SystemContextView;
import org.junit.Before;
import org.junit.Test;

import java.io.StringWriter;

import static org.junit.Assert.assertEquals;

public class PlantUMLWriterTests {

    private PlantUMLWriter plantUMLWriter;
    private Workspace workspace;
    private StringWriter stringWriter;

    @Before
    public void setUp() {
        plantUMLWriter = new PlantUMLWriter();
        workspace = new Workspace("Name", "Description");
        stringWriter = new StringWriter();
    }

    @Test
    public void test_write_DoesNotThrowAnExceptionWhenPassedNullParameters() throws Exception {
        plantUMLWriter.write(null, null);
        plantUMLWriter.write(workspace, null);
        plantUMLWriter.write(null, stringWriter);
    }

    @Test
    public void test_write() throws Exception {
        Model model = workspace.getModel();

        Person user = model.addPerson("User", "");
        SoftwareSystem softwareSystem = model.addSoftwareSystem("Software System", "");
        user.uses(softwareSystem, "Uses");

        SoftwareSystem emailSystem = model.addSoftwareSystem("E-mail System", "");
        softwareSystem.uses(emailSystem, "Sends e-mail using");
        emailSystem.delivers(user, "Delivers e-mails to");

        Container webApplication = softwareSystem.addContainer("Web Application", "", "");
        Container database = softwareSystem.addContainer("Database", "", "");
        user.uses(webApplication, "Uses", "HTTP");
        webApplication.uses(database, "Reads from and writes to", "JDBC");
        webApplication.uses(emailSystem, "Sends e-mail using");

        Component controller = webApplication.addComponent("SomeController", "", "Spring MVC Controller");
        Component emailComponent = webApplication.addComponent("EmailComponent", "");
        Component repository = webApplication.addComponent("SomeRepository", "", "Spring Data");
        user.uses(controller, "Uses", "HTTP");
        controller.uses(repository, "");
        controller.uses(emailComponent, "");
        repository.uses(database, "Reads from and writes to", "JDBC");
        emailComponent.uses(emailSystem, "Sends e-mails using", "SMTP");

        SystemContextView systemContextView = workspace.getViews().createSystemContextView(softwareSystem, "systemContext", "");
        systemContextView.addAllElements();

        ContainerView containerView = workspace.getViews().createContainerView(softwareSystem, "containers", "");
        containerView.addAllElements();

        ComponentView componentView = workspace.getViews().createComponentView(webApplication, "components", "");
        componentView.addAllElements();

        plantUMLWriter.write(workspace, stringWriter);
        assertEquals("@startuml" + System.lineSeparator() +
                "title Software System - System Context" + System.lineSeparator() +
                "[E-mail System] <<Software System>> as EmailSystem" + System.lineSeparator() +
                "[Software System] <<Software System>> as SoftwareSystem" + System.lineSeparator() +
                "actor User" + System.lineSeparator() +
                "EmailSystem ..> User : Delivers e-mails to " + System.lineSeparator() +
                "SoftwareSystem ..> EmailSystem : Sends e-mail using " + System.lineSeparator() +
                "User ..> SoftwareSystem : Uses " + System.lineSeparator() +
                "@enduml" + System.lineSeparator() +
                "" + System.lineSeparator() +
                "@startuml" + System.lineSeparator() +
                "title Software System - Containers" + System.lineSeparator() +
                "[E-mail System] <<Software System>> as EmailSystem" + System.lineSeparator() +
                "actor User" + System.lineSeparator() +
                "package SoftwareSystem {" + System.lineSeparator() +
                "  [Database] <<Container>> as Database" + System.lineSeparator() +
                "  [Web Application] <<Container>> as WebApplication" + System.lineSeparator() +
                "}" + System.lineSeparator() +
                "EmailSystem ..> User : Delivers e-mails to " + System.lineSeparator() +
                "User ..> WebApplication : Uses <<HTTP>>" + System.lineSeparator() +
                "WebApplication ..> Database : Reads from and writes to <<JDBC>>" + System.lineSeparator() +
                "WebApplication ..> EmailSystem : Sends e-mail using " + System.lineSeparator() +
                "@enduml" + System.lineSeparator() +
                "" + System.lineSeparator() +
                "@startuml" + System.lineSeparator() +
                "title Software System - Web Application - Components" + System.lineSeparator() +
                "[Database] <<Container>> as Database" + System.lineSeparator() +
                "[E-mail System] <<Software System>> as EmailSystem" + System.lineSeparator() +
                "actor User" + System.lineSeparator() +
                "package WebApplication {" + System.lineSeparator() +
                "  [EmailComponent] <<Component>> as EmailComponent" + System.lineSeparator() +
                "  [SomeController] <<Spring MVC Controller>> as SomeController" + System.lineSeparator() +
                "  [SomeRepository] <<Spring Data>> as SomeRepository" + System.lineSeparator() +
                "}" + System.lineSeparator() +
                "EmailSystem ..> User : Delivers e-mails to " + System.lineSeparator() +
                "EmailComponent ..> EmailSystem : Sends e-mails using <<SMTP>>" + System.lineSeparator() +
                "SomeController ..> EmailComponent  " + System.lineSeparator() +
                "SomeController ..> SomeRepository  " + System.lineSeparator() +
                "SomeRepository ..> Database : Reads from and writes to <<JDBC>>" + System.lineSeparator() +
                "User ..> SomeController : Uses <<HTTP>>" + System.lineSeparator() +
                "@enduml" + System.lineSeparator() +
                "" + System.lineSeparator(), stringWriter.toString());
    }

}