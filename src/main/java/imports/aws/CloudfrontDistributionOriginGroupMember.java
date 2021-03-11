package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.125Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CloudfrontDistributionOriginGroupMember")
@software.amazon.jsii.Jsii.Proxy(CloudfrontDistributionOriginGroupMember.Jsii$Proxy.class)
public interface CloudfrontDistributionOriginGroupMember extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getOriginId();

    /**
     * @return a {@link Builder} of {@link CloudfrontDistributionOriginGroupMember}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CloudfrontDistributionOriginGroupMember}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CloudfrontDistributionOriginGroupMember> {
        private java.lang.String originId;

        /**
         * Sets the value of {@link CloudfrontDistributionOriginGroupMember#getOriginId}
         * @param originId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder originId(java.lang.String originId) {
            this.originId = originId;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CloudfrontDistributionOriginGroupMember}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CloudfrontDistributionOriginGroupMember build() {
            return new Jsii$Proxy(originId);
        }
    }

    /**
     * An implementation for {@link CloudfrontDistributionOriginGroupMember}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CloudfrontDistributionOriginGroupMember {
        private final java.lang.String originId;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.originId = software.amazon.jsii.Kernel.get(this, "originId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String originId) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.originId = java.util.Objects.requireNonNull(originId, "originId is required");
        }

        @Override
        public final java.lang.String getOriginId() {
            return this.originId;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("originId", om.valueToTree(this.getOriginId()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.CloudfrontDistributionOriginGroupMember"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CloudfrontDistributionOriginGroupMember.Jsii$Proxy that = (CloudfrontDistributionOriginGroupMember.Jsii$Proxy) o;

            return this.originId.equals(that.originId);
        }

        @Override
        public final int hashCode() {
            int result = this.originId.hashCode();
            return result;
        }
    }
}
