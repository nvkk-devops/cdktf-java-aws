package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.105Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.BatchComputeEnvironmentConfig")
@software.amazon.jsii.Jsii.Proxy(BatchComputeEnvironmentConfig.Jsii$Proxy.class)
public interface BatchComputeEnvironmentConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getServiceRole();

    @org.jetbrains.annotations.NotNull java.lang.String getType();

    default @org.jetbrains.annotations.Nullable java.lang.String getComputeEnvironmentName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getComputeEnvironmentNamePrefix() {
        return null;
    }

    /**
     * compute_resources block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.BatchComputeEnvironmentComputeResources> getComputeResources() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getState() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BatchComputeEnvironmentConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BatchComputeEnvironmentConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BatchComputeEnvironmentConfig> {
        private java.lang.String serviceRole;
        private java.lang.String type;
        private java.lang.String computeEnvironmentName;
        private java.lang.String computeEnvironmentNamePrefix;
        private java.util.List<imports.aws.BatchComputeEnvironmentComputeResources> computeResources;
        private java.lang.String state;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link BatchComputeEnvironmentConfig#getServiceRole}
         * @param serviceRole the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder serviceRole(java.lang.String serviceRole) {
            this.serviceRole = serviceRole;
            return this;
        }

        /**
         * Sets the value of {@link BatchComputeEnvironmentConfig#getType}
         * @param type the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link BatchComputeEnvironmentConfig#getComputeEnvironmentName}
         * @param computeEnvironmentName the value to be set.
         * @return {@code this}
         */
        public Builder computeEnvironmentName(java.lang.String computeEnvironmentName) {
            this.computeEnvironmentName = computeEnvironmentName;
            return this;
        }

        /**
         * Sets the value of {@link BatchComputeEnvironmentConfig#getComputeEnvironmentNamePrefix}
         * @param computeEnvironmentNamePrefix the value to be set.
         * @return {@code this}
         */
        public Builder computeEnvironmentNamePrefix(java.lang.String computeEnvironmentNamePrefix) {
            this.computeEnvironmentNamePrefix = computeEnvironmentNamePrefix;
            return this;
        }

        /**
         * Sets the value of {@link BatchComputeEnvironmentConfig#getComputeResources}
         * @param computeResources compute_resources block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder computeResources(java.util.List<? extends imports.aws.BatchComputeEnvironmentComputeResources> computeResources) {
            this.computeResources = (java.util.List<imports.aws.BatchComputeEnvironmentComputeResources>)computeResources;
            return this;
        }

        /**
         * Sets the value of {@link BatchComputeEnvironmentConfig#getState}
         * @param state the value to be set.
         * @return {@code this}
         */
        public Builder state(java.lang.String state) {
            this.state = state;
            return this;
        }

        /**
         * Sets the value of {@link BatchComputeEnvironmentConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link BatchComputeEnvironmentConfig#getDependsOn}
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
         * Sets the value of {@link BatchComputeEnvironmentConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link BatchComputeEnvironmentConfig#getProvider}
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
         * @return a new instance of {@link BatchComputeEnvironmentConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BatchComputeEnvironmentConfig build() {
            return new Jsii$Proxy(serviceRole, type, computeEnvironmentName, computeEnvironmentNamePrefix, computeResources, state, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link BatchComputeEnvironmentConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BatchComputeEnvironmentConfig {
        private final java.lang.String serviceRole;
        private final java.lang.String type;
        private final java.lang.String computeEnvironmentName;
        private final java.lang.String computeEnvironmentNamePrefix;
        private final java.util.List<imports.aws.BatchComputeEnvironmentComputeResources> computeResources;
        private final java.lang.String state;
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
            this.serviceRole = software.amazon.jsii.Kernel.get(this, "serviceRole", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.computeEnvironmentName = software.amazon.jsii.Kernel.get(this, "computeEnvironmentName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.computeEnvironmentNamePrefix = software.amazon.jsii.Kernel.get(this, "computeEnvironmentNamePrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.computeResources = software.amazon.jsii.Kernel.get(this, "computeResources", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.BatchComputeEnvironmentComputeResources.class)));
            this.state = software.amazon.jsii.Kernel.get(this, "state", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String serviceRole, final java.lang.String type, final java.lang.String computeEnvironmentName, final java.lang.String computeEnvironmentNamePrefix, final java.util.List<? extends imports.aws.BatchComputeEnvironmentComputeResources> computeResources, final java.lang.String state, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.serviceRole = java.util.Objects.requireNonNull(serviceRole, "serviceRole is required");
            this.type = java.util.Objects.requireNonNull(type, "type is required");
            this.computeEnvironmentName = computeEnvironmentName;
            this.computeEnvironmentNamePrefix = computeEnvironmentNamePrefix;
            this.computeResources = (java.util.List<imports.aws.BatchComputeEnvironmentComputeResources>)computeResources;
            this.state = state;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getServiceRole() {
            return this.serviceRole;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        public final java.lang.String getComputeEnvironmentName() {
            return this.computeEnvironmentName;
        }

        @Override
        public final java.lang.String getComputeEnvironmentNamePrefix() {
            return this.computeEnvironmentNamePrefix;
        }

        @Override
        public final java.util.List<imports.aws.BatchComputeEnvironmentComputeResources> getComputeResources() {
            return this.computeResources;
        }

        @Override
        public final java.lang.String getState() {
            return this.state;
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

            data.set("serviceRole", om.valueToTree(this.getServiceRole()));
            data.set("type", om.valueToTree(this.getType()));
            if (this.getComputeEnvironmentName() != null) {
                data.set("computeEnvironmentName", om.valueToTree(this.getComputeEnvironmentName()));
            }
            if (this.getComputeEnvironmentNamePrefix() != null) {
                data.set("computeEnvironmentNamePrefix", om.valueToTree(this.getComputeEnvironmentNamePrefix()));
            }
            if (this.getComputeResources() != null) {
                data.set("computeResources", om.valueToTree(this.getComputeResources()));
            }
            if (this.getState() != null) {
                data.set("state", om.valueToTree(this.getState()));
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
            struct.set("fqn", om.valueToTree("aws.BatchComputeEnvironmentConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BatchComputeEnvironmentConfig.Jsii$Proxy that = (BatchComputeEnvironmentConfig.Jsii$Proxy) o;

            if (!serviceRole.equals(that.serviceRole)) return false;
            if (!type.equals(that.type)) return false;
            if (this.computeEnvironmentName != null ? !this.computeEnvironmentName.equals(that.computeEnvironmentName) : that.computeEnvironmentName != null) return false;
            if (this.computeEnvironmentNamePrefix != null ? !this.computeEnvironmentNamePrefix.equals(that.computeEnvironmentNamePrefix) : that.computeEnvironmentNamePrefix != null) return false;
            if (this.computeResources != null ? !this.computeResources.equals(that.computeResources) : that.computeResources != null) return false;
            if (this.state != null ? !this.state.equals(that.state) : that.state != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.serviceRole.hashCode();
            result = 31 * result + (this.type.hashCode());
            result = 31 * result + (this.computeEnvironmentName != null ? this.computeEnvironmentName.hashCode() : 0);
            result = 31 * result + (this.computeEnvironmentNamePrefix != null ? this.computeEnvironmentNamePrefix.hashCode() : 0);
            result = 31 * result + (this.computeResources != null ? this.computeResources.hashCode() : 0);
            result = 31 * result + (this.state != null ? this.state.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
