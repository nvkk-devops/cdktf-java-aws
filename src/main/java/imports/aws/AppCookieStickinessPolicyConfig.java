package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.026Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AppCookieStickinessPolicyConfig")
@software.amazon.jsii.Jsii.Proxy(AppCookieStickinessPolicyConfig.Jsii$Proxy.class)
public interface AppCookieStickinessPolicyConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getCookieName();

    @org.jetbrains.annotations.NotNull java.lang.Number getLbPort();

    @org.jetbrains.annotations.NotNull java.lang.String getLoadBalancer();

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * @return a {@link Builder} of {@link AppCookieStickinessPolicyConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppCookieStickinessPolicyConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppCookieStickinessPolicyConfig> {
        private java.lang.String cookieName;
        private java.lang.Number lbPort;
        private java.lang.String loadBalancer;
        private java.lang.String name;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link AppCookieStickinessPolicyConfig#getCookieName}
         * @param cookieName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder cookieName(java.lang.String cookieName) {
            this.cookieName = cookieName;
            return this;
        }

        /**
         * Sets the value of {@link AppCookieStickinessPolicyConfig#getLbPort}
         * @param lbPort the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder lbPort(java.lang.Number lbPort) {
            this.lbPort = lbPort;
            return this;
        }

        /**
         * Sets the value of {@link AppCookieStickinessPolicyConfig#getLoadBalancer}
         * @param loadBalancer the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder loadBalancer(java.lang.String loadBalancer) {
            this.loadBalancer = loadBalancer;
            return this;
        }

        /**
         * Sets the value of {@link AppCookieStickinessPolicyConfig#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link AppCookieStickinessPolicyConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link AppCookieStickinessPolicyConfig#getDependsOn}
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
         * Sets the value of {@link AppCookieStickinessPolicyConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link AppCookieStickinessPolicyConfig#getProvider}
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
         * @return a new instance of {@link AppCookieStickinessPolicyConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppCookieStickinessPolicyConfig build() {
            return new Jsii$Proxy(cookieName, lbPort, loadBalancer, name, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link AppCookieStickinessPolicyConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppCookieStickinessPolicyConfig {
        private final java.lang.String cookieName;
        private final java.lang.Number lbPort;
        private final java.lang.String loadBalancer;
        private final java.lang.String name;
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
            this.cookieName = software.amazon.jsii.Kernel.get(this, "cookieName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.lbPort = software.amazon.jsii.Kernel.get(this, "lbPort", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.loadBalancer = software.amazon.jsii.Kernel.get(this, "loadBalancer", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String cookieName, final java.lang.Number lbPort, final java.lang.String loadBalancer, final java.lang.String name, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.cookieName = java.util.Objects.requireNonNull(cookieName, "cookieName is required");
            this.lbPort = java.util.Objects.requireNonNull(lbPort, "lbPort is required");
            this.loadBalancer = java.util.Objects.requireNonNull(loadBalancer, "loadBalancer is required");
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getCookieName() {
            return this.cookieName;
        }

        @Override
        public final java.lang.Number getLbPort() {
            return this.lbPort;
        }

        @Override
        public final java.lang.String getLoadBalancer() {
            return this.loadBalancer;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
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

            data.set("cookieName", om.valueToTree(this.getCookieName()));
            data.set("lbPort", om.valueToTree(this.getLbPort()));
            data.set("loadBalancer", om.valueToTree(this.getLoadBalancer()));
            data.set("name", om.valueToTree(this.getName()));
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
            struct.set("fqn", om.valueToTree("aws.AppCookieStickinessPolicyConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppCookieStickinessPolicyConfig.Jsii$Proxy that = (AppCookieStickinessPolicyConfig.Jsii$Proxy) o;

            if (!cookieName.equals(that.cookieName)) return false;
            if (!lbPort.equals(that.lbPort)) return false;
            if (!loadBalancer.equals(that.loadBalancer)) return false;
            if (!name.equals(that.name)) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.cookieName.hashCode();
            result = 31 * result + (this.lbPort.hashCode());
            result = 31 * result + (this.loadBalancer.hashCode());
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
