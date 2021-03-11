package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.192Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CognitoResourceServerScope")
@software.amazon.jsii.Jsii.Proxy(CognitoResourceServerScope.Jsii$Proxy.class)
public interface CognitoResourceServerScope extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getScopeDescription();

    @org.jetbrains.annotations.NotNull java.lang.String getScopeName();

    /**
     * @return a {@link Builder} of {@link CognitoResourceServerScope}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CognitoResourceServerScope}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CognitoResourceServerScope> {
        private java.lang.String scopeDescription;
        private java.lang.String scopeName;

        /**
         * Sets the value of {@link CognitoResourceServerScope#getScopeDescription}
         * @param scopeDescription the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder scopeDescription(java.lang.String scopeDescription) {
            this.scopeDescription = scopeDescription;
            return this;
        }

        /**
         * Sets the value of {@link CognitoResourceServerScope#getScopeName}
         * @param scopeName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder scopeName(java.lang.String scopeName) {
            this.scopeName = scopeName;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CognitoResourceServerScope}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CognitoResourceServerScope build() {
            return new Jsii$Proxy(scopeDescription, scopeName);
        }
    }

    /**
     * An implementation for {@link CognitoResourceServerScope}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CognitoResourceServerScope {
        private final java.lang.String scopeDescription;
        private final java.lang.String scopeName;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.scopeDescription = software.amazon.jsii.Kernel.get(this, "scopeDescription", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.scopeName = software.amazon.jsii.Kernel.get(this, "scopeName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String scopeDescription, final java.lang.String scopeName) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.scopeDescription = java.util.Objects.requireNonNull(scopeDescription, "scopeDescription is required");
            this.scopeName = java.util.Objects.requireNonNull(scopeName, "scopeName is required");
        }

        @Override
        public final java.lang.String getScopeDescription() {
            return this.scopeDescription;
        }

        @Override
        public final java.lang.String getScopeName() {
            return this.scopeName;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("scopeDescription", om.valueToTree(this.getScopeDescription()));
            data.set("scopeName", om.valueToTree(this.getScopeName()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.CognitoResourceServerScope"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CognitoResourceServerScope.Jsii$Proxy that = (CognitoResourceServerScope.Jsii$Proxy) o;

            if (!scopeDescription.equals(that.scopeDescription)) return false;
            return this.scopeName.equals(that.scopeName);
        }

        @Override
        public final int hashCode() {
            int result = this.scopeDescription.hashCode();
            result = 31 * result + (this.scopeName.hashCode());
            return result;
        }
    }
}
