package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.703Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.LbTargetGroupConfig")
@software.amazon.jsii.Jsii.Proxy(LbTargetGroupConfig.Jsii$Proxy.class)
public interface LbTargetGroupConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    default @org.jetbrains.annotations.Nullable java.lang.Number getDeregistrationDelay() {
        return null;
    }

    /**
     * health_check block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LbTargetGroupHealthCheck> getHealthCheck() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getLambdaMultiValueHeadersEnabled() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getLoadBalancingAlgorithmType() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getNamePrefix() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getPort() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getProtocol() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getProxyProtocolV2() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getSlowStart() {
        return null;
    }

    /**
     * stickiness block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LbTargetGroupStickiness> getStickiness() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getTargetType() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getVpcId() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link LbTargetGroupConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LbTargetGroupConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LbTargetGroupConfig> {
        private java.lang.Number deregistrationDelay;
        private java.util.List<imports.aws.LbTargetGroupHealthCheck> healthCheck;
        private java.lang.Boolean lambdaMultiValueHeadersEnabled;
        private java.lang.String loadBalancingAlgorithmType;
        private java.lang.String name;
        private java.lang.String namePrefix;
        private java.lang.Number port;
        private java.lang.String protocol;
        private java.lang.Boolean proxyProtocolV2;
        private java.lang.Number slowStart;
        private java.util.List<imports.aws.LbTargetGroupStickiness> stickiness;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.lang.String targetType;
        private java.lang.String vpcId;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link LbTargetGroupConfig#getDeregistrationDelay}
         * @param deregistrationDelay the value to be set.
         * @return {@code this}
         */
        public Builder deregistrationDelay(java.lang.Number deregistrationDelay) {
            this.deregistrationDelay = deregistrationDelay;
            return this;
        }

        /**
         * Sets the value of {@link LbTargetGroupConfig#getHealthCheck}
         * @param healthCheck health_check block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder healthCheck(java.util.List<? extends imports.aws.LbTargetGroupHealthCheck> healthCheck) {
            this.healthCheck = (java.util.List<imports.aws.LbTargetGroupHealthCheck>)healthCheck;
            return this;
        }

        /**
         * Sets the value of {@link LbTargetGroupConfig#getLambdaMultiValueHeadersEnabled}
         * @param lambdaMultiValueHeadersEnabled the value to be set.
         * @return {@code this}
         */
        public Builder lambdaMultiValueHeadersEnabled(java.lang.Boolean lambdaMultiValueHeadersEnabled) {
            this.lambdaMultiValueHeadersEnabled = lambdaMultiValueHeadersEnabled;
            return this;
        }

        /**
         * Sets the value of {@link LbTargetGroupConfig#getLoadBalancingAlgorithmType}
         * @param loadBalancingAlgorithmType the value to be set.
         * @return {@code this}
         */
        public Builder loadBalancingAlgorithmType(java.lang.String loadBalancingAlgorithmType) {
            this.loadBalancingAlgorithmType = loadBalancingAlgorithmType;
            return this;
        }

        /**
         * Sets the value of {@link LbTargetGroupConfig#getName}
         * @param name the value to be set.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link LbTargetGroupConfig#getNamePrefix}
         * @param namePrefix the value to be set.
         * @return {@code this}
         */
        public Builder namePrefix(java.lang.String namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }

        /**
         * Sets the value of {@link LbTargetGroupConfig#getPort}
         * @param port the value to be set.
         * @return {@code this}
         */
        public Builder port(java.lang.Number port) {
            this.port = port;
            return this;
        }

        /**
         * Sets the value of {@link LbTargetGroupConfig#getProtocol}
         * @param protocol the value to be set.
         * @return {@code this}
         */
        public Builder protocol(java.lang.String protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * Sets the value of {@link LbTargetGroupConfig#getProxyProtocolV2}
         * @param proxyProtocolV2 the value to be set.
         * @return {@code this}
         */
        public Builder proxyProtocolV2(java.lang.Boolean proxyProtocolV2) {
            this.proxyProtocolV2 = proxyProtocolV2;
            return this;
        }

        /**
         * Sets the value of {@link LbTargetGroupConfig#getSlowStart}
         * @param slowStart the value to be set.
         * @return {@code this}
         */
        public Builder slowStart(java.lang.Number slowStart) {
            this.slowStart = slowStart;
            return this;
        }

        /**
         * Sets the value of {@link LbTargetGroupConfig#getStickiness}
         * @param stickiness stickiness block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder stickiness(java.util.List<? extends imports.aws.LbTargetGroupStickiness> stickiness) {
            this.stickiness = (java.util.List<imports.aws.LbTargetGroupStickiness>)stickiness;
            return this;
        }

        /**
         * Sets the value of {@link LbTargetGroupConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link LbTargetGroupConfig#getTargetType}
         * @param targetType the value to be set.
         * @return {@code this}
         */
        public Builder targetType(java.lang.String targetType) {
            this.targetType = targetType;
            return this;
        }

        /**
         * Sets the value of {@link LbTargetGroupConfig#getVpcId}
         * @param vpcId the value to be set.
         * @return {@code this}
         */
        public Builder vpcId(java.lang.String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        /**
         * Sets the value of {@link LbTargetGroupConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link LbTargetGroupConfig#getDependsOn}
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
         * Sets the value of {@link LbTargetGroupConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link LbTargetGroupConfig#getProvider}
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
         * @return a new instance of {@link LbTargetGroupConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LbTargetGroupConfig build() {
            return new Jsii$Proxy(deregistrationDelay, healthCheck, lambdaMultiValueHeadersEnabled, loadBalancingAlgorithmType, name, namePrefix, port, protocol, proxyProtocolV2, slowStart, stickiness, tags, targetType, vpcId, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link LbTargetGroupConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LbTargetGroupConfig {
        private final java.lang.Number deregistrationDelay;
        private final java.util.List<imports.aws.LbTargetGroupHealthCheck> healthCheck;
        private final java.lang.Boolean lambdaMultiValueHeadersEnabled;
        private final java.lang.String loadBalancingAlgorithmType;
        private final java.lang.String name;
        private final java.lang.String namePrefix;
        private final java.lang.Number port;
        private final java.lang.String protocol;
        private final java.lang.Boolean proxyProtocolV2;
        private final java.lang.Number slowStart;
        private final java.util.List<imports.aws.LbTargetGroupStickiness> stickiness;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.lang.String targetType;
        private final java.lang.String vpcId;
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
            this.deregistrationDelay = software.amazon.jsii.Kernel.get(this, "deregistrationDelay", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.healthCheck = software.amazon.jsii.Kernel.get(this, "healthCheck", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LbTargetGroupHealthCheck.class)));
            this.lambdaMultiValueHeadersEnabled = software.amazon.jsii.Kernel.get(this, "lambdaMultiValueHeadersEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.loadBalancingAlgorithmType = software.amazon.jsii.Kernel.get(this, "loadBalancingAlgorithmType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.namePrefix = software.amazon.jsii.Kernel.get(this, "namePrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.port = software.amazon.jsii.Kernel.get(this, "port", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.protocol = software.amazon.jsii.Kernel.get(this, "protocol", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.proxyProtocolV2 = software.amazon.jsii.Kernel.get(this, "proxyProtocolV2", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.slowStart = software.amazon.jsii.Kernel.get(this, "slowStart", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.stickiness = software.amazon.jsii.Kernel.get(this, "stickiness", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LbTargetGroupStickiness.class)));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.targetType = software.amazon.jsii.Kernel.get(this, "targetType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.vpcId = software.amazon.jsii.Kernel.get(this, "vpcId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.Number deregistrationDelay, final java.util.List<? extends imports.aws.LbTargetGroupHealthCheck> healthCheck, final java.lang.Boolean lambdaMultiValueHeadersEnabled, final java.lang.String loadBalancingAlgorithmType, final java.lang.String name, final java.lang.String namePrefix, final java.lang.Number port, final java.lang.String protocol, final java.lang.Boolean proxyProtocolV2, final java.lang.Number slowStart, final java.util.List<? extends imports.aws.LbTargetGroupStickiness> stickiness, final java.util.Map<java.lang.String, java.lang.String> tags, final java.lang.String targetType, final java.lang.String vpcId, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.deregistrationDelay = deregistrationDelay;
            this.healthCheck = (java.util.List<imports.aws.LbTargetGroupHealthCheck>)healthCheck;
            this.lambdaMultiValueHeadersEnabled = lambdaMultiValueHeadersEnabled;
            this.loadBalancingAlgorithmType = loadBalancingAlgorithmType;
            this.name = name;
            this.namePrefix = namePrefix;
            this.port = port;
            this.protocol = protocol;
            this.proxyProtocolV2 = proxyProtocolV2;
            this.slowStart = slowStart;
            this.stickiness = (java.util.List<imports.aws.LbTargetGroupStickiness>)stickiness;
            this.tags = tags;
            this.targetType = targetType;
            this.vpcId = vpcId;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.Number getDeregistrationDelay() {
            return this.deregistrationDelay;
        }

        @Override
        public final java.util.List<imports.aws.LbTargetGroupHealthCheck> getHealthCheck() {
            return this.healthCheck;
        }

        @Override
        public final java.lang.Boolean getLambdaMultiValueHeadersEnabled() {
            return this.lambdaMultiValueHeadersEnabled;
        }

        @Override
        public final java.lang.String getLoadBalancingAlgorithmType() {
            return this.loadBalancingAlgorithmType;
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
        public final java.lang.Number getPort() {
            return this.port;
        }

        @Override
        public final java.lang.String getProtocol() {
            return this.protocol;
        }

        @Override
        public final java.lang.Boolean getProxyProtocolV2() {
            return this.proxyProtocolV2;
        }

        @Override
        public final java.lang.Number getSlowStart() {
            return this.slowStart;
        }

        @Override
        public final java.util.List<imports.aws.LbTargetGroupStickiness> getStickiness() {
            return this.stickiness;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.lang.String getTargetType() {
            return this.targetType;
        }

        @Override
        public final java.lang.String getVpcId() {
            return this.vpcId;
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

            if (this.getDeregistrationDelay() != null) {
                data.set("deregistrationDelay", om.valueToTree(this.getDeregistrationDelay()));
            }
            if (this.getHealthCheck() != null) {
                data.set("healthCheck", om.valueToTree(this.getHealthCheck()));
            }
            if (this.getLambdaMultiValueHeadersEnabled() != null) {
                data.set("lambdaMultiValueHeadersEnabled", om.valueToTree(this.getLambdaMultiValueHeadersEnabled()));
            }
            if (this.getLoadBalancingAlgorithmType() != null) {
                data.set("loadBalancingAlgorithmType", om.valueToTree(this.getLoadBalancingAlgorithmType()));
            }
            if (this.getName() != null) {
                data.set("name", om.valueToTree(this.getName()));
            }
            if (this.getNamePrefix() != null) {
                data.set("namePrefix", om.valueToTree(this.getNamePrefix()));
            }
            if (this.getPort() != null) {
                data.set("port", om.valueToTree(this.getPort()));
            }
            if (this.getProtocol() != null) {
                data.set("protocol", om.valueToTree(this.getProtocol()));
            }
            if (this.getProxyProtocolV2() != null) {
                data.set("proxyProtocolV2", om.valueToTree(this.getProxyProtocolV2()));
            }
            if (this.getSlowStart() != null) {
                data.set("slowStart", om.valueToTree(this.getSlowStart()));
            }
            if (this.getStickiness() != null) {
                data.set("stickiness", om.valueToTree(this.getStickiness()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getTargetType() != null) {
                data.set("targetType", om.valueToTree(this.getTargetType()));
            }
            if (this.getVpcId() != null) {
                data.set("vpcId", om.valueToTree(this.getVpcId()));
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
            struct.set("fqn", om.valueToTree("aws.LbTargetGroupConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LbTargetGroupConfig.Jsii$Proxy that = (LbTargetGroupConfig.Jsii$Proxy) o;

            if (this.deregistrationDelay != null ? !this.deregistrationDelay.equals(that.deregistrationDelay) : that.deregistrationDelay != null) return false;
            if (this.healthCheck != null ? !this.healthCheck.equals(that.healthCheck) : that.healthCheck != null) return false;
            if (this.lambdaMultiValueHeadersEnabled != null ? !this.lambdaMultiValueHeadersEnabled.equals(that.lambdaMultiValueHeadersEnabled) : that.lambdaMultiValueHeadersEnabled != null) return false;
            if (this.loadBalancingAlgorithmType != null ? !this.loadBalancingAlgorithmType.equals(that.loadBalancingAlgorithmType) : that.loadBalancingAlgorithmType != null) return false;
            if (this.name != null ? !this.name.equals(that.name) : that.name != null) return false;
            if (this.namePrefix != null ? !this.namePrefix.equals(that.namePrefix) : that.namePrefix != null) return false;
            if (this.port != null ? !this.port.equals(that.port) : that.port != null) return false;
            if (this.protocol != null ? !this.protocol.equals(that.protocol) : that.protocol != null) return false;
            if (this.proxyProtocolV2 != null ? !this.proxyProtocolV2.equals(that.proxyProtocolV2) : that.proxyProtocolV2 != null) return false;
            if (this.slowStart != null ? !this.slowStart.equals(that.slowStart) : that.slowStart != null) return false;
            if (this.stickiness != null ? !this.stickiness.equals(that.stickiness) : that.stickiness != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.targetType != null ? !this.targetType.equals(that.targetType) : that.targetType != null) return false;
            if (this.vpcId != null ? !this.vpcId.equals(that.vpcId) : that.vpcId != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.deregistrationDelay != null ? this.deregistrationDelay.hashCode() : 0;
            result = 31 * result + (this.healthCheck != null ? this.healthCheck.hashCode() : 0);
            result = 31 * result + (this.lambdaMultiValueHeadersEnabled != null ? this.lambdaMultiValueHeadersEnabled.hashCode() : 0);
            result = 31 * result + (this.loadBalancingAlgorithmType != null ? this.loadBalancingAlgorithmType.hashCode() : 0);
            result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
            result = 31 * result + (this.namePrefix != null ? this.namePrefix.hashCode() : 0);
            result = 31 * result + (this.port != null ? this.port.hashCode() : 0);
            result = 31 * result + (this.protocol != null ? this.protocol.hashCode() : 0);
            result = 31 * result + (this.proxyProtocolV2 != null ? this.proxyProtocolV2.hashCode() : 0);
            result = 31 * result + (this.slowStart != null ? this.slowStart.hashCode() : 0);
            result = 31 * result + (this.stickiness != null ? this.stickiness.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.targetType != null ? this.targetType.hashCode() : 0);
            result = 31 * result + (this.vpcId != null ? this.vpcId.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
