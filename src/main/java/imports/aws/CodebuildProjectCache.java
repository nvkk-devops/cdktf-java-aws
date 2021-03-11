package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.166Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CodebuildProjectCache")
@software.amazon.jsii.Jsii.Proxy(CodebuildProjectCache.Jsii$Proxy.class)
public interface CodebuildProjectCache extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.String getLocation() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getModes() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getType() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CodebuildProjectCache}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CodebuildProjectCache}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CodebuildProjectCache> {
        private java.lang.String location;
        private java.util.List<java.lang.String> modes;
        private java.lang.String type;

        /**
         * Sets the value of {@link CodebuildProjectCache#getLocation}
         * @param location the value to be set.
         * @return {@code this}
         */
        public Builder location(java.lang.String location) {
            this.location = location;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildProjectCache#getModes}
         * @param modes the value to be set.
         * @return {@code this}
         */
        public Builder modes(java.util.List<java.lang.String> modes) {
            this.modes = modes;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildProjectCache#getType}
         * @param type the value to be set.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CodebuildProjectCache}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CodebuildProjectCache build() {
            return new Jsii$Proxy(location, modes, type);
        }
    }

    /**
     * An implementation for {@link CodebuildProjectCache}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CodebuildProjectCache {
        private final java.lang.String location;
        private final java.util.List<java.lang.String> modes;
        private final java.lang.String type;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.location = software.amazon.jsii.Kernel.get(this, "location", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.modes = software.amazon.jsii.Kernel.get(this, "modes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String location, final java.util.List<java.lang.String> modes, final java.lang.String type) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.location = location;
            this.modes = modes;
            this.type = type;
        }

        @Override
        public final java.lang.String getLocation() {
            return this.location;
        }

        @Override
        public final java.util.List<java.lang.String> getModes() {
            return this.modes;
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

            if (this.getLocation() != null) {
                data.set("location", om.valueToTree(this.getLocation()));
            }
            if (this.getModes() != null) {
                data.set("modes", om.valueToTree(this.getModes()));
            }
            if (this.getType() != null) {
                data.set("type", om.valueToTree(this.getType()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.CodebuildProjectCache"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CodebuildProjectCache.Jsii$Proxy that = (CodebuildProjectCache.Jsii$Proxy) o;

            if (this.location != null ? !this.location.equals(that.location) : that.location != null) return false;
            if (this.modes != null ? !this.modes.equals(that.modes) : that.modes != null) return false;
            return this.type != null ? this.type.equals(that.type) : that.type == null;
        }

        @Override
        public final int hashCode() {
            int result = this.location != null ? this.location.hashCode() : 0;
            result = 31 * result + (this.modes != null ? this.modes.hashCode() : 0);
            result = 31 * result + (this.type != null ? this.type.hashCode() : 0);
            return result;
        }
    }
}
