package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.556Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.ElastictranscoderPipelineConfig")
@software.amazon.jsii.Jsii.Proxy(ElastictranscoderPipelineConfig.Jsii$Proxy.class)
public interface ElastictranscoderPipelineConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getInputBucket();

    @org.jetbrains.annotations.NotNull java.lang.String getRole();

    default @org.jetbrains.annotations.Nullable java.lang.String getAwsKmsKeyArn() {
        return null;
    }

    /**
     * content_config block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ElastictranscoderPipelineContentConfig> getContentConfig() {
        return null;
    }

    /**
     * content_config_permissions block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ElastictranscoderPipelineContentConfigPermissions> getContentConfigPermissions() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    /**
     * notifications block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ElastictranscoderPipelineNotifications> getNotifications() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getOutputBucket() {
        return null;
    }

    /**
     * thumbnail_config block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ElastictranscoderPipelineThumbnailConfig> getThumbnailConfig() {
        return null;
    }

    /**
     * thumbnail_config_permissions block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ElastictranscoderPipelineThumbnailConfigPermissions> getThumbnailConfigPermissions() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ElastictranscoderPipelineConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ElastictranscoderPipelineConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ElastictranscoderPipelineConfig> {
        private java.lang.String inputBucket;
        private java.lang.String role;
        private java.lang.String awsKmsKeyArn;
        private java.util.List<imports.aws.ElastictranscoderPipelineContentConfig> contentConfig;
        private java.util.List<imports.aws.ElastictranscoderPipelineContentConfigPermissions> contentConfigPermissions;
        private java.lang.String name;
        private java.util.List<imports.aws.ElastictranscoderPipelineNotifications> notifications;
        private java.lang.String outputBucket;
        private java.util.List<imports.aws.ElastictranscoderPipelineThumbnailConfig> thumbnailConfig;
        private java.util.List<imports.aws.ElastictranscoderPipelineThumbnailConfigPermissions> thumbnailConfigPermissions;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link ElastictranscoderPipelineConfig#getInputBucket}
         * @param inputBucket the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder inputBucket(java.lang.String inputBucket) {
            this.inputBucket = inputBucket;
            return this;
        }

        /**
         * Sets the value of {@link ElastictranscoderPipelineConfig#getRole}
         * @param role the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder role(java.lang.String role) {
            this.role = role;
            return this;
        }

        /**
         * Sets the value of {@link ElastictranscoderPipelineConfig#getAwsKmsKeyArn}
         * @param awsKmsKeyArn the value to be set.
         * @return {@code this}
         */
        public Builder awsKmsKeyArn(java.lang.String awsKmsKeyArn) {
            this.awsKmsKeyArn = awsKmsKeyArn;
            return this;
        }

        /**
         * Sets the value of {@link ElastictranscoderPipelineConfig#getContentConfig}
         * @param contentConfig content_config block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder contentConfig(java.util.List<? extends imports.aws.ElastictranscoderPipelineContentConfig> contentConfig) {
            this.contentConfig = (java.util.List<imports.aws.ElastictranscoderPipelineContentConfig>)contentConfig;
            return this;
        }

        /**
         * Sets the value of {@link ElastictranscoderPipelineConfig#getContentConfigPermissions}
         * @param contentConfigPermissions content_config_permissions block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder contentConfigPermissions(java.util.List<? extends imports.aws.ElastictranscoderPipelineContentConfigPermissions> contentConfigPermissions) {
            this.contentConfigPermissions = (java.util.List<imports.aws.ElastictranscoderPipelineContentConfigPermissions>)contentConfigPermissions;
            return this;
        }

        /**
         * Sets the value of {@link ElastictranscoderPipelineConfig#getName}
         * @param name the value to be set.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link ElastictranscoderPipelineConfig#getNotifications}
         * @param notifications notifications block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder notifications(java.util.List<? extends imports.aws.ElastictranscoderPipelineNotifications> notifications) {
            this.notifications = (java.util.List<imports.aws.ElastictranscoderPipelineNotifications>)notifications;
            return this;
        }

        /**
         * Sets the value of {@link ElastictranscoderPipelineConfig#getOutputBucket}
         * @param outputBucket the value to be set.
         * @return {@code this}
         */
        public Builder outputBucket(java.lang.String outputBucket) {
            this.outputBucket = outputBucket;
            return this;
        }

        /**
         * Sets the value of {@link ElastictranscoderPipelineConfig#getThumbnailConfig}
         * @param thumbnailConfig thumbnail_config block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder thumbnailConfig(java.util.List<? extends imports.aws.ElastictranscoderPipelineThumbnailConfig> thumbnailConfig) {
            this.thumbnailConfig = (java.util.List<imports.aws.ElastictranscoderPipelineThumbnailConfig>)thumbnailConfig;
            return this;
        }

        /**
         * Sets the value of {@link ElastictranscoderPipelineConfig#getThumbnailConfigPermissions}
         * @param thumbnailConfigPermissions thumbnail_config_permissions block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder thumbnailConfigPermissions(java.util.List<? extends imports.aws.ElastictranscoderPipelineThumbnailConfigPermissions> thumbnailConfigPermissions) {
            this.thumbnailConfigPermissions = (java.util.List<imports.aws.ElastictranscoderPipelineThumbnailConfigPermissions>)thumbnailConfigPermissions;
            return this;
        }

        /**
         * Sets the value of {@link ElastictranscoderPipelineConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link ElastictranscoderPipelineConfig#getDependsOn}
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
         * Sets the value of {@link ElastictranscoderPipelineConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link ElastictranscoderPipelineConfig#getProvider}
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
         * @return a new instance of {@link ElastictranscoderPipelineConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ElastictranscoderPipelineConfig build() {
            return new Jsii$Proxy(inputBucket, role, awsKmsKeyArn, contentConfig, contentConfigPermissions, name, notifications, outputBucket, thumbnailConfig, thumbnailConfigPermissions, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link ElastictranscoderPipelineConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ElastictranscoderPipelineConfig {
        private final java.lang.String inputBucket;
        private final java.lang.String role;
        private final java.lang.String awsKmsKeyArn;
        private final java.util.List<imports.aws.ElastictranscoderPipelineContentConfig> contentConfig;
        private final java.util.List<imports.aws.ElastictranscoderPipelineContentConfigPermissions> contentConfigPermissions;
        private final java.lang.String name;
        private final java.util.List<imports.aws.ElastictranscoderPipelineNotifications> notifications;
        private final java.lang.String outputBucket;
        private final java.util.List<imports.aws.ElastictranscoderPipelineThumbnailConfig> thumbnailConfig;
        private final java.util.List<imports.aws.ElastictranscoderPipelineThumbnailConfigPermissions> thumbnailConfigPermissions;
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
            this.inputBucket = software.amazon.jsii.Kernel.get(this, "inputBucket", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.role = software.amazon.jsii.Kernel.get(this, "role", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.awsKmsKeyArn = software.amazon.jsii.Kernel.get(this, "awsKmsKeyArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.contentConfig = software.amazon.jsii.Kernel.get(this, "contentConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElastictranscoderPipelineContentConfig.class)));
            this.contentConfigPermissions = software.amazon.jsii.Kernel.get(this, "contentConfigPermissions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElastictranscoderPipelineContentConfigPermissions.class)));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.notifications = software.amazon.jsii.Kernel.get(this, "notifications", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElastictranscoderPipelineNotifications.class)));
            this.outputBucket = software.amazon.jsii.Kernel.get(this, "outputBucket", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.thumbnailConfig = software.amazon.jsii.Kernel.get(this, "thumbnailConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElastictranscoderPipelineThumbnailConfig.class)));
            this.thumbnailConfigPermissions = software.amazon.jsii.Kernel.get(this, "thumbnailConfigPermissions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElastictranscoderPipelineThumbnailConfigPermissions.class)));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String inputBucket, final java.lang.String role, final java.lang.String awsKmsKeyArn, final java.util.List<? extends imports.aws.ElastictranscoderPipelineContentConfig> contentConfig, final java.util.List<? extends imports.aws.ElastictranscoderPipelineContentConfigPermissions> contentConfigPermissions, final java.lang.String name, final java.util.List<? extends imports.aws.ElastictranscoderPipelineNotifications> notifications, final java.lang.String outputBucket, final java.util.List<? extends imports.aws.ElastictranscoderPipelineThumbnailConfig> thumbnailConfig, final java.util.List<? extends imports.aws.ElastictranscoderPipelineThumbnailConfigPermissions> thumbnailConfigPermissions, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.inputBucket = java.util.Objects.requireNonNull(inputBucket, "inputBucket is required");
            this.role = java.util.Objects.requireNonNull(role, "role is required");
            this.awsKmsKeyArn = awsKmsKeyArn;
            this.contentConfig = (java.util.List<imports.aws.ElastictranscoderPipelineContentConfig>)contentConfig;
            this.contentConfigPermissions = (java.util.List<imports.aws.ElastictranscoderPipelineContentConfigPermissions>)contentConfigPermissions;
            this.name = name;
            this.notifications = (java.util.List<imports.aws.ElastictranscoderPipelineNotifications>)notifications;
            this.outputBucket = outputBucket;
            this.thumbnailConfig = (java.util.List<imports.aws.ElastictranscoderPipelineThumbnailConfig>)thumbnailConfig;
            this.thumbnailConfigPermissions = (java.util.List<imports.aws.ElastictranscoderPipelineThumbnailConfigPermissions>)thumbnailConfigPermissions;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getInputBucket() {
            return this.inputBucket;
        }

        @Override
        public final java.lang.String getRole() {
            return this.role;
        }

        @Override
        public final java.lang.String getAwsKmsKeyArn() {
            return this.awsKmsKeyArn;
        }

        @Override
        public final java.util.List<imports.aws.ElastictranscoderPipelineContentConfig> getContentConfig() {
            return this.contentConfig;
        }

        @Override
        public final java.util.List<imports.aws.ElastictranscoderPipelineContentConfigPermissions> getContentConfigPermissions() {
            return this.contentConfigPermissions;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.util.List<imports.aws.ElastictranscoderPipelineNotifications> getNotifications() {
            return this.notifications;
        }

        @Override
        public final java.lang.String getOutputBucket() {
            return this.outputBucket;
        }

        @Override
        public final java.util.List<imports.aws.ElastictranscoderPipelineThumbnailConfig> getThumbnailConfig() {
            return this.thumbnailConfig;
        }

        @Override
        public final java.util.List<imports.aws.ElastictranscoderPipelineThumbnailConfigPermissions> getThumbnailConfigPermissions() {
            return this.thumbnailConfigPermissions;
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

            data.set("inputBucket", om.valueToTree(this.getInputBucket()));
            data.set("role", om.valueToTree(this.getRole()));
            if (this.getAwsKmsKeyArn() != null) {
                data.set("awsKmsKeyArn", om.valueToTree(this.getAwsKmsKeyArn()));
            }
            if (this.getContentConfig() != null) {
                data.set("contentConfig", om.valueToTree(this.getContentConfig()));
            }
            if (this.getContentConfigPermissions() != null) {
                data.set("contentConfigPermissions", om.valueToTree(this.getContentConfigPermissions()));
            }
            if (this.getName() != null) {
                data.set("name", om.valueToTree(this.getName()));
            }
            if (this.getNotifications() != null) {
                data.set("notifications", om.valueToTree(this.getNotifications()));
            }
            if (this.getOutputBucket() != null) {
                data.set("outputBucket", om.valueToTree(this.getOutputBucket()));
            }
            if (this.getThumbnailConfig() != null) {
                data.set("thumbnailConfig", om.valueToTree(this.getThumbnailConfig()));
            }
            if (this.getThumbnailConfigPermissions() != null) {
                data.set("thumbnailConfigPermissions", om.valueToTree(this.getThumbnailConfigPermissions()));
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
            struct.set("fqn", om.valueToTree("aws.ElastictranscoderPipelineConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ElastictranscoderPipelineConfig.Jsii$Proxy that = (ElastictranscoderPipelineConfig.Jsii$Proxy) o;

            if (!inputBucket.equals(that.inputBucket)) return false;
            if (!role.equals(that.role)) return false;
            if (this.awsKmsKeyArn != null ? !this.awsKmsKeyArn.equals(that.awsKmsKeyArn) : that.awsKmsKeyArn != null) return false;
            if (this.contentConfig != null ? !this.contentConfig.equals(that.contentConfig) : that.contentConfig != null) return false;
            if (this.contentConfigPermissions != null ? !this.contentConfigPermissions.equals(that.contentConfigPermissions) : that.contentConfigPermissions != null) return false;
            if (this.name != null ? !this.name.equals(that.name) : that.name != null) return false;
            if (this.notifications != null ? !this.notifications.equals(that.notifications) : that.notifications != null) return false;
            if (this.outputBucket != null ? !this.outputBucket.equals(that.outputBucket) : that.outputBucket != null) return false;
            if (this.thumbnailConfig != null ? !this.thumbnailConfig.equals(that.thumbnailConfig) : that.thumbnailConfig != null) return false;
            if (this.thumbnailConfigPermissions != null ? !this.thumbnailConfigPermissions.equals(that.thumbnailConfigPermissions) : that.thumbnailConfigPermissions != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.inputBucket.hashCode();
            result = 31 * result + (this.role.hashCode());
            result = 31 * result + (this.awsKmsKeyArn != null ? this.awsKmsKeyArn.hashCode() : 0);
            result = 31 * result + (this.contentConfig != null ? this.contentConfig.hashCode() : 0);
            result = 31 * result + (this.contentConfigPermissions != null ? this.contentConfigPermissions.hashCode() : 0);
            result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
            result = 31 * result + (this.notifications != null ? this.notifications.hashCode() : 0);
            result = 31 * result + (this.outputBucket != null ? this.outputBucket.hashCode() : 0);
            result = 31 * result + (this.thumbnailConfig != null ? this.thumbnailConfig.hashCode() : 0);
            result = 31 * result + (this.thumbnailConfigPermissions != null ? this.thumbnailConfigPermissions.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
