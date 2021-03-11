package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.034Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AppmeshRouteSpec")
@software.amazon.jsii.Jsii.Proxy(AppmeshRouteSpec.Jsii$Proxy.class)
public interface AppmeshRouteSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * http_route block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AppmeshRouteSpecHttpRoute> getHttpRoute() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getPriority() {
        return null;
    }

    /**
     * tcp_route block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AppmeshRouteSpecTcpRoute> getTcpRoute() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AppmeshRouteSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppmeshRouteSpec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppmeshRouteSpec> {
        private java.util.List<imports.aws.AppmeshRouteSpecHttpRoute> httpRoute;
        private java.lang.Number priority;
        private java.util.List<imports.aws.AppmeshRouteSpecTcpRoute> tcpRoute;

        /**
         * Sets the value of {@link AppmeshRouteSpec#getHttpRoute}
         * @param httpRoute http_route block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder httpRoute(java.util.List<? extends imports.aws.AppmeshRouteSpecHttpRoute> httpRoute) {
            this.httpRoute = (java.util.List<imports.aws.AppmeshRouteSpecHttpRoute>)httpRoute;
            return this;
        }

        /**
         * Sets the value of {@link AppmeshRouteSpec#getPriority}
         * @param priority the value to be set.
         * @return {@code this}
         */
        public Builder priority(java.lang.Number priority) {
            this.priority = priority;
            return this;
        }

        /**
         * Sets the value of {@link AppmeshRouteSpec#getTcpRoute}
         * @param tcpRoute tcp_route block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder tcpRoute(java.util.List<? extends imports.aws.AppmeshRouteSpecTcpRoute> tcpRoute) {
            this.tcpRoute = (java.util.List<imports.aws.AppmeshRouteSpecTcpRoute>)tcpRoute;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppmeshRouteSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppmeshRouteSpec build() {
            return new Jsii$Proxy(httpRoute, priority, tcpRoute);
        }
    }

    /**
     * An implementation for {@link AppmeshRouteSpec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppmeshRouteSpec {
        private final java.util.List<imports.aws.AppmeshRouteSpecHttpRoute> httpRoute;
        private final java.lang.Number priority;
        private final java.util.List<imports.aws.AppmeshRouteSpecTcpRoute> tcpRoute;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.httpRoute = software.amazon.jsii.Kernel.get(this, "httpRoute", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppmeshRouteSpecHttpRoute.class)));
            this.priority = software.amazon.jsii.Kernel.get(this, "priority", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.tcpRoute = software.amazon.jsii.Kernel.get(this, "tcpRoute", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppmeshRouteSpecTcpRoute.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.AppmeshRouteSpecHttpRoute> httpRoute, final java.lang.Number priority, final java.util.List<? extends imports.aws.AppmeshRouteSpecTcpRoute> tcpRoute) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.httpRoute = (java.util.List<imports.aws.AppmeshRouteSpecHttpRoute>)httpRoute;
            this.priority = priority;
            this.tcpRoute = (java.util.List<imports.aws.AppmeshRouteSpecTcpRoute>)tcpRoute;
        }

        @Override
        public final java.util.List<imports.aws.AppmeshRouteSpecHttpRoute> getHttpRoute() {
            return this.httpRoute;
        }

        @Override
        public final java.lang.Number getPriority() {
            return this.priority;
        }

        @Override
        public final java.util.List<imports.aws.AppmeshRouteSpecTcpRoute> getTcpRoute() {
            return this.tcpRoute;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getHttpRoute() != null) {
                data.set("httpRoute", om.valueToTree(this.getHttpRoute()));
            }
            if (this.getPriority() != null) {
                data.set("priority", om.valueToTree(this.getPriority()));
            }
            if (this.getTcpRoute() != null) {
                data.set("tcpRoute", om.valueToTree(this.getTcpRoute()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.AppmeshRouteSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppmeshRouteSpec.Jsii$Proxy that = (AppmeshRouteSpec.Jsii$Proxy) o;

            if (this.httpRoute != null ? !this.httpRoute.equals(that.httpRoute) : that.httpRoute != null) return false;
            if (this.priority != null ? !this.priority.equals(that.priority) : that.priority != null) return false;
            return this.tcpRoute != null ? this.tcpRoute.equals(that.tcpRoute) : that.tcpRoute == null;
        }

        @Override
        public final int hashCode() {
            int result = this.httpRoute != null ? this.httpRoute.hashCode() : 0;
            result = 31 * result + (this.priority != null ? this.priority.hashCode() : 0);
            result = 31 * result + (this.tcpRoute != null ? this.tcpRoute.hashCode() : 0);
            return result;
        }
    }
}
