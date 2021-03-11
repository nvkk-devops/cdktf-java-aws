package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.307Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.DataAwsGlueScriptDagEdge")
@software.amazon.jsii.Jsii.Proxy(DataAwsGlueScriptDagEdge.Jsii$Proxy.class)
public interface DataAwsGlueScriptDagEdge extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getSource();

    @org.jetbrains.annotations.NotNull java.lang.String getTarget();

    default @org.jetbrains.annotations.Nullable java.lang.String getTargetParameter() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DataAwsGlueScriptDagEdge}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DataAwsGlueScriptDagEdge}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DataAwsGlueScriptDagEdge> {
        private java.lang.String source;
        private java.lang.String target;
        private java.lang.String targetParameter;

        /**
         * Sets the value of {@link DataAwsGlueScriptDagEdge#getSource}
         * @param source the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder source(java.lang.String source) {
            this.source = source;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsGlueScriptDagEdge#getTarget}
         * @param target the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder target(java.lang.String target) {
            this.target = target;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsGlueScriptDagEdge#getTargetParameter}
         * @param targetParameter the value to be set.
         * @return {@code this}
         */
        public Builder targetParameter(java.lang.String targetParameter) {
            this.targetParameter = targetParameter;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DataAwsGlueScriptDagEdge}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DataAwsGlueScriptDagEdge build() {
            return new Jsii$Proxy(source, target, targetParameter);
        }
    }

    /**
     * An implementation for {@link DataAwsGlueScriptDagEdge}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DataAwsGlueScriptDagEdge {
        private final java.lang.String source;
        private final java.lang.String target;
        private final java.lang.String targetParameter;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.source = software.amazon.jsii.Kernel.get(this, "source", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.target = software.amazon.jsii.Kernel.get(this, "target", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.targetParameter = software.amazon.jsii.Kernel.get(this, "targetParameter", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String source, final java.lang.String target, final java.lang.String targetParameter) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.source = java.util.Objects.requireNonNull(source, "source is required");
            this.target = java.util.Objects.requireNonNull(target, "target is required");
            this.targetParameter = targetParameter;
        }

        @Override
        public final java.lang.String getSource() {
            return this.source;
        }

        @Override
        public final java.lang.String getTarget() {
            return this.target;
        }

        @Override
        public final java.lang.String getTargetParameter() {
            return this.targetParameter;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("source", om.valueToTree(this.getSource()));
            data.set("target", om.valueToTree(this.getTarget()));
            if (this.getTargetParameter() != null) {
                data.set("targetParameter", om.valueToTree(this.getTargetParameter()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.DataAwsGlueScriptDagEdge"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DataAwsGlueScriptDagEdge.Jsii$Proxy that = (DataAwsGlueScriptDagEdge.Jsii$Proxy) o;

            if (!source.equals(that.source)) return false;
            if (!target.equals(that.target)) return false;
            return this.targetParameter != null ? this.targetParameter.equals(that.targetParameter) : that.targetParameter == null;
        }

        @Override
        public final int hashCode() {
            int result = this.source.hashCode();
            result = 31 * result + (this.target.hashCode());
            result = 31 * result + (this.targetParameter != null ? this.targetParameter.hashCode() : 0);
            return result;
        }
    }
}
