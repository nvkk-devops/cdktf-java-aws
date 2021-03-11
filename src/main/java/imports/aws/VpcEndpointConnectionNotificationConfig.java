package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.917Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.VpcEndpointConnectionNotificationConfig")
@software.amazon.jsii.Jsii.Proxy(VpcEndpointConnectionNotificationConfig.Jsii$Proxy.class)
public interface VpcEndpointConnectionNotificationConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getConnectionEvents();

    @org.jetbrains.annotations.NotNull java.lang.String getConnectionNotificationArn();

    default @org.jetbrains.annotations.Nullable java.lang.String getVpcEndpointId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getVpcEndpointServiceId() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link VpcEndpointConnectionNotificationConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link VpcEndpointConnectionNotificationConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<VpcEndpointConnectionNotificationConfig> {
        private java.util.List<java.lang.String> connectionEvents;
        private java.lang.String connectionNotificationArn;
        private java.lang.String vpcEndpointId;
        private java.lang.String vpcEndpointServiceId;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link VpcEndpointConnectionNotificationConfig#getConnectionEvents}
         * @param connectionEvents the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder connectionEvents(java.util.List<java.lang.String> connectionEvents) {
            this.connectionEvents = connectionEvents;
            return this;
        }

        /**
         * Sets the value of {@link VpcEndpointConnectionNotificationConfig#getConnectionNotificationArn}
         * @param connectionNotificationArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder connectionNotificationArn(java.lang.String connectionNotificationArn) {
            this.connectionNotificationArn = connectionNotificationArn;
            return this;
        }

        /**
         * Sets the value of {@link VpcEndpointConnectionNotificationConfig#getVpcEndpointId}
         * @param vpcEndpointId the value to be set.
         * @return {@code this}
         */
        public Builder vpcEndpointId(java.lang.String vpcEndpointId) {
            this.vpcEndpointId = vpcEndpointId;
            return this;
        }

        /**
         * Sets the value of {@link VpcEndpointConnectionNotificationConfig#getVpcEndpointServiceId}
         * @param vpcEndpointServiceId the value to be set.
         * @return {@code this}
         */
        public Builder vpcEndpointServiceId(java.lang.String vpcEndpointServiceId) {
            this.vpcEndpointServiceId = vpcEndpointServiceId;
            return this;
        }

        /**
         * Sets the value of {@link VpcEndpointConnectionNotificationConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link VpcEndpointConnectionNotificationConfig#getDependsOn}
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
         * Sets the value of {@link VpcEndpointConnectionNotificationConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link VpcEndpointConnectionNotificationConfig#getProvider}
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
         * @return a new instance of {@link VpcEndpointConnectionNotificationConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public VpcEndpointConnectionNotificationConfig build() {
            return new Jsii$Proxy(connectionEvents, connectionNotificationArn, vpcEndpointId, vpcEndpointServiceId, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link VpcEndpointConnectionNotificationConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements VpcEndpointConnectionNotificationConfig {
        private final java.util.List<java.lang.String> connectionEvents;
        private final java.lang.String connectionNotificationArn;
        private final java.lang.String vpcEndpointId;
        private final java.lang.String vpcEndpointServiceId;
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
            this.connectionEvents = software.amazon.jsii.Kernel.get(this, "connectionEvents", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.connectionNotificationArn = software.amazon.jsii.Kernel.get(this, "connectionNotificationArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.vpcEndpointId = software.amazon.jsii.Kernel.get(this, "vpcEndpointId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.vpcEndpointServiceId = software.amazon.jsii.Kernel.get(this, "vpcEndpointServiceId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<java.lang.String> connectionEvents, final java.lang.String connectionNotificationArn, final java.lang.String vpcEndpointId, final java.lang.String vpcEndpointServiceId, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.connectionEvents = java.util.Objects.requireNonNull(connectionEvents, "connectionEvents is required");
            this.connectionNotificationArn = java.util.Objects.requireNonNull(connectionNotificationArn, "connectionNotificationArn is required");
            this.vpcEndpointId = vpcEndpointId;
            this.vpcEndpointServiceId = vpcEndpointServiceId;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.util.List<java.lang.String> getConnectionEvents() {
            return this.connectionEvents;
        }

        @Override
        public final java.lang.String getConnectionNotificationArn() {
            return this.connectionNotificationArn;
        }

        @Override
        public final java.lang.String getVpcEndpointId() {
            return this.vpcEndpointId;
        }

        @Override
        public final java.lang.String getVpcEndpointServiceId() {
            return this.vpcEndpointServiceId;
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

            data.set("connectionEvents", om.valueToTree(this.getConnectionEvents()));
            data.set("connectionNotificationArn", om.valueToTree(this.getConnectionNotificationArn()));
            if (this.getVpcEndpointId() != null) {
                data.set("vpcEndpointId", om.valueToTree(this.getVpcEndpointId()));
            }
            if (this.getVpcEndpointServiceId() != null) {
                data.set("vpcEndpointServiceId", om.valueToTree(this.getVpcEndpointServiceId()));
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
            struct.set("fqn", om.valueToTree("aws.VpcEndpointConnectionNotificationConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            VpcEndpointConnectionNotificationConfig.Jsii$Proxy that = (VpcEndpointConnectionNotificationConfig.Jsii$Proxy) o;

            if (!connectionEvents.equals(that.connectionEvents)) return false;
            if (!connectionNotificationArn.equals(that.connectionNotificationArn)) return false;
            if (this.vpcEndpointId != null ? !this.vpcEndpointId.equals(that.vpcEndpointId) : that.vpcEndpointId != null) return false;
            if (this.vpcEndpointServiceId != null ? !this.vpcEndpointServiceId.equals(that.vpcEndpointServiceId) : that.vpcEndpointServiceId != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.connectionEvents.hashCode();
            result = 31 * result + (this.connectionNotificationArn.hashCode());
            result = 31 * result + (this.vpcEndpointId != null ? this.vpcEndpointId.hashCode() : 0);
            result = 31 * result + (this.vpcEndpointServiceId != null ? this.vpcEndpointServiceId.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
