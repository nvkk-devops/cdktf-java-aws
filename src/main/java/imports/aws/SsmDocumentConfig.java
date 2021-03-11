package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.893Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.SsmDocumentConfig")
@software.amazon.jsii.Jsii.Proxy(SsmDocumentConfig.Jsii$Proxy.class)
public interface SsmDocumentConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getContent();

    @org.jetbrains.annotations.NotNull java.lang.String getDocumentType();

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * attachments_source block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SsmDocumentAttachmentsSource> getAttachmentsSource() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDocumentFormat() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getPermissions() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getTargetType() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SsmDocumentConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SsmDocumentConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SsmDocumentConfig> {
        private java.lang.String content;
        private java.lang.String documentType;
        private java.lang.String name;
        private java.util.List<imports.aws.SsmDocumentAttachmentsSource> attachmentsSource;
        private java.lang.String documentFormat;
        private java.util.Map<java.lang.String, java.lang.String> permissions;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.lang.String targetType;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link SsmDocumentConfig#getContent}
         * @param content the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder content(java.lang.String content) {
            this.content = content;
            return this;
        }

        /**
         * Sets the value of {@link SsmDocumentConfig#getDocumentType}
         * @param documentType the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder documentType(java.lang.String documentType) {
            this.documentType = documentType;
            return this;
        }

        /**
         * Sets the value of {@link SsmDocumentConfig#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link SsmDocumentConfig#getAttachmentsSource}
         * @param attachmentsSource attachments_source block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder attachmentsSource(java.util.List<? extends imports.aws.SsmDocumentAttachmentsSource> attachmentsSource) {
            this.attachmentsSource = (java.util.List<imports.aws.SsmDocumentAttachmentsSource>)attachmentsSource;
            return this;
        }

        /**
         * Sets the value of {@link SsmDocumentConfig#getDocumentFormat}
         * @param documentFormat the value to be set.
         * @return {@code this}
         */
        public Builder documentFormat(java.lang.String documentFormat) {
            this.documentFormat = documentFormat;
            return this;
        }

        /**
         * Sets the value of {@link SsmDocumentConfig#getPermissions}
         * @param permissions the value to be set.
         * @return {@code this}
         */
        public Builder permissions(java.util.Map<java.lang.String, java.lang.String> permissions) {
            this.permissions = permissions;
            return this;
        }

        /**
         * Sets the value of {@link SsmDocumentConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link SsmDocumentConfig#getTargetType}
         * @param targetType the value to be set.
         * @return {@code this}
         */
        public Builder targetType(java.lang.String targetType) {
            this.targetType = targetType;
            return this;
        }

        /**
         * Sets the value of {@link SsmDocumentConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link SsmDocumentConfig#getDependsOn}
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
         * Sets the value of {@link SsmDocumentConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link SsmDocumentConfig#getProvider}
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
         * @return a new instance of {@link SsmDocumentConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SsmDocumentConfig build() {
            return new Jsii$Proxy(content, documentType, name, attachmentsSource, documentFormat, permissions, tags, targetType, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link SsmDocumentConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SsmDocumentConfig {
        private final java.lang.String content;
        private final java.lang.String documentType;
        private final java.lang.String name;
        private final java.util.List<imports.aws.SsmDocumentAttachmentsSource> attachmentsSource;
        private final java.lang.String documentFormat;
        private final java.util.Map<java.lang.String, java.lang.String> permissions;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.lang.String targetType;
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
            this.content = software.amazon.jsii.Kernel.get(this, "content", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.documentType = software.amazon.jsii.Kernel.get(this, "documentType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.attachmentsSource = software.amazon.jsii.Kernel.get(this, "attachmentsSource", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SsmDocumentAttachmentsSource.class)));
            this.documentFormat = software.amazon.jsii.Kernel.get(this, "documentFormat", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.permissions = software.amazon.jsii.Kernel.get(this, "permissions", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.targetType = software.amazon.jsii.Kernel.get(this, "targetType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String content, final java.lang.String documentType, final java.lang.String name, final java.util.List<? extends imports.aws.SsmDocumentAttachmentsSource> attachmentsSource, final java.lang.String documentFormat, final java.util.Map<java.lang.String, java.lang.String> permissions, final java.util.Map<java.lang.String, java.lang.String> tags, final java.lang.String targetType, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.content = java.util.Objects.requireNonNull(content, "content is required");
            this.documentType = java.util.Objects.requireNonNull(documentType, "documentType is required");
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.attachmentsSource = (java.util.List<imports.aws.SsmDocumentAttachmentsSource>)attachmentsSource;
            this.documentFormat = documentFormat;
            this.permissions = permissions;
            this.tags = tags;
            this.targetType = targetType;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getContent() {
            return this.content;
        }

        @Override
        public final java.lang.String getDocumentType() {
            return this.documentType;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.util.List<imports.aws.SsmDocumentAttachmentsSource> getAttachmentsSource() {
            return this.attachmentsSource;
        }

        @Override
        public final java.lang.String getDocumentFormat() {
            return this.documentFormat;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getPermissions() {
            return this.permissions;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.lang.String getTargetType() {
            return this.targetType;
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

            data.set("content", om.valueToTree(this.getContent()));
            data.set("documentType", om.valueToTree(this.getDocumentType()));
            data.set("name", om.valueToTree(this.getName()));
            if (this.getAttachmentsSource() != null) {
                data.set("attachmentsSource", om.valueToTree(this.getAttachmentsSource()));
            }
            if (this.getDocumentFormat() != null) {
                data.set("documentFormat", om.valueToTree(this.getDocumentFormat()));
            }
            if (this.getPermissions() != null) {
                data.set("permissions", om.valueToTree(this.getPermissions()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getTargetType() != null) {
                data.set("targetType", om.valueToTree(this.getTargetType()));
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
            struct.set("fqn", om.valueToTree("aws.SsmDocumentConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SsmDocumentConfig.Jsii$Proxy that = (SsmDocumentConfig.Jsii$Proxy) o;

            if (!content.equals(that.content)) return false;
            if (!documentType.equals(that.documentType)) return false;
            if (!name.equals(that.name)) return false;
            if (this.attachmentsSource != null ? !this.attachmentsSource.equals(that.attachmentsSource) : that.attachmentsSource != null) return false;
            if (this.documentFormat != null ? !this.documentFormat.equals(that.documentFormat) : that.documentFormat != null) return false;
            if (this.permissions != null ? !this.permissions.equals(that.permissions) : that.permissions != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.targetType != null ? !this.targetType.equals(that.targetType) : that.targetType != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.content.hashCode();
            result = 31 * result + (this.documentType.hashCode());
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.attachmentsSource != null ? this.attachmentsSource.hashCode() : 0);
            result = 31 * result + (this.documentFormat != null ? this.documentFormat.hashCode() : 0);
            result = 31 * result + (this.permissions != null ? this.permissions.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.targetType != null ? this.targetType.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
