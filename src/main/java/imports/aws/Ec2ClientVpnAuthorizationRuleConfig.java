package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.484Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Ec2ClientVpnAuthorizationRuleConfig")
@software.amazon.jsii.Jsii.Proxy(Ec2ClientVpnAuthorizationRuleConfig.Jsii$Proxy.class)
public interface Ec2ClientVpnAuthorizationRuleConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getClientVpnEndpointId();

    @org.jetbrains.annotations.NotNull java.lang.String getTargetNetworkCidr();

    default @org.jetbrains.annotations.Nullable java.lang.String getAccessGroupId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAuthorizeAllGroups() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Ec2ClientVpnAuthorizationRuleConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Ec2ClientVpnAuthorizationRuleConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Ec2ClientVpnAuthorizationRuleConfig> {
        private java.lang.String clientVpnEndpointId;
        private java.lang.String targetNetworkCidr;
        private java.lang.String accessGroupId;
        private java.lang.Boolean authorizeAllGroups;
        private java.lang.String description;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link Ec2ClientVpnAuthorizationRuleConfig#getClientVpnEndpointId}
         * @param clientVpnEndpointId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder clientVpnEndpointId(java.lang.String clientVpnEndpointId) {
            this.clientVpnEndpointId = clientVpnEndpointId;
            return this;
        }

        /**
         * Sets the value of {@link Ec2ClientVpnAuthorizationRuleConfig#getTargetNetworkCidr}
         * @param targetNetworkCidr the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder targetNetworkCidr(java.lang.String targetNetworkCidr) {
            this.targetNetworkCidr = targetNetworkCidr;
            return this;
        }

        /**
         * Sets the value of {@link Ec2ClientVpnAuthorizationRuleConfig#getAccessGroupId}
         * @param accessGroupId the value to be set.
         * @return {@code this}
         */
        public Builder accessGroupId(java.lang.String accessGroupId) {
            this.accessGroupId = accessGroupId;
            return this;
        }

        /**
         * Sets the value of {@link Ec2ClientVpnAuthorizationRuleConfig#getAuthorizeAllGroups}
         * @param authorizeAllGroups the value to be set.
         * @return {@code this}
         */
        public Builder authorizeAllGroups(java.lang.Boolean authorizeAllGroups) {
            this.authorizeAllGroups = authorizeAllGroups;
            return this;
        }

        /**
         * Sets the value of {@link Ec2ClientVpnAuthorizationRuleConfig#getDescription}
         * @param description the value to be set.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link Ec2ClientVpnAuthorizationRuleConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link Ec2ClientVpnAuthorizationRuleConfig#getDependsOn}
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
         * Sets the value of {@link Ec2ClientVpnAuthorizationRuleConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link Ec2ClientVpnAuthorizationRuleConfig#getProvider}
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
         * @return a new instance of {@link Ec2ClientVpnAuthorizationRuleConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Ec2ClientVpnAuthorizationRuleConfig build() {
            return new Jsii$Proxy(clientVpnEndpointId, targetNetworkCidr, accessGroupId, authorizeAllGroups, description, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link Ec2ClientVpnAuthorizationRuleConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Ec2ClientVpnAuthorizationRuleConfig {
        private final java.lang.String clientVpnEndpointId;
        private final java.lang.String targetNetworkCidr;
        private final java.lang.String accessGroupId;
        private final java.lang.Boolean authorizeAllGroups;
        private final java.lang.String description;
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
            this.clientVpnEndpointId = software.amazon.jsii.Kernel.get(this, "clientVpnEndpointId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.targetNetworkCidr = software.amazon.jsii.Kernel.get(this, "targetNetworkCidr", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.accessGroupId = software.amazon.jsii.Kernel.get(this, "accessGroupId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.authorizeAllGroups = software.amazon.jsii.Kernel.get(this, "authorizeAllGroups", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String clientVpnEndpointId, final java.lang.String targetNetworkCidr, final java.lang.String accessGroupId, final java.lang.Boolean authorizeAllGroups, final java.lang.String description, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.clientVpnEndpointId = java.util.Objects.requireNonNull(clientVpnEndpointId, "clientVpnEndpointId is required");
            this.targetNetworkCidr = java.util.Objects.requireNonNull(targetNetworkCidr, "targetNetworkCidr is required");
            this.accessGroupId = accessGroupId;
            this.authorizeAllGroups = authorizeAllGroups;
            this.description = description;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getClientVpnEndpointId() {
            return this.clientVpnEndpointId;
        }

        @Override
        public final java.lang.String getTargetNetworkCidr() {
            return this.targetNetworkCidr;
        }

        @Override
        public final java.lang.String getAccessGroupId() {
            return this.accessGroupId;
        }

        @Override
        public final java.lang.Boolean getAuthorizeAllGroups() {
            return this.authorizeAllGroups;
        }

        @Override
        public final java.lang.String getDescription() {
            return this.description;
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

            data.set("clientVpnEndpointId", om.valueToTree(this.getClientVpnEndpointId()));
            data.set("targetNetworkCidr", om.valueToTree(this.getTargetNetworkCidr()));
            if (this.getAccessGroupId() != null) {
                data.set("accessGroupId", om.valueToTree(this.getAccessGroupId()));
            }
            if (this.getAuthorizeAllGroups() != null) {
                data.set("authorizeAllGroups", om.valueToTree(this.getAuthorizeAllGroups()));
            }
            if (this.getDescription() != null) {
                data.set("description", om.valueToTree(this.getDescription()));
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
            struct.set("fqn", om.valueToTree("aws.Ec2ClientVpnAuthorizationRuleConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Ec2ClientVpnAuthorizationRuleConfig.Jsii$Proxy that = (Ec2ClientVpnAuthorizationRuleConfig.Jsii$Proxy) o;

            if (!clientVpnEndpointId.equals(that.clientVpnEndpointId)) return false;
            if (!targetNetworkCidr.equals(that.targetNetworkCidr)) return false;
            if (this.accessGroupId != null ? !this.accessGroupId.equals(that.accessGroupId) : that.accessGroupId != null) return false;
            if (this.authorizeAllGroups != null ? !this.authorizeAllGroups.equals(that.authorizeAllGroups) : that.authorizeAllGroups != null) return false;
            if (this.description != null ? !this.description.equals(that.description) : that.description != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.clientVpnEndpointId.hashCode();
            result = 31 * result + (this.targetNetworkCidr.hashCode());
            result = 31 * result + (this.accessGroupId != null ? this.accessGroupId.hashCode() : 0);
            result = 31 * result + (this.authorizeAllGroups != null ? this.authorizeAllGroups.hashCode() : 0);
            result = 31 * result + (this.description != null ? this.description.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
