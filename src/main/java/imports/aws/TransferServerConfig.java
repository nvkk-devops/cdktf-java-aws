package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.913Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.TransferServerConfig")
@software.amazon.jsii.Jsii.Proxy(TransferServerConfig.Jsii$Proxy.class)
public interface TransferServerConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * endpoint_details block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.TransferServerEndpointDetails> getEndpointDetails() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getEndpointType() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getForceDestroy() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getHostKey() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getIdentityProviderType() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getInvocationRole() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getLoggingRole() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getUrl() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link TransferServerConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link TransferServerConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<TransferServerConfig> {
        private java.util.List<imports.aws.TransferServerEndpointDetails> endpointDetails;
        private java.lang.String endpointType;
        private java.lang.Boolean forceDestroy;
        private java.lang.String hostKey;
        private java.lang.String identityProviderType;
        private java.lang.String invocationRole;
        private java.lang.String loggingRole;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.lang.String url;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link TransferServerConfig#getEndpointDetails}
         * @param endpointDetails endpoint_details block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder endpointDetails(java.util.List<? extends imports.aws.TransferServerEndpointDetails> endpointDetails) {
            this.endpointDetails = (java.util.List<imports.aws.TransferServerEndpointDetails>)endpointDetails;
            return this;
        }

        /**
         * Sets the value of {@link TransferServerConfig#getEndpointType}
         * @param endpointType the value to be set.
         * @return {@code this}
         */
        public Builder endpointType(java.lang.String endpointType) {
            this.endpointType = endpointType;
            return this;
        }

        /**
         * Sets the value of {@link TransferServerConfig#getForceDestroy}
         * @param forceDestroy the value to be set.
         * @return {@code this}
         */
        public Builder forceDestroy(java.lang.Boolean forceDestroy) {
            this.forceDestroy = forceDestroy;
            return this;
        }

        /**
         * Sets the value of {@link TransferServerConfig#getHostKey}
         * @param hostKey the value to be set.
         * @return {@code this}
         */
        public Builder hostKey(java.lang.String hostKey) {
            this.hostKey = hostKey;
            return this;
        }

        /**
         * Sets the value of {@link TransferServerConfig#getIdentityProviderType}
         * @param identityProviderType the value to be set.
         * @return {@code this}
         */
        public Builder identityProviderType(java.lang.String identityProviderType) {
            this.identityProviderType = identityProviderType;
            return this;
        }

        /**
         * Sets the value of {@link TransferServerConfig#getInvocationRole}
         * @param invocationRole the value to be set.
         * @return {@code this}
         */
        public Builder invocationRole(java.lang.String invocationRole) {
            this.invocationRole = invocationRole;
            return this;
        }

        /**
         * Sets the value of {@link TransferServerConfig#getLoggingRole}
         * @param loggingRole the value to be set.
         * @return {@code this}
         */
        public Builder loggingRole(java.lang.String loggingRole) {
            this.loggingRole = loggingRole;
            return this;
        }

        /**
         * Sets the value of {@link TransferServerConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link TransferServerConfig#getUrl}
         * @param url the value to be set.
         * @return {@code this}
         */
        public Builder url(java.lang.String url) {
            this.url = url;
            return this;
        }

