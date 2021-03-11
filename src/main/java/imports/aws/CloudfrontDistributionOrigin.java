package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.123Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CloudfrontDistributionOrigin")
@software.amazon.jsii.Jsii.Proxy(CloudfrontDistributionOrigin.Jsii$Proxy.class)
public interface CloudfrontDistributionOrigin extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getDomainName();

    @org.jetbrains.annotations.NotNull java.lang.String getOriginId();

    /**
     * custom_header block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CloudfrontDistributionOriginCustomHeader> getCustomHeader() {
        return null;
    }

    /**
     * custom_origin_config block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CloudfrontDistributionOriginCustomOriginConfig> getCustomOriginConfig() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getOriginPath() {
        return null;
    }

    /**
     * s3_origin_config block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CloudfrontDistributionOriginS3OriginConfig> getS3OriginConfig() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CloudfrontDistributionOrigin}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CloudfrontDistributionOrigin}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CloudfrontDistributionOrigin> {
        private java.lang.String domainName;
        private java.lang.String originId;
        private java.util.List<imports.aws.CloudfrontDistributionOriginCustomHeader> customHeader;
        private java.util.List<imports.aws.CloudfrontDistributionOriginCustomOriginConfig> customOriginConfig;
        private java.lang.String originPath;
        private java.util.List<imports.aws.CloudfrontDistributionOriginS3OriginConfig> s3OriginConfig;

        /**
         * Sets the value of {@link CloudfrontDistributionOrigin#getDomainName}
         * @param domainName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder domainName(java.lang.String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionOrigin#getOriginId}
         * @param originId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder originId(java.lang.String originId) {
            this.originId = originId;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionOrigin#getCustomHeader}
         * @param customHeader custom_header block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder customHeader(java.util.List<? extends imports.aws.CloudfrontDistributionOriginCustomHeader> customHeader) {
            this.customHeader = (java.util.List<imports.aws.CloudfrontDistributionOriginCustomHeader>)customHeader;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionOrigin#getCustomOriginConfig}
         * @param customOriginConfig custom_origin_config block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder customOriginConfig(java.util.List<? extends imports.aws.CloudfrontDistributionOriginCustomOriginConfig> customOriginConfig) {
            this.customOriginConfig = (java.util.List<imports.aws.CloudfrontDistributionOriginCustomOriginConfig>)customOriginConfig;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionOrigin#getOriginPath}
         * @param originPath the value to be set.
         * @return {@code this}
         */
        public Builder originPath(java.lang.String originPath) {
            this.originPath = originPath;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionOrigin#getS3OriginConfig}
         * @param s3OriginConfig s3_origin_config block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder s3OriginConfig(java.util.List<? extends imports.aws.CloudfrontDistributionOriginS3OriginConfig> s3OriginConfig) {
            this.s3OriginConfig = (java.util.List<imports.aws.CloudfrontDistributionOriginS3OriginConfig>)s3OriginConfig;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CloudfrontDistributionOrigin}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CloudfrontDistributionOrigin build() {
            return new Jsii$Proxy(domainName, originId, customHeader, customOriginConfig, originPath, s3OriginConfig);
        }
    }

    /**
     * An implementation for {@link CloudfrontDistributionOrigin}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CloudfrontDistributionOrigin {
        private final java.lang.String domainName;
        private final java.lang.String originId;
        private final java.util.List<imports.aws.CloudfrontDistributionOriginCustomHeader> customHeader;
        private final java.util.List<imports.aws.CloudfrontDistributionOriginCustomOriginConfig> customOriginConfig;
        private final java.lang.String originPath;
        private final java.util.List<imports.aws.CloudfrontDistributionOriginS3OriginConfig> s3OriginConfig;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.domainName = software.amazon.jsii.Kernel.get(this, "domainName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.originId = software.amazon.jsii.Kernel.get(this, "originId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.customHeader = software.amazon.jsii.Kernel.get(this, "customHeader", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CloudfrontDistributionOriginCustomHeader.class)));
            this.customOriginConfig = software.amazon.jsii.Kernel.get(this, "customOriginConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CloudfrontDistributionOriginCustomOriginConfig.class)));
            this.originPath = software.amazon.jsii.Kernel.get(this, "originPath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.s3OriginConfig = software.amazon.jsii.Kernel.get(this, "s3OriginConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CloudfrontDistributionOriginS3OriginConfig.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String domainName, final java.lang.String originId, final java.util.List<? extends imports.aws.CloudfrontDistributionOriginCustomHeader> customHeader, final java.util.List<? extends imports.aws.CloudfrontDistributionOriginCustomOriginConfig> customOriginConfig, final java.lang.String originPath, final java.util.List<? extends imports.aws.CloudfrontDistributionOriginS3OriginConfig> s3OriginConfig) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.domainName = java.util.Objects.requireNonNull(domainName, "domainName is required");
            this.originId = java.util.Objects.requireNonNull(originId, "originId is required");
            this.customHeader = (java.util.List<imports.aws.CloudfrontDistributionOriginCustomHeader>)customHeader;
            this.customOriginConfig = (java.util.List<imports.aws.CloudfrontDistributionOriginCustomOriginConfig>)customOriginConfig;
            this.originPath = originPath;
            this.s3OriginConfig = (java.util.List<imports.aws.CloudfrontDistributionOriginS3OriginConfig>)s3OriginConfig;
        }

        @Override
        public final java.lang.String getDomainName() {
            return this.domainName;
        }

        @Override
        public final java.lang.String getOriginId() {
            return this.originId;
        }

        @Override
        public final java.util.List<imports.aws.CloudfrontDistributionOriginCustomHeader> getCustomHeader() {
            return this.customHeader;
        }

        @Override
        public final java.util.List<imports.aws.CloudfrontDistributionOriginCustomOriginConfig> getCustomOriginConfig() {
            return this.customOriginConfig;
        }

        @Override
        public final java.lang.String getOriginPath() {
            return this.originPath;
        }

        @Override
        public final java.util.List<imports.aws.CloudfrontDistributionOriginS3OriginConfig> getS3OriginConfig() {
            return this.s3OriginConfig;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("domainName", om.valueToTree(this.getDomainName()));
            data.set("originId", om.valueToTree(this.getOriginId()));
            if (this.getCustomHeader() != null) {
                data.set("customHeader", om.valueToTree(this.getCustomHeader()));
            }
            if (this.getCustomOriginConfig() != null) {
                data.set("customOriginConfig", om.valueToTree(this.getCustomOriginConfig()));
            }
            if (this.getOriginPath() != null) {
                data.set("originPath", om.valueToTree(this.getOriginPath()));
            }
            if (this.getS3OriginConfig() != null) {
                data.set("s3OriginConfig", om.valueToTree(this.getS3OriginConfig()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.CloudfrontDistributionOrigin"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CloudfrontDistributionOrigin.Jsii$Proxy that = (CloudfrontDistributionOrigin.Jsii$Proxy) o;

            if (!domainName.equals(that.domainName)) return false;
            if (!originId.equals(that.originId)) return false;
            if (this.customHeader != null ? !this.customHeader.equals(that.customHeader) : that.customHeader != null) return false;
            if (this.customOriginConfig != null ? !this.customOriginConfig.equals(that.customOriginConfig) : that.customOriginConfig != null) return false;
            if (this.originPath != null ? !this.originPath.equals(that.originPath) : that.originPath != null) return false;
            return this.s3OriginConfig != null ? this.s3OriginConfig.equals(that.s3OriginConfig) : that.s3OriginConfig == null;
        }

        @Override
        public final int hashCode() {
            int result = this.domainName.hashCode();
            result = 31 * result + (this.originId.hashCode());
            result = 31 * result + (this.customHeader != null ? this.customHeader.hashCode() : 0);
            result = 31 * result + (this.customOriginConfig != null ? this.customOriginConfig.hashCode() : 0);
            result = 31 * result + (this.originPath != null ? this.originPath.hashCode() : 0);
            result = 31 * result + (this.s3OriginConfig != null ? this.s3OriginConfig.hashCode() : 0);
            return result;
        }
    }
}
