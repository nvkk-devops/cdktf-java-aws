package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.169Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CodebuildProjectSourceGitSubmodulesConfig")
@software.amazon.jsii.Jsii.Proxy(CodebuildProjectSourceGitSubmodulesConfig.Jsii$Proxy.class)
public interface CodebuildProjectSourceGitSubmodulesConfig extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.Boolean getFetchSubmodules();

    /**
     * @return a {@link Builder} of {@link CodebuildProjectSourceGitSubmodulesConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CodebuildProjectSourceGitSubmodulesConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CodebuildProjectSourceGitSubmodulesConfig> {
        private java.lang.Boolean fetchSubmodules;

        /**
         * Sets the value of {@link CodebuildProjectSourceGitSubmodulesConfig#getFetchSubmodules}
         * @param fetchSubmodules the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder fetchSubmodules(java.lang.Boolean fetchSubmodules) {
            this.fetchSubmodules = fetchSubmodules;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CodebuildProjectSourceGitSubmodulesConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CodebuildProjectSourceGitSubmodulesConfig build() {
            return new Jsii$Proxy(fetchSubmodules);
        }
    }

    /**
     * An implementation for {@link CodebuildProjectSourceGitSubmodulesConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CodebuildProjectSourceGitSubmodulesConfig {
        private final java.lang.Boolean fetchSubmodules;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.fetchSubmodules = software.amazon.jsii.Kernel.get(this, "fetchSubmodules", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.Boolean fetchSubmodules) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.fetchSubmodules = java.util.Objects.requireNonNull(fetchSubmodules, "fetchSubmodules is required");
        }

        @Override
        public final java.lang.Boolean getFetchSubmodules() {
            return this.fetchSubmodules;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("fetchSubmodules", om.valueToTree(this.getFetchSubmodules()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.CodebuildProjectSourceGitSubmodulesConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CodebuildProjectSourceGitSubmodulesConfig.Jsii$Proxy that = (CodebuildProjectSourceGitSubmodulesConfig.Jsii$Proxy) o;

            return this.fetchSubmodules.equals(that.fetchSubmodules);
        }

        @Override
        public final int hashCode() {
            int result = this.fetchSubmodules.hashCode();
            return result;
        }
    }
}