        /**
         * Sets the value of {@link TransferServerConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link TransferServerConfig#getDependsOn}
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
         * Sets the value of {@link TransferServerConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link TransferServerConfig#getProvider}
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
         * @return a new instance of {@link TransferServerConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public TransferServerConfig build() {
            return new Jsii$Proxy(endpointDetails, endpointType, forceDestroy, hostKey, identityProviderType, invocationRole, loggingRole, tags, url, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link TransferServerConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements TransferServerConfig {
        private final java.util.List<imports.aws.TransferServerEndpointDetails> endpointDetails;
        private final java.lang.String endpointType;
        private final java.lang.Boolean forceDestroy;
        private final java.lang.String hostKey;
        private final java.lang.String identityProviderType;
        private final java.lang.String invocationRole;
        private final java.lang.String loggingRole;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.lang.String url;
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
            this.endpointDetails = software.amazon.jsii.Kernel.get(this, "endpointDetails", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.TransferServerEndpointDetails.class)));
            this.endpointType = software.amazon.jsii.Kernel.get(this, "endpointType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.forceDestroy = software.amazon.jsii.Kernel.get(this, "forceDestroy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.hostKey = software.amazon.jsii.Kernel.get(this, "hostKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.identityProviderType = software.amazon.jsii.Kernel.get(this, "identityProviderType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.invocationRole = software.amazon.jsii.Kernel.get(this, "invocationRole", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.loggingRole = software.amazon.jsii.Kernel.get(this, "loggingRole", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.url = software.amazon.jsii.Kernel.get(this, "url", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.TransferServerEndpointDetails> endpointDetails, final java.lang.String endpointType, final java.lang.Boolean forceDestroy, final java.lang.String hostKey, final java.lang.String identityProviderType, final java.lang.String invocationRole, final java.lang.String loggingRole, final java.util.Map<java.lang.String, java.lang.String> tags, final java.lang.String url, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.endpointDetails = (java.util.List<imports.aws.TransferServerEndpointDetails>)endpointDetails;
            this.endpointType = endpointType;
            this.forceDestroy = forceDestroy;
            this.hostKey = hostKey;
            this.identityProviderType = identityProviderType;
            this.invocationRole = invocationRole;
            this.loggingRole = loggingRole;
            this.tags = tags;
            this.url = url;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.util.List<imports.aws.TransferServerEndpointDetails> getEndpointDetails() {
            return this.endpointDetails;
        }

        @Override
        public final java.lang.String getEndpointType() {
            return this.endpointType;
        }

        @Override
        public final java.lang.Boolean getForceDestroy() {
            return this.forceDestroy;
        }

        @Override
        public final java.lang.String getHostKey() {
            return this.hostKey;
        }

        @Override
        public final java.lang.String getIdentityProviderType() {
            return this.identityProviderType;
        }

        @Override
        public final java.lang.String getInvocationRole() {
            return this.invocationRole;
        }

        @Override
        public final java.lang.String getLoggingRole() {
            return this.loggingRole;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.lang.String getUrl() {
            return this.url;
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

            if (this.getEndpointDetails() != null) {
                data.set("endpointDetails", om.valueToTree(this.getEndpointDetails()));
            }
            if (this.getEndpointType() != null) {
                data.set("endpointType", om.valueToTree(this.getEndpointType()));
            }
            if (this.getForceDestroy() != null) {
                data.set("forceDestroy", om.valueToTree(this.getForceDestroy()));
            }
            if (this.getHostKey() != null) {
                data.set("hostKey", om.valueToTree(this.getHostKey()));
            }
            if (this.getIdentityProviderType() != null) {
                data.set("identityProviderType", om.valueToTree(this.getIdentityProviderType()));
            }
            if (this.getInvocationRole() != null) {
                data.set("invocationRole", om.valueToTree(this.getInvocationRole()));
            }
            if (this.getLoggingRole() != null) {
                data.set("loggingRole", om.valueToTree(this.getLoggingRole()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getUrl() != null) {
                data.set("url", om.valueToTree(this.getUrl()));
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
            struct.set("fqn", om.valueToTree("aws.TransferServerConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            TransferServerConfig.Jsii$Proxy that = (TransferServerConfig.Jsii$Proxy) o;

            if (this.endpointDetails != null ? !this.endpointDetails.equals(that.endpointDetails) : that.endpointDetails != null) return false;
            if (this.endpointType != null ? !this.endpointType.equals(that.endpointType) : that.endpointType != null) return false;
            if (this.forceDestroy != null ? !this.forceDestroy.equals(that.forceDestroy) : that.forceDestroy != null) return false;
            if (this.hostKey != null ? !this.hostKey.equals(that.hostKey) : that.hostKey != null) return false;
            if (this.identityProviderType != null ? !this.identityProviderType.equals(that.identityProviderType) : that.identityProviderType != null) return false;
            if (this.invocationRole != null ? !this.invocationRole.equals(that.invocationRole) : that.invocationRole != null) return false;
            if (this.loggingRole != null ? !this.loggingRole.equals(that.loggingRole) : that.loggingRole != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.url != null ? !this.url.equals(that.url) : that.url != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.endpointDetails != null ? this.endpointDetails.hashCode() : 0;
            result = 31 * result + (this.endpointType != null ? this.endpointType.hashCode() : 0);
            result = 31 * result + (this.forceDestroy != null ? this.forceDestroy.hashCode() : 0);
            result = 31 * result + (this.hostKey != null ? this.hostKey.hashCode() : 0);
            result = 31 * result + (this.identityProviderType != null ? this.identityProviderType.hashCode() : 0);
            result = 31 * result + (this.invocationRole != null ? this.invocationRole.hashCode() : 0);
            result = 31 * result + (this.loggingRole != null ? this.loggingRole.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.url != null ? this.url.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
