package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.828Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.S3AccessPointPublicAccessBlockConfiguration")
@software.amazon.jsii.Jsii.Proxy(S3AccessPointPublicAccessBlockConfiguration.Jsii$Proxy.class)
public interface S3AccessPointPublicAccessBlockConfiguration extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getBlockPublicAcls() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getBlockPublicPolicy() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getIgnorePublicAcls() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getRestrictPublicBuckets() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link S3AccessPointPublicAccessBlockConfiguration}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link S3AccessPointPublicAccessBlockConfiguration}
     */
    public static final class Builder implements software.amazon.jsii.Builder<S3AccessPointPublicAccessBlockConfiguration> {
        private java.lang.Boolean blockPublicAcls;
        private java.lang.Boolean blockPublicPolicy;
        private java.lang.Boolean ignorePublicAcls;
        private java.lang.Boolean restrictPublicBuckets;

        /**
         * Sets the value of {@link S3AccessPointPublicAccessBlockConfiguration#getBlockPublicAcls}
         * @param blockPublicAcls the value to be set.
         * @return {@code this}
         */
        public Builder blockPublicAcls(java.lang.Boolean blockPublicAcls) {
            this.blockPublicAcls = blockPublicAcls;
            return this;
        }

        /**
         * Sets the value of {@link S3AccessPointPublicAccessBlockConfiguration#getBlockPublicPolicy}
         * @param blockPublicPolicy the value to be set.
         * @return {@code this}
         */
        public Builder blockPublicPolicy(java.lang.Boolean blockPublicPolicy) {
            this.blockPublicPolicy = blockPublicPolicy;
            return this;
        }

        /**
         * Sets the value of {@link S3AccessPointPublicAccessBlockConfiguration#getIgnorePublicAcls}
         * @param ignorePublicAcls the value to be set.
         * @return {@code this}
         */
        public Builder ignorePublicAcls(java.lang.Boolean ignorePublicAcls) {
            this.ignorePublicAcls = ignorePublicAcls;
            return this;
        }

        /**
         * Sets the value of {@link S3AccessPointPublicAccessBlockConfiguration#getRestrictPublicBuckets}
         * @param restrictPublicBuckets the value to be set.
         * @return {@code this}
         */
        public Builder restrictPublicBuckets(java.lang.Boolean restrictPublicBuckets) {
            this.restrictPublicBuckets = restrictPublicBuckets;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link S3AccessPointPublicAccessBlockConfiguration}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public S3AccessPointPublicAccessBlockConfiguration build() {
            return new Jsii$Proxy(blockPublicAcls, blockPublicPolicy, ignorePublicAcls, restrictPublicBuckets);
        }
    }

    /**
     * An implementation for {@link S3AccessPointPublicAccessBlockConfiguration}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements S3AccessPointPublicAccessBlockConfiguration {
        private final java.lang.Boolean blockPublicAcls;
        private final java.lang.Boolean blockPublicPolicy;
        private final java.lang.Boolean ignorePublicAcls;
        private final java.lang.Boolean restrictPublicBuckets;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.blockPublicAcls = software.amazon.jsii.Kernel.get(this, "blockPublicAcls", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.blockPublicPolicy = software.amazon.jsii.Kernel.get(this, "blockPublicPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.ignorePublicAcls = software.amazon.jsii.Kernel.get(this, "ignorePublicAcls", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.restrictPublicBuckets = software.amazon.jsii.Kernel.get(this, "restrictPublicBuckets", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.Boolean blockPublicAcls, final java.lang.Boolean blockPublicPolicy, final java.lang.Boolean ignorePublicAcls, final java.lang.Boolean restrictPublicBuckets) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.blockPublicAcls = blockPublicAcls;
            this.blockPublicPolicy = blockPublicPolicy;
            this.ignorePublicAcls = ignorePublicAcls;
            this.restrictPublicBuckets = restrictPublicBuckets;
        }

        @Override
        public final java.lang.Boolean getBlockPublicAcls() {
            return this.blockPublicAcls;
        }

        @Override
        public final java.lang.Boolean getBlockPublicPolicy() {
            return this.blockPublicPolicy;
        }

        @Override
        public final java.lang.Boolean getIgnorePublicAcls() {
            return this.ignorePublicAcls;
        }

        @Override
        public final java.lang.Boolean getRestrictPublicBuckets() {
            return this.restrictPublicBuckets;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getBlockPublicAcls() != null) {
                data.set("blockPublicAcls", om.valueToTree(this.getBlockPublicAcls()));
            }
            if (this.getBlockPublicPolicy() != null) {
                data.set("blockPublicPolicy", om.valueToTree(this.getBlockPublicPolicy()));
            }
            if (this.getIgnorePublicAcls() != null) {
                data.set("ignorePublicAcls", om.valueToTree(this.getIgnorePublicAcls()));
            }
            if (this.getRestrictPublicBuckets() != null) {
                data.set("restrictPublicBuckets", om.valueToTree(this.getRestrictPublicBuckets()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.S3AccessPointPublicAccessBlockConfiguration"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            S3AccessPointPublicAccessBlockConfiguration.Jsii$Proxy that = (S3AccessPointPublicAccessBlockConfiguration.Jsii$Proxy) o;

            if (this.blockPublicAcls != null ? !this.blockPublicAcls.equals(that.blockPublicAcls) : that.blockPublicAcls != null) return false;
            if (this.blockPublicPolicy != null ? !this.blockPublicPolicy.equals(that.blockPublicPolicy) : that.blockPublicPolicy != null) return false;
            if (this.ignorePublicAcls != null ? !this.ignorePublicAcls.equals(that.ignorePublicAcls) : that.ignorePublicAcls != null) return false;
            return this.restrictPublicBuckets != null ? this.restrictPublicBuckets.equals(that.restrictPublicBuckets) : that.restrictPublicBuckets == null;
        }

        @Override
        public final int hashCode() {
            int result = this.blockPublicAcls != null ? this.blockPublicAcls.hashCode() : 0;
            result = 31 * result + (this.blockPublicPolicy != null ? this.blockPublicPolicy.hashCode() : 0);
            result = 31 * result + (this.ignorePublicAcls != null ? this.ignorePublicAcls.hashCode() : 0);
            result = 31 * result + (this.restrictPublicBuckets != null ? this.restrictPublicBuckets.hashCode() : 0);
            return result;
        }
    }
}
