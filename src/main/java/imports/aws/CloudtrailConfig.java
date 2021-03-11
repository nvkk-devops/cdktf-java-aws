package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.132Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CloudtrailConfig")
@software.amazon.jsii.Jsii.Proxy(CloudtrailConfig.Jsii$Proxy.class)
public interface CloudtrailConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    @org.jetbrains.annotations.NotNull java.lang.String getS3BucketName();

    default @org.jetbrains.annotations.Nullable java.lang.String getCloudWatchLogsGroupArn() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getCloudWatchLogsRoleArn() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getEnableLogFileValidation() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getEnableLogging() {
        return null;
    }

    /**
     * event_selector block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CloudtrailEventSelector> getEventSelector() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getIncludeGlobalServiceEvents() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getIsMultiRegionTrail() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getIsOrganizationTrail() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getKmsKeyId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getS3KeyPrefix() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSnsTopicName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CloudtrailConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CloudtrailConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CloudtrailConfig> {
        private java.lang.String name;
        private java.lang.String s3BucketName;
        private java.lang.String cloudWatchLogsGroupArn;
        private java.lang.String cloudWatchLogsRoleArn;
        private java.lang.Boolean enableLogFileValidation;
        private java.lang.Boolean enableLogging;
        private java.util.List<imports.aws.CloudtrailEventSelector> eventSelector;
        private java.lang.Boolean includeGlobalServiceEvents;
        private java.lang.Boolean isMultiRegionTrail;
        private java.lang.Boolean isOrganizationTrail;
        private java.lang.String kmsKeyId;
        private java.lang.String s3KeyPrefix;
        private java.lang.String snsTopicName;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link CloudtrailConfig#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link CloudtrailConfig#getS3BucketName}
         * @param s3BucketName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder s3BucketName(java.lang.String s3BucketName) {
            this.s3BucketName = s3BucketName;
            return this;
        }

        /**
         * Sets the value of {@link CloudtrailConfig#getCloudWatchLogsGroupArn}
         * @param cloudWatchLogsGroupArn the value to be set.
         * @return {@code this}
         */
        public Builder cloudWatchLogsGroupArn(java.lang.String cloudWatchLogsGroupArn) {
            this.cloudWatchLogsGroupArn = cloudWatchLogsGroupArn;
            return this;
        }

        /**
         * Sets the value of {@link CloudtrailConfig#getCloudWatchLogsRoleArn}
         * @param cloudWatchLogsRoleArn the value to be set.
         * @return {@code this}
         */
        public Builder cloudWatchLogsRoleArn(java.lang.String cloudWatchLogsRoleArn) {
            this.cloudWatchLogsRoleArn = cloudWatchLogsRoleArn;
            return this;
        }

        /**
         * Sets the value of {@link CloudtrailConfig#getEnableLogFileValidation}
         * @param enableLogFileValidation the value to be set.
         * @return {@code this}
         */
        public Builder enableLogFileValidation(java.lang.Boolean enableLogFileValidation) {
            this.enableLogFileValidation = enableLogFileValidation;
            return this;
        }

        /**
         * Sets the value of {@link CloudtrailConfig#getEnableLogging}
         * @param enableLogging the value to be set.
         * @return {@code this}
         */
        public Builder enableLogging(java.lang.Boolean enableLogging) {
            this.enableLogging = enableLogging;
            return this;
        }

        /**
         * Sets the value of {@link CloudtrailConfig#getEventSelector}
         * @param eventSelector event_selector block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder eventSelector(java.util.List<? extends imports.aws.CloudtrailEventSelector> eventSelector) {
            this.eventSelector = (java.util.List<imports.aws.CloudtrailEventSelector>)eventSelector;
            return this;
        }

        /**
         * Sets the value of {@link CloudtrailConfig#getIncludeGlobalServiceEvents}
         * @param includeGlobalServiceEvents the value to be set.
         * @return {@code this}
         */
        public Builder includeGlobalServiceEvents(java.lang.Boolean includeGlobalServiceEvents) {
            this.includeGlobalServiceEvents = includeGlobalServiceEvents;
            return this;
        }

        /**
         * Sets the value of {@link CloudtrailConfig#getIsMultiRegionTrail}
         * @param isMultiRegionTrail the value to be set.
         * @return {@code this}
         */
        public Builder isMultiRegionTrail(java.lang.Boolean isMultiRegionTrail) {
            this.isMultiRegionTrail = isMultiRegionTrail;
            return this;
        }

        /**
         * Sets the value of {@link CloudtrailConfig#getIsOrganizationTrail}
         * @param isOrganizationTrail the value to be set.
         * @return {@code this}
         */
        public Builder isOrganizationTrail(java.lang.Boolean isOrganizationTrail) {
            this.isOrganizationTrail = isOrganizationTrail;
            return this;
        }

        /**
         * Sets the value of {@link CloudtrailConfig#getKmsKeyId}
         * @param kmsKeyId the value to be set.
         * @return {@code this}
         */
        public Builder kmsKeyId(java.lang.String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * Sets the value of {@link CloudtrailConfig#getS3KeyPrefix}
         * @param s3KeyPrefix the value to be set.
         * @return {@code this}
         */
        public Builder s3KeyPrefix(java.lang.String s3KeyPrefix) {
            this.s3KeyPrefix = s3KeyPrefix;
            return this;
        }

        /**
         * Sets the value of {@link CloudtrailConfig#getSnsTopicName}
         * @param snsTopicName the value to be set.
         * @return {@code this}
         */
        public Builder snsTopicName(java.lang.String snsTopicName) {
            this.snsTopicName = snsTopicName;
            return this;
        }

        /**
         * Sets the value of {@link CloudtrailConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link CloudtrailConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link CloudtrailConfig#getDependsOn}
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
         * Sets the value of {@link CloudtrailConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link CloudtrailConfig#getProvider}
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
         * @return a new instance of {@link CloudtrailConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CloudtrailConfig build() {
            return new Jsii$Proxy(name, s3BucketName, cloudWatchLogsGroupArn, cloudWatchLogsRoleArn, enableLogFileValidation, enableLogging, eventSelector, includeGlobalServiceEvents, isMultiRegionTrail, isOrganizationTrail, kmsKeyId, s3KeyPrefix, snsTopicName, tags, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link CloudtrailConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CloudtrailConfig {
        private final java.lang.String name;
        private final java.lang.String s3BucketName;
        private final java.lang.String cloudWatchLogsGroupArn;
        private final java.lang.String cloudWatchLogsRoleArn;
        private final java.lang.Boolean enableLogFileValidation;
        private final java.lang.Boolean enableLogging;
        private final java.util.List<imports.aws.CloudtrailEventSelector> eventSelector;
        private final java.lang.Boolean includeGlobalServiceEvents;
        private final java.lang.Boolean isMultiRegionTrail;
        private final java.lang.Boolean isOrganizationTrail;
        private final java.lang.String kmsKeyId;
        private final java.lang.String s3KeyPrefix;
        private final java.lang.String snsTopicName;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
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
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.s3BucketName = software.amazon.jsii.Kernel.get(this, "s3BucketName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.cloudWatchLogsGroupArn = software.amazon.jsii.Kernel.get(this, "cloudWatchLogsGroupArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.cloudWatchLogsRoleArn = software.amazon.jsii.Kernel.get(this, "cloudWatchLogsRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.enableLogFileValidation = software.amazon.jsii.Kernel.get(this, "enableLogFileValidation", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.enableLogging = software.amazon.jsii.Kernel.get(this, "enableLogging", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.eventSelector = software.amazon.jsii.Kernel.get(this, "eventSelector", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CloudtrailEventSelector.class)));
            this.includeGlobalServiceEvents = software.amazon.jsii.Kernel.get(this, "includeGlobalServiceEvents", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.isMultiRegionTrail = software.amazon.jsii.Kernel.get(this, "isMultiRegionTrail", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.isOrganizationTrail = software.amazon.jsii.Kernel.get(this, "isOrganizationTrail", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.kmsKeyId = software.amazon.jsii.Kernel.get(this, "kmsKeyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.s3KeyPrefix = software.amazon.jsii.Kernel.get(this, "s3KeyPrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.snsTopicName = software.amazon.jsii.Kernel.get(this, "snsTopicName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String name, final java.lang.String s3BucketName, final java.lang.String cloudWatchLogsGroupArn, final java.lang.String cloudWatchLogsRoleArn, final java.lang.Boolean enableLogFileValidation, final java.lang.Boolean enableLogging, final java.util.List<? extends imports.aws.CloudtrailEventSelector> eventSelector, final java.lang.Boolean includeGlobalServiceEvents, final java.lang.Boolean isMultiRegionTrail, final java.lang.Boolean isOrganizationTrail, final java.lang.String kmsKeyId, final java.lang.String s3KeyPrefix, final java.lang.String snsTopicName, final java.util.Map<java.lang.String, java.lang.String> tags, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.s3BucketName = java.util.Objects.requireNonNull(s3BucketName, "s3BucketName is required");
            this.cloudWatchLogsGroupArn = cloudWatchLogsGroupArn;
            this.cloudWatchLogsRoleArn = cloudWatchLogsRoleArn;
            this.enableLogFileValidation = enableLogFileValidation;
            this.enableLogging = enableLogging;
            this.eventSelector = (java.util.List<imports.aws.CloudtrailEventSelector>)eventSelector;
            this.includeGlobalServiceEvents = includeGlobalServiceEvents;
            this.isMultiRegionTrail = isMultiRegionTrail;
            this.isOrganizationTrail = isOrganizationTrail;
            this.kmsKeyId = kmsKeyId;
            this.s3KeyPrefix = s3KeyPrefix;
            this.snsTopicName = snsTopicName;
            this.tags = tags;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getS3BucketName() {
            return this.s3BucketName;
        }

        @Override
        public final java.lang.String getCloudWatchLogsGroupArn() {
            return this.cloudWatchLogsGroupArn;
        }

        @Override
        public final java.lang.String getCloudWatchLogsRoleArn() {
            return this.cloudWatchLogsRoleArn;
        }

        @Override
        public final java.lang.Boolean getEnableLogFileValidation() {
            return this.enableLogFileValidation;
        }

        @Override
        public final java.lang.Boolean getEnableLogging() {
            return this.enableLogging;
        }

        @Override
        public final java.util.List<imports.aws.CloudtrailEventSelector> getEventSelector() {
            return this.eventSelector;
        }

        @Override
        public final java.lang.Boolean getIncludeGlobalServiceEvents() {
            return this.includeGlobalServiceEvents;
        }

        @Override
        public final java.lang.Boolean getIsMultiRegionTrail() {
            return this.isMultiRegionTrail;
        }

        @Override
        public final java.lang.Boolean getIsOrganizationTrail() {
            return this.isOrganizationTrail;
        }

        @Override
        public final java.lang.String getKmsKeyId() {
            return this.kmsKeyId;
        }

        @Override
        public final java.lang.String getS3KeyPrefix() {
            return this.s3KeyPrefix;
        }

        @Override
        public final java.lang.String getSnsTopicName() {
            return this.snsTopicName;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
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

            data.set("name", om.valueToTree(this.getName()));
            data.set("s3BucketName", om.valueToTree(this.getS3BucketName()));
            if (this.getCloudWatchLogsGroupArn() != null) {
                data.set("cloudWatchLogsGroupArn", om.valueToTree(this.getCloudWatchLogsGroupArn()));
            }
            if (this.getCloudWatchLogsRoleArn() != null) {
                data.set("cloudWatchLogsRoleArn", om.valueToTree(this.getCloudWatchLogsRoleArn()));
            }
            if (this.getEnableLogFileValidation() != null) {
                data.set("enableLogFileValidation", om.valueToTree(this.getEnableLogFileValidation()));
            }
            if (this.getEnableLogging() != null) {
                data.set("enableLogging", om.valueToTree(this.getEnableLogging()));
            }
            if (this.getEventSelector() != null) {
                data.set("eventSelector", om.valueToTree(this.getEventSelector()));
            }
            if (this.getIncludeGlobalServiceEvents() != null) {
                data.set("includeGlobalServiceEvents", om.valueToTree(this.getIncludeGlobalServiceEvents()));
            }
            if (this.getIsMultiRegionTrail() != null) {
                data.set("isMultiRegionTrail", om.valueToTree(this.getIsMultiRegionTrail()));
            }
            if (this.getIsOrganizationTrail() != null) {
                data.set("isOrganizationTrail", om.valueToTree(this.getIsOrganizationTrail()));
            }
            if (this.getKmsKeyId() != null) {
                data.set("kmsKeyId", om.valueToTree(this.getKmsKeyId()));
            }
            if (this.getS3KeyPrefix() != null) {
                data.set("s3KeyPrefix", om.valueToTree(this.getS3KeyPrefix()));
            }
            if (this.getSnsTopicName() != null) {
                data.set("snsTopicName", om.valueToTree(this.getSnsTopicName()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
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
            struct.set("fqn", om.valueToTree("aws.CloudtrailConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CloudtrailConfig.Jsii$Proxy that = (CloudtrailConfig.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (!s3BucketName.equals(that.s3BucketName)) return false;
            if (this.cloudWatchLogsGroupArn != null ? !this.cloudWatchLogsGroupArn.equals(that.cloudWatchLogsGroupArn) : that.cloudWatchLogsGroupArn != null) return false;
            if (this.cloudWatchLogsRoleArn != null ? !this.cloudWatchLogsRoleArn.equals(that.cloudWatchLogsRoleArn) : that.cloudWatchLogsRoleArn != null) return false;
            if (this.enableLogFileValidation != null ? !this.enableLogFileValidation.equals(that.enableLogFileValidation) : that.enableLogFileValidation != null) return false;
            if (this.enableLogging != null ? !this.enableLogging.equals(that.enableLogging) : that.enableLogging != null) return false;
            if (this.eventSelector != null ? !this.eventSelector.equals(that.eventSelector) : that.eventSelector != null) return false;
            if (this.includeGlobalServiceEvents != null ? !this.includeGlobalServiceEvents.equals(that.includeGlobalServiceEvents) : that.includeGlobalServiceEvents != null) return false;
            if (this.isMultiRegionTrail != null ? !this.isMultiRegionTrail.equals(that.isMultiRegionTrail) : that.isMultiRegionTrail != null) return false;
            if (this.isOrganizationTrail != null ? !this.isOrganizationTrail.equals(that.isOrganizationTrail) : that.isOrganizationTrail != null) return false;
            if (this.kmsKeyId != null ? !this.kmsKeyId.equals(that.kmsKeyId) : that.kmsKeyId != null) return false;
            if (this.s3KeyPrefix != null ? !this.s3KeyPrefix.equals(that.s3KeyPrefix) : that.s3KeyPrefix != null) return false;
            if (this.snsTopicName != null ? !this.snsTopicName.equals(that.snsTopicName) : that.snsTopicName != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.s3BucketName.hashCode());
            result = 31 * result + (this.cloudWatchLogsGroupArn != null ? this.cloudWatchLogsGroupArn.hashCode() : 0);
            result = 31 * result + (this.cloudWatchLogsRoleArn != null ? this.cloudWatchLogsRoleArn.hashCode() : 0);
            result = 31 * result + (this.enableLogFileValidation != null ? this.enableLogFileValidation.hashCode() : 0);
            result = 31 * result + (this.enableLogging != null ? this.enableLogging.hashCode() : 0);
            result = 31 * result + (this.eventSelector != null ? this.eventSelector.hashCode() : 0);
            result = 31 * result + (this.includeGlobalServiceEvents != null ? this.includeGlobalServiceEvents.hashCode() : 0);
            result = 31 * result + (this.isMultiRegionTrail != null ? this.isMultiRegionTrail.hashCode() : 0);
            result = 31 * result + (this.isOrganizationTrail != null ? this.isOrganizationTrail.hashCode() : 0);
            result = 31 * result + (this.kmsKeyId != null ? this.kmsKeyId.hashCode() : 0);
            result = 31 * result + (this.s3KeyPrefix != null ? this.s3KeyPrefix.hashCode() : 0);
            result = 31 * result + (this.snsTopicName != null ? this.snsTopicName.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
