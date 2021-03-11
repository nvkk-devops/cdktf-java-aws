package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.833Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.S3BucketLifecycleRule")
@software.amazon.jsii.Jsii.Proxy(S3BucketLifecycleRule.Jsii$Proxy.class)
public interface S3BucketLifecycleRule extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.Boolean getEnabled();

    default @org.jetbrains.annotations.Nullable java.lang.Number getAbortIncompleteMultipartUploadDays() {
        return null;
    }

    /**
     * expiration block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.S3BucketLifecycleRuleExpiration> getExpiration() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     * noncurrent_version_expiration block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.S3BucketLifecycleRuleNoncurrentVersionExpiration> getNoncurrentVersionExpiration() {
        return null;
    }

    /**
     * noncurrent_version_transition block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.S3BucketLifecycleRuleNoncurrentVersionTransition> getNoncurrentVersionTransition() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPrefix() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * transition block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.S3BucketLifecycleRuleTransition> getTransition() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link S3BucketLifecycleRule}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link S3BucketLifecycleRule}
     */
    public static final class Builder implements software.amazon.jsii.Builder<S3BucketLifecycleRule> {
        private java.lang.Boolean enabled;
        private java.lang.Number abortIncompleteMultipartUploadDays;
        private java.util.List<imports.aws.S3BucketLifecycleRuleExpiration> expiration;
        private java.lang.String id;
        private java.util.List<imports.aws.S3BucketLifecycleRuleNoncurrentVersionExpiration> noncurrentVersionExpiration;
        private java.util.List<imports.aws.S3BucketLifecycleRuleNoncurrentVersionTransition> noncurrentVersionTransition;
        private java.lang.String prefix;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.util.List<imports.aws.S3BucketLifecycleRuleTransition> transition;

        /**
         * Sets the value of {@link S3BucketLifecycleRule#getEnabled}
         * @param enabled the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder enabled(java.lang.Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketLifecycleRule#getAbortIncompleteMultipartUploadDays}
         * @param abortIncompleteMultipartUploadDays the value to be set.
         * @return {@code this}
         */
        public Builder abortIncompleteMultipartUploadDays(java.lang.Number abortIncompleteMultipartUploadDays) {
            this.abortIncompleteMultipartUploadDays = abortIncompleteMultipartUploadDays;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketLifecycleRule#getExpiration}
         * @param expiration expiration block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder expiration(java.util.List<? extends imports.aws.S3BucketLifecycleRuleExpiration> expiration) {
            this.expiration = (java.util.List<imports.aws.S3BucketLifecycleRuleExpiration>)expiration;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketLifecycleRule#getId}
         * @param id the value to be set.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketLifecycleRule#getNoncurrentVersionExpiration}
         * @param noncurrentVersionExpiration noncurrent_version_expiration block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder noncurrentVersionExpiration(java.util.List<? extends imports.aws.S3BucketLifecycleRuleNoncurrentVersionExpiration> noncurrentVersionExpiration) {
            this.noncurrentVersionExpiration = (java.util.List<imports.aws.S3BucketLifecycleRuleNoncurrentVersionExpiration>)noncurrentVersionExpiration;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketLifecycleRule#getNoncurrentVersionTransition}
         * @param noncurrentVersionTransition noncurrent_version_transition block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder noncurrentVersionTransition(java.util.List<? extends imports.aws.S3BucketLifecycleRuleNoncurrentVersionTransition> noncurrentVersionTransition) {
            this.noncurrentVersionTransition = (java.util.List<imports.aws.S3BucketLifecycleRuleNoncurrentVersionTransition>)noncurrentVersionTransition;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketLifecycleRule#getPrefix}
         * @param prefix the value to be set.
         * @return {@code this}
         */
        public Builder prefix(java.lang.String prefix) {
            this.prefix = prefix;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketLifecycleRule#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketLifecycleRule#getTransition}
         * @param transition transition block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder transition(java.util.List<? extends imports.aws.S3BucketLifecycleRuleTransition> transition) {
            this.transition = (java.util.List<imports.aws.S3BucketLifecycleRuleTransition>)transition;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link S3BucketLifecycleRule}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public S3BucketLifecycleRule build() {
            return new Jsii$Proxy(enabled, abortIncompleteMultipartUploadDays, expiration, id, noncurrentVersionExpiration, noncurrentVersionTransition, prefix, tags, transition);
        }
    }

    /**
     * An implementation for {@link S3BucketLifecycleRule}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements S3BucketLifecycleRule {
        private final java.lang.Boolean enabled;
        private final java.lang.Number abortIncompleteMultipartUploadDays;
        private final java.util.List<imports.aws.S3BucketLifecycleRuleExpiration> expiration;
        private final java.lang.String id;
        private final java.util.List<imports.aws.S3BucketLifecycleRuleNoncurrentVersionExpiration> noncurrentVersionExpiration;
        private final java.util.List<imports.aws.S3BucketLifecycleRuleNoncurrentVersionTransition> noncurrentVersionTransition;
        private final java.lang.String prefix;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.util.List<imports.aws.S3BucketLifecycleRuleTransition> transition;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.enabled = software.amazon.jsii.Kernel.get(this, "enabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.abortIncompleteMultipartUploadDays = software.amazon.jsii.Kernel.get(this, "abortIncompleteMultipartUploadDays", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.expiration = software.amazon.jsii.Kernel.get(this, "expiration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.S3BucketLifecycleRuleExpiration.class)));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.noncurrentVersionExpiration = software.amazon.jsii.Kernel.get(this, "noncurrentVersionExpiration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.S3BucketLifecycleRuleNoncurrentVersionExpiration.class)));
            this.noncurrentVersionTransition = software.amazon.jsii.Kernel.get(this, "noncurrentVersionTransition", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.S3BucketLifecycleRuleNoncurrentVersionTransition.class)));
            this.prefix = software.amazon.jsii.Kernel.get(this, "prefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.transition = software.amazon.jsii.Kernel.get(this, "transition", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.S3BucketLifecycleRuleTransition.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.Boolean enabled, final java.lang.Number abortIncompleteMultipartUploadDays, final java.util.List<? extends imports.aws.S3BucketLifecycleRuleExpiration> expiration, final java.lang.String id, final java.util.List<? extends imports.aws.S3BucketLifecycleRuleNoncurrentVersionExpiration> noncurrentVersionExpiration, final java.util.List<? extends imports.aws.S3BucketLifecycleRuleNoncurrentVersionTransition> noncurrentVersionTransition, final java.lang.String prefix, final java.util.Map<java.lang.String, java.lang.String> tags, final java.util.List<? extends imports.aws.S3BucketLifecycleRuleTransition> transition) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.enabled = java.util.Objects.requireNonNull(enabled, "enabled is required");
            this.abortIncompleteMultipartUploadDays = abortIncompleteMultipartUploadDays;
            this.expiration = (java.util.List<imports.aws.S3BucketLifecycleRuleExpiration>)expiration;
            this.id = id;
            this.noncurrentVersionExpiration = (java.util.List<imports.aws.S3BucketLifecycleRuleNoncurrentVersionExpiration>)noncurrentVersionExpiration;
            this.noncurrentVersionTransition = (java.util.List<imports.aws.S3BucketLifecycleRuleNoncurrentVersionTransition>)noncurrentVersionTransition;
            this.prefix = prefix;
            this.tags = tags;
            this.transition = (java.util.List<imports.aws.S3BucketLifecycleRuleTransition>)transition;
        }

        @Override
        public final java.lang.Boolean getEnabled() {
            return this.enabled;
        }

        @Override
        public final java.lang.Number getAbortIncompleteMultipartUploadDays() {
            return this.abortIncompleteMultipartUploadDays;
        }

        @Override
        public final java.util.List<imports.aws.S3BucketLifecycleRuleExpiration> getExpiration() {
            return this.expiration;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        public final java.util.List<imports.aws.S3BucketLifecycleRuleNoncurrentVersionExpiration> getNoncurrentVersionExpiration() {
            return this.noncurrentVersionExpiration;
        }

        @Override
        public final java.util.List<imports.aws.S3BucketLifecycleRuleNoncurrentVersionTransition> getNoncurrentVersionTransition() {
            return this.noncurrentVersionTransition;
        }

        @Override
        public final java.lang.String getPrefix() {
            return this.prefix;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.util.List<imports.aws.S3BucketLifecycleRuleTransition> getTransition() {
            return this.transition;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("enabled", om.valueToTree(this.getEnabled()));
            if (this.getAbortIncompleteMultipartUploadDays() != null) {
                data.set("abortIncompleteMultipartUploadDays", om.valueToTree(this.getAbortIncompleteMultipartUploadDays()));
            }
            if (this.getExpiration() != null) {
                data.set("expiration", om.valueToTree(this.getExpiration()));
            }
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
            }
            if (this.getNoncurrentVersionExpiration() != null) {
                data.set("noncurrentVersionExpiration", om.valueToTree(this.getNoncurrentVersionExpiration()));
            }
            if (this.getNoncurrentVersionTransition() != null) {
                data.set("noncurrentVersionTransition", om.valueToTree(this.getNoncurrentVersionTransition()));
            }
            if (this.getPrefix() != null) {
                data.set("prefix", om.valueToTree(this.getPrefix()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getTransition() != null) {
                data.set("transition", om.valueToTree(this.getTransition()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.S3BucketLifecycleRule"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            S3BucketLifecycleRule.Jsii$Proxy that = (S3BucketLifecycleRule.Jsii$Proxy) o;

            if (!enabled.equals(that.enabled)) return false;
            if (this.abortIncompleteMultipartUploadDays != null ? !this.abortIncompleteMultipartUploadDays.equals(that.abortIncompleteMultipartUploadDays) : that.abortIncompleteMultipartUploadDays != null) return false;
            if (this.expiration != null ? !this.expiration.equals(that.expiration) : that.expiration != null) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
            if (this.noncurrentVersionExpiration != null ? !this.noncurrentVersionExpiration.equals(that.noncurrentVersionExpiration) : that.noncurrentVersionExpiration != null) return false;
            if (this.noncurrentVersionTransition != null ? !this.noncurrentVersionTransition.equals(that.noncurrentVersionTransition) : that.noncurrentVersionTransition != null) return false;
            if (this.prefix != null ? !this.prefix.equals(that.prefix) : that.prefix != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            return this.transition != null ? this.transition.equals(that.transition) : that.transition == null;
        }

        @Override
        public final int hashCode() {
            int result = this.enabled.hashCode();
            result = 31 * result + (this.abortIncompleteMultipartUploadDays != null ? this.abortIncompleteMultipartUploadDays.hashCode() : 0);
            result = 31 * result + (this.expiration != null ? this.expiration.hashCode() : 0);
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
            result = 31 * result + (this.noncurrentVersionExpiration != null ? this.noncurrentVersionExpiration.hashCode() : 0);
            result = 31 * result + (this.noncurrentVersionTransition != null ? this.noncurrentVersionTransition.hashCode() : 0);
            result = 31 * result + (this.prefix != null ? this.prefix.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.transition != null ? this.transition.hashCode() : 0);
            return result;
        }
    }
}
