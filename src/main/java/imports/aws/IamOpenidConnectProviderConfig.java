package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.614Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.IamOpenidConnectProviderConfig")
@software.amazon.jsii.Jsii.Proxy(IamOpenidConnectProviderConfig.Jsii$Proxy.class)
public interface IamOpenidConnectProviderConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getClientIdList();

    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getThumbprintList();

    @org.jetbrains.annotations.NotNull java.lang.String getUrl();

    /**
     * @return a {@link Builder} of {@link IamOpenidConnectProviderConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link IamOpenidConnectProviderConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<IamOpenidConnectProviderConfig> {
        private java.util.List<java.lang.String> clientIdList;
        private java.util.List<java.lang.String> thumbprintList;
        private java.lang.String url;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link IamOpenidConnectProviderConfig#getClientIdList}
         * @param clientIdList the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder clientIdList(java.util.List<java.lang.String> clientIdList) {
            this.clientIdList = clientIdList;
            return this;
        }

        /**
         * Sets the value of {@link IamOpenidConnectProviderConfig#getThumbprintList}
         * @param thumbprintList the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder thumbprintList(java.util.List<java.lang.String> thumbprintList) {
            this.thumbprintList = thumbprintList;
            return this;
        }

        /**
         * Sets the value of {@link IamOpenidConnectProviderConfig#getUrl}
         * @param url the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder url(java.lang.String url) {
            this.url = url;
            return this;
        }

        /**
         * Sets the value of {@link IamOpenidConnectProviderConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link IamOpenidConnectProviderConfig#getDependsOn}
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
         * Sets the value of {@link IamOpenidConnectProviderConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link IamOpenidConnectProviderConfig#getProvider}
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
         * @return a new instance of {@link IamOpenidConnectProviderConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public IamOpenidConnectProviderConfig build() {
            return new Jsii$Proxy(clientIdList, thumbprintList, url, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link IamOpenidConnectProviderConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements IamOpenidConnectProviderConfig {
        private final java.util.List<java.lang.String> clientIdList;
        private final java.util.List<java.lang.String> thumbprintList;
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
            this.clientIdList = software.amazon.jsii.Kernel.get(this, "clientIdList", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.thumbprintList = software.amazon.jsii.Kernel.get(this, "thumbprintList", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
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
        protected Jsii$Proxy(final java.util.List<java.lang.String> clientIdList, final java.util.List<java.lang.String> thumbprintList, final java.lang.String url, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.clientIdList = java.util.Objects.requireNonNull(clientIdList, "clientIdList is required");
            this.thumbprintList = java.util.Objects.requireNonNull(thumbprintList, "thumbprintList is required");
            this.url = java.util.Objects.requireNonNull(url, "url is required");
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.util.List<java.lang.String> getClientIdList() {
            return this.clientIdList;
        }

        @Override
        public final java.util.List<java.lang.String> getThumbprintList() {
            return this.thumbprintList;
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

            data.set("clientIdList", om.valueToTree(this.getClientIdList()));
            data.set("thumbprintList", om.valueToTree(this.getThumbprintList()));
            data.set("url", om.valueToTree(this.getUrl()));
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
            struct.set("fqn", om.valueToTree("aws.IamOpenidConnectProviderConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            IamOpenidConnectProviderConfig.Jsii$Proxy that = (IamOpenidConnectProviderConfig.Jsii$Proxy) o;

            if (!clientIdList.equals(that.clientIdList)) return false;
            if (!thumbprintList.equals(that.thumbprintList)) return false;
            if (!url.equals(that.url)) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.clientIdList.hashCode();
            result = 31 * result + (this.thumbprintList.hashCode());
            result = 31 * result + (this.url.hashCode());
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
