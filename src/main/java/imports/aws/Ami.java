package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:01.950Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Ami")
public class Ami extends com.hashicorp.cdktf.TerraformResource {

    protected Ami(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Ami(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public Ami(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.AmiConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetArchitecture() {
        software.amazon.jsii.Kernel.call(this, "resetArchitecture", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDescription() {
        software.amazon.jsii.Kernel.call(this, "resetDescription", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEbsBlockDevice() {
        software.amazon.jsii.Kernel.call(this, "resetEbsBlockDevice", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEnaSupport() {
        software.amazon.jsii.Kernel.call(this, "resetEnaSupport", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEphemeralBlockDevice() {
        software.amazon.jsii.Kernel.call(this, "resetEphemeralBlockDevice", software.amazon.jsii.NativeType.VOID);
    }

    public void resetImageLocation() {
        software.amazon.jsii.Kernel.call(this, "resetImageLocation", software.amazon.jsii.NativeType.VOID);
    }

    public void resetKernelId() {
        software.amazon.jsii.Kernel.call(this, "resetKernelId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRamdiskId() {
        software.amazon.jsii.Kernel.call(this, "resetRamdiskId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRootDeviceName() {
        software.amazon.jsii.Kernel.call(this, "resetRootDeviceName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSriovNetSupport() {
        software.amazon.jsii.Kernel.call(this, "resetSriovNetSupport", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTimeouts() {
        software.amazon.jsii.Kernel.call(this, "resetTimeouts", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVirtualizationType() {
        software.amazon.jsii.Kernel.call(this, "resetVirtualizationType", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getManageEbsSnapshots() {
        return software.amazon.jsii.Kernel.get(this, "manageEbsSnapshots", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRootSnapshotId() {
        return software.amazon.jsii.Kernel.get(this, "rootSnapshotId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getArchitectureInput() {
        return software.amazon.jsii.Kernel.get(this, "architectureInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDescriptionInput() {
        return software.amazon.jsii.Kernel.get(this, "descriptionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AmiEbsBlockDevice> getEbsBlockDeviceInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.AmiEbsBlockDevice>)(software.amazon.jsii.Kernel.get(this, "ebsBlockDeviceInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AmiEbsBlockDevice.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getEnaSupportInput() {
        return software.amazon.jsii.Kernel.get(this, "enaSupportInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AmiEphemeralBlockDevice> getEphemeralBlockDeviceInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.AmiEphemeralBlockDevice>)(software.amazon.jsii.Kernel.get(this, "ephemeralBlockDeviceInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AmiEphemeralBlockDevice.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getImageLocationInput() {
        return software.amazon.jsii.Kernel.get(this, "imageLocationInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getKernelIdInput() {
        return software.amazon.jsii.Kernel.get(this, "kernelIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRamdiskIdInput() {
        return software.amazon.jsii.Kernel.get(this, "ramdiskIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRootDeviceNameInput() {
        return software.amazon.jsii.Kernel.get(this, "rootDeviceNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSriovNetSupportInput() {
        return software.amazon.jsii.Kernel.get(this, "sriovNetSupportInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable imports.aws.AmiTimeouts getTimeoutsInput() {
        return software.amazon.jsii.Kernel.get(this, "timeoutsInput", software.amazon.jsii.NativeType.forClass(imports.aws.AmiTimeouts.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getVirtualizationTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "virtualizationTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArchitecture() {
        return software.amazon.jsii.Kernel.get(this, "architecture", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setArchitecture(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "architecture", java.util.Objects.requireNonNull(value, "architecture is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDescription() {
        return software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDescription(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "description", java.util.Objects.requireNonNull(value, "description is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.AmiEbsBlockDevice> getEbsBlockDevice() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "ebsBlockDevice", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AmiEbsBlockDevice.class))));
    }

    public void setEbsBlockDevice(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.AmiEbsBlockDevice> value) {
        software.amazon.jsii.Kernel.set(this, "ebsBlockDevice", java.util.Objects.requireNonNull(value, "ebsBlockDevice is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getEnaSupport() {
        return software.amazon.jsii.Kernel.get(this, "enaSupport", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setEnaSupport(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "enaSupport", java.util.Objects.requireNonNull(value, "enaSupport is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.AmiEphemeralBlockDevice> getEphemeralBlockDevice() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "ephemeralBlockDevice", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AmiEphemeralBlockDevice.class))));
    }

    public void setEphemeralBlockDevice(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.AmiEphemeralBlockDevice> value) {
        software.amazon.jsii.Kernel.set(this, "ephemeralBlockDevice", java.util.Objects.requireNonNull(value, "ephemeralBlockDevice is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getImageLocation() {
        return software.amazon.jsii.Kernel.get(this, "imageLocation", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setImageLocation(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "imageLocation", java.util.Objects.requireNonNull(value, "imageLocation is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getKernelId() {
        return software.amazon.jsii.Kernel.get(this, "kernelId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setKernelId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "kernelId", java.util.Objects.requireNonNull(value, "kernelId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRamdiskId() {
        return software.amazon.jsii.Kernel.get(this, "ramdiskId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRamdiskId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "ramdiskId", java.util.Objects.requireNonNull(value, "ramdiskId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRootDeviceName() {
        return software.amazon.jsii.Kernel.get(this, "rootDeviceName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRootDeviceName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "rootDeviceName", java.util.Objects.requireNonNull(value, "rootDeviceName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSriovNetSupport() {
        return software.amazon.jsii.Kernel.get(this, "sriovNetSupport", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSriovNetSupport(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "sriovNetSupport", java.util.Objects.requireNonNull(value, "sriovNetSupport is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.AmiTimeouts getTimeouts() {
        return software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.AmiTimeouts.class));
    }

    public void setTimeouts(final @org.jetbrains.annotations.NotNull imports.aws.AmiTimeouts value) {
        software.amazon.jsii.Kernel.set(this, "timeouts", java.util.Objects.requireNonNull(value, "timeouts is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getVirtualizationType() {
        return software.amazon.jsii.Kernel.get(this, "virtualizationType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setVirtualizationType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "virtualizationType", java.util.Objects.requireNonNull(value, "virtualizationType is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.Ami}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.Ami> {
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
        private final imports.aws.AmiConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.AmiConfig.Builder();
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
         * @param architecture This parameter is required.
         */
        public Builder architecture(final java.lang.String architecture) {
            this.config.architecture(architecture);
            return this;
        }

        /**
         * @return {@code this}
         * @param description This parameter is required.
         */
        public Builder description(final java.lang.String description) {
            this.config.description(description);
            return this;
        }

        /**
         * ebs_block_device block.
         * <p>
         * @return {@code this}
         * @param ebsBlockDevice ebs_block_device block. This parameter is required.
         */
        public Builder ebsBlockDevice(final java.util.List<? extends imports.aws.AmiEbsBlockDevice> ebsBlockDevice) {
            this.config.ebsBlockDevice(ebsBlockDevice);
            return this;
        }

        /**
         * @return {@code this}
         * @param enaSupport This parameter is required.
         */
        public Builder enaSupport(final java.lang.Boolean enaSupport) {
            this.config.enaSupport(enaSupport);
            return this;
        }

        /**
         * ephemeral_block_device block.
         * <p>
         * @return {@code this}
         * @param ephemeralBlockDevice ephemeral_block_device block. This parameter is required.
         */
        public Builder ephemeralBlockDevice(final java.util.List<? extends imports.aws.AmiEphemeralBlockDevice> ephemeralBlockDevice) {
            this.config.ephemeralBlockDevice(ephemeralBlockDevice);
            return this;
        }

        /**
         * @return {@code this}
         * @param imageLocation This parameter is required.
         */
        public Builder imageLocation(final java.lang.String imageLocation) {
            this.config.imageLocation(imageLocation);
            return this;
        }

        /**
         * @return {@code this}
         * @param kernelId This parameter is required.
         */
        public Builder kernelId(final java.lang.String kernelId) {
            this.config.kernelId(kernelId);
            return this;
        }

        /**
         * @return {@code this}
         * @param ramdiskId This parameter is required.
         */
        public Builder ramdiskId(final java.lang.String ramdiskId) {
            this.config.ramdiskId(ramdiskId);
            return this;
        }

        /**
         * @return {@code this}
         * @param rootDeviceName This parameter is required.
         */
        public Builder rootDeviceName(final java.lang.String rootDeviceName) {
            this.config.rootDeviceName(rootDeviceName);
            return this;
        }

        /**
         * @return {@code this}
         * @param sriovNetSupport This parameter is required.
         */
        public Builder sriovNetSupport(final java.lang.String sriovNetSupport) {
            this.config.sriovNetSupport(sriovNetSupport);
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
         * timeouts block.
         * <p>
         * @return {@code this}
         * @param timeouts timeouts block. This parameter is required.
         */
        public Builder timeouts(final imports.aws.AmiTimeouts timeouts) {
            this.config.timeouts(timeouts);
            return this;
        }

        /**
         * @return {@code this}
         * @param virtualizationType This parameter is required.
         */
        public Builder virtualizationType(final java.lang.String virtualizationType) {
            this.config.virtualizationType(virtualizationType);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.Ami}.
         */
        @Override
        public imports.aws.Ami build() {
            return new imports.aws.Ami(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
