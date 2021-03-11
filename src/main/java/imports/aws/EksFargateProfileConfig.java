package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.533Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.EksFargateProfileConfig")
@software.amazon.jsii.Jsii.Proxy(EksFargateProfileConfig.Jsii$Proxy.class)
public interface EksFargateProfileConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getClusterName();

    @org.jetbrains.annotations.NotNull java.lang.String getFargateProfileName();

    @org.jetbrains.annotations.NotNull java.lang.String getPodExecutionRoleArn();

    /**
     * selector block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.EksFargateProfileSelector> getSelector();

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSubnetIds() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * timeouts block.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.EksFargateProfileTimeouts getTimeouts() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link EksFargateProfileConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link EksFargateProfileConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<EksFargateProfileConfig> {
        private java.lang.String clusterName;
        private java.lang.String fargateProfileName;
        private java.lang.String podExecutionRoleArn;
        private java.util.List<imports.aws.EksFargateProfileSelector> selector;
        private java.util.List<java.lang.String> subnetIds;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private imports.aws.EksFargateProfileTimeouts timeouts;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link EksFargateProfileConfig#getClusterName}
         * @param clusterName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder clusterName(java.lang.String clusterName) {
            this.clusterName = clusterName;
            return this;
        }

        /**
         * Sets the value of {@link EksFargateProfileConfig#getFargateProfileName}
         * @param fargateProfileName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder fargateProfileName(java.lang.String fargateProfileName) {
            this.fargateProfileName = fargateProfileName;
            return this;
        }

        /**
         * Sets the value of {@link EksFargateProfileConfig#getPodExecutionRoleArn}
         * @param podExecutionRoleArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder podExecutionRoleArn(java.lang.String podExecutionRoleArn) {
            this.podExecutionRoleArn = podExecutionRoleArn;
            return this;
        }

        /**
         * Sets the value of {@link EksFargateProfileConfig#getSelector}
         * @param selector selector block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder selector(java.util.List<? extends imports.aws.EksFargateProfileSelector> selector) {
            this.selector = (java.util.List<imports.aws.EksFargateProfileSelector>)selector;
            return this;
        }

        /**
         * Sets the value of {@link EksFargateProfileConfig#getSubnetIds}
         * @param subnetIds the value to be set.
         * @return {@code this}
         */
        public Builder subnetIds(java.util.List<java.lang.String> subnetIds) {
            this.subnetIds = subnetIds;
            return this;
        }

        /**
         * Sets the value of {@link EksFargateProfileConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link EksFargateProfileConfig#getTimeouts}
         * @param timeouts timeouts block.
         * @return {@code this}
         */
        public Builder timeouts(imports.aws.EksFargateProfileTimeouts timeouts) {
            this.timeouts = timeouts;
            return this;
        }

        /**
         * Sets the value of {@link EksFargateProfileConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link EksFargateProfileConfig#getDependsOn}
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
         * Sets the value of {@link EksFargateProfileConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link EksFargateProfileConfig#getProvider}
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
         * @return a new instance of {@link EksFargateProfileConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public EksFargateProfileConfig build() {
            return new Jsii$Proxy(clusterName, fargateProfileName, podExecutionRoleArn, selector, subnetIds, tags, timeouts, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link EksFargateProfileConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements EksFargateProfileConfig {
        private final java.lang.String clusterName;
        private final java.lang.String fargateProfileName;
        private final java.lang.String podExecutionRoleArn;
        private final java.util.List<imports.aws.EksFargateProfileSelector> selector;
        private final java.util.List<java.lang.String> subnetIds;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final imports.aws.EksFargateProfileTimeouts timeouts;
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
            this.clusterName = software.amazon.jsii.Kernel.get(this, "clusterName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.fargateProfileName = software.amazon.jsii.Kernel.get(this, "fargateProfileName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.podExecutionRoleArn = software.amazon.jsii.Kernel.get(this, "podExecutionRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.selector = software.amazon.jsii.Kernel.get(this, "selector", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EksFargateProfileSelector.class)));
            this.subnetIds = software.amazon.jsii.Kernel.get(this, "subnetIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.timeouts = software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.EksFargateProfileTimeouts.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String clusterName, final java.lang.String fargateProfileName, final java.lang.String podExecutionRoleArn, final java.util.List<? extends imports.aws.EksFargateProfileSelector> selector, final java.util.List<java.lang.String> subnetIds, final java.util.Map<java.lang.String, java.lang.String> tags, final imports.aws.EksFargateProfileTimeouts timeouts, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.clusterName = java.util.Objects.requireNonNull(clusterName, "clusterName is required");
            this.fargateProfileName = java.util.Objects.requireNonNull(fargateProfileName, "fargateProfileName is required");
            this.podExecutionRoleArn = java.util.Objects.requireNonNull(podExecutionRoleArn, "podExecutionRoleArn is required");
            this.selector = (java.util.List<imports.aws.EksFargateProfileSelector>)java.util.Objects.requireNonNull(selector, "selector is required");
            this.subnetIds = subnetIds;
            this.tags = tags;
            this.timeouts = timeouts;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getClusterName() {
            return this.clusterName;
        }

        @Override
        public final java.lang.String getFargateProfileName() {
            return this.fargateProfileName;
        }

        @Override
        public final java.lang.String getPodExecutionRoleArn() {
            return this.podExecutionRoleArn;
        }

        @Override
        public final java.util.List<imports.aws.EksFargateProfileSelector> getSelector() {
            return this.selector;
        }

        @Override
        public final java.util.List<java.lang.String> getSubnetIds() {
            return this.subnetIds;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final imports.aws.EksFargateProfileTimeouts getTimeouts() {
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

            data.set("clusterName", om.valueToTree(this.getClusterName()));
            data.set("fargateProfileName", om.valueToTree(this.getFargateProfileName()));
            data.set("podExecutionRoleArn", om.valueToTree(this.getPodExecutionRoleArn()));
            data.set("selector", om.valueToTree(this.getSelector()));
            if (this.getSubnetIds() != null) {
                data.set("subnetIds", om.valueToTree(this.getSubnetIds()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
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
            struct.set("fqn", om.valueToTree("aws.EksFargateProfileConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EksFargateProfileConfig.Jsii$Proxy that = (EksFargateProfileConfig.Jsii$Proxy) o;

            if (!clusterName.equals(that.clusterName)) return false;
            if (!fargateProfileName.equals(that.fargateProfileName)) return false;
            if (!podExecutionRoleArn.equals(that.podExecutionRoleArn)) return false;
            if (!selector.equals(that.selector)) return false;
            if (this.subnetIds != null ? !this.subnetIds.equals(that.subnetIds) : that.subnetIds != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.timeouts != null ? !this.timeouts.equals(that.timeouts) : that.timeouts != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.clusterName.hashCode();
            result = 31 * result + (this.fargateProfileName.hashCode());
            result = 31 * result + (this.podExecutionRoleArn.hashCode());
            result = 31 * result + (this.selector.hashCode());
            result = 31 * result + (this.subnetIds != null ? this.subnetIds.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.timeouts != null ? this.timeouts.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
