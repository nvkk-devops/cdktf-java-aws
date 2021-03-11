package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.034Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AppmeshRouteSpecHttpRoute")
@software.amazon.jsii.Jsii.Proxy(AppmeshRouteSpecHttpRoute.Jsii$Proxy.class)
public interface AppmeshRouteSpecHttpRoute extends software.amazon.jsii.JsiiSerializable {

    /**
     * action block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.AppmeshRouteSpecHttpRouteAction> getAction();

    /**
     * match block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.AppmeshRouteSpecHttpRouteMatch> getMatch();

    /**
     * @return a {@link Builder} of {@link AppmeshRouteSpecHttpRoute}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppmeshRouteSpecHttpRoute}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppmeshRouteSpecHttpRoute> {
        private java.util.List<imports.aws.AppmeshRouteSpecHttpRouteAction> action;
        private java.util.List<imports.aws.AppmeshRouteSpecHttpRouteMatch> match;

        /**
         * Sets the value of {@link AppmeshRouteSpecHttpRoute#getAction}
         * @param action action block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder action(java.util.List<? extends imports.aws.AppmeshRouteSpecHttpRouteAction> action) {
            this.action = (java.util.List<imports.aws.AppmeshRouteSpecHttpRouteAction>)action;
            return this;
        }

        /**
         * Sets the value of {@link AppmeshRouteSpecHttpRoute#getMatch}
         * @param match match block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder match(java.util.List<? extends imports.aws.AppmeshRouteSpecHttpRouteMatch> match) {
            this.match = (java.util.List<imports.aws.AppmeshRouteSpecHttpRouteMatch>)match;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppmeshRouteSpecHttpRoute}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppmeshRouteSpecHttpRoute build() {
            return new Jsii$Proxy(action, match);
        }
    }

    /**
     * An implementation for {@link AppmeshRouteSpecHttpRoute}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppmeshRouteSpecHttpRoute {
        private final java.util.List<imports.aws.AppmeshRouteSpecHttpRouteAction> action;
        private final java.util.List<imports.aws.AppmeshRouteSpecHttpRouteMatch> match;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.action = software.amazon.jsii.Kernel.get(this, "action", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppmeshRouteSpecHttpRouteAction.class)));
            this.match = software.amazon.jsii.Kernel.get(this, "match", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppmeshRouteSpecHttpRouteMatch.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.AppmeshRouteSpecHttpRouteAction> action, final java.util.List<? extends imports.aws.AppmeshRouteSpecHttpRouteMatch> match) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.action = (java.util.List<imports.aws.AppmeshRouteSpecHttpRouteAction>)java.util.Objects.requireNonNull(action, "action is required");
            this.match = (java.util.List<imports.aws.AppmeshRouteSpecHttpRouteMatch>)java.util.Objects.requireNonNull(match, "match is required");
        }

        @Override
        public final java.util.List<imports.aws.AppmeshRouteSpecHttpRouteAction> getAction() {
            return this.action;
        }

        @Override
        public final java.util.List<imports.aws.AppmeshRouteSpecHttpRouteMatch> getMatch() {
            return this.match;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("action", om.valueToTree(this.getAction()));
            data.set("match", om.valueToTree(this.getMatch()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.AppmeshRouteSpecHttpRoute"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppmeshRouteSpecHttpRoute.Jsii$Proxy that = (AppmeshRouteSpecHttpRoute.Jsii$Proxy) o;

            if (!action.equals(that.action)) return false;
            return this.match.equals(that.match);
        }

        @Override
        public final int hashCode() {
            int result = this.action.hashCode();
            result = 31 * result + (this.match.hashCode());
            return result;
        }
    }
}
