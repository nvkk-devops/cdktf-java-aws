package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.678Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.LambdaPermissionConfig")
@software.amazon.jsii.Jsii.Proxy(LambdaPermissionConfig.Jsii$Proxy.class)
public interface LambdaPermissionConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getAction();

    @org.jetbrains.annotations.NotNull java.lang.String getFunctionName();

    @org.jetbrains.annotations.NotNull java.lang.String getPrincipal();

    default @org.jetbrains.annotations.Nullable java.lang.String getEventSourceToken() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getQualifier() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSourceAccount() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSourceArn() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getStatementId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getStatementIdPrefix() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link LambdaPermissionConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LambdaPermissionConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LambdaPermissionConfig> {
        private java.lang.String action;
        private java.lang.String functionName;
        private java.lang.String principal;
        private java.lang.String eventSourceToken;
        private java.lang.String qualifier;
        private java.lang.String sourceAccount;
        private java.lang.String sourceArn;
        private java.lang.String statementId;
        private java.lang.String statementIdPrefix;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link LambdaPermissionConfig#getAction}
         * @param action the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder action(java.lang.String action) {
            this.action = action;
            return this;
        }

        /**
         * Sets the value of {@link LambdaPermissionConfig#getFunctionName}
         * @param functionName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder functionName(java.lang.String functionName) {
            this.functionName = functionName;
            return this;
        }

        /**
         * Sets the value of {@link LambdaPermissionConfig#getPrincipal}
         * @param principal the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder principal(java.lang.String principal) {
            this.principal = principal;
            return this;
        }

        /**
         * Sets the value of {@link LambdaPermissionConfig#getEventSourceToken}
         * @param eventSourceToken the value to be set.
         * @return {@code this}
         */
        public Builder eventSourceToken(java.lang.String eventSourceToken) {
            this.eventSourceToken = eventSourceToken;
            return this;
        }

        /**
         * Sets the value of {@link LambdaPermissionConfig#getQualifier}
         * @param qualifier the value to be set.
         * @return {@code this}
         */
        public Builder qualifier(java.lang.String qualifier) {
            this.qualifier = qualifier;
            return this;
        }

        /**
         * Sets the value of {@link LambdaPermissionConfig#getSourceAccount}
         * @param sourceAccount the value to be set.
         * @return {@code this}
         */
        public Builder sourceAccount(java.lang.String sourceAccount) {
            this.sourceAccount = sourceAccount;
            return this;
        }

        /**
         * Sets the value of {@link LambdaPermissionConfig#getSourceArn}
         * @param sourceArn the value to be set.
         * @return {@code this}
         */
        public Builder sourceArn(java.lang.String sourceArn) {
            this.sourceArn = sourceArn;
            return this;
        }

        /**
         * Sets the value of {@link LambdaPermissionConfig#getStatementId}
         * @param statementId the value to be set.
         * @return {@code this}
         */
        public Builder statementId(java.lang.String statementId) {
            this.statementId = statementId;
            return this;
        }

        /**
         * Sets the value of {@link LambdaPermissionConfig#getStatementIdPrefix}
         * @param statementIdPrefix the value to be set.
         * @return {@code this}
         */
        public Builder statementIdPrefix(java.lang.String statementIdPrefix) {
            this.statementIdPrefix = statementIdPrefix;
            return this;
        }

        /**
         * Sets the value of {@link LambdaPermissionConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link LambdaPermissionConfig#getDependsOn}
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
         * Sets the value of {@link LambdaPermissionConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link LambdaPermissionConfig#getProvider}
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
         * @return a new instance of {@link LambdaPermissionConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LambdaPermissionConfig build() {
            return new Jsii$Proxy(action, functionName, principal, eventSourceToken, qualifier, sourceAccount, sourceArn, statementId, statementIdPrefix, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link LambdaPermissionConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LambdaPermissionConfig {
        private final java.lang.String action;
        private final java.lang.String functionName;
        private final java.lang.String principal;
        private final java.lang.String eventSourceToken;
        private final java.lang.String qualifier;
        private final java.lang.String sourceAccount;
        private final java.lang.String sourceArn;
        private final java.lang.String statementId;
        private final java.lang.String statementIdPrefix;
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
            this.action = software.amazon.jsii.Kernel.get(this, "action", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.functionName = software.amazon.jsii.Kernel.get(this, "functionName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.principal = software.amazon.jsii.Kernel.get(this, "principal", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.eventSourceToken = software.amazon.jsii.Kernel.get(this, "eventSourceToken", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.qualifier = software.amazon.jsii.Kernel.get(this, "qualifier", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.sourceAccount = software.amazon.jsii.Kernel.get(this, "sourceAccount", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.sourceArn = software.amazon.jsii.Kernel.get(this, "sourceArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.statementId = software.amazon.jsii.Kernel.get(this, "statementId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.statementIdPrefix = software.amazon.jsii.Kernel.get(this, "statementIdPrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String action, final java.lang.String functionName, final java.lang.String principal, final java.lang.String eventSourceToken, final java.lang.String qualifier, final java.lang.String sourceAccount, final java.lang.String sourceArn, final java.lang.String statementId, final java.lang.String statementIdPrefix, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.action = java.util.Objects.requireNonNull(action, "action is required");
            this.functionName = java.util.Objects.requireNonNull(functionName, "functionName is required");
            this.principal = java.util.Objects.requireNonNull(principal, "principal is required");
            this.eventSourceToken = eventSourceToken;
            this.qualifier = qualifier;
            this.sourceAccount = sourceAccount;
            this.sourceArn = sourceArn;
            this.statementId = statementId;
            this.statementIdPrefix = statementIdPrefix;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getAction() {
            return this.action;
        }

        @Override
        public final java.lang.String getFunctionName() {
            return this.functionName;
        }

        @Override
        public final java.lang.String getPrincipal() {
            return this.principal;
        }

        @Override
        public final java.lang.String getEventSourceToken() {
            return this.eventSourceToken;
        }

        @Override
        public final java.lang.String getQualifier() {
            return this.qualifier;
        }

        @Override
        public final java.lang.String getSourceAccount() {
            return this.sourceAccount;
        }

        @Override
        public final java.lang.String getSourceArn() {
            return this.sourceArn;
        }

        @Override
        public final java.lang.String getStatementId() {
            return this.statementId;
        }

        @Override
        public final java.lang.String getStatementIdPrefix() {
            return this.statementIdPrefix;
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

            data.set("action", om.valueToTree(this.getAction()));
            data.set("functionName", om.valueToTree(this.getFunctionName()));
            data.set("principal", om.valueToTree(this.getPrincipal()));
            if (this.getEventSourceToken() != null) {
                data.set("eventSourceToken", om.valueToTree(this.getEventSourceToken()));
            }
            if (this.getQualifier() != null) {
                data.set("qualifier", om.valueToTree(this.getQualifier()));
            }
            if (this.getSourceAccount() != null) {
                data.set("sourceAccount", om.valueToTree(this.getSourceAccount()));
            }
            if (this.getSourceArn() != null) {
                data.set("sourceArn", om.valueToTree(this.getSourceArn()));
            }
            if (this.getStatementId() != null) {
                data.set("statementId", om.valueToTree(this.getStatementId()));
            }
            if (this.getStatementIdPrefix() != null) {
                data.set("statementIdPrefix", om.valueToTree(this.getStatementIdPrefix()));
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
            struct.set("fqn", om.valueToTree("aws.LambdaPermissionConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LambdaPermissionConfig.Jsii$Proxy that = (LambdaPermissionConfig.Jsii$Proxy) o;

            if (!action.equals(that.action)) return false;
            if (!functionName.equals(that.functionName)) return false;
            if (!principal.equals(that.principal)) return false;
            if (this.eventSourceToken != null ? !this.eventSourceToken.equals(that.eventSourceToken) : that.eventSourceToken != null) return false;
            if (this.qualifier != null ? !this.qualifier.equals(that.qualifier) : that.qualifier != null) return false;
            if (this.sourceAccount != null ? !this.sourceAccount.equals(that.sourceAccount) : that.sourceAccount != null) return false;
            if (this.sourceArn != null ? !this.sourceArn.equals(that.sourceArn) : that.sourceArn != null) return false;
            if (this.statementId != null ? !this.statementId.equals(that.statementId) : that.statementId != null) return false;
            if (this.statementIdPrefix != null ? !this.statementIdPrefix.equals(that.statementIdPrefix) : that.statementIdPrefix != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.action.hashCode();
            result = 31 * result + (this.functionName.hashCode());
            result = 31 * result + (this.principal.hashCode());
            result = 31 * result + (this.eventSourceToken != null ? this.eventSourceToken.hashCode() : 0);
            result = 31 * result + (this.qualifier != null ? this.qualifier.hashCode() : 0);
            result = 31 * result + (this.sourceAccount != null ? this.sourceAccount.hashCode() : 0);
            result = 31 * result + (this.sourceArn != null ? this.sourceArn.hashCode() : 0);
            result = 31 * result + (this.statementId != null ? this.statementId.hashCode() : 0);
            result = 31 * result + (this.statementIdPrefix != null ? this.statementIdPrefix.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}