package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.870Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.SnsSmsPreferencesConfig")
@software.amazon.jsii.Jsii.Proxy(SnsSmsPreferencesConfig.Jsii$Proxy.class)
public interface SnsSmsPreferencesConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    default @org.jetbrains.annotations.Nullable java.lang.String getDefaultSenderId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDefaultSmsType() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDeliveryStatusIamRoleArn() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDeliveryStatusSuccessSamplingRate() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getMonthlySpendLimit() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getUsageReportS3Bucket() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SnsSmsPreferencesConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SnsSmsPreferencesConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SnsSmsPreferencesConfig> {
        private java.lang.String defaultSenderId;
        private java.lang.String defaultSmsType;
        private java.lang.String deliveryStatusIamRoleArn;
        private java.lang.String deliveryStatusSuccessSamplingRate;
        private java.lang.String monthlySpendLimit;
        private java.lang.String usageReportS3Bucket;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link SnsSmsPreferencesConfig#getDefaultSenderId}
         * @param defaultSenderId the value to be set.
         * @return {@code this}
         */
        public Builder defaultSenderId(java.lang.String defaultSenderId) {
            this.defaultSenderId = defaultSenderId;
            return this;
        }

        /**
         * Sets the value of {@link SnsSmsPreferencesConfig#getDefaultSmsType}
         * @param defaultSmsType the value to be set.
         * @return {@code this}
         */
        public Builder defaultSmsType(java.lang.String defaultSmsType) {
            this.defaultSmsType = defaultSmsType;
            return this;
        }

        /**
         * Sets the value of {@link SnsSmsPreferencesConfig#getDeliveryStatusIamRoleArn}
         * @param deliveryStatusIamRoleArn the value to be set.
         * @return {@code this}
         */
        public Builder deliveryStatusIamRoleArn(java.lang.String deliveryStatusIamRoleArn) {
            this.deliveryStatusIamRoleArn = deliveryStatusIamRoleArn;
            return this;
        }

        /**
         * Sets the value of {@link SnsSmsPreferencesConfig#getDeliveryStatusSuccessSamplingRate}
         * @param deliveryStatusSuccessSamplingRate the value to be set.
         * @return {@code this}
         */
        public Builder deliveryStatusSuccessSamplingRate(java.lang.String deliveryStatusSuccessSamplingRate) {
            this.deliveryStatusSuccessSamplingRate = deliveryStatusSuccessSamplingRate;
            return this;
        }

        /**
         * Sets the value of {@link SnsSmsPreferencesConfig#getMonthlySpendLimit}
         * @param monthlySpendLimit the value to be set.
         * @return {@code this}
         */
        public Builder monthlySpendLimit(java.lang.String monthlySpendLimit) {
            this.monthlySpendLimit = monthlySpendLimit;
            return this;
        }

        /**
         * Sets the value of {@link SnsSmsPreferencesConfig#getUsageReportS3Bucket}
         * @param usageReportS3Bucket the value to be set.
         * @return {@code this}
         */
        public Builder usageReportS3Bucket(java.lang.String usageReportS3Bucket) {
            this.usageReportS3Bucket = usageReportS3Bucket;
            return this;
        }

