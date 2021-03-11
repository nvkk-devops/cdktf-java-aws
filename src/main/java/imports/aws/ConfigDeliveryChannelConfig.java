package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.205Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.ConfigDeliveryChannelConfig")
@software.amazon.jsii.Jsii.Proxy(ConfigDeliveryChannelConfig.Jsii$Proxy.class)
public interface ConfigDeliveryChannelConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getS3BucketName();

    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getS3KeyPrefix() {
        return null;
    }

    /**
     * snapshot_delivery_properties block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ConfigDeliveryChannelSnapshotDeliveryProperties> getSnapshotDeliveryProperties() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSnsTopicArn() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ConfigDeliveryChannelConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ConfigDeliveryChannelConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ConfigDeliveryChannelConfig> {
        private java.lang.String s3BucketName;
        private java.lang.String name;
        private java.lang.String s3KeyPrefix;
        private java.util.List<imports.aws.ConfigDeliveryChannelSnapshotDeliveryProperties> snapshotDeliveryProperties;
        private java.lang.String snsTopicArn;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link ConfigDeliveryChannelConfig#getS3BucketName}
         * @param s3BucketName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder s3BucketName(java.lang.String s3BucketName) {
            this.s3BucketName = s3BucketName;
            return this;
        }

        /**
         * Sets the value of {@link ConfigDeliveryChannelConfig#getName}
         * @param name the value to be set.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link ConfigDeliveryChannelConfig#getS3KeyPrefix}
         * @param s3KeyPrefix the value to be set.
         * @return {@code this}
         */
        public Builder s3KeyPrefix(java.lang.String s3KeyPrefix) {
            this.s3KeyPrefix = s3KeyPrefix;
            return this;
        }

        /**
         * Sets the value of {@link ConfigDeliveryChannelConfig#getSnapshotDeliveryProperties}
         * @param snapshotDeliveryProperties snapshot_delivery_properties block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder snapshotDeliveryProperties(java.util.List<? extends imports.aws.ConfigDeliveryChannelSnapshotDeliveryProperties> snapshotDeliveryProperties) {
            this.snapshotDeliveryProperties = (java.util.List<imports.aws.ConfigDeliveryChannelSnapshotDeliveryProperties>)snapshotDeliveryProperties;
            return this;
        }

        /**
         * Sets the value of {@link ConfigDeliveryChannelConfig#getSnsTopicArn}
         * @param snsTopicArn the value to be set.
         * @return {@code this}
         */
        public Builder snsTopicArn(java.lang.String snsTopicArn) {
            this.snsTopicArn = snsTopicArn;
            return this;
        }

        /**
         * Sets the value of {@link ConfigDeliveryChannelConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link ConfigDeliveryChannelConfig#getDependsOn}
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
         * Sets the value of {@link ConfigDeliveryChannelConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link ConfigDeliveryChannelConfig#getProvider}
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
         * @return a new instance of {@link ConfigDeliveryChannelConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ConfigDeliveryChannelConfig build() {
            return new Jsii$Proxy(s3BucketName, name, s3KeyPrefix, snapshotDeliveryProperties, snsTopicArn, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link ConfigDeliveryChannelConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ConfigDeliveryChannelConfig {
        private final java.lang.String s3BucketName;
        private final java.lang.String name;
        private final java.lang.String s3KeyPrefix;
        private final java.util.List<imports.aws.ConfigDeliveryChannelSnapshotDeliveryProperties> snapshotDeliveryProperties;
        private final java.lang.String snsTopicArn;
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
            this.s3BucketName = software.amazon.jsii.Kernel.get(this, "s3BucketName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.s3KeyPrefix = software.amazon.jsii.Kernel.get(this, "s3KeyPrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.snapshotDeliveryProperties = software.amazon.jsii.Kernel.get(this, "snapshotDeliveryProperties", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ConfigDeliveryChannelSnapshotDeliveryProperties.class)));
            this.snsTopicArn = software.amazon.jsii.Kernel.get(this, "snsTopicArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String s3BucketName, final java.lang.String name, final java.lang.String s3KeyPrefix, final java.util.List<? extends imports.aws.ConfigDeliveryChannelSnapshotDeliveryProperties> snapshotDeliveryProperties, final java.lang.String snsTopicArn, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.s3BucketName = java.util.Objects.requireNonNull(s3BucketName, "s3BucketName is required");
            this.name = name;
            this.s3KeyPrefix = s3KeyPrefix;
            this.snapshotDeliveryProperties = (java.util.List<imports.aws.ConfigDeliveryChannelSnapshotDeliveryProperties>)snapshotDeliveryProperties;
            this.snsTopicArn = snsTopicArn;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getS3BucketName() {
            return this.s3BucketName;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getS3KeyPrefix() {
            return this.s3KeyPrefix;
        }

        @Override
        public final java.util.List<imports.aws.ConfigDeliveryChannelSnapshotDeliveryProperties> getSnapshotDeliveryProperties() {
            return this.snapshotDeliveryProperties;
        }

        @Override
        public final java.lang.String getSnsTopicArn() {
            return this.snsTopicArn;
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

            data.set("s3BucketName", om.valueToTree(this.getS3BucketName()));
            if (this.getName() != null) {
                data.set("name", om.valueToTree(this.getName()));
            }
            if (this.getS3KeyPrefix() != null) {
                data.set("s3KeyPrefix", om.valueToTree(this.getS3KeyPrefix()));
            }
            if (this.getSnapshotDeliveryProperties() != null) {
                data.set("snapshotDeliveryProperties", om.valueToTree(this.getSnapshotDeliveryProperties()));
            }
            if (this.getSnsTopicArn() != null) {
                data.set("snsTopicArn", om.valueToTree(this.getSnsTopicArn()));
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
            struct.set("fqn", om.valueToTree("aws.ConfigDeliveryChannelConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ConfigDeliveryChannelConfig.Jsii$Proxy that = (ConfigDeliveryChannelConfig.Jsii$Proxy) o;

            if (!s3BucketName.equals(that.s3BucketName)) return false;
            if (this.name != null ? !this.name.equals(that.name) : that.name != null) return false;
            if (this.s3KeyPrefix != null ? !this.s3KeyPrefix.equals(that.s3KeyPrefix) : that.s3KeyPrefix != null) return false;
            if (this.snapshotDeliveryProperties != null ? !this.snapshotDeliveryProperties.equals(that.snapshotDeliveryProperties) : that.snapshotDeliveryProperties != null) return false;
            if (this.snsTopicArn != null ? !this.snsTopicArn.equals(that.snsTopicArn) : that.snsTopicArn != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.s3BucketName.hashCode();
            result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
            result = 31 * result + (this.s3KeyPrefix != null ? this.s3KeyPrefix.hashCode() : 0);
            result = 31 * result + (this.snapshotDeliveryProperties != null ? this.snapshotDeliveryProperties.hashCode() : 0);
            result = 31 * result + (this.snsTopicArn != null ? this.snsTopicArn.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
