package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:01.952Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AmiConfig")
@software.amazon.jsii.Jsii.Proxy(AmiConfig.Jsii$Proxy.class)
public interface AmiConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    default @org.jetbrains.annotations.Nullable java.lang.String getArchitecture() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return null;
    }

    /**
     * ebs_block_device block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AmiEbsBlockDevice> getEbsBlockDevice() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getEnaSupport() {
        return null;
    }

    /**
     * ephemeral_block_device block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AmiEphemeralBlockDevice> getEphemeralBlockDevice() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getImageLocation() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getKernelId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getRamdiskId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getRootDeviceName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSriovNetSupport() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * timeouts block.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.AmiTimeouts getTimeouts() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getVirtualizationType() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AmiConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AmiConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AmiConfig> {
        private java.lang.String name;
        private java.lang.String architecture;
        private java.lang.String description;
        private java.util.List<imports.aws.AmiEbsBlockDevice> ebsBlockDevice;
        private java.lang.Boolean enaSupport;
        private java.util.List<imports.aws.AmiEphemeralBlockDevice> ephemeralBlockDevice;
        private java.lang.String imageLocation;
        private java.lang.String kernelId;
        private java.lang.String ramdiskId;
        private java.lang.String rootDeviceName;
        private java.lang.String sriovNetSupport;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private imports.aws.AmiTimeouts timeouts;
        private java.lang.String virtualizationType;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link AmiConfig#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link AmiConfig#getArchitecture}
         * @param architecture the value to be set.
         * @return {@code this}
         */
        public Builder architecture(java.lang.String architecture) {
            this.architecture = architecture;
            return this;
        }

        /**
         * Sets the value of {@link AmiConfig#getDescription}
         * @param description the value to be set.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link AmiConfig#getEbsBlockDevice}
         * @param ebsBlockDevice ebs_block_device block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder ebsBlockDevice(java.util.List<? extends imports.aws.AmiEbsBlockDevice> ebsBlockDevice) {
            this.ebsBlockDevice = (java.util.List<imports.aws.AmiEbsBlockDevice>)ebsBlockDevice;
            return this;
        }

        /**
         * Sets the value of {@link AmiConfig#getEnaSupport}
         * @param enaSupport the value to be set.
         * @return {@code this}
         */
        public Builder enaSupport(java.lang.Boolean enaSupport) {
            this.enaSupport = enaSupport;
            return this;
        }

        /**
         * Sets the value of {@link AmiConfig#getEphemeralBlockDevice}
         * @param ephemeralBlockDevice ephemeral_block_device block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder ephemeralBlockDevice(java.util.List<? extends imports.aws.AmiEphemeralBlockDevice> ephemeralBlockDevice) {
            this.ephemeralBlockDevice = (java.util.List<imports.aws.AmiEphemeralBlockDevice>)ephemeralBlockDevice;
            return this;
        }

        /**
         * Sets the value of {@link AmiConfig#getImageLocation}
         * @param imageLocation the value to be set.
         * @return {@code this}
         */
        public Builder imageLocation(java.lang.String imageLocation) {
            this.imageLocation = imageLocation;
            return this;
        }

        /**
         * Sets the value of {@link AmiConfig#getKernelId}
         * @param kernelId the value to be set.
         * @return {@code this}
         */
        public Builder kernelId(java.lang.String kernelId) {
            this.kernelId = kernelId;
            return this;
        }

        /**
         * Sets the value of {@link AmiConfig#getRamdiskId}
         * @param ramdiskId the value to be set.
         * @return {@code this}
         */
        public Builder ramdiskId(java.lang.String ramdiskId) {
            this.ramdiskId = ramdiskId;
            return this;
        }

        /**
         * Sets the value of {@link AmiConfig#getRootDeviceName}
         * @param rootDeviceName the value to be set.
         * @return {@code this}
         */
        public Builder rootDeviceName(java.lang.String rootDeviceName) {
            this.rootDeviceName = rootDeviceName;
            return this;
        }

        /**
         * Sets the value of {@link AmiConfig#getSriovNetSupport}
         * @param sriovNetSupport the value to be set.
         * @return {@code this}
         */
        public Builder sriovNetSupport(java.lang.String sriovNetSupport) {
            this.sriovNetSupport = sriovNetSupport;
            return this;
        }

        /**
         * Sets the value of {@link AmiConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link AmiConfig#getTimeouts}
         * @param timeouts timeouts block.
         * @return {@code this}
         */
        public Builder timeouts(imports.aws.AmiTimeouts timeouts) {
            this.timeouts = timeouts;
            return this;
        }

        /**
         * Sets the value of {@link AmiConfig#getVirtualizationType}
         * @param virtualizationType the value to be set.
         * @return {@code this}
         */
        public Builder virtualizationType(java.lang.String virtualizationType) {
            this.virtualizationType = virtualizationType;
            return this;
        }

        /**
         * Sets the value of {@link AmiConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link AmiConfig#getDependsOn}
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
         * Sets the value of {@link AmiConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link AmiConfig#getProvider}
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
         * @return a new instance of {@link AmiConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AmiConfig build() {
            return new Jsii$Proxy(name, architecture, description, ebsBlockDevice, enaSupport, ephemeralBlockDevice, imageLocation, kernelId, ramdiskId, rootDeviceName, sriovNetSupport, tags, timeouts, virtualizationType, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link AmiConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AmiConfig {
        private final java.lang.String name;
        private final java.lang.String architecture;
        private final java.lang.String description;
        private final java.util.List<imports.aws.AmiEbsBlockDevice> ebsBlockDevice;
        private final java.lang.Boolean enaSupport;
        private final java.util.List<imports.aws.AmiEphemeralBlockDevice> ephemeralBlockDevice;
        private final java.lang.String imageLocation;
        private final java.lang.String kernelId;
        private final java.lang.String ramdiskId;
        private final java.lang.String rootDeviceName;
        private final java.lang.String sriovNetSupport;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final imports.aws.AmiTimeouts timeouts;
        private final java.lang.String virtualizationType;
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
            this.architecture = software.amazon.jsii.Kernel.get(this, "architecture", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.ebsBlockDevice = software.amazon.jsii.Kernel.get(this, "ebsBlockDevice", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AmiEbsBlockDevice.class)));
            this.enaSupport = software.amazon.jsii.Kernel.get(this, "enaSupport", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.ephemeralBlockDevice = software.amazon.jsii.Kernel.get(this, "ephemeralBlockDevice", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AmiEphemeralBlockDevice.class)));
            this.imageLocation = software.amazon.jsii.Kernel.get(this, "imageLocation", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.kernelId = software.amazon.jsii.Kernel.get(this, "kernelId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.ramdiskId = software.amazon.jsii.Kernel.get(this, "ramdiskId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.rootDeviceName = software.amazon.jsii.Kernel.get(this, "rootDeviceName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.sriovNetSupport = software.amazon.jsii.Kernel.get(this, "sriovNetSupport", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.timeouts = software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.AmiTimeouts.class));
            this.virtualizationType = software.amazon.jsii.Kernel.get(this, "virtualizationType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String name, final java.lang.String architecture, final java.lang.String description, final java.util.List<? extends imports.aws.AmiEbsBlockDevice> ebsBlockDevice, final java.lang.Boolean enaSupport, final java.util.List<? extends imports.aws.AmiEphemeralBlockDevice> ephemeralBlockDevice, final java.lang.String imageLocation, final java.lang.String kernelId, final java.lang.String ramdiskId, final java.lang.String rootDeviceName, final java.lang.String sriovNetSupport, final java.util.Map<java.lang.String, java.lang.String> tags, final imports.aws.AmiTimeouts timeouts, final java.lang.String virtualizationType, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.architecture = architecture;
            this.description = description;
            this.ebsBlockDevice = (java.util.List<imports.aws.AmiEbsBlockDevice>)ebsBlockDevice;
            this.enaSupport = enaSupport;
            this.ephemeralBlockDevice = (java.util.List<imports.aws.AmiEphemeralBlockDevice>)ephemeralBlockDevice;
            this.imageLocation = imageLocation;
            this.kernelId = kernelId;
            this.ramdiskId = ramdiskId;
            this.rootDeviceName = rootDeviceName;
            this.sriovNetSupport = sriovNetSupport;
            this.tags = tags;
            this.timeouts = timeouts;
            this.virtualizationType = virtualizationType;
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
        public final java.lang.String getArchitecture() {
            return this.architecture;
        }

        @Override
        public final java.lang.String getDescription() {
            return this.description;
        }

        @Override
        public final java.util.List<imports.aws.AmiEbsBlockDevice> getEbsBlockDevice() {
            return this.ebsBlockDevice;
        }

        @Override
        public final java.lang.Boolean getEnaSupport() {
            return this.enaSupport;
        }

        @Override
        public final java.util.List<imports.aws.AmiEphemeralBlockDevice> getEphemeralBlockDevice() {
            return this.ephemeralBlockDevice;
        }

        @Override
        public final java.lang.String getImageLocation() {
            return this.imageLocation;
        }

        @Override
        public final java.lang.String getKernelId() {
            return this.kernelId;
        }

        @Override
        public final java.lang.String getRamdiskId() {
            return this.ramdiskId;
        }

        @Override
        public final java.lang.String getRootDeviceName() {
            return this.rootDeviceName;
        }

        @Override
        public final java.lang.String getSriovNetSupport() {
            return this.sriovNetSupport;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final imports.aws.AmiTimeouts getTimeouts() {
            return this.timeouts;
        }

        @Override
        public final java.lang.String getVirtualizationType() {
            return this.virtualizationType;
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
            if (this.getArchitecture() != null) {
                data.set("architecture", om.valueToTree(this.getArchitecture()));
            }
            if (this.getDescription() != null) {
                data.set("description", om.valueToTree(this.getDescription()));
            }
            if (this.getEbsBlockDevice() != null) {
                data.set("ebsBlockDevice", om.valueToTree(this.getEbsBlockDevice()));
            }
            if (this.getEnaSupport() != null) {
                data.set("enaSupport", om.valueToTree(this.getEnaSupport()));
            }
            if (this.getEphemeralBlockDevice() != null) {
                data.set("ephemeralBlockDevice", om.valueToTree(this.getEphemeralBlockDevice()));
            }
            if (this.getImageLocation() != null) {
                data.set("imageLocation", om.valueToTree(this.getImageLocation()));
            }
            if (this.getKernelId() != null) {
                data.set("kernelId", om.valueToTree(this.getKernelId()));
            }
            if (this.getRamdiskId() != null) {
                data.set("ramdiskId", om.valueToTree(this.getRamdiskId()));
            }
            if (this.getRootDeviceName() != null) {
                data.set("rootDeviceName", om.valueToTree(this.getRootDeviceName()));
            }
            if (this.getSriovNetSupport() != null) {
                data.set("sriovNetSupport", om.valueToTree(this.getSriovNetSupport()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getTimeouts() != null) {
                data.set("timeouts", om.valueToTree(this.getTimeouts()));
            }
            if (this.getVirtualizationType() != null) {
                data.set("virtualizationType", om.valueToTree(this.getVirtualizationType()));
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
            struct.set("fqn", om.valueToTree("aws.AmiConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AmiConfig.Jsii$Proxy that = (AmiConfig.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (this.architecture != null ? !this.architecture.equals(that.architecture) : that.architecture != null) return false;
            if (this.description != null ? !this.description.equals(that.description) : that.description != null) return false;
            if (this.ebsBlockDevice != null ? !this.ebsBlockDevice.equals(that.ebsBlockDevice) : that.ebsBlockDevice != null) return false;
            if (this.enaSupport != null ? !this.enaSupport.equals(that.enaSupport) : that.enaSupport != null) return false;
            if (this.ephemeralBlockDevice != null ? !this.ephemeralBlockDevice.equals(that.ephemeralBlockDevice) : that.ephemeralBlockDevice != null) return false;
            if (this.imageLocation != null ? !this.imageLocation.equals(that.imageLocation) : that.imageLocation != null) return false;
            if (this.kernelId != null ? !this.kernelId.equals(that.kernelId) : that.kernelId != null) return false;
            if (this.ramdiskId != null ? !this.ramdiskId.equals(that.ramdiskId) : that.ramdiskId != null) return false;
            if (this.rootDeviceName != null ? !this.rootDeviceName.equals(that.rootDeviceName) : that.rootDeviceName != null) return false;
            if (this.sriovNetSupport != null ? !this.sriovNetSupport.equals(that.sriovNetSupport) : that.sriovNetSupport != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.timeouts != null ? !this.timeouts.equals(that.timeouts) : that.timeouts != null) return false;
            if (this.virtualizationType != null ? !this.virtualizationType.equals(that.virtualizationType) : that.virtualizationType != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.architecture != null ? this.architecture.hashCode() : 0);
            result = 31 * result + (this.description != null ? this.description.hashCode() : 0);
            result = 31 * result + (this.ebsBlockDevice != null ? this.ebsBlockDevice.hashCode() : 0);
            result = 31 * result + (this.enaSupport != null ? this.enaSupport.hashCode() : 0);
            result = 31 * result + (this.ephemeralBlockDevice != null ? this.ephemeralBlockDevice.hashCode() : 0);
            result = 31 * result + (this.imageLocation != null ? this.imageLocation.hashCode() : 0);
            result = 31 * result + (this.kernelId != null ? this.kernelId.hashCode() : 0);
            result = 31 * result + (this.ramdiskId != null ? this.ramdiskId.hashCode() : 0);
            result = 31 * result + (this.rootDeviceName != null ? this.rootDeviceName.hashCode() : 0);
            result = 31 * result + (this.sriovNetSupport != null ? this.sriovNetSupport.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.timeouts != null ? this.timeouts.hashCode() : 0);
            result = 31 * result + (this.virtualizationType != null ? this.virtualizationType.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
