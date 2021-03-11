package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.286Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.DataAwsEcrImageConfig")
@software.amazon.jsii.Jsii.Proxy(DataAwsEcrImageConfig.Jsii$Proxy.class)
public interface DataAwsEcrImageConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getRepositoryName();

    default @org.jetbrains.annotations.Nullable java.lang.String getImageDigest() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getImageTag() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getRegistryId() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DataAwsEcrImageConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DataAwsEcrImageConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DataAwsEcrImageConfig> {
        private java.lang.String repositoryName;
        private java.lang.String imageDigest;
        private java.lang.String imageTag;
        private java.lang.String registryId;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link DataAwsEcrImageConfig#getRepositoryName}
         * @param repositoryName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder repositoryName(java.lang.String repositoryName) {
            this.repositoryName = repositoryName;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsEcrImageConfig#getImageDigest}
         * @param imageDigest the value to be set.
         * @return {@code this}
         */
        public Builder imageDigest(java.lang.String imageDigest) {
            this.imageDigest = imageDigest;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsEcrImageConfig#getImageTag}
         * @param imageTag the value to be set.
         * @return {@code this}
         */
        public Builder imageTag(java.lang.String imageTag) {
            this.imageTag = imageTag;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsEcrImageConfig#getRegistryId}
         * @param registryId the value to be set.
         * @return {@code this}
         */
        public Builder registryId(java.lang.String registryId) {
            this.registryId = registryId;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsEcrImageConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsEcrImageConfig#getDependsOn}
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
         * Sets the value of {@link DataAwsEcrImageConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsEcrImageConfig#getProvider}
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
         * @return a new instance of {@link DataAwsEcrImageConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DataAwsEcrImageConfig build() {
            return new Jsii$Proxy(repositoryName, imageDigest, imageTag, registryId, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link DataAwsEcrImageConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DataAwsEcrImageConfig {
        private final java.lang.String repositoryName;
        private final java.lang.String imageDigest;
        private final java.lang.String imageTag;
        private final java.lang.String registryId;
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
            this.repositoryName = software.amazon.jsii.Kernel.get(this, "repositoryName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.imageDigest = software.amazon.jsii.Kernel.get(this, "imageDigest", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.imageTag = software.amazon.jsii.Kernel.get(this, "imageTag", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.registryId = software.amazon.jsii.Kernel.get(this, "registryId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String repositoryName, final java.lang.String imageDigest, final java.lang.String imageTag, final java.lang.String registryId, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.repositoryName = java.util.Objects.requireNonNull(repositoryName, "repositoryName is required");
            this.imageDigest = imageDigest;
            this.imageTag = imageTag;
            this.registryId = registryId;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getRepositoryName() {
            return this.repositoryName;
        }

        @Override
        public final java.lang.String getImageDigest() {
            return this.imageDigest;
        }

        @Override
        public final java.lang.String getImageTag() {
            return this.imageTag;
        }

        @Override
        public final java.lang.String getRegistryId() {
            return this.registryId;
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

            data.set("repositoryName", om.valueToTree(this.getRepositoryName()));
            if (this.getImageDigest() != null) {
                data.set("imageDigest", om.valueToTree(this.getImageDigest()));
            }
            if (this.getImageTag() != null) {
                data.set("imageTag", om.valueToTree(this.getImageTag()));
            }
            if (this.getRegistryId() != null) {
                data.set("registryId", om.valueToTree(this.getRegistryId()));
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
            struct.set("fqn", om.valueToTree("aws.DataAwsEcrImageConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DataAwsEcrImageConfig.Jsii$Proxy that = (DataAwsEcrImageConfig.Jsii$Proxy) o;

            if (!repositoryName.equals(that.repositoryName)) return false;
            if (this.imageDigest != null ? !this.imageDigest.equals(that.imageDigest) : that.imageDigest != null) return false;
            if (this.imageTag != null ? !this.imageTag.equals(that.imageTag) : that.imageTag != null) return false;
            if (this.registryId != null ? !this.registryId.equals(that.registryId) : that.registryId != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.repositoryName.hashCode();
            result = 31 * result + (this.imageDigest != null ? this.imageDigest.hashCode() : 0);
            result = 31 * result + (this.imageTag != null ? this.imageTag.hashCode() : 0);
            result = 31 * result + (this.registryId != null ? this.registryId.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
