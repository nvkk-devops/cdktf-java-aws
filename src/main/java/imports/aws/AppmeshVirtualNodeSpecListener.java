package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.037Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AppmeshVirtualNodeSpecListener")
@software.amazon.jsii.Jsii.Proxy(AppmeshVirtualNodeSpecListener.Jsii$Proxy.class)
public interface AppmeshVirtualNodeSpecListener extends software.amazon.jsii.JsiiSerializable {

    /**
     * port_mapping block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.AppmeshVirtualNodeSpecListenerPortMapping> getPortMapping();

    /**
     * health_check block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AppmeshVirtualNodeSpecListenerHealthCheck> getHealthCheck() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AppmeshVirtualNodeSpecListener}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppmeshVirtualNodeSpecListener}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppmeshVirtualNodeSpecListener> {
        private java.util.List<imports.aws.AppmeshVirtualNodeSpecListenerPortMapping> portMapping;
        private java.util.List<imports.aws.AppmeshVirtualNodeSpecListenerHealthCheck> healthCheck;

        /**
         * Sets the value of {@link AppmeshVirtualNodeSpecListener#getPortMapping}
         * @param portMapping port_mapping block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder portMapping(java.util.List<? extends imports.aws.AppmeshVirtualNodeSpecListenerPortMapping> portMapping) {
            this.portMapping = (java.util.List<imports.aws.AppmeshVirtualNodeSpecListenerPortMapping>)portMapping;
            return this;
        }

        /**
         * Sets the value of {@link AppmeshVirtualNodeSpecListener#getHealthCheck}
         * @param healthCheck health_check block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder healthCheck(java.util.List<? extends imports.aws.AppmeshVirtualNodeSpecListenerHealthCheck> healthCheck) {
            this.healthCheck = (java.util.List<imports.aws.AppmeshVirtualNodeSpecListenerHealthCheck>)healthCheck;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppmeshVirtualNodeSpecListener}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppmeshVirtualNodeSpecListener build() {
            return new Jsii$Proxy(portMapping, healthCheck);
        }
    }

    /**
     * An implementation for {@link AppmeshVirtualNodeSpecListener}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppmeshVirtualNodeSpecListener {
        private final java.util.List<imports.aws.AppmeshVirtualNodeSpecListenerPortMapping> portMapping;
        private final java.util.List<imports.aws.AppmeshVirtualNodeSpecListenerHealthCheck> healthCheck;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.portMapping = software.amazon.jsii.Kernel.get(this, "portMapping", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppmeshVirtualNodeSpecListenerPortMapping.class)));
            this.healthCheck = software.amazon.jsii.Kernel.get(this, "healthCheck", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AppmeshVirtualNodeSpecListenerHealthCheck.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.AppmeshVirtualNodeSpecListenerPortMapping> portMapping, final java.util.List<? extends imports.aws.AppmeshVirtualNodeSpecListenerHealthCheck> healthCheck) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.portMapping = (java.util.List<imports.aws.AppmeshVirtualNodeSpecListenerPortMapping>)java.util.Objects.requireNonNull(portMapping, "portMapping is required");
            this.healthCheck = (java.util.List<imports.aws.AppmeshVirtualNodeSpecListenerHealthCheck>)healthCheck;
        }

        @Override
        public final java.util.List<imports.aws.AppmeshVirtualNodeSpecListenerPortMapping> getPortMapping() {
            return this.portMapping;
        }

        @Override
        public final java.util.List<imports.aws.AppmeshVirtualNodeSpecListenerHealthCheck> getHealthCheck() {
            return this.healthCheck;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("portMapping", om.valueToTree(this.getPortMapping()));
            if (this.getHealthCheck() != null) {
                data.set("healthCheck", om.valueToTree(this.getHealthCheck()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.AppmeshVirtualNodeSpecListener"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppmeshVirtualNodeSpecListener.Jsii$Proxy that = (AppmeshVirtualNodeSpecListener.Jsii$Proxy) o;

            if (!portMapping.equals(that.portMapping)) return false;
            return this.healthCheck != null ? this.healthCheck.equals(that.healthCheck) : that.healthCheck == null;
        }

        @Override
        public final int hashCode() {
            int result = this.portMapping.hashCode();
            result = 31 * result + (this.healthCheck != null ? this.healthCheck.hashCode() : 0);
            return result;
        }
    }
}