        /**
         * Sets the value of {@link SnsSmsPreferencesConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link SnsSmsPreferencesConfig#getDependsOn}
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
         * Sets the value of {@link SnsSmsPreferencesConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link SnsSmsPreferencesConfig#getProvider}
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
         * @return a new instance of {@link SnsSmsPreferencesConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SnsSmsPreferencesConfig build() {
            return new Jsii$Proxy(defaultSenderId, defaultSmsType, deliveryStatusIamRoleArn, deliveryStatusSuccessSamplingRate, monthlySpendLimit, usageReportS3Bucket, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link SnsSmsPreferencesConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SnsSmsPreferencesConfig {
        private final java.lang.String defaultSenderId;
        private final java.lang.String defaultSmsType;
        private final java.lang.String deliveryStatusIamRoleArn;
        private final java.lang.String deliveryStatusSuccessSamplingRate;
        private final java.lang.String monthlySpendLimit;
        private final java.lang.String usageReportS3Bucket;
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
            this.defaultSenderId = software.amazon.jsii.Kernel.get(this, "defaultSenderId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.defaultSmsType = software.amazon.jsii.Kernel.get(this, "defaultSmsType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.deliveryStatusIamRoleArn = software.amazon.jsii.Kernel.get(this, "deliveryStatusIamRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.deliveryStatusSuccessSamplingRate = software.amazon.jsii.Kernel.get(this, "deliveryStatusSuccessSamplingRate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.monthlySpendLimit = software.amazon.jsii.Kernel.get(this, "monthlySpendLimit", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.usageReportS3Bucket = software.amazon.jsii.Kernel.get(this, "usageReportS3Bucket", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String defaultSenderId, final java.lang.String defaultSmsType, final java.lang.String deliveryStatusIamRoleArn, final java.lang.String deliveryStatusSuccessSamplingRate, final java.lang.String monthlySpendLimit, final java.lang.String usageReportS3Bucket, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.defaultSenderId = defaultSenderId;
            this.defaultSmsType = defaultSmsType;
            this.deliveryStatusIamRoleArn = deliveryStatusIamRoleArn;
            this.deliveryStatusSuccessSamplingRate = deliveryStatusSuccessSamplingRate;
            this.monthlySpendLimit = monthlySpendLimit;
            this.usageReportS3Bucket = usageReportS3Bucket;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getDefaultSenderId() {
            return this.defaultSenderId;
        }

        @Override
        public final java.lang.String getDefaultSmsType() {
            return this.defaultSmsType;
        }

        @Override
        public final java.lang.String getDeliveryStatusIamRoleArn() {
            return this.deliveryStatusIamRoleArn;
        }

        @Override
        public final java.lang.String getDeliveryStatusSuccessSamplingRate() {
            return this.deliveryStatusSuccessSamplingRate;
        }

        @Override
        public final java.lang.String getMonthlySpendLimit() {
            return this.monthlySpendLimit;
        }

        @Override
        public final java.lang.String getUsageReportS3Bucket() {
            return this.usageReportS3Bucket;
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

            if (this.getDefaultSenderId() != null) {
                data.set("defaultSenderId", om.valueToTree(this.getDefaultSenderId()));
            }
            if (this.getDefaultSmsType() != null) {
                data.set("defaultSmsType", om.valueToTree(this.getDefaultSmsType()));
            }
            if (this.getDeliveryStatusIamRoleArn() != null) {
                data.set("deliveryStatusIamRoleArn", om.valueToTree(this.getDeliveryStatusIamRoleArn()));
            }
            if (this.getDeliveryStatusSuccessSamplingRate() != null) {
                data.set("deliveryStatusSuccessSamplingRate", om.valueToTree(this.getDeliveryStatusSuccessSamplingRate()));
            }
            if (this.getMonthlySpendLimit() != null) {
                data.set("monthlySpendLimit", om.valueToTree(this.getMonthlySpendLimit()));
            }
            if (this.getUsageReportS3Bucket() != null) {
                data.set("usageReportS3Bucket", om.valueToTree(this.getUsageReportS3Bucket()));
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
            struct.set("fqn", om.valueToTree("aws.SnsSmsPreferencesConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SnsSmsPreferencesConfig.Jsii$Proxy that = (SnsSmsPreferencesConfig.Jsii$Proxy) o;

            if (this.defaultSenderId != null ? !this.defaultSenderId.equals(that.defaultSenderId) : that.defaultSenderId != null) return false;
            if (this.defaultSmsType != null ? !this.defaultSmsType.equals(that.defaultSmsType) : that.defaultSmsType != null) return false;
            if (this.deliveryStatusIamRoleArn != null ? !this.deliveryStatusIamRoleArn.equals(that.deliveryStatusIamRoleArn) : that.deliveryStatusIamRoleArn != null) return false;
            if (this.deliveryStatusSuccessSamplingRate != null ? !this.deliveryStatusSuccessSamplingRate.equals(that.deliveryStatusSuccessSamplingRate) : that.deliveryStatusSuccessSamplingRate != null) return false;
            if (this.monthlySpendLimit != null ? !this.monthlySpendLimit.equals(that.monthlySpendLimit) : that.monthlySpendLimit != null) return false;
            if (this.usageReportS3Bucket != null ? !this.usageReportS3Bucket.equals(that.usageReportS3Bucket) : that.usageReportS3Bucket != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.defaultSenderId != null ? this.defaultSenderId.hashCode() : 0;
            result = 31 * result + (this.defaultSmsType != null ? this.defaultSmsType.hashCode() : 0);
            result = 31 * result + (this.deliveryStatusIamRoleArn != null ? this.deliveryStatusIamRoleArn.hashCode() : 0);
            result = 31 * result + (this.deliveryStatusSuccessSamplingRate != null ? this.deliveryStatusSuccessSamplingRate.hashCode() : 0);
            result = 31 * result + (this.monthlySpendLimit != null ? this.monthlySpendLimit.hashCode() : 0);
            result = 31 * result + (this.usageReportS3Bucket != null ? this.usageReportS3Bucket.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
