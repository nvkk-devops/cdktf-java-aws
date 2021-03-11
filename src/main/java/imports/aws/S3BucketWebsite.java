package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.839Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.S3BucketWebsite")
@software.amazon.jsii.Jsii.Proxy(S3BucketWebsite.Jsii$Proxy.class)
public interface S3BucketWebsite extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.String getErrorDocument() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getIndexDocument() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getRedirectAllRequestsTo() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getRoutingRules() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link S3BucketWebsite}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link S3BucketWebsite}
     */
    public static final class Builder implements software.amazon.jsii.Builder<S3BucketWebsite> {
        private java.lang.String errorDocument;
        private java.lang.String indexDocument;
        private java.lang.String redirectAllRequestsTo;
        private java.lang.String routingRules;

        /**
         * Sets the value of {@link S3BucketWebsite#getErrorDocument}
         * @param errorDocument the value to be set.
         * @return {@code this}
         */
        public Builder errorDocument(java.lang.String errorDocument) {
            this.errorDocument = errorDocument;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketWebsite#getIndexDocument}
         * @param indexDocument the value to be set.
         * @return {@code this}
         */
        public Builder indexDocument(java.lang.String indexDocument) {
            this.indexDocument = indexDocument;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketWebsite#getRedirectAllRequestsTo}
         * @param redirectAllRequestsTo the value to be set.
         * @return {@code this}
         */
        public Builder redirectAllRequestsTo(java.lang.String redirectAllRequestsTo) {
            this.redirectAllRequestsTo = redirectAllRequestsTo;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketWebsite#getRoutingRules}
         * @param routingRules the value to be set.
         * @return {@code this}
         */
        public Builder routingRules(java.lang.String routingRules) {
            this.routingRules = routingRules;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link S3BucketWebsite}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public S3BucketWebsite build() {
            return new Jsii$Proxy(errorDocument, indexDocument, redirectAllRequestsTo, routingRules);
        }
    }

    /**
     * An implementation for {@link S3BucketWebsite}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements S3BucketWebsite {
        private final java.lang.String errorDocument;
        private final java.lang.String indexDocument;
        private final java.lang.String redirectAllRequestsTo;
        private final java.lang.String routingRules;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.errorDocument = software.amazon.jsii.Kernel.get(this, "errorDocument", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.indexDocument = software.amazon.jsii.Kernel.get(this, "indexDocument", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.redirectAllRequestsTo = software.amazon.jsii.Kernel.get(this, "redirectAllRequestsTo", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.routingRules = software.amazon.jsii.Kernel.get(this, "routingRules", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String errorDocument, final java.lang.String indexDocument, final java.lang.String redirectAllRequestsTo, final java.lang.String routingRules) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.errorDocument = errorDocument;
            this.indexDocument = indexDocument;
            this.redirectAllRequestsTo = redirectAllRequestsTo;
            this.routingRules = routingRules;
        }

        @Override
        public final java.lang.String getErrorDocument() {
            return this.errorDocument;
        }

        @Override
        public final java.lang.String getIndexDocument() {
            return this.indexDocument;
        }

        @Override
        public final java.lang.String getRedirectAllRequestsTo() {
            return this.redirectAllRequestsTo;
        }

        @Override
        public final java.lang.String getRoutingRules() {
            return this.routingRules;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getErrorDocument() != null) {
                data.set("errorDocument", om.valueToTree(this.getErrorDocument()));
            }
            if (this.getIndexDocument() != null) {
                data.set("indexDocument", om.valueToTree(this.getIndexDocument()));
            }
            if (this.getRedirectAllRequestsTo() != null) {
                data.set("redirectAllRequestsTo", om.valueToTree(this.getRedirectAllRequestsTo()));
            }
            if (this.getRoutingRules() != null) {
                data.set("routingRules", om.valueToTree(this.getRoutingRules()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.S3BucketWebsite"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            S3BucketWebsite.Jsii$Proxy that = (S3BucketWebsite.Jsii$Proxy) o;

            if (this.errorDocument != null ? !this.errorDocument.equals(that.errorDocument) : that.errorDocument != null) return false;
            if (this.indexDocument != null ? !this.indexDocument.equals(that.indexDocument) : that.indexDocument != null) return false;
            if (this.redirectAllRequestsTo != null ? !this.redirectAllRequestsTo.equals(that.redirectAllRequestsTo) : that.redirectAllRequestsTo != null) return false;
            return this.routingRules != null ? this.routingRules.equals(that.routingRules) : that.routingRules == null;
        }

        @Override
        public final int hashCode() {
            int result = this.errorDocument != null ? this.errorDocument.hashCode() : 0;
            result = 31 * result + (this.indexDocument != null ? this.indexDocument.hashCode() : 0);
            result = 31 * result + (this.redirectAllRequestsTo != null ? this.redirectAllRequestsTo.hashCode() : 0);
            result = 31 * result + (this.routingRules != null ? this.routingRules.hashCode() : 0);
            return result;
        }
    }
}
