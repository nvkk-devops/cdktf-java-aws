package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.563Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.EmrClusterBootstrapAction")
@software.amazon.jsii.Jsii.Proxy(EmrClusterBootstrapAction.Jsii$Proxy.class)
public interface EmrClusterBootstrapAction extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    @org.jetbrains.annotations.NotNull java.lang.String getPath();

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getArgs() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link EmrClusterBootstrapAction}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link EmrClusterBootstrapAction}
     */
    public static final class Builder implements software.amazon.jsii.Builder<EmrClusterBootstrapAction> {
        private java.lang.String name;
        private java.lang.String path;
        private java.util.List<java.lang.String> args;

        /**
         * Sets the value of {@link EmrClusterBootstrapAction#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link EmrClusterBootstrapAction#getPath}
         * @param path the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder path(java.lang.String path) {
            this.path = path;
            return this;
        }

        /**
         * Sets the value of {@link EmrClusterBootstrapAction#getArgs}
         * @param args the value to be set.
         * @return {@code this}
         */
        public Builder args(java.util.List<java.lang.String> args) {
            this.args = args;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link EmrClusterBootstrapAction}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public EmrClusterBootstrapAction build() {
            return new Jsii$Proxy(name, path, args);
        }
    }

    /**
     * An implementation for {@link EmrClusterBootstrapAction}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements EmrClusterBootstrapAction {
        private final java.lang.String name;
        private final java.lang.String path;
        private final java.util.List<java.lang.String> args;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.path = software.amazon.jsii.Kernel.get(this, "path", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.args = software.amazon.jsii.Kernel.get(this, "args", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String name, final java.lang.String path, final java.util.List<java.lang.String> args) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.path = java.util.Objects.requireNonNull(path, "path is required");
            this.args = args;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getPath() {
            return this.path;
        }

        @Override
        public final java.util.List<java.lang.String> getArgs() {
            return this.args;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("name", om.valueToTree(this.getName()));
            data.set("path", om.valueToTree(this.getPath()));
            if (this.getArgs() != null) {
                data.set("args", om.valueToTree(this.getArgs()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.EmrClusterBootstrapAction"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EmrClusterBootstrapAction.Jsii$Proxy that = (EmrClusterBootstrapAction.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (!path.equals(that.path)) return false;
            return this.args != null ? this.args.equals(that.args) : that.args == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.path.hashCode());
            result = 31 * result + (this.args != null ? this.args.hashCode() : 0);
            return result;
        }
    }
}
