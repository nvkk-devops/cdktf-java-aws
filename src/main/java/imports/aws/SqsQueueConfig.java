package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.889Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.SqsQueueConfig")
@software.amazon.jsii.Jsii.Proxy(SqsQueueConfig.Jsii$Proxy.class)
public interface SqsQueueConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getContentBasedDeduplication() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getDelaySeconds() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getFifoQueue() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getKmsDataKeyReusePeriodSeconds() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getKmsMasterKeyId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getMaxMessageSize() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getMessageRetentionSeconds() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getNamePrefix() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPolicy() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getReceiveWaitTimeSeconds() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getRedrivePolicy() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getVisibilityTimeoutSeconds() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SqsQueueConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SqsQueueConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SqsQueueConfig> {
        private java.lang.Boolean contentBasedDeduplication;
        private java.lang.Number delaySeconds;
        private java.lang.Boolean fifoQueue;
        private java.lang.Number kmsDataKeyReusePeriodSeconds;
        private java.lang.String kmsMasterKeyId;
        private java.lang.Number maxMessageSize;
        private java.lang.Number messageRetentionSeconds;
        private java.lang.String name;
        private java.lang.String namePrefix;
        private java.lang.String policy;
        private java.lang.Number receiveWaitTimeSeconds;
        private java.lang.String redrivePolicy;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.lang.Number visibilityTimeoutSeconds;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link SqsQueueConfig#getContentBasedDeduplication}
         * @param contentBasedDeduplication the value to be set.
         * @return {@code this}
         */
        public Builder contentBasedDeduplication(java.lang.Boolean contentBasedDeduplication) {
            this.contentBasedDeduplication = contentBasedDeduplication;
            return this;
        }

        /**
         * Sets the value of {@link SqsQueueConfig#getDelaySeconds}
         * @param delaySeconds the value to be set.
         * @return {@code this}
         */
        public Builder delaySeconds(java.lang.Number delaySeconds) {
            this.delaySeconds = delaySeconds;
            return this;
        }

        /**
         * Sets the value of {@link SqsQueueConfig#getFifoQueue}
         * @param fifoQueue the value to be set.
         * @return {@code this}
         */
        public Builder fifoQueue(java.lang.Boolean fifoQueue) {
            this.fifoQueue = fifoQueue;
            return this;
        }

        /**
         * Sets the value of {@link SqsQueueConfig#getKmsDataKeyReusePeriodSeconds}
         * @param kmsDataKeyReusePeriodSeconds the value to be set.
         * @return {@code this}
         */
        public Builder kmsDataKeyReusePeriodSeconds(java.lang.Number kmsDataKeyReusePeriodSeconds) {
            this.kmsDataKeyReusePeriodSeconds = kmsDataKeyReusePeriodSeconds;
            return this;
        }

        /**
         * Sets the value of {@link SqsQueueConfig#getKmsMasterKeyId}
         * @param kmsMasterKeyId the value to be set.
         * @return {@code this}
         */
        public Builder kmsMasterKeyId(java.lang.String kmsMasterKeyId) {
            this.kmsMasterKeyId = kmsMasterKeyId;
            return this;
        }

        /**
         * Sets the value of {@link SqsQueueConfig#getMaxMessageSize}
         * @param maxMessageSize the value to be set.
         * @return {@code this}
         */
        public Builder maxMessageSize(java.lang.Number maxMessageSize) {
            this.maxMessageSize = maxMessageSize;
            return this;
        }

        /**
         * Sets the value of {@link SqsQueueConfig#getMessageRetentionSeconds}
         * @param messageRetentionSeconds the value to be set.
         * @return {@code this}
         */
        public Builder messageRetentionSeconds(java.lang.Number messageRetentionSeconds) {
            this.messageRetentionSeconds = messageRetentionSeconds;
            return this;
        }

        /**
         * Sets the value of {@link SqsQueueConfig#getName}
         * @param name the value to be set.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link SqsQueueConfig#getNamePrefix}
         * @param namePrefix the value to be set.
         * @return {@code this}
         */
        public Builder namePrefix(java.lang.String namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }

