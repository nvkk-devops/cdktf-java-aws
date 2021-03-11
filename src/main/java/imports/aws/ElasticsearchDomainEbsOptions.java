package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.554Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.ElasticsearchDomainEbsOptions")
@software.amazon.jsii.Jsii.Proxy(ElasticsearchDomainEbsOptions.Jsii$Proxy.class)
public interface ElasticsearchDomainEbsOptions extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.Boolean getEbsEnabled();

    default @org.jetbrains.annotations.Nullable java.lang.Number getIops() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getVolumeSize() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getVolumeType() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ElasticsearchDomainEbsOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ElasticsearchDomainEbsOptions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ElasticsearchDomainEbsOptions> {
        private java.lang.Boolean ebsEnabled;
        private java.lang.Number iops;
        private java.lang.Number volumeSize;
        private java.lang.String volumeType;

        /**
         * Sets the value of {@link ElasticsearchDomainEbsOptions#getEbsEnabled}
         * @param ebsEnabled the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder ebsEnabled(java.lang.Boolean ebsEnabled) {
            this.ebsEnabled = ebsEnabled;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchDomainEbsOptions#getIops}
         * @param iops the value to be set.
         * @return {@code this}
         */
        public Builder iops(java.lang.Number iops) {
            this.iops = iops;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchDomainEbsOptions#getVolumeSize}
         * @param volumeSize the value to be set.
         * @return {@code this}
         */
        public Builder volumeSize(java.lang.Number volumeSize) {
            this.volumeSize = volumeSize;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchDomainEbsOptions#getVolumeType}
         * @param volumeType the value to be set.
         * @return {@code this}
         */
        public Builder volumeType(java.lang.String volumeType) {
            this.volumeType = volumeType;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ElasticsearchDomainEbsOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ElasticsearchDomainEbsOptions build() {
            return new Jsii$Proxy(ebsEnabled, iops, volumeSize, volumeType);
        }
    }

    /**
     * An implementation for {@link ElasticsearchDomainEbsOptions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ElasticsearchDomainEbsOptions {
        private final java.lang.Boolean ebsEnabled;
        private final java.lang.Number iops;
        private final java.lang.Number volumeSize;
        private final java.lang.String volumeType;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.ebsEnabled = software.amazon.jsii.Kernel.get(this, "ebsEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.iops = software.amazon.jsii.Kernel.get(this, "iops", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.volumeSize = software.amazon.jsii.Kernel.get(this, "volumeSize", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.volumeType = software.amazon.jsii.Kernel.get(this, "volumeType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.Boolean ebsEnabled, final java.lang.Number iops, final java.lang.Number volumeSize, final java.lang.String volumeType) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.ebsEnabled = java.util.Objects.requireNonNull(ebsEnabled, "ebsEnabled is required");
            this.iops = iops;
            this.volumeSize = volumeSize;
            this.volumeType = volumeType;
        }

        @Override
        public final java.lang.Boolean getEbsEnabled() {
            return this.ebsEnabled;
        }

        @Override
        public final java.lang.Number getIops() {
            return this.iops;
        }

        @Override
        public final java.lang.Number getVolumeSize() {
            return this.volumeSize;
        }

        @Override
        public final java.lang.String getVolumeType() {
            return this.volumeType;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("ebsEnabled", om.valueToTree(this.getEbsEnabled()));
            if (this.getIops() != null) {
                data.set("iops", om.valueToTree(this.getIops()));
            }
            if (this.getVolumeSize() != null) {
                data.set("volumeSize", om.valueToTree(this.getVolumeSize()));
            }
            if (this.getVolumeType() != null) {
                data.set("volumeType", om.valueToTree(this.getVolumeType()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.ElasticsearchDomainEbsOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ElasticsearchDomainEbsOptions.Jsii$Proxy that = (ElasticsearchDomainEbsOptions.Jsii$Proxy) o;

            if (!ebsEnabled.equals(that.ebsEnabled)) return false;
            if (this.iops != null ? !this.iops.equals(that.iops) : that.iops != null) return false;
            if (this.volumeSize != null ? !this.volumeSize.equals(that.volumeSize) : that.volumeSize != null) return false;
            return this.volumeType != null ? this.volumeType.equals(that.volumeType) : that.volumeType == null;
        }

        @Override
        public final int hashCode() {
            int result = this.ebsEnabled.hashCode();
            result = 31 * result + (this.iops != null ? this.iops.hashCode() : 0);
            result = 31 * result + (this.volumeSize != null ? this.volumeSize.hashCode() : 0);
            result = 31 * result + (this.volumeType != null ? this.volumeType.hashCode() : 0);
            return result;
        }
    }
}
