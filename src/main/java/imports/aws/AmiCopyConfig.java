package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:01.954Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AmiCopyConfig")
@software.amazon.jsii.Jsii.Proxy(AmiCopyConfig.Jsii$Proxy.class)
public interface AmiCopyConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    @org.jetbrains.annotations.NotNull java.lang.String getSourceAmiId();

    @org.jetbrains.annotations.NotNull java.lang.String getSourceAmiRegion();

    default @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return null;
    }

    /**
     * ebs_block_device block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AmiCopyEbsBlockDevice> getEbsBlockDevice() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getEncrypted() {
        return null;
    }

    /**
     * ephemeral_block_device block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AmiCopyEphemeralBlockDevice> getEphemeralBlockDevice() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getKmsKeyId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * timeouts block.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.AmiCopyTimeouts getTimeouts() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AmiCopyConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AmiCopyConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AmiCopyConfig> {
        private java.lang.String name;
        private java.lang.String sourceAmiId;
        private java.lang.String sourceAmiRegion;
        private java.lang.String description;
        private java.util.List<imports.aws.AmiCopyEbsBlockDevice> ebsBlockDevice;
        private java.lang.Boolean encrypted;
        private java.util.List<imports.aws.AmiCopyEphemeralBlockDevice> ephemeralBlockDevice;
        private java.lang.String kmsKeyId;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private imports.aws.AmiCopyTimeouts timeouts;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link AmiCopyConfig#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link AmiCopyConfig#getSourceAmiId}
         * @param sourceAmiId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder sourceAmiId(java.lang.String sourceAmiId) {
            this.sourceAmiId = sourceAmiId;
            return this;
        }

        /**
         * Sets the value of {@link AmiCopyConfig#getSourceAmiRegion}
         * @param sourceAmiRegion the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder sourceAmiRegion(java.lang.String sourceAmiRegion) {
            this.sourceAmiRegion = sourceAmiRegion;
            return this;
        }

        /**
         * Sets the value of {@link AmiCopyConfig#getDescription}
         * @param description the value to be set.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link AmiCopyConfig#getEbsBlockDevice}
         * @param ebsBlockDevice ebs_block_device block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder ebsBlockDevice(java.util.List<? extends imports.aws.AmiCopyEbsBlockDevice> ebsBlockDevice) {
            this.ebsBlockDevice = (java.util.List<imports.aws.AmiCopyEbsBlockDevice>)ebsBlockDevice;
            return this;
        }

        /**
         * Sets the value of {@link AmiCopyConfig#getEncrypted}
         * @param encrypted the value to be set.
         * @return {@code this}
         */
        public Builder encrypted(java.lang.Boolean encrypted) {
            this.encrypted = encrypted;
            return this;
        }

        /**
         * Sets the value of {@link AmiCopyConfig#getEphemeralBlockDevice}
         * @param ephemeralBlockDevice ephemeral_block_device block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder ephemeralBlockDevice(java.util.List<? extends imports.aws.AmiCopyEphemeralBlockDevice> ephemeralBlockDevice) {
            this.ephemeralBlockDevice = (java.util.List<imports.aws.AmiCopyEphemeralBlockDevice>)ephemeralBlockDevice;
            return this;
        }

        /**
         * Sets the value of {@link AmiCopyConfig#getKmsKeyId}
         * @param kmsKeyId the value to be set.
         * @return {@code this}
         */
        public Builder kmsKeyId(java.lang.String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * Sets the value of {@link AmiCopyConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link AmiCopyConfig#getTimeouts}
         * @param timeouts timeouts block.
         * @return {@code this}
         */
        public Builder timeouts(imports.aws.AmiCopyTimeouts timeouts) {
            this.timeouts = timeouts;
            return this;
        }

        /**
         * Sets the value of {@link AmiCopyConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link AmiCopyConfig#getDependsOn}
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
         * Sets the value of {@link AmiCopyConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link AmiCopyConfig#getProvider}
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
         * @return a new instance of {@link AmiCopyConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AmiCopyConfig build() {
            return new Jsii$Proxy(name, sourceAmiId, sourceAmiRegion, description, ebsBlockDevice, encrypted, ephemeralBlockDevice, kmsKeyId, tags, timeouts, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link AmiCopyConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AmiCopyConfig {
        private final java.lang.String name;
        private final java.lang.String sourceAmiId;
        private final java.lang.String sourceAmiRegion;
        private final java.lang.String description;
        private final java.util.List<imports.aws.AmiCopyEbsBlockDevice> ebsBlockDevice;
        private final java.lang.Boolean encrypted;
        private final java.util.List<imports.aws.AmiCopyEphemeralBlockDevice> ephemeralBlockDevice;
        private final java.lang.String kmsKeyId;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final imports.aws.AmiCopyTimeouts timeouts;
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
            this.sourceAmiId = software.amazon.jsii.Kernel.get(this, "sourceAmiId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.sourceAmiRegion = software.amazon.jsii.Kernel.get(this, "sourceAmiRegion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.ebsBlockDevice = software.amazon.jsii.Kernel.get(this, "ebsBlockDevice", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AmiCopyEbsBlockDevice.class)));
            this.encrypted = software.amazon.jsii.Kernel.get(this, "encrypted", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.ephemeralBlockDevice = software.amazon.jsii.Kernel.get(this, "ephemeralBlockDevice", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AmiCopyEphemeralBlockDevice.class)));
            this.kmsKeyId = software.amazon.jsii.Kernel.get(this, "kmsKeyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.timeouts = software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.AmiCopyTimeouts.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String name, final java.lang.String sourceAmiId, final java.lang.String sourceAmiRegion, final java.lang.String description, final java.util.List<? extends imports.aws.AmiCopyEbsBlockDevice> ebsBlockDevice, final java.lang.Boolean encrypted, final java.util.List<? extends imports.aws.AmiCopyEphemeralBlockDevice> ephemeralBlockDevice, final java.lang.String kmsKeyId, final java.util.Map<java.lang.String, java.lang.String> tags, final imports.aws.AmiCopyTimeouts timeouts, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.sourceAmiId = java.util.Objects.requireNonNull(sourceAmiId, "sourceAmiId is required");
            this.sourceAmiRegion = java.util.Objects.requireNonNull(sourceAmiRegion, "sourceAmiRegion is required");
            this.description = description;
            this.ebsBlockDevice = (java.util.List<imports.aws.AmiCopyEbsBlockDevice>)ebsBlockDevice;
            this.encrypted = encrypted;
            this.ephemeralBlockDevice = (java.util.List<imports.aws.AmiCopyEphemeralBlockDevice>)ephemeralBlockDevice;
            this.kmsKeyId = kmsKeyId;
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
        public final java.lang.String getSourceAmiId() {
            return this.sourceAmiId;
        }

        @Override
        public final java.lang.String getSourceAmiRegion() {
            return this.sourceAmiRegion;
        }

        @Override
        public final java.lang.String getDescription() {
            return this.description;
        }

        @Override
        public final java.util.List<imports.aws.AmiCopyEbsBlockDevice> getEbsBlockDevice() {
            return this.ebsBlockDevice;
        }

        @Override
        public final java.lang.Boolean getEncrypted() {
            return this.encrypted;
        }

        @Override
        public final java.util.List<imports.aws.AmiCopyEphemeralBlockDevice> getEphemeralBlockDevice() {
            return this.ephemeralBlockDevice;
        }

        @Override
        public final java.lang.String getKmsKeyId() {
            return this.kmsKeyId;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final imports.aws.AmiCopyTimeouts getTimeouts() {
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
            data.set("sourceAmiId", om.valueToTree(this.getSourceAmiId()));
            data.set("sourceAmiRegion", om.valueToTree(this.getSourceAmiRegion()));
            if (this.getDescription() != null) {
                data.set("description", om.valueToTree(this.getDescription()));
            }
            if (this.getEbsBlockDevice() != null) {
                data.set("ebsBlockDevice", om.valueToTree(this.getEbsBlockDevice()));
            }
            if (this.getEncrypted() != null) {
                data.set("encrypted", om.valueToTree(this.getEncrypted()));
            }
            if (this.getEphemeralBlockDevice() != null) {
                data.set("ephemeralBlockDevice", om.valueToTree(this.getEphemeralBlockDevice()));
            }
            if (this.getKmsKeyId() != null) {
                data.set("kmsKeyId", om.valueToTree(this.getKmsKeyId()));
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
            struct.set("fqn", om.valueToTree("aws.AmiCopyConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AmiCopyConfig.Jsii$Proxy that = (AmiCopyConfig.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (!sourceAmiId.equals(that.sourceAmiId)) return false;
            if (!sourceAmiRegion.equals(that.sourceAmiRegion)) return false;
            if (this.description != null ? !this.description.equals(that.description) : that.description != null) return false;
            if (this.ebsBlockDevice != null ? !this.ebsBlockDevice.equals(that.ebsBlockDevice) : that.ebsBlockDevice != null) return false;
            if (this.encrypted != null ? !this.encrypted.equals(that.encrypted) : that.encrypted != null) return false;
            if (this.ephemeralBlockDevice != null ? !this.ephemeralBlockDevice.equals(that.ephemeralBlockDevice) : that.ephemeralBlockDevice != null) return false;
            if (this.kmsKeyId != null ? !this.kmsKeyId.equals(that.kmsKeyId) : that.kmsKeyId != null) return false;
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
            result = 31 * result + (this.sourceAmiId.hashCode());
            result = 31 * result + (this.sourceAmiRegion.hashCode());
            result = 31 * result + (this.description != null ? this.description.hashCode() : 0);
            result = 31 * result + (this.ebsBlockDevice != null ? this.ebsBlockDevice.hashCode() : 0);
            result = 31 * result + (this.encrypted != null ? this.encrypted.hashCode() : 0);
            result = 31 * result + (this.ephemeralBlockDevice != null ? this.ephemeralBlockDevice.hashCode() : 0);
            result = 31 * result + (this.kmsKeyId != null ? this.kmsKeyId.hashCode() : 0);
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
