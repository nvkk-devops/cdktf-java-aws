package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.692Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.LaunchTemplateCreditSpecification")
@software.amazon.jsii.Jsii.Proxy(LaunchTemplateCreditSpecification.Jsii$Proxy.class)
public interface LaunchTemplateCreditSpecification extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.String getCpuCredits() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link LaunchTemplateCreditSpecification}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LaunchTemplateCreditSpecification}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LaunchTemplateCreditSpecification> {
        private java.lang.String cpuCredits;

        /**
         * Sets the value of {@link LaunchTemplateCreditSpecification#getCpuCredits}
         * @param cpuCredits the value to be set.
         * @return {@code this}
         */
        public Builder cpuCredits(java.lang.String cpuCredits) {
            this.cpuCredits = cpuCredits;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link LaunchTemplateCreditSpecification}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LaunchTemplateCreditSpecification build() {
            return new Jsii$Proxy(cpuCredits);
        }
    }

    /**
     * An implementation for {@link LaunchTemplateCreditSpecification}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LaunchTemplateCreditSpecification {
        private final java.lang.String cpuCredits;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.cpuCredits = software.amazon.jsii.Kernel.get(this, "cpuCredits", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String cpuCredits) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.cpuCredits = cpuCredits;
        }

        @Override
        public final java.lang.String getCpuCredits() {
            return this.cpuCredits;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getCpuCredits() != null) {
                data.set("cpuCredits", om.valueToTree(this.getCpuCredits()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.LaunchTemplateCreditSpecification"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LaunchTemplateCreditSpecification.Jsii$Proxy that = (LaunchTemplateCreditSpecification.Jsii$Proxy) o;

            return this.cpuCredits != null ? this.cpuCredits.equals(that.cpuCredits) : that.cpuCredits == null;
        }

        @Override
        public final int hashCode() {
            int result = this.cpuCredits != null ? this.cpuCredits.hashCode() : 0;
            return result;
        }
    }
}
