package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.709Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.MacieS3BucketAssociationClassificationType")
@software.amazon.jsii.Jsii.Proxy(MacieS3BucketAssociationClassificationType.Jsii$Proxy.class)
public interface MacieS3BucketAssociationClassificationType extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.String getContinuous() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getOneTime() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link MacieS3BucketAssociationClassificationType}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MacieS3BucketAssociationClassificationType}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MacieS3BucketAssociationClassificationType> {
        private java.lang.String continuous;
        private java.lang.String oneTime;

        /**
         * Sets the value of {@link MacieS3BucketAssociationClassificationType#getContinuous}
         * @param continuous the value to be set.
         * @return {@code this}
         */
        public Builder continuous(java.lang.String continuous) {
            this.continuous = continuous;
            return this;
        }

        /**
         * Sets the value of {@link MacieS3BucketAssociationClassificationType#getOneTime}
         * @param oneTime the value to be set.
         * @return {@code this}
         */
        public Builder oneTime(java.lang.String oneTime) {
            this.oneTime = oneTime;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link MacieS3BucketAssociationClassificationType}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MacieS3BucketAssociationClassificationType build() {
            return new Jsii$Proxy(continuous, oneTime);
        }
    }

    /**
     * An implementation for {@link MacieS3BucketAssociationClassificationType}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MacieS3BucketAssociationClassificationType {
        private final java.lang.String continuous;
        private final java.lang.String oneTime;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.continuous = software.amazon.jsii.Kernel.get(this, "continuous", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.oneTime = software.amazon.jsii.Kernel.get(this, "oneTime", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String continuous, final java.lang.String oneTime) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.continuous = continuous;
            this.oneTime = oneTime;
        }

        @Override
        public final java.lang.String getContinuous() {
            return this.continuous;
        }

        @Override
        public final java.lang.String getOneTime() {
            return this.oneTime;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getContinuous() != null) {
                data.set("continuous", om.valueToTree(this.getContinuous()));
            }
            if (this.getOneTime() != null) {
                data.set("oneTime", om.valueToTree(this.getOneTime()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.MacieS3BucketAssociationClassificationType"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MacieS3BucketAssociationClassificationType.Jsii$Proxy that = (MacieS3BucketAssociationClassificationType.Jsii$Proxy) o;

            if (this.continuous != null ? !this.continuous.equals(that.continuous) : that.continuous != null) return false;
            return this.oneTime != null ? this.oneTime.equals(that.oneTime) : that.oneTime == null;
        }

        @Override
        public final int hashCode() {
            int result = this.continuous != null ? this.continuous.hashCode() : 0;
            result = 31 * result + (this.oneTime != null ? this.oneTime.hashCode() : 0);
            return result;
        }
    }
}
