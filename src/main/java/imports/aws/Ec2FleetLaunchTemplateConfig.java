package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.489Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Ec2FleetLaunchTemplateConfig")
@software.amazon.jsii.Jsii.Proxy(Ec2FleetLaunchTemplateConfig.Jsii$Proxy.class)
public interface Ec2FleetLaunchTemplateConfig extends software.amazon.jsii.JsiiSerializable {

    /**
     * launch_template_specification block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.Ec2FleetLaunchTemplateConfigLaunchTemplateSpecification> getLaunchTemplateSpecification();

    /**
     * override block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Ec2FleetLaunchTemplateConfigOverride> getOverride() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Ec2FleetLaunchTemplateConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Ec2FleetLaunchTemplateConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Ec2FleetLaunchTemplateConfig> {
        private java.util.List<imports.aws.Ec2FleetLaunchTemplateConfigLaunchTemplateSpecification> launchTemplateSpecification;
        private java.util.List<imports.aws.Ec2FleetLaunchTemplateConfigOverride> override;

        /**
         * Sets the value of {@link Ec2FleetLaunchTemplateConfig#getLaunchTemplateSpecification}
         * @param launchTemplateSpecification launch_template_specification block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder launchTemplateSpecification(java.util.List<? extends imports.aws.Ec2FleetLaunchTemplateConfigLaunchTemplateSpecification> launchTemplateSpecification) {
            this.launchTemplateSpecification = (java.util.List<imports.aws.Ec2FleetLaunchTemplateConfigLaunchTemplateSpecification>)launchTemplateSpecification;
            return this;
        }

        /**
         * Sets the value of {@link Ec2FleetLaunchTemplateConfig#getOverride}
         * @param override override block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder override(java.util.List<? extends imports.aws.Ec2FleetLaunchTemplateConfigOverride> override) {
            this.override = (java.util.List<imports.aws.Ec2FleetLaunchTemplateConfigOverride>)override;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Ec2FleetLaunchTemplateConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Ec2FleetLaunchTemplateConfig build() {
            return new Jsii$Proxy(launchTemplateSpecification, override);
        }
    }

    /**
     * An implementation for {@link Ec2FleetLaunchTemplateConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Ec2FleetLaunchTemplateConfig {
        private final java.util.List<imports.aws.Ec2FleetLaunchTemplateConfigLaunchTemplateSpecification> launchTemplateSpecification;
        private final java.util.List<imports.aws.Ec2FleetLaunchTemplateConfigOverride> override;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.launchTemplateSpecification = software.amazon.jsii.Kernel.get(this, "launchTemplateSpecification", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Ec2FleetLaunchTemplateConfigLaunchTemplateSpecification.class)));
            this.override = software.amazon.jsii.Kernel.get(this, "override", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Ec2FleetLaunchTemplateConfigOverride.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.Ec2FleetLaunchTemplateConfigLaunchTemplateSpecification> launchTemplateSpecification, final java.util.List<? extends imports.aws.Ec2FleetLaunchTemplateConfigOverride> override) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.launchTemplateSpecification = (java.util.List<imports.aws.Ec2FleetLaunchTemplateConfigLaunchTemplateSpecification>)java.util.Objects.requireNonNull(launchTemplateSpecification, "launchTemplateSpecification is required");
            this.override = (java.util.List<imports.aws.Ec2FleetLaunchTemplateConfigOverride>)override;
        }

        @Override
        public final java.util.List<imports.aws.Ec2FleetLaunchTemplateConfigLaunchTemplateSpecification> getLaunchTemplateSpecification() {
            return this.launchTemplateSpecification;
        }

        @Override
        public final java.util.List<imports.aws.Ec2FleetLaunchTemplateConfigOverride> getOverride() {
            return this.override;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("launchTemplateSpecification", om.valueToTree(this.getLaunchTemplateSpecification()));
            if (this.getOverride() != null) {
                data.set("override", om.valueToTree(this.getOverride()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.Ec2FleetLaunchTemplateConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Ec2FleetLaunchTemplateConfig.Jsii$Proxy that = (Ec2FleetLaunchTemplateConfig.Jsii$Proxy) o;

            if (!launchTemplateSpecification.equals(that.launchTemplateSpecification)) return false;
            return this.override != null ? this.override.equals(that.override) : that.override == null;
        }

        @Override
        public final int hashCode() {
            int result = this.launchTemplateSpecification.hashCode();
            result = 31 * result + (this.override != null ? this.override.hashCode() : 0);
            return result;
        }
    }
}
