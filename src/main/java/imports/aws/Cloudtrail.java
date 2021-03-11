package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.130Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Cloudtrail")
public class Cloudtrail extends com.hashicorp.cdktf.TerraformResource {

    protected Cloudtrail(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Cloudtrail(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public Cloudtrail(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.CloudtrailConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetCloudWatchLogsGroupArn() {
        software.amazon.jsii.Kernel.call(this, "resetCloudWatchLogsGroupArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCloudWatchLogsRoleArn() {
        software.amazon.jsii.Kernel.call(this, "resetCloudWatchLogsRoleArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEnableLogFileValidation() {
        software.amazon.jsii.Kernel.call(this, "resetEnableLogFileValidation", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEnableLogging() {
        software.amazon.jsii.Kernel.call(this, "resetEnableLogging", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEventSelector() {
        software.amazon.jsii.Kernel.call(this, "resetEventSelector", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIncludeGlobalServiceEvents() {
        software.amazon.jsii.Kernel.call(this, "resetIncludeGlobalServiceEvents", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIsMultiRegionTrail() {
        software.amazon.jsii.Kernel.call(this, "resetIsMultiRegionTrail", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIsOrganizationTrail() {
        software.amazon.jsii.Kernel.call(this, "resetIsOrganizationTrail", software.amazon.jsii.NativeType.VOID);
    }

    public void resetKmsKeyId() {
        software.amazon.jsii.Kernel.call(this, "resetKmsKeyId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetS3KeyPrefix() {
        software.amazon.jsii.Kernel.call(this, "resetS3KeyPrefix", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSnsTopicName() {
        software.amazon.jsii.Kernel.call(this, "resetSnsTopicName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getHomeRegion() {
        return software.amazon.jsii.Kernel.get(this, "homeRegion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getS3BucketNameInput() {
        return software.amazon.jsii.Kernel.get(this, "s3BucketNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCloudWatchLogsGroupArnInput() {
        return software.amazon.jsii.Kernel.get(this, "cloudWatchLogsGroupArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCloudWatchLogsRoleArnInput() {
        return software.amazon.jsii.Kernel.get(this, "cloudWatchLogsRoleArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getEnableLogFileValidationInput() {
        return software.amazon.jsii.Kernel.get(this, "enableLogFileValidationInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getEnableLoggingInput() {
        return software.amazon.jsii.Kernel.get(this, "enableLoggingInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CloudtrailEventSelector> getEventSelectorInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.CloudtrailEventSelector>)(software.amazon.jsii.Kernel.get(this, "eventSelectorInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CloudtrailEventSelector.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getIncludeGlobalServiceEventsInput() {
        return software.amazon.jsii.Kernel.get(this, "includeGlobalServiceEventsInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getIsMultiRegionTrailInput() {
        return software.amazon.jsii.Kernel.get(this, "isMultiRegionTrailInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getIsOrganizationTrailInput() {
        return software.amazon.jsii.Kernel.get(this, "isOrganizationTrailInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getKmsKeyIdInput() {
        return software.amazon.jsii.Kernel.get(this, "kmsKeyIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getS3KeyPrefixInput() {
        return software.amazon.jsii.Kernel.get(this, "s3KeyPrefixInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSnsTopicNameInput() {
        return software.amazon.jsii.Kernel.get(this, "snsTopicNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCloudWatchLogsGroupArn() {
        return software.amazon.jsii.Kernel.get(this, "cloudWatchLogsGroupArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCloudWatchLogsGroupArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "cloudWatchLogsGroupArn", java.util.Objects.requireNonNull(value, "cloudWatchLogsGroupArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCloudWatchLogsRoleArn() {
        return software.amazon.jsii.Kernel.get(this, "cloudWatchLogsRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCloudWatchLogsRoleArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "cloudWatchLogsRoleArn", java.util.Objects.requireNonNull(value, "cloudWatchLogsRoleArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getEnableLogFileValidation() {
        return software.amazon.jsii.Kernel.get(this, "enableLogFileValidation", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setEnableLogFileValidation(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "enableLogFileValidation", java.util.Objects.requireNonNull(value, "enableLogFileValidation is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getEnableLogging() {
        return software.amazon.jsii.Kernel.get(this, "enableLogging", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setEnableLogging(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "enableLogging", java.util.Objects.requireNonNull(value, "enableLogging is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CloudtrailEventSelector> getEventSelector() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "eventSelector", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CloudtrailEventSelector.class))));
    }

    public void setEventSelector(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CloudtrailEventSelector> value) {
        software.amazon.jsii.Kernel.set(this, "eventSelector", java.util.Objects.requireNonNull(value, "eventSelector is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getIncludeGlobalServiceEvents() {
        return software.amazon.jsii.Kernel.get(this, "includeGlobalServiceEvents", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setIncludeGlobalServiceEvents(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "includeGlobalServiceEvents", java.util.Objects.requireNonNull(value, "includeGlobalServiceEvents is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getIsMultiRegionTrail() {
        return software.amazon.jsii.Kernel.get(this, "isMultiRegionTrail", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setIsMultiRegionTrail(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "isMultiRegionTrail", java.util.Objects.requireNonNull(value, "isMultiRegionTrail is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getIsOrganizationTrail() {
        return software.amazon.jsii.Kernel.get(this, "isOrganizationTrail", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setIsOrganizationTrail(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "isOrganizationTrail", java.util.Objects.requireNonNull(value, "isOrganizationTrail is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getKmsKeyId() {
        return software.amazon.jsii.Kernel.get(this, "kmsKeyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setKmsKeyId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "kmsKeyId", java.util.Objects.requireNonNull(value, "kmsKeyId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getS3BucketName() {
        return software.amazon.jsii.Kernel.get(this, "s3BucketName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setS3BucketName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "s3BucketName", java.util.Objects.requireNonNull(value, "s3BucketName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getS3KeyPrefix() {
        return software.amazon.jsii.Kernel.get(this, "s3KeyPrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setS3KeyPrefix(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "s3KeyPrefix", java.util.Objects.requireNonNull(value, "s3KeyPrefix is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSnsTopicName() {
        return software.amazon.jsii.Kernel.get(this, "snsTopicName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSnsTopicName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "snsTopicName", java.util.Objects.requireNonNull(value, "snsTopicName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.Cloudtrail}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.Cloudtrail> {
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
        private final imports.aws.CloudtrailConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.CloudtrailConfig.Builder();
        }

        /**
         * @return {@code this}
         * @param count This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(final java.lang.Number count) {
            this.config.count(count);
            return this;
        }

        /**
         * @return {@code this}
         * @param dependsOn This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder dependsOn(final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.config.dependsOn(dependsOn);
            return this;
        }

        /**
         * @return {@code this}
         * @param lifecycle This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.config.lifecycle(lifecycle);
            return this;
        }

        /**
         * @return {@code this}
         * @param provider This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(final com.hashicorp.cdktf.TerraformProvider provider) {
            this.config.provider(provider);
            return this;
        }

        /**
         * @return {@code this}
         * @param name This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * @return {@code this}
         * @param s3BucketName This parameter is required.
         */
        public Builder s3BucketName(final java.lang.String s3BucketName) {
            this.config.s3BucketName(s3BucketName);
            return this;
        }

        /**
         * @return {@code this}
         * @param cloudWatchLogsGroupArn This parameter is required.
         */
        public Builder cloudWatchLogsGroupArn(final java.lang.String cloudWatchLogsGroupArn) {
            this.config.cloudWatchLogsGroupArn(cloudWatchLogsGroupArn);
            return this;
        }

        /**
         * @return {@code this}
         * @param cloudWatchLogsRoleArn This parameter is required.
         */
        public Builder cloudWatchLogsRoleArn(final java.lang.String cloudWatchLogsRoleArn) {
            this.config.cloudWatchLogsRoleArn(cloudWatchLogsRoleArn);
            return this;
        }

        /**
         * @return {@code this}
         * @param enableLogFileValidation This parameter is required.
         */
        public Builder enableLogFileValidation(final java.lang.Boolean enableLogFileValidation) {
            this.config.enableLogFileValidation(enableLogFileValidation);
            return this;
        }

        /**
         * @return {@code this}
         * @param enableLogging This parameter is required.
         */
        public Builder enableLogging(final java.lang.Boolean enableLogging) {
            this.config.enableLogging(enableLogging);
            return this;
        }

        /**
         * event_selector block.
         * <p>
         * @return {@code this}
         * @param eventSelector event_selector block. This parameter is required.
         */
        public Builder eventSelector(final java.util.List<? extends imports.aws.CloudtrailEventSelector> eventSelector) {
            this.config.eventSelector(eventSelector);
            return this;
        }

        /**
         * @return {@code this}
         * @param includeGlobalServiceEvents This parameter is required.
         */
        public Builder includeGlobalServiceEvents(final java.lang.Boolean includeGlobalServiceEvents) {
            this.config.includeGlobalServiceEvents(includeGlobalServiceEvents);
            return this;
        }

        /**
         * @return {@code this}
         * @param isMultiRegionTrail This parameter is required.
         */
        public Builder isMultiRegionTrail(final java.lang.Boolean isMultiRegionTrail) {
            this.config.isMultiRegionTrail(isMultiRegionTrail);
            return this;
        }

        /**
         * @return {@code this}
         * @param isOrganizationTrail This parameter is required.
         */
        public Builder isOrganizationTrail(final java.lang.Boolean isOrganizationTrail) {
            this.config.isOrganizationTrail(isOrganizationTrail);
            return this;
        }

        /**
         * @return {@code this}
         * @param kmsKeyId This parameter is required.
         */
        public Builder kmsKeyId(final java.lang.String kmsKeyId) {
            this.config.kmsKeyId(kmsKeyId);
            return this;
        }

        /**
         * @return {@code this}
         * @param s3KeyPrefix This parameter is required.
         */
        public Builder s3KeyPrefix(final java.lang.String s3KeyPrefix) {
            this.config.s3KeyPrefix(s3KeyPrefix);
            return this;
        }

        /**
         * @return {@code this}
         * @param snsTopicName This parameter is required.
         */
        public Builder snsTopicName(final java.lang.String snsTopicName) {
            this.config.snsTopicName(snsTopicName);
            return this;
        }

        /**
         * @return {@code this}
         * @param tags This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config.tags(tags);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.Cloudtrail}.
         */
        @Override
        public imports.aws.Cloudtrail build() {
            return new imports.aws.Cloudtrail(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