        /**
         * Sets the value of {@link SqsQueueConfig#getPolicy}
         * @param policy the value to be set.
         * @return {@code this}
         */
        public Builder policy(java.lang.String policy) {
            this.policy = policy;
            return this;
        }

        /**
         * Sets the value of {@link SqsQueueConfig#getReceiveWaitTimeSeconds}
         * @param receiveWaitTimeSeconds the value to be set.
         * @return {@code this}
         */
        public Builder receiveWaitTimeSeconds(java.lang.Number receiveWaitTimeSeconds) {
            this.receiveWaitTimeSeconds = receiveWaitTimeSeconds;
            return this;
        }

        /**
         * Sets the value of {@link SqsQueueConfig#getRedrivePolicy}
         * @param redrivePolicy the value to be set.
         * @return {@code this}
         */
        public Builder redrivePolicy(java.lang.String redrivePolicy) {
            this.redrivePolicy = redrivePolicy;
            return this;
        }

        /**
         * Sets the value of {@link SqsQueueConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link SqsQueueConfig#getVisibilityTimeoutSeconds}
         * @param visibilityTimeoutSeconds the value to be set.
         * @return {@code this}
         */
        public Builder visibilityTimeoutSeconds(java.lang.Number visibilityTimeoutSeconds) {
            this.visibilityTimeoutSeconds = visibilityTimeoutSeconds;
            return this;
        }

