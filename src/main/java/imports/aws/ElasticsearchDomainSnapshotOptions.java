package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.555Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.ElasticsearchDomainSnapshotOptions")
@software.amazon.jsii.Jsii.Proxy(ElasticsearchDomainSnapshotOptions.Jsii$Proxy.class)
public interface ElasticsearchDomainSnapshotOptions extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.Number getAutomatedSnapshotStartHour();

    /**
     * @return a {@link Builder} of {@link ElasticsearchDomainSnapshotOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ElasticsearchDomainSnapshotOptions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ElasticsearchDomainSnapshotOptions> {
        private java.lang.Number automatedSnapshotStartHour;

        /**
         * Sets the value of {@link ElasticsearchDomainSnapshotOptions#getAutomatedSnapshotStartHour}
         * @param automatedSnapshotStartHour the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder automatedSnapshotStartHour(java.lang.Number automatedSnapshotStartHour) {
            this.automatedSnapshotStartHour = automatedSnapshotStartHour;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ElasticsearchDomainSnapshotOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ElasticsearchDomainSnapshotOptions build() {
            return new Jsii$Proxy(automatedSnapshotStartHour);
        }
    }

    /**
     * An implementation for {@link ElasticsearchDomainSnapshotOptions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ElasticsearchDomainSnapshotOptions {
        private final java.lang.Number automatedSnapshotStartHour;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.automatedSnapshotStartHour = software.amazon.jsii.Kernel.get(this, "automatedSnapshotStartHour", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.Number automatedSnapshotStartHour) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.automatedSnapshotStartHour = java.util.Objects.requireNonNull(automatedSnapshotStartHour, "automatedSnapshotStartHour is required");
        }

        @Override
        public final java.lang.Number getAutomatedSnapshotStartHour() {
            return this.automatedSnapshotStartHour;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("automatedSnapshotStartHour", om.valueToTree(this.getAutomatedSnapshotStartHour()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.ElasticsearchDomainSnapshotOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ElasticsearchDomainSnapshotOptions.Jsii$Proxy that = (ElasticsearchDomainSnapshotOptions.Jsii$Proxy) o;

            return this.automatedSnapshotStartHour.equals(that.automatedSnapshotStartHour);
        }

        @Override
        public final int hashCode() {
            int result = this.automatedSnapshotStartHour.hashCode();
            return result;
        }
    }
}
