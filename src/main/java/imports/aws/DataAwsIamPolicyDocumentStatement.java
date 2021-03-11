package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.310Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.DataAwsIamPolicyDocumentStatement")
@software.amazon.jsii.Jsii.Proxy(DataAwsIamPolicyDocumentStatement.Jsii$Proxy.class)
public interface DataAwsIamPolicyDocumentStatement extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getActions() {
        return null;
    }

    /**
     * condition block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.DataAwsIamPolicyDocumentStatementCondition> getCondition() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getEffect() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getNotActions() {
        return null;
    }

    /**
     * not_principals block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.DataAwsIamPolicyDocumentStatementNotPrincipals> getNotPrincipals() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getNotResources() {
        return null;
    }

    /**
     * principals block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.DataAwsIamPolicyDocumentStatementPrincipals> getPrincipals() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getResources() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSid() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DataAwsIamPolicyDocumentStatement}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DataAwsIamPolicyDocumentStatement}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DataAwsIamPolicyDocumentStatement> {
        private java.util.List<java.lang.String> actions;
        private java.util.List<imports.aws.DataAwsIamPolicyDocumentStatementCondition> condition;
        private java.lang.String effect;
        private java.util.List<java.lang.String> notActions;
        private java.util.List<imports.aws.DataAwsIamPolicyDocumentStatementNotPrincipals> notPrincipals;
        private java.util.List<java.lang.String> notResources;
        private java.util.List<imports.aws.DataAwsIamPolicyDocumentStatementPrincipals> principals;
        private java.util.List<java.lang.String> resources;
        private java.lang.String sid;

        /**
         * Sets the value of {@link DataAwsIamPolicyDocumentStatement#getActions}
         * @param actions the value to be set.
         * @return {@code this}
         */
        public Builder actions(java.util.List<java.lang.String> actions) {
            this.actions = actions;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsIamPolicyDocumentStatement#getCondition}
         * @param condition condition block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder condition(java.util.List<? extends imports.aws.DataAwsIamPolicyDocumentStatementCondition> condition) {
            this.condition = (java.util.List<imports.aws.DataAwsIamPolicyDocumentStatementCondition>)condition;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsIamPolicyDocumentStatement#getEffect}
         * @param effect the value to be set.
         * @return {@code this}
         */
        public Builder effect(java.lang.String effect) {
            this.effect = effect;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsIamPolicyDocumentStatement#getNotActions}
         * @param notActions the value to be set.
         * @return {@code this}
         */
        public Builder notActions(java.util.List<java.lang.String> notActions) {
            this.notActions = notActions;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsIamPolicyDocumentStatement#getNotPrincipals}
         * @param notPrincipals not_principals block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder notPrincipals(java.util.List<? extends imports.aws.DataAwsIamPolicyDocumentStatementNotPrincipals> notPrincipals) {
            this.notPrincipals = (java.util.List<imports.aws.DataAwsIamPolicyDocumentStatementNotPrincipals>)notPrincipals;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsIamPolicyDocumentStatement#getNotResources}
         * @param notResources the value to be set.
         * @return {@code this}
         */
        public Builder notResources(java.util.List<java.lang.String> notResources) {
            this.notResources = notResources;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsIamPolicyDocumentStatement#getPrincipals}
         * @param principals principals block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder principals(java.util.List<? extends imports.aws.DataAwsIamPolicyDocumentStatementPrincipals> principals) {
            this.principals = (java.util.List<imports.aws.DataAwsIamPolicyDocumentStatementPrincipals>)principals;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsIamPolicyDocumentStatement#getResources}
         * @param resources the value to be set.
         * @return {@code this}
         */
        public Builder resources(java.util.List<java.lang.String> resources) {
            this.resources = resources;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsIamPolicyDocumentStatement#getSid}
         * @param sid the value to be set.
         * @return {@code this}
         */
        public Builder sid(java.lang.String sid) {
            this.sid = sid;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DataAwsIamPolicyDocumentStatement}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DataAwsIamPolicyDocumentStatement build() {
            return new Jsii$Proxy(actions, condition, effect, notActions, notPrincipals, notResources, principals, resources, sid);
        }
    }

    /**
     * An implementation for {@link DataAwsIamPolicyDocumentStatement}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DataAwsIamPolicyDocumentStatement {
        private final java.util.List<java.lang.String> actions;
        private final java.util.List<imports.aws.DataAwsIamPolicyDocumentStatementCondition> condition;
        private final java.lang.String effect;
        private final java.util.List<java.lang.String> notActions;
        private final java.util.List<imports.aws.DataAwsIamPolicyDocumentStatementNotPrincipals> notPrincipals;
        private final java.util.List<java.lang.String> notResources;
        private final java.util.List<imports.aws.DataAwsIamPolicyDocumentStatementPrincipals> principals;
        private final java.util.List<java.lang.String> resources;
        private final java.lang.String sid;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.actions = software.amazon.jsii.Kernel.get(this, "actions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.condition = software.amazon.jsii.Kernel.get(this, "condition", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DataAwsIamPolicyDocumentStatementCondition.class)));
            this.effect = software.amazon.jsii.Kernel.get(this, "effect", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.notActions = software.amazon.jsii.Kernel.get(this, "notActions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.notPrincipals = software.amazon.jsii.Kernel.get(this, "notPrincipals", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DataAwsIamPolicyDocumentStatementNotPrincipals.class)));
            this.notResources = software.amazon.jsii.Kernel.get(this, "notResources", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.principals = software.amazon.jsii.Kernel.get(this, "principals", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DataAwsIamPolicyDocumentStatementPrincipals.class)));
            this.resources = software.amazon.jsii.Kernel.get(this, "resources", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.sid = software.amazon.jsii.Kernel.get(this, "sid", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<java.lang.String> actions, final java.util.List<? extends imports.aws.DataAwsIamPolicyDocumentStatementCondition> condition, final java.lang.String effect, final java.util.List<java.lang.String> notActions, final java.util.List<? extends imports.aws.DataAwsIamPolicyDocumentStatementNotPrincipals> notPrincipals, final java.util.List<java.lang.String> notResources, final java.util.List<? extends imports.aws.DataAwsIamPolicyDocumentStatementPrincipals> principals, final java.util.List<java.lang.String> resources, final java.lang.String sid) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.actions = actions;
            this.condition = (java.util.List<imports.aws.DataAwsIamPolicyDocumentStatementCondition>)condition;
            this.effect = effect;
            this.notActions = notActions;
            this.notPrincipals = (java.util.List<imports.aws.DataAwsIamPolicyDocumentStatementNotPrincipals>)notPrincipals;
            this.notResources = notResources;
            this.principals = (java.util.List<imports.aws.DataAwsIamPolicyDocumentStatementPrincipals>)principals;
            this.resources = resources;
            this.sid = sid;
        }

        @Override
        public final java.util.List<java.lang.String> getActions() {
            return this.actions;
        }

        @Override
        public final java.util.List<imports.aws.DataAwsIamPolicyDocumentStatementCondition> getCondition() {
            return this.condition;
        }

        @Override
        public final java.lang.String getEffect() {
            return this.effect;
        }

        @Override
        public final java.util.List<java.lang.String> getNotActions() {
            return this.notActions;
        }

        @Override
        public final java.util.List<imports.aws.DataAwsIamPolicyDocumentStatementNotPrincipals> getNotPrincipals() {
            return this.notPrincipals;
        }

        @Override
        public final java.util.List<java.lang.String> getNotResources() {
            return this.notResources;
        }

        @Override
        public final java.util.List<imports.aws.DataAwsIamPolicyDocumentStatementPrincipals> getPrincipals() {
            return this.principals;
        }

        @Override
        public final java.util.List<java.lang.String> getResources() {
            return this.resources;
        }

        @Override
        public final java.lang.String getSid() {
            return this.sid;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getActions() != null) {
                data.set("actions", om.valueToTree(this.getActions()));
            }
            if (this.getCondition() != null) {
                data.set("condition", om.valueToTree(this.getCondition()));
            }
            if (this.getEffect() != null) {
                data.set("effect", om.valueToTree(this.getEffect()));
            }
            if (this.getNotActions() != null) {
                data.set("notActions", om.valueToTree(this.getNotActions()));
            }
            if (this.getNotPrincipals() != null) {
                data.set("notPrincipals", om.valueToTree(this.getNotPrincipals()));
            }
            if (this.getNotResources() != null) {
                data.set("notResources", om.valueToTree(this.getNotResources()));
            }
            if (this.getPrincipals() != null) {
                data.set("principals", om.valueToTree(this.getPrincipals()));
            }
            if (this.getResources() != null) {
                data.set("resources", om.valueToTree(this.getResources()));
            }
            if (this.getSid() != null) {
                data.set("sid", om.valueToTree(this.getSid()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.DataAwsIamPolicyDocumentStatement"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DataAwsIamPolicyDocumentStatement.Jsii$Proxy that = (DataAwsIamPolicyDocumentStatement.Jsii$Proxy) o;

            if (this.actions != null ? !this.actions.equals(that.actions) : that.actions != null) return false;
            if (this.condition != null ? !this.condition.equals(that.condition) : that.condition != null) return false;
            if (this.effect != null ? !this.effect.equals(that.effect) : that.effect != null) return false;
            if (this.notActions != null ? !this.notActions.equals(that.notActions) : that.notActions != null) return false;
            if (this.notPrincipals != null ? !this.notPrincipals.equals(that.notPrincipals) : that.notPrincipals != null) return false;
            if (this.notResources != null ? !this.notResources.equals(that.notResources) : that.notResources != null) return false;
            if (this.principals != null ? !this.principals.equals(that.principals) : that.principals != null) return false;
            if (this.resources != null ? !this.resources.equals(that.resources) : that.resources != null) return false;
            return this.sid != null ? this.sid.equals(that.sid) : that.sid == null;
        }

        @Override
        public final int hashCode() {
            int result = this.actions != null ? this.actions.hashCode() : 0;
            result = 31 * result + (this.condition != null ? this.condition.hashCode() : 0);
            result = 31 * result + (this.effect != null ? this.effect.hashCode() : 0);
            result = 31 * result + (this.notActions != null ? this.notActions.hashCode() : 0);
            result = 31 * result + (this.notPrincipals != null ? this.notPrincipals.hashCode() : 0);
            result = 31 * result + (this.notResources != null ? this.notResources.hashCode() : 0);
            result = 31 * result + (this.principals != null ? this.principals.hashCode() : 0);
            result = 31 * result + (this.resources != null ? this.resources.hashCode() : 0);
            result = 31 * result + (this.sid != null ? this.sid.hashCode() : 0);
            return result;
        }
    }
}
