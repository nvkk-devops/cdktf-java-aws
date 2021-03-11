package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.190Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CognitoIdentityPoolRolesAttachmentRoleMapping")
@software.amazon.jsii.Jsii.Proxy(CognitoIdentityPoolRolesAttachmentRoleMapping.Jsii$Proxy.class)
public interface CognitoIdentityPoolRolesAttachmentRoleMapping extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getIdentityProvider();

    @org.jetbrains.annotations.NotNull java.lang.String getType();

    default @org.jetbrains.annotations.Nullable java.lang.String getAmbiguousRoleResolution() {
        return null;
    }

    /**
     * mapping_rule block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CognitoIdentityPoolRolesAttachmentRoleMappingMappingRule> getMappingRule() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CognitoIdentityPoolRolesAttachmentRoleMapping}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CognitoIdentityPoolRolesAttachmentRoleMapping}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CognitoIdentityPoolRolesAttachmentRoleMapping> {
        private java.lang.String identityProvider;
        private java.lang.String type;
        private java.lang.String ambiguousRoleResolution;
        private java.util.List<imports.aws.CognitoIdentityPoolRolesAttachmentRoleMappingMappingRule> mappingRule;

        /**
         * Sets the value of {@link CognitoIdentityPoolRolesAttachmentRoleMapping#getIdentityProvider}
         * @param identityProvider the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder identityProvider(java.lang.String identityProvider) {
            this.identityProvider = identityProvider;
            return this;
        }

        /**
         * Sets the value of {@link CognitoIdentityPoolRolesAttachmentRoleMapping#getType}
         * @param type the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link CognitoIdentityPoolRolesAttachmentRoleMapping#getAmbiguousRoleResolution}
         * @param ambiguousRoleResolution the value to be set.
         * @return {@code this}
         */
        public Builder ambiguousRoleResolution(java.lang.String ambiguousRoleResolution) {
            this.ambiguousRoleResolution = ambiguousRoleResolution;
            return this;
        }

        /**
         * Sets the value of {@link CognitoIdentityPoolRolesAttachmentRoleMapping#getMappingRule}
         * @param mappingRule mapping_rule block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder mappingRule(java.util.List<? extends imports.aws.CognitoIdentityPoolRolesAttachmentRoleMappingMappingRule> mappingRule) {
            this.mappingRule = (java.util.List<imports.aws.CognitoIdentityPoolRolesAttachmentRoleMappingMappingRule>)mappingRule;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CognitoIdentityPoolRolesAttachmentRoleMapping}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CognitoIdentityPoolRolesAttachmentRoleMapping build() {
            return new Jsii$Proxy(identityProvider, type, ambiguousRoleResolution, mappingRule);
        }
    }

    /**
     * An implementation for {@link CognitoIdentityPoolRolesAttachmentRoleMapping}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CognitoIdentityPoolRolesAttachmentRoleMapping {
        private final java.lang.String identityProvider;
        private final java.lang.String type;
        private final java.lang.String ambiguousRoleResolution;
        private final java.util.List<imports.aws.CognitoIdentityPoolRolesAttachmentRoleMappingMappingRule> mappingRule;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.identityProvider = software.amazon.jsii.Kernel.get(this, "identityProvider", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.ambiguousRoleResolution = software.amazon.jsii.Kernel.get(this, "ambiguousRoleResolution", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.mappingRule = software.amazon.jsii.Kernel.get(this, "mappingRule", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CognitoIdentityPoolRolesAttachmentRoleMappingMappingRule.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String identityProvider, final java.lang.String type, final java.lang.String ambiguousRoleResolution, final java.util.List<? extends imports.aws.CognitoIdentityPoolRolesAttachmentRoleMappingMappingRule> mappingRule) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.identityProvider = java.util.Objects.requireNonNull(identityProvider, "identityProvider is required");
            this.type = java.util.Objects.requireNonNull(type, "type is required");
            this.ambiguousRoleResolution = ambiguousRoleResolution;
            this.mappingRule = (java.util.List<imports.aws.CognitoIdentityPoolRolesAttachmentRoleMappingMappingRule>)mappingRule;
        }

        @Override
        public final java.lang.String getIdentityProvider() {
            return this.identityProvider;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        public final java.lang.String getAmbiguousRoleResolution() {
            return this.ambiguousRoleResolution;
        }

        @Override
        public final java.util.List<imports.aws.CognitoIdentityPoolRolesAttachmentRoleMappingMappingRule> getMappingRule() {
            return this.mappingRule;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("identityProvider", om.valueToTree(this.getIdentityProvider()));
            data.set("type", om.valueToTree(this.getType()));
            if (this.getAmbiguousRoleResolution() != null) {
                data.set("ambiguousRoleResolution", om.valueToTree(this.getAmbiguousRoleResolution()));
            }
            if (this.getMappingRule() != null) {
                data.set("mappingRule", om.valueToTree(this.getMappingRule()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.CognitoIdentityPoolRolesAttachmentRoleMapping"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CognitoIdentityPoolRolesAttachmentRoleMapping.Jsii$Proxy that = (CognitoIdentityPoolRolesAttachmentRoleMapping.Jsii$Proxy) o;

            if (!identityProvider.equals(that.identityProvider)) return false;
            if (!type.equals(that.type)) return false;
            if (this.ambiguousRoleResolution != null ? !this.ambiguousRoleResolution.equals(that.ambiguousRoleResolution) : that.ambiguousRoleResolution != null) return false;
            return this.mappingRule != null ? this.mappingRule.equals(that.mappingRule) : that.mappingRule == null;
        }

        @Override
        public final int hashCode() {
            int result = this.identityProvider.hashCode();
            result = 31 * result + (this.type.hashCode());
            result = 31 * result + (this.ambiguousRoleResolution != null ? this.ambiguousRoleResolution.hashCode() : 0);
            result = 31 * result + (this.mappingRule != null ? this.mappingRule.hashCode() : 0);
            return result;
        }
    }
}
