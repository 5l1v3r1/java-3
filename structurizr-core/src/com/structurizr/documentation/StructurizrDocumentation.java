package com.structurizr.documentation;

import com.structurizr.model.Component;
import com.structurizr.model.Container;
import com.structurizr.model.Model;
import com.structurizr.model.SoftwareSystem;

import java.io.File;
import java.io.IOException;

/**
 * A simple documentation template, based upon the "software guidebook" concept in
 * Simon Brown's "Software Architecture for Developers" book.
 */
public final class StructurizrDocumentation extends Documentation {

    public static final int GROUP1 = 1;
    public static final int GROUP2 = 2;
    public static final int GROUP3 = 3;
    public static final int GROUP4 = 4;
    public static final int GROUP5 = 5;

    StructurizrDocumentation() {
    }

    public StructurizrDocumentation(Model model) {
        super(model);
    }

    /**
     * Adds a "Context" section relating to a {@link SoftwareSystem} from a file.
     *
     * @param softwareSystem    the {@link SoftwareSystem} the documentation content relates to
     * @param format    the {@link Format} of the documentation content
     * @param file  a File that points to the documentation content
     * @return  a documentation {@link Section}
     * @throws IOException  if the file can't be read
     */
    public Section addContextSection(SoftwareSystem softwareSystem, Format format, File file) throws IOException {
        return addContextSection(softwareSystem, format, readFile(file));
    }

    /**
     * Adds a "Context" section relating to a {@link SoftwareSystem}.
     *
     * @param softwareSystem    the {@link SoftwareSystem} the documentation content relates to
     * @param format    the {@link Format} of the documentation content
     * @param content   a String containing the documentation content
     * @return  a documentation {@link Section}
     */
    public Section addContextSection(SoftwareSystem softwareSystem, Format format, String content) {
        return addSection(softwareSystem, "Context", GROUP1, format, content);
    }

    /**
     * Adds a "Functional Overview" section relating to a {@link SoftwareSystem} from a file.
     *
     * @param softwareSystem    the {@link SoftwareSystem} the documentation content relates to
     * @param format    the {@link Format} of the documentation content
     * @param file  a File that points to the documentation content
     * @return  a documentation {@link Section}
     * @throws IOException  if the file can't be read
     */
    public Section addFunctionalOverviewSection(SoftwareSystem softwareSystem, Format format, File file) throws IOException {
        return addFunctionalOverviewSection(softwareSystem, format, readFile(file));
    }

    /**
     * Adds a "Functional Overview" section relating to a {@link SoftwareSystem}.
     *
     * @param softwareSystem    the {@link SoftwareSystem} the documentation content relates to
     * @param format    the {@link Format} of the documentation content
     * @param content   a String containing the documentation content
     * @return  a documentation {@link Section}
     */
    public Section addFunctionalOverviewSection(SoftwareSystem softwareSystem, Format format, String content) {
        return addSection(softwareSystem, "Functional Overview", GROUP2, format, content);
    }

    /**
     * Adds a "Quality Attributes" section relating to a {@link SoftwareSystem} from a file.
     *
     * @param softwareSystem    the {@link SoftwareSystem} the documentation content relates to
     * @param format    the {@link Format} of the documentation content
     * @param file  a File that points to the documentation content
     * @return  a documentation {@link Section}
     * @throws IOException  if the file can't be read
     */
    public Section addQualityAttributesSection(SoftwareSystem softwareSystem, Format format, File file) throws IOException {
        return addQualityAttributesSection(softwareSystem, format, readFile(file));
    }

    /**
     * Adds a "Quality Attributes" section relating to a {@link SoftwareSystem}.
     *
     * @param softwareSystem    the {@link SoftwareSystem} the documentation content relates to
     * @param format    the {@link Format} of the documentation content
     * @param content   a String containing the documentation content
     * @return  a documentation {@link Section}
     */
    public Section addQualityAttributesSection(SoftwareSystem softwareSystem, Format format, String content) {
        return addSection(softwareSystem, "Quality Attributes", GROUP2, format, content);
    }

