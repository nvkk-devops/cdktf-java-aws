package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.208Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.ConfigOrganizationManagedRuleConfig")
@software.amazon.jsii.Jsii.Proxy(ConfigOrganizationManagedRuleConfig.Jsii$Proxy.class)
public interface ConfigOrganizationManagedRuleConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    @org.jetbrains.annotations.NotNull java.lang.String getRuleIdentifier();

    default @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getExcludedAccounts() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getInputParameters() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getMaximumExecutionFrequency() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getResourceIdScope() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getResourceTypesScope() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getTagKeyScope() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getTagValueScope() {
        return null;
    }

    /**
     * timeouts block.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.ConfigOrganizationManagedRuleTimeouts getTimeouts() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ConfigOrganizationManagedRuleConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ConfigOrganizationManagedRuleConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ConfigOrganizationManagedRuleConfig> {
        private java.lang.String name;
        private java.lang.String ruleIdentifier;
        private java.lang.String description;
        private java.util.List<java.lang.String> excludedAccounts;
        private java.lang.String inputParameters;
        private java.lang.String maximumExecutionFrequency;
        private java.lang.String resourceIdScope;
        private java.util.List<java.lang.String> resourceTypesScope;
        private java.lang.String tagKeyScope;
        private java.lang.String tagValueScope;
        private imports.aws.ConfigOrganizationManagedRuleTimeouts timeouts;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link ConfigOrganizationManagedRuleConfig#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link ConfigOrganizationManagedRuleConfig#getRuleIdentifier}
         * @param ruleIdentifier the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder ruleIdentifier(java.lang.String ruleIdentifier) {
            this.ruleIdentifier = ruleIdentifier;
            return this;
        }

        /**
         * Sets the value of {@link ConfigOrganizationManagedRuleConfig#getDescription}
         * @param description the value to be set.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link ConfigOrganizationManagedRuleConfig#getExcludedAccounts}
         * @param excludedAccounts the value to be set.
         * @return {@code this}
         */
        public Builder excludedAccounts(java.util.List<java.lang.String> excludedAccounts) {
            this.excludedAccounts = excludedAccounts;
            return this;
        }

        /**
         * Sets the value of {@link ConfigOrganizationManagedRuleConfig#getInputParameters}
         * @param inputParameters the value to be set.
         * @return {@code this}
         */
        public Builder inputParameters(java.lang.String inputParameters) {
            this.inputParameters = inputParameters;
            return this;
        }

        /**
         * Sets the value of {@link ConfigOrganizationManagedRuleConfig#getMaximumExecutionFrequency}
         * @param maximumExecutionFrequency the value to be set.
         * @return {@code this}
         */
        public Builder maximumExecutionFrequency(java.lang.String maximumExecutionFrequency) {
            this.maximumExecutionFrequency = maximumExecutionFrequency;
            return this;
        }

        /**
         * Sets the value of {@link ConfigOrganizationManagedRuleConfig#getResourceIdScope}
         * @param resourceIdScope the value to be set.
         * @return {@code this}
         */
        public Builder resourceIdScope(java.lang.String resourceIdScope) {
            this.resourceIdScope = resourceIdScope;
            return this;
        }

        /**
         * Sets the value of {@link ConfigOrganizationManagedRuleConfig#getResourceTypesScope}
         * @param resourceTypesScope the value to be set.
         * @return {@code this}
         */
        public Builder resourceTypesScope(java.util.List<java.lang.String> resourceTypesScope) {
            this.resourceTypesScope = resourceTypesScope;
            return this;
        }

        /**
         * Sets the value of {@link ConfigOrganizationManagedRuleConfig#getTagKeyScope}
         * @param tagKeyScope the value to be set.
         * @return {@code this}
         */
        public Builder tagKeyScope(java.lang.String tagKeyScope) {
            this.tagKeyScope = tagKeyScope;
            return this;
        }

        /**
         * Sets the value of {@link ConfigOrganizationManagedRuleConfig#getTagValueScope}
         * @param tagValueScope the value to be set.
         * @return {@code this}
         */
        public Builder tagValueScope(java.lang.String tagValueScope) {
            this.tagValueScope = tagValueScope;
            return this;
        }

        /**
         * Sets the value of {@link ConfigOrganizationManagedRuleConfig#getTimeouts}
         * @param timeouts timeouts block.
         * @return {@code this}
         */
        public Builder timeouts(imports.aws.ConfigOrganizationManagedRuleTimeouts timeouts) {
            this.timeouts = timeouts;
            return this;
        }

        /**
         * Sets the value of {@link ConfigOrganizationManagedRuleConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link ConfigOrganizationManagedRuleConfig#getDependsOn}
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
         * Sets the value of {@link ConfigOrganizationManagedRuleConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link ConfigOrganizationManagedRuleConfig#getProvider}
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
         * @return a new instance of {@link ConfigOrganizationManagedRuleConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ConfigOrganizationManagedRuleConfig build() {
            return new Jsii$Proxy(name, ruleIdentifier, description, excludedAccounts, inputParameters, maximumExecutionFrequency, resourceIdScope, resourceTypesScope, tagKeyScope, tagValueScope, timeouts, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link ConfigOrganizationManagedRuleConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ConfigOrganizationManagedRuleConfig {
        private final java.lang.String name;
        private final java.lang.String ruleIdentifier;
        private final java.lang.String description;
        private final java.util.List<java.lang.String> excludedAccounts;
        private final java.lang.String inputParameters;
        private final java.lang.String maximumExecutionFrequency;
        private final java.lang.String resourceIdScope;
        private final java.util.List<java.lang.String> resourceTypesScope;
        private final java.lang.String tagKeyScope;
        private final java.lang.String tagValueScope;
        private final imports.aws.ConfigOrganizationManagedRuleTimeouts timeouts;
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
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.ruleIdentifier = software.amazon.jsii.Kernel.get(this, "ruleIdentifier", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.excludedAccounts = software.amazon.jsii.Kernel.get(this, "excludedAccounts", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.inputParameters = software.amazon.jsii.Kernel.get(this, "inputParameters", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.maximumExecutionFrequency = software.amazon.jsii.Kernel.get(this, "maximumExecutionFrequency", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.resourceIdScope = software.amazon.jsii.Kernel.get(this, "resourceIdScope", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.resourceTypesScope = software.amazon.jsii.Kernel.get(this, "resourceTypesScope", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.tagKeyScope = software.amazon.jsii.Kernel.get(this, "tagKeyScope", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tagValueScope = software.amazon.jsii.Kernel.get(this, "tagValueScope", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.timeouts = software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.ConfigOrganizationManagedRuleTimeouts.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String name, final java.lang.String ruleIdentifier, final java.lang.String description, final java.util.List<java.lang.String> excludedAccounts, final java.lang.String inputParameters, final java.lang.String maximumExecutionFrequency, final java.lang.String resourceIdScope, final java.util.List<java.lang.String> resourceTypesScope, final java.lang.String tagKeyScope, final java.lang.String tagValueScope, final imports.aws.ConfigOrganizationManagedRuleTimeouts timeouts, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.ruleIdentifier = java.util.Objects.requireNonNull(ruleIdentifier, "ruleIdentifier is required");
            this.description = description;
            this.excludedAccounts = excludedAccounts;
            this.inputParameters = inputParameters;
            this.maximumExecutionFrequency = maximumExecutionFrequency;
            this.resourceIdScope = resourceIdScope;
            this.resourceTypesScope = resourceTypesScope;
            this.tagKeyScope = tagKeyScope;
            this.tagValueScope = tagValueScope;
            this.timeouts = timeouts;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getRuleIdentifier() {
            return this.ruleIdentifier;
        }

        @Override
        public final java.lang.String getDescription() {
            return this.description;
        }

        @Override
        public final java.util.List<java.lang.String> getExcludedAccounts() {
            return this.excludedAccounts;
        }

        @Override
        public final java.lang.String getInputParameters() {
            return this.inputParameters;
        }

        @Override
        public final java.lang.String getMaximumExecutionFrequency() {
            return this.maximumExecutionFrequency;
        }

        @Override
        public final java.lang.String getResourceIdScope() {
            return this.resourceIdScope;
        }

        @Override
        public final java.util.List<java.lang.String> getResourceTypesScope() {
            return this.resourceTypesScope;
        }

        @Override
        public final java.lang.String getTagKeyScope() {
            return this.tagKeyScope;
        }

        @Override
        public final java.lang.String getTagValueScope() {
            return this.tagValueScope;
        }

        @Override
        public final imports.aws.ConfigOrganizationManagedRuleTimeouts getTimeouts() {
            return this.timeouts;
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

            data.set("name", om.valueToTree(this.getName()));
            data.set("ruleIdentifier", om.valueToTree(this.getRuleIdentifier()));
            if (this.getDescription() != null) {
                data.set("description", om.valueToTree(this.getDescription()));
            }
            if (this.getExcludedAccounts() != null) {
                data.set("excludedAccounts", om.valueToTree(this.getExcludedAccounts()));
            }
            if (this.getInputParameters() != null) {
                data.set("inputParameters", om.valueToTree(this.getInputParameters()));
            }
            if (this.getMaximumExecutionFrequency() != null) {
                data.set("maximumExecutionFrequency", om.valueToTree(this.getMaximumExecutionFrequency()));
            }
            if (this.getResourceIdScope() != null) {
                data.set("resourceIdScope", om.valueToTree(this.getResourceIdScope()));
            }
            if (this.getResourceTypesScope() != null) {
                data.set("resourceTypesScope", om.valueToTree(this.getResourceTypesScope()));
            }
            if (this.getTagKeyScope() != null) {
                data.set("tagKeyScope", om.valueToTree(this.getTagKeyScope()));
            }
            if (this.getTagValueScope() != null) {
                data.set("tagValueScope", om.valueToTree(this.getTagValueScope()));
            }
            if (this.getTimeouts() != null) {
                data.set("timeouts", om.valueToTree(this.getTimeouts()));
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
            struct.set("fqn", om.valueToTree("aws.ConfigOrganizationManagedRuleConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ConfigOrganizationManagedRuleConfig.Jsii$Proxy that = (ConfigOrganizationManagedRuleConfig.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (!ruleIdentifier.equals(that.ruleIdentifier)) return false;
            if (this.description != null ? !this.description.equals(that.description) : that.description != null) return false;
            if (this.excludedAccounts != null ? !this.excludedAccounts.equals(that.excludedAccounts) : that.excludedAccounts != null) return false;
            if (this.inputParameters != null ? !this.inputParameters.equals(that.inputParameters) : that.inputParameters != null) return false;
            if (this.maximumExecutionFrequency != null ? !this.maximumExecutionFrequency.equals(that.maximumExecutionFrequency) : that.maximumExecutionFrequency != null) return false;
            if (this.resourceIdScope != null ? !this.resourceIdScope.equals(that.resourceIdScope) : that.resourceIdScope != null) return false;
            if (this.resourceTypesScope != null ? !this.resourceTypesScope.equals(that.resourceTypesScope) : that.resourceTypesScope != null) return false;
            if (this.tagKeyScope != null ? !this.tagKeyScope.equals(that.tagKeyScope) : that.tagKeyScope != null) return false;
            if (this.tagValueScope != null ? !this.tagValueScope.equals(that.tagValueScope) : that.tagValueScope != null) return false;
            if (this.timeouts != null ? !this.timeouts.equals(that.timeouts) : that.timeouts != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.ruleIdentifier.hashCode());
            result = 31 * result + (this.description != null ? this.description.hashCode() : 0);
            result = 31 * result + (this.excludedAccounts != null ? this.excludedAccounts.hashCode() : 0);
            result = 31 * result + (this.inputParameters != null ? this.inputParameters.hashCode() : 0);
            result = 31 * result + (this.maximumExecutionFrequency != null ? this.maximumExecutionFrequency.hashCode() : 0);
            result = 31 * result + (this.resourceIdScope != null ? this.resourceIdScope.hashCode() : 0);
            result = 31 * result + (this.resourceTypesScope != null ? this.resourceTypesScope.hashCode() : 0);
            result = 31 * result + (this.tagKeyScope != null ? this.tagKeyScope.hashCode() : 0);
            result = 31 * result + (this.tagValueScope != null ? this.tagValueScope.hashCode() : 0);
            result = 31 * result + (this.timeouts != null ? this.timeouts.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
