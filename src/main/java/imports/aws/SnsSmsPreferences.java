package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.869Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.SnsSmsPreferences")
public class SnsSmsPreferences extends com.hashicorp.cdktf.TerraformResource {

    protected SnsSmsPreferences(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SnsSmsPreferences(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public SnsSmsPreferences(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.Nullable imports.aws.SnsSmsPreferencesConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), config });
    }

    public SnsSmsPreferences(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required") });
    }

    public void resetDefaultSenderId() {
        software.amazon.jsii.Kernel.call(this, "resetDefaultSenderId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDefaultSmsType() {
        software.amazon.jsii.Kernel.call(this, "resetDefaultSmsType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDeliveryStatusIamRoleArn() {
        software.amazon.jsii.Kernel.call(this, "resetDeliveryStatusIamRoleArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDeliveryStatusSuccessSamplingRate() {
        software.amazon.jsii.Kernel.call(this, "resetDeliveryStatusSuccessSamplingRate", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMonthlySpendLimit() {
        software.amazon.jsii.Kernel.call(this, "resetMonthlySpendLimit", software.amazon.jsii.NativeType.VOID);
    }

    public void resetUsageReportS3Bucket() {
        software.amazon.jsii.Kernel.call(this, "resetUsageReportS3Bucket", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDefaultSenderIdInput() {
        return software.amazon.jsii.Kernel.get(this, "defaultSenderIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDefaultSmsTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "defaultSmsTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDeliveryStatusIamRoleArnInput() {
        return software.amazon.jsii.Kernel.get(this, "deliveryStatusIamRoleArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDeliveryStatusSuccessSamplingRateInput() {
        return software.amazon.jsii.Kernel.get(this, "deliveryStatusSuccessSamplingRateInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getMonthlySpendLimitInput() {
        return software.amazon.jsii.Kernel.get(this, "monthlySpendLimitInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getUsageReportS3BucketInput() {
        return software.amazon.jsii.Kernel.get(this, "usageReportS3BucketInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDefaultSenderId() {
        return software.amazon.jsii.Kernel.get(this, "defaultSenderId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDefaultSenderId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "defaultSenderId", java.util.Objects.requireNonNull(value, "defaultSenderId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDefaultSmsType() {
        return software.amazon.jsii.Kernel.get(this, "defaultSmsType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDefaultSmsType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "defaultSmsType", java.util.Objects.requireNonNull(value, "defaultSmsType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDeliveryStatusIamRoleArn() {
        return software.amazon.jsii.Kernel.get(this, "deliveryStatusIamRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDeliveryStatusIamRoleArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "deliveryStatusIamRoleArn", java.util.Objects.requireNonNull(value, "deliveryStatusIamRoleArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDeliveryStatusSuccessSamplingRate() {
        return software.amazon.jsii.Kernel.get(this, "deliveryStatusSuccessSamplingRate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDeliveryStatusSuccessSamplingRate(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "deliveryStatusSuccessSamplingRate", java.util.Objects.requireNonNull(value, "deliveryStatusSuccessSamplingRate is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getMonthlySpendLimit() {
        return software.amazon.jsii.Kernel.get(this, "monthlySpendLimit", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setMonthlySpendLimit(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "monthlySpendLimit", java.util.Objects.requireNonNull(value, "monthlySpendLimit is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getUsageReportS3Bucket() {
        return software.amazon.jsii.Kernel.get(this, "usageReportS3Bucket", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setUsageReportS3Bucket(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "usageReportS3Bucket", java.util.Objects.requireNonNull(value, "usageReportS3Bucket is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.SnsSmsPreferences}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.SnsSmsPreferences> {
        /**
         * @return a new instance of {@link Builder}.
         * @param scope This parameter is required.
         * @param id This parameter is required.
         */
        public static Builder create(final software.constructs.Construct scope, final java.lang.String id) {
            return new Builder(scope, id);
        }

        private final software.constructs.Construct scope;
        private final java.lang.String id;
        private imports.aws.SnsSmsPreferencesConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
        }

        /**
         * @return {@code this}
         * @param count This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(final java.lang.Number count) {
            this.config().count(count);
            return this;
        }

        /**
         * @return {@code this}
         * @param dependsOn This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder dependsOn(final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.config().dependsOn(dependsOn);
            return this;
        }

        /**
         * @return {@code this}
         * @param lifecycle This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.config().lifecycle(lifecycle);
            return this;
        }

        /**
         * @return {@code this}
         * @param provider This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(final com.hashicorp.cdktf.TerraformProvider provider) {
            this.config().provider(provider);
            return this;
        }

        /**
         * @return {@code this}
         * @param defaultSenderId This parameter is required.
         */
        public Builder defaultSenderId(final java.lang.String defaultSenderId) {
            this.config().defaultSenderId(defaultSenderId);
            return this;
        }

        /**
         * @return {@code this}
         * @param defaultSmsType This parameter is required.
         */
        public Builder defaultSmsType(final java.lang.String defaultSmsType) {
            this.config().defaultSmsType(defaultSmsType);
            return this;
        }

        /**
         * @return {@code this}
         * @param deliveryStatusIamRoleArn This parameter is required.
         */
        public Builder deliveryStatusIamRoleArn(final java.lang.String deliveryStatusIamRoleArn) {
            this.config().deliveryStatusIamRoleArn(deliveryStatusIamRoleArn);
            return this;
        }

        /**
         * @return {@code this}
         * @param deliveryStatusSuccessSamplingRate This parameter is required.
         */
        public Builder deliveryStatusSuccessSamplingRate(final java.lang.String deliveryStatusSuccessSamplingRate) {
            this.config().deliveryStatusSuccessSamplingRate(deliveryStatusSuccessSamplingRate);
            return this;
        }

        /**
         * @return {@code this}
         * @param monthlySpendLimit This parameter is required.
         */
        public Builder monthlySpendLimit(final java.lang.String monthlySpendLimit) {
            this.config().monthlySpendLimit(monthlySpendLimit);
            return this;
        }

        /**
         * @return {@code this}
         * @param usageReportS3Bucket This parameter is required.
         */
        public Builder usageReportS3Bucket(final java.lang.String usageReportS3Bucket) {
            this.config().usageReportS3Bucket(usageReportS3Bucket);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.SnsSmsPreferences}.
         */
        @Override
        public imports.aws.SnsSmsPreferences build() {
            return new imports.aws.SnsSmsPreferences(
                this.scope,
                this.id,
                this.config != null ? this.config.build() : null
            );
        }

        private imports.aws.SnsSmsPreferencesConfig.Builder config() {
            if (this.config == null) {
                this.config = new imports.aws.SnsSmsPreferencesConfig.Builder();
            }
            return this.config;
        }
    }
}
