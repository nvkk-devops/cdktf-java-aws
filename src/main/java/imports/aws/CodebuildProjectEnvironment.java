package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.167Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CodebuildProjectEnvironment")
@software.amazon.jsii.Jsii.Proxy(CodebuildProjectEnvironment.Jsii$Proxy.class)
public interface CodebuildProjectEnvironment extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getComputeType();

    @org.jetbrains.annotations.NotNull java.lang.String getImage();

    @org.jetbrains.annotations.NotNull java.lang.String getType();

    default @org.jetbrains.annotations.Nullable java.lang.String getCertificate() {
        return null;
    }

    /**
     * environment_variable block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CodebuildProjectEnvironmentEnvironmentVariable> getEnvironmentVariable() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getImagePullCredentialsType() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getPrivilegedMode() {
        return null;
    }

    /**
     * registry_credential block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CodebuildProjectEnvironmentRegistryCredential> getRegistryCredential() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CodebuildProjectEnvironment}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CodebuildProjectEnvironment}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CodebuildProjectEnvironment> {
        private java.lang.String computeType;
        private java.lang.String image;
        private java.lang.String type;
        private java.lang.String certificate;
        private java.util.List<imports.aws.CodebuildProjectEnvironmentEnvironmentVariable> environmentVariable;
        private java.lang.String imagePullCredentialsType;
        private java.lang.Boolean privilegedMode;
        private java.util.List<imports.aws.CodebuildProjectEnvironmentRegistryCredential> registryCredential;

        /**
         * Sets the value of {@link CodebuildProjectEnvironment#getComputeType}
         * @param computeType the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder computeType(java.lang.String computeType) {
            this.computeType = computeType;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildProjectEnvironment#getImage}
         * @param image the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder image(java.lang.String image) {
            this.image = image;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildProjectEnvironment#getType}
         * @param type the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildProjectEnvironment#getCertificate}
         * @param certificate the value to be set.
         * @return {@code this}
         */
        public Builder certificate(java.lang.String certificate) {
            this.certificate = certificate;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildProjectEnvironment#getEnvironmentVariable}
         * @param environmentVariable environment_variable block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder environmentVariable(java.util.List<? extends imports.aws.CodebuildProjectEnvironmentEnvironmentVariable> environmentVariable) {
            this.environmentVariable = (java.util.List<imports.aws.CodebuildProjectEnvironmentEnvironmentVariable>)environmentVariable;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildProjectEnvironment#getImagePullCredentialsType}
         * @param imagePullCredentialsType the value to be set.
         * @return {@code this}
         */
        public Builder imagePullCredentialsType(java.lang.String imagePullCredentialsType) {
            this.imagePullCredentialsType = imagePullCredentialsType;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildProjectEnvironment#getPrivilegedMode}
         * @param privilegedMode the value to be set.
         * @return {@code this}
         */
        public Builder privilegedMode(java.lang.Boolean privilegedMode) {
            this.privilegedMode = privilegedMode;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildProjectEnvironment#getRegistryCredential}
         * @param registryCredential registry_credential block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder registryCredential(java.util.List<? extends imports.aws.CodebuildProjectEnvironmentRegistryCredential> registryCredential) {
            this.registryCredential = (java.util.List<imports.aws.CodebuildProjectEnvironmentRegistryCredential>)registryCredential;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CodebuildProjectEnvironment}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CodebuildProjectEnvironment build() {
            return new Jsii$Proxy(computeType, image, type, certificate, environmentVariable, imagePullCredentialsType, privilegedMode, registryCredential);
        }
    }

    /**
     * An implementation for {@link CodebuildProjectEnvironment}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CodebuildProjectEnvironment {
        private final java.lang.String computeType;
        private final java.lang.String image;
        private final java.lang.String type;
        private final java.lang.String certificate;
        private final java.util.List<imports.aws.CodebuildProjectEnvironmentEnvironmentVariable> environmentVariable;
        private final java.lang.String imagePullCredentialsType;
        private final java.lang.Boolean privilegedMode;
        private final java.util.List<imports.aws.CodebuildProjectEnvironmentRegistryCredential> registryCredential;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.computeType = software.amazon.jsii.Kernel.get(this, "computeType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.image = software.amazon.jsii.Kernel.get(this, "image", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.certificate = software.amazon.jsii.Kernel.get(this, "certificate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.environmentVariable = software.amazon.jsii.Kernel.get(this, "environmentVariable", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodebuildProjectEnvironmentEnvironmentVariable.class)));
            this.imagePullCredentialsType = software.amazon.jsii.Kernel.get(this, "imagePullCredentialsType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.privilegedMode = software.amazon.jsii.Kernel.get(this, "privilegedMode", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.registryCredential = software.amazon.jsii.Kernel.get(this, "registryCredential", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodebuildProjectEnvironmentRegistryCredential.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String computeType, final java.lang.String image, final java.lang.String type, final java.lang.String certificate, final java.util.List<? extends imports.aws.CodebuildProjectEnvironmentEnvironmentVariable> environmentVariable, final java.lang.String imagePullCredentialsType, final java.lang.Boolean privilegedMode, final java.util.List<? extends imports.aws.CodebuildProjectEnvironmentRegistryCredential> registryCredential) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.computeType = java.util.Objects.requireNonNull(computeType, "computeType is required");
            this.image = java.util.Objects.requireNonNull(image, "image is required");
            this.type = java.util.Objects.requireNonNull(type, "type is required");
            this.certificate = certificate;
            this.environmentVariable = (java.util.List<imports.aws.CodebuildProjectEnvironmentEnvironmentVariable>)environmentVariable;
            this.imagePullCredentialsType = imagePullCredentialsType;
            this.privilegedMode = privilegedMode;
            this.registryCredential = (java.util.List<imports.aws.CodebuildProjectEnvironmentRegistryCredential>)registryCredential;
        }

        @Override
        public final java.lang.String getComputeType() {
            return this.computeType;
        }

        @Override
        public final java.lang.String getImage() {
            return this.image;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        public final java.lang.String getCertificate() {
            return this.certificate;
        }

        @Override
        public final java.util.List<imports.aws.CodebuildProjectEnvironmentEnvironmentVariable> getEnvironmentVariable() {
            return this.environmentVariable;
        }

        @Override
        public final java.lang.String getImagePullCredentialsType() {
            return this.imagePullCredentialsType;
        }

        @Override
        public final java.lang.Boolean getPrivilegedMode() {
            return this.privilegedMode;
        }

        @Override
        public final java.util.List<imports.aws.CodebuildProjectEnvironmentRegistryCredential> getRegistryCredential() {
            return this.registryCredential;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("computeType", om.valueToTree(this.getComputeType()));
            data.set("image", om.valueToTree(this.getImage()));
            data.set("type", om.valueToTree(this.getType()));
            if (this.getCertificate() != null) {
                data.set("certificate", om.valueToTree(this.getCertificate()));
            }
            if (this.getEnvironmentVariable() != null) {
                data.set("environmentVariable", om.valueToTree(this.getEnvironmentVariable()));
            }
            if (this.getImagePullCredentialsType() != null) {
                data.set("imagePullCredentialsType", om.valueToTree(this.getImagePullCredentialsType()));
            }
            if (this.getPrivilegedMode() != null) {
                data.set("privilegedMode", om.valueToTree(this.getPrivilegedMode()));
            }
            if (this.getRegistryCredential() != null) {
                data.set("registryCredential", om.valueToTree(this.getRegistryCredential()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.CodebuildProjectEnvironment"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CodebuildProjectEnvironment.Jsii$Proxy that = (CodebuildProjectEnvironment.Jsii$Proxy) o;

            if (!computeType.equals(that.computeType)) return false;
            if (!image.equals(that.image)) return false;
            if (!type.equals(that.type)) return false;
            if (this.certificate != null ? !this.certificate.equals(that.certificate) : that.certificate != null) return false;
            if (this.environmentVariable != null ? !this.environmentVariable.equals(that.environmentVariable) : that.environmentVariable != null) return false;
            if (this.imagePullCredentialsType != null ? !this.imagePullCredentialsType.equals(that.imagePullCredentialsType) : that.imagePullCredentialsType != null) return false;
            if (this.privilegedMode != null ? !this.privilegedMode.equals(that.privilegedMode) : that.privilegedMode != null) return false;
            return this.registryCredential != null ? this.registryCredential.equals(that.registryCredential) : that.registryCredential == null;
        }

        @Override
        public final int hashCode() {
            int result = this.computeType.hashCode();
            result = 31 * result + (this.image.hashCode());
            result = 31 * result + (this.type.hashCode());
            result = 31 * result + (this.certificate != null ? this.certificate.hashCode() : 0);
            result = 31 * result + (this.environmentVariable != null ? this.environmentVariable.hashCode() : 0);
            result = 31 * result + (this.imagePullCredentialsType != null ? this.imagePullCredentialsType.hashCode() : 0);
            result = 31 * result + (this.privilegedMode != null ? this.privilegedMode.hashCode() : 0);
            result = 31 * result + (this.registryCredential != null ? this.registryCredential.hashCode() : 0);
            return result;
        }
    }
}
