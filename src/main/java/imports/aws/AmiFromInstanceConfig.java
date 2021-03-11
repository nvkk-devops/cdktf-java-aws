package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:01.956Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AmiFromInstanceConfig")
@software.amazon.jsii.Jsii.Proxy(AmiFromInstanceConfig.Jsii$Proxy.class)
public interface AmiFromInstanceConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    @org.jetbrains.annotations.NotNull java.lang.String getSourceInstanceId();

    default @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return null;
    }

    /**
     * ebs_block_device block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AmiFromInstanceEbsBlockDevice> getEbsBlockDevice() {
        return null;
    }

    /**
     * ephemeral_block_device block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AmiFromInstanceEphemeralBlockDevice> getEphemeralBlockDevice() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getSnapshotWithoutReboot() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * timeouts block.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.AmiFromInstanceTimeouts getTimeouts() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AmiFromInstanceConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AmiFromInstanceConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AmiFromInstanceConfig> {
        private java.lang.String name;
        private java.lang.String sourceInstanceId;
        private java.lang.String description;
        private java.util.List<imports.aws.AmiFromInstanceEbsBlockDevice> ebsBlockDevice;
        private java.util.List<imports.aws.AmiFromInstanceEphemeralBlockDevice> ephemeralBlockDevice;
        private java.lang.Boolean snapshotWithoutReboot;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private imports.aws.AmiFromInstanceTimeouts timeouts;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link AmiFromInstanceConfig#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link AmiFromInstanceConfig#getSourceInstanceId}
         * @param sourceInstanceId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder sourceInstanceId(java.lang.String sourceInstanceId) {
            this.sourceInstanceId = sourceInstanceId;
            return this;
        }

        /**
         * Sets the value of {@link AmiFromInstanceConfig#getDescription}
         * @param description the value to be set.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link AmiFromInstanceConfig#getEbsBlockDevice}
         * @param ebsBlockDevice ebs_block_device block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder ebsBlockDevice(java.util.List<? extends imports.aws.AmiFromInstanceEbsBlockDevice> ebsBlockDevice) {
            this.ebsBlockDevice = (java.util.List<imports.aws.AmiFromInstanceEbsBlockDevice>)ebsBlockDevice;
            return this;
        }

        /**
         * Sets the value of {@link AmiFromInstanceConfig#getEphemeralBlockDevice}
         * @param ephemeralBlockDevice ephemeral_block_device block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder ephemeralBlockDevice(java.util.List<? extends imports.aws.AmiFromInstanceEphemeralBlockDevice> ephemeralBlockDevice) {
            this.ephemeralBlockDevice = (java.util.List<imports.aws.AmiFromInstanceEphemeralBlockDevice>)ephemeralBlockDevice;
            return this;
        }

        /**
         * Sets the value of {@link AmiFromInstanceConfig#getSnapshotWithoutReboot}
         * @param snapshotWithoutReboot the value to be set.
         * @return {@code this}
         */
        public Builder snapshotWithoutReboot(java.lang.Boolean snapshotWithoutReboot) {
            this.snapshotWithoutReboot = snapshotWithoutReboot;
            return this;
        }

        /**
         * Sets the value of {@link AmiFromInstanceConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link AmiFromInstanceConfig#getTimeouts}
         * @param timeouts timeouts block.
         * @return {@code this}
         */
        public Builder timeouts(imports.aws.AmiFromInstanceTimeouts timeouts) {
            this.timeouts = timeouts;
            return this;
        }

        /**
         * Sets the value of {@link AmiFromInstanceConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link AmiFromInstanceConfig#getDependsOn}
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
         * Sets the value of {@link AmiFromInstanceConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link AmiFromInstanceConfig#getProvider}
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
         * @return a new instance of {@link AmiFromInstanceConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AmiFromInstanceConfig build() {
            return new Jsii$Proxy(name, sourceInstanceId, description, ebsBlockDevice, ephemeralBlockDevice, snapshotWithoutReboot, tags, timeouts, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link AmiFromInstanceConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AmiFromInstanceConfig {
        private final java.lang.String name;
        private final java.lang.String sourceInstanceId;
        private final java.lang.String description;
        private final java.util.List<imports.aws.AmiFromInstanceEbsBlockDevice> ebsBlockDevice;
        private final java.util.List<imports.aws.AmiFromInstanceEphemeralBlockDevice> ephemeralBlockDevice;
        private final java.lang.Boolean snapshotWithoutReboot;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final imports.aws.AmiFromInstanceTimeouts timeouts;
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
            this.sourceInstanceId = software.amazon.jsii.Kernel.get(this, "sourceInstanceId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.ebsBlockDevice = software.amazon.jsii.Kernel.get(this, "ebsBlockDevice", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AmiFromInstanceEbsBlockDevice.class)));
            this.ephemeralBlockDevice = software.amazon.jsii.Kernel.get(this, "ephemeralBlockDevice", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AmiFromInstanceEphemeralBlockDevice.class)));
            this.snapshotWithoutReboot = software.amazon.jsii.Kernel.get(this, "snapshotWithoutReboot", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.timeouts = software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.AmiFromInstanceTimeouts.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String name, final java.lang.String sourceInstanceId, final java.lang.String description, final java.util.List<? extends imports.aws.AmiFromInstanceEbsBlockDevice> ebsBlockDevice, final java.util.List<? extends imports.aws.AmiFromInstanceEphemeralBlockDevice> ephemeralBlockDevice, final java.lang.Boolean snapshotWithoutReboot, final java.util.Map<java.lang.String, java.lang.String> tags, final imports.aws.AmiFromInstanceTimeouts timeouts, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.sourceInstanceId = java.util.Objects.requireNonNull(sourceInstanceId, "sourceInstanceId is required");
            this.description = description;
            this.ebsBlockDevice = (java.util.List<imports.aws.AmiFromInstanceEbsBlockDevice>)ebsBlockDevice;
            this.ephemeralBlockDevice = (java.util.List<imports.aws.AmiFromInstanceEphemeralBlockDevice>)ephemeralBlockDevice;
            this.snapshotWithoutReboot = snapshotWithoutReboot;
            this.tags = tags;
            this.timeouts = timeouts;
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
        public final java.lang.String getSourceInstanceId() {
            return this.sourceInstanceId;
        }

        @Override
        public final java.lang.String getDescription() {
            return this.description;
        }

        @Override
        public final java.util.List<imports.aws.AmiFromInstanceEbsBlockDevice> getEbsBlockDevice() {
            return this.ebsBlockDevice;
        }

        @Override
        public final java.util.List<imports.aws.AmiFromInstanceEphemeralBlockDevice> getEphemeralBlockDevice() {
            return this.ephemeralBlockDevice;
        }

        @Override
        public final java.lang.Boolean getSnapshotWithoutReboot() {
            return this.snapshotWithoutReboot;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final imports.aws.AmiFromInstanceTimeouts getTimeouts() {
            return this.timeouts;
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
            data.set("sourceInstanceId", om.valueToTree(this.getSourceInstanceId()));
            if (this.getDescription() != null) {
                data.set("description", om.valueToTree(this.getDescription()));
            }
            if (this.getEbsBlockDevice() != null) {
                data.set("ebsBlockDevice", om.valueToTree(this.getEbsBlockDevice()));
            }
            if (this.getEphemeralBlockDevice() != null) {
                data.set("ephemeralBlockDevice", om.valueToTree(this.getEphemeralBlockDevice()));
            }
            if (this.getSnapshotWithoutReboot() != null) {
                data.set("snapshotWithoutReboot", om.valueToTree(this.getSnapshotWithoutReboot()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getTimeouts() != null) {
                data.set("timeouts", om.valueToTree(this.getTimeouts()));
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
            struct.set("fqn", om.valueToTree("aws.AmiFromInstanceConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AmiFromInstanceConfig.Jsii$Proxy that = (AmiFromInstanceConfig.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (!sourceInstanceId.equals(that.sourceInstanceId)) return false;
            if (this.description != null ? !this.description.equals(that.description) : that.description != null) return false;
            if (this.ebsBlockDevice != null ? !this.ebsBlockDevice.equals(that.ebsBlockDevice) : that.ebsBlockDevice != null) return false;
            if (this.ephemeralBlockDevice != null ? !this.ephemeralBlockDevice.equals(that.ephemeralBlockDevice) : that.ephemeralBlockDevice != null) return false;
            if (this.snapshotWithoutReboot != null ? !this.snapshotWithoutReboot.equals(that.snapshotWithoutReboot) : that.snapshotWithoutReboot != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.timeouts != null ? !this.timeouts.equals(that.timeouts) : that.timeouts != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.sourceInstanceId.hashCode());
            result = 31 * result + (this.description != null ? this.description.hashCode() : 0);
            result = 31 * result + (this.ebsBlockDevice != null ? this.ebsBlockDevice.hashCode() : 0);
            result = 31 * result + (this.ephemeralBlockDevice != null ? this.ephemeralBlockDevice.hashCode() : 0);
            result = 31 * result + (this.snapshotWithoutReboot != null ? this.snapshotWithoutReboot.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.timeouts != null ? this.timeouts.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
