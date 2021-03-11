package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.560Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.ElbConfig")
@software.amazon.jsii.Jsii.Proxy(ElbConfig.Jsii$Proxy.class)
public interface ElbConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * listener block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ElbListener> getListener();

    /**
     * access_logs block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ElbAccessLogs> getAccessLogs() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAvailabilityZones() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getConnectionDraining() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getConnectionDrainingTimeout() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getCrossZoneLoadBalancing() {
        return null;
    }

    /**
     * health_check block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ElbHealthCheck> getHealthCheck() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getIdleTimeout() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getInstances() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getInternal() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getNamePrefix() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSecurityGroups() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSourceSecurityGroup() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSubnets() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ElbConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ElbConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ElbConfig> {
        private java.util.List<imports.aws.ElbListener> listener;
        private java.util.List<imports.aws.ElbAccessLogs> accessLogs;
        private java.util.List<java.lang.String> availabilityZones;
        private java.lang.Boolean connectionDraining;
        private java.lang.Number connectionDrainingTimeout;
        private java.lang.Boolean crossZoneLoadBalancing;
        private java.util.List<imports.aws.ElbHealthCheck> healthCheck;
        private java.lang.Number idleTimeout;
        private java.util.List<java.lang.String> instances;
        private java.lang.Boolean internal;
        private java.lang.String name;
        private java.lang.String namePrefix;
        private java.util.List<java.lang.String> securityGroups;
        private java.lang.String sourceSecurityGroup;
        private java.util.List<java.lang.String> subnets;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link ElbConfig#getListener}
         * @param listener listener block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder listener(java.util.List<? extends imports.aws.ElbListener> listener) {
            this.listener = (java.util.List<imports.aws.ElbListener>)listener;
            return this;
        }

        /**
         * Sets the value of {@link ElbConfig#getAccessLogs}
         * @param accessLogs access_logs block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder accessLogs(java.util.List<? extends imports.aws.ElbAccessLogs> accessLogs) {
            this.accessLogs = (java.util.List<imports.aws.ElbAccessLogs>)accessLogs;
            return this;
        }

        /**
         * Sets the value of {@link ElbConfig#getAvailabilityZones}
         * @param availabilityZones the value to be set.
         * @return {@code this}
         */
        public Builder availabilityZones(java.util.List<java.lang.String> availabilityZones) {
            this.availabilityZones = availabilityZones;
            return this;
        }

        /**
         * Sets the value of {@link ElbConfig#getConnectionDraining}
         * @param connectionDraining the value to be set.
         * @return {@code this}
         */
        public Builder connectionDraining(java.lang.Boolean connectionDraining) {
            this.connectionDraining = connectionDraining;
            return this;
        }

        /**
         * Sets the value of {@link ElbConfig#getConnectionDrainingTimeout}
         * @param connectionDrainingTimeout the value to be set.
         * @return {@code this}
         */
        public Builder connectionDrainingTimeout(java.lang.Number connectionDrainingTimeout) {
            this.connectionDrainingTimeout = connectionDrainingTimeout;
            return this;
        }

        /**
         * Sets the value of {@link ElbConfig#getCrossZoneLoadBalancing}
         * @param crossZoneLoadBalancing the value to be set.
         * @return {@code this}
         */
        public Builder crossZoneLoadBalancing(java.lang.Boolean crossZoneLoadBalancing) {
            this.crossZoneLoadBalancing = crossZoneLoadBalancing;
            return this;
        }

        /**
         * Sets the value of {@link ElbConfig#getHealthCheck}
         * @param healthCheck health_check block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder healthCheck(java.util.List<? extends imports.aws.ElbHealthCheck> healthCheck) {
            this.healthCheck = (java.util.List<imports.aws.ElbHealthCheck>)healthCheck;
            return this;
        }

        /**
         * Sets the value of {@link ElbConfig#getIdleTimeout}
         * @param idleTimeout the value to be set.
         * @return {@code this}
         */
        public Builder idleTimeout(java.lang.Number idleTimeout) {
            this.idleTimeout = idleTimeout;
            return this;
        }

        /**
         * Sets the value of {@link ElbConfig#getInstances}
         * @param instances the value to be set.
         * @return {@code this}
         */
        public Builder instances(java.util.List<java.lang.String> instances) {
            this.instances = instances;
            return this;
        }

        /**
         * Sets the value of {@link ElbConfig#getInternal}
         * @param internal the value to be set.
         * @return {@code this}
         */
        public Builder internal(java.lang.Boolean internal) {
            this.internal = internal;
            return this;
        }

        /**
         * Sets the value of {@link ElbConfig#getName}
         * @param name the value to be set.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link ElbConfig#getNamePrefix}
         * @param namePrefix the value to be set.
         * @return {@code this}
         */
        public Builder namePrefix(java.lang.String namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }

        /**
         * Sets the value of {@link ElbConfig#getSecurityGroups}
         * @param securityGroups the value to be set.
         * @return {@code this}
         */
        public Builder securityGroups(java.util.List<java.lang.String> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }

        /**
         * Sets the value of {@link ElbConfig#getSourceSecurityGroup}
         * @param sourceSecurityGroup the value to be set.
         * @return {@code this}
         */
        public Builder sourceSecurityGroup(java.lang.String sourceSecurityGroup) {
            this.sourceSecurityGroup = sourceSecurityGroup;
            return this;
        }

        /**
         * Sets the value of {@link ElbConfig#getSubnets}
         * @param subnets the value to be set.
         * @return {@code this}
         */
        public Builder subnets(java.util.List<java.lang.String> subnets) {
            this.subnets = subnets;
            return this;
        }

        /**
         * Sets the value of {@link ElbConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link ElbConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link ElbConfig#getDependsOn}
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
         * Sets the value of {@link ElbConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link ElbConfig#getProvider}
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
         * @return a new instance of {@link ElbConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ElbConfig build() {
            return new Jsii$Proxy(listener, accessLogs, availabilityZones, connectionDraining, connectionDrainingTimeout, crossZoneLoadBalancing, healthCheck, idleTimeout, instances, internal, name, namePrefix, securityGroups, sourceSecurityGroup, subnets, tags, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link ElbConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ElbConfig {
        private final java.util.List<imports.aws.ElbListener> listener;
        private final java.util.List<imports.aws.ElbAccessLogs> accessLogs;
        private final java.util.List<java.lang.String> availabilityZones;
        private final java.lang.Boolean connectionDraining;
        private final java.lang.Number connectionDrainingTimeout;
        private final java.lang.Boolean crossZoneLoadBalancing;
        private final java.util.List<imports.aws.ElbHealthCheck> healthCheck;
        private final java.lang.Number idleTimeout;
        private final java.util.List<java.lang.String> instances;
        private final java.lang.Boolean internal;
        private final java.lang.String name;
        private final java.lang.String namePrefix;
        private final java.util.List<java.lang.String> securityGroups;
        private final java.lang.String sourceSecurityGroup;
        private final java.util.List<java.lang.String> subnets;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
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
            this.listener = software.amazon.jsii.Kernel.get(this, "listener", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElbListener.class)));
            this.accessLogs = software.amazon.jsii.Kernel.get(this, "accessLogs", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElbAccessLogs.class)));
            this.availabilityZones = software.amazon.jsii.Kernel.get(this, "availabilityZones", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.connectionDraining = software.amazon.jsii.Kernel.get(this, "connectionDraining", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.connectionDrainingTimeout = software.amazon.jsii.Kernel.get(this, "connectionDrainingTimeout", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.crossZoneLoadBalancing = software.amazon.jsii.Kernel.get(this, "crossZoneLoadBalancing", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.healthCheck = software.amazon.jsii.Kernel.get(this, "healthCheck", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElbHealthCheck.class)));
            this.idleTimeout = software.amazon.jsii.Kernel.get(this, "idleTimeout", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.instances = software.amazon.jsii.Kernel.get(this, "instances", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.internal = software.amazon.jsii.Kernel.get(this, "internal", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.namePrefix = software.amazon.jsii.Kernel.get(this, "namePrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.securityGroups = software.amazon.jsii.Kernel.get(this, "securityGroups", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.sourceSecurityGroup = software.amazon.jsii.Kernel.get(this, "sourceSecurityGroup", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.subnets = software.amazon.jsii.Kernel.get(this, "subnets", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.ElbListener> listener, final java.util.List<? extends imports.aws.ElbAccessLogs> accessLogs, final java.util.List<java.lang.String> availabilityZones, final java.lang.Boolean connectionDraining, final java.lang.Number connectionDrainingTimeout, final java.lang.Boolean crossZoneLoadBalancing, final java.util.List<? extends imports.aws.ElbHealthCheck> healthCheck, final java.lang.Number idleTimeout, final java.util.List<java.lang.String> instances, final java.lang.Boolean internal, final java.lang.String name, final java.lang.String namePrefix, final java.util.List<java.lang.String> securityGroups, final java.lang.String sourceSecurityGroup, final java.util.List<java.lang.String> subnets, final java.util.Map<java.lang.String, java.lang.String> tags, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.listener = (java.util.List<imports.aws.ElbListener>)java.util.Objects.requireNonNull(listener, "listener is required");
            this.accessLogs = (java.util.List<imports.aws.ElbAccessLogs>)accessLogs;
            this.availabilityZones = availabilityZones;
            this.connectionDraining = connectionDraining;
            this.connectionDrainingTimeout = connectionDrainingTimeout;
            this.crossZoneLoadBalancing = crossZoneLoadBalancing;
            this.healthCheck = (java.util.List<imports.aws.ElbHealthCheck>)healthCheck;
            this.idleTimeout = idleTimeout;
            this.instances = instances;
            this.internal = internal;
            this.name = name;
            this.namePrefix = namePrefix;
            this.securityGroups = securityGroups;
            this.sourceSecurityGroup = sourceSecurityGroup;
            this.subnets = subnets;
            this.tags = tags;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.util.List<imports.aws.ElbListener> getListener() {
            return this.listener;
        }

        @Override
        public final java.util.List<imports.aws.ElbAccessLogs> getAccessLogs() {
            return this.accessLogs;
        }

        @Override
        public final java.util.List<java.lang.String> getAvailabilityZones() {
            return this.availabilityZones;
        }

        @Override
        public final java.lang.Boolean getConnectionDraining() {
            return this.connectionDraining;
        }

        @Override
        public final java.lang.Number getConnectionDrainingTimeout() {
            return this.connectionDrainingTimeout;
        }

        @Override
        public final java.lang.Boolean getCrossZoneLoadBalancing() {
            return this.crossZoneLoadBalancing;
        }

        @Override
        public final java.util.List<imports.aws.ElbHealthCheck> getHealthCheck() {
            return this.healthCheck;
        }

        @Override
        public final java.lang.Number getIdleTimeout() {
            return this.idleTimeout;
        }

        @Override
        public final java.util.List<java.lang.String> getInstances() {
            return this.instances;
        }

        @Override
        public final java.lang.Boolean getInternal() {
            return this.internal;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getNamePrefix() {
            return this.namePrefix;
        }

        @Override
        public final java.util.List<java.lang.String> getSecurityGroups() {
            return this.securityGroups;
        }

        @Override
        public final java.lang.String getSourceSecurityGroup() {
            return this.sourceSecurityGroup;
        }

        @Override
        public final java.util.List<java.lang.String> getSubnets() {
            return this.subnets;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
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

            data.set("listener", om.valueToTree(this.getListener()));
            if (this.getAccessLogs() != null) {
                data.set("accessLogs", om.valueToTree(this.getAccessLogs()));
            }
            if (this.getAvailabilityZones() != null) {
                data.set("availabilityZones", om.valueToTree(this.getAvailabilityZones()));
            }
            if (this.getConnectionDraining() != null) {
                data.set("connectionDraining", om.valueToTree(this.getConnectionDraining()));
            }
            if (this.getConnectionDrainingTimeout() != null) {
                data.set("connectionDrainingTimeout", om.valueToTree(this.getConnectionDrainingTimeout()));
            }
            if (this.getCrossZoneLoadBalancing() != null) {
                data.set("crossZoneLoadBalancing", om.valueToTree(this.getCrossZoneLoadBalancing()));
            }
            if (this.getHealthCheck() != null) {
                data.set("healthCheck", om.valueToTree(this.getHealthCheck()));
            }
            if (this.getIdleTimeout() != null) {
                data.set("idleTimeout", om.valueToTree(this.getIdleTimeout()));
            }
            if (this.getInstances() != null) {
                data.set("instances", om.valueToTree(this.getInstances()));
            }
            if (this.getInternal() != null) {
                data.set("internal", om.valueToTree(this.getInternal()));
            }
            if (this.getName() != null) {
                data.set("name", om.valueToTree(this.getName()));
            }
            if (this.getNamePrefix() != null) {
                data.set("namePrefix", om.valueToTree(this.getNamePrefix()));
            }
            if (this.getSecurityGroups() != null) {
                data.set("securityGroups", om.valueToTree(this.getSecurityGroups()));
            }
            if (this.getSourceSecurityGroup() != null) {
                data.set("sourceSecurityGroup", om.valueToTree(this.getSourceSecurityGroup()));
            }
            if (this.getSubnets() != null) {
                data.set("subnets", om.valueToTree(this.getSubnets()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
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
            struct.set("fqn", om.valueToTree("aws.ElbConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ElbConfig.Jsii$Proxy that = (ElbConfig.Jsii$Proxy) o;

            if (!listener.equals(that.listener)) return false;
            if (this.accessLogs != null ? !this.accessLogs.equals(that.accessLogs) : that.accessLogs != null) return false;
            if (this.availabilityZones != null ? !this.availabilityZones.equals(that.availabilityZones) : that.availabilityZones != null) return false;
            if (this.connectionDraining != null ? !this.connectionDraining.equals(that.connectionDraining) : that.connectionDraining != null) return false;
            if (this.connectionDrainingTimeout != null ? !this.connectionDrainingTimeout.equals(that.connectionDrainingTimeout) : that.connectionDrainingTimeout != null) return false;
            if (this.crossZoneLoadBalancing != null ? !this.crossZoneLoadBalancing.equals(that.crossZoneLoadBalancing) : that.crossZoneLoadBalancing != null) return false;
            if (this.healthCheck != null ? !this.healthCheck.equals(that.healthCheck) : that.healthCheck != null) return false;
            if (this.idleTimeout != null ? !this.idleTimeout.equals(that.idleTimeout) : that.idleTimeout != null) return false;
            if (this.instances != null ? !this.instances.equals(that.instances) : that.instances != null) return false;
            if (this.internal != null ? !this.internal.equals(that.internal) : that.internal != null) return false;
            if (this.name != null ? !this.name.equals(that.name) : that.name != null) return false;
            if (this.namePrefix != null ? !this.namePrefix.equals(that.namePrefix) : that.namePrefix != null) return false;
            if (this.securityGroups != null ? !this.securityGroups.equals(that.securityGroups) : that.securityGroups != null) return false;
            if (this.sourceSecurityGroup != null ? !this.sourceSecurityGroup.equals(that.sourceSecurityGroup) : that.sourceSecurityGroup != null) return false;
            if (this.subnets != null ? !this.subnets.equals(that.subnets) : that.subnets != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.listener.hashCode();
            result = 31 * result + (this.accessLogs != null ? this.accessLogs.hashCode() : 0);
            result = 31 * result + (this.availabilityZones != null ? this.availabilityZones.hashCode() : 0);
            result = 31 * result + (this.connectionDraining != null ? this.connectionDraining.hashCode() : 0);
            result = 31 * result + (this.connectionDrainingTimeout != null ? this.connectionDrainingTimeout.hashCode() : 0);
            result = 31 * result + (this.crossZoneLoadBalancing != null ? this.crossZoneLoadBalancing.hashCode() : 0);
            result = 31 * result + (this.healthCheck != null ? this.healthCheck.hashCode() : 0);
            result = 31 * result + (this.idleTimeout != null ? this.idleTimeout.hashCode() : 0);
            result = 31 * result + (this.instances != null ? this.instances.hashCode() : 0);
            result = 31 * result + (this.internal != null ? this.internal.hashCode() : 0);
            result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
            result = 31 * result + (this.namePrefix != null ? this.namePrefix.hashCode() : 0);
            result = 31 * result + (this.securityGroups != null ? this.securityGroups.hashCode() : 0);
            result = 31 * result + (this.sourceSecurityGroup != null ? this.sourceSecurityGroup.hashCode() : 0);
            result = 31 * result + (this.subnets != null ? this.subnets.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
