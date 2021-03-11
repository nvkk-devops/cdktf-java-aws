package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.552Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.ElasticsearchDomainAdvancedSecurityOptions")
@software.amazon.jsii.Jsii.Proxy(ElasticsearchDomainAdvancedSecurityOptions.Jsii$Proxy.class)
public interface ElasticsearchDomainAdvancedSecurityOptions extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.Boolean getEnabled();

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getInternalUserDatabaseEnabled() {
        return null;
    }

    /**
     * master_user_options block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ElasticsearchDomainAdvancedSecurityOptionsMasterUserOptions> getMasterUserOptions() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ElasticsearchDomainAdvancedSecurityOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ElasticsearchDomainAdvancedSecurityOptions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ElasticsearchDomainAdvancedSecurityOptions> {
        private java.lang.Boolean enabled;
        private java.lang.Boolean internalUserDatabaseEnabled;
        private java.util.List<imports.aws.ElasticsearchDomainAdvancedSecurityOptionsMasterUserOptions> masterUserOptions;

        /**
         * Sets the value of {@link ElasticsearchDomainAdvancedSecurityOptions#getEnabled}
         * @param enabled the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder enabled(java.lang.Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchDomainAdvancedSecurityOptions#getInternalUserDatabaseEnabled}
         * @param internalUserDatabaseEnabled the value to be set.
         * @return {@code this}
         */
        public Builder internalUserDatabaseEnabled(java.lang.Boolean internalUserDatabaseEnabled) {
            this.internalUserDatabaseEnabled = internalUserDatabaseEnabled;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchDomainAdvancedSecurityOptions#getMasterUserOptions}
         * @param masterUserOptions master_user_options block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder masterUserOptions(java.util.List<? extends imports.aws.ElasticsearchDomainAdvancedSecurityOptionsMasterUserOptions> masterUserOptions) {
            this.masterUserOptions = (java.util.List<imports.aws.ElasticsearchDomainAdvancedSecurityOptionsMasterUserOptions>)masterUserOptions;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ElasticsearchDomainAdvancedSecurityOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ElasticsearchDomainAdvancedSecurityOptions build() {
            return new Jsii$Proxy(enabled, internalUserDatabaseEnabled, masterUserOptions);
        }
    }

    /**
     * An implementation for {@link ElasticsearchDomainAdvancedSecurityOptions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ElasticsearchDomainAdvancedSecurityOptions {
        private final java.lang.Boolean enabled;
        private final java.lang.Boolean internalUserDatabaseEnabled;
        private final java.util.List<imports.aws.ElasticsearchDomainAdvancedSecurityOptionsMasterUserOptions> masterUserOptions;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.enabled = software.amazon.jsii.Kernel.get(this, "enabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.internalUserDatabaseEnabled = software.amazon.jsii.Kernel.get(this, "internalUserDatabaseEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.masterUserOptions = software.amazon.jsii.Kernel.get(this, "masterUserOptions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElasticsearchDomainAdvancedSecurityOptionsMasterUserOptions.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.Boolean enabled, final java.lang.Boolean internalUserDatabaseEnabled, final java.util.List<? extends imports.aws.ElasticsearchDomainAdvancedSecurityOptionsMasterUserOptions> masterUserOptions) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.enabled = java.util.Objects.requireNonNull(enabled, "enabled is required");
            this.internalUserDatabaseEnabled = internalUserDatabaseEnabled;
            this.masterUserOptions = (java.util.List<imports.aws.ElasticsearchDomainAdvancedSecurityOptionsMasterUserOptions>)masterUserOptions;
        }

        @Override
        public final java.lang.Boolean getEnabled() {
            return this.enabled;
        }

        @Override
        public final java.lang.Boolean getInternalUserDatabaseEnabled() {
            return this.internalUserDatabaseEnabled;
        }

        @Override
        public final java.util.List<imports.aws.ElasticsearchDomainAdvancedSecurityOptionsMasterUserOptions> getMasterUserOptions() {
            return this.masterUserOptions;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("enabled", om.valueToTree(this.getEnabled()));
            if (this.getInternalUserDatabaseEnabled() != null) {
                data.set("internalUserDatabaseEnabled", om.valueToTree(this.getInternalUserDatabaseEnabled()));
            }
            if (this.getMasterUserOptions() != null) {
                data.set("masterUserOptions", om.valueToTree(this.getMasterUserOptions()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.ElasticsearchDomainAdvancedSecurityOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ElasticsearchDomainAdvancedSecurityOptions.Jsii$Proxy that = (ElasticsearchDomainAdvancedSecurityOptions.Jsii$Proxy) o;

            if (!enabled.equals(that.enabled)) return false;
            if (this.internalUserDatabaseEnabled != null ? !this.internalUserDatabaseEnabled.equals(that.internalUserDatabaseEnabled) : that.internalUserDatabaseEnabled != null) return false;
            return this.masterUserOptions != null ? this.masterUserOptions.equals(that.masterUserOptions) : that.masterUserOptions == null;
        }

        @Override
        public final int hashCode() {
            int result = this.enabled.hashCode();
            result = 31 * result + (this.internalUserDatabaseEnabled != null ? this.internalUserDatabaseEnabled.hashCode() : 0);
            result = 31 * result + (this.masterUserOptions != null ? this.masterUserOptions.hashCode() : 0);
            return result;
        }
    }
}
