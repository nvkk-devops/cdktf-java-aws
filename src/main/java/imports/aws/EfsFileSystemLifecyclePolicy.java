package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.527Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.EfsFileSystemLifecyclePolicy")
@software.amazon.jsii.Jsii.Proxy(EfsFileSystemLifecyclePolicy.Jsii$Proxy.class)
public interface EfsFileSystemLifecyclePolicy extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getTransitionToIa();

    /**
     * @return a {@link Builder} of {@link EfsFileSystemLifecyclePolicy}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link EfsFileSystemLifecyclePolicy}
     */
    public static final class Builder implements software.amazon.jsii.Builder<EfsFileSystemLifecyclePolicy> {
        private java.lang.String transitionToIa;

        /**
         * Sets the value of {@link EfsFileSystemLifecyclePolicy#getTransitionToIa}
         * @param transitionToIa the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder transitionToIa(java.lang.String transitionToIa) {
            this.transitionToIa = transitionToIa;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link EfsFileSystemLifecyclePolicy}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public EfsFileSystemLifecyclePolicy build() {
            return new Jsii$Proxy(transitionToIa);
        }
    }

    /**
     * An implementation for {@link EfsFileSystemLifecyclePolicy}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements EfsFileSystemLifecyclePolicy {
        private final java.lang.String transitionToIa;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.transitionToIa = software.amazon.jsii.Kernel.get(this, "transitionToIa", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String transitionToIa) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.transitionToIa = java.util.Objects.requireNonNull(transitionToIa, "transitionToIa is required");
        }

        @Override
        public final java.lang.String getTransitionToIa() {
            return this.transitionToIa;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("transitionToIa", om.valueToTree(this.getTransitionToIa()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.EfsFileSystemLifecyclePolicy"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EfsFileSystemLifecyclePolicy.Jsii$Proxy that = (EfsFileSystemLifecyclePolicy.Jsii$Proxy) o;

            return this.transitionToIa.equals(that.transitionToIa);
        }

        @Override
        public final int hashCode() {
            int result = this.transitionToIa.hashCode();
            return result;
        }
    }
}
