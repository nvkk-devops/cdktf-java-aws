package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.527Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.EfsFileSystemConfig")
@software.amazon.jsii.Jsii.Proxy(EfsFileSystemConfig.Jsii$Proxy.class)
public interface EfsFileSystemConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    default @org.jetbrains.annotations.Nullable java.lang.String getCreationToken() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getEncrypted() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getKmsKeyId() {
        return null;
    }

    /**
     * lifecycle_policy block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.EfsFileSystemLifecyclePolicy> getLifecyclePolicy() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPerformanceMode() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getProvisionedThroughputInMibps() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getReferenceName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getThroughputMode() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link EfsFileSystemConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link EfsFileSystemConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<EfsFileSystemConfig> {
        private java.lang.String creationToken;
        private java.lang.Boolean encrypted;
        private java.lang.String kmsKeyId;
        private java.util.List<imports.aws.EfsFileSystemLifecyclePolicy> lifecyclePolicy;
        private java.lang.String performanceMode;
        private java.lang.Number provisionedThroughputInMibps;
        private java.lang.String referenceName;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.lang.String throughputMode;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link EfsFileSystemConfig#getCreationToken}
         * @param creationToken the value to be set.
         * @return {@code this}
         */
        public Builder creationToken(java.lang.String creationToken) {
            this.creationToken = creationToken;
            return this;
        }

        /**
         * Sets the value of {@link EfsFileSystemConfig#getEncrypted}
         * @param encrypted the value to be set.
         * @return {@code this}
         */
        public Builder encrypted(java.lang.Boolean encrypted) {
            this.encrypted = encrypted;
            return this;
        }

        /**
         * Sets the value of {@link EfsFileSystemConfig#getKmsKeyId}
         * @param kmsKeyId the value to be set.
         * @return {@code this}
         */
        public Builder kmsKeyId(java.lang.String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * Sets the value of {@link EfsFileSystemConfig#getLifecyclePolicy}
         * @param lifecyclePolicy lifecycle_policy block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder lifecyclePolicy(java.util.List<? extends imports.aws.EfsFileSystemLifecyclePolicy> lifecyclePolicy) {
            this.lifecyclePolicy = (java.util.List<imports.aws.EfsFileSystemLifecyclePolicy>)lifecyclePolicy;
            return this;
        }

        /**
         * Sets the value of {@link EfsFileSystemConfig#getPerformanceMode}
         * @param performanceMode the value to be set.
         * @return {@code this}
         */
        public Builder performanceMode(java.lang.String performanceMode) {
            this.performanceMode = performanceMode;
            return this;
        }

        /**
         * Sets the value of {@link EfsFileSystemConfig#getProvisionedThroughputInMibps}
         * @param provisionedThroughputInMibps the value to be set.
         * @return {@code this}
         */
        public Builder provisionedThroughputInMibps(java.lang.Number provisionedThroughputInMibps) {
            this.provisionedThroughputInMibps = provisionedThroughputInMibps;
            return this;
        }

        /**
         * Sets the value of {@link EfsFileSystemConfig#getReferenceName}
         * @param referenceName the value to be set.
         * @return {@code this}
         */
        public Builder referenceName(java.lang.String referenceName) {
            this.referenceName = referenceName;
            return this;
        }

        /**
         * Sets the value of {@link EfsFileSystemConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link EfsFileSystemConfig#getThroughputMode}
         * @param throughputMode the value to be set.
         * @return {@code this}
         */
        public Builder throughputMode(java.lang.String throughputMode) {
            this.throughputMode = throughputMode;
            return this;
        }

        /**
         * Sets the value of {@link EfsFileSystemConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link EfsFileSystemConfig#getDependsOn}
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
         * Sets the value of {@link EfsFileSystemConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link EfsFileSystemConfig#getProvider}
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
         * @return a new instance of {@link EfsFileSystemConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public EfsFileSystemConfig build() {
            return new Jsii$Proxy(creationToken, encrypted, kmsKeyId, lifecyclePolicy, performanceMode, provisionedThroughputInMibps, referenceName, tags, throughputMode, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link EfsFileSystemConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements EfsFileSystemConfig {
        private final java.lang.String creationToken;
        private final java.lang.Boolean encrypted;
        private final java.lang.String kmsKeyId;
        private final java.util.List<imports.aws.EfsFileSystemLifecyclePolicy> lifecyclePolicy;
        private final java.lang.String performanceMode;
        private final java.lang.Number provisionedThroughputInMibps;
        private final java.lang.String referenceName;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.lang.String throughputMode;
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
            this.creationToken = software.amazon.jsii.Kernel.get(this, "creationToken", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.encrypted = software.amazon.jsii.Kernel.get(this, "encrypted", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.kmsKeyId = software.amazon.jsii.Kernel.get(this, "kmsKeyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.lifecyclePolicy = software.amazon.jsii.Kernel.get(this, "lifecyclePolicy", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EfsFileSystemLifecyclePolicy.class)));
            this.performanceMode = software.amazon.jsii.Kernel.get(this, "performanceMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.provisionedThroughputInMibps = software.amazon.jsii.Kernel.get(this, "provisionedThroughputInMibps", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.referenceName = software.amazon.jsii.Kernel.get(this, "referenceName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.throughputMode = software.amazon.jsii.Kernel.get(this, "throughputMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String creationToken, final java.lang.Boolean encrypted, final java.lang.String kmsKeyId, final java.util.List<? extends imports.aws.EfsFileSystemLifecyclePolicy> lifecyclePolicy, final java.lang.String performanceMode, final java.lang.Number provisionedThroughputInMibps, final java.lang.String referenceName, final java.util.Map<java.lang.String, java.lang.String> tags, final java.lang.String throughputMode, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.creationToken = creationToken;
            this.encrypted = encrypted;
            this.kmsKeyId = kmsKeyId;
            this.lifecyclePolicy = (java.util.List<imports.aws.EfsFileSystemLifecyclePolicy>)lifecyclePolicy;
            this.performanceMode = performanceMode;
            this.provisionedThroughputInMibps = provisionedThroughputInMibps;
            this.referenceName = referenceName;
            this.tags = tags;
            this.throughputMode = throughputMode;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getCreationToken() {
            return this.creationToken;
        }

        @Override
        public final java.lang.Boolean getEncrypted() {
            return this.encrypted;
        }

        @Override
        public final java.lang.String getKmsKeyId() {
            return this.kmsKeyId;
        }

        @Override
        public final java.util.List<imports.aws.EfsFileSystemLifecyclePolicy> getLifecyclePolicy() {
            return this.lifecyclePolicy;
        }

        @Override
        public final java.lang.String getPerformanceMode() {
            return this.performanceMode;
        }

        @Override
        public final java.lang.Number getProvisionedThroughputInMibps() {
            return this.provisionedThroughputInMibps;
        }

        @Override
        public final java.lang.String getReferenceName() {
            return this.referenceName;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.lang.String getThroughputMode() {
            return this.throughputMode;
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

            if (this.getCreationToken() != null) {
                data.set("creationToken", om.valueToTree(this.getCreationToken()));
            }
            if (this.getEncrypted() != null) {
                data.set("encrypted", om.valueToTree(this.getEncrypted()));
            }
            if (this.getKmsKeyId() != null) {
                data.set("kmsKeyId", om.valueToTree(this.getKmsKeyId()));
            }
            if (this.getLifecyclePolicy() != null) {
                data.set("lifecyclePolicy", om.valueToTree(this.getLifecyclePolicy()));
            }
            if (this.getPerformanceMode() != null) {
                data.set("performanceMode", om.valueToTree(this.getPerformanceMode()));
            }
            if (this.getProvisionedThroughputInMibps() != null) {
                data.set("provisionedThroughputInMibps", om.valueToTree(this.getProvisionedThroughputInMibps()));
            }
            if (this.getReferenceName() != null) {
                data.set("referenceName", om.valueToTree(this.getReferenceName()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getThroughputMode() != null) {
                data.set("throughputMode", om.valueToTree(this.getThroughputMode()));
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
            struct.set("fqn", om.valueToTree("aws.EfsFileSystemConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EfsFileSystemConfig.Jsii$Proxy that = (EfsFileSystemConfig.Jsii$Proxy) o;

            if (this.creationToken != null ? !this.creationToken.equals(that.creationToken) : that.creationToken != null) return false;
            if (this.encrypted != null ? !this.encrypted.equals(that.encrypted) : that.encrypted != null) return false;
            if (this.kmsKeyId != null ? !this.kmsKeyId.equals(that.kmsKeyId) : that.kmsKeyId != null) return false;
            if (this.lifecyclePolicy != null ? !this.lifecyclePolicy.equals(that.lifecyclePolicy) : that.lifecyclePolicy != null) return false;
            if (this.performanceMode != null ? !this.performanceMode.equals(that.performanceMode) : that.performanceMode != null) return false;
            if (this.provisionedThroughputInMibps != null ? !this.provisionedThroughputInMibps.equals(that.provisionedThroughputInMibps) : that.provisionedThroughputInMibps != null) return false;
            if (this.referenceName != null ? !this.referenceName.equals(that.referenceName) : that.referenceName != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.throughputMode != null ? !this.throughputMode.equals(that.throughputMode) : that.throughputMode != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.creationToken != null ? this.creationToken.hashCode() : 0;
            result = 31 * result + (this.encrypted != null ? this.encrypted.hashCode() : 0);
            result = 31 * result + (this.kmsKeyId != null ? this.kmsKeyId.hashCode() : 0);
            result = 31 * result + (this.lifecyclePolicy != null ? this.lifecyclePolicy.hashCode() : 0);
            result = 31 * result + (this.performanceMode != null ? this.performanceMode.hashCode() : 0);
            result = 31 * result + (this.provisionedThroughputInMibps != null ? this.provisionedThroughputInMibps.hashCode() : 0);
            result = 31 * result + (this.referenceName != null ? this.referenceName.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.throughputMode != null ? this.throughputMode.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
