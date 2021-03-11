package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.125Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CloudfrontDistributionRestrictions")
@software.amazon.jsii.Jsii.Proxy(CloudfrontDistributionRestrictions.Jsii$Proxy.class)
public interface CloudfrontDistributionRestrictions extends software.amazon.jsii.JsiiSerializable {

    /**
     * geo_restriction block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CloudfrontDistributionRestrictionsGeoRestriction> getGeoRestriction();

    /**
     * @return a {@link Builder} of {@link CloudfrontDistributionRestrictions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CloudfrontDistributionRestrictions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CloudfrontDistributionRestrictions> {
        private java.util.List<imports.aws.CloudfrontDistributionRestrictionsGeoRestriction> geoRestriction;

        /**
         * Sets the value of {@link CloudfrontDistributionRestrictions#getGeoRestriction}
         * @param geoRestriction geo_restriction block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder geoRestriction(java.util.List<? extends imports.aws.CloudfrontDistributionRestrictionsGeoRestriction> geoRestriction) {
            this.geoRestriction = (java.util.List<imports.aws.CloudfrontDistributionRestrictionsGeoRestriction>)geoRestriction;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CloudfrontDistributionRestrictions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CloudfrontDistributionRestrictions build() {
            return new Jsii$Proxy(geoRestriction);
        }
    }

    /**
     * An implementation for {@link CloudfrontDistributionRestrictions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CloudfrontDistributionRestrictions {
        private final java.util.List<imports.aws.CloudfrontDistributionRestrictionsGeoRestriction> geoRestriction;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.geoRestriction = software.amazon.jsii.Kernel.get(this, "geoRestriction", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CloudfrontDistributionRestrictionsGeoRestriction.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.CloudfrontDistributionRestrictionsGeoRestriction> geoRestriction) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.geoRestriction = (java.util.List<imports.aws.CloudfrontDistributionRestrictionsGeoRestriction>)java.util.Objects.requireNonNull(geoRestriction, "geoRestriction is required");
        }

        @Override
        public final java.util.List<imports.aws.CloudfrontDistributionRestrictionsGeoRestriction> getGeoRestriction() {
            return this.geoRestriction;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("geoRestriction", om.valueToTree(this.getGeoRestriction()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.CloudfrontDistributionRestrictions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CloudfrontDistributionRestrictions.Jsii$Proxy that = (CloudfrontDistributionRestrictions.Jsii$Proxy) o;

            return this.geoRestriction.equals(that.geoRestriction);
        }

        @Override
        public final int hashCode() {
            int result = this.geoRestriction.hashCode();
            return result;
        }
    }
}
