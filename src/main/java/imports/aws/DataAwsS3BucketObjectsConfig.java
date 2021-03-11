package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.360Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.DataAwsS3BucketObjectsConfig")
@software.amazon.jsii.Jsii.Proxy(DataAwsS3BucketObjectsConfig.Jsii$Proxy.class)
public interface DataAwsS3BucketObjectsConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getBucket();

    default @org.jetbrains.annotations.Nullable java.lang.String getDelimiter() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getEncodingType() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getFetchOwner() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getMaxKeys() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPrefix() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getStartAfter() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DataAwsS3BucketObjectsConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DataAwsS3BucketObjectsConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DataAwsS3BucketObjectsConfig> {
        private java.lang.String bucket;
        private java.lang.String delimiter;
        private java.lang.String encodingType;
        private java.lang.Boolean fetchOwner;
        private java.lang.Number maxKeys;
        private java.lang.String prefix;
        private java.lang.String startAfter;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link DataAwsS3BucketObjectsConfig#getBucket}
         * @param bucket the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder bucket(java.lang.String bucket) {
            this.bucket = bucket;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsS3BucketObjectsConfig#getDelimiter}
         * @param delimiter the value to be set.
         * @return {@code this}
         */
        public Builder delimiter(java.lang.String delimiter) {
            this.delimiter = delimiter;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsS3BucketObjectsConfig#getEncodingType}
         * @param encodingType the value to be set.
         * @return {@code this}
         */
        public Builder encodingType(java.lang.String encodingType) {
            this.encodingType = encodingType;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsS3BucketObjectsConfig#getFetchOwner}
         * @param fetchOwner the value to be set.
         * @return {@code this}
         */
        public Builder fetchOwner(java.lang.Boolean fetchOwner) {
            this.fetchOwner = fetchOwner;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsS3BucketObjectsConfig#getMaxKeys}
         * @param maxKeys the value to be set.
         * @return {@code this}
         */
        public Builder maxKeys(java.lang.Number maxKeys) {
            this.maxKeys = maxKeys;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsS3BucketObjectsConfig#getPrefix}
         * @param prefix the value to be set.
         * @return {@code this}
         */
        public Builder prefix(java.lang.String prefix) {
            this.prefix = prefix;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsS3BucketObjectsConfig#getStartAfter}
         * @param startAfter the value to be set.
         * @return {@code this}
         */
        public Builder startAfter(java.lang.String startAfter) {
            this.startAfter = startAfter;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsS3BucketObjectsConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsS3BucketObjectsConfig#getDependsOn}
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
         * Sets the value of {@link DataAwsS3BucketObjectsConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsS3BucketObjectsConfig#getProvider}
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
         * @return a new instance of {@link DataAwsS3BucketObjectsConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DataAwsS3BucketObjectsConfig build() {
            return new Jsii$Proxy(bucket, delimiter, encodingType, fetchOwner, maxKeys, prefix, startAfter, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link DataAwsS3BucketObjectsConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DataAwsS3BucketObjectsConfig {
        private final java.lang.String bucket;
        private final java.lang.String delimiter;
        private final java.lang.String encodingType;
        private final java.lang.Boolean fetchOwner;
        private final java.lang.Number maxKeys;
        private final java.lang.String prefix;
        private final java.lang.String startAfter;
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
            this.bucket = software.amazon.jsii.Kernel.get(this, "bucket", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.delimiter = software.amazon.jsii.Kernel.get(this, "delimiter", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.encodingType = software.amazon.jsii.Kernel.get(this, "encodingType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.fetchOwner = software.amazon.jsii.Kernel.get(this, "fetchOwner", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.maxKeys = software.amazon.jsii.Kernel.get(this, "maxKeys", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.prefix = software.amazon.jsii.Kernel.get(this, "prefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.startAfter = software.amazon.jsii.Kernel.get(this, "startAfter", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String bucket, final java.lang.String delimiter, final java.lang.String encodingType, final java.lang.Boolean fetchOwner, final java.lang.Number maxKeys, final java.lang.String prefix, final java.lang.String startAfter, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.bucket = java.util.Objects.requireNonNull(bucket, "bucket is required");
            this.delimiter = delimiter;
            this.encodingType = encodingType;
            this.fetchOwner = fetchOwner;
            this.maxKeys = maxKeys;
            this.prefix = prefix;
            this.startAfter = startAfter;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getBucket() {
            return this.bucket;
        }

        @Override
        public final java.lang.String getDelimiter() {
            return this.delimiter;
        }

        @Override
        public final java.lang.String getEncodingType() {
            return this.encodingType;
        }

        @Override
        public final java.lang.Boolean getFetchOwner() {
            return this.fetchOwner;
        }

        @Override
        public final java.lang.Number getMaxKeys() {
            return this.maxKeys;
        }

        @Override
        public final java.lang.String getPrefix() {
            return this.prefix;
        }

        @Override
        public final java.lang.String getStartAfter() {
            return this.startAfter;
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

            data.set("bucket", om.valueToTree(this.getBucket()));
            if (this.getDelimiter() != null) {
                data.set("delimiter", om.valueToTree(this.getDelimiter()));
            }
            if (this.getEncodingType() != null) {
                data.set("encodingType", om.valueToTree(this.getEncodingType()));
            }
            if (this.getFetchOwner() != null) {
                data.set("fetchOwner", om.valueToTree(this.getFetchOwner()));
            }
            if (this.getMaxKeys() != null) {
                data.set("maxKeys", om.valueToTree(this.getMaxKeys()));
            }
            if (this.getPrefix() != null) {
                data.set("prefix", om.valueToTree(this.getPrefix()));
            }
            if (this.getStartAfter() != null) {
                data.set("startAfter", om.valueToTree(this.getStartAfter()));
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
            struct.set("fqn", om.valueToTree("aws.DataAwsS3BucketObjectsConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DataAwsS3BucketObjectsConfig.Jsii$Proxy that = (DataAwsS3BucketObjectsConfig.Jsii$Proxy) o;

            if (!bucket.equals(that.bucket)) return false;
            if (this.delimiter != null ? !this.delimiter.equals(that.delimiter) : that.delimiter != null) return false;
            if (this.encodingType != null ? !this.encodingType.equals(that.encodingType) : that.encodingType != null) return false;
            if (this.fetchOwner != null ? !this.fetchOwner.equals(that.fetchOwner) : that.fetchOwner != null) return false;
            if (this.maxKeys != null ? !this.maxKeys.equals(that.maxKeys) : that.maxKeys != null) return false;
            if (this.prefix != null ? !this.prefix.equals(that.prefix) : that.prefix != null) return false;
            if (this.startAfter != null ? !this.startAfter.equals(that.startAfter) : that.startAfter != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.bucket.hashCode();
            result = 31 * result + (this.delimiter != null ? this.delimiter.hashCode() : 0);
            result = 31 * result + (this.encodingType != null ? this.encodingType.hashCode() : 0);
            result = 31 * result + (this.fetchOwner != null ? this.fetchOwner.hashCode() : 0);
            result = 31 * result + (this.maxKeys != null ? this.maxKeys.hashCode() : 0);
            result = 31 * result + (this.prefix != null ? this.prefix.hashCode() : 0);
            result = 31 * result + (this.startAfter != null ? this.startAfter.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
