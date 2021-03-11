package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:01.935Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AlbConfig")
@software.amazon.jsii.Jsii.Proxy(AlbConfig.Jsii$Proxy.class)
public interface AlbConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * access_logs block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AlbAccessLogs> getAccessLogs() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getDropInvalidHeaderFields() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getEnableCrossZoneLoadBalancing() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getEnableDeletionProtection() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getEnableHttp2() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getIdleTimeout() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getInternal() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getIpAddressType() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getLoadBalancerType() {
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

    /**
     * subnet_mapping block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AlbSubnetMapping> getSubnetMapping() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSubnets() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * timeouts block.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.AlbTimeouts getTimeouts() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AlbConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AlbConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AlbConfig> {
        private java.util.List<imports.aws.AlbAccessLogs> accessLogs;
        private java.lang.Boolean dropInvalidHeaderFields;
        private java.lang.Boolean enableCrossZoneLoadBalancing;
        private java.lang.Boolean enableDeletionProtection;
        private java.lang.Boolean enableHttp2;
        private java.lang.Number idleTimeout;
        private java.lang.Boolean internal;
        private java.lang.String ipAddressType;
        private java.lang.String loadBalancerType;
        private java.lang.String name;
        private java.lang.String namePrefix;
        private java.util.List<java.lang.String> securityGroups;
        private java.util.List<imports.aws.AlbSubnetMapping> subnetMapping;
        private java.util.List<java.lang.String> subnets;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private imports.aws.AlbTimeouts timeouts;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link AlbConfig#getAccessLogs}
         * @param accessLogs access_logs block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder accessLogs(java.util.List<? extends imports.aws.AlbAccessLogs> accessLogs) {
            this.accessLogs = (java.util.List<imports.aws.AlbAccessLogs>)accessLogs;
            return this;
        }

        /**
         * Sets the value of {@link AlbConfig#getDropInvalidHeaderFields}
         * @param dropInvalidHeaderFields the value to be set.
         * @return {@code this}
         */
        public Builder dropInvalidHeaderFields(java.lang.Boolean dropInvalidHeaderFields) {
            this.dropInvalidHeaderFields = dropInvalidHeaderFields;
            return this;
        }

        /**
         * Sets the value of {@link AlbConfig#getEnableCrossZoneLoadBalancing}
         * @param enableCrossZoneLoadBalancing the value to be set.
         * @return {@code this}
         */
        public Builder enableCrossZoneLoadBalancing(java.lang.Boolean enableCrossZoneLoadBalancing) {
            this.enableCrossZoneLoadBalancing = enableCrossZoneLoadBalancing;
            return this;
        }

        /**
         * Sets the value of {@link AlbConfig#getEnableDeletionProtection}
         * @param enableDeletionProtection the value to be set.
         * @return {@code this}
         */
        public Builder enableDeletionProtection(java.lang.Boolean enableDeletionProtection) {
            this.enableDeletionProtection = enableDeletionProtection;
            return this;
        }

        /**
         * Sets the value of {@link AlbConfig#getEnableHttp2}
         * @param enableHttp2 the value to be set.
         * @return {@code this}
         */
        public Builder enableHttp2(java.lang.Boolean enableHttp2) {
            this.enableHttp2 = enableHttp2;
            return this;
        }

        /**
         * Sets the value of {@link AlbConfig#getIdleTimeout}
         * @param idleTimeout the value to be set.
         * @return {@code this}
         */
        public Builder idleTimeout(java.lang.Number idleTimeout) {
            this.idleTimeout = idleTimeout;
            return this;
        }

        /**
         * Sets the value of {@link AlbConfig#getInternal}
         * @param internal the value to be set.
         * @return {@code this}
         */
        public Builder internal(java.lang.Boolean internal) {
            this.internal = internal;
            return this;
        }

        /**
         * Sets the value of {@link AlbConfig#getIpAddressType}
         * @param ipAddressType the value to be set.
         * @return {@code this}
         */
        public Builder ipAddressType(java.lang.String ipAddressType) {
            this.ipAddressType = ipAddressType;
            return this;
        }

