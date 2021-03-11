package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.732Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.NetworkInterfaceConfig")
@software.amazon.jsii.Jsii.Proxy(NetworkInterfaceConfig.Jsii$Proxy.class)
public interface NetworkInterfaceConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getSubnetId();

    /**
     * attachment block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.NetworkInterfaceAttachment> getAttachment() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPrivateIp() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getPrivateIps() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getPrivateIpsCount() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSecurityGroups() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getSourceDestCheck() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link NetworkInterfaceConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link NetworkInterfaceConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<NetworkInterfaceConfig> {
        private java.lang.String subnetId;
        private java.util.List<imports.aws.NetworkInterfaceAttachment> attachment;
        private java.lang.String description;
        private java.lang.String privateIp;
        private java.util.List<java.lang.String> privateIps;
        private java.lang.Number privateIpsCount;
        private java.util.List<java.lang.String> securityGroups;
        private java.lang.Boolean sourceDestCheck;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link NetworkInterfaceConfig#getSubnetId}
         * @param subnetId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder subnetId(java.lang.String subnetId) {
            this.subnetId = subnetId;
            return this;
        }

        /**
         * Sets the value of {@link NetworkInterfaceConfig#getAttachment}
         * @param attachment attachment block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder attachment(java.util.List<? extends imports.aws.NetworkInterfaceAttachment> attachment) {
            this.attachment = (java.util.List<imports.aws.NetworkInterfaceAttachment>)attachment;
            return this;
        }

        /**
         * Sets the value of {@link NetworkInterfaceConfig#getDescription}
         * @param description the value to be set.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link NetworkInterfaceConfig#getPrivateIp}
         * @param privateIp the value to be set.
         * @return {@code this}
         */
        public Builder privateIp(java.lang.String privateIp) {
            this.privateIp = privateIp;
            return this;
        }

        /**
         * Sets the value of {@link NetworkInterfaceConfig#getPrivateIps}
         * @param privateIps the value to be set.
         * @return {@code this}
         */
        public Builder privateIps(java.util.List<java.lang.String> privateIps) {
            this.privateIps = privateIps;
            return this;
        }

        /**
         * Sets the value of {@link NetworkInterfaceConfig#getPrivateIpsCount}
         * @param privateIpsCount the value to be set.
         * @return {@code this}
         */
        public Builder privateIpsCount(java.lang.Number privateIpsCount) {
            this.privateIpsCount = privateIpsCount;
            return this;
        }

        /**
         * Sets the value of {@link NetworkInterfaceConfig#getSecurityGroups}
         * @param securityGroups the value to be set.
         * @return {@code this}
         */
        public Builder securityGroups(java.util.List<java.lang.String> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }

        /**
         * Sets the value of {@link NetworkInterfaceConfig#getSourceDestCheck}
         * @param sourceDestCheck the value to be set.
         * @return {@code this}
         */
        public Builder sourceDestCheck(java.lang.Boolean sourceDestCheck) {
            this.sourceDestCheck = sourceDestCheck;
            return this;
        }

        /**
         * Sets the value of {@link NetworkInterfaceConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link NetworkInterfaceConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link NetworkInterfaceConfig#getDependsOn}
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
         * Sets the value of {@link NetworkInterfaceConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link NetworkInterfaceConfig#getProvider}
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
         * @return a new instance of {@link NetworkInterfaceConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public NetworkInterfaceConfig build() {
            return new Jsii$Proxy(subnetId, attachment, description, privateIp, privateIps, privateIpsCount, securityGroups, sourceDestCheck, tags, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link NetworkInterfaceConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements NetworkInterfaceConfig {
        private final java.lang.String subnetId;
        private final java.util.List<imports.aws.NetworkInterfaceAttachment> attachment;
        private final java.lang.String description;
        private final java.lang.String privateIp;
        private final java.util.List<java.lang.String> privateIps;
        private final java.lang.Number privateIpsCount;
        private final java.util.List<java.lang.String> securityGroups;
        private final java.lang.Boolean sourceDestCheck;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
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
            this.subnetId = software.amazon.jsii.Kernel.get(this, "subnetId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.attachment = software.amazon.jsii.Kernel.get(this, "attachment", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.NetworkInterfaceAttachment.class)));
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.privateIp = software.amazon.jsii.Kernel.get(this, "privateIp", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.privateIps = software.amazon.jsii.Kernel.get(this, "privateIps", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.privateIpsCount = software.amazon.jsii.Kernel.get(this, "privateIpsCount", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.securityGroups = software.amazon.jsii.Kernel.get(this, "securityGroups", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.sourceDestCheck = software.amazon.jsii.Kernel.get(this, "sourceDestCheck", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String subnetId, final java.util.List<? extends imports.aws.NetworkInterfaceAttachment> attachment, final java.lang.String description, final java.lang.String privateIp, final java.util.List<java.lang.String> privateIps, final java.lang.Number privateIpsCount, final java.util.List<java.lang.String> securityGroups, final java.lang.Boolean sourceDestCheck, final java.util.Map<java.lang.String, java.lang.String> tags, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.subnetId = java.util.Objects.requireNonNull(subnetId, "subnetId is required");
            this.attachment = (java.util.List<imports.aws.NetworkInterfaceAttachment>)attachment;
            this.description = description;
            this.privateIp = privateIp;
            this.privateIps = privateIps;
            this.privateIpsCount = privateIpsCount;
            this.securityGroups = securityGroups;
            this.sourceDestCheck = sourceDestCheck;
            this.tags = tags;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getSubnetId() {
            return this.subnetId;
        }

        @Override
        public final java.util.List<imports.aws.NetworkInterfaceAttachment> getAttachment() {
            return this.attachment;
        }

        @Override
        public final java.lang.String getDescription() {
            return this.description;
        }

        @Override
        public final java.lang.String getPrivateIp() {
            return this.privateIp;
        }

        @Override
        public final java.util.List<java.lang.String> getPrivateIps() {
            return this.privateIps;
        }

        @Override
        public final java.lang.Number getPrivateIpsCount() {
            return this.privateIpsCount;
        }

        @Override
        public final java.util.List<java.lang.String> getSecurityGroups() {
            return this.securityGroups;
        }

        @Override
        public final java.lang.Boolean getSourceDestCheck() {
            return this.sourceDestCheck;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
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

            data.set("subnetId", om.valueToTree(this.getSubnetId()));
            if (this.getAttachment() != null) {
                data.set("attachment", om.valueToTree(this.getAttachment()));
            }
            if (this.getDescription() != null) {
                data.set("description", om.valueToTree(this.getDescription()));
            }
            if (this.getPrivateIp() != null) {
                data.set("privateIp", om.valueToTree(this.getPrivateIp()));
            }
            if (this.getPrivateIps() != null) {
                data.set("privateIps", om.valueToTree(this.getPrivateIps()));
            }
            if (this.getPrivateIpsCount() != null) {
                data.set("privateIpsCount", om.valueToTree(this.getPrivateIpsCount()));
            }
            if (this.getSecurityGroups() != null) {
                data.set("securityGroups", om.valueToTree(this.getSecurityGroups()));
            }
            if (this.getSourceDestCheck() != null) {
                data.set("sourceDestCheck", om.valueToTree(this.getSourceDestCheck()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
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
            struct.set("fqn", om.valueToTree("aws.NetworkInterfaceConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            NetworkInterfaceConfig.Jsii$Proxy that = (NetworkInterfaceConfig.Jsii$Proxy) o;

            if (!subnetId.equals(that.subnetId)) return false;
            if (this.attachment != null ? !this.attachment.equals(that.attachment) : that.attachment != null) return false;
            if (this.description != null ? !this.description.equals(that.description) : that.description != null) return false;
            if (this.privateIp != null ? !this.privateIp.equals(that.privateIp) : that.privateIp != null) return false;
            if (this.privateIps != null ? !this.privateIps.equals(that.privateIps) : that.privateIps != null) return false;
            if (this.privateIpsCount != null ? !this.privateIpsCount.equals(that.privateIpsCount) : that.privateIpsCount != null) return false;
            if (this.securityGroups != null ? !this.securityGroups.equals(that.securityGroups) : that.securityGroups != null) return false;
            if (this.sourceDestCheck != null ? !this.sourceDestCheck.equals(that.sourceDestCheck) : that.sourceDestCheck != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.subnetId.hashCode();
            result = 31 * result + (this.attachment != null ? this.attachment.hashCode() : 0);
            result = 31 * result + (this.description != null ? this.description.hashCode() : 0);
            result = 31 * result + (this.privateIp != null ? this.privateIp.hashCode() : 0);
            result = 31 * result + (this.privateIps != null ? this.privateIps.hashCode() : 0);
            result = 31 * result + (this.privateIpsCount != null ? this.privateIpsCount.hashCode() : 0);
            result = 31 * result + (this.securityGroups != null ? this.securityGroups.hashCode() : 0);
            result = 31 * result + (this.sourceDestCheck != null ? this.sourceDestCheck.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
