package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.778Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.OrganizationsOrganizationConfig")
@software.amazon.jsii.Jsii.Proxy(OrganizationsOrganizationConfig.Jsii$Proxy.class)
public interface OrganizationsOrganizationConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAwsServiceAccessPrincipals() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getEnabledPolicyTypes() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getFeatureSet() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link OrganizationsOrganizationConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link OrganizationsOrganizationConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<OrganizationsOrganizationConfig> {
        private java.util.List<java.lang.String> awsServiceAccessPrincipals;
        private java.util.List<java.lang.String> enabledPolicyTypes;
        private java.lang.String featureSet;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link OrganizationsOrganizationConfig#getAwsServiceAccessPrincipals}
         * @param awsServiceAccessPrincipals the value to be set.
         * @return {@code this}
         */
        public Builder awsServiceAccessPrincipals(java.util.List<java.lang.String> awsServiceAccessPrincipals) {
            this.awsServiceAccessPrincipals = awsServiceAccessPrincipals;
            return this;
        }

        /**
         * Sets the value of {@link OrganizationsOrganizationConfig#getEnabledPolicyTypes}
         * @param enabledPolicyTypes the value to be set.
         * @return {@code this}
         */
        public Builder enabledPolicyTypes(java.util.List<java.lang.String> enabledPolicyTypes) {
            this.enabledPolicyTypes = enabledPolicyTypes;
            return this;
        }

        /**
         * Sets the value of {@link OrganizationsOrganizationConfig#getFeatureSet}
         * @param featureSet the value to be set.
         * @return {@code this}
         */
        public Builder featureSet(java.lang.String featureSet) {
            this.featureSet = featureSet;
            return this;
        }

        /**
         * Sets the value of {@link OrganizationsOrganizationConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link OrganizationsOrganizationConfig#getDependsOn}
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
         * Sets the value of {@link OrganizationsOrganizationConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link OrganizationsOrganizationConfig#getProvider}
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
         * @return a new instance of {@link OrganizationsOrganizationConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public OrganizationsOrganizationConfig build() {
            return new Jsii$Proxy(awsServiceAccessPrincipals, enabledPolicyTypes, featureSet, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link OrganizationsOrganizationConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements OrganizationsOrganizationConfig {
        private final java.util.List<java.lang.String> awsServiceAccessPrincipals;
        private final java.util.List<java.lang.String> enabledPolicyTypes;
        private final java.lang.String featureSet;
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
            this.awsServiceAccessPrincipals = software.amazon.jsii.Kernel.get(this, "awsServiceAccessPrincipals", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.enabledPolicyTypes = software.amazon.jsii.Kernel.get(this, "enabledPolicyTypes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.featureSet = software.amazon.jsii.Kernel.get(this, "featureSet", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<java.lang.String> awsServiceAccessPrincipals, final java.util.List<java.lang.String> enabledPolicyTypes, final java.lang.String featureSet, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.awsServiceAccessPrincipals = awsServiceAccessPrincipals;
            this.enabledPolicyTypes = enabledPolicyTypes;
            this.featureSet = featureSet;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.util.List<java.lang.String> getAwsServiceAccessPrincipals() {
            return this.awsServiceAccessPrincipals;
        }

        @Override
        public final java.util.List<java.lang.String> getEnabledPolicyTypes() {
            return this.enabledPolicyTypes;
        }

        @Override
        public final java.lang.String getFeatureSet() {
            return this.featureSet;
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

            if (this.getAwsServiceAccessPrincipals() != null) {
                data.set("awsServiceAccessPrincipals", om.valueToTree(this.getAwsServiceAccessPrincipals()));
            }
            if (this.getEnabledPolicyTypes() != null) {
                data.set("enabledPolicyTypes", om.valueToTree(this.getEnabledPolicyTypes()));
            }
            if (this.getFeatureSet() != null) {
                data.set("featureSet", om.valueToTree(this.getFeatureSet()));
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
            struct.set("fqn", om.valueToTree("aws.OrganizationsOrganizationConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            OrganizationsOrganizationConfig.Jsii$Proxy that = (OrganizationsOrganizationConfig.Jsii$Proxy) o;

            if (this.awsServiceAccessPrincipals != null ? !this.awsServiceAccessPrincipals.equals(that.awsServiceAccessPrincipals) : that.awsServiceAccessPrincipals != null) return false;
            if (this.enabledPolicyTypes != null ? !this.enabledPolicyTypes.equals(that.enabledPolicyTypes) : that.enabledPolicyTypes != null) return false;
            if (this.featureSet != null ? !this.featureSet.equals(that.featureSet) : that.featureSet != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.awsServiceAccessPrincipals != null ? this.awsServiceAccessPrincipals.hashCode() : 0;
            result = 31 * result + (this.enabledPolicyTypes != null ? this.enabledPolicyTypes.hashCode() : 0);
            result = 31 * result + (this.featureSet != null ? this.featureSet.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
