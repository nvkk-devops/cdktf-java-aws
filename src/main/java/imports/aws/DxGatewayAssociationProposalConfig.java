package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.457Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.DxGatewayAssociationProposalConfig")
@software.amazon.jsii.Jsii.Proxy(DxGatewayAssociationProposalConfig.Jsii$Proxy.class)
public interface DxGatewayAssociationProposalConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getDxGatewayId();

    @org.jetbrains.annotations.NotNull java.lang.String getDxGatewayOwnerAccountId();

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAllowedPrefixes() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getAssociatedGatewayId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getVpnGatewayId() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DxGatewayAssociationProposalConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DxGatewayAssociationProposalConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DxGatewayAssociationProposalConfig> {
        private java.lang.String dxGatewayId;
        private java.lang.String dxGatewayOwnerAccountId;
        private java.util.List<java.lang.String> allowedPrefixes;
        private java.lang.String associatedGatewayId;
        private java.lang.String vpnGatewayId;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link DxGatewayAssociationProposalConfig#getDxGatewayId}
         * @param dxGatewayId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder dxGatewayId(java.lang.String dxGatewayId) {
            this.dxGatewayId = dxGatewayId;
            return this;
        }

        /**
         * Sets the value of {@link DxGatewayAssociationProposalConfig#getDxGatewayOwnerAccountId}
         * @param dxGatewayOwnerAccountId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder dxGatewayOwnerAccountId(java.lang.String dxGatewayOwnerAccountId) {
            this.dxGatewayOwnerAccountId = dxGatewayOwnerAccountId;
            return this;
        }

        /**
         * Sets the value of {@link DxGatewayAssociationProposalConfig#getAllowedPrefixes}
         * @param allowedPrefixes the value to be set.
         * @return {@code this}
         */
        public Builder allowedPrefixes(java.util.List<java.lang.String> allowedPrefixes) {
            this.allowedPrefixes = allowedPrefixes;
            return this;
        }

        /**
         * Sets the value of {@link DxGatewayAssociationProposalConfig#getAssociatedGatewayId}
         * @param associatedGatewayId the value to be set.
         * @return {@code this}
         */
        public Builder associatedGatewayId(java.lang.String associatedGatewayId) {
            this.associatedGatewayId = associatedGatewayId;
            return this;
        }

        /**
         * Sets the value of {@link DxGatewayAssociationProposalConfig#getVpnGatewayId}
         * @param vpnGatewayId the value to be set.
         * @return {@code this}
         */
        public Builder vpnGatewayId(java.lang.String vpnGatewayId) {
            this.vpnGatewayId = vpnGatewayId;
            return this;
        }

        /**
         * Sets the value of {@link DxGatewayAssociationProposalConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link DxGatewayAssociationProposalConfig#getDependsOn}
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
         * Sets the value of {@link DxGatewayAssociationProposalConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link DxGatewayAssociationProposalConfig#getProvider}
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
         * @return a new instance of {@link DxGatewayAssociationProposalConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DxGatewayAssociationProposalConfig build() {
            return new Jsii$Proxy(dxGatewayId, dxGatewayOwnerAccountId, allowedPrefixes, associatedGatewayId, vpnGatewayId, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link DxGatewayAssociationProposalConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DxGatewayAssociationProposalConfig {
        private final java.lang.String dxGatewayId;
        private final java.lang.String dxGatewayOwnerAccountId;
        private final java.util.List<java.lang.String> allowedPrefixes;
        private final java.lang.String associatedGatewayId;
        private final java.lang.String vpnGatewayId;
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
            this.dxGatewayId = software.amazon.jsii.Kernel.get(this, "dxGatewayId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.dxGatewayOwnerAccountId = software.amazon.jsii.Kernel.get(this, "dxGatewayOwnerAccountId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.allowedPrefixes = software.amazon.jsii.Kernel.get(this, "allowedPrefixes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.associatedGatewayId = software.amazon.jsii.Kernel.get(this, "associatedGatewayId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.vpnGatewayId = software.amazon.jsii.Kernel.get(this, "vpnGatewayId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String dxGatewayId, final java.lang.String dxGatewayOwnerAccountId, final java.util.List<java.lang.String> allowedPrefixes, final java.lang.String associatedGatewayId, final java.lang.String vpnGatewayId, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.dxGatewayId = java.util.Objects.requireNonNull(dxGatewayId, "dxGatewayId is required");
            this.dxGatewayOwnerAccountId = java.util.Objects.requireNonNull(dxGatewayOwnerAccountId, "dxGatewayOwnerAccountId is required");
            this.allowedPrefixes = allowedPrefixes;
            this.associatedGatewayId = associatedGatewayId;
            this.vpnGatewayId = vpnGatewayId;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getDxGatewayId() {
            return this.dxGatewayId;
        }

        @Override
        public final java.lang.String getDxGatewayOwnerAccountId() {
            return this.dxGatewayOwnerAccountId;
        }

        @Override
        public final java.util.List<java.lang.String> getAllowedPrefixes() {
            return this.allowedPrefixes;
        }

        @Override
        public final java.lang.String getAssociatedGatewayId() {
            return this.associatedGatewayId;
        }

        @Override
        public final java.lang.String getVpnGatewayId() {
            return this.vpnGatewayId;
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

            data.set("dxGatewayId", om.valueToTree(this.getDxGatewayId()));
            data.set("dxGatewayOwnerAccountId", om.valueToTree(this.getDxGatewayOwnerAccountId()));
            if (this.getAllowedPrefixes() != null) {
                data.set("allowedPrefixes", om.valueToTree(this.getAllowedPrefixes()));
            }
            if (this.getAssociatedGatewayId() != null) {
                data.set("associatedGatewayId", om.valueToTree(this.getAssociatedGatewayId()));
            }
            if (this.getVpnGatewayId() != null) {
                data.set("vpnGatewayId", om.valueToTree(this.getVpnGatewayId()));
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
            struct.set("fqn", om.valueToTree("aws.DxGatewayAssociationProposalConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DxGatewayAssociationProposalConfig.Jsii$Proxy that = (DxGatewayAssociationProposalConfig.Jsii$Proxy) o;

            if (!dxGatewayId.equals(that.dxGatewayId)) return false;
            if (!dxGatewayOwnerAccountId.equals(that.dxGatewayOwnerAccountId)) return false;
            if (this.allowedPrefixes != null ? !this.allowedPrefixes.equals(that.allowedPrefixes) : that.allowedPrefixes != null) return false;
            if (this.associatedGatewayId != null ? !this.associatedGatewayId.equals(that.associatedGatewayId) : that.associatedGatewayId != null) return false;
            if (this.vpnGatewayId != null ? !this.vpnGatewayId.equals(that.vpnGatewayId) : that.vpnGatewayId != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.dxGatewayId.hashCode();
            result = 31 * result + (this.dxGatewayOwnerAccountId.hashCode());
            result = 31 * result + (this.allowedPrefixes != null ? this.allowedPrefixes.hashCode() : 0);
            result = 31 * result + (this.associatedGatewayId != null ? this.associatedGatewayId.hashCode() : 0);
            result = 31 * result + (this.vpnGatewayId != null ? this.vpnGatewayId.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