        /**
         * Sets the value of {@link AlbConfig#getLoadBalancerType}
         * @param loadBalancerType the value to be set.
         * @return {@code this}
         */
        public Builder loadBalancerType(java.lang.String loadBalancerType) {
            this.loadBalancerType = loadBalancerType;
            return this;
        }

        /**
         * Sets the value of {@link AlbConfig#getName}
         * @param name the value to be set.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link AlbConfig#getNamePrefix}
         * @param namePrefix the value to be set.
         * @return {@code this}
         */
        public Builder namePrefix(java.lang.String namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }

        /**
         * Sets the value of {@link AlbConfig#getSecurityGroups}
         * @param securityGroups the value to be set.
         * @return {@code this}
         */
        public Builder securityGroups(java.util.List<java.lang.String> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }

        /**
         * Sets the value of {@link AlbConfig#getSubnetMapping}
         * @param subnetMapping subnet_mapping block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder subnetMapping(java.util.List<? extends imports.aws.AlbSubnetMapping> subnetMapping) {
            this.subnetMapping = (java.util.List<imports.aws.AlbSubnetMapping>)subnetMapping;
            return this;
        }

        /**
         * Sets the value of {@link AlbConfig#getSubnets}
         * @param subnets the value to be set.
         * @return {@code this}
         */
        public Builder subnets(java.util.List<java.lang.String> subnets) {
            this.subnets = subnets;
            return this;
        }

        /**
         * Sets the value of {@link AlbConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link AlbConfig#getTimeouts}
         * @param timeouts timeouts block.
         * @return {@code this}
         */
        public Builder timeouts(imports.aws.AlbTimeouts timeouts) {
            this.timeouts = timeouts;
            return this;
        }