        /**
         * Sets the value of {@link SqsQueueConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link SqsQueueConfig#getDependsOn}
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
         * Sets the value of {@link SqsQueueConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link SqsQueueConfig#getProvider}
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
         * @return a new instance of {@link SqsQueueConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SqsQueueConfig build() {
            return new Jsii$Proxy(contentBasedDeduplication, delaySeconds, fifoQueue, kmsDataKeyReusePeriodSeconds, kmsMasterKeyId, maxMessageSize, messageRetentionSeconds, name, namePrefix, policy, receiveWaitTimeSeconds, redrivePolicy, tags, visibilityTimeoutSeconds, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link SqsQueueConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SqsQueueConfig {
        private final java.lang.Boolean contentBasedDeduplication;
        private final java.lang.Number delaySeconds;
        private final java.lang.Boolean fifoQueue;
        private final java.lang.Number kmsDataKeyReusePeriodSeconds;
        private final java.lang.String kmsMasterKeyId;
        private final java.lang.Number maxMessageSize;
        private final java.lang.Number messageRetentionSeconds;
        private final java.lang.String name;
        private final java.lang.String namePrefix;
        private final java.lang.String policy;
        private final java.lang.Number receiveWaitTimeSeconds;
        private final java.lang.String redrivePolicy;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.lang.Number visibilityTimeoutSeconds;
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
            this.contentBasedDeduplication = software.amazon.jsii.Kernel.get(this, "contentBasedDeduplication", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.delaySeconds = software.amazon.jsii.Kernel.get(this, "delaySeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.fifoQueue = software.amazon.jsii.Kernel.get(this, "fifoQueue", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.kmsDataKeyReusePeriodSeconds = software.amazon.jsii.Kernel.get(this, "kmsDataKeyReusePeriodSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.kmsMasterKeyId = software.amazon.jsii.Kernel.get(this, "kmsMasterKeyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.maxMessageSize = software.amazon.jsii.Kernel.get(this, "maxMessageSize", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.messageRetentionSeconds = software.amazon.jsii.Kernel.get(this, "messageRetentionSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.namePrefix = software.amazon.jsii.Kernel.get(this, "namePrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.policy = software.amazon.jsii.Kernel.get(this, "policy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.receiveWaitTimeSeconds = software.amazon.jsii.Kernel.get(this, "receiveWaitTimeSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.redrivePolicy = software.amazon.jsii.Kernel.get(this, "redrivePolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.visibilityTimeoutSeconds = software.amazon.jsii.Kernel.get(this, "visibilityTimeoutSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.Boolean contentBasedDeduplication, final java.lang.Number delaySeconds, final java.lang.Boolean fifoQueue, final java.lang.Number kmsDataKeyReusePeriodSeconds, final java.lang.String kmsMasterKeyId, final java.lang.Number maxMessageSize, final java.lang.Number messageRetentionSeconds, final java.lang.String name, final java.lang.String namePrefix, final java.lang.String policy, final java.lang.Number receiveWaitTimeSeconds, final java.lang.String redrivePolicy, final java.util.Map<java.lang.String, java.lang.String> tags, final java.lang.Number visibilityTimeoutSeconds, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.contentBasedDeduplication = contentBasedDeduplication;
            this.delaySeconds = delaySeconds;
            this.fifoQueue = fifoQueue;
            this.kmsDataKeyReusePeriodSeconds = kmsDataKeyReusePeriodSeconds;
            this.kmsMasterKeyId = kmsMasterKeyId;
            this.maxMessageSize = maxMessageSize;
            this.messageRetentionSeconds = messageRetentionSeconds;
            this.name = name;
            this.namePrefix = namePrefix;
            this.policy = policy;
            this.receiveWaitTimeSeconds = receiveWaitTimeSeconds;
            this.redrivePolicy = redrivePolicy;
            this.tags = tags;
            this.visibilityTimeoutSeconds = visibilityTimeoutSeconds;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.Boolean getContentBasedDeduplication() {
            return this.contentBasedDeduplication;
        }

        @Override
        public final java.lang.Number getDelaySeconds() {
            return this.delaySeconds;
        }

        @Override
        public final java.lang.Boolean getFifoQueue() {
            return this.fifoQueue;
        }

        @Override
        public final java.lang.Number getKmsDataKeyReusePeriodSeconds() {
            return this.kmsDataKeyReusePeriodSeconds;
        }

        @Override
        public final java.lang.String getKmsMasterKeyId() {
            return this.kmsMasterKeyId;
        }

        @Override
        public final java.lang.Number getMaxMessageSize() {
            return this.maxMessageSize;
        }

        @Override
        public final java.lang.Number getMessageRetentionSeconds() {
            return this.messageRetentionSeconds;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getNamePrefix() {
            return this.namePrefix;
        }

        @Override
        public final java.lang.String getPolicy() {
            return this.policy;
        }

        @Override
        public final java.lang.Number getReceiveWaitTimeSeconds() {
            return this.receiveWaitTimeSeconds;
        }

        @Override
        public final java.lang.String getRedrivePolicy() {
            return this.redrivePolicy;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.lang.Number getVisibilityTimeoutSeconds() {
            return this.visibilityTimeoutSeconds;
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

            if (this.getContentBasedDeduplication() != null) {
                data.set("contentBasedDeduplication", om.valueToTree(this.getContentBasedDeduplication()));
            }
            if (this.getDelaySeconds() != null) {
                data.set("delaySeconds", om.valueToTree(this.getDelaySeconds()));
            }
            if (this.getFifoQueue() != null) {
                data.set("fifoQueue", om.valueToTree(this.getFifoQueue()));
            }
            if (this.getKmsDataKeyReusePeriodSeconds() != null) {
                data.set("kmsDataKeyReusePeriodSeconds", om.valueToTree(this.getKmsDataKeyReusePeriodSeconds()));
            }
            if (this.getKmsMasterKeyId() != null) {
                data.set("kmsMasterKeyId", om.valueToTree(this.getKmsMasterKeyId()));
            }
            if (this.getMaxMessageSize() != null) {
                data.set("maxMessageSize", om.valueToTree(this.getMaxMessageSize()));
            }
            if (this.getMessageRetentionSeconds() != null) {
                data.set("messageRetentionSeconds", om.valueToTree(this.getMessageRetentionSeconds()));
            }
            if (this.getName() != null) {
                data.set("name", om.valueToTree(this.getName()));
            }
            if (this.getNamePrefix() != null) {
                data.set("namePrefix", om.valueToTree(this.getNamePrefix()));
            }
            if (this.getPolicy() != null) {
                data.set("policy", om.valueToTree(this.getPolicy()));
            }
            if (this.getReceiveWaitTimeSeconds() != null) {
                data.set("receiveWaitTimeSeconds", om.valueToTree(this.getReceiveWaitTimeSeconds()));
            }
            if (this.getRedrivePolicy() != null) {
                data.set("redrivePolicy", om.valueToTree(this.getRedrivePolicy()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getVisibilityTimeoutSeconds() != null) {
                data.set("visibilityTimeoutSeconds", om.valueToTree(this.getVisibilityTimeoutSeconds()));
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
            struct.set("fqn", om.valueToTree("aws.SqsQueueConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SqsQueueConfig.Jsii$Proxy that = (SqsQueueConfig.Jsii$Proxy) o;

            if (this.contentBasedDeduplication != null ? !this.contentBasedDeduplication.equals(that.contentBasedDeduplication) : that.contentBasedDeduplication != null) return false;
            if (this.delaySeconds != null ? !this.delaySeconds.equals(that.delaySeconds) : that.delaySeconds != null) return false;
            if (this.fifoQueue != null ? !this.fifoQueue.equals(that.fifoQueue) : that.fifoQueue != null) return false;
            if (this.kmsDataKeyReusePeriodSeconds != null ? !this.kmsDataKeyReusePeriodSeconds.equals(that.kmsDataKeyReusePeriodSeconds) : that.kmsDataKeyReusePeriodSeconds != null) return false;
            if (this.kmsMasterKeyId != null ? !this.kmsMasterKeyId.equals(that.kmsMasterKeyId) : that.kmsMasterKeyId != null) return false;
            if (this.maxMessageSize != null ? !this.maxMessageSize.equals(that.maxMessageSize) : that.maxMessageSize != null) return false;
            if (this.messageRetentionSeconds != null ? !this.messageRetentionSeconds.equals(that.messageRetentionSeconds) : that.messageRetentionSeconds != null) return false;
            if (this.name != null ? !this.name.equals(that.name) : that.name != null) return false;
            if (this.namePrefix != null ? !this.namePrefix.equals(that.namePrefix) : that.namePrefix != null) return false;
            if (this.policy != null ? !this.policy.equals(that.policy) : that.policy != null) return false;
            if (this.receiveWaitTimeSeconds != null ? !this.receiveWaitTimeSeconds.equals(that.receiveWaitTimeSeconds) : that.receiveWaitTimeSeconds != null) return false;
            if (this.redrivePolicy != null ? !this.redrivePolicy.equals(that.redrivePolicy) : that.redrivePolicy != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.visibilityTimeoutSeconds != null ? !this.visibilityTimeoutSeconds.equals(that.visibilityTimeoutSeconds) : that.visibilityTimeoutSeconds != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.contentBasedDeduplication != null ? this.contentBasedDeduplication.hashCode() : 0;
            result = 31 * result + (this.delaySeconds != null ? this.delaySeconds.hashCode() : 0);
            result = 31 * result + (this.fifoQueue != null ? this.fifoQueue.hashCode() : 0);
            result = 31 * result + (this.kmsDataKeyReusePeriodSeconds != null ? this.kmsDataKeyReusePeriodSeconds.hashCode() : 0);
            result = 31 * result + (this.kmsMasterKeyId != null ? this.kmsMasterKeyId.hashCode() : 0);
            result = 31 * result + (this.maxMessageSize != null ? this.maxMessageSize.hashCode() : 0);
            result = 31 * result + (this.messageRetentionSeconds != null ? this.messageRetentionSeconds.hashCode() : 0);
            result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
            result = 31 * result + (this.namePrefix != null ? this.namePrefix.hashCode() : 0);
            result = 31 * result + (this.policy != null ? this.policy.hashCode() : 0);
            result = 31 * result + (this.receiveWaitTimeSeconds != null ? this.receiveWaitTimeSeconds.hashCode() : 0);
            result = 31 * result + (this.redrivePolicy != null ? this.redrivePolicy.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.visibilityTimeoutSeconds != null ? this.visibilityTimeoutSeconds.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
