package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.374Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.DataAwsStoragegatewayLocalDiskConfig")
@software.amazon.jsii.Jsii.Proxy(DataAwsStoragegatewayLocalDiskConfig.Jsii$Proxy.class)
public interface DataAwsStoragegatewayLocalDiskConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getGatewayArn();

    default @org.jetbrains.annotations.Nullable java.lang.String getDiskNode() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDiskPath() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DataAwsStoragegatewayLocalDiskConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DataAwsStoragegatewayLocalDiskConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DataAwsStoragegatewayLocalDiskConfig> {
        private java.lang.String gatewayArn;
        private java.lang.String diskNode;
        private java.lang.String diskPath;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link DataAwsStoragegatewayLocalDiskConfig#getGatewayArn}
         * @param gatewayArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder gatewayArn(java.lang.String gatewayArn) {
            this.gatewayArn = gatewayArn;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsStoragegatewayLocalDiskConfig#getDiskNode}
         * @param diskNode the value to be set.
         * @return {@code this}
         */
        public Builder diskNode(java.lang.String diskNode) {
            this.diskNode = diskNode;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsStoragegatewayLocalDiskConfig#getDiskPath}
         * @param diskPath the value to be set.
         * @return {@code this}
         */
        public Builder diskPath(java.lang.String diskPath) {
            this.diskPath = diskPath;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsStoragegatewayLocalDiskConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsStoragegatewayLocalDiskConfig#getDependsOn}
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
         * Sets the value of {@link DataAwsStoragegatewayLocalDiskConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsStoragegatewayLocalDiskConfig#getProvider}
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
         * @return a new instance of {@link DataAwsStoragegatewayLocalDiskConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DataAwsStoragegatewayLocalDiskConfig build() {
            return new Jsii$Proxy(gatewayArn, diskNode, diskPath, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link DataAwsStoragegatewayLocalDiskConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DataAwsStoragegatewayLocalDiskConfig {
        private final java.lang.String gatewayArn;
        private final java.lang.String diskNode;
        private final java.lang.String diskPath;
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
            this.gatewayArn = software.amazon.jsii.Kernel.get(this, "gatewayArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.diskNode = software.amazon.jsii.Kernel.get(this, "diskNode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.diskPath = software.amazon.jsii.Kernel.get(this, "diskPath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String gatewayArn, final java.lang.String diskNode, final java.lang.String diskPath, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.gatewayArn = java.util.Objects.requireNonNull(gatewayArn, "gatewayArn is required");
            this.diskNode = diskNode;
            this.diskPath = diskPath;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getGatewayArn() {
            return this.gatewayArn;
        }

        @Override
        public final java.lang.String getDiskNode() {
            return this.diskNode;
        }

        @Override
        public final java.lang.String getDiskPath() {
            return this.diskPath;
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

            data.set("gatewayArn", om.valueToTree(this.getGatewayArn()));
            if (this.getDiskNode() != null) {
                data.set("diskNode", om.valueToTree(this.getDiskNode()));
            }
            if (this.getDiskPath() != null) {
                data.set("diskPath", om.valueToTree(this.getDiskPath()));
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
            struct.set("fqn", om.valueToTree("aws.DataAwsStoragegatewayLocalDiskConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DataAwsStoragegatewayLocalDiskConfig.Jsii$Proxy that = (DataAwsStoragegatewayLocalDiskConfig.Jsii$Proxy) o;

            if (!gatewayArn.equals(that.gatewayArn)) return false;
            if (this.diskNode != null ? !this.diskNode.equals(that.diskNode) : that.diskNode != null) return false;
            if (this.diskPath != null ? !this.diskPath.equals(that.diskPath) : that.diskPath != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.gatewayArn.hashCode();
            result = 31 * result + (this.diskNode != null ? this.diskNode.hashCode() : 0);
            result = 31 * result + (this.diskPath != null ? this.diskPath.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
