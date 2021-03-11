package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.582Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.GameliftFleetConfig")
@software.amazon.jsii.Jsii.Proxy(GameliftFleetConfig.Jsii$Proxy.class)
public interface GameliftFleetConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getBuildId();

    @org.jetbrains.annotations.NotNull java.lang.String getEc2InstanceType();

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    default @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return null;
    }

    /**
     * ec2_inbound_permission block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.GameliftFleetEc2InboundPermission> getEc2InboundPermission() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getFleetType() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getInstanceRoleArn() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getMetricGroups() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getNewGameSessionProtectionPolicy() {
        return null;
    }

    /**
     * resource_creation_limit_policy block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.GameliftFleetResourceCreationLimitPolicy> getResourceCreationLimitPolicy() {
        return null;
    }

    /**
     * runtime_configuration block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.GameliftFleetRuntimeConfiguration> getRuntimeConfiguration() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * timeouts block.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.GameliftFleetTimeouts getTimeouts() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link GameliftFleetConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link GameliftFleetConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<GameliftFleetConfig> {
        private java.lang.String buildId;
        private java.lang.String ec2InstanceType;
        private java.lang.String name;
        private java.lang.String description;
        private java.util.List<imports.aws.GameliftFleetEc2InboundPermission> ec2InboundPermission;
        private java.lang.String fleetType;
        private java.lang.String instanceRoleArn;
        private java.util.List<java.lang.String> metricGroups;
        private java.lang.String newGameSessionProtectionPolicy;
        private java.util.List<imports.aws.GameliftFleetResourceCreationLimitPolicy> resourceCreationLimitPolicy;
        private java.util.List<imports.aws.GameliftFleetRuntimeConfiguration> runtimeConfiguration;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private imports.aws.GameliftFleetTimeouts timeouts;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link GameliftFleetConfig#getBuildId}
         * @param buildId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder buildId(java.lang.String buildId) {
            this.buildId = buildId;
            return this;
        }

        /**
         * Sets the value of {@link GameliftFleetConfig#getEc2InstanceType}
         * @param ec2InstanceType the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder ec2InstanceType(java.lang.String ec2InstanceType) {
            this.ec2InstanceType = ec2InstanceType;
            return this;
        }

        /**
         * Sets the value of {@link GameliftFleetConfig#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link GameliftFleetConfig#getDescription}
         * @param description the value to be set.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link GameliftFleetConfig#getEc2InboundPermission}
         * @param ec2InboundPermission ec2_inbound_permission block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder ec2InboundPermission(java.util.List<? extends imports.aws.GameliftFleetEc2InboundPermission> ec2InboundPermission) {
            this.ec2InboundPermission = (java.util.List<imports.aws.GameliftFleetEc2InboundPermission>)ec2InboundPermission;
            return this;
        }

        /**
         * Sets the value of {@link GameliftFleetConfig#getFleetType}
         * @param fleetType the value to be set.
         * @return {@code this}
         */
        public Builder fleetType(java.lang.String fleetType) {
            this.fleetType = fleetType;
            return this;
        }

        /**
         * Sets the value of {@link GameliftFleetConfig#getInstanceRoleArn}
         * @param instanceRoleArn the value to be set.
         * @return {@code this}
         */
        public Builder instanceRoleArn(java.lang.String instanceRoleArn) {
            this.instanceRoleArn = instanceRoleArn;
            return this;
        }

        /**
         * Sets the value of {@link GameliftFleetConfig#getMetricGroups}
         * @param metricGroups the value to be set.
         * @return {@code this}
         */
        public Builder metricGroups(java.util.List<java.lang.String> metricGroups) {
            this.metricGroups = metricGroups;
            return this;
        }

        /**
         * Sets the value of {@link GameliftFleetConfig#getNewGameSessionProtectionPolicy}
         * @param newGameSessionProtectionPolicy the value to be set.
         * @return {@code this}
         */
        public Builder newGameSessionProtectionPolicy(java.lang.String newGameSessionProtectionPolicy) {
            this.newGameSessionProtectionPolicy = newGameSessionProtectionPolicy;
            return this;
        }

        /**
         * Sets the value of {@link GameliftFleetConfig#getResourceCreationLimitPolicy}
         * @param resourceCreationLimitPolicy resource_creation_limit_policy block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder resourceCreationLimitPolicy(java.util.List<? extends imports.aws.GameliftFleetResourceCreationLimitPolicy> resourceCreationLimitPolicy) {
            this.resourceCreationLimitPolicy = (java.util.List<imports.aws.GameliftFleetResourceCreationLimitPolicy>)resourceCreationLimitPolicy;
            return this;
        }

        /**
         * Sets the value of {@link GameliftFleetConfig#getRuntimeConfiguration}
         * @param runtimeConfiguration runtime_configuration block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder runtimeConfiguration(java.util.List<? extends imports.aws.GameliftFleetRuntimeConfiguration> runtimeConfiguration) {
            this.runtimeConfiguration = (java.util.List<imports.aws.GameliftFleetRuntimeConfiguration>)runtimeConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link GameliftFleetConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link GameliftFleetConfig#getTimeouts}
         * @param timeouts timeouts block.
         * @return {@code this}
         */
        public Builder timeouts(imports.aws.GameliftFleetTimeouts timeouts) {
            this.timeouts = timeouts;
            return this;
        }

        /**
         * Sets the value of {@link GameliftFleetConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link GameliftFleetConfig#getDependsOn}
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
         * Sets the value of {@link GameliftFleetConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link GameliftFleetConfig#getProvider}
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
         * @return a new instance of {@link GameliftFleetConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public GameliftFleetConfig build() {
            return new Jsii$Proxy(buildId, ec2InstanceType, name, description, ec2InboundPermission, fleetType, instanceRoleArn, metricGroups, newGameSessionProtectionPolicy, resourceCreationLimitPolicy, runtimeConfiguration, tags, timeouts, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link GameliftFleetConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements GameliftFleetConfig {
        private final java.lang.String buildId;
        private final java.lang.String ec2InstanceType;
        private final java.lang.String name;
        private final java.lang.String description;
        private final java.util.List<imports.aws.GameliftFleetEc2InboundPermission> ec2InboundPermission;
        private final java.lang.String fleetType;
        private final java.lang.String instanceRoleArn;
        private final java.util.List<java.lang.String> metricGroups;
        private final java.lang.String newGameSessionProtectionPolicy;
        private final java.util.List<imports.aws.GameliftFleetResourceCreationLimitPolicy> resourceCreationLimitPolicy;
        private final java.util.List<imports.aws.GameliftFleetRuntimeConfiguration> runtimeConfiguration;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final imports.aws.GameliftFleetTimeouts timeouts;
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
            this.buildId = software.amazon.jsii.Kernel.get(this, "buildId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.ec2InstanceType = software.amazon.jsii.Kernel.get(this, "ec2InstanceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.ec2InboundPermission = software.amazon.jsii.Kernel.get(this, "ec2InboundPermission", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.GameliftFleetEc2InboundPermission.class)));
            this.fleetType = software.amazon.jsii.Kernel.get(this, "fleetType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.instanceRoleArn = software.amazon.jsii.Kernel.get(this, "instanceRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.metricGroups = software.amazon.jsii.Kernel.get(this, "metricGroups", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.newGameSessionProtectionPolicy = software.amazon.jsii.Kernel.get(this, "newGameSessionProtectionPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.resourceCreationLimitPolicy = software.amazon.jsii.Kernel.get(this, "resourceCreationLimitPolicy", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.GameliftFleetResourceCreationLimitPolicy.class)));
            this.runtimeConfiguration = software.amazon.jsii.Kernel.get(this, "runtimeConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.GameliftFleetRuntimeConfiguration.class)));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.timeouts = software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.GameliftFleetTimeouts.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String buildId, final java.lang.String ec2InstanceType, final java.lang.String name, final java.lang.String description, final java.util.List<? extends imports.aws.GameliftFleetEc2InboundPermission> ec2InboundPermission, final java.lang.String fleetType, final java.lang.String instanceRoleArn, final java.util.List<java.lang.String> metricGroups, final java.lang.String newGameSessionProtectionPolicy, final java.util.List<? extends imports.aws.GameliftFleetResourceCreationLimitPolicy> resourceCreationLimitPolicy, final java.util.List<? extends imports.aws.GameliftFleetRuntimeConfiguration> runtimeConfiguration, final java.util.Map<java.lang.String, java.lang.String> tags, final imports.aws.GameliftFleetTimeouts timeouts, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.buildId = java.util.Objects.requireNonNull(buildId, "buildId is required");
            this.ec2InstanceType = java.util.Objects.requireNonNull(ec2InstanceType, "ec2InstanceType is required");
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.description = description;
            this.ec2InboundPermission = (java.util.List<imports.aws.GameliftFleetEc2InboundPermission>)ec2InboundPermission;
            this.fleetType = fleetType;
            this.instanceRoleArn = instanceRoleArn;
            this.metricGroups = metricGroups;
            this.newGameSessionProtectionPolicy = newGameSessionProtectionPolicy;
            this.resourceCreationLimitPolicy = (java.util.List<imports.aws.GameliftFleetResourceCreationLimitPolicy>)resourceCreationLimitPolicy;
            this.runtimeConfiguration = (java.util.List<imports.aws.GameliftFleetRuntimeConfiguration>)runtimeConfiguration;
            this.tags = tags;
            this.timeouts = timeouts;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getBuildId() {
            return this.buildId;
        }

        @Override
        public final java.lang.String getEc2InstanceType() {
            return this.ec2InstanceType;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getDescription() {
            return this.description;
        }

        @Override
        public final java.util.List<imports.aws.GameliftFleetEc2InboundPermission> getEc2InboundPermission() {
            return this.ec2InboundPermission;
        }

        @Override
        public final java.lang.String getFleetType() {
            return this.fleetType;
        }

        @Override
        public final java.lang.String getInstanceRoleArn() {
            return this.instanceRoleArn;
        }

        @Override
        public final java.util.List<java.lang.String> getMetricGroups() {
            return this.metricGroups;
        }

        @Override
        public final java.lang.String getNewGameSessionProtectionPolicy() {
            return this.newGameSessionProtectionPolicy;
        }

        @Override
        public final java.util.List<imports.aws.GameliftFleetResourceCreationLimitPolicy> getResourceCreationLimitPolicy() {
            return this.resourceCreationLimitPolicy;
        }

        @Override
        public final java.util.List<imports.aws.GameliftFleetRuntimeConfiguration> getRuntimeConfiguration() {
            return this.runtimeConfiguration;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final imports.aws.GameliftFleetTimeouts getTimeouts() {
            return this.timeouts;
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

            data.set("buildId", om.valueToTree(this.getBuildId()));
            data.set("ec2InstanceType", om.valueToTree(this.getEc2InstanceType()));
            data.set("name", om.valueToTree(this.getName()));
            if (this.getDescription() != null) {
                data.set("description", om.valueToTree(this.getDescription()));
            }
            if (this.getEc2InboundPermission() != null) {
                data.set("ec2InboundPermission", om.valueToTree(this.getEc2InboundPermission()));
            }
            if (this.getFleetType() != null) {
                data.set("fleetType", om.valueToTree(this.getFleetType()));
            }
            if (this.getInstanceRoleArn() != null) {
                data.set("instanceRoleArn", om.valueToTree(this.getInstanceRoleArn()));
            }
            if (this.getMetricGroups() != null) {
                data.set("metricGroups", om.valueToTree(this.getMetricGroups()));
            }
            if (this.getNewGameSessionProtectionPolicy() != null) {
                data.set("newGameSessionProtectionPolicy", om.valueToTree(this.getNewGameSessionProtectionPolicy()));
            }
            if (this.getResourceCreationLimitPolicy() != null) {
                data.set("resourceCreationLimitPolicy", om.valueToTree(this.getResourceCreationLimitPolicy()));
            }
            if (this.getRuntimeConfiguration() != null) {
                data.set("runtimeConfiguration", om.valueToTree(this.getRuntimeConfiguration()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getTimeouts() != null) {
                data.set("timeouts", om.valueToTree(this.getTimeouts()));
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
            struct.set("fqn", om.valueToTree("aws.GameliftFleetConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            GameliftFleetConfig.Jsii$Proxy that = (GameliftFleetConfig.Jsii$Proxy) o;

            if (!buildId.equals(that.buildId)) return false;
            if (!ec2InstanceType.equals(that.ec2InstanceType)) return false;
            if (!name.equals(that.name)) return false;
            if (this.description != null ? !this.description.equals(that.description) : that.description != null) return false;
            if (this.ec2InboundPermission != null ? !this.ec2InboundPermission.equals(that.ec2InboundPermission) : that.ec2InboundPermission != null) return false;
            if (this.fleetType != null ? !this.fleetType.equals(that.fleetType) : that.fleetType != null) return false;
            if (this.instanceRoleArn != null ? !this.instanceRoleArn.equals(that.instanceRoleArn) : that.instanceRoleArn != null) return false;
            if (this.metricGroups != null ? !this.metricGroups.equals(that.metricGroups) : that.metricGroups != null) return false;
            if (this.newGameSessionProtectionPolicy != null ? !this.newGameSessionProtectionPolicy.equals(that.newGameSessionProtectionPolicy) : that.newGameSessionProtectionPolicy != null) return false;
            if (this.resourceCreationLimitPolicy != null ? !this.resourceCreationLimitPolicy.equals(that.resourceCreationLimitPolicy) : that.resourceCreationLimitPolicy != null) return false;
            if (this.runtimeConfiguration != null ? !this.runtimeConfiguration.equals(that.runtimeConfiguration) : that.runtimeConfiguration != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.timeouts != null ? !this.timeouts.equals(that.timeouts) : that.timeouts != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.buildId.hashCode();
            result = 31 * result + (this.ec2InstanceType.hashCode());
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.description != null ? this.description.hashCode() : 0);
            result = 31 * result + (this.ec2InboundPermission != null ? this.ec2InboundPermission.hashCode() : 0);
            result = 31 * result + (this.fleetType != null ? this.fleetType.hashCode() : 0);
            result = 31 * result + (this.instanceRoleArn != null ? this.instanceRoleArn.hashCode() : 0);
            result = 31 * result + (this.metricGroups != null ? this.metricGroups.hashCode() : 0);
            result = 31 * result + (this.newGameSessionProtectionPolicy != null ? this.newGameSessionProtectionPolicy.hashCode() : 0);
            result = 31 * result + (this.resourceCreationLimitPolicy != null ? this.resourceCreationLimitPolicy.hashCode() : 0);
            result = 31 * result + (this.runtimeConfiguration != null ? this.runtimeConfiguration.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.timeouts != null ? this.timeouts.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
