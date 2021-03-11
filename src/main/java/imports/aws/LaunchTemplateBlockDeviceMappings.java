package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.684Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.LaunchTemplateBlockDeviceMappings")
@software.amazon.jsii.Jsii.Proxy(LaunchTemplateBlockDeviceMappings.Jsii$Proxy.class)
public interface LaunchTemplateBlockDeviceMappings extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.String getDeviceName() {
        return null;
    }

    /**
     * ebs block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LaunchTemplateBlockDeviceMappingsEbs> getEbs() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getNoDevice() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getVirtualName() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link LaunchTemplateBlockDeviceMappings}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LaunchTemplateBlockDeviceMappings}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LaunchTemplateBlockDeviceMappings> {
        private java.lang.String deviceName;
        private java.util.List<imports.aws.LaunchTemplateBlockDeviceMappingsEbs> ebs;
        private java.lang.String noDevice;
        private java.lang.String virtualName;

        /**
         * Sets the value of {@link LaunchTemplateBlockDeviceMappings#getDeviceName}
         * @param deviceName the value to be set.
         * @return {@code this}
         */
        public Builder deviceName(java.lang.String deviceName) {
            this.deviceName = deviceName;
            return this;
        }

        /**
         * Sets the value of {@link LaunchTemplateBlockDeviceMappings#getEbs}
         * @param ebs ebs block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder ebs(java.util.List<? extends imports.aws.LaunchTemplateBlockDeviceMappingsEbs> ebs) {
            this.ebs = (java.util.List<imports.aws.LaunchTemplateBlockDeviceMappingsEbs>)ebs;
            return this;
        }

        /**
         * Sets the value of {@link LaunchTemplateBlockDeviceMappings#getNoDevice}
         * @param noDevice the value to be set.
         * @return {@code this}
         */
        public Builder noDevice(java.lang.String noDevice) {
            this.noDevice = noDevice;
            return this;
        }

        /**
         * Sets the value of {@link LaunchTemplateBlockDeviceMappings#getVirtualName}
         * @param virtualName the value to be set.
         * @return {@code this}
         */
        public Builder virtualName(java.lang.String virtualName) {
            this.virtualName = virtualName;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link LaunchTemplateBlockDeviceMappings}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LaunchTemplateBlockDeviceMappings build() {
            return new Jsii$Proxy(deviceName, ebs, noDevice, virtualName);
        }
    }

    /**
     * An implementation for {@link LaunchTemplateBlockDeviceMappings}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LaunchTemplateBlockDeviceMappings {
        private final java.lang.String deviceName;
        private final java.util.List<imports.aws.LaunchTemplateBlockDeviceMappingsEbs> ebs;
        private final java.lang.String noDevice;
        private final java.lang.String virtualName;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.deviceName = software.amazon.jsii.Kernel.get(this, "deviceName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.ebs = software.amazon.jsii.Kernel.get(this, "ebs", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LaunchTemplateBlockDeviceMappingsEbs.class)));
            this.noDevice = software.amazon.jsii.Kernel.get(this, "noDevice", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.virtualName = software.amazon.jsii.Kernel.get(this, "virtualName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String deviceName, final java.util.List<? extends imports.aws.LaunchTemplateBlockDeviceMappingsEbs> ebs, final java.lang.String noDevice, final java.lang.String virtualName) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.deviceName = deviceName;
            this.ebs = (java.util.List<imports.aws.LaunchTemplateBlockDeviceMappingsEbs>)ebs;
            this.noDevice = noDevice;
            this.virtualName = virtualName;
        }

        @Override
        public final java.lang.String getDeviceName() {
            return this.deviceName;
        }

        @Override
        public final java.util.List<imports.aws.LaunchTemplateBlockDeviceMappingsEbs> getEbs() {
            return this.ebs;
        }

        @Override
        public final java.lang.String getNoDevice() {
            return this.noDevice;
        }

        @Override
        public final java.lang.String getVirtualName() {
            return this.virtualName;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getDeviceName() != null) {
                data.set("deviceName", om.valueToTree(this.getDeviceName()));
            }
            if (this.getEbs() != null) {
                data.set("ebs", om.valueToTree(this.getEbs()));
            }
            if (this.getNoDevice() != null) {
                data.set("noDevice", om.valueToTree(this.getNoDevice()));
            }
            if (this.getVirtualName() != null) {
                data.set("virtualName", om.valueToTree(this.getVirtualName()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.LaunchTemplateBlockDeviceMappings"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LaunchTemplateBlockDeviceMappings.Jsii$Proxy that = (LaunchTemplateBlockDeviceMappings.Jsii$Proxy) o;

            if (this.deviceName != null ? !this.deviceName.equals(that.deviceName) : that.deviceName != null) return false;
            if (this.ebs != null ? !this.ebs.equals(that.ebs) : that.ebs != null) return false;
            if (this.noDevice != null ? !this.noDevice.equals(that.noDevice) : that.noDevice != null) return false;
            return this.virtualName != null ? this.virtualName.equals(that.virtualName) : that.virtualName == null;
        }

        @Override
        public final int hashCode() {
            int result = this.deviceName != null ? this.deviceName.hashCode() : 0;
            result = 31 * result + (this.ebs != null ? this.ebs.hashCode() : 0);
            result = 31 * result + (this.noDevice != null ? this.noDevice.hashCode() : 0);
            result = 31 * result + (this.virtualName != null ? this.virtualName.hashCode() : 0);
            return result;
        }
    }
}
