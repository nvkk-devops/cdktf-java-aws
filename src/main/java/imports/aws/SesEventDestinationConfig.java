package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.862Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.SesEventDestinationConfig")
@software.amazon.jsii.Jsii.Proxy(SesEventDestinationConfig.Jsii$Proxy.class)
public interface SesEventDestinationConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getConfigurationSetName();

    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getMatchingTypes();

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * cloudwatch_destination block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SesEventDestinationCloudwatchDestination> getCloudwatchDestination() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getEnabled() {
        return null;
    }

    /**
     * kinesis_destination block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SesEventDestinationKinesisDestination> getKinesisDestination() {
        return null;
    }

    /**
     * sns_destination block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SesEventDestinationSnsDestination> getSnsDestination() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SesEventDestinationConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SesEventDestinationConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SesEventDestinationConfig> {
        private java.lang.String configurationSetName;
        private java.util.List<java.lang.String> matchingTypes;
        private java.lang.String name;
        private java.util.List<imports.aws.SesEventDestinationCloudwatchDestination> cloudwatchDestination;
        private java.lang.Boolean enabled;
        private java.util.List<imports.aws.SesEventDestinationKinesisDestination> kinesisDestination;
        private java.util.List<imports.aws.SesEventDestinationSnsDestination> snsDestination;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link SesEventDestinationConfig#getConfigurationSetName}
         * @param configurationSetName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder configurationSetName(java.lang.String configurationSetName) {
            this.configurationSetName = configurationSetName;
            return this;
        }

        /**
         * Sets the value of {@link SesEventDestinationConfig#getMatchingTypes}
         * @param matchingTypes the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder matchingTypes(java.util.List<java.lang.String> matchingTypes) {
            this.matchingTypes = matchingTypes;
            return this;
        }

        /**
         * Sets the value of {@link SesEventDestinationConfig#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link SesEventDestinationConfig#getCloudwatchDestination}
         * @param cloudwatchDestination cloudwatch_destination block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder cloudwatchDestination(java.util.List<? extends imports.aws.SesEventDestinationCloudwatchDestination> cloudwatchDestination) {
            this.cloudwatchDestination = (java.util.List<imports.aws.SesEventDestinationCloudwatchDestination>)cloudwatchDestination;
            return this;
        }

        /**
         * Sets the value of {@link SesEventDestinationConfig#getEnabled}
         * @param enabled the value to be set.
         * @return {@code this}
         */
        public Builder enabled(java.lang.Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Sets the value of {@link SesEventDestinationConfig#getKinesisDestination}
         * @param kinesisDestination kinesis_destination block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder kinesisDestination(java.util.List<? extends imports.aws.SesEventDestinationKinesisDestination> kinesisDestination) {
            this.kinesisDestination = (java.util.List<imports.aws.SesEventDestinationKinesisDestination>)kinesisDestination;
            return this;
        }

        /**
         * Sets the value of {@link SesEventDestinationConfig#getSnsDestination}
         * @param snsDestination sns_destination block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder snsDestination(java.util.List<? extends imports.aws.SesEventDestinationSnsDestination> snsDestination) {
            this.snsDestination = (java.util.List<imports.aws.SesEventDestinationSnsDestination>)snsDestination;
            return this;
        }

        /**
         * Sets the value of {@link SesEventDestinationConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link SesEventDestinationConfig#getDependsOn}
         * @param dependsOn the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder dependsOn(java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            return this;
        }

        /**
         * Sets the value of {@link SesEventDestinationConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link SesEventDestinationConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SesEventDestinationConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SesEventDestinationConfig build() {
            return new Jsii$Proxy(configurationSetName, matchingTypes, name, cloudwatchDestination, enabled, kinesisDestination, snsDestination, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link SesEventDestinationConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SesEventDestinationConfig {
        private final java.lang.String configurationSetName;
        private final java.util.List<java.lang.String> matchingTypes;
        private final java.lang.String name;
        private final java.util.List<imports.aws.SesEventDestinationCloudwatchDestination> cloudwatchDestination;
        private final java.lang.Boolean enabled;
        private final java.util.List<imports.aws.SesEventDestinationKinesisDestination> kinesisDestination;
        private final java.util.List<imports.aws.SesEventDestinationSnsDestination> snsDestination;
        private final java.lang.Number count;
        private final java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private final com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.configurationSetName = software.amazon.jsii.Kernel.get(this, "configurationSetName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.matchingTypes = software.amazon.jsii.Kernel.get(this, "matchingTypes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.cloudwatchDestination = software.amazon.jsii.Kernel.get(this, "cloudwatchDestination", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SesEventDestinationCloudwatchDestination.class)));
            this.enabled = software.amazon.jsii.Kernel.get(this, "enabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.kinesisDestination = software.amazon.jsii.Kernel.get(this, "kinesisDestination", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SesEventDestinationKinesisDestination.class)));
            this.snsDestination = software.amazon.jsii.Kernel.get(this, "snsDestination", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SesEventDestinationSnsDestination.class)));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String configurationSetName, final java.util.List<java.lang.String> matchingTypes, final java.lang.String name, final java.util.List<? extends imports.aws.SesEventDestinationCloudwatchDestination> cloudwatchDestination, final java.lang.Boolean enabled, final java.util.List<? extends imports.aws.SesEventDestinationKinesisDestination> kinesisDestination, final java.util.List<? extends imports.aws.SesEventDestinationSnsDestination> snsDestination, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.configurationSetName = java.util.Objects.requireNonNull(configurationSetName, "configurationSetName is required");
            this.matchingTypes = java.util.Objects.requireNonNull(matchingTypes, "matchingTypes is required");
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.cloudwatchDestination = (java.util.List<imports.aws.SesEventDestinationCloudwatchDestination>)cloudwatchDestination;
            this.enabled = enabled;
            this.kinesisDestination = (java.util.List<imports.aws.SesEventDestinationKinesisDestination>)kinesisDestination;
            this.snsDestination = (java.util.List<imports.aws.SesEventDestinationSnsDestination>)snsDestination;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getConfigurationSetName() {
            return this.configurationSetName;
        }

        @Override
        public final java.util.List<java.lang.String> getMatchingTypes() {
            return this.matchingTypes;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.util.List<imports.aws.SesEventDestinationCloudwatchDestination> getCloudwatchDestination() {
            return this.cloudwatchDestination;
        }

        @Override
        public final java.lang.Boolean getEnabled() {
            return this.enabled;
        }

        @Override
        public final java.util.List<imports.aws.SesEventDestinationKinesisDestination> getKinesisDestination() {
            return this.kinesisDestination;
        }

        @Override
        public final java.util.List<imports.aws.SesEventDestinationSnsDestination> getSnsDestination() {
            return this.snsDestination;
        }

        @Override
        public final java.lang.Number getCount() {
            return this.count;
        }

        @Override
        public final java.util.List<com.hashicorp.cdktf.ITerraformDependable> getDependsOn() {
            return this.dependsOn;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformResourceLifecycle getLifecycle() {
            return this.lifecycle;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformProvider getProvider() {
            return this.provider;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("configurationSetName", om.valueToTree(this.getConfigurationSetName()));
            data.set("matchingTypes", om.valueToTree(this.getMatchingTypes()));
            data.set("name", om.valueToTree(this.getName()));
            if (this.getCloudwatchDestination() != null) {
                data.set("cloudwatchDestination", om.valueToTree(this.getCloudwatchDestination()));
            }
            if (this.getEnabled() != null) {
                data.set("enabled", om.valueToTree(this.getEnabled()));
            }
            if (this.getKinesisDestination() != null) {
                data.set("kinesisDestination", om.valueToTree(this.getKinesisDestination()));
            }
            if (this.getSnsDestination() != null) {
                data.set("snsDestination", om.valueToTree(this.getSnsDestination()));
            }
            if (this.getCount() != null) {
                data.set("count", om.valueToTree(this.getCount()));
            }
            if (this.getDependsOn() != null) {
                data.set("dependsOn", om.valueToTree(this.getDependsOn()));
            }
            if (this.getLifecycle() != null) {
                data.set("lifecycle", om.valueToTree(this.getLifecycle()));
            }
            if (this.getProvider() != null) {
                data.set("provider", om.valueToTree(this.getProvider()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.SesEventDestinationConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SesEventDestinationConfig.Jsii$Proxy that = (SesEventDestinationConfig.Jsii$Proxy) o;

            if (!configurationSetName.equals(that.configurationSetName)) return false;
            if (!matchingTypes.equals(that.matchingTypes)) return false;
            if (!name.equals(that.name)) return false;
            if (this.cloudwatchDestination != null ? !this.cloudwatchDestination.equals(that.cloudwatchDestination) : that.cloudwatchDestination != null) return false;
            if (this.enabled != null ? !this.enabled.equals(that.enabled) : that.enabled != null) return false;
            if (this.kinesisDestination != null ? !this.kinesisDestination.equals(that.kinesisDestination) : that.kinesisDestination != null) return false;
            if (this.snsDestination != null ? !this.snsDestination.equals(that.snsDestination) : that.snsDestination != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.configurationSetName.hashCode();
            result = 31 * result + (this.matchingTypes.hashCode());
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.cloudwatchDestination != null ? this.cloudwatchDestination.hashCode() : 0);
            result = 31 * result + (this.enabled != null ? this.enabled.hashCode() : 0);
            result = 31 * result + (this.kinesisDestination != null ? this.kinesisDestination.hashCode() : 0);
            result = 31 * result + (this.snsDestination != null ? this.snsDestination.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
