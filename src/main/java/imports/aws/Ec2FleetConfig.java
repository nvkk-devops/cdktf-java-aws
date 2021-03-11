package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.488Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Ec2FleetConfig")
@software.amazon.jsii.Jsii.Proxy(Ec2FleetConfig.Jsii$Proxy.class)
public interface Ec2FleetConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * launch_template_config block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.Ec2FleetLaunchTemplateConfig> getLaunchTemplateConfig();

    /**
     * target_capacity_specification block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.Ec2FleetTargetCapacitySpecification> getTargetCapacitySpecification();

    default @org.jetbrains.annotations.Nullable java.lang.String getExcessCapacityTerminationPolicy() {
        return null;
    }

    /**
     * on_demand_options block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Ec2FleetOnDemandOptions> getOnDemandOptions() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getReplaceUnhealthyInstances() {
        return null;
    }

    /**
     * spot_options block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Ec2FleetSpotOptions> getSpotOptions() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getTerminateInstances() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getTerminateInstancesWithExpiration() {
        return null;
    }

    /**
     * timeouts block.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.Ec2FleetTimeouts getTimeouts() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getType() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Ec2FleetConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Ec2FleetConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Ec2FleetConfig> {
        private java.util.List<imports.aws.Ec2FleetLaunchTemplateConfig> launchTemplateConfig;
        private java.util.List<imports.aws.Ec2FleetTargetCapacitySpecification> targetCapacitySpecification;
        private java.lang.String excessCapacityTerminationPolicy;
        private java.util.List<imports.aws.Ec2FleetOnDemandOptions> onDemandOptions;
        private java.lang.Boolean replaceUnhealthyInstances;
        private java.util.List<imports.aws.Ec2FleetSpotOptions> spotOptions;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.lang.Boolean terminateInstances;
        private java.lang.Boolean terminateInstancesWithExpiration;
        private imports.aws.Ec2FleetTimeouts timeouts;
        private java.lang.String type;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link Ec2FleetConfig#getLaunchTemplateConfig}
         * @param launchTemplateConfig launch_template_config block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder launchTemplateConfig(java.util.List<? extends imports.aws.Ec2FleetLaunchTemplateConfig> launchTemplateConfig) {
            this.launchTemplateConfig = (java.util.List<imports.aws.Ec2FleetLaunchTemplateConfig>)launchTemplateConfig;
            return this;
        }

        /**
         * Sets the value of {@link Ec2FleetConfig#getTargetCapacitySpecification}
         * @param targetCapacitySpecification target_capacity_specification block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder targetCapacitySpecification(java.util.List<? extends imports.aws.Ec2FleetTargetCapacitySpecification> targetCapacitySpecification) {
            this.targetCapacitySpecification = (java.util.List<imports.aws.Ec2FleetTargetCapacitySpecification>)targetCapacitySpecification;
            return this;
        }

        /**
         * Sets the value of {@link Ec2FleetConfig#getExcessCapacityTerminationPolicy}
         * @param excessCapacityTerminationPolicy the value to be set.
         * @return {@code this}
         */
        public Builder excessCapacityTerminationPolicy(java.lang.String excessCapacityTerminationPolicy) {
            this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
            return this;
        }

        /**
         * Sets the value of {@link Ec2FleetConfig#getOnDemandOptions}
         * @param onDemandOptions on_demand_options block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder onDemandOptions(java.util.List<? extends imports.aws.Ec2FleetOnDemandOptions> onDemandOptions) {
            this.onDemandOptions = (java.util.List<imports.aws.Ec2FleetOnDemandOptions>)onDemandOptions;
            return this;
        }

        /**
         * Sets the value of {@link Ec2FleetConfig#getReplaceUnhealthyInstances}
         * @param replaceUnhealthyInstances the value to be set.
         * @return {@code this}
         */
        public Builder replaceUnhealthyInstances(java.lang.Boolean replaceUnhealthyInstances) {
            this.replaceUnhealthyInstances = replaceUnhealthyInstances;
            return this;
        }

        /**
         * Sets the value of {@link Ec2FleetConfig#getSpotOptions}
         * @param spotOptions spot_options block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder spotOptions(java.util.List<? extends imports.aws.Ec2FleetSpotOptions> spotOptions) {
            this.spotOptions = (java.util.List<imports.aws.Ec2FleetSpotOptions>)spotOptions;
            return this;
        }

        /**
         * Sets the value of {@link Ec2FleetConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link Ec2FleetConfig#getTerminateInstances}
         * @param terminateInstances the value to be set.
         * @return {@code this}
         */
        public Builder terminateInstances(java.lang.Boolean terminateInstances) {
            this.terminateInstances = terminateInstances;
            return this;
        }

        /**
         * Sets the value of {@link Ec2FleetConfig#getTerminateInstancesWithExpiration}
         * @param terminateInstancesWithExpiration the value to be set.
         * @return {@code this}
         */
        public Builder terminateInstancesWithExpiration(java.lang.Boolean terminateInstancesWithExpiration) {
            this.terminateInstancesWithExpiration = terminateInstancesWithExpiration;
            return this;
        }

        /**
         * Sets the value of {@link Ec2FleetConfig#getTimeouts}
         * @param timeouts timeouts block.
         * @return {@code this}
         */
        public Builder timeouts(imports.aws.Ec2FleetTimeouts timeouts) {
            this.timeouts = timeouts;
            return this;
        }

        /**
         * Sets the value of {@link Ec2FleetConfig#getType}
         * @param type the value to be set.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link Ec2FleetConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link Ec2FleetConfig#getDependsOn}
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
         * Sets the value of {@link Ec2FleetConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link Ec2FleetConfig#getProvider}
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
         * @return a new instance of {@link Ec2FleetConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Ec2FleetConfig build() {
            return new Jsii$Proxy(launchTemplateConfig, targetCapacitySpecification, excessCapacityTerminationPolicy, onDemandOptions, replaceUnhealthyInstances, spotOptions, tags, terminateInstances, terminateInstancesWithExpiration, timeouts, type, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link Ec2FleetConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Ec2FleetConfig {
        private final java.util.List<imports.aws.Ec2FleetLaunchTemplateConfig> launchTemplateConfig;
        private final java.util.List<imports.aws.Ec2FleetTargetCapacitySpecification> targetCapacitySpecification;
        private final java.lang.String excessCapacityTerminationPolicy;
        private final java.util.List<imports.aws.Ec2FleetOnDemandOptions> onDemandOptions;
        private final java.lang.Boolean replaceUnhealthyInstances;
        private final java.util.List<imports.aws.Ec2FleetSpotOptions> spotOptions;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.lang.Boolean terminateInstances;
        private final java.lang.Boolean terminateInstancesWithExpiration;
        private final imports.aws.Ec2FleetTimeouts timeouts;
        private final java.lang.String type;
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
            this.launchTemplateConfig = software.amazon.jsii.Kernel.get(this, "launchTemplateConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Ec2FleetLaunchTemplateConfig.class)));
            this.targetCapacitySpecification = software.amazon.jsii.Kernel.get(this, "targetCapacitySpecification", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Ec2FleetTargetCapacitySpecification.class)));
            this.excessCapacityTerminationPolicy = software.amazon.jsii.Kernel.get(this, "excessCapacityTerminationPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.onDemandOptions = software.amazon.jsii.Kernel.get(this, "onDemandOptions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Ec2FleetOnDemandOptions.class)));
            this.replaceUnhealthyInstances = software.amazon.jsii.Kernel.get(this, "replaceUnhealthyInstances", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.spotOptions = software.amazon.jsii.Kernel.get(this, "spotOptions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Ec2FleetSpotOptions.class)));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.terminateInstances = software.amazon.jsii.Kernel.get(this, "terminateInstances", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.terminateInstancesWithExpiration = software.amazon.jsii.Kernel.get(this, "terminateInstancesWithExpiration", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.timeouts = software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.Ec2FleetTimeouts.class));
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.Ec2FleetLaunchTemplateConfig> launchTemplateConfig, final java.util.List<? extends imports.aws.Ec2FleetTargetCapacitySpecification> targetCapacitySpecification, final java.lang.String excessCapacityTerminationPolicy, final java.util.List<? extends imports.aws.Ec2FleetOnDemandOptions> onDemandOptions, final java.lang.Boolean replaceUnhealthyInstances, final java.util.List<? extends imports.aws.Ec2FleetSpotOptions> spotOptions, final java.util.Map<java.lang.String, java.lang.String> tags, final java.lang.Boolean terminateInstances, final java.lang.Boolean terminateInstancesWithExpiration, final imports.aws.Ec2FleetTimeouts timeouts, final java.lang.String type, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.launchTemplateConfig = (java.util.List<imports.aws.Ec2FleetLaunchTemplateConfig>)java.util.Objects.requireNonNull(launchTemplateConfig, "launchTemplateConfig is required");
            this.targetCapacitySpecification = (java.util.List<imports.aws.Ec2FleetTargetCapacitySpecification>)java.util.Objects.requireNonNull(targetCapacitySpecification, "targetCapacitySpecification is required");
            this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
            this.onDemandOptions = (java.util.List<imports.aws.Ec2FleetOnDemandOptions>)onDemandOptions;
            this.replaceUnhealthyInstances = replaceUnhealthyInstances;
            this.spotOptions = (java.util.List<imports.aws.Ec2FleetSpotOptions>)spotOptions;
            this.tags = tags;
            this.terminateInstances = terminateInstances;
            this.terminateInstancesWithExpiration = terminateInstancesWithExpiration;
            this.timeouts = timeouts;
            this.type = type;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.util.List<imports.aws.Ec2FleetLaunchTemplateConfig> getLaunchTemplateConfig() {
            return this.launchTemplateConfig;
        }

        @Override
        public final java.util.List<imports.aws.Ec2FleetTargetCapacitySpecification> getTargetCapacitySpecification() {
            return this.targetCapacitySpecification;
        }

        @Override
        public final java.lang.String getExcessCapacityTerminationPolicy() {
            return this.excessCapacityTerminationPolicy;
        }

        @Override
        public final java.util.List<imports.aws.Ec2FleetOnDemandOptions> getOnDemandOptions() {
            return this.onDemandOptions;
        }

        @Override
        public final java.lang.Boolean getReplaceUnhealthyInstances() {
            return this.replaceUnhealthyInstances;
        }

        @Override
        public final java.util.List<imports.aws.Ec2FleetSpotOptions> getSpotOptions() {
            return this.spotOptions;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.lang.Boolean getTerminateInstances() {
            return this.terminateInstances;
        }

        @Override
        public final java.lang.Boolean getTerminateInstancesWithExpiration() {
            return this.terminateInstancesWithExpiration;
        }

        @Override
        public final imports.aws.Ec2FleetTimeouts getTimeouts() {
            return this.timeouts;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
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

            data.set("launchTemplateConfig", om.valueToTree(this.getLaunchTemplateConfig()));
            data.set("targetCapacitySpecification", om.valueToTree(this.getTargetCapacitySpecification()));
            if (this.getExcessCapacityTerminationPolicy() != null) {
                data.set("excessCapacityTerminationPolicy", om.valueToTree(this.getExcessCapacityTerminationPolicy()));
            }
            if (this.getOnDemandOptions() != null) {
                data.set("onDemandOptions", om.valueToTree(this.getOnDemandOptions()));
            }
            if (this.getReplaceUnhealthyInstances() != null) {
                data.set("replaceUnhealthyInstances", om.valueToTree(this.getReplaceUnhealthyInstances()));
            }
            if (this.getSpotOptions() != null) {
                data.set("spotOptions", om.valueToTree(this.getSpotOptions()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getTerminateInstances() != null) {
                data.set("terminateInstances", om.valueToTree(this.getTerminateInstances()));
            }
            if (this.getTerminateInstancesWithExpiration() != null) {
                data.set("terminateInstancesWithExpiration", om.valueToTree(this.getTerminateInstancesWithExpiration()));
            }
            if (this.getTimeouts() != null) {
                data.set("timeouts", om.valueToTree(this.getTimeouts()));
            }
            if (this.getType() != null) {
                data.set("type", om.valueToTree(this.getType()));
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
            struct.set("fqn", om.valueToTree("aws.Ec2FleetConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Ec2FleetConfig.Jsii$Proxy that = (Ec2FleetConfig.Jsii$Proxy) o;

            if (!launchTemplateConfig.equals(that.launchTemplateConfig)) return false;
            if (!targetCapacitySpecification.equals(that.targetCapacitySpecification)) return false;
            if (this.excessCapacityTerminationPolicy != null ? !this.excessCapacityTerminationPolicy.equals(that.excessCapacityTerminationPolicy) : that.excessCapacityTerminationPolicy != null) return false;
            if (this.onDemandOptions != null ? !this.onDemandOptions.equals(that.onDemandOptions) : that.onDemandOptions != null) return false;
            if (this.replaceUnhealthyInstances != null ? !this.replaceUnhealthyInstances.equals(that.replaceUnhealthyInstances) : that.replaceUnhealthyInstances != null) return false;
            if (this.spotOptions != null ? !this.spotOptions.equals(that.spotOptions) : that.spotOptions != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.terminateInstances != null ? !this.terminateInstances.equals(that.terminateInstances) : that.terminateInstances != null) return false;
            if (this.terminateInstancesWithExpiration != null ? !this.terminateInstancesWithExpiration.equals(that.terminateInstancesWithExpiration) : that.terminateInstancesWithExpiration != null) return false;
            if (this.timeouts != null ? !this.timeouts.equals(that.timeouts) : that.timeouts != null) return false;
            if (this.type != null ? !this.type.equals(that.type) : that.type != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.launchTemplateConfig.hashCode();
            result = 31 * result + (this.targetCapacitySpecification.hashCode());
            result = 31 * result + (this.excessCapacityTerminationPolicy != null ? this.excessCapacityTerminationPolicy.hashCode() : 0);
            result = 31 * result + (this.onDemandOptions != null ? this.onDemandOptions.hashCode() : 0);
            result = 31 * result + (this.replaceUnhealthyInstances != null ? this.replaceUnhealthyInstances.hashCode() : 0);
            result = 31 * result + (this.spotOptions != null ? this.spotOptions.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.terminateInstances != null ? this.terminateInstances.hashCode() : 0);
            result = 31 * result + (this.terminateInstancesWithExpiration != null ? this.terminateInstancesWithExpiration.hashCode() : 0);
            result = 31 * result + (this.timeouts != null ? this.timeouts.hashCode() : 0);
            result = 31 * result + (this.type != null ? this.type.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
