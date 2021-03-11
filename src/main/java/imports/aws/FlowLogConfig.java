package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.576Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.FlowLogConfig")
@software.amazon.jsii.Jsii.Proxy(FlowLogConfig.Jsii$Proxy.class)
public interface FlowLogConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getTrafficType();

    default @org.jetbrains.annotations.Nullable java.lang.String getEniId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getIamRoleArn() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getLogDestination() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getLogDestinationType() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getLogFormat() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getLogGroupName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getMaxAggregationInterval() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSubnetId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getVpcId() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link FlowLogConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link FlowLogConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<FlowLogConfig> {
        private java.lang.String trafficType;
        private java.lang.String eniId;
        private java.lang.String iamRoleArn;
        private java.lang.String logDestination;
        private java.lang.String logDestinationType;
        private java.lang.String logFormat;
        private java.lang.String logGroupName;
        private java.lang.Number maxAggregationInterval;
        private java.lang.String subnetId;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.lang.String vpcId;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link FlowLogConfig#getTrafficType}
         * @param trafficType the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder trafficType(java.lang.String trafficType) {
            this.trafficType = trafficType;
            return this;
        }

        /**
         * Sets the value of {@link FlowLogConfig#getEniId}
         * @param eniId the value to be set.
         * @return {@code this}
         */
        public Builder eniId(java.lang.String eniId) {
            this.eniId = eniId;
            return this;
        }

        /**
         * Sets the value of {@link FlowLogConfig#getIamRoleArn}
         * @param iamRoleArn the value to be set.
         * @return {@code this}
         */
        public Builder iamRoleArn(java.lang.String iamRoleArn) {
            this.iamRoleArn = iamRoleArn;
            return this;
        }

        /**
         * Sets the value of {@link FlowLogConfig#getLogDestination}
         * @param logDestination the value to be set.
         * @return {@code this}
         */
        public Builder logDestination(java.lang.String logDestination) {
            this.logDestination = logDestination;
            return this;
        }

        /**
         * Sets the value of {@link FlowLogConfig#getLogDestinationType}
         * @param logDestinationType the value to be set.
         * @return {@code this}
         */
        public Builder logDestinationType(java.lang.String logDestinationType) {
            this.logDestinationType = logDestinationType;
            return this;
        }

        /**
         * Sets the value of {@link FlowLogConfig#getLogFormat}
         * @param logFormat the value to be set.
         * @return {@code this}
         */
        public Builder logFormat(java.lang.String logFormat) {
            this.logFormat = logFormat;
            return this;
        }

        /**
         * Sets the value of {@link FlowLogConfig#getLogGroupName}
         * @param logGroupName the value to be set.
         * @return {@code this}
         */
        public Builder logGroupName(java.lang.String logGroupName) {
            this.logGroupName = logGroupName;
            return this;
        }

        /**
         * Sets the value of {@link FlowLogConfig#getMaxAggregationInterval}
         * @param maxAggregationInterval the value to be set.
         * @return {@code this}
         */
        public Builder maxAggregationInterval(java.lang.Number maxAggregationInterval) {
            this.maxAggregationInterval = maxAggregationInterval;
            return this;
        }

        /**
         * Sets the value of {@link FlowLogConfig#getSubnetId}
         * @param subnetId the value to be set.
         * @return {@code this}
         */
        public Builder subnetId(java.lang.String subnetId) {
            this.subnetId = subnetId;
            return this;
        }

        /**
         * Sets the value of {@link FlowLogConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link FlowLogConfig#getVpcId}
         * @param vpcId the value to be set.
         * @return {@code this}
         */
        public Builder vpcId(java.lang.String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        /**
         * Sets the value of {@link FlowLogConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link FlowLogConfig#getDependsOn}
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
         * Sets the value of {@link FlowLogConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link FlowLogConfig#getProvider}
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
         * @return a new instance of {@link FlowLogConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public FlowLogConfig build() {
            return new Jsii$Proxy(trafficType, eniId, iamRoleArn, logDestination, logDestinationType, logFormat, logGroupName, maxAggregationInterval, subnetId, tags, vpcId, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link FlowLogConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements FlowLogConfig {
        private final java.lang.String trafficType;
        private final java.lang.String eniId;
        private final java.lang.String iamRoleArn;
        private final java.lang.String logDestination;
        private final java.lang.String logDestinationType;
        private final java.lang.String logFormat;
        private final java.lang.String logGroupName;
        private final java.lang.Number maxAggregationInterval;
        private final java.lang.String subnetId;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
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
            this.trafficType = software.amazon.jsii.Kernel.get(this, "trafficType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.eniId = software.amazon.jsii.Kernel.get(this, "eniId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.iamRoleArn = software.amazon.jsii.Kernel.get(this, "iamRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.logDestination = software.amazon.jsii.Kernel.get(this, "logDestination", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.logDestinationType = software.amazon.jsii.Kernel.get(this, "logDestinationType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.logFormat = software.amazon.jsii.Kernel.get(this, "logFormat", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.logGroupName = software.amazon.jsii.Kernel.get(this, "logGroupName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.maxAggregationInterval = software.amazon.jsii.Kernel.get(this, "maxAggregationInterval", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.subnetId = software.amazon.jsii.Kernel.get(this, "subnetId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
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
        protected Jsii$Proxy(final java.lang.String trafficType, final java.lang.String eniId, final java.lang.String iamRoleArn, final java.lang.String logDestination, final java.lang.String logDestinationType, final java.lang.String logFormat, final java.lang.String logGroupName, final java.lang.Number maxAggregationInterval, final java.lang.String subnetId, final java.util.Map<java.lang.String, java.lang.String> tags, final java.lang.String vpcId, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.trafficType = java.util.Objects.requireNonNull(trafficType, "trafficType is required");
            this.eniId = eniId;
            this.iamRoleArn = iamRoleArn;
            this.logDestination = logDestination;
            this.logDestinationType = logDestinationType;
            this.logFormat = logFormat;
            this.logGroupName = logGroupName;
            this.maxAggregationInterval = maxAggregationInterval;
            this.subnetId = subnetId;
            this.tags = tags;
            this.vpcId = vpcId;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getTrafficType() {
            return this.trafficType;
        }

        @Override
        public final java.lang.String getEniId() {
            return this.eniId;
        }

        @Override
        public final java.lang.String getIamRoleArn() {
            return this.iamRoleArn;
        }

        @Override
        public final java.lang.String getLogDestination() {
            return this.logDestination;
        }

        @Override
        public final java.lang.String getLogDestinationType() {
            return this.logDestinationType;
        }

        @Override
        public final java.lang.String getLogFormat() {
            return this.logFormat;
        }

        @Override
        public final java.lang.String getLogGroupName() {
            return this.logGroupName;
        }

        @Override
        public final java.lang.Number getMaxAggregationInterval() {
            return this.maxAggregationInterval;
        }

        @Override
        public final java.lang.String getSubnetId() {
            return this.subnetId;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
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

            data.set("trafficType", om.valueToTree(this.getTrafficType()));
            if (this.getEniId() != null) {
                data.set("eniId", om.valueToTree(this.getEniId()));
            }
            if (this.getIamRoleArn() != null) {
                data.set("iamRoleArn", om.valueToTree(this.getIamRoleArn()));
            }
            if (this.getLogDestination() != null) {
                data.set("logDestination", om.valueToTree(this.getLogDestination()));
            }
            if (this.getLogDestinationType() != null) {
                data.set("logDestinationType", om.valueToTree(this.getLogDestinationType()));
            }
            if (this.getLogFormat() != null) {
                data.set("logFormat", om.valueToTree(this.getLogFormat()));
            }
            if (this.getLogGroupName() != null) {
                data.set("logGroupName", om.valueToTree(this.getLogGroupName()));
            }
            if (this.getMaxAggregationInterval() != null) {
                data.set("maxAggregationInterval", om.valueToTree(this.getMaxAggregationInterval()));
            }
            if (this.getSubnetId() != null) {
                data.set("subnetId", om.valueToTree(this.getSubnetId()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
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
            struct.set("fqn", om.valueToTree("aws.FlowLogConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            FlowLogConfig.Jsii$Proxy that = (FlowLogConfig.Jsii$Proxy) o;

            if (!trafficType.equals(that.trafficType)) return false;
            if (this.eniId != null ? !this.eniId.equals(that.eniId) : that.eniId != null) return false;
            if (this.iamRoleArn != null ? !this.iamRoleArn.equals(that.iamRoleArn) : that.iamRoleArn != null) return false;
            if (this.logDestination != null ? !this.logDestination.equals(that.logDestination) : that.logDestination != null) return false;
            if (this.logDestinationType != null ? !this.logDestinationType.equals(that.logDestinationType) : that.logDestinationType != null) return false;
            if (this.logFormat != null ? !this.logFormat.equals(that.logFormat) : that.logFormat != null) return false;
            if (this.logGroupName != null ? !this.logGroupName.equals(that.logGroupName) : that.logGroupName != null) return false;
            if (this.maxAggregationInterval != null ? !this.maxAggregationInterval.equals(that.maxAggregationInterval) : that.maxAggregationInterval != null) return false;
            if (this.subnetId != null ? !this.subnetId.equals(that.subnetId) : that.subnetId != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.vpcId != null ? !this.vpcId.equals(that.vpcId) : that.vpcId != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.trafficType.hashCode();
            result = 31 * result + (this.eniId != null ? this.eniId.hashCode() : 0);
            result = 31 * result + (this.iamRoleArn != null ? this.iamRoleArn.hashCode() : 0);
            result = 31 * result + (this.logDestination != null ? this.logDestination.hashCode() : 0);
            result = 31 * result + (this.logDestinationType != null ? this.logDestinationType.hashCode() : 0);
            result = 31 * result + (this.logFormat != null ? this.logFormat.hashCode() : 0);
            result = 31 * result + (this.logGroupName != null ? this.logGroupName.hashCode() : 0);
            result = 31 * result + (this.maxAggregationInterval != null ? this.maxAggregationInterval.hashCode() : 0);
            result = 31 * result + (this.subnetId != null ? this.subnetId.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.vpcId != null ? this.vpcId.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