    /**
     * Adds a "Constraints" section relating to a {@link SoftwareSystem} from a file.
     *
     * @param softwareSystem    the {@link SoftwareSystem} the documentation content relates to
     * @param format    the {@link Format} of the documentation content
     * @param file  a File that points to the documentation content
     * @return  a documentation {@link Section}
     * @throws IOException  if the file can't be read
     */
    public Section addConstraintsSection(SoftwareSystem softwareSystem, Format format, File file) throws IOException {
        return addConstraintsSection(softwareSystem, format, readFile(file));
    }

    /**
     * Adds a "Constraints" section relating to a {@link SoftwareSystem}.
     *
     * @param softwareSystem    the {@link SoftwareSystem} the documentation content relates to
     * @param format    the {@link Format} of the documentation content
     * @param content   a String containing the documentation content
     * @return  a documentation {@link Section}
     */
    public Section addConstraintsSection(SoftwareSystem softwareSystem, Format format, String content) {
        return addSection(softwareSystem, "Constraints", GROUP2, format, content);
    }

    /**
     * Adds a "Principles" section relating to a {@link SoftwareSystem} from a file.
     *
     * @param softwareSystem    the {@link SoftwareSystem} the documentation content relates to
     * @param format    the {@link Format} of the documentation content
     * @param file  a File that points to the documentation content
     * @return  a documentation {@link Section}
     * @throws IOException  if the file can't be read
     */
    public Section addPrinciplesSection(SoftwareSystem softwareSystem, Format format, File file) throws IOException {
        return addPrinciplesSection(softwareSystem, format, readFile(file));
    }

    /**
     * Adds a "Principles" section relating to a {@link SoftwareSystem}.
     *
     * @param softwareSystem    the {@link SoftwareSystem} the documentation content relates to
     * @param format    the {@link Format} of the documentation content
     * @param content   a String containing the documentation content
     * @return  a documentation {@link Section}
     */
    public Section addPrinciplesSection(SoftwareSystem softwareSystem, Format format, String content) {
        return addSection(softwareSystem, "Principles", GROUP2, format, content);
    }

    /**
     * Adds a "Software Architecture" section relating to a {@link SoftwareSystem} from a file.
     *
     * @param softwareSystem    the {@link SoftwareSystem} the documentation content relates to
     * @param format    the {@link Format} of the documentation content
     * @param file  a File that points to the documentation content
     * @return  a documentation {@link Section}
     * @throws IOException  if the file can't be read
     */
    public Section addSoftwareArchitectureSection(SoftwareSystem softwareSystem, Format format, File file) throws IOException {
        return addSoftwareArchitectureSection(softwareSystem, format, readFile(file));
    }

    /**
     * Adds a "Software Architecture" section relating to a {@link SoftwareSystem}.
     *
     * @param softwareSystem    the {@link SoftwareSystem} the documentation content relates to
     * @param format    the {@link Format} of the documentation content
     * @param content   a String containing the documentation content
     * @return  a documentation {@link Section}
     */
    public Section addSoftwareArchitectureSection(SoftwareSystem softwareSystem, Format format, String content) {
        return addSection(softwareSystem, "Software Architecture", GROUP3, format, content);
    }

    /**
     * Adds a "Containers" section relating to a {@link SoftwareSystem} from a file.
     *
     * @param softwareSystem    the {@link SoftwareSystem} the documentation content relates to
     * @param format    the {@link Format} of the documentation content
     * @param file  a File that points to the documentation content
     * @return  a documentation {@link Section}
     * @throws IOException  if the file can't be read
     */
    public Section addContainersSection(SoftwareSystem softwareSystem, Format format, File file) throws IOException {
        return addContainersSection(softwareSystem, format, readFile(file));
    }

    /**
     * Adds a "Containers" section relating to a {@link SoftwareSystem}.
     *
     * @param softwareSystem    the {@link SoftwareSystem} the documentation content relates to
     * @param format    the {@link Format} of the documentation content
     * @param content   a String containing the documentation content
     * @return  a documentation {@link Section}
     */
    public Section addContainersSection(SoftwareSystem softwareSystem, Format format, String content) {
        return addSection(softwareSystem, "Containers", GROUP3, format, content);
    }