        /**
         * Sets the value of {@link AlbConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link AlbConfig#getDependsOn}
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
         * Sets the value of {@link AlbConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link AlbConfig#getProvider}
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
         * @return a new instance of {@link AlbConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AlbConfig build() {
            return new Jsii$Proxy(accessLogs, dropInvalidHeaderFields, enableCrossZoneLoadBalancing, enableDeletionProtection, enableHttp2, idleTimeout, internal, ipAddressType, loadBalancerType, name, namePrefix, securityGroups, subnetMapping, subnets, tags, timeouts, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link AlbConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AlbConfig {
        private final java.util.List<imports.aws.AlbAccessLogs> accessLogs;
        private final java.lang.Boolean dropInvalidHeaderFields;
        private final java.lang.Boolean enableCrossZoneLoadBalancing;
        private final java.lang.Boolean enableDeletionProtection;
        private final java.lang.Boolean enableHttp2;
        private final java.lang.Number idleTimeout;
        private final java.lang.Boolean internal;
        private final java.lang.String ipAddressType;
        private final java.lang.String loadBalancerType;
        private final java.lang.String name;
        private final java.lang.String namePrefix;
        private final java.util.List<java.lang.String> securityGroups;
        private final java.util.List<imports.aws.AlbSubnetMapping> subnetMapping;
        private final java.util.List<java.lang.String> subnets;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final imports.aws.AlbTimeouts timeouts;
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
            this.accessLogs = software.amazon.jsii.Kernel.get(this, "accessLogs", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AlbAccessLogs.class)));
            this.dropInvalidHeaderFields = software.amazon.jsii.Kernel.get(this, "dropInvalidHeaderFields", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.enableCrossZoneLoadBalancing = software.amazon.jsii.Kernel.get(this, "enableCrossZoneLoadBalancing", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.enableDeletionProtection = software.amazon.jsii.Kernel.get(this, "enableDeletionProtection", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.enableHttp2 = software.amazon.jsii.Kernel.get(this, "enableHttp2", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.idleTimeout = software.amazon.jsii.Kernel.get(this, "idleTimeout", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.internal = software.amazon.jsii.Kernel.get(this, "internal", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.ipAddressType = software.amazon.jsii.Kernel.get(this, "ipAddressType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.loadBalancerType = software.amazon.jsii.Kernel.get(this, "loadBalancerType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.namePrefix = software.amazon.jsii.Kernel.get(this, "namePrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.securityGroups = software.amazon.jsii.Kernel.get(this, "securityGroups", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.subnetMapping = software.amazon.jsii.Kernel.get(this, "subnetMapping", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AlbSubnetMapping.class)));
            this.subnets = software.amazon.jsii.Kernel.get(this, "subnets", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.timeouts = software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.AlbTimeouts.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.AlbAccessLogs> accessLogs, final java.lang.Boolean dropInvalidHeaderFields, final java.lang.Boolean enableCrossZoneLoadBalancing, final java.lang.Boolean enableDeletionProtection, final java.lang.Boolean enableHttp2, final java.lang.Number idleTimeout, final java.lang.Boolean internal, final java.lang.String ipAddressType, final java.lang.String loadBalancerType, final java.lang.String name, final java.lang.String namePrefix, final java.util.List<java.lang.String> securityGroups, final java.util.List<? extends imports.aws.AlbSubnetMapping> subnetMapping, final java.util.List<java.lang.String> subnets, final java.util.Map<java.lang.String, java.lang.String> tags, final imports.aws.AlbTimeouts timeouts, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.accessLogs = (java.util.List<imports.aws.AlbAccessLogs>)accessLogs;
            this.dropInvalidHeaderFields = dropInvalidHeaderFields;
            this.enableCrossZoneLoadBalancing = enableCrossZoneLoadBalancing;
            this.enableDeletionProtection = enableDeletionProtection;
            this.enableHttp2 = enableHttp2;
            this.idleTimeout = idleTimeout;
            this.internal = internal;
            this.ipAddressType = ipAddressType;
            this.loadBalancerType = loadBalancerType;
            this.name = name;
            this.namePrefix = namePrefix;
            this.securityGroups = securityGroups;
            this.subnetMapping = (java.util.List<imports.aws.AlbSubnetMapping>)subnetMapping;
            this.subnets = subnets;
            this.tags = tags;
            this.timeouts = timeouts;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.util.List<imports.aws.AlbAccessLogs> getAccessLogs() {
            return this.accessLogs;
        }

        @Override
        public final java.lang.Boolean getDropInvalidHeaderFields() {
            return this.dropInvalidHeaderFields;
        }

        @Override
        public final java.lang.Boolean getEnableCrossZoneLoadBalancing() {
            return this.enableCrossZoneLoadBalancing;
        }

        @Override
        public final java.lang.Boolean getEnableDeletionProtection() {
            return this.enableDeletionProtection;
        }

        @Override
        public final java.lang.Boolean getEnableHttp2() {
            return this.enableHttp2;
        }

        @Override
        public final java.lang.Number getIdleTimeout() {
            return this.idleTimeout;
        }

        @Override
        public final java.lang.Boolean getInternal() {
            return this.internal;
        }

        @Override
        public final java.lang.String getIpAddressType() {
            return this.ipAddressType;
        }

        @Override
        public final java.lang.String getLoadBalancerType() {
            return this.loadBalancerType;
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
        public final java.util.List<imports.aws.AlbSubnetMapping> getSubnetMapping() {
            return this.subnetMapping;
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
        public final imports.aws.AlbTimeouts getTimeouts() {
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

            if (this.getAccessLogs() != null) {
                data.set("accessLogs", om.valueToTree(this.getAccessLogs()));
            }
            if (this.getDropInvalidHeaderFields() != null) {
                data.set("dropInvalidHeaderFields", om.valueToTree(this.getDropInvalidHeaderFields()));
            }
            if (this.getEnableCrossZoneLoadBalancing() != null) {
                data.set("enableCrossZoneLoadBalancing", om.valueToTree(this.getEnableCrossZoneLoadBalancing()));
            }
            if (this.getEnableDeletionProtection() != null) {
                data.set("enableDeletionProtection", om.valueToTree(this.getEnableDeletionProtection()));
            }
            if (this.getEnableHttp2() != null) {
                data.set("enableHttp2", om.valueToTree(this.getEnableHttp2()));
            }
            if (this.getIdleTimeout() != null) {
                data.set("idleTimeout", om.valueToTree(this.getIdleTimeout()));
            }
            if (this.getInternal() != null) {
                data.set("internal", om.valueToTree(this.getInternal()));
            }
            if (this.getIpAddressType() != null) {
                data.set("ipAddressType", om.valueToTree(this.getIpAddressType()));
            }
            if (this.getLoadBalancerType() != null) {
                data.set("loadBalancerType", om.valueToTree(this.getLoadBalancerType()));
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
            if (this.getSubnetMapping() != null) {
                data.set("subnetMapping", om.valueToTree(this.getSubnetMapping()));
            }
            if (this.getSubnets() != null) {
                data.set("subnets", om.valueToTree(this.getSubnets()));
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
            struct.set("fqn", om.valueToTree("aws.AlbConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AlbConfig.Jsii$Proxy that = (AlbConfig.Jsii$Proxy) o;

            if (this.accessLogs != null ? !this.accessLogs.equals(that.accessLogs) : that.accessLogs != null) return false;
            if (this.dropInvalidHeaderFields != null ? !this.dropInvalidHeaderFields.equals(that.dropInvalidHeaderFields) : that.dropInvalidHeaderFields != null) return false;
            if (this.enableCrossZoneLoadBalancing != null ? !this.enableCrossZoneLoadBalancing.equals(that.enableCrossZoneLoadBalancing) : that.enableCrossZoneLoadBalancing != null) return false;
            if (this.enableDeletionProtection != null ? !this.enableDeletionProtection.equals(that.enableDeletionProtection) : that.enableDeletionProtection != null) return false;
            if (this.enableHttp2 != null ? !this.enableHttp2.equals(that.enableHttp2) : that.enableHttp2 != null) return false;
            if (this.idleTimeout != null ? !this.idleTimeout.equals(that.idleTimeout) : that.idleTimeout != null) return false;
            if (this.internal != null ? !this.internal.equals(that.internal) : that.internal != null) return false;
            if (this.ipAddressType != null ? !this.ipAddressType.equals(that.ipAddressType) : that.ipAddressType != null) return false;
            if (this.loadBalancerType != null ? !this.loadBalancerType.equals(that.loadBalancerType) : that.loadBalancerType != null) return false;
            if (this.name != null ? !this.name.equals(that.name) : that.name != null) return false;
            if (this.namePrefix != null ? !this.namePrefix.equals(that.namePrefix) : that.namePrefix != null) return false;
            if (this.securityGroups != null ? !this.securityGroups.equals(that.securityGroups) : that.securityGroups != null) return false;
            if (this.subnetMapping != null ? !this.subnetMapping.equals(that.subnetMapping) : that.subnetMapping != null) return false;
            if (this.subnets != null ? !this.subnets.equals(that.subnets) : that.subnets != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.timeouts != null ? !this.timeouts.equals(that.timeouts) : that.timeouts != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.accessLogs != null ? this.accessLogs.hashCode() : 0;
            result = 31 * result + (this.dropInvalidHeaderFields != null ? this.dropInvalidHeaderFields.hashCode() : 0);
            result = 31 * result + (this.enableCrossZoneLoadBalancing != null ? this.enableCrossZoneLoadBalancing.hashCode() : 0);
            result = 31 * result + (this.enableDeletionProtection != null ? this.enableDeletionProtection.hashCode() : 0);
            result = 31 * result + (this.enableHttp2 != null ? this.enableHttp2.hashCode() : 0);
            result = 31 * result + (this.idleTimeout != null ? this.idleTimeout.hashCode() : 0);
            result = 31 * result + (this.internal != null ? this.internal.hashCode() : 0);
            result = 31 * result + (this.ipAddressType != null ? this.ipAddressType.hashCode() : 0);
            result = 31 * result + (this.loadBalancerType != null ? this.loadBalancerType.hashCode() : 0);
            result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
            result = 31 * result + (this.namePrefix != null ? this.namePrefix.hashCode() : 0);
            result = 31 * result + (this.securityGroups != null ? this.securityGroups.hashCode() : 0);
            result = 31 * result + (this.subnetMapping != null ? this.subnetMapping.hashCode() : 0);
            result = 31 * result + (this.subnets != null ? this.subnets.hashCode() : 0);
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
