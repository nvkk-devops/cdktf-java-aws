package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.922Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.VpcPeeringConnectionOptionsConfig")
@software.amazon.jsii.Jsii.Proxy(VpcPeeringConnectionOptionsConfig.Jsii$Proxy.class)
public interface VpcPeeringConnectionOptionsConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getVpcPeeringConnectionId();

    /**
     * accepter block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.VpcPeeringConnectionOptionsAccepter> getAccepter() {
        return null;
    }

    /**
     * requester block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.VpcPeeringConnectionOptionsRequester> getRequester() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link VpcPeeringConnectionOptionsConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link VpcPeeringConnectionOptionsConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<VpcPeeringConnectionOptionsConfig> {
        private java.lang.String vpcPeeringConnectionId;
        private java.util.List<imports.aws.VpcPeeringConnectionOptionsAccepter> accepter;
        private java.util.List<imports.aws.VpcPeeringConnectionOptionsRequester> requester;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link VpcPeeringConnectionOptionsConfig#getVpcPeeringConnectionId}
         * @param vpcPeeringConnectionId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder vpcPeeringConnectionId(java.lang.String vpcPeeringConnectionId) {
            this.vpcPeeringConnectionId = vpcPeeringConnectionId;
            return this;
        }

        /**
         * Sets the value of {@link VpcPeeringConnectionOptionsConfig#getAccepter}
         * @param accepter accepter block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder accepter(java.util.List<? extends imports.aws.VpcPeeringConnectionOptionsAccepter> accepter) {
            this.accepter = (java.util.List<imports.aws.VpcPeeringConnectionOptionsAccepter>)accepter;
            return this;
        }

        /**
         * Sets the value of {@link VpcPeeringConnectionOptionsConfig#getRequester}
         * @param requester requester block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder requester(java.util.List<? extends imports.aws.VpcPeeringConnectionOptionsRequester> requester) {
            this.requester = (java.util.List<imports.aws.VpcPeeringConnectionOptionsRequester>)requester;
            return this;
        }

        /**
         * Sets the value of {@link VpcPeeringConnectionOptionsConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link VpcPeeringConnectionOptionsConfig#getDependsOn}
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
         * Sets the value of {@link VpcPeeringConnectionOptionsConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link VpcPeeringConnectionOptionsConfig#getProvider}
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
         * @return a new instance of {@link VpcPeeringConnectionOptionsConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public VpcPeeringConnectionOptionsConfig build() {
            return new Jsii$Proxy(vpcPeeringConnectionId, accepter, requester, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link VpcPeeringConnectionOptionsConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements VpcPeeringConnectionOptionsConfig {
        private final java.lang.String vpcPeeringConnectionId;
        private final java.util.List<imports.aws.VpcPeeringConnectionOptionsAccepter> accepter;
        private final java.util.List<imports.aws.VpcPeeringConnectionOptionsRequester> requester;
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
            this.vpcPeeringConnectionId = software.amazon.jsii.Kernel.get(this, "vpcPeeringConnectionId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.accepter = software.amazon.jsii.Kernel.get(this, "accepter", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.VpcPeeringConnectionOptionsAccepter.class)));
            this.requester = software.amazon.jsii.Kernel.get(this, "requester", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.VpcPeeringConnectionOptionsRequester.class)));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String vpcPeeringConnectionId, final java.util.List<? extends imports.aws.VpcPeeringConnectionOptionsAccepter> accepter, final java.util.List<? extends imports.aws.VpcPeeringConnectionOptionsRequester> requester, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.vpcPeeringConnectionId = java.util.Objects.requireNonNull(vpcPeeringConnectionId, "vpcPeeringConnectionId is required");
            this.accepter = (java.util.List<imports.aws.VpcPeeringConnectionOptionsAccepter>)accepter;
            this.requester = (java.util.List<imports.aws.VpcPeeringConnectionOptionsRequester>)requester;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getVpcPeeringConnectionId() {
            return this.vpcPeeringConnectionId;
        }

        @Override
        public final java.util.List<imports.aws.VpcPeeringConnectionOptionsAccepter> getAccepter() {
            return this.accepter;
        }

        @Override
        public final java.util.List<imports.aws.VpcPeeringConnectionOptionsRequester> getRequester() {
            return this.requester;
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

            data.set("vpcPeeringConnectionId", om.valueToTree(this.getVpcPeeringConnectionId()));
            if (this.getAccepter() != null) {
                data.set("accepter", om.valueToTree(this.getAccepter()));
            }
            if (this.getRequester() != null) {
                data.set("requester", om.valueToTree(this.getRequester()));
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
            struct.set("fqn", om.valueToTree("aws.VpcPeeringConnectionOptionsConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            VpcPeeringConnectionOptionsConfig.Jsii$Proxy that = (VpcPeeringConnectionOptionsConfig.Jsii$Proxy) o;

            if (!vpcPeeringConnectionId.equals(that.vpcPeeringConnectionId)) return false;
            if (this.accepter != null ? !this.accepter.equals(that.accepter) : that.accepter != null) return false;
            if (this.requester != null ? !this.requester.equals(that.requester) : that.requester != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.vpcPeeringConnectionId.hashCode();
            result = 31 * result + (this.accepter != null ? this.accepter.hashCode() : 0);
            result = 31 * result + (this.requester != null ? this.requester.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
