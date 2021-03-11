package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.563Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.EmrClusterConfig")
@software.amazon.jsii.Jsii.Proxy(EmrClusterConfig.Jsii$Proxy.class)
public interface EmrClusterConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    @org.jetbrains.annotations.NotNull java.lang.String getReleaseLabel();

    @org.jetbrains.annotations.NotNull java.lang.String getServiceRole();

    default @org.jetbrains.annotations.Nullable java.lang.String getAdditionalInfo() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getApplications() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getAutoscalingRole() {
        return null;
    }

    /**
     * bootstrap_action block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.EmrClusterBootstrapAction> getBootstrapAction() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getConfigurations() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getConfigurationsJson() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getCoreInstanceCount() {
        return null;
    }

    /**
     * core_instance_group block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.EmrClusterCoreInstanceGroup> getCoreInstanceGroup() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getCoreInstanceType() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getCustomAmiId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getEbsRootVolumeSize() {
        return null;
    }

    /**
     * ec2_attributes block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.EmrClusterEc2Attributes> getEc2Attributes() {
        return null;
    }

    /**
     * instance_group block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.EmrClusterInstanceGroup> getInstanceGroup() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getKeepJobFlowAliveWhenNoSteps() {
        return null;
    }

    /**
     * kerberos_attributes block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.EmrClusterKerberosAttributes> getKerberosAttributes() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getLogUri() {
        return null;
    }

    /**
     * master_instance_group block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.EmrClusterMasterInstanceGroup> getMasterInstanceGroup() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getMasterInstanceType() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getScaleDownBehavior() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSecurityConfiguration() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.EmrClusterStep> getStep() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getStepConcurrencyLevel() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getTerminationProtection() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getVisibleToAllUsers() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link EmrClusterConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link EmrClusterConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<EmrClusterConfig> {
        private java.lang.String name;
        private java.lang.String releaseLabel;
        private java.lang.String serviceRole;
        private java.lang.String additionalInfo;
        private java.util.List<java.lang.String> applications;
        private java.lang.String autoscalingRole;
        private java.util.List<imports.aws.EmrClusterBootstrapAction> bootstrapAction;
        private java.lang.String configurations;
        private java.lang.String configurationsJson;
        private java.lang.Number coreInstanceCount;
        private java.util.List<imports.aws.EmrClusterCoreInstanceGroup> coreInstanceGroup;
        private java.lang.String coreInstanceType;
        private java.lang.String customAmiId;
        private java.lang.Number ebsRootVolumeSize;
        private java.util.List<imports.aws.EmrClusterEc2Attributes> ec2Attributes;
        private java.util.List<imports.aws.EmrClusterInstanceGroup> instanceGroup;
        private java.lang.Boolean keepJobFlowAliveWhenNoSteps;
        private java.util.List<imports.aws.EmrClusterKerberosAttributes> kerberosAttributes;
        private java.lang.String logUri;
        private java.util.List<imports.aws.EmrClusterMasterInstanceGroup> masterInstanceGroup;
        private java.lang.String masterInstanceType;
        private java.lang.String scaleDownBehavior;
        private java.lang.String securityConfiguration;
        private java.util.List<imports.aws.EmrClusterStep> step;
        private java.lang.Number stepConcurrencyLevel;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.lang.Boolean terminationProtection;
        private java.lang.Boolean visibleToAllUsers;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link EmrClusterConfig#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link EmrClusterConfig#getReleaseLabel}
         * @param releaseLabel the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder releaseLabel(java.lang.String releaseLabel) {
            this.releaseLabel = releaseLabel;
            return this;
        }

        /**
         * Sets the value of {@link EmrClusterConfig#getServiceRole}
         * @param serviceRole the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder serviceRole(java.lang.String serviceRole) {
            this.serviceRole = serviceRole;
            return this;
        }

        /**
         * Sets the value of {@link EmrClusterConfig#getAdditionalInfo}
         * @param additionalInfo the value to be set.
         * @return {@code this}
         */
        public Builder additionalInfo(java.lang.String additionalInfo) {
            this.additionalInfo = additionalInfo;
            return this;
        }

        /**
         * Sets the value of {@link EmrClusterConfig#getApplications}
         * @param applications the value to be set.
         * @return {@code this}
         */
        public Builder applications(java.util.List<java.lang.String> applications) {
            this.applications = applications;
            return this;
        }

        /**
         * Sets the value of {@link EmrClusterConfig#getAutoscalingRole}
         * @param autoscalingRole the value to be set.
         * @return {@code this}
         */
        public Builder autoscalingRole(java.lang.String autoscalingRole) {
            this.autoscalingRole = autoscalingRole;
            return this;
        }

        /**
         * Sets the value of {@link EmrClusterConfig#getBootstrapAction}
         * @param bootstrapAction bootstrap_action block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder bootstrapAction(java.util.List<? extends imports.aws.EmrClusterBootstrapAction> bootstrapAction) {
            this.bootstrapAction = (java.util.List<imports.aws.EmrClusterBootstrapAction>)bootstrapAction;
            return this;
        }

        /**
         * Sets the value of {@link EmrClusterConfig#getConfigurations}
         * @param configurations the value to be set.
         * @return {@code this}
         */
        public Builder configurations(java.lang.String configurations) {
            this.configurations = configurations;
            return this;
        }

        /**
         * Sets the value of {@link EmrClusterConfig#getConfigurationsJson}
         * @param configurationsJson the value to be set.
         * @return {@code this}
         */
        public Builder configurationsJson(java.lang.String configurationsJson) {
            this.configurationsJson = configurationsJson;
            return this;
        }

        /**
         * Sets the value of {@link EmrClusterConfig#getCoreInstanceCount}
         * @param coreInstanceCount the value to be set.
         * @return {@code this}
         */
        public Builder coreInstanceCount(java.lang.Number coreInstanceCount) {
            this.coreInstanceCount = coreInstanceCount;
            return this;
        }

        /**
         * Sets the value of {@link EmrClusterConfig#getCoreInstanceGroup}
         * @param coreInstanceGroup core_instance_group block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder coreInstanceGroup(java.util.List<? extends imports.aws.EmrClusterCoreInstanceGroup> coreInstanceGroup) {
            this.coreInstanceGroup = (java.util.List<imports.aws.EmrClusterCoreInstanceGroup>)coreInstanceGroup;
            return this;
        }

        /**
         * Sets the value of {@link EmrClusterConfig#getCoreInstanceType}
         * @param coreInstanceType the value to be set.
         * @return {@code this}
         */
        public Builder coreInstanceType(java.lang.String coreInstanceType) {
            this.coreInstanceType = coreInstanceType;
            return this;
        }

        /**
         * Sets the value of {@link EmrClusterConfig#getCustomAmiId}
         * @param customAmiId the value to be set.
         * @return {@code this}
         */
        public Builder customAmiId(java.lang.String customAmiId) {
            this.customAmiId = customAmiId;
            return this;
        }

        /**
         * Sets the value of {@link EmrClusterConfig#getEbsRootVolumeSize}
         * @param ebsRootVolumeSize the value to be set.
         * @return {@code this}
         */
        public Builder ebsRootVolumeSize(java.lang.Number ebsRootVolumeSize) {
            this.ebsRootVolumeSize = ebsRootVolumeSize;
            return this;
        }

        /**
         * Sets the value of {@link EmrClusterConfig#getEc2Attributes}
         * @param ec2Attributes ec2_attributes block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder ec2Attributes(java.util.List<? extends imports.aws.EmrClusterEc2Attributes> ec2Attributes) {
            this.ec2Attributes = (java.util.List<imports.aws.EmrClusterEc2Attributes>)ec2Attributes;
            return this;
        }

        /**
         * Sets the value of {@link EmrClusterConfig#getInstanceGroup}
         * @param instanceGroup instance_group block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder instanceGroup(java.util.List<? extends imports.aws.EmrClusterInstanceGroup> instanceGroup) {
            this.instanceGroup = (java.util.List<imports.aws.EmrClusterInstanceGroup>)instanceGroup;
            return this;
        }

        /**
         * Sets the value of {@link EmrClusterConfig#getKeepJobFlowAliveWhenNoSteps}
         * @param keepJobFlowAliveWhenNoSteps the value to be set.
         * @return {@code this}
         */
        public Builder keepJobFlowAliveWhenNoSteps(java.lang.Boolean keepJobFlowAliveWhenNoSteps) {
            this.keepJobFlowAliveWhenNoSteps = keepJobFlowAliveWhenNoSteps;
            return this;
        }

        /**
         * Sets the value of {@link EmrClusterConfig#getKerberosAttributes}
         * @param kerberosAttributes kerberos_attributes block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder kerberosAttributes(java.util.List<? extends imports.aws.EmrClusterKerberosAttributes> kerberosAttributes) {
            this.kerberosAttributes = (java.util.List<imports.aws.EmrClusterKerberosAttributes>)kerberosAttributes;
            return this;
        }

        /**
         * Sets the value of {@link EmrClusterConfig#getLogUri}
         * @param logUri the value to be set.
         * @return {@code this}
         */
        public Builder logUri(java.lang.String logUri) {
            this.logUri = logUri;
            return this;
        }

        /**
         * Sets the value of {@link EmrClusterConfig#getMasterInstanceGroup}
         * @param masterInstanceGroup master_instance_group block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder masterInstanceGroup(java.util.List<? extends imports.aws.EmrClusterMasterInstanceGroup> masterInstanceGroup) {
            this.masterInstanceGroup = (java.util.List<imports.aws.EmrClusterMasterInstanceGroup>)masterInstanceGroup;
            return this;
        }

        /**
         * Sets the value of {@link EmrClusterConfig#getMasterInstanceType}
         * @param masterInstanceType the value to be set.
         * @return {@code this}
         */
        public Builder masterInstanceType(java.lang.String masterInstanceType) {
            this.masterInstanceType = masterInstanceType;
            return this;
        }

        /**
         * Sets the value of {@link EmrClusterConfig#getScaleDownBehavior}
         * @param scaleDownBehavior the value to be set.
         * @return {@code this}
         */
        public Builder scaleDownBehavior(java.lang.String scaleDownBehavior) {
            this.scaleDownBehavior = scaleDownBehavior;
            return this;
        }

        /**
         * Sets the value of {@link EmrClusterConfig#getSecurityConfiguration}
         * @param securityConfiguration the value to be set.
         * @return {@code this}
         */
        public Builder securityConfiguration(java.lang.String securityConfiguration) {
            this.securityConfiguration = securityConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link EmrClusterConfig#getStep}
         * @param step the value to be set.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder step(java.util.List<? extends imports.aws.EmrClusterStep> step) {
            this.step = (java.util.List<imports.aws.EmrClusterStep>)step;
            return this;
        }

        /**
         * Sets the value of {@link EmrClusterConfig#getStepConcurrencyLevel}
         * @param stepConcurrencyLevel the value to be set.
         * @return {@code this}
         */
        public Builder stepConcurrencyLevel(java.lang.Number stepConcurrencyLevel) {
            this.stepConcurrencyLevel = stepConcurrencyLevel;
            return this;
        }

        /**
         * Sets the value of {@link EmrClusterConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link EmrClusterConfig#getTerminationProtection}
         * @param terminationProtection the value to be set.
         * @return {@code this}
         */
        public Builder terminationProtection(java.lang.Boolean terminationProtection) {
            this.terminationProtection = terminationProtection;
            return this;
        }

        /**
         * Sets the value of {@link EmrClusterConfig#getVisibleToAllUsers}
         * @param visibleToAllUsers the value to be set.
         * @return {@code this}
         */
        public Builder visibleToAllUsers(java.lang.Boolean visibleToAllUsers) {
            this.visibleToAllUsers = visibleToAllUsers;
            return this;
        }

        /**
         * Sets the value of {@link EmrClusterConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link EmrClusterConfig#getDependsOn}
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
         * Sets the value of {@link EmrClusterConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link EmrClusterConfig#getProvider}
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
         * @return a new instance of {@link EmrClusterConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public EmrClusterConfig build() {
            return new Jsii$Proxy(name, releaseLabel, serviceRole, additionalInfo, applications, autoscalingRole, bootstrapAction, configurations, configurationsJson, coreInstanceCount, coreInstanceGroup, coreInstanceType, customAmiId, ebsRootVolumeSize, ec2Attributes, instanceGroup, keepJobFlowAliveWhenNoSteps, kerberosAttributes, logUri, masterInstanceGroup, masterInstanceType, scaleDownBehavior, securityConfiguration, step, stepConcurrencyLevel, tags, terminationProtection, visibleToAllUsers, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link EmrClusterConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements EmrClusterConfig {
        private final java.lang.String name;
        private final java.lang.String releaseLabel;
        private final java.lang.String serviceRole;
        private final java.lang.String additionalInfo;
        private final java.util.List<java.lang.String> applications;
        private final java.lang.String autoscalingRole;
        private final java.util.List<imports.aws.EmrClusterBootstrapAction> bootstrapAction;
        private final java.lang.String configurations;
        private final java.lang.String configurationsJson;
        private final java.lang.Number coreInstanceCount;
        private final java.util.List<imports.aws.EmrClusterCoreInstanceGroup> coreInstanceGroup;
        private final java.lang.String coreInstanceType;
        private final java.lang.String customAmiId;
        private final java.lang.Number ebsRootVolumeSize;
        private final java.util.List<imports.aws.EmrClusterEc2Attributes> ec2Attributes;
        private final java.util.List<imports.aws.EmrClusterInstanceGroup> instanceGroup;
        private final java.lang.Boolean keepJobFlowAliveWhenNoSteps;
        private final java.util.List<imports.aws.EmrClusterKerberosAttributes> kerberosAttributes;
        private final java.lang.String logUri;
        private final java.util.List<imports.aws.EmrClusterMasterInstanceGroup> masterInstanceGroup;
        private final java.lang.String masterInstanceType;
        private final java.lang.String scaleDownBehavior;
        private final java.lang.String securityConfiguration;
        private final java.util.List<imports.aws.EmrClusterStep> step;
        private final java.lang.Number stepConcurrencyLevel;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.lang.Boolean terminationProtection;
        private final java.lang.Boolean visibleToAllUsers;
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
            this.releaseLabel = software.amazon.jsii.Kernel.get(this, "releaseLabel", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.serviceRole = software.amazon.jsii.Kernel.get(this, "serviceRole", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.additionalInfo = software.amazon.jsii.Kernel.get(this, "additionalInfo", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.applications = software.amazon.jsii.Kernel.get(this, "applications", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.autoscalingRole = software.amazon.jsii.Kernel.get(this, "autoscalingRole", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.bootstrapAction = software.amazon.jsii.Kernel.get(this, "bootstrapAction", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EmrClusterBootstrapAction.class)));
            this.configurations = software.amazon.jsii.Kernel.get(this, "configurations", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.configurationsJson = software.amazon.jsii.Kernel.get(this, "configurationsJson", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.coreInstanceCount = software.amazon.jsii.Kernel.get(this, "coreInstanceCount", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.coreInstanceGroup = software.amazon.jsii.Kernel.get(this, "coreInstanceGroup", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EmrClusterCoreInstanceGroup.class)));
            this.coreInstanceType = software.amazon.jsii.Kernel.get(this, "coreInstanceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.customAmiId = software.amazon.jsii.Kernel.get(this, "customAmiId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.ebsRootVolumeSize = software.amazon.jsii.Kernel.get(this, "ebsRootVolumeSize", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.ec2Attributes = software.amazon.jsii.Kernel.get(this, "ec2Attributes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EmrClusterEc2Attributes.class)));
            this.instanceGroup = software.amazon.jsii.Kernel.get(this, "instanceGroup", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EmrClusterInstanceGroup.class)));
            this.keepJobFlowAliveWhenNoSteps = software.amazon.jsii.Kernel.get(this, "keepJobFlowAliveWhenNoSteps", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.kerberosAttributes = software.amazon.jsii.Kernel.get(this, "kerberosAttributes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EmrClusterKerberosAttributes.class)));
            this.logUri = software.amazon.jsii.Kernel.get(this, "logUri", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.masterInstanceGroup = software.amazon.jsii.Kernel.get(this, "masterInstanceGroup", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EmrClusterMasterInstanceGroup.class)));
            this.masterInstanceType = software.amazon.jsii.Kernel.get(this, "masterInstanceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.scaleDownBehavior = software.amazon.jsii.Kernel.get(this, "scaleDownBehavior", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.securityConfiguration = software.amazon.jsii.Kernel.get(this, "securityConfiguration", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.step = software.amazon.jsii.Kernel.get(this, "step", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EmrClusterStep.class)));
            this.stepConcurrencyLevel = software.amazon.jsii.Kernel.get(this, "stepConcurrencyLevel", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.terminationProtection = software.amazon.jsii.Kernel.get(this, "terminationProtection", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.visibleToAllUsers = software.amazon.jsii.Kernel.get(this, "visibleToAllUsers", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String name, final java.lang.String releaseLabel, final java.lang.String serviceRole, final java.lang.String additionalInfo, final java.util.List<java.lang.String> applications, final java.lang.String autoscalingRole, final java.util.List<? extends imports.aws.EmrClusterBootstrapAction> bootstrapAction, final java.lang.String configurations, final java.lang.String configurationsJson, final java.lang.Number coreInstanceCount, final java.util.List<? extends imports.aws.EmrClusterCoreInstanceGroup> coreInstanceGroup, final java.lang.String coreInstanceType, final java.lang.String customAmiId, final java.lang.Number ebsRootVolumeSize, final java.util.List<? extends imports.aws.EmrClusterEc2Attributes> ec2Attributes, final java.util.List<? extends imports.aws.EmrClusterInstanceGroup> instanceGroup, final java.lang.Boolean keepJobFlowAliveWhenNoSteps, final java.util.List<? extends imports.aws.EmrClusterKerberosAttributes> kerberosAttributes, final java.lang.String logUri, final java.util.List<? extends imports.aws.EmrClusterMasterInstanceGroup> masterInstanceGroup, final java.lang.String masterInstanceType, final java.lang.String scaleDownBehavior, final java.lang.String securityConfiguration, final java.util.List<? extends imports.aws.EmrClusterStep> step, final java.lang.Number stepConcurrencyLevel, final java.util.Map<java.lang.String, java.lang.String> tags, final java.lang.Boolean terminationProtection, final java.lang.Boolean visibleToAllUsers, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.releaseLabel = java.util.Objects.requireNonNull(releaseLabel, "releaseLabel is required");
            this.serviceRole = java.util.Objects.requireNonNull(serviceRole, "serviceRole is required");
            this.additionalInfo = additionalInfo;
            this.applications = applications;
            this.autoscalingRole = autoscalingRole;
            this.bootstrapAction = (java.util.List<imports.aws.EmrClusterBootstrapAction>)bootstrapAction;
            this.configurations = configurations;
            this.configurationsJson = configurationsJson;
            this.coreInstanceCount = coreInstanceCount;
            this.coreInstanceGroup = (java.util.List<imports.aws.EmrClusterCoreInstanceGroup>)coreInstanceGroup;
            this.coreInstanceType = coreInstanceType;
            this.customAmiId = customAmiId;
            this.ebsRootVolumeSize = ebsRootVolumeSize;
            this.ec2Attributes = (java.util.List<imports.aws.EmrClusterEc2Attributes>)ec2Attributes;
            this.instanceGroup = (java.util.List<imports.aws.EmrClusterInstanceGroup>)instanceGroup;
            this.keepJobFlowAliveWhenNoSteps = keepJobFlowAliveWhenNoSteps;
            this.kerberosAttributes = (java.util.List<imports.aws.EmrClusterKerberosAttributes>)kerberosAttributes;
            this.logUri = logUri;
            this.masterInstanceGroup = (java.util.List<imports.aws.EmrClusterMasterInstanceGroup>)masterInstanceGroup;
            this.masterInstanceType = masterInstanceType;
            this.scaleDownBehavior = scaleDownBehavior;
            this.securityConfiguration = securityConfiguration;
            this.step = (java.util.List<imports.aws.EmrClusterStep>)step;
            this.stepConcurrencyLevel = stepConcurrencyLevel;
            this.tags = tags;
            this.terminationProtection = terminationProtection;
            this.visibleToAllUsers = visibleToAllUsers;
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
        public final java.lang.String getReleaseLabel() {
            return this.releaseLabel;
        }

        @Override
        public final java.lang.String getServiceRole() {
            return this.serviceRole;
        }

        @Override
        public final java.lang.String getAdditionalInfo() {
            return this.additionalInfo;
        }

        @Override
        public final java.util.List<java.lang.String> getApplications() {
            return this.applications;
        }

        @Override
        public final java.lang.String getAutoscalingRole() {
            return this.autoscalingRole;
        }

        @Override
        public final java.util.List<imports.aws.EmrClusterBootstrapAction> getBootstrapAction() {
            return this.bootstrapAction;
        }

        @Override
        public final java.lang.String getConfigurations() {
            return this.configurations;
        }

        @Override
        public final java.lang.String getConfigurationsJson() {
            return this.configurationsJson;
        }

        @Override
        public final java.lang.Number getCoreInstanceCount() {
            return this.coreInstanceCount;
        }

        @Override
        public final java.util.List<imports.aws.EmrClusterCoreInstanceGroup> getCoreInstanceGroup() {
            return this.coreInstanceGroup;
        }

        @Override
        public final java.lang.String getCoreInstanceType() {
            return this.coreInstanceType;
        }

        @Override
        public final java.lang.String getCustomAmiId() {
            return this.customAmiId;
        }

        @Override
        public final java.lang.Number getEbsRootVolumeSize() {
            return this.ebsRootVolumeSize;
        }

        @Override
        public final java.util.List<imports.aws.EmrClusterEc2Attributes> getEc2Attributes() {
            return this.ec2Attributes;
        }

        @Override
        public final java.util.List<imports.aws.EmrClusterInstanceGroup> getInstanceGroup() {
            return this.instanceGroup;
        }

        @Override
        public final java.lang.Boolean getKeepJobFlowAliveWhenNoSteps() {
            return this.keepJobFlowAliveWhenNoSteps;
        }

        @Override
        public final java.util.List<imports.aws.EmrClusterKerberosAttributes> getKerberosAttributes() {
            return this.kerberosAttributes;
        }

        @Override
        public final java.lang.String getLogUri() {
            return this.logUri;
        }

        @Override
        public final java.util.List<imports.aws.EmrClusterMasterInstanceGroup> getMasterInstanceGroup() {
            return this.masterInstanceGroup;
        }

        @Override
        public final java.lang.String getMasterInstanceType() {
            return this.masterInstanceType;
        }

        @Override
        public final java.lang.String getScaleDownBehavior() {
            return this.scaleDownBehavior;
        }

        @Override
        public final java.lang.String getSecurityConfiguration() {
            return this.securityConfiguration;
        }

        @Override
        public final java.util.List<imports.aws.EmrClusterStep> getStep() {
            return this.step;
        }

        @Override
        public final java.lang.Number getStepConcurrencyLevel() {
            return this.stepConcurrencyLevel;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.lang.Boolean getTerminationProtection() {
            return this.terminationProtection;
        }

        @Override
        public final java.lang.Boolean getVisibleToAllUsers() {
            return this.visibleToAllUsers;
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
            data.set("releaseLabel", om.valueToTree(this.getReleaseLabel()));
            data.set("serviceRole", om.valueToTree(this.getServiceRole()));
            if (this.getAdditionalInfo() != null) {
                data.set("additionalInfo", om.valueToTree(this.getAdditionalInfo()));
            }
            if (this.getApplications() != null) {
                data.set("applications", om.valueToTree(this.getApplications()));
            }
            if (this.getAutoscalingRole() != null) {
                data.set("autoscalingRole", om.valueToTree(this.getAutoscalingRole()));
            }
            if (this.getBootstrapAction() != null) {
                data.set("bootstrapAction", om.valueToTree(this.getBootstrapAction()));
            }
            if (this.getConfigurations() != null) {
                data.set("configurations", om.valueToTree(this.getConfigurations()));
            }
            if (this.getConfigurationsJson() != null) {
                data.set("configurationsJson", om.valueToTree(this.getConfigurationsJson()));
            }
            if (this.getCoreInstanceCount() != null) {
                data.set("coreInstanceCount", om.valueToTree(this.getCoreInstanceCount()));
            }
            if (this.getCoreInstanceGroup() != null) {
                data.set("coreInstanceGroup", om.valueToTree(this.getCoreInstanceGroup()));
            }
            if (this.getCoreInstanceType() != null) {
                data.set("coreInstanceType", om.valueToTree(this.getCoreInstanceType()));
            }
            if (this.getCustomAmiId() != null) {
                data.set("customAmiId", om.valueToTree(this.getCustomAmiId()));
            }
            if (this.getEbsRootVolumeSize() != null) {
                data.set("ebsRootVolumeSize", om.valueToTree(this.getEbsRootVolumeSize()));
            }
            if (this.getEc2Attributes() != null) {
                data.set("ec2Attributes", om.valueToTree(this.getEc2Attributes()));
            }
            if (this.getInstanceGroup() != null) {
                data.set("instanceGroup", om.valueToTree(this.getInstanceGroup()));
            }
            if (this.getKeepJobFlowAliveWhenNoSteps() != null) {
                data.set("keepJobFlowAliveWhenNoSteps", om.valueToTree(this.getKeepJobFlowAliveWhenNoSteps()));
            }
            if (this.getKerberosAttributes() != null) {
                data.set("kerberosAttributes", om.valueToTree(this.getKerberosAttributes()));
            }
            if (this.getLogUri() != null) {
                data.set("logUri", om.valueToTree(this.getLogUri()));
            }
            if (this.getMasterInstanceGroup() != null) {
                data.set("masterInstanceGroup", om.valueToTree(this.getMasterInstanceGroup()));
            }
            if (this.getMasterInstanceType() != null) {
                data.set("masterInstanceType", om.valueToTree(this.getMasterInstanceType()));
            }
            if (this.getScaleDownBehavior() != null) {
                data.set("scaleDownBehavior", om.valueToTree(this.getScaleDownBehavior()));
            }
            if (this.getSecurityConfiguration() != null) {
                data.set("securityConfiguration", om.valueToTree(this.getSecurityConfiguration()));
            }
            if (this.getStep() != null) {
                data.set("step", om.valueToTree(this.getStep()));
            }
            if (this.getStepConcurrencyLevel() != null) {
                data.set("stepConcurrencyLevel", om.valueToTree(this.getStepConcurrencyLevel()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getTerminationProtection() != null) {
                data.set("terminationProtection", om.valueToTree(this.getTerminationProtection()));
            }
            if (this.getVisibleToAllUsers() != null) {
                data.set("visibleToAllUsers", om.valueToTree(this.getVisibleToAllUsers()));
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
            struct.set("fqn", om.valueToTree("aws.EmrClusterConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EmrClusterConfig.Jsii$Proxy that = (EmrClusterConfig.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (!releaseLabel.equals(that.releaseLabel)) return false;
            if (!serviceRole.equals(that.serviceRole)) return false;
            if (this.additionalInfo != null ? !this.additionalInfo.equals(that.additionalInfo) : that.additionalInfo != null) return false;
            if (this.applications != null ? !this.applications.equals(that.applications) : that.applications != null) return false;
            if (this.autoscalingRole != null ? !this.autoscalingRole.equals(that.autoscalingRole) : that.autoscalingRole != null) return false;
            if (this.bootstrapAction != null ? !this.bootstrapAction.equals(that.bootstrapAction) : that.bootstrapAction != null) return false;
            if (this.configurations != null ? !this.configurations.equals(that.configurations) : that.configurations != null) return false;
            if (this.configurationsJson != null ? !this.configurationsJson.equals(that.configurationsJson) : that.configurationsJson != null) return false;
            if (this.coreInstanceCount != null ? !this.coreInstanceCount.equals(that.coreInstanceCount) : that.coreInstanceCount != null) return false;
            if (this.coreInstanceGroup != null ? !this.coreInstanceGroup.equals(that.coreInstanceGroup) : that.coreInstanceGroup != null) return false;
            if (this.coreInstanceType != null ? !this.coreInstanceType.equals(that.coreInstanceType) : that.coreInstanceType != null) return false;
            if (this.customAmiId != null ? !this.customAmiId.equals(that.customAmiId) : that.customAmiId != null) return false;
            if (this.ebsRootVolumeSize != null ? !this.ebsRootVolumeSize.equals(that.ebsRootVolumeSize) : that.ebsRootVolumeSize != null) return false;
            if (this.ec2Attributes != null ? !this.ec2Attributes.equals(that.ec2Attributes) : that.ec2Attributes != null) return false;
            if (this.instanceGroup != null ? !this.instanceGroup.equals(that.instanceGroup) : that.instanceGroup != null) return false;
            if (this.keepJobFlowAliveWhenNoSteps != null ? !this.keepJobFlowAliveWhenNoSteps.equals(that.keepJobFlowAliveWhenNoSteps) : that.keepJobFlowAliveWhenNoSteps != null) return false;
            if (this.kerberosAttributes != null ? !this.kerberosAttributes.equals(that.kerberosAttributes) : that.kerberosAttributes != null) return false;
            if (this.logUri != null ? !this.logUri.equals(that.logUri) : that.logUri != null) return false;
            if (this.masterInstanceGroup != null ? !this.masterInstanceGroup.equals(that.masterInstanceGroup) : that.masterInstanceGroup != null) return false;
            if (this.masterInstanceType != null ? !this.masterInstanceType.equals(that.masterInstanceType) : that.masterInstanceType != null) return false;
            if (this.scaleDownBehavior != null ? !this.scaleDownBehavior.equals(that.scaleDownBehavior) : that.scaleDownBehavior != null) return false;
            if (this.securityConfiguration != null ? !this.securityConfiguration.equals(that.securityConfiguration) : that.securityConfiguration != null) return false;
            if (this.step != null ? !this.step.equals(that.step) : that.step != null) return false;
            if (this.stepConcurrencyLevel != null ? !this.stepConcurrencyLevel.equals(that.stepConcurrencyLevel) : that.stepConcurrencyLevel != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.terminationProtection != null ? !this.terminationProtection.equals(that.terminationProtection) : that.terminationProtection != null) return false;
            if (this.visibleToAllUsers != null ? !this.visibleToAllUsers.equals(that.visibleToAllUsers) : that.visibleToAllUsers != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.releaseLabel.hashCode());
            result = 31 * result + (this.serviceRole.hashCode());
            result = 31 * result + (this.additionalInfo != null ? this.additionalInfo.hashCode() : 0);
            result = 31 * result + (this.applications != null ? this.applications.hashCode() : 0);
            result = 31 * result + (this.autoscalingRole != null ? this.autoscalingRole.hashCode() : 0);
            result = 31 * result + (this.bootstrapAction != null ? this.bootstrapAction.hashCode() : 0);
            result = 31 * result + (this.configurations != null ? this.configurations.hashCode() : 0);
            result = 31 * result + (this.configurationsJson != null ? this.configurationsJson.hashCode() : 0);
            result = 31 * result + (this.coreInstanceCount != null ? this.coreInstanceCount.hashCode() : 0);
            result = 31 * result + (this.coreInstanceGroup != null ? this.coreInstanceGroup.hashCode() : 0);
            result = 31 * result + (this.coreInstanceType != null ? this.coreInstanceType.hashCode() : 0);
            result = 31 * result + (this.customAmiId != null ? this.customAmiId.hashCode() : 0);
            result = 31 * result + (this.ebsRootVolumeSize != null ? this.ebsRootVolumeSize.hashCode() : 0);
            result = 31 * result + (this.ec2Attributes != null ? this.ec2Attributes.hashCode() : 0);
            result = 31 * result + (this.instanceGroup != null ? this.instanceGroup.hashCode() : 0);
            result = 31 * result + (this.keepJobFlowAliveWhenNoSteps != null ? this.keepJobFlowAliveWhenNoSteps.hashCode() : 0);
            result = 31 * result + (this.kerberosAttributes != null ? this.kerberosAttributes.hashCode() : 0);
            result = 31 * result + (this.logUri != null ? this.logUri.hashCode() : 0);
            result = 31 * result + (this.masterInstanceGroup != null ? this.masterInstanceGroup.hashCode() : 0);
            result = 31 * result + (this.masterInstanceType != null ? this.masterInstanceType.hashCode() : 0);
            result = 31 * result + (this.scaleDownBehavior != null ? this.scaleDownBehavior.hashCode() : 0);
            result = 31 * result + (this.securityConfiguration != null ? this.securityConfiguration.hashCode() : 0);
            result = 31 * result + (this.step != null ? this.step.hashCode() : 0);
            result = 31 * result + (this.stepConcurrencyLevel != null ? this.stepConcurrencyLevel.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.terminationProtection != null ? this.terminationProtection.hashCode() : 0);
            result = 31 * result + (this.visibleToAllUsers != null ? this.visibleToAllUsers.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
