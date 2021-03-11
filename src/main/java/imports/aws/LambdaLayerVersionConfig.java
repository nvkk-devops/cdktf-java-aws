package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.677Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.LambdaLayerVersionConfig")
@software.amazon.jsii.Jsii.Proxy(LambdaLayerVersionConfig.Jsii$Proxy.class)
public interface LambdaLayerVersionConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getLayerName();

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getCompatibleRuntimes() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getFilename() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getLicenseInfo() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getS3Bucket() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getS3Key() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getS3ObjectVersion() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSourceCodeHash() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link LambdaLayerVersionConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LambdaLayerVersionConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LambdaLayerVersionConfig> {
        private java.lang.String layerName;
        private java.util.List<java.lang.String> compatibleRuntimes;
        private java.lang.String description;
        private java.lang.String filename;
        private java.lang.String licenseInfo;
        private java.lang.String s3Bucket;
        private java.lang.String s3Key;
        private java.lang.String s3ObjectVersion;
        private java.lang.String sourceCodeHash;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link LambdaLayerVersionConfig#getLayerName}
         * @param layerName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder layerName(java.lang.String layerName) {
            this.layerName = layerName;
            return this;
        }

        /**
         * Sets the value of {@link LambdaLayerVersionConfig#getCompatibleRuntimes}
         * @param compatibleRuntimes the value to be set.
         * @return {@code this}
         */
        public Builder compatibleRuntimes(java.util.List<java.lang.String> compatibleRuntimes) {
            this.compatibleRuntimes = compatibleRuntimes;
            return this;
        }

        /**
         * Sets the value of {@link LambdaLayerVersionConfig#getDescription}
         * @param description the value to be set.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link LambdaLayerVersionConfig#getFilename}
         * @param filename the value to be set.
         * @return {@code this}
         */
        public Builder filename(java.lang.String filename) {
            this.filename = filename;
            return this;
        }

        /**
         * Sets the value of {@link LambdaLayerVersionConfig#getLicenseInfo}
         * @param licenseInfo the value to be set.
         * @return {@code this}
         */
        public Builder licenseInfo(java.lang.String licenseInfo) {
            this.licenseInfo = licenseInfo;
            return this;
        }

        /**
         * Sets the value of {@link LambdaLayerVersionConfig#getS3Bucket}
         * @param s3Bucket the value to be set.
         * @return {@code this}
         */
        public Builder s3Bucket(java.lang.String s3Bucket) {
            this.s3Bucket = s3Bucket;
            return this;
        }

        /**
         * Sets the value of {@link LambdaLayerVersionConfig#getS3Key}
         * @param s3Key the value to be set.
         * @return {@code this}
         */
        public Builder s3Key(java.lang.String s3Key) {
            this.s3Key = s3Key;
            return this;
        }

        /**
         * Sets the value of {@link LambdaLayerVersionConfig#getS3ObjectVersion}
         * @param s3ObjectVersion the value to be set.
         * @return {@code this}
         */
        public Builder s3ObjectVersion(java.lang.String s3ObjectVersion) {
            this.s3ObjectVersion = s3ObjectVersion;
            return this;
        }

        /**
         * Sets the value of {@link LambdaLayerVersionConfig#getSourceCodeHash}
         * @param sourceCodeHash the value to be set.
         * @return {@code this}
         */
        public Builder sourceCodeHash(java.lang.String sourceCodeHash) {
            this.sourceCodeHash = sourceCodeHash;
            return this;
        }

        /**
         * Sets the value of {@link LambdaLayerVersionConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link LambdaLayerVersionConfig#getDependsOn}
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
         * Sets the value of {@link LambdaLayerVersionConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link LambdaLayerVersionConfig#getProvider}
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
         * @return a new instance of {@link LambdaLayerVersionConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LambdaLayerVersionConfig build() {
            return new Jsii$Proxy(layerName, compatibleRuntimes, description, filename, licenseInfo, s3Bucket, s3Key, s3ObjectVersion, sourceCodeHash, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link LambdaLayerVersionConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LambdaLayerVersionConfig {
        private final java.lang.String layerName;
        private final java.util.List<java.lang.String> compatibleRuntimes;
        private final java.lang.String description;
        private final java.lang.String filename;
        private final java.lang.String licenseInfo;
        private final java.lang.String s3Bucket;
        private final java.lang.String s3Key;
        private final java.lang.String s3ObjectVersion;
        private final java.lang.String sourceCodeHash;
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
            this.layerName = software.amazon.jsii.Kernel.get(this, "layerName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.compatibleRuntimes = software.amazon.jsii.Kernel.get(this, "compatibleRuntimes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.filename = software.amazon.jsii.Kernel.get(this, "filename", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.licenseInfo = software.amazon.jsii.Kernel.get(this, "licenseInfo", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.s3Bucket = software.amazon.jsii.Kernel.get(this, "s3Bucket", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.s3Key = software.amazon.jsii.Kernel.get(this, "s3Key", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.s3ObjectVersion = software.amazon.jsii.Kernel.get(this, "s3ObjectVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.sourceCodeHash = software.amazon.jsii.Kernel.get(this, "sourceCodeHash", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String layerName, final java.util.List<java.lang.String> compatibleRuntimes, final java.lang.String description, final java.lang.String filename, final java.lang.String licenseInfo, final java.lang.String s3Bucket, final java.lang.String s3Key, final java.lang.String s3ObjectVersion, final java.lang.String sourceCodeHash, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.layerName = java.util.Objects.requireNonNull(layerName, "layerName is required");
            this.compatibleRuntimes = compatibleRuntimes;
            this.description = description;
            this.filename = filename;
            this.licenseInfo = licenseInfo;
            this.s3Bucket = s3Bucket;
            this.s3Key = s3Key;
            this.s3ObjectVersion = s3ObjectVersion;
            this.sourceCodeHash = sourceCodeHash;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getLayerName() {
            return this.layerName;
        }

        @Override
        public final java.util.List<java.lang.String> getCompatibleRuntimes() {
            return this.compatibleRuntimes;
        }

        @Override
        public final java.lang.String getDescription() {
            return this.description;
        }

        @Override
        public final java.lang.String getFilename() {
            return this.filename;
        }

        @Override
        public final java.lang.String getLicenseInfo() {
            return this.licenseInfo;
        }

        @Override
        public final java.lang.String getS3Bucket() {
            return this.s3Bucket;
        }

        @Override
        public final java.lang.String getS3Key() {
            return this.s3Key;
        }

        @Override
        public final java.lang.String getS3ObjectVersion() {
            return this.s3ObjectVersion;
        }

        @Override
        public final java.lang.String getSourceCodeHash() {
            return this.sourceCodeHash;
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

            data.set("layerName", om.valueToTree(this.getLayerName()));
            if (this.getCompatibleRuntimes() != null) {
                data.set("compatibleRuntimes", om.valueToTree(this.getCompatibleRuntimes()));
            }
            if (this.getDescription() != null) {
                data.set("description", om.valueToTree(this.getDescription()));
            }
            if (this.getFilename() != null) {
                data.set("filename", om.valueToTree(this.getFilename()));
            }
            if (this.getLicenseInfo() != null) {
                data.set("licenseInfo", om.valueToTree(this.getLicenseInfo()));
            }
            if (this.getS3Bucket() != null) {
                data.set("s3Bucket", om.valueToTree(this.getS3Bucket()));
            }
            if (this.getS3Key() != null) {
                data.set("s3Key", om.valueToTree(this.getS3Key()));
            }
            if (this.getS3ObjectVersion() != null) {
                data.set("s3ObjectVersion", om.valueToTree(this.getS3ObjectVersion()));
            }
            if (this.getSourceCodeHash() != null) {
                data.set("sourceCodeHash", om.valueToTree(this.getSourceCodeHash()));
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
            struct.set("fqn", om.valueToTree("aws.LambdaLayerVersionConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LambdaLayerVersionConfig.Jsii$Proxy that = (LambdaLayerVersionConfig.Jsii$Proxy) o;

            if (!layerName.equals(that.layerName)) return false;
            if (this.compatibleRuntimes != null ? !this.compatibleRuntimes.equals(that.compatibleRuntimes) : that.compatibleRuntimes != null) return false;
            if (this.description != null ? !this.description.equals(that.description) : that.description != null) return false;
            if (this.filename != null ? !this.filename.equals(that.filename) : that.filename != null) return false;
            if (this.licenseInfo != null ? !this.licenseInfo.equals(that.licenseInfo) : that.licenseInfo != null) return false;
            if (this.s3Bucket != null ? !this.s3Bucket.equals(that.s3Bucket) : that.s3Bucket != null) return false;
            if (this.s3Key != null ? !this.s3Key.equals(that.s3Key) : that.s3Key != null) return false;
            if (this.s3ObjectVersion != null ? !this.s3ObjectVersion.equals(that.s3ObjectVersion) : that.s3ObjectVersion != null) return false;
            if (this.sourceCodeHash != null ? !this.sourceCodeHash.equals(that.sourceCodeHash) : that.sourceCodeHash != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.layerName.hashCode();
            result = 31 * result + (this.compatibleRuntimes != null ? this.compatibleRuntimes.hashCode() : 0);
            result = 31 * result + (this.description != null ? this.description.hashCode() : 0);
            result = 31 * result + (this.filename != null ? this.filename.hashCode() : 0);
            result = 31 * result + (this.licenseInfo != null ? this.licenseInfo.hashCode() : 0);
            result = 31 * result + (this.s3Bucket != null ? this.s3Bucket.hashCode() : 0);
            result = 31 * result + (this.s3Key != null ? this.s3Key.hashCode() : 0);
            result = 31 * result + (this.s3ObjectVersion != null ? this.s3ObjectVersion.hashCode() : 0);
            result = 31 * result + (this.sourceCodeHash != null ? this.sourceCodeHash.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
