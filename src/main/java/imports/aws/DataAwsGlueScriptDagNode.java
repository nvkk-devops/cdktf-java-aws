package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.307Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.DataAwsGlueScriptDagNode")
@software.amazon.jsii.Jsii.Proxy(DataAwsGlueScriptDagNode.Jsii$Proxy.class)
public interface DataAwsGlueScriptDagNode extends software.amazon.jsii.JsiiSerializable {

    /**
     * args block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.DataAwsGlueScriptDagNodeArgs> getArgs();

    @org.jetbrains.annotations.NotNull java.lang.String getId();

    @org.jetbrains.annotations.NotNull java.lang.String getNodeType();

    default @org.jetbrains.annotations.Nullable java.lang.Number getLineNumber() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DataAwsGlueScriptDagNode}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DataAwsGlueScriptDagNode}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DataAwsGlueScriptDagNode> {
        private java.util.List<imports.aws.DataAwsGlueScriptDagNodeArgs> args;
        private java.lang.String id;
        private java.lang.String nodeType;
        private java.lang.Number lineNumber;

        /**
         * Sets the value of {@link DataAwsGlueScriptDagNode#getArgs}
         * @param args args block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder args(java.util.List<? extends imports.aws.DataAwsGlueScriptDagNodeArgs> args) {
            this.args = (java.util.List<imports.aws.DataAwsGlueScriptDagNodeArgs>)args;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsGlueScriptDagNode#getId}
         * @param id the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsGlueScriptDagNode#getNodeType}
         * @param nodeType the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder nodeType(java.lang.String nodeType) {
            this.nodeType = nodeType;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsGlueScriptDagNode#getLineNumber}
         * @param lineNumber the value to be set.
         * @return {@code this}
         */
        public Builder lineNumber(java.lang.Number lineNumber) {
            this.lineNumber = lineNumber;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DataAwsGlueScriptDagNode}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DataAwsGlueScriptDagNode build() {
            return new Jsii$Proxy(args, id, nodeType, lineNumber);
        }
    }

    /**
     * An implementation for {@link DataAwsGlueScriptDagNode}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DataAwsGlueScriptDagNode {
        private final java.util.List<imports.aws.DataAwsGlueScriptDagNodeArgs> args;
        private final java.lang.String id;
        private final java.lang.String nodeType;
        private final java.lang.Number lineNumber;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.args = software.amazon.jsii.Kernel.get(this, "args", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DataAwsGlueScriptDagNodeArgs.class)));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.nodeType = software.amazon.jsii.Kernel.get(this, "nodeType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.lineNumber = software.amazon.jsii.Kernel.get(this, "lineNumber", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.DataAwsGlueScriptDagNodeArgs> args, final java.lang.String id, final java.lang.String nodeType, final java.lang.Number lineNumber) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.args = (java.util.List<imports.aws.DataAwsGlueScriptDagNodeArgs>)java.util.Objects.requireNonNull(args, "args is required");
            this.id = java.util.Objects.requireNonNull(id, "id is required");
            this.nodeType = java.util.Objects.requireNonNull(nodeType, "nodeType is required");
            this.lineNumber = lineNumber;
        }

        @Override
        public final java.util.List<imports.aws.DataAwsGlueScriptDagNodeArgs> getArgs() {
            return this.args;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        public final java.lang.String getNodeType() {
            return this.nodeType;
        }

        @Override
        public final java.lang.Number getLineNumber() {
            return this.lineNumber;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("args", om.valueToTree(this.getArgs()));
            data.set("id", om.valueToTree(this.getId()));
            data.set("nodeType", om.valueToTree(this.getNodeType()));
            if (this.getLineNumber() != null) {
                data.set("lineNumber", om.valueToTree(this.getLineNumber()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.DataAwsGlueScriptDagNode"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DataAwsGlueScriptDagNode.Jsii$Proxy that = (DataAwsGlueScriptDagNode.Jsii$Proxy) o;

            if (!args.equals(that.args)) return false;
            if (!id.equals(that.id)) return false;
            if (!nodeType.equals(that.nodeType)) return false;
            return this.lineNumber != null ? this.lineNumber.equals(that.lineNumber) : that.lineNumber == null;
        }

        @Override
        public final int hashCode() {
            int result = this.args.hashCode();
            result = 31 * result + (this.id.hashCode());
            result = 31 * result + (this.nodeType.hashCode());
            result = 31 * result + (this.lineNumber != null ? this.lineNumber.hashCode() : 0);
            return result;
        }
    }
}
