package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.181Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CodepipelineWebhookConfig")
@software.amazon.jsii.Jsii.Proxy(CodepipelineWebhookConfig.Jsii$Proxy.class)
public interface CodepipelineWebhookConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getAuthentication();

    /**
     * filter block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CodepipelineWebhookFilter> getFilter();

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    @org.jetbrains.annotations.NotNull java.lang.String getTargetAction();

    @org.jetbrains.annotations.NotNull java.lang.String getTargetPipeline();

    /**
     * authentication_configuration block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CodepipelineWebhookAuthenticationConfiguration> getAuthenticationConfiguration() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CodepipelineWebhookConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CodepipelineWebhookConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CodepipelineWebhookConfig> {
        private java.lang.String authentication;
        private java.util.List<imports.aws.CodepipelineWebhookFilter> filter;
        private java.lang.String name;
        private java.lang.String targetAction;
        private java.lang.String targetPipeline;
        private java.util.List<imports.aws.CodepipelineWebhookAuthenticationConfiguration> authenticationConfiguration;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link CodepipelineWebhookConfig#getAuthentication}
         * @param authentication the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder authentication(java.lang.String authentication) {
            this.authentication = authentication;
            return this;
        }

        /**
         * Sets the value of {@link CodepipelineWebhookConfig#getFilter}
         * @param filter filter block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder filter(java.util.List<? extends imports.aws.CodepipelineWebhookFilter> filter) {
            this.filter = (java.util.List<imports.aws.CodepipelineWebhookFilter>)filter;
            return this;
        }

        /**
         * Sets the value of {@link CodepipelineWebhookConfig#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link CodepipelineWebhookConfig#getTargetAction}
         * @param targetAction the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder targetAction(java.lang.String targetAction) {
            this.targetAction = targetAction;
            return this;
        }

        /**
         * Sets the value of {@link CodepipelineWebhookConfig#getTargetPipeline}
         * @param targetPipeline the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder targetPipeline(java.lang.String targetPipeline) {
            this.targetPipeline = targetPipeline;
            return this;
        }

        /**
         * Sets the value of {@link CodepipelineWebhookConfig#getAuthenticationConfiguration}
         * @param authenticationConfiguration authentication_configuration block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder authenticationConfiguration(java.util.List<? extends imports.aws.CodepipelineWebhookAuthenticationConfiguration> authenticationConfiguration) {
            this.authenticationConfiguration = (java.util.List<imports.aws.CodepipelineWebhookAuthenticationConfiguration>)authenticationConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link CodepipelineWebhookConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link CodepipelineWebhookConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link CodepipelineWebhookConfig#getDependsOn}
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
         * Sets the value of {@link CodepipelineWebhookConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link CodepipelineWebhookConfig#getProvider}
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
         * @return a new instance of {@link CodepipelineWebhookConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CodepipelineWebhookConfig build() {
            return new Jsii$Proxy(authentication, filter, name, targetAction, targetPipeline, authenticationConfiguration, tags, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link CodepipelineWebhookConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CodepipelineWebhookConfig {
        private final java.lang.String authentication;
        private final java.util.List<imports.aws.CodepipelineWebhookFilter> filter;
        private final java.lang.String name;
        private final java.lang.String targetAction;
        private final java.lang.String targetPipeline;
        private final java.util.List<imports.aws.CodepipelineWebhookAuthenticationConfiguration> authenticationConfiguration;
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
            this.authentication = software.amazon.jsii.Kernel.get(this, "authentication", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.filter = software.amazon.jsii.Kernel.get(this, "filter", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodepipelineWebhookFilter.class)));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.targetAction = software.amazon.jsii.Kernel.get(this, "targetAction", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.targetPipeline = software.amazon.jsii.Kernel.get(this, "targetPipeline", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.authenticationConfiguration = software.amazon.jsii.Kernel.get(this, "authenticationConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodepipelineWebhookAuthenticationConfiguration.class)));
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
        protected Jsii$Proxy(final java.lang.String authentication, final java.util.List<? extends imports.aws.CodepipelineWebhookFilter> filter, final java.lang.String name, final java.lang.String targetAction, final java.lang.String targetPipeline, final java.util.List<? extends imports.aws.CodepipelineWebhookAuthenticationConfiguration> authenticationConfiguration, final java.util.Map<java.lang.String, java.lang.String> tags, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.authentication = java.util.Objects.requireNonNull(authentication, "authentication is required");
            this.filter = (java.util.List<imports.aws.CodepipelineWebhookFilter>)java.util.Objects.requireNonNull(filter, "filter is required");
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.targetAction = java.util.Objects.requireNonNull(targetAction, "targetAction is required");
            this.targetPipeline = java.util.Objects.requireNonNull(targetPipeline, "targetPipeline is required");
            this.authenticationConfiguration = (java.util.List<imports.aws.CodepipelineWebhookAuthenticationConfiguration>)authenticationConfiguration;
            this.tags = tags;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getAuthentication() {
            return this.authentication;
        }

        @Override
        public final java.util.List<imports.aws.CodepipelineWebhookFilter> getFilter() {
            return this.filter;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getTargetAction() {
            return this.targetAction;
        }

        @Override
        public final java.lang.String getTargetPipeline() {
            return this.targetPipeline;
        }

        @Override
        public final java.util.List<imports.aws.CodepipelineWebhookAuthenticationConfiguration> getAuthenticationConfiguration() {
            return this.authenticationConfiguration;
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

            data.set("authentication", om.valueToTree(this.getAuthentication()));
            data.set("filter", om.valueToTree(this.getFilter()));
            data.set("name", om.valueToTree(this.getName()));
            data.set("targetAction", om.valueToTree(this.getTargetAction()));
            data.set("targetPipeline", om.valueToTree(this.getTargetPipeline()));
            if (this.getAuthenticationConfiguration() != null) {
                data.set("authenticationConfiguration", om.valueToTree(this.getAuthenticationConfiguration()));
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
            struct.set("fqn", om.valueToTree("aws.CodepipelineWebhookConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CodepipelineWebhookConfig.Jsii$Proxy that = (CodepipelineWebhookConfig.Jsii$Proxy) o;

            if (!authentication.equals(that.authentication)) return false;
            if (!filter.equals(that.filter)) return false;
            if (!name.equals(that.name)) return false;
            if (!targetAction.equals(that.targetAction)) return false;
            if (!targetPipeline.equals(that.targetPipeline)) return false;
            if (this.authenticationConfiguration != null ? !this.authenticationConfiguration.equals(that.authenticationConfiguration) : that.authenticationConfiguration != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.authentication.hashCode();
            result = 31 * result + (this.filter.hashCode());
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.targetAction.hashCode());
            result = 31 * result + (this.targetPipeline.hashCode());
            result = 31 * result + (this.authenticationConfiguration != null ? this.authenticationConfiguration.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
