package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.947Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.WafregionalWebAclConfig")
@software.amazon.jsii.Jsii.Proxy(WafregionalWebAclConfig.Jsii$Proxy.class)
public interface WafregionalWebAclConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * default_action block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.WafregionalWebAclDefaultAction> getDefaultAction();

    @org.jetbrains.annotations.NotNull java.lang.String getMetricName();

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * logging_configuration block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.WafregionalWebAclLoggingConfiguration> getLoggingConfiguration() {
        return null;
    }

    /**
     * rule block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.WafregionalWebAclRule> getRule() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link WafregionalWebAclConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link WafregionalWebAclConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<WafregionalWebAclConfig> {
        private java.util.List<imports.aws.WafregionalWebAclDefaultAction> defaultAction;
        private java.lang.String metricName;
        private java.lang.String name;
        private java.util.List<imports.aws.WafregionalWebAclLoggingConfiguration> loggingConfiguration;
        private java.util.List<imports.aws.WafregionalWebAclRule> rule;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link WafregionalWebAclConfig#getDefaultAction}
         * @param defaultAction default_action block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder defaultAction(java.util.List<? extends imports.aws.WafregionalWebAclDefaultAction> defaultAction) {
            this.defaultAction = (java.util.List<imports.aws.WafregionalWebAclDefaultAction>)defaultAction;
            return this;
        }

        /**
         * Sets the value of {@link WafregionalWebAclConfig#getMetricName}
         * @param metricName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder metricName(java.lang.String metricName) {
            this.metricName = metricName;
            return this;
        }

        /**
         * Sets the value of {@link WafregionalWebAclConfig#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link WafregionalWebAclConfig#getLoggingConfiguration}
         * @param loggingConfiguration logging_configuration block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder loggingConfiguration(java.util.List<? extends imports.aws.WafregionalWebAclLoggingConfiguration> loggingConfiguration) {
            this.loggingConfiguration = (java.util.List<imports.aws.WafregionalWebAclLoggingConfiguration>)loggingConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link WafregionalWebAclConfig#getRule}
         * @param rule rule block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder rule(java.util.List<? extends imports.aws.WafregionalWebAclRule> rule) {
            this.rule = (java.util.List<imports.aws.WafregionalWebAclRule>)rule;
            return this;
        }

        /**
         * Sets the value of {@link WafregionalWebAclConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link WafregionalWebAclConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link WafregionalWebAclConfig#getDependsOn}
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
         * Sets the value of {@link WafregionalWebAclConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link WafregionalWebAclConfig#getProvider}
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
         * @return a new instance of {@link WafregionalWebAclConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public WafregionalWebAclConfig build() {
            return new Jsii$Proxy(defaultAction, metricName, name, loggingConfiguration, rule, tags, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link WafregionalWebAclConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements WafregionalWebAclConfig {
        private final java.util.List<imports.aws.WafregionalWebAclDefaultAction> defaultAction;
        private final java.lang.String metricName;
        private final java.lang.String name;
        private final java.util.List<imports.aws.WafregionalWebAclLoggingConfiguration> loggingConfiguration;
        private final java.util.List<imports.aws.WafregionalWebAclRule> rule;
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
            this.defaultAction = software.amazon.jsii.Kernel.get(this, "defaultAction", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.WafregionalWebAclDefaultAction.class)));
            this.metricName = software.amazon.jsii.Kernel.get(this, "metricName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.loggingConfiguration = software.amazon.jsii.Kernel.get(this, "loggingConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.WafregionalWebAclLoggingConfiguration.class)));
            this.rule = software.amazon.jsii.Kernel.get(this, "rule", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.WafregionalWebAclRule.class)));
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
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.WafregionalWebAclDefaultAction> defaultAction, final java.lang.String metricName, final java.lang.String name, final java.util.List<? extends imports.aws.WafregionalWebAclLoggingConfiguration> loggingConfiguration, final java.util.List<? extends imports.aws.WafregionalWebAclRule> rule, final java.util.Map<java.lang.String, java.lang.String> tags, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.defaultAction = (java.util.List<imports.aws.WafregionalWebAclDefaultAction>)java.util.Objects.requireNonNull(defaultAction, "defaultAction is required");
            this.metricName = java.util.Objects.requireNonNull(metricName, "metricName is required");
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.loggingConfiguration = (java.util.List<imports.aws.WafregionalWebAclLoggingConfiguration>)loggingConfiguration;
            this.rule = (java.util.List<imports.aws.WafregionalWebAclRule>)rule;
            this.tags = tags;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.util.List<imports.aws.WafregionalWebAclDefaultAction> getDefaultAction() {
            return this.defaultAction;
        }

        @Override
        public final java.lang.String getMetricName() {
            return this.metricName;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.util.List<imports.aws.WafregionalWebAclLoggingConfiguration> getLoggingConfiguration() {
            return this.loggingConfiguration;
        }

        @Override
        public final java.util.List<imports.aws.WafregionalWebAclRule> getRule() {
            return this.rule;
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

            data.set("defaultAction", om.valueToTree(this.getDefaultAction()));
            data.set("metricName", om.valueToTree(this.getMetricName()));
            data.set("name", om.valueToTree(this.getName()));
            if (this.getLoggingConfiguration() != null) {
                data.set("loggingConfiguration", om.valueToTree(this.getLoggingConfiguration()));
            }
            if (this.getRule() != null) {
                data.set("rule", om.valueToTree(this.getRule()));
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
            struct.set("fqn", om.valueToTree("aws.WafregionalWebAclConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            WafregionalWebAclConfig.Jsii$Proxy that = (WafregionalWebAclConfig.Jsii$Proxy) o;

            if (!defaultAction.equals(that.defaultAction)) return false;
            if (!metricName.equals(that.metricName)) return false;
            if (!name.equals(that.name)) return false;
            if (this.loggingConfiguration != null ? !this.loggingConfiguration.equals(that.loggingConfiguration) : that.loggingConfiguration != null) return false;
            if (this.rule != null ? !this.rule.equals(that.rule) : that.rule != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.defaultAction.hashCode();
            result = 31 * result + (this.metricName.hashCode());
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.loggingConfiguration != null ? this.loggingConfiguration.hashCode() : 0);
            result = 31 * result + (this.rule != null ? this.rule.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