    /**
     * Adds a "Components" section relating to a {@link Container} from a file.
     *
     * @param container     the {@link Container} the documentation content relates to
     * @param format    the {@link Format} of the documentation content
     * @param file  a File that points to the documentation content
     * @return  a documentation {@link Section}
     * @throws IOException  if the file can't be read
     */
    public Section addComponentsSection(Container container, Format format, File file) throws IOException {
        return addComponentsSection(container, format, readFile(file));
    }

    /**
     * Adds a "Components" section relating to a {@link Container}.
     *
     * @param container     the {@link Container} the documentation content relates to
     * @param format    the {@link Format} of the documentation content
     * @param content   a String containing the documentation content
     * @return  a documentation {@link Section}
     */
    public Section addComponentsSection(Container container, Format format, String content) {
        return addSection(container, "Components", GROUP3, format, content);
    }

    /**
     * Adds a "Code" section relating to a {@link Container} from a file.
     *
     * @param component     the {@link Component} the documentation content relates to
     * @param format    the {@link Format} of the documentation content
     * @param file  a File that points to the documentation content
     * @return  a documentation {@link Section}
     * @throws IOException  if the file can't be read
     */
    public Section addCodeSection(Component component, Format format, File file) throws IOException {
        return addCodeSection(component, format, readFile(file));
    }

    /**
     * Adds a "Code" section relating to a {@link Container}.
     *
     * @param component     the {@link Component} the documentation content relates to
     * @param format    the {@link Format} of the documentation content
     * @param content   a String containing the documentation content
     * @return  a documentation {@link Section}
     */
    public Section addCodeSection(Component component, Format format, String content) {
        return addSection(component, "Code", GROUP3, format, content);
    }

    /**
     * Adds a "Data" section relating to a {@link SoftwareSystem} from a file.
     *
     * @param softwareSystem    the {@link SoftwareSystem} the documentation content relates to
     * @param format    the {@link Format} of the documentation content
     * @param file  a File that points to the documentation content
     * @return  a documentation {@link Section}
     * @throws IOException  if the file can't be read
     */
    public Section addDataSection(SoftwareSystem softwareSystem, Format format, File file) throws IOException {
        return addDataSection(softwareSystem, format, readFile(file));
    }

    /**
     * Adds a "Data" section relating to a {@link SoftwareSystem}.
     *
     * @param softwareSystem    the {@link SoftwareSystem} the documentation content relates to
     * @param format    the {@link Format} of the documentation content
     * @param content   a String containing the documentation content
     * @return  a documentation {@link Section}
     */
    public Section addDataSection(SoftwareSystem softwareSystem, Format format, String content) {
        return addSection(softwareSystem, "Data", GROUP3, format, content);
    }

    /**
     * Adds an "Infrastructure Architecture" section relating to a {@link SoftwareSystem} from a file.
     *
     * @param softwareSystem    the {@link SoftwareSystem} the documentation content relates to
     * @param format    the {@link Format} of the documentation content
     * @param file  a File that points to the documentation content
     * @return  a documentation {@link Section}
     * @throws IOException  if the file can't be read
     */
    public Section addInfrastructureArchitectureSection(SoftwareSystem softwareSystem, Format format, File file) throws IOException {
        return addInfrastructureArchitectureSection(softwareSystem, format, readFile(file));
    }

    /**
     * Adds a "Infrastructure Architecture" section relating to a {@link SoftwareSystem}.
     *
     * @param softwareSystem    the {@link SoftwareSystem} the documentation content relates to
     * @param format    the {@link Format} of the documentation content
     * @param content   a String containing the documentation content
     * @return  a documentation {@link Section}
     */
    public Section addInfrastructureArchitectureSection(SoftwareSystem softwareSystem, Format format, String content) {
        return addSection(softwareSystem, "Infrastructure Architecture", GROUP4, format, content);
    }

