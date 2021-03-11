package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.642Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.IotTopicRuleErrorActionElasticsearch")
@software.amazon.jsii.Jsii.Proxy(IotTopicRuleErrorActionElasticsearch.Jsii$Proxy.class)
public interface IotTopicRuleErrorActionElasticsearch extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getEndpoint();

    @org.jetbrains.annotations.NotNull java.lang.String getId();

    @org.jetbrains.annotations.NotNull java.lang.String getIndex();

    @org.jetbrains.annotations.NotNull java.lang.String getRoleArn();

    @org.jetbrains.annotations.NotNull java.lang.String getType();

    /**
     * @return a {@link Builder} of {@link IotTopicRuleErrorActionElasticsearch}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link IotTopicRuleErrorActionElasticsearch}
     */
    public static final class Builder implements software.amazon.jsii.Builder<IotTopicRuleErrorActionElasticsearch> {
        private java.lang.String endpoint;
        private java.lang.String id;
        private java.lang.String index;
        private java.lang.String roleArn;
        private java.lang.String type;

        /**
         * Sets the value of {@link IotTopicRuleErrorActionElasticsearch#getEndpoint}
         * @param endpoint the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder endpoint(java.lang.String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleErrorActionElasticsearch#getId}
         * @param id the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleErrorActionElasticsearch#getIndex}
         * @param index the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder index(java.lang.String index) {
            this.index = index;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleErrorActionElasticsearch#getRoleArn}
         * @param roleArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder roleArn(java.lang.String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleErrorActionElasticsearch#getType}
         * @param type the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link IotTopicRuleErrorActionElasticsearch}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public IotTopicRuleErrorActionElasticsearch build() {
            return new Jsii$Proxy(endpoint, id, index, roleArn, type);
        }
    }

    /**
     * An implementation for {@link IotTopicRuleErrorActionElasticsearch}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements IotTopicRuleErrorActionElasticsearch {
        private final java.lang.String endpoint;
        private final java.lang.String id;
        private final java.lang.String index;
        private final java.lang.String roleArn;
        private final java.lang.String type;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.endpoint = software.amazon.jsii.Kernel.get(this, "endpoint", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.index = software.amazon.jsii.Kernel.get(this, "index", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.roleArn = software.amazon.jsii.Kernel.get(this, "roleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String endpoint, final java.lang.String id, final java.lang.String index, final java.lang.String roleArn, final java.lang.String type) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.endpoint = java.util.Objects.requireNonNull(endpoint, "endpoint is required");
            this.id = java.util.Objects.requireNonNull(id, "id is required");
            this.index = java.util.Objects.requireNonNull(index, "index is required");
            this.roleArn = java.util.Objects.requireNonNull(roleArn, "roleArn is required");
            this.type = java.util.Objects.requireNonNull(type, "type is required");
        }

        @Override
        public final java.lang.String getEndpoint() {
            return this.endpoint;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        public final java.lang.String getIndex() {
            return this.index;
        }

        @Override
        public final java.lang.String getRoleArn() {
            return this.roleArn;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("endpoint", om.valueToTree(this.getEndpoint()));
            data.set("id", om.valueToTree(this.getId()));
            data.set("index", om.valueToTree(this.getIndex()));
            data.set("roleArn", om.valueToTree(this.getRoleArn()));
            data.set("type", om.valueToTree(this.getType()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.IotTopicRuleErrorActionElasticsearch"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            IotTopicRuleErrorActionElasticsearch.Jsii$Proxy that = (IotTopicRuleErrorActionElasticsearch.Jsii$Proxy) o;

            if (!endpoint.equals(that.endpoint)) return false;
            if (!id.equals(that.id)) return false;
            if (!index.equals(that.index)) return false;
            if (!roleArn.equals(that.roleArn)) return false;
            return this.type.equals(that.type);
        }

        @Override
        public final int hashCode() {
            int result = this.endpoint.hashCode();
            result = 31 * result + (this.id.hashCode());
            result = 31 * result + (this.index.hashCode());
            result = 31 * result + (this.roleArn.hashCode());
            result = 31 * result + (this.type.hashCode());
            return result;
        }
    }
}
