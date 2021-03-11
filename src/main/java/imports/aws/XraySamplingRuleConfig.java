package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:03.245Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.XraySamplingRuleConfig")
@software.amazon.jsii.Jsii.Proxy(XraySamplingRuleConfig.Jsii$Proxy.class)
public interface XraySamplingRuleConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.Number getFixedRate();

    @org.jetbrains.annotations.NotNull java.lang.String getHost();

    @org.jetbrains.annotations.NotNull java.lang.String getHttpMethod();

    @org.jetbrains.annotations.NotNull java.lang.Number getPriority();

    @org.jetbrains.annotations.NotNull java.lang.Number getReservoirSize();

    @org.jetbrains.annotations.NotNull java.lang.String getResourceArn();

    @org.jetbrains.annotations.NotNull java.lang.String getServiceName();

    @org.jetbrains.annotations.NotNull java.lang.String getServiceType();

    @org.jetbrains.annotations.NotNull java.lang.String getUrlPath();

    @org.jetbrains.annotations.NotNull java.lang.Number getVersion();

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getAttributes() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getRuleName() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link XraySamplingRuleConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link XraySamplingRuleConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<XraySamplingRuleConfig> {
        private java.lang.Number fixedRate;
        private java.lang.String host;
        private java.lang.String httpMethod;
        private java.lang.Number priority;
        private java.lang.Number reservoirSize;
        private java.lang.String resourceArn;
        private java.lang.String serviceName;
        private java.lang.String serviceType;
        private java.lang.String urlPath;
        private java.lang.Number version;
        private java.util.Map<java.lang.String, java.lang.String> attributes;
        private java.lang.String ruleName;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link XraySamplingRuleConfig#getFixedRate}
         * @param fixedRate the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder fixedRate(java.lang.Number fixedRate) {
            this.fixedRate = fixedRate;
            return this;
        }

        /**
         * Sets the value of {@link XraySamplingRuleConfig#getHost}
         * @param host the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder host(java.lang.String host) {
            this.host = host;
            return this;
        }

        /**
         * Sets the value of {@link XraySamplingRuleConfig#getHttpMethod}
         * @param httpMethod the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder httpMethod(java.lang.String httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }

        /**
         * Sets the value of {@link XraySamplingRuleConfig#getPriority}
         * @param priority the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder priority(java.lang.Number priority) {
            this.priority = priority;
            return this;
        }

        /**
         * Sets the value of {@link XraySamplingRuleConfig#getReservoirSize}
         * @param reservoirSize the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder reservoirSize(java.lang.Number reservoirSize) {
            this.reservoirSize = reservoirSize;
            return this;
        }

        /**
         * Sets the value of {@link XraySamplingRuleConfig#getResourceArn}
         * @param resourceArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder resourceArn(java.lang.String resourceArn) {
            this.resourceArn = resourceArn;
            return this;
        }

        /**
         * Sets the value of {@link XraySamplingRuleConfig#getServiceName}
         * @param serviceName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder serviceName(java.lang.String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /**
         * Sets the value of {@link XraySamplingRuleConfig#getServiceType}
         * @param serviceType the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder serviceType(java.lang.String serviceType) {
            this.serviceType = serviceType;
            return this;
        }

        /**
         * Sets the value of {@link XraySamplingRuleConfig#getUrlPath}
         * @param urlPath the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder urlPath(java.lang.String urlPath) {
            this.urlPath = urlPath;
            return this;
        }

        /**
         * Sets the value of {@link XraySamplingRuleConfig#getVersion}
         * @param version the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder version(java.lang.Number version) {
            this.version = version;
            return this;
        }

        /**
         * Sets the value of {@link XraySamplingRuleConfig#getAttributes}
         * @param attributes the value to be set.
         * @return {@code this}
         */
        public Builder attributes(java.util.Map<java.lang.String, java.lang.String> attributes) {
            this.attributes = attributes;
            return this;
        }

        /**
         * Sets the value of {@link XraySamplingRuleConfig#getRuleName}
         * @param ruleName the value to be set.
         * @return {@code this}
         */
        public Builder ruleName(java.lang.String ruleName) {
            this.ruleName = ruleName;
            return this;
        }

        /**
         * Sets the value of {@link XraySamplingRuleConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link XraySamplingRuleConfig#getDependsOn}
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
         * Sets the value of {@link XraySamplingRuleConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link XraySamplingRuleConfig#getProvider}
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
         * @return a new instance of {@link XraySamplingRuleConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public XraySamplingRuleConfig build() {
            return new Jsii$Proxy(fixedRate, host, httpMethod, priority, reservoirSize, resourceArn, serviceName, serviceType, urlPath, version, attributes, ruleName, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link XraySamplingRuleConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements XraySamplingRuleConfig {
        private final java.lang.Number fixedRate;
        private final java.lang.String host;
        private final java.lang.String httpMethod;
        private final java.lang.Number priority;
        private final java.lang.Number reservoirSize;
        private final java.lang.String resourceArn;
        private final java.lang.String serviceName;
        private final java.lang.String serviceType;
        private final java.lang.String urlPath;
        private final java.lang.Number version;
        private final java.util.Map<java.lang.String, java.lang.String> attributes;
        private final java.lang.String ruleName;
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
            this.fixedRate = software.amazon.jsii.Kernel.get(this, "fixedRate", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.host = software.amazon.jsii.Kernel.get(this, "host", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.httpMethod = software.amazon.jsii.Kernel.get(this, "httpMethod", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.priority = software.amazon.jsii.Kernel.get(this, "priority", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.reservoirSize = software.amazon.jsii.Kernel.get(this, "reservoirSize", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.resourceArn = software.amazon.jsii.Kernel.get(this, "resourceArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.serviceName = software.amazon.jsii.Kernel.get(this, "serviceName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.serviceType = software.amazon.jsii.Kernel.get(this, "serviceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.urlPath = software.amazon.jsii.Kernel.get(this, "urlPath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.version = software.amazon.jsii.Kernel.get(this, "version", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.attributes = software.amazon.jsii.Kernel.get(this, "attributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.ruleName = software.amazon.jsii.Kernel.get(this, "ruleName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.Number fixedRate, final java.lang.String host, final java.lang.String httpMethod, final java.lang.Number priority, final java.lang.Number reservoirSize, final java.lang.String resourceArn, final java.lang.String serviceName, final java.lang.String serviceType, final java.lang.String urlPath, final java.lang.Number version, final java.util.Map<java.lang.String, java.lang.String> attributes, final java.lang.String ruleName, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.fixedRate = java.util.Objects.requireNonNull(fixedRate, "fixedRate is required");
            this.host = java.util.Objects.requireNonNull(host, "host is required");
            this.httpMethod = java.util.Objects.requireNonNull(httpMethod, "httpMethod is required");
            this.priority = java.util.Objects.requireNonNull(priority, "priority is required");
            this.reservoirSize = java.util.Objects.requireNonNull(reservoirSize, "reservoirSize is required");
            this.resourceArn = java.util.Objects.requireNonNull(resourceArn, "resourceArn is required");
            this.serviceName = java.util.Objects.requireNonNull(serviceName, "serviceName is required");
            this.serviceType = java.util.Objects.requireNonNull(serviceType, "serviceType is required");
            this.urlPath = java.util.Objects.requireNonNull(urlPath, "urlPath is required");
            this.version = java.util.Objects.requireNonNull(version, "version is required");
            this.attributes = attributes;
            this.ruleName = ruleName;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.Number getFixedRate() {
            return this.fixedRate;
        }

        @Override
        public final java.lang.String getHost() {
            return this.host;
        }

        @Override
        public final java.lang.String getHttpMethod() {
            return this.httpMethod;
        }

        @Override
        public final java.lang.Number getPriority() {
            return this.priority;
        }

        @Override
        public final java.lang.Number getReservoirSize() {
            return this.reservoirSize;
        }

        @Override
        public final java.lang.String getResourceArn() {
            return this.resourceArn;
        }

        @Override
        public final java.lang.String getServiceName() {
            return this.serviceName;
        }

        @Override
        public final java.lang.String getServiceType() {
            return this.serviceType;
        }

        @Override
        public final java.lang.String getUrlPath() {
            return this.urlPath;
        }

        @Override
        public final java.lang.Number getVersion() {
            return this.version;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getAttributes() {
            return this.attributes;
        }

        @Override
        public final java.lang.String getRuleName() {
            return this.ruleName;
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

            data.set("fixedRate", om.valueToTree(this.getFixedRate()));
            data.set("host", om.valueToTree(this.getHost()));
            data.set("httpMethod", om.valueToTree(this.getHttpMethod()));
            data.set("priority", om.valueToTree(this.getPriority()));
            data.set("reservoirSize", om.valueToTree(this.getReservoirSize()));
            data.set("resourceArn", om.valueToTree(this.getResourceArn()));
            data.set("serviceName", om.valueToTree(this.getServiceName()));
            data.set("serviceType", om.valueToTree(this.getServiceType()));
            data.set("urlPath", om.valueToTree(this.getUrlPath()));
            data.set("version", om.valueToTree(this.getVersion()));
            if (this.getAttributes() != null) {
                data.set("attributes", om.valueToTree(this.getAttributes()));
            }
            if (this.getRuleName() != null) {
                data.set("ruleName", om.valueToTree(this.getRuleName()));
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
            struct.set("fqn", om.valueToTree("aws.XraySamplingRuleConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            XraySamplingRuleConfig.Jsii$Proxy that = (XraySamplingRuleConfig.Jsii$Proxy) o;

            if (!fixedRate.equals(that.fixedRate)) return false;
            if (!host.equals(that.host)) return false;
            if (!httpMethod.equals(that.httpMethod)) return false;
            if (!priority.equals(that.priority)) return false;
            if (!reservoirSize.equals(that.reservoirSize)) return false;
            if (!resourceArn.equals(that.resourceArn)) return false;
            if (!serviceName.equals(that.serviceName)) return false;
            if (!serviceType.equals(that.serviceType)) return false;
            if (!urlPath.equals(that.urlPath)) return false;
            if (!version.equals(that.version)) return false;
            if (this.attributes != null ? !this.attributes.equals(that.attributes) : that.attributes != null) return false;
            if (this.ruleName != null ? !this.ruleName.equals(that.ruleName) : that.ruleName != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.fixedRate.hashCode();
            result = 31 * result + (this.host.hashCode());
            result = 31 * result + (this.httpMethod.hashCode());
            result = 31 * result + (this.priority.hashCode());
            result = 31 * result + (this.reservoirSize.hashCode());
            result = 31 * result + (this.resourceArn.hashCode());
            result = 31 * result + (this.serviceName.hashCode());
            result = 31 * result + (this.serviceType.hashCode());
            result = 31 * result + (this.urlPath.hashCode());
            result = 31 * result + (this.version.hashCode());
            result = 31 * result + (this.attributes != null ? this.attributes.hashCode() : 0);
            result = 31 * result + (this.ruleName != null ? this.ruleName.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
