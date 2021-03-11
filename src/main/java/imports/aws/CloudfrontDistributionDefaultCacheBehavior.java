package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.121Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CloudfrontDistributionDefaultCacheBehavior")
@software.amazon.jsii.Jsii.Proxy(CloudfrontDistributionDefaultCacheBehavior.Jsii$Proxy.class)
public interface CloudfrontDistributionDefaultCacheBehavior extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getAllowedMethods();

    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getCachedMethods();

    /**
     * forwarded_values block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CloudfrontDistributionDefaultCacheBehaviorForwardedValues> getForwardedValues();

    @org.jetbrains.annotations.NotNull java.lang.String getTargetOriginId();

    @org.jetbrains.annotations.NotNull java.lang.String getViewerProtocolPolicy();

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getCompress() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getDefaultTtl() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getFieldLevelEncryptionId() {
        return null;
    }

    /**
     * lambda_function_association block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CloudfrontDistributionDefaultCacheBehaviorLambdaFunctionAssociation> getLambdaFunctionAssociation() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getMaxTtl() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getMinTtl() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getSmoothStreaming() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getTrustedSigners() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CloudfrontDistributionDefaultCacheBehavior}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CloudfrontDistributionDefaultCacheBehavior}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CloudfrontDistributionDefaultCacheBehavior> {
        private java.util.List<java.lang.String> allowedMethods;
        private java.util.List<java.lang.String> cachedMethods;
        private java.util.List<imports.aws.CloudfrontDistributionDefaultCacheBehaviorForwardedValues> forwardedValues;
        private java.lang.String targetOriginId;
        private java.lang.String viewerProtocolPolicy;
        private java.lang.Boolean compress;
        private java.lang.Number defaultTtl;
        private java.lang.String fieldLevelEncryptionId;
        private java.util.List<imports.aws.CloudfrontDistributionDefaultCacheBehaviorLambdaFunctionAssociation> lambdaFunctionAssociation;
        private java.lang.Number maxTtl;
        private java.lang.Number minTtl;
        private java.lang.Boolean smoothStreaming;
        private java.util.List<java.lang.String> trustedSigners;

        /**
         * Sets the value of {@link CloudfrontDistributionDefaultCacheBehavior#getAllowedMethods}
         * @param allowedMethods the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder allowedMethods(java.util.List<java.lang.String> allowedMethods) {
            this.allowedMethods = allowedMethods;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionDefaultCacheBehavior#getCachedMethods}
         * @param cachedMethods the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder cachedMethods(java.util.List<java.lang.String> cachedMethods) {
            this.cachedMethods = cachedMethods;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionDefaultCacheBehavior#getForwardedValues}
         * @param forwardedValues forwarded_values block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder forwardedValues(java.util.List<? extends imports.aws.CloudfrontDistributionDefaultCacheBehaviorForwardedValues> forwardedValues) {
            this.forwardedValues = (java.util.List<imports.aws.CloudfrontDistributionDefaultCacheBehaviorForwardedValues>)forwardedValues;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionDefaultCacheBehavior#getTargetOriginId}
         * @param targetOriginId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder targetOriginId(java.lang.String targetOriginId) {
            this.targetOriginId = targetOriginId;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionDefaultCacheBehavior#getViewerProtocolPolicy}
         * @param viewerProtocolPolicy the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder viewerProtocolPolicy(java.lang.String viewerProtocolPolicy) {
            this.viewerProtocolPolicy = viewerProtocolPolicy;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionDefaultCacheBehavior#getCompress}
         * @param compress the value to be set.
         * @return {@code this}
         */
        public Builder compress(java.lang.Boolean compress) {
            this.compress = compress;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionDefaultCacheBehavior#getDefaultTtl}
         * @param defaultTtl the value to be set.
         * @return {@code this}
         */
        public Builder defaultTtl(java.lang.Number defaultTtl) {
            this.defaultTtl = defaultTtl;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionDefaultCacheBehavior#getFieldLevelEncryptionId}
         * @param fieldLevelEncryptionId the value to be set.
         * @return {@code this}
         */
        public Builder fieldLevelEncryptionId(java.lang.String fieldLevelEncryptionId) {
            this.fieldLevelEncryptionId = fieldLevelEncryptionId;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionDefaultCacheBehavior#getLambdaFunctionAssociation}
         * @param lambdaFunctionAssociation lambda_function_association block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder lambdaFunctionAssociation(java.util.List<? extends imports.aws.CloudfrontDistributionDefaultCacheBehaviorLambdaFunctionAssociation> lambdaFunctionAssociation) {
            this.lambdaFunctionAssociation = (java.util.List<imports.aws.CloudfrontDistributionDefaultCacheBehaviorLambdaFunctionAssociation>)lambdaFunctionAssociation;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionDefaultCacheBehavior#getMaxTtl}
         * @param maxTtl the value to be set.
         * @return {@code this}
         */
        public Builder maxTtl(java.lang.Number maxTtl) {
            this.maxTtl = maxTtl;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionDefaultCacheBehavior#getMinTtl}
         * @param minTtl the value to be set.
         * @return {@code this}
         */
        public Builder minTtl(java.lang.Number minTtl) {
            this.minTtl = minTtl;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionDefaultCacheBehavior#getSmoothStreaming}
         * @param smoothStreaming the value to be set.
         * @return {@code this}
         */
        public Builder smoothStreaming(java.lang.Boolean smoothStreaming) {
            this.smoothStreaming = smoothStreaming;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionDefaultCacheBehavior#getTrustedSigners}
         * @param trustedSigners the value to be set.
         * @return {@code this}
         */
        public Builder trustedSigners(java.util.List<java.lang.String> trustedSigners) {
            this.trustedSigners = trustedSigners;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CloudfrontDistributionDefaultCacheBehavior}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CloudfrontDistributionDefaultCacheBehavior build() {
            return new Jsii$Proxy(allowedMethods, cachedMethods, forwardedValues, targetOriginId, viewerProtocolPolicy, compress, defaultTtl, fieldLevelEncryptionId, lambdaFunctionAssociation, maxTtl, minTtl, smoothStreaming, trustedSigners);
        }
    }

    /**
     * An implementation for {@link CloudfrontDistributionDefaultCacheBehavior}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CloudfrontDistributionDefaultCacheBehavior {
        private final java.util.List<java.lang.String> allowedMethods;
        private final java.util.List<java.lang.String> cachedMethods;
        private final java.util.List<imports.aws.CloudfrontDistributionDefaultCacheBehaviorForwardedValues> forwardedValues;
        private final java.lang.String targetOriginId;
        private final java.lang.String viewerProtocolPolicy;
        private final java.lang.Boolean compress;
        private final java.lang.Number defaultTtl;
        private final java.lang.String fieldLevelEncryptionId;
        private final java.util.List<imports.aws.CloudfrontDistributionDefaultCacheBehaviorLambdaFunctionAssociation> lambdaFunctionAssociation;
        private final java.lang.Number maxTtl;
        private final java.lang.Number minTtl;
        private final java.lang.Boolean smoothStreaming;
        private final java.util.List<java.lang.String> trustedSigners;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.allowedMethods = software.amazon.jsii.Kernel.get(this, "allowedMethods", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.cachedMethods = software.amazon.jsii.Kernel.get(this, "cachedMethods", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.forwardedValues = software.amazon.jsii.Kernel.get(this, "forwardedValues", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CloudfrontDistributionDefaultCacheBehaviorForwardedValues.class)));
            this.targetOriginId = software.amazon.jsii.Kernel.get(this, "targetOriginId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.viewerProtocolPolicy = software.amazon.jsii.Kernel.get(this, "viewerProtocolPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.compress = software.amazon.jsii.Kernel.get(this, "compress", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.defaultTtl = software.amazon.jsii.Kernel.get(this, "defaultTtl", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.fieldLevelEncryptionId = software.amazon.jsii.Kernel.get(this, "fieldLevelEncryptionId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.lambdaFunctionAssociation = software.amazon.jsii.Kernel.get(this, "lambdaFunctionAssociation", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CloudfrontDistributionDefaultCacheBehaviorLambdaFunctionAssociation.class)));
            this.maxTtl = software.amazon.jsii.Kernel.get(this, "maxTtl", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.minTtl = software.amazon.jsii.Kernel.get(this, "minTtl", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.smoothStreaming = software.amazon.jsii.Kernel.get(this, "smoothStreaming", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.trustedSigners = software.amazon.jsii.Kernel.get(this, "trustedSigners", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<java.lang.String> allowedMethods, final java.util.List<java.lang.String> cachedMethods, final java.util.List<? extends imports.aws.CloudfrontDistributionDefaultCacheBehaviorForwardedValues> forwardedValues, final java.lang.String targetOriginId, final java.lang.String viewerProtocolPolicy, final java.lang.Boolean compress, final java.lang.Number defaultTtl, final java.lang.String fieldLevelEncryptionId, final java.util.List<? extends imports.aws.CloudfrontDistributionDefaultCacheBehaviorLambdaFunctionAssociation> lambdaFunctionAssociation, final java.lang.Number maxTtl, final java.lang.Number minTtl, final java.lang.Boolean smoothStreaming, final java.util.List<java.lang.String> trustedSigners) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.allowedMethods = java.util.Objects.requireNonNull(allowedMethods, "allowedMethods is required");
            this.cachedMethods = java.util.Objects.requireNonNull(cachedMethods, "cachedMethods is required");
            this.forwardedValues = (java.util.List<imports.aws.CloudfrontDistributionDefaultCacheBehaviorForwardedValues>)java.util.Objects.requireNonNull(forwardedValues, "forwardedValues is required");
            this.targetOriginId = java.util.Objects.requireNonNull(targetOriginId, "targetOriginId is required");
            this.viewerProtocolPolicy = java.util.Objects.requireNonNull(viewerProtocolPolicy, "viewerProtocolPolicy is required");
            this.compress = compress;
            this.defaultTtl = defaultTtl;
            this.fieldLevelEncryptionId = fieldLevelEncryptionId;
            this.lambdaFunctionAssociation = (java.util.List<imports.aws.CloudfrontDistributionDefaultCacheBehaviorLambdaFunctionAssociation>)lambdaFunctionAssociation;
            this.maxTtl = maxTtl;
            this.minTtl = minTtl;
            this.smoothStreaming = smoothStreaming;
            this.trustedSigners = trustedSigners;
        }

        @Override
        public final java.util.List<java.lang.String> getAllowedMethods() {
            return this.allowedMethods;
        }

        @Override
        public final java.util.List<java.lang.String> getCachedMethods() {
            return this.cachedMethods;
        }

        @Override
        public final java.util.List<imports.aws.CloudfrontDistributionDefaultCacheBehaviorForwardedValues> getForwardedValues() {
            return this.forwardedValues;
        }

        @Override
        public final java.lang.String getTargetOriginId() {
            return this.targetOriginId;
        }

        @Override
        public final java.lang.String getViewerProtocolPolicy() {
            return this.viewerProtocolPolicy;
        }

        @Override
        public final java.lang.Boolean getCompress() {
            return this.compress;
        }

        @Override
        public final java.lang.Number getDefaultTtl() {
            return this.defaultTtl;
        }

        @Override
        public final java.lang.String getFieldLevelEncryptionId() {
            return this.fieldLevelEncryptionId;
        }

        @Override
        public final java.util.List<imports.aws.CloudfrontDistributionDefaultCacheBehaviorLambdaFunctionAssociation> getLambdaFunctionAssociation() {
            return this.lambdaFunctionAssociation;
        }

        @Override
        public final java.lang.Number getMaxTtl() {
            return this.maxTtl;
        }

        @Override
        public final java.lang.Number getMinTtl() {
            return this.minTtl;
        }

        @Override
        public final java.lang.Boolean getSmoothStreaming() {
            return this.smoothStreaming;
        }

        @Override
        public final java.util.List<java.lang.String> getTrustedSigners() {
            return this.trustedSigners;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("allowedMethods", om.valueToTree(this.getAllowedMethods()));
            data.set("cachedMethods", om.valueToTree(this.getCachedMethods()));
            data.set("forwardedValues", om.valueToTree(this.getForwardedValues()));
            data.set("targetOriginId", om.valueToTree(this.getTargetOriginId()));
            data.set("viewerProtocolPolicy", om.valueToTree(this.getViewerProtocolPolicy()));
            if (this.getCompress() != null) {
                data.set("compress", om.valueToTree(this.getCompress()));
            }
            if (this.getDefaultTtl() != null) {
                data.set("defaultTtl", om.valueToTree(this.getDefaultTtl()));
            }
            if (this.getFieldLevelEncryptionId() != null) {
                data.set("fieldLevelEncryptionId", om.valueToTree(this.getFieldLevelEncryptionId()));
            }
            if (this.getLambdaFunctionAssociation() != null) {
                data.set("lambdaFunctionAssociation", om.valueToTree(this.getLambdaFunctionAssociation()));
            }
            if (this.getMaxTtl() != null) {
                data.set("maxTtl", om.valueToTree(this.getMaxTtl()));
            }
            if (this.getMinTtl() != null) {
                data.set("minTtl", om.valueToTree(this.getMinTtl()));
            }
            if (this.getSmoothStreaming() != null) {
                data.set("smoothStreaming", om.valueToTree(this.getSmoothStreaming()));
            }
            if (this.getTrustedSigners() != null) {
                data.set("trustedSigners", om.valueToTree(this.getTrustedSigners()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.CloudfrontDistributionDefaultCacheBehavior"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CloudfrontDistributionDefaultCacheBehavior.Jsii$Proxy that = (CloudfrontDistributionDefaultCacheBehavior.Jsii$Proxy) o;

            if (!allowedMethods.equals(that.allowedMethods)) return false;
            if (!cachedMethods.equals(that.cachedMethods)) return false;
            if (!forwardedValues.equals(that.forwardedValues)) return false;
            if (!targetOriginId.equals(that.targetOriginId)) return false;
            if (!viewerProtocolPolicy.equals(that.viewerProtocolPolicy)) return false;
            if (this.compress != null ? !this.compress.equals(that.compress) : that.compress != null) return false;
            if (this.defaultTtl != null ? !this.defaultTtl.equals(that.defaultTtl) : that.defaultTtl != null) return false;
            if (this.fieldLevelEncryptionId != null ? !this.fieldLevelEncryptionId.equals(that.fieldLevelEncryptionId) : that.fieldLevelEncryptionId != null) return false;
            if (this.lambdaFunctionAssociation != null ? !this.lambdaFunctionAssociation.equals(that.lambdaFunctionAssociation) : that.lambdaFunctionAssociation != null) return false;
            if (this.maxTtl != null ? !this.maxTtl.equals(that.maxTtl) : that.maxTtl != null) return false;
            if (this.minTtl != null ? !this.minTtl.equals(that.minTtl) : that.minTtl != null) return false;
            if (this.smoothStreaming != null ? !this.smoothStreaming.equals(that.smoothStreaming) : that.smoothStreaming != null) return false;
            return this.trustedSigners != null ? this.trustedSigners.equals(that.trustedSigners) : that.trustedSigners == null;
        }

        @Override
        public final int hashCode() {
            int result = this.allowedMethods.hashCode();
            result = 31 * result + (this.cachedMethods.hashCode());
            result = 31 * result + (this.forwardedValues.hashCode());
            result = 31 * result + (this.targetOriginId.hashCode());
            result = 31 * result + (this.viewerProtocolPolicy.hashCode());
            result = 31 * result + (this.compress != null ? this.compress.hashCode() : 0);
            result = 31 * result + (this.defaultTtl != null ? this.defaultTtl.hashCode() : 0);
            result = 31 * result + (this.fieldLevelEncryptionId != null ? this.fieldLevelEncryptionId.hashCode() : 0);
            result = 31 * result + (this.lambdaFunctionAssociation != null ? this.lambdaFunctionAssociation.hashCode() : 0);
            result = 31 * result + (this.maxTtl != null ? this.maxTtl.hashCode() : 0);
            result = 31 * result + (this.minTtl != null ? this.minTtl.hashCode() : 0);
            result = 31 * result + (this.smoothStreaming != null ? this.smoothStreaming.hashCode() : 0);
            result = 31 * result + (this.trustedSigners != null ? this.trustedSigners.hashCode() : 0);
            return result;
        }
    }
}
