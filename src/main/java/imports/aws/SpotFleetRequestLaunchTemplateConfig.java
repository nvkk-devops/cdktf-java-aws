package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.884Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.SpotFleetRequestLaunchTemplateConfig")
@software.amazon.jsii.Jsii.Proxy(SpotFleetRequestLaunchTemplateConfig.Jsii$Proxy.class)
public interface SpotFleetRequestLaunchTemplateConfig extends software.amazon.jsii.JsiiSerializable {

    /**
     * launch_template_specification block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecification> getLaunchTemplateSpecification();

    /**
     * overrides block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SpotFleetRequestLaunchTemplateConfigOverrides> getOverrides() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SpotFleetRequestLaunchTemplateConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SpotFleetRequestLaunchTemplateConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SpotFleetRequestLaunchTemplateConfig> {
        private java.util.List<imports.aws.SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecification> launchTemplateSpecification;
        private java.util.List<imports.aws.SpotFleetRequestLaunchTemplateConfigOverrides> overrides;

        /**
         * Sets the value of {@link SpotFleetRequestLaunchTemplateConfig#getLaunchTemplateSpecification}
         * @param launchTemplateSpecification launch_template_specification block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder launchTemplateSpecification(java.util.List<? extends imports.aws.SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecification> launchTemplateSpecification) {
            this.launchTemplateSpecification = (java.util.List<imports.aws.SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecification>)launchTemplateSpecification;
            return this;
        }

        /**
         * Sets the value of {@link SpotFleetRequestLaunchTemplateConfig#getOverrides}
         * @param overrides overrides block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder overrides(java.util.List<? extends imports.aws.SpotFleetRequestLaunchTemplateConfigOverrides> overrides) {
            this.overrides = (java.util.List<imports.aws.SpotFleetRequestLaunchTemplateConfigOverrides>)overrides;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SpotFleetRequestLaunchTemplateConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SpotFleetRequestLaunchTemplateConfig build() {
            return new Jsii$Proxy(launchTemplateSpecification, overrides);
        }
    }

    /**
     * An implementation for {@link SpotFleetRequestLaunchTemplateConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SpotFleetRequestLaunchTemplateConfig {
        private final java.util.List<imports.aws.SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecification> launchTemplateSpecification;
        private final java.util.List<imports.aws.SpotFleetRequestLaunchTemplateConfigOverrides> overrides;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.launchTemplateSpecification = software.amazon.jsii.Kernel.get(this, "launchTemplateSpecification", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecification.class)));
            this.overrides = software.amazon.jsii.Kernel.get(this, "overrides", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SpotFleetRequestLaunchTemplateConfigOverrides.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecification> launchTemplateSpecification, final java.util.List<? extends imports.aws.SpotFleetRequestLaunchTemplateConfigOverrides> overrides) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.launchTemplateSpecification = (java.util.List<imports.aws.SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecification>)java.util.Objects.requireNonNull(launchTemplateSpecification, "launchTemplateSpecification is required");
            this.overrides = (java.util.List<imports.aws.SpotFleetRequestLaunchTemplateConfigOverrides>)overrides;
        }

        @Override
        public final java.util.List<imports.aws.SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecification> getLaunchTemplateSpecification() {
            return this.launchTemplateSpecification;
        }

        @Override
        public final java.util.List<imports.aws.SpotFleetRequestLaunchTemplateConfigOverrides> getOverrides() {
            return this.overrides;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("launchTemplateSpecification", om.valueToTree(this.getLaunchTemplateSpecification()));
            if (this.getOverrides() != null) {
                data.set("overrides", om.valueToTree(this.getOverrides()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.SpotFleetRequestLaunchTemplateConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SpotFleetRequestLaunchTemplateConfig.Jsii$Proxy that = (SpotFleetRequestLaunchTemplateConfig.Jsii$Proxy) o;

            if (!launchTemplateSpecification.equals(that.launchTemplateSpecification)) return false;
            return this.overrides != null ? this.overrides.equals(that.overrides) : that.overrides == null;
        }

        @Override
        public final int hashCode() {
            int result = this.launchTemplateSpecification.hashCode();
            result = 31 * result + (this.overrides != null ? this.overrides.hashCode() : 0);
            return result;
        }
    }
}
