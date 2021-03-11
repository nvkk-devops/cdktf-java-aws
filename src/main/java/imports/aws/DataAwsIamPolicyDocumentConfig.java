package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.310Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.DataAwsIamPolicyDocumentConfig")
@software.amazon.jsii.Jsii.Proxy(DataAwsIamPolicyDocumentConfig.Jsii$Proxy.class)
public interface DataAwsIamPolicyDocumentConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    default @org.jetbrains.annotations.Nullable java.lang.String getOverrideJson() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPolicyId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSourceJson() {
        return null;
    }

    /**
     * statement block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.DataAwsIamPolicyDocumentStatement> getStatement() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getVersion() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DataAwsIamPolicyDocumentConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DataAwsIamPolicyDocumentConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DataAwsIamPolicyDocumentConfig> {
        private java.lang.String overrideJson;
        private java.lang.String policyId;
        private java.lang.String sourceJson;
        private java.util.List<imports.aws.DataAwsIamPolicyDocumentStatement> statement;
        private java.lang.String version;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link DataAwsIamPolicyDocumentConfig#getOverrideJson}
         * @param overrideJson the value to be set.
         * @return {@code this}
         */
        public Builder overrideJson(java.lang.String overrideJson) {
            this.overrideJson = overrideJson;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsIamPolicyDocumentConfig#getPolicyId}
         * @param policyId the value to be set.
         * @return {@code this}
         */
        public Builder policyId(java.lang.String policyId) {
            this.policyId = policyId;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsIamPolicyDocumentConfig#getSourceJson}
         * @param sourceJson the value to be set.
         * @return {@code this}
         */
        public Builder sourceJson(java.lang.String sourceJson) {
            this.sourceJson = sourceJson;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsIamPolicyDocumentConfig#getStatement}
         * @param statement statement block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder statement(java.util.List<? extends imports.aws.DataAwsIamPolicyDocumentStatement> statement) {
            this.statement = (java.util.List<imports.aws.DataAwsIamPolicyDocumentStatement>)statement;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsIamPolicyDocumentConfig#getVersion}
         * @param version the value to be set.
         * @return {@code this}
         */
        public Builder version(java.lang.String version) {
            this.version = version;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsIamPolicyDocumentConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsIamPolicyDocumentConfig#getDependsOn}
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
         * Sets the value of {@link DataAwsIamPolicyDocumentConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsIamPolicyDocumentConfig#getProvider}
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
         * @return a new instance of {@link DataAwsIamPolicyDocumentConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DataAwsIamPolicyDocumentConfig build() {
            return new Jsii$Proxy(overrideJson, policyId, sourceJson, statement, version, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link DataAwsIamPolicyDocumentConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DataAwsIamPolicyDocumentConfig {
        private final java.lang.String overrideJson;
        private final java.lang.String policyId;
        private final java.lang.String sourceJson;
        private final java.util.List<imports.aws.DataAwsIamPolicyDocumentStatement> statement;
        private final java.lang.String version;
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
            this.overrideJson = software.amazon.jsii.Kernel.get(this, "overrideJson", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.policyId = software.amazon.jsii.Kernel.get(this, "policyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.sourceJson = software.amazon.jsii.Kernel.get(this, "sourceJson", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.statement = software.amazon.jsii.Kernel.get(this, "statement", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DataAwsIamPolicyDocumentStatement.class)));
            this.version = software.amazon.jsii.Kernel.get(this, "version", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String overrideJson, final java.lang.String policyId, final java.lang.String sourceJson, final java.util.List<? extends imports.aws.DataAwsIamPolicyDocumentStatement> statement, final java.lang.String version, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.overrideJson = overrideJson;
            this.policyId = policyId;
            this.sourceJson = sourceJson;
            this.statement = (java.util.List<imports.aws.DataAwsIamPolicyDocumentStatement>)statement;
            this.version = version;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getOverrideJson() {
            return this.overrideJson;
        }

        @Override
        public final java.lang.String getPolicyId() {
            return this.policyId;
        }

        @Override
        public final java.lang.String getSourceJson() {
            return this.sourceJson;
        }

        @Override
        public final java.util.List<imports.aws.DataAwsIamPolicyDocumentStatement> getStatement() {
            return this.statement;
        }

        @Override
        public final java.lang.String getVersion() {
            return this.version;
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

            if (this.getOverrideJson() != null) {
                data.set("overrideJson", om.valueToTree(this.getOverrideJson()));
            }
            if (this.getPolicyId() != null) {
                data.set("policyId", om.valueToTree(this.getPolicyId()));
            }
            if (this.getSourceJson() != null) {
                data.set("sourceJson", om.valueToTree(this.getSourceJson()));
            }
            if (this.getStatement() != null) {
                data.set("statement", om.valueToTree(this.getStatement()));
            }
            if (this.getVersion() != null) {
                data.set("version", om.valueToTree(this.getVersion()));
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
            struct.set("fqn", om.valueToTree("aws.DataAwsIamPolicyDocumentConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DataAwsIamPolicyDocumentConfig.Jsii$Proxy that = (DataAwsIamPolicyDocumentConfig.Jsii$Proxy) o;

            if (this.overrideJson != null ? !this.overrideJson.equals(that.overrideJson) : that.overrideJson != null) return false;
            if (this.policyId != null ? !this.policyId.equals(that.policyId) : that.policyId != null) return false;
            if (this.sourceJson != null ? !this.sourceJson.equals(that.sourceJson) : that.sourceJson != null) return false;
            if (this.statement != null ? !this.statement.equals(that.statement) : that.statement != null) return false;
            if (this.version != null ? !this.version.equals(that.version) : that.version != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.overrideJson != null ? this.overrideJson.hashCode() : 0;
            result = 31 * result + (this.policyId != null ? this.policyId.hashCode() : 0);
            result = 31 * result + (this.sourceJson != null ? this.sourceJson.hashCode() : 0);
            result = 31 * result + (this.statement != null ? this.statement.hashCode() : 0);
            result = 31 * result + (this.version != null ? this.version.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
