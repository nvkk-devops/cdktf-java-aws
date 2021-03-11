package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.693Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.LaunchTemplateLicenseSpecification")
@software.amazon.jsii.Jsii.Proxy(LaunchTemplateLicenseSpecification.Jsii$Proxy.class)
public interface LaunchTemplateLicenseSpecification extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getLicenseConfigurationArn();

    /**
     * @return a {@link Builder} of {@link LaunchTemplateLicenseSpecification}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LaunchTemplateLicenseSpecification}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LaunchTemplateLicenseSpecification> {
        private java.lang.String licenseConfigurationArn;

        /**
         * Sets the value of {@link LaunchTemplateLicenseSpecification#getLicenseConfigurationArn}
         * @param licenseConfigurationArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder licenseConfigurationArn(java.lang.String licenseConfigurationArn) {
            this.licenseConfigurationArn = licenseConfigurationArn;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link LaunchTemplateLicenseSpecification}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LaunchTemplateLicenseSpecification build() {
            return new Jsii$Proxy(licenseConfigurationArn);
        }
    }

    /**
     * An implementation for {@link LaunchTemplateLicenseSpecification}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LaunchTemplateLicenseSpecification {
        private final java.lang.String licenseConfigurationArn;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.licenseConfigurationArn = software.amazon.jsii.Kernel.get(this, "licenseConfigurationArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String licenseConfigurationArn) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.licenseConfigurationArn = java.util.Objects.requireNonNull(licenseConfigurationArn, "licenseConfigurationArn is required");
        }

        @Override
        public final java.lang.String getLicenseConfigurationArn() {
            return this.licenseConfigurationArn;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("licenseConfigurationArn", om.valueToTree(this.getLicenseConfigurationArn()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.LaunchTemplateLicenseSpecification"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LaunchTemplateLicenseSpecification.Jsii$Proxy that = (LaunchTemplateLicenseSpecification.Jsii$Proxy) o;

            return this.licenseConfigurationArn.equals(that.licenseConfigurationArn);
        }

        @Override
        public final int hashCode() {
            int result = this.licenseConfigurationArn.hashCode();
            return result;
        }
    }
}
