package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.587Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.GlobalacceleratorEndpointGroupConfig")
@software.amazon.jsii.Jsii.Proxy(GlobalacceleratorEndpointGroupConfig.Jsii$Proxy.class)
public interface GlobalacceleratorEndpointGroupConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getListenerArn();

    /**
     * endpoint_configuration block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.GlobalacceleratorEndpointGroupEndpointConfiguration> getEndpointConfiguration() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getEndpointGroupRegion() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getHealthCheckIntervalSeconds() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getHealthCheckPath() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getHealthCheckPort() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getHealthCheckProtocol() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getThresholdCount() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getTrafficDialPercentage() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link GlobalacceleratorEndpointGroupConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link GlobalacceleratorEndpointGroupConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<GlobalacceleratorEndpointGroupConfig> {
        private java.lang.String listenerArn;
        private java.util.List<imports.aws.GlobalacceleratorEndpointGroupEndpointConfiguration> endpointConfiguration;
        private java.lang.String endpointGroupRegion;
        private java.lang.Number healthCheckIntervalSeconds;
        private java.lang.String healthCheckPath;
        private java.lang.Number healthCheckPort;
        private java.lang.String healthCheckProtocol;
        private java.lang.Number thresholdCount;
        private java.lang.Number trafficDialPercentage;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link GlobalacceleratorEndpointGroupConfig#getListenerArn}
         * @param listenerArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder listenerArn(java.lang.String listenerArn) {
            this.listenerArn = listenerArn;
            return this;
        }

        /**
         * Sets the value of {@link GlobalacceleratorEndpointGroupConfig#getEndpointConfiguration}
         * @param endpointConfiguration endpoint_configuration block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder endpointConfiguration(java.util.List<? extends imports.aws.GlobalacceleratorEndpointGroupEndpointConfiguration> endpointConfiguration) {
            this.endpointConfiguration = (java.util.List<imports.aws.GlobalacceleratorEndpointGroupEndpointConfiguration>)endpointConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link GlobalacceleratorEndpointGroupConfig#getEndpointGroupRegion}
         * @param endpointGroupRegion the value to be set.
         * @return {@code this}
         */
        public Builder endpointGroupRegion(java.lang.String endpointGroupRegion) {
            this.endpointGroupRegion = endpointGroupRegion;
            return this;
        }

        /**
         * Sets the value of {@link GlobalacceleratorEndpointGroupConfig#getHealthCheckIntervalSeconds}
         * @param healthCheckIntervalSeconds the value to be set.
         * @return {@code this}
         */
        public Builder healthCheckIntervalSeconds(java.lang.Number healthCheckIntervalSeconds) {
            this.healthCheckIntervalSeconds = healthCheckIntervalSeconds;
            return this;
        }

        /**
         * Sets the value of {@link GlobalacceleratorEndpointGroupConfig#getHealthCheckPath}
         * @param healthCheckPath the value to be set.
         * @return {@code this}
         */
        public Builder healthCheckPath(java.lang.String healthCheckPath) {
            this.healthCheckPath = healthCheckPath;
            return this;
        }

        /**
         * Sets the value of {@link GlobalacceleratorEndpointGroupConfig#getHealthCheckPort}
         * @param healthCheckPort the value to be set.
         * @return {@code this}
         */
        public Builder healthCheckPort(java.lang.Number healthCheckPort) {
            this.healthCheckPort = healthCheckPort;
            return this;
        }

        /**
         * Sets the value of {@link GlobalacceleratorEndpointGroupConfig#getHealthCheckProtocol}
         * @param healthCheckProtocol the value to be set.
         * @return {@code this}
         */
        public Builder healthCheckProtocol(java.lang.String healthCheckProtocol) {
            this.healthCheckProtocol = healthCheckProtocol;
            return this;
        }

        /**
         * Sets the value of {@link GlobalacceleratorEndpointGroupConfig#getThresholdCount}
         * @param thresholdCount the value to be set.
         * @return {@code this}
         */
        public Builder thresholdCount(java.lang.Number thresholdCount) {
            this.thresholdCount = thresholdCount;
            return this;
        }

        /**
         * Sets the value of {@link GlobalacceleratorEndpointGroupConfig#getTrafficDialPercentage}
         * @param trafficDialPercentage the value to be set.
         * @return {@code this}
         */
        public Builder trafficDialPercentage(java.lang.Number trafficDialPercentage) {
            this.trafficDialPercentage = trafficDialPercentage;
            return this;
        }

        /**
         * Sets the value of {@link GlobalacceleratorEndpointGroupConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link GlobalacceleratorEndpointGroupConfig#getDependsOn}
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
         * Sets the value of {@link GlobalacceleratorEndpointGroupConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link GlobalacceleratorEndpointGroupConfig#getProvider}
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
         * @return a new instance of {@link GlobalacceleratorEndpointGroupConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public GlobalacceleratorEndpointGroupConfig build() {
            return new Jsii$Proxy(listenerArn, endpointConfiguration, endpointGroupRegion, healthCheckIntervalSeconds, healthCheckPath, healthCheckPort, healthCheckProtocol, thresholdCount, trafficDialPercentage, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link GlobalacceleratorEndpointGroupConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements GlobalacceleratorEndpointGroupConfig {
        private final java.lang.String listenerArn;
        private final java.util.List<imports.aws.GlobalacceleratorEndpointGroupEndpointConfiguration> endpointConfiguration;
        private final java.lang.String endpointGroupRegion;
        private final java.lang.Number healthCheckIntervalSeconds;
        private final java.lang.String healthCheckPath;
        private final java.lang.Number healthCheckPort;
        private final java.lang.String healthCheckProtocol;
        private final java.lang.Number thresholdCount;
        private final java.lang.Number trafficDialPercentage;
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
            this.listenerArn = software.amazon.jsii.Kernel.get(this, "listenerArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.endpointConfiguration = software.amazon.jsii.Kernel.get(this, "endpointConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.GlobalacceleratorEndpointGroupEndpointConfiguration.class)));
            this.endpointGroupRegion = software.amazon.jsii.Kernel.get(this, "endpointGroupRegion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.healthCheckIntervalSeconds = software.amazon.jsii.Kernel.get(this, "healthCheckIntervalSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.healthCheckPath = software.amazon.jsii.Kernel.get(this, "healthCheckPath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.healthCheckPort = software.amazon.jsii.Kernel.get(this, "healthCheckPort", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.healthCheckProtocol = software.amazon.jsii.Kernel.get(this, "healthCheckProtocol", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.thresholdCount = software.amazon.jsii.Kernel.get(this, "thresholdCount", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.trafficDialPercentage = software.amazon.jsii.Kernel.get(this, "trafficDialPercentage", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String listenerArn, final java.util.List<? extends imports.aws.GlobalacceleratorEndpointGroupEndpointConfiguration> endpointConfiguration, final java.lang.String endpointGroupRegion, final java.lang.Number healthCheckIntervalSeconds, final java.lang.String healthCheckPath, final java.lang.Number healthCheckPort, final java.lang.String healthCheckProtocol, final java.lang.Number thresholdCount, final java.lang.Number trafficDialPercentage, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.listenerArn = java.util.Objects.requireNonNull(listenerArn, "listenerArn is required");
            this.endpointConfiguration = (java.util.List<imports.aws.GlobalacceleratorEndpointGroupEndpointConfiguration>)endpointConfiguration;
            this.endpointGroupRegion = endpointGroupRegion;
            this.healthCheckIntervalSeconds = healthCheckIntervalSeconds;
            this.healthCheckPath = healthCheckPath;
            this.healthCheckPort = healthCheckPort;
            this.healthCheckProtocol = healthCheckProtocol;
            this.thresholdCount = thresholdCount;
            this.trafficDialPercentage = trafficDialPercentage;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getListenerArn() {
            return this.listenerArn;
        }

        @Override
        public final java.util.List<imports.aws.GlobalacceleratorEndpointGroupEndpointConfiguration> getEndpointConfiguration() {
            return this.endpointConfiguration;
        }

        @Override
        public final java.lang.String getEndpointGroupRegion() {
            return this.endpointGroupRegion;
        }

        @Override
        public final java.lang.Number getHealthCheckIntervalSeconds() {
            return this.healthCheckIntervalSeconds;
        }

        @Override
        public final java.lang.String getHealthCheckPath() {
            return this.healthCheckPath;
        }

        @Override
        public final java.lang.Number getHealthCheckPort() {
            return this.healthCheckPort;
        }

        @Override
        public final java.lang.String getHealthCheckProtocol() {
            return this.healthCheckProtocol;
        }

        @Override
        public final java.lang.Number getThresholdCount() {
            return this.thresholdCount;
        }

        @Override
        public final java.lang.Number getTrafficDialPercentage() {
            return this.trafficDialPercentage;
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

            data.set("listenerArn", om.valueToTree(this.getListenerArn()));
            if (this.getEndpointConfiguration() != null) {
                data.set("endpointConfiguration", om.valueToTree(this.getEndpointConfiguration()));
            }
            if (this.getEndpointGroupRegion() != null) {
                data.set("endpointGroupRegion", om.valueToTree(this.getEndpointGroupRegion()));
            }
            if (this.getHealthCheckIntervalSeconds() != null) {
                data.set("healthCheckIntervalSeconds", om.valueToTree(this.getHealthCheckIntervalSeconds()));
            }
            if (this.getHealthCheckPath() != null) {
                data.set("healthCheckPath", om.valueToTree(this.getHealthCheckPath()));
            }
            if (this.getHealthCheckPort() != null) {
                data.set("healthCheckPort", om.valueToTree(this.getHealthCheckPort()));
            }
            if (this.getHealthCheckProtocol() != null) {
                data.set("healthCheckProtocol", om.valueToTree(this.getHealthCheckProtocol()));
            }
            if (this.getThresholdCount() != null) {
                data.set("thresholdCount", om.valueToTree(this.getThresholdCount()));
            }
            if (this.getTrafficDialPercentage() != null) {
                data.set("trafficDialPercentage", om.valueToTree(this.getTrafficDialPercentage()));
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
            struct.set("fqn", om.valueToTree("aws.GlobalacceleratorEndpointGroupConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            GlobalacceleratorEndpointGroupConfig.Jsii$Proxy that = (GlobalacceleratorEndpointGroupConfig.Jsii$Proxy) o;

            if (!listenerArn.equals(that.listenerArn)) return false;
            if (this.endpointConfiguration != null ? !this.endpointConfiguration.equals(that.endpointConfiguration) : that.endpointConfiguration != null) return false;
            if (this.endpointGroupRegion != null ? !this.endpointGroupRegion.equals(that.endpointGroupRegion) : that.endpointGroupRegion != null) return false;
            if (this.healthCheckIntervalSeconds != null ? !this.healthCheckIntervalSeconds.equals(that.healthCheckIntervalSeconds) : that.healthCheckIntervalSeconds != null) return false;
            if (this.healthCheckPath != null ? !this.healthCheckPath.equals(that.healthCheckPath) : that.healthCheckPath != null) return false;
            if (this.healthCheckPort != null ? !this.healthCheckPort.equals(that.healthCheckPort) : that.healthCheckPort != null) return false;
            if (this.healthCheckProtocol != null ? !this.healthCheckProtocol.equals(that.healthCheckProtocol) : that.healthCheckProtocol != null) return false;
            if (this.thresholdCount != null ? !this.thresholdCount.equals(that.thresholdCount) : that.thresholdCount != null) return false;
            if (this.trafficDialPercentage != null ? !this.trafficDialPercentage.equals(that.trafficDialPercentage) : that.trafficDialPercentage != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.listenerArn.hashCode();
            result = 31 * result + (this.endpointConfiguration != null ? this.endpointConfiguration.hashCode() : 0);
            result = 31 * result + (this.endpointGroupRegion != null ? this.endpointGroupRegion.hashCode() : 0);
            result = 31 * result + (this.healthCheckIntervalSeconds != null ? this.healthCheckIntervalSeconds.hashCode() : 0);
            result = 31 * result + (this.healthCheckPath != null ? this.healthCheckPath.hashCode() : 0);
            result = 31 * result + (this.healthCheckPort != null ? this.healthCheckPort.hashCode() : 0);
            result = 31 * result + (this.healthCheckProtocol != null ? this.healthCheckProtocol.hashCode() : 0);
            result = 31 * result + (this.thresholdCount != null ? this.thresholdCount.hashCode() : 0);
            result = 31 * result + (this.trafficDialPercentage != null ? this.trafficDialPercentage.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
