package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.801Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.RdsClusterEndpointConfig")
@software.amazon.jsii.Jsii.Proxy(RdsClusterEndpointConfig.Jsii$Proxy.class)
public interface RdsClusterEndpointConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getClusterEndpointIdentifier();

    @org.jetbrains.annotations.NotNull java.lang.String getClusterIdentifier();

    @org.jetbrains.annotations.NotNull java.lang.String getCustomEndpointType();

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getExcludedMembers() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getStaticMembers() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link RdsClusterEndpointConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link RdsClusterEndpointConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<RdsClusterEndpointConfig> {
        private java.lang.String clusterEndpointIdentifier;
        private java.lang.String clusterIdentifier;
        private java.lang.String customEndpointType;
        private java.util.List<java.lang.String> excludedMembers;
        private java.util.List<java.lang.String> staticMembers;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link RdsClusterEndpointConfig#getClusterEndpointIdentifier}
         * @param clusterEndpointIdentifier the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder clusterEndpointIdentifier(java.lang.String clusterEndpointIdentifier) {
            this.clusterEndpointIdentifier = clusterEndpointIdentifier;
            return this;
        }

        /**
         * Sets the value of {@link RdsClusterEndpointConfig#getClusterIdentifier}
         * @param clusterIdentifier the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder clusterIdentifier(java.lang.String clusterIdentifier) {
            this.clusterIdentifier = clusterIdentifier;
            return this;
        }

        /**
         * Sets the value of {@link RdsClusterEndpointConfig#getCustomEndpointType}
         * @param customEndpointType the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder customEndpointType(java.lang.String customEndpointType) {
            this.customEndpointType = customEndpointType;
            return this;
        }

        /**
         * Sets the value of {@link RdsClusterEndpointConfig#getExcludedMembers}
         * @param excludedMembers the value to be set.
         * @return {@code this}
         */
        public Builder excludedMembers(java.util.List<java.lang.String> excludedMembers) {
            this.excludedMembers = excludedMembers;
            return this;
        }

        /**
         * Sets the value of {@link RdsClusterEndpointConfig#getStaticMembers}
         * @param staticMembers the value to be set.
         * @return {@code this}
         */
        public Builder staticMembers(java.util.List<java.lang.String> staticMembers) {
            this.staticMembers = staticMembers;
            return this;
        }

        /**
         * Sets the value of {@link RdsClusterEndpointConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link RdsClusterEndpointConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link RdsClusterEndpointConfig#getDependsOn}
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
         * Sets the value of {@link RdsClusterEndpointConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link RdsClusterEndpointConfig#getProvider}
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
         * @return a new instance of {@link RdsClusterEndpointConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public RdsClusterEndpointConfig build() {
            return new Jsii$Proxy(clusterEndpointIdentifier, clusterIdentifier, customEndpointType, excludedMembers, staticMembers, tags, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link RdsClusterEndpointConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements RdsClusterEndpointConfig {
        private final java.lang.String clusterEndpointIdentifier;
        private final java.lang.String clusterIdentifier;
        private final java.lang.String customEndpointType;
        private final java.util.List<java.lang.String> excludedMembers;
        private final java.util.List<java.lang.String> staticMembers;
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
            this.clusterEndpointIdentifier = software.amazon.jsii.Kernel.get(this, "clusterEndpointIdentifier", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.clusterIdentifier = software.amazon.jsii.Kernel.get(this, "clusterIdentifier", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.customEndpointType = software.amazon.jsii.Kernel.get(this, "customEndpointType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.excludedMembers = software.amazon.jsii.Kernel.get(this, "excludedMembers", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.staticMembers = software.amazon.jsii.Kernel.get(this, "staticMembers", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
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
        protected Jsii$Proxy(final java.lang.String clusterEndpointIdentifier, final java.lang.String clusterIdentifier, final java.lang.String customEndpointType, final java.util.List<java.lang.String> excludedMembers, final java.util.List<java.lang.String> staticMembers, final java.util.Map<java.lang.String, java.lang.String> tags, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.clusterEndpointIdentifier = java.util.Objects.requireNonNull(clusterEndpointIdentifier, "clusterEndpointIdentifier is required");
            this.clusterIdentifier = java.util.Objects.requireNonNull(clusterIdentifier, "clusterIdentifier is required");
            this.customEndpointType = java.util.Objects.requireNonNull(customEndpointType, "customEndpointType is required");
            this.excludedMembers = excludedMembers;
            this.staticMembers = staticMembers;
            this.tags = tags;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getClusterEndpointIdentifier() {
            return this.clusterEndpointIdentifier;
        }

        @Override
        public final java.lang.String getClusterIdentifier() {
            return this.clusterIdentifier;
        }

        @Override
        public final java.lang.String getCustomEndpointType() {
            return this.customEndpointType;
        }

        @Override
        public final java.util.List<java.lang.String> getExcludedMembers() {
            return this.excludedMembers;
        }

        @Override
        public final java.util.List<java.lang.String> getStaticMembers() {
            return this.staticMembers;
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

            data.set("clusterEndpointIdentifier", om.valueToTree(this.getClusterEndpointIdentifier()));
            data.set("clusterIdentifier", om.valueToTree(this.getClusterIdentifier()));
            data.set("customEndpointType", om.valueToTree(this.getCustomEndpointType()));
            if (this.getExcludedMembers() != null) {
                data.set("excludedMembers", om.valueToTree(this.getExcludedMembers()));
            }
            if (this.getStaticMembers() != null) {
                data.set("staticMembers", om.valueToTree(this.getStaticMembers()));
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
            struct.set("fqn", om.valueToTree("aws.RdsClusterEndpointConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            RdsClusterEndpointConfig.Jsii$Proxy that = (RdsClusterEndpointConfig.Jsii$Proxy) o;

            if (!clusterEndpointIdentifier.equals(that.clusterEndpointIdentifier)) return false;
            if (!clusterIdentifier.equals(that.clusterIdentifier)) return false;
            if (!customEndpointType.equals(that.customEndpointType)) return false;
            if (this.excludedMembers != null ? !this.excludedMembers.equals(that.excludedMembers) : that.excludedMembers != null) return false;
            if (this.staticMembers != null ? !this.staticMembers.equals(that.staticMembers) : that.staticMembers != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.clusterEndpointIdentifier.hashCode();
            result = 31 * result + (this.clusterIdentifier.hashCode());
            result = 31 * result + (this.customEndpointType.hashCode());
            result = 31 * result + (this.excludedMembers != null ? this.excludedMembers.hashCode() : 0);
            result = 31 * result + (this.staticMembers != null ? this.staticMembers.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
