package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.520Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.EcsTaskDefinitionVolume")
@software.amazon.jsii.Jsii.Proxy(EcsTaskDefinitionVolume.Jsii$Proxy.class)
public interface EcsTaskDefinitionVolume extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * docker_volume_configuration block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.EcsTaskDefinitionVolumeDockerVolumeConfiguration> getDockerVolumeConfiguration() {
        return null;
    }

    /**
     * efs_volume_configuration block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.EcsTaskDefinitionVolumeEfsVolumeConfiguration> getEfsVolumeConfiguration() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getHostPath() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link EcsTaskDefinitionVolume}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link EcsTaskDefinitionVolume}
     */
    public static final class Builder implements software.amazon.jsii.Builder<EcsTaskDefinitionVolume> {
        private java.lang.String name;
        private java.util.List<imports.aws.EcsTaskDefinitionVolumeDockerVolumeConfiguration> dockerVolumeConfiguration;
        private java.util.List<imports.aws.EcsTaskDefinitionVolumeEfsVolumeConfiguration> efsVolumeConfiguration;
        private java.lang.String hostPath;

        /**
         * Sets the value of {@link EcsTaskDefinitionVolume#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link EcsTaskDefinitionVolume#getDockerVolumeConfiguration}
         * @param dockerVolumeConfiguration docker_volume_configuration block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder dockerVolumeConfiguration(java.util.List<? extends imports.aws.EcsTaskDefinitionVolumeDockerVolumeConfiguration> dockerVolumeConfiguration) {
            this.dockerVolumeConfiguration = (java.util.List<imports.aws.EcsTaskDefinitionVolumeDockerVolumeConfiguration>)dockerVolumeConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link EcsTaskDefinitionVolume#getEfsVolumeConfiguration}
         * @param efsVolumeConfiguration efs_volume_configuration block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder efsVolumeConfiguration(java.util.List<? extends imports.aws.EcsTaskDefinitionVolumeEfsVolumeConfiguration> efsVolumeConfiguration) {
            this.efsVolumeConfiguration = (java.util.List<imports.aws.EcsTaskDefinitionVolumeEfsVolumeConfiguration>)efsVolumeConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link EcsTaskDefinitionVolume#getHostPath}
         * @param hostPath the value to be set.
         * @return {@code this}
         */
        public Builder hostPath(java.lang.String hostPath) {
            this.hostPath = hostPath;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link EcsTaskDefinitionVolume}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public EcsTaskDefinitionVolume build() {
            return new Jsii$Proxy(name, dockerVolumeConfiguration, efsVolumeConfiguration, hostPath);
        }
    }

    /**
     * An implementation for {@link EcsTaskDefinitionVolume}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements EcsTaskDefinitionVolume {
        private final java.lang.String name;
        private final java.util.List<imports.aws.EcsTaskDefinitionVolumeDockerVolumeConfiguration> dockerVolumeConfiguration;
        private final java.util.List<imports.aws.EcsTaskDefinitionVolumeEfsVolumeConfiguration> efsVolumeConfiguration;
        private final java.lang.String hostPath;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.dockerVolumeConfiguration = software.amazon.jsii.Kernel.get(this, "dockerVolumeConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EcsTaskDefinitionVolumeDockerVolumeConfiguration.class)));
            this.efsVolumeConfiguration = software.amazon.jsii.Kernel.get(this, "efsVolumeConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EcsTaskDefinitionVolumeEfsVolumeConfiguration.class)));
            this.hostPath = software.amazon.jsii.Kernel.get(this, "hostPath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String name, final java.util.List<? extends imports.aws.EcsTaskDefinitionVolumeDockerVolumeConfiguration> dockerVolumeConfiguration, final java.util.List<? extends imports.aws.EcsTaskDefinitionVolumeEfsVolumeConfiguration> efsVolumeConfiguration, final java.lang.String hostPath) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.dockerVolumeConfiguration = (java.util.List<imports.aws.EcsTaskDefinitionVolumeDockerVolumeConfiguration>)dockerVolumeConfiguration;
            this.efsVolumeConfiguration = (java.util.List<imports.aws.EcsTaskDefinitionVolumeEfsVolumeConfiguration>)efsVolumeConfiguration;
            this.hostPath = hostPath;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.util.List<imports.aws.EcsTaskDefinitionVolumeDockerVolumeConfiguration> getDockerVolumeConfiguration() {
            return this.dockerVolumeConfiguration;
        }

        @Override
        public final java.util.List<imports.aws.EcsTaskDefinitionVolumeEfsVolumeConfiguration> getEfsVolumeConfiguration() {
            return this.efsVolumeConfiguration;
        }

        @Override
        public final java.lang.String getHostPath() {
            return this.hostPath;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("name", om.valueToTree(this.getName()));
            if (this.getDockerVolumeConfiguration() != null) {
                data.set("dockerVolumeConfiguration", om.valueToTree(this.getDockerVolumeConfiguration()));
            }
            if (this.getEfsVolumeConfiguration() != null) {
                data.set("efsVolumeConfiguration", om.valueToTree(this.getEfsVolumeConfiguration()));
            }
            if (this.getHostPath() != null) {
                data.set("hostPath", om.valueToTree(this.getHostPath()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.EcsTaskDefinitionVolume"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EcsTaskDefinitionVolume.Jsii$Proxy that = (EcsTaskDefinitionVolume.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (this.dockerVolumeConfiguration != null ? !this.dockerVolumeConfiguration.equals(that.dockerVolumeConfiguration) : that.dockerVolumeConfiguration != null) return false;
            if (this.efsVolumeConfiguration != null ? !this.efsVolumeConfiguration.equals(that.efsVolumeConfiguration) : that.efsVolumeConfiguration != null) return false;
            return this.hostPath != null ? this.hostPath.equals(that.hostPath) : that.hostPath == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.dockerVolumeConfiguration != null ? this.dockerVolumeConfiguration.hashCode() : 0);
            result = 31 * result + (this.efsVolumeConfiguration != null ? this.efsVolumeConfiguration.hashCode() : 0);
            result = 31 * result + (this.hostPath != null ? this.hostPath.hashCode() : 0);
            return result;
        }
    }
}
