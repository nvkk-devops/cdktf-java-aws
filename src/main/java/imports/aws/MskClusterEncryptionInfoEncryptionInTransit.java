package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.721Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.MskClusterEncryptionInfoEncryptionInTransit")
@software.amazon.jsii.Jsii.Proxy(MskClusterEncryptionInfoEncryptionInTransit.Jsii$Proxy.class)
public interface MskClusterEncryptionInfoEncryptionInTransit extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.String getClientBroker() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getInCluster() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link MskClusterEncryptionInfoEncryptionInTransit}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MskClusterEncryptionInfoEncryptionInTransit}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MskClusterEncryptionInfoEncryptionInTransit> {
        private java.lang.String clientBroker;
        private java.lang.Boolean inCluster;

        /**
         * Sets the value of {@link MskClusterEncryptionInfoEncryptionInTransit#getClientBroker}
         * @param clientBroker the value to be set.
         * @return {@code this}
         */
        public Builder clientBroker(java.lang.String clientBroker) {
            this.clientBroker = clientBroker;
            return this;
        }

        /**
         * Sets the value of {@link MskClusterEncryptionInfoEncryptionInTransit#getInCluster}
         * @param inCluster the value to be set.
         * @return {@code this}
         */
        public Builder inCluster(java.lang.Boolean inCluster) {
            this.inCluster = inCluster;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link MskClusterEncryptionInfoEncryptionInTransit}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MskClusterEncryptionInfoEncryptionInTransit build() {
            return new Jsii$Proxy(clientBroker, inCluster);
        }
    }

    /**
     * An implementation for {@link MskClusterEncryptionInfoEncryptionInTransit}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MskClusterEncryptionInfoEncryptionInTransit {
        private final java.lang.String clientBroker;
        private final java.lang.Boolean inCluster;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.clientBroker = software.amazon.jsii.Kernel.get(this, "clientBroker", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.inCluster = software.amazon.jsii.Kernel.get(this, "inCluster", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String clientBroker, final java.lang.Boolean inCluster) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.clientBroker = clientBroker;
            this.inCluster = inCluster;
        }

        @Override
        public final java.lang.String getClientBroker() {
            return this.clientBroker;
        }

        @Override
        public final java.lang.Boolean getInCluster() {
            return this.inCluster;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getClientBroker() != null) {
                data.set("clientBroker", om.valueToTree(this.getClientBroker()));
            }
            if (this.getInCluster() != null) {
                data.set("inCluster", om.valueToTree(this.getInCluster()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.MskClusterEncryptionInfoEncryptionInTransit"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MskClusterEncryptionInfoEncryptionInTransit.Jsii$Proxy that = (MskClusterEncryptionInfoEncryptionInTransit.Jsii$Proxy) o;

            if (this.clientBroker != null ? !this.clientBroker.equals(that.clientBroker) : that.clientBroker != null) return false;
            return this.inCluster != null ? this.inCluster.equals(that.inCluster) : that.inCluster == null;
        }

        @Override
        public final int hashCode() {
            int result = this.clientBroker != null ? this.clientBroker.hashCode() : 0;
            result = 31 * result + (this.inCluster != null ? this.inCluster.hashCode() : 0);
            return result;
        }
    }
}
