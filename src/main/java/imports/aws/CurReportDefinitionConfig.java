package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.210Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CurReportDefinitionConfig")
@software.amazon.jsii.Jsii.Proxy(CurReportDefinitionConfig.Jsii$Proxy.class)
public interface CurReportDefinitionConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getAdditionalSchemaElements();

    @org.jetbrains.annotations.NotNull java.lang.String getCompression();

    @org.jetbrains.annotations.NotNull java.lang.String getFormat();

    @org.jetbrains.annotations.NotNull java.lang.String getReportName();

    @org.jetbrains.annotations.NotNull java.lang.String getS3Bucket();

    @org.jetbrains.annotations.NotNull java.lang.String getS3Region();

    @org.jetbrains.annotations.NotNull java.lang.String getTimeUnit();

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAdditionalArtifacts() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getS3Prefix() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CurReportDefinitionConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CurReportDefinitionConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CurReportDefinitionConfig> {
        private java.util.List<java.lang.String> additionalSchemaElements;
        private java.lang.String compression;
        private java.lang.String format;
        private java.lang.String reportName;
        private java.lang.String s3Bucket;
        private java.lang.String s3Region;
        private java.lang.String timeUnit;
        private java.util.List<java.lang.String> additionalArtifacts;
        private java.lang.String s3Prefix;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link CurReportDefinitionConfig#getAdditionalSchemaElements}
         * @param additionalSchemaElements the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder additionalSchemaElements(java.util.List<java.lang.String> additionalSchemaElements) {
            this.additionalSchemaElements = additionalSchemaElements;
            return this;
        }

        /**
         * Sets the value of {@link CurReportDefinitionConfig#getCompression}
         * @param compression the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder compression(java.lang.String compression) {
            this.compression = compression;
            return this;
        }

        /**
         * Sets the value of {@link CurReportDefinitionConfig#getFormat}
         * @param format the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder format(java.lang.String format) {
            this.format = format;
            return this;
        }

        /**
         * Sets the value of {@link CurReportDefinitionConfig#getReportName}
         * @param reportName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder reportName(java.lang.String reportName) {
            this.reportName = reportName;
            return this;
        }

        /**
         * Sets the value of {@link CurReportDefinitionConfig#getS3Bucket}
         * @param s3Bucket the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder s3Bucket(java.lang.String s3Bucket) {
            this.s3Bucket = s3Bucket;
            return this;
        }

        /**
         * Sets the value of {@link CurReportDefinitionConfig#getS3Region}
         * @param s3Region the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder s3Region(java.lang.String s3Region) {
            this.s3Region = s3Region;
            return this;
        }

        /**
         * Sets the value of {@link CurReportDefinitionConfig#getTimeUnit}
         * @param timeUnit the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder timeUnit(java.lang.String timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }

        /**
         * Sets the value of {@link CurReportDefinitionConfig#getAdditionalArtifacts}
         * @param additionalArtifacts the value to be set.
         * @return {@code this}
         */
        public Builder additionalArtifacts(java.util.List<java.lang.String> additionalArtifacts) {
            this.additionalArtifacts = additionalArtifacts;
            return this;
        }

        /**
         * Sets the value of {@link CurReportDefinitionConfig#getS3Prefix}
         * @param s3Prefix the value to be set.
         * @return {@code this}
         */
        public Builder s3Prefix(java.lang.String s3Prefix) {
            this.s3Prefix = s3Prefix;
            return this;
        }

        /**
         * Sets the value of {@link CurReportDefinitionConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link CurReportDefinitionConfig#getDependsOn}
         * @param dependsOn the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder dependsOn(java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            return this;
        }

        /**
         * Sets the value of {@link CurReportDefinitionConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link CurReportDefinitionConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CurReportDefinitionConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CurReportDefinitionConfig build() {
            return new Jsii$Proxy(additionalSchemaElements, compression, format, reportName, s3Bucket, s3Region, timeUnit, additionalArtifacts, s3Prefix, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link CurReportDefinitionConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CurReportDefinitionConfig {
        private final java.util.List<java.lang.String> additionalSchemaElements;
        private final java.lang.String compression;
        private final java.lang.String format;
        private final java.lang.String reportName;
        private final java.lang.String s3Bucket;
        private final java.lang.String s3Region;
        private final java.lang.String timeUnit;
        private final java.util.List<java.lang.String> additionalArtifacts;
        private final java.lang.String s3Prefix;
        private final java.lang.Number count;
        private final java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private final com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.additionalSchemaElements = software.amazon.jsii.Kernel.get(this, "additionalSchemaElements", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.compression = software.amazon.jsii.Kernel.get(this, "compression", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.format = software.amazon.jsii.Kernel.get(this, "format", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.reportName = software.amazon.jsii.Kernel.get(this, "reportName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.s3Bucket = software.amazon.jsii.Kernel.get(this, "s3Bucket", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.s3Region = software.amazon.jsii.Kernel.get(this, "s3Region", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.timeUnit = software.amazon.jsii.Kernel.get(this, "timeUnit", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.additionalArtifacts = software.amazon.jsii.Kernel.get(this, "additionalArtifacts", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.s3Prefix = software.amazon.jsii.Kernel.get(this, "s3Prefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<java.lang.String> additionalSchemaElements, final java.lang.String compression, final java.lang.String format, final java.lang.String reportName, final java.lang.String s3Bucket, final java.lang.String s3Region, final java.lang.String timeUnit, final java.util.List<java.lang.String> additionalArtifacts, final java.lang.String s3Prefix, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.additionalSchemaElements = java.util.Objects.requireNonNull(additionalSchemaElements, "additionalSchemaElements is required");
            this.compression = java.util.Objects.requireNonNull(compression, "compression is required");
            this.format = java.util.Objects.requireNonNull(format, "format is required");
            this.reportName = java.util.Objects.requireNonNull(reportName, "reportName is required");
            this.s3Bucket = java.util.Objects.requireNonNull(s3Bucket, "s3Bucket is required");
            this.s3Region = java.util.Objects.requireNonNull(s3Region, "s3Region is required");
            this.timeUnit = java.util.Objects.requireNonNull(timeUnit, "timeUnit is required");
            this.additionalArtifacts = additionalArtifacts;
            this.s3Prefix = s3Prefix;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.util.List<java.lang.String> getAdditionalSchemaElements() {
            return this.additionalSchemaElements;
        }

        @Override
        public final java.lang.String getCompression() {
            return this.compression;
        }

        @Override
        public final java.lang.String getFormat() {
            return this.format;
        }

        @Override
        public final java.lang.String getReportName() {
            return this.reportName;
        }

        @Override
        public final java.lang.String getS3Bucket() {
            return this.s3Bucket;
        }

        @Override
        public final java.lang.String getS3Region() {
            return this.s3Region;
        }

        @Override
        public final java.lang.String getTimeUnit() {
            return this.timeUnit;
        }

        @Override
        public final java.util.List<java.lang.String> getAdditionalArtifacts() {
            return this.additionalArtifacts;
        }

        @Override
        public final java.lang.String getS3Prefix() {
            return this.s3Prefix;
        }

        @Override
        public final java.lang.Number getCount() {
            return this.count;
        }

        @Override
        public final java.util.List<com.hashicorp.cdktf.ITerraformDependable> getDependsOn() {
            return this.dependsOn;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformResourceLifecycle getLifecycle() {
            return this.lifecycle;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformProvider getProvider() {
            return this.provider;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("additionalSchemaElements", om.valueToTree(this.getAdditionalSchemaElements()));
            data.set("compression", om.valueToTree(this.getCompression()));
            data.set("format", om.valueToTree(this.getFormat()));
            data.set("reportName", om.valueToTree(this.getReportName()));
            data.set("s3Bucket", om.valueToTree(this.getS3Bucket()));
            data.set("s3Region", om.valueToTree(this.getS3Region()));
            data.set("timeUnit", om.valueToTree(this.getTimeUnit()));
            if (this.getAdditionalArtifacts() != null) {
                data.set("additionalArtifacts", om.valueToTree(this.getAdditionalArtifacts()));
            }
            if (this.getS3Prefix() != null) {
                data.set("s3Prefix", om.valueToTree(this.getS3Prefix()));
            }
            if (this.getCount() != null) {
                data.set("count", om.valueToTree(this.getCount()));
            }
            if (this.getDependsOn() != null) {
                data.set("dependsOn", om.valueToTree(this.getDependsOn()));
            }
            if (this.getLifecycle() != null) {
                data.set("lifecycle", om.valueToTree(this.getLifecycle()));
            }
            if (this.getProvider() != null) {
                data.set("provider", om.valueToTree(this.getProvider()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.CurReportDefinitionConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CurReportDefinitionConfig.Jsii$Proxy that = (CurReportDefinitionConfig.Jsii$Proxy) o;

            if (!additionalSchemaElements.equals(that.additionalSchemaElements)) return false;
            if (!compression.equals(that.compression)) return false;
            if (!format.equals(that.format)) return false;
            if (!reportName.equals(that.reportName)) return false;
            if (!s3Bucket.equals(that.s3Bucket)) return false;
            if (!s3Region.equals(that.s3Region)) return false;
            if (!timeUnit.equals(that.timeUnit)) return false;
            if (this.additionalArtifacts != null ? !this.additionalArtifacts.equals(that.additionalArtifacts) : that.additionalArtifacts != null) return false;
            if (this.s3Prefix != null ? !this.s3Prefix.equals(that.s3Prefix) : that.s3Prefix != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.additionalSchemaElements.hashCode();
            result = 31 * result + (this.compression.hashCode());
            result = 31 * result + (this.format.hashCode());
            result = 31 * result + (this.reportName.hashCode());
            result = 31 * result + (this.s3Bucket.hashCode());
            result = 31 * result + (this.s3Region.hashCode());
            result = 31 * result + (this.timeUnit.hashCode());
            result = 31 * result + (this.additionalArtifacts != null ? this.additionalArtifacts.hashCode() : 0);
            result = 31 * result + (this.s3Prefix != null ? this.s3Prefix.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