    /**
     * Adds a "Deployment" section relating to a {@link SoftwareSystem} from a file.
     *
     * @param softwareSystem    the {@link SoftwareSystem} the documentation content relates to
     * @param format    the {@link Format} of the documentation content
     * @param file  a File that points to the documentation content
     * @return  a documentation {@link Section}
     * @throws IOException  if the file can't be read
     */
    public Section addDeploymentSection(SoftwareSystem softwareSystem, Format format, File file) throws IOException {
        return addDeploymentSection(softwareSystem, format, readFile(file));
    }

    /**
     * Adds a "Deployment" section relating to a {@link SoftwareSystem}.
     *
     * @param softwareSystem    the {@link SoftwareSystem} the documentation content relates to
     * @param format    the {@link Format} of the documentation content
     * @param content   a String containing the documentation content
     * @return  a documentation {@link Section}
     */
    public Section addDeploymentSection(SoftwareSystem softwareSystem, Format format, String content) {
        return addSection(softwareSystem, "Deployment", GROUP4, format, content);
    }

    /**
     * Adds a "Development Environment" section relating to a {@link SoftwareSystem} from a file.
     *
     * @param softwareSystem    the {@link SoftwareSystem} the documentation content relates to
     * @param format    the {@link Format} of the documentation content
     * @param file  a File that points to the documentation content
     * @return  a documentation {@link Section}
     * @throws IOException  if the file can't be read
     */
    public Section addDevelopmentEnvironmentSection(SoftwareSystem softwareSystem, Format format, File file) throws IOException {
        return addDevelopmentEnvironmentSection(softwareSystem, format, readFile(file));
    }

    /**
     * Adds a "Development Environment" section relating to a {@link SoftwareSystem}.
     *
     * @param softwareSystem    the {@link SoftwareSystem} the documentation content relates to
     * @param format    the {@link Format} of the documentation content
     * @param content   a String containing the documentation content
     * @return  a documentation {@link Section}
     */
    public Section addDevelopmentEnvironmentSection(SoftwareSystem softwareSystem, Format format, String content) {
        return addSection(softwareSystem, "Development Environment", GROUP4, format, content);
    }

    /**
     * Adds an "Operation and Support" section relating to a {@link SoftwareSystem} from a file.
     *
     * @param softwareSystem    the {@link SoftwareSystem} the documentation content relates to
     * @param format    the {@link Format} of the documentation content
     * @param file  a File that points to the documentation content
     * @return  a documentation {@link Section}
     * @throws IOException  if the file can't be read
     */
    public Section addOperationAndSupportSection(SoftwareSystem softwareSystem, Format format, File file) throws IOException {
        return addOperationAndSupportSection(softwareSystem, format, readFile(file));
    }

    /**
     * Adds a "Operation and Support" section relating to a {@link SoftwareSystem}.
     *
     * @param softwareSystem    the {@link SoftwareSystem} the documentation content relates to
     * @param format    the {@link Format} of the documentation content
     * @param content   a String containing the documentation content
     * @return  a documentation {@link Section}
     */
    public Section addOperationAndSupportSection(SoftwareSystem softwareSystem, Format format, String content) {
        return addSection(softwareSystem, "Operation And Support", GROUP4, format, content);
    }

    /**
     * Adds a "Decision Log" section relating to a {@link SoftwareSystem} from a file.
     *
     * @param softwareSystem    the {@link SoftwareSystem} the documentation content relates to
     * @param format    the {@link Format} of the documentation content
     * @param file  a File that points to the documentation content
     * @return  a documentation {@link Section}
     * @throws IOException  if the file can't be read
     */
    public Section addDecisionLog(SoftwareSystem softwareSystem, Format format, File file) throws IOException {
        return addDecisionLog(softwareSystem, format, readFile(file));
    }

    /**
     * Adds a "Decision Log" section relating to a {@link SoftwareSystem}.
     *
     * @param softwareSystem    the {@link SoftwareSystem} the documentation content relates to
     * @param format    the {@link Format} of the documentation content
     * @param content   a String containing the documentation content
     * @return  a documentation {@link Section}
     */
    public Section addDecisionLog(SoftwareSystem softwareSystem, Format format, String content) {
        return addSection(softwareSystem, "Decision Log", GROUP5, format, content);
    }

}