package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.191Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CognitoIdentityProviderConfig")
@software.amazon.jsii.Jsii.Proxy(CognitoIdentityProviderConfig.Jsii$Proxy.class)
public interface CognitoIdentityProviderConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getProviderDetails();

    @org.jetbrains.annotations.NotNull java.lang.String getProviderName();

    @org.jetbrains.annotations.NotNull java.lang.String getProviderType();

    @org.jetbrains.annotations.NotNull java.lang.String getUserPoolId();

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getAttributeMapping() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getIdpIdentifiers() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CognitoIdentityProviderConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CognitoIdentityProviderConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CognitoIdentityProviderConfig> {
        private java.util.Map<java.lang.String, java.lang.String> providerDetails;
        private java.lang.String providerName;
        private java.lang.String providerType;
        private java.lang.String userPoolId;
        private java.util.Map<java.lang.String, java.lang.String> attributeMapping;
        private java.util.List<java.lang.String> idpIdentifiers;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link CognitoIdentityProviderConfig#getProviderDetails}
         * @param providerDetails the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder providerDetails(java.util.Map<java.lang.String, java.lang.String> providerDetails) {
            this.providerDetails = providerDetails;
            return this;
        }

        /**
         * Sets the value of {@link CognitoIdentityProviderConfig#getProviderName}
         * @param providerName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder providerName(java.lang.String providerName) {
            this.providerName = providerName;
            return this;
        }

        /**
         * Sets the value of {@link CognitoIdentityProviderConfig#getProviderType}
         * @param providerType the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder providerType(java.lang.String providerType) {
            this.providerType = providerType;
            return this;
        }

        /**
         * Sets the value of {@link CognitoIdentityProviderConfig#getUserPoolId}
         * @param userPoolId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder userPoolId(java.lang.String userPoolId) {
            this.userPoolId = userPoolId;
            return this;
        }

        /**
         * Sets the value of {@link CognitoIdentityProviderConfig#getAttributeMapping}
         * @param attributeMapping the value to be set.
         * @return {@code this}
         */
        public Builder attributeMapping(java.util.Map<java.lang.String, java.lang.String> attributeMapping) {
            this.attributeMapping = attributeMapping;
            return this;
        }

        /**
         * Sets the value of {@link CognitoIdentityProviderConfig#getIdpIdentifiers}
         * @param idpIdentifiers the value to be set.
         * @return {@code this}
         */
        public Builder idpIdentifiers(java.util.List<java.lang.String> idpIdentifiers) {
            this.idpIdentifiers = idpIdentifiers;
            return this;
        }

        /**
         * Sets the value of {@link CognitoIdentityProviderConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link CognitoIdentityProviderConfig#getDependsOn}
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
         * Sets the value of {@link CognitoIdentityProviderConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link CognitoIdentityProviderConfig#getProvider}
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
         * @return a new instance of {@link CognitoIdentityProviderConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CognitoIdentityProviderConfig build() {
            return new Jsii$Proxy(providerDetails, providerName, providerType, userPoolId, attributeMapping, idpIdentifiers, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link CognitoIdentityProviderConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CognitoIdentityProviderConfig {
        private final java.util.Map<java.lang.String, java.lang.String> providerDetails;
        private final java.lang.String providerName;
        private final java.lang.String providerType;
        private final java.lang.String userPoolId;
        private final java.util.Map<java.lang.String, java.lang.String> attributeMapping;
        private final java.util.List<java.lang.String> idpIdentifiers;
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
            this.providerDetails = software.amazon.jsii.Kernel.get(this, "providerDetails", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.providerName = software.amazon.jsii.Kernel.get(this, "providerName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.providerType = software.amazon.jsii.Kernel.get(this, "providerType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.userPoolId = software.amazon.jsii.Kernel.get(this, "userPoolId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.attributeMapping = software.amazon.jsii.Kernel.get(this, "attributeMapping", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.idpIdentifiers = software.amazon.jsii.Kernel.get(this, "idpIdentifiers", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.Map<java.lang.String, java.lang.String> providerDetails, final java.lang.String providerName, final java.lang.String providerType, final java.lang.String userPoolId, final java.util.Map<java.lang.String, java.lang.String> attributeMapping, final java.util.List<java.lang.String> idpIdentifiers, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.providerDetails = java.util.Objects.requireNonNull(providerDetails, "providerDetails is required");
            this.providerName = java.util.Objects.requireNonNull(providerName, "providerName is required");
            this.providerType = java.util.Objects.requireNonNull(providerType, "providerType is required");
            this.userPoolId = java.util.Objects.requireNonNull(userPoolId, "userPoolId is required");
            this.attributeMapping = attributeMapping;
            this.idpIdentifiers = idpIdentifiers;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getProviderDetails() {
            return this.providerDetails;
        }

        @Override
        public final java.lang.String getProviderName() {
            return this.providerName;
        }

        @Override
        public final java.lang.String getProviderType() {
            return this.providerType;
        }

        @Override
        public final java.lang.String getUserPoolId() {
            return this.userPoolId;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getAttributeMapping() {
            return this.attributeMapping;
        }

        @Override
        public final java.util.List<java.lang.String> getIdpIdentifiers() {
            return this.idpIdentifiers;
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

            data.set("providerDetails", om.valueToTree(this.getProviderDetails()));
            data.set("providerName", om.valueToTree(this.getProviderName()));
            data.set("providerType", om.valueToTree(this.getProviderType()));
            data.set("userPoolId", om.valueToTree(this.getUserPoolId()));
            if (this.getAttributeMapping() != null) {
                data.set("attributeMapping", om.valueToTree(this.getAttributeMapping()));
            }
            if (this.getIdpIdentifiers() != null) {
                data.set("idpIdentifiers", om.valueToTree(this.getIdpIdentifiers()));
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
            struct.set("fqn", om.valueToTree("aws.CognitoIdentityProviderConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CognitoIdentityProviderConfig.Jsii$Proxy that = (CognitoIdentityProviderConfig.Jsii$Proxy) o;

            if (!providerDetails.equals(that.providerDetails)) return false;
            if (!providerName.equals(that.providerName)) return false;
            if (!providerType.equals(that.providerType)) return false;
            if (!userPoolId.equals(that.userPoolId)) return false;
            if (this.attributeMapping != null ? !this.attributeMapping.equals(that.attributeMapping) : that.attributeMapping != null) return false;
            if (this.idpIdentifiers != null ? !this.idpIdentifiers.equals(that.idpIdentifiers) : that.idpIdentifiers != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.providerDetails.hashCode();
            result = 31 * result + (this.providerName.hashCode());
            result = 31 * result + (this.providerType.hashCode());
            result = 31 * result + (this.userPoolId.hashCode());
            result = 31 * result + (this.attributeMapping != null ? this.attributeMapping.hashCode() : 0);
            result = 31 * result + (this.idpIdentifiers != null ? this.idpIdentifiers.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
