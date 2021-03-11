package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.553Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.ElasticsearchDomainClusterConfig")
@software.amazon.jsii.Jsii.Proxy(ElasticsearchDomainClusterConfig.Jsii$Proxy.class)
public interface ElasticsearchDomainClusterConfig extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.Number getDedicatedMasterCount() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getDedicatedMasterEnabled() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDedicatedMasterType() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getInstanceCount() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getInstanceType() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getWarmCount() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getWarmEnabled() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getWarmType() {
        return null;
    }

    /**
     * zone_awareness_config block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ElasticsearchDomainClusterConfigZoneAwarenessConfig> getZoneAwarenessConfig() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getZoneAwarenessEnabled() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ElasticsearchDomainClusterConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ElasticsearchDomainClusterConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ElasticsearchDomainClusterConfig> {
        private java.lang.Number dedicatedMasterCount;
        private java.lang.Boolean dedicatedMasterEnabled;
        private java.lang.String dedicatedMasterType;
        private java.lang.Number instanceCount;
        private java.lang.String instanceType;
        private java.lang.Number warmCount;
        private java.lang.Boolean warmEnabled;
        private java.lang.String warmType;
        private java.util.List<imports.aws.ElasticsearchDomainClusterConfigZoneAwarenessConfig> zoneAwarenessConfig;
        private java.lang.Boolean zoneAwarenessEnabled;

        /**
         * Sets the value of {@link ElasticsearchDomainClusterConfig#getDedicatedMasterCount}
         * @param dedicatedMasterCount the value to be set.
         * @return {@code this}
         */
        public Builder dedicatedMasterCount(java.lang.Number dedicatedMasterCount) {
            this.dedicatedMasterCount = dedicatedMasterCount;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchDomainClusterConfig#getDedicatedMasterEnabled}
         * @param dedicatedMasterEnabled the value to be set.
         * @return {@code this}
         */
        public Builder dedicatedMasterEnabled(java.lang.Boolean dedicatedMasterEnabled) {
            this.dedicatedMasterEnabled = dedicatedMasterEnabled;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchDomainClusterConfig#getDedicatedMasterType}
         * @param dedicatedMasterType the value to be set.
         * @return {@code this}
         */
        public Builder dedicatedMasterType(java.lang.String dedicatedMasterType) {
            this.dedicatedMasterType = dedicatedMasterType;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchDomainClusterConfig#getInstanceCount}
         * @param instanceCount the value to be set.
         * @return {@code this}
         */
        public Builder instanceCount(java.lang.Number instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchDomainClusterConfig#getInstanceType}
         * @param instanceType the value to be set.
         * @return {@code this}
         */
        public Builder instanceType(java.lang.String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchDomainClusterConfig#getWarmCount}
         * @param warmCount the value to be set.
         * @return {@code this}
         */
        public Builder warmCount(java.lang.Number warmCount) {
            this.warmCount = warmCount;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchDomainClusterConfig#getWarmEnabled}
         * @param warmEnabled the value to be set.
         * @return {@code this}
         */
        public Builder warmEnabled(java.lang.Boolean warmEnabled) {
            this.warmEnabled = warmEnabled;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchDomainClusterConfig#getWarmType}
         * @param warmType the value to be set.
         * @return {@code this}
         */
        public Builder warmType(java.lang.String warmType) {
            this.warmType = warmType;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchDomainClusterConfig#getZoneAwarenessConfig}
         * @param zoneAwarenessConfig zone_awareness_config block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder zoneAwarenessConfig(java.util.List<? extends imports.aws.ElasticsearchDomainClusterConfigZoneAwarenessConfig> zoneAwarenessConfig) {
            this.zoneAwarenessConfig = (java.util.List<imports.aws.ElasticsearchDomainClusterConfigZoneAwarenessConfig>)zoneAwarenessConfig;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchDomainClusterConfig#getZoneAwarenessEnabled}
         * @param zoneAwarenessEnabled the value to be set.
         * @return {@code this}
         */
        public Builder zoneAwarenessEnabled(java.lang.Boolean zoneAwarenessEnabled) {
            this.zoneAwarenessEnabled = zoneAwarenessEnabled;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ElasticsearchDomainClusterConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ElasticsearchDomainClusterConfig build() {
            return new Jsii$Proxy(dedicatedMasterCount, dedicatedMasterEnabled, dedicatedMasterType, instanceCount, instanceType, warmCount, warmEnabled, warmType, zoneAwarenessConfig, zoneAwarenessEnabled);
        }
    }

    /**
     * An implementation for {@link ElasticsearchDomainClusterConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ElasticsearchDomainClusterConfig {
        private final java.lang.Number dedicatedMasterCount;
        private final java.lang.Boolean dedicatedMasterEnabled;
        private final java.lang.String dedicatedMasterType;
        private final java.lang.Number instanceCount;
        private final java.lang.String instanceType;
        private final java.lang.Number warmCount;
        private final java.lang.Boolean warmEnabled;
        private final java.lang.String warmType;
        private final java.util.List<imports.aws.ElasticsearchDomainClusterConfigZoneAwarenessConfig> zoneAwarenessConfig;
        private final java.lang.Boolean zoneAwarenessEnabled;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.dedicatedMasterCount = software.amazon.jsii.Kernel.get(this, "dedicatedMasterCount", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dedicatedMasterEnabled = software.amazon.jsii.Kernel.get(this, "dedicatedMasterEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.dedicatedMasterType = software.amazon.jsii.Kernel.get(this, "dedicatedMasterType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.instanceCount = software.amazon.jsii.Kernel.get(this, "instanceCount", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.instanceType = software.amazon.jsii.Kernel.get(this, "instanceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.warmCount = software.amazon.jsii.Kernel.get(this, "warmCount", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.warmEnabled = software.amazon.jsii.Kernel.get(this, "warmEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.warmType = software.amazon.jsii.Kernel.get(this, "warmType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.zoneAwarenessConfig = software.amazon.jsii.Kernel.get(this, "zoneAwarenessConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElasticsearchDomainClusterConfigZoneAwarenessConfig.class)));
            this.zoneAwarenessEnabled = software.amazon.jsii.Kernel.get(this, "zoneAwarenessEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.Number dedicatedMasterCount, final java.lang.Boolean dedicatedMasterEnabled, final java.lang.String dedicatedMasterType, final java.lang.Number instanceCount, final java.lang.String instanceType, final java.lang.Number warmCount, final java.lang.Boolean warmEnabled, final java.lang.String warmType, final java.util.List<? extends imports.aws.ElasticsearchDomainClusterConfigZoneAwarenessConfig> zoneAwarenessConfig, final java.lang.Boolean zoneAwarenessEnabled) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.dedicatedMasterCount = dedicatedMasterCount;
            this.dedicatedMasterEnabled = dedicatedMasterEnabled;
            this.dedicatedMasterType = dedicatedMasterType;
            this.instanceCount = instanceCount;
            this.instanceType = instanceType;
            this.warmCount = warmCount;
            this.warmEnabled = warmEnabled;
            this.warmType = warmType;
            this.zoneAwarenessConfig = (java.util.List<imports.aws.ElasticsearchDomainClusterConfigZoneAwarenessConfig>)zoneAwarenessConfig;
            this.zoneAwarenessEnabled = zoneAwarenessEnabled;
        }

        @Override
        public final java.lang.Number getDedicatedMasterCount() {
            return this.dedicatedMasterCount;
        }

        @Override
        public final java.lang.Boolean getDedicatedMasterEnabled() {
            return this.dedicatedMasterEnabled;
        }

        @Override
        public final java.lang.String getDedicatedMasterType() {
            return this.dedicatedMasterType;
        }

        @Override
        public final java.lang.Number getInstanceCount() {
            return this.instanceCount;
        }

        @Override
        public final java.lang.String getInstanceType() {
            return this.instanceType;
        }

        @Override
        public final java.lang.Number getWarmCount() {
            return this.warmCount;
        }

        @Override
        public final java.lang.Boolean getWarmEnabled() {
            return this.warmEnabled;
        }

        @Override
        public final java.lang.String getWarmType() {
            return this.warmType;
        }

        @Override
        public final java.util.List<imports.aws.ElasticsearchDomainClusterConfigZoneAwarenessConfig> getZoneAwarenessConfig() {
            return this.zoneAwarenessConfig;
        }

        @Override
        public final java.lang.Boolean getZoneAwarenessEnabled() {
            return this.zoneAwarenessEnabled;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getDedicatedMasterCount() != null) {
                data.set("dedicatedMasterCount", om.valueToTree(this.getDedicatedMasterCount()));
            }
            if (this.getDedicatedMasterEnabled() != null) {
                data.set("dedicatedMasterEnabled", om.valueToTree(this.getDedicatedMasterEnabled()));
            }
            if (this.getDedicatedMasterType() != null) {
                data.set("dedicatedMasterType", om.valueToTree(this.getDedicatedMasterType()));
            }
            if (this.getInstanceCount() != null) {
                data.set("instanceCount", om.valueToTree(this.getInstanceCount()));
            }
            if (this.getInstanceType() != null) {
                data.set("instanceType", om.valueToTree(this.getInstanceType()));
            }
            if (this.getWarmCount() != null) {
                data.set("warmCount", om.valueToTree(this.getWarmCount()));
            }
            if (this.getWarmEnabled() != null) {
                data.set("warmEnabled", om.valueToTree(this.getWarmEnabled()));
            }
            if (this.getWarmType() != null) {
                data.set("warmType", om.valueToTree(this.getWarmType()));
            }
            if (this.getZoneAwarenessConfig() != null) {
                data.set("zoneAwarenessConfig", om.valueToTree(this.getZoneAwarenessConfig()));
            }
            if (this.getZoneAwarenessEnabled() != null) {
                data.set("zoneAwarenessEnabled", om.valueToTree(this.getZoneAwarenessEnabled()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.ElasticsearchDomainClusterConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ElasticsearchDomainClusterConfig.Jsii$Proxy that = (ElasticsearchDomainClusterConfig.Jsii$Proxy) o;

            if (this.dedicatedMasterCount != null ? !this.dedicatedMasterCount.equals(that.dedicatedMasterCount) : that.dedicatedMasterCount != null) return false;
            if (this.dedicatedMasterEnabled != null ? !this.dedicatedMasterEnabled.equals(that.dedicatedMasterEnabled) : that.dedicatedMasterEnabled != null) return false;
            if (this.dedicatedMasterType != null ? !this.dedicatedMasterType.equals(that.dedicatedMasterType) : that.dedicatedMasterType != null) return false;
            if (this.instanceCount != null ? !this.instanceCount.equals(that.instanceCount) : that.instanceCount != null) return false;
            if (this.instanceType != null ? !this.instanceType.equals(that.instanceType) : that.instanceType != null) return false;
            if (this.warmCount != null ? !this.warmCount.equals(that.warmCount) : that.warmCount != null) return false;
            if (this.warmEnabled != null ? !this.warmEnabled.equals(that.warmEnabled) : that.warmEnabled != null) return false;
            if (this.warmType != null ? !this.warmType.equals(that.warmType) : that.warmType != null) return false;
            if (this.zoneAwarenessConfig != null ? !this.zoneAwarenessConfig.equals(that.zoneAwarenessConfig) : that.zoneAwarenessConfig != null) return false;
            return this.zoneAwarenessEnabled != null ? this.zoneAwarenessEnabled.equals(that.zoneAwarenessEnabled) : that.zoneAwarenessEnabled == null;
        }

        @Override
        public final int hashCode() {
            int result = this.dedicatedMasterCount != null ? this.dedicatedMasterCount.hashCode() : 0;
            result = 31 * result + (this.dedicatedMasterEnabled != null ? this.dedicatedMasterEnabled.hashCode() : 0);
            result = 31 * result + (this.dedicatedMasterType != null ? this.dedicatedMasterType.hashCode() : 0);
            result = 31 * result + (this.instanceCount != null ? this.instanceCount.hashCode() : 0);
            result = 31 * result + (this.instanceType != null ? this.instanceType.hashCode() : 0);
            result = 31 * result + (this.warmCount != null ? this.warmCount.hashCode() : 0);
            result = 31 * result + (this.warmEnabled != null ? this.warmEnabled.hashCode() : 0);
            result = 31 * result + (this.warmType != null ? this.warmType.hashCode() : 0);
            result = 31 * result + (this.zoneAwarenessConfig != null ? this.zoneAwarenessConfig.hashCode() : 0);
            result = 31 * result + (this.zoneAwarenessEnabled != null ? this.zoneAwarenessEnabled.hashCode() : 0);
            return result;
        }
    }
}
