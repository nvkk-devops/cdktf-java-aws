package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:03.242Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.WorklinkFleetConfig")
@software.amazon.jsii.Jsii.Proxy(WorklinkFleetConfig.Jsii$Proxy.class)
public interface WorklinkFleetConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    default @org.jetbrains.annotations.Nullable java.lang.String getAuditStreamArn() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDeviceCaCertificate() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDisplayName() {
        return null;
    }

    /**
     * identity_provider block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.WorklinkFleetIdentityProvider> getIdentityProvider() {
        return null;
    }

    /**
     * network block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.WorklinkFleetNetwork> getNetwork() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getOptimizeForEndUserLocation() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link WorklinkFleetConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link WorklinkFleetConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<WorklinkFleetConfig> {
        private java.lang.String name;
        private java.lang.String auditStreamArn;
        private java.lang.String deviceCaCertificate;
        private java.lang.String displayName;
        private java.util.List<imports.aws.WorklinkFleetIdentityProvider> identityProvider;
        private java.util.List<imports.aws.WorklinkFleetNetwork> network;
        private java.lang.Boolean optimizeForEndUserLocation;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link WorklinkFleetConfig#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link WorklinkFleetConfig#getAuditStreamArn}
         * @param auditStreamArn the value to be set.
         * @return {@code this}
         */
        public Builder auditStreamArn(java.lang.String auditStreamArn) {
            this.auditStreamArn = auditStreamArn;
            return this;
        }

        /**
         * Sets the value of {@link WorklinkFleetConfig#getDeviceCaCertificate}
         * @param deviceCaCertificate the value to be set.
         * @return {@code this}
         */
        public Builder deviceCaCertificate(java.lang.String deviceCaCertificate) {
            this.deviceCaCertificate = deviceCaCertificate;
            return this;
        }

        /**
         * Sets the value of {@link WorklinkFleetConfig#getDisplayName}
         * @param displayName the value to be set.
         * @return {@code this}
         */
        public Builder displayName(java.lang.String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * Sets the value of {@link WorklinkFleetConfig#getIdentityProvider}
         * @param identityProvider identity_provider block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder identityProvider(java.util.List<? extends imports.aws.WorklinkFleetIdentityProvider> identityProvider) {
            this.identityProvider = (java.util.List<imports.aws.WorklinkFleetIdentityProvider>)identityProvider;
            return this;
        }

        /**
         * Sets the value of {@link WorklinkFleetConfig#getNetwork}
         * @param network network block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder network(java.util.List<? extends imports.aws.WorklinkFleetNetwork> network) {
            this.network = (java.util.List<imports.aws.WorklinkFleetNetwork>)network;
            return this;
        }

        /**
         * Sets the value of {@link WorklinkFleetConfig#getOptimizeForEndUserLocation}
         * @param optimizeForEndUserLocation the value to be set.
         * @return {@code this}
         */
        public Builder optimizeForEndUserLocation(java.lang.Boolean optimizeForEndUserLocation) {
            this.optimizeForEndUserLocation = optimizeForEndUserLocation;
            return this;
        }

        /**
         * Sets the value of {@link WorklinkFleetConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link WorklinkFleetConfig#getDependsOn}
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
         * Sets the value of {@link WorklinkFleetConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link WorklinkFleetConfig#getProvider}
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
         * @return a new instance of {@link WorklinkFleetConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public WorklinkFleetConfig build() {
            return new Jsii$Proxy(name, auditStreamArn, deviceCaCertificate, displayName, identityProvider, network, optimizeForEndUserLocation, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link WorklinkFleetConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements WorklinkFleetConfig {
        private final java.lang.String name;
        private final java.lang.String auditStreamArn;
        private final java.lang.String deviceCaCertificate;
        private final java.lang.String displayName;
        private final java.util.List<imports.aws.WorklinkFleetIdentityProvider> identityProvider;
        private final java.util.List<imports.aws.WorklinkFleetNetwork> network;
        private final java.lang.Boolean optimizeForEndUserLocation;
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
            this.auditStreamArn = software.amazon.jsii.Kernel.get(this, "auditStreamArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.deviceCaCertificate = software.amazon.jsii.Kernel.get(this, "deviceCaCertificate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.displayName = software.amazon.jsii.Kernel.get(this, "displayName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.identityProvider = software.amazon.jsii.Kernel.get(this, "identityProvider", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.WorklinkFleetIdentityProvider.class)));
            this.network = software.amazon.jsii.Kernel.get(this, "network", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.WorklinkFleetNetwork.class)));
            this.optimizeForEndUserLocation = software.amazon.jsii.Kernel.get(this, "optimizeForEndUserLocation", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String name, final java.lang.String auditStreamArn, final java.lang.String deviceCaCertificate, final java.lang.String displayName, final java.util.List<? extends imports.aws.WorklinkFleetIdentityProvider> identityProvider, final java.util.List<? extends imports.aws.WorklinkFleetNetwork> network, final java.lang.Boolean optimizeForEndUserLocation, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.auditStreamArn = auditStreamArn;
            this.deviceCaCertificate = deviceCaCertificate;
            this.displayName = displayName;
            this.identityProvider = (java.util.List<imports.aws.WorklinkFleetIdentityProvider>)identityProvider;
            this.network = (java.util.List<imports.aws.WorklinkFleetNetwork>)network;
            this.optimizeForEndUserLocation = optimizeForEndUserLocation;
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
        public final java.lang.String getAuditStreamArn() {
            return this.auditStreamArn;
        }

        @Override
        public final java.lang.String getDeviceCaCertificate() {
            return this.deviceCaCertificate;
        }

        @Override
        public final java.lang.String getDisplayName() {
            return this.displayName;
        }

        @Override
        public final java.util.List<imports.aws.WorklinkFleetIdentityProvider> getIdentityProvider() {
            return this.identityProvider;
        }

        @Override
        public final java.util.List<imports.aws.WorklinkFleetNetwork> getNetwork() {
            return this.network;
        }

        @Override
        public final java.lang.Boolean getOptimizeForEndUserLocation() {
            return this.optimizeForEndUserLocation;
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
            if (this.getAuditStreamArn() != null) {
                data.set("auditStreamArn", om.valueToTree(this.getAuditStreamArn()));
            }
            if (this.getDeviceCaCertificate() != null) {
                data.set("deviceCaCertificate", om.valueToTree(this.getDeviceCaCertificate()));
            }
            if (this.getDisplayName() != null) {
                data.set("displayName", om.valueToTree(this.getDisplayName()));
            }
            if (this.getIdentityProvider() != null) {
                data.set("identityProvider", om.valueToTree(this.getIdentityProvider()));
            }
            if (this.getNetwork() != null) {
                data.set("network", om.valueToTree(this.getNetwork()));
            }
            if (this.getOptimizeForEndUserLocation() != null) {
                data.set("optimizeForEndUserLocation", om.valueToTree(this.getOptimizeForEndUserLocation()));
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
            struct.set("fqn", om.valueToTree("aws.WorklinkFleetConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            WorklinkFleetConfig.Jsii$Proxy that = (WorklinkFleetConfig.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (this.auditStreamArn != null ? !this.auditStreamArn.equals(that.auditStreamArn) : that.auditStreamArn != null) return false;
            if (this.deviceCaCertificate != null ? !this.deviceCaCertificate.equals(that.deviceCaCertificate) : that.deviceCaCertificate != null) return false;
            if (this.displayName != null ? !this.displayName.equals(that.displayName) : that.displayName != null) return false;
            if (this.identityProvider != null ? !this.identityProvider.equals(that.identityProvider) : that.identityProvider != null) return false;
            if (this.network != null ? !this.network.equals(that.network) : that.network != null) return false;
            if (this.optimizeForEndUserLocation != null ? !this.optimizeForEndUserLocation.equals(that.optimizeForEndUserLocation) : that.optimizeForEndUserLocation != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.auditStreamArn != null ? this.auditStreamArn.hashCode() : 0);
            result = 31 * result + (this.deviceCaCertificate != null ? this.deviceCaCertificate.hashCode() : 0);
            result = 31 * result + (this.displayName != null ? this.displayName.hashCode() : 0);
            result = 31 * result + (this.identityProvider != null ? this.identityProvider.hashCode() : 0);
            result = 31 * result + (this.network != null ? this.network.hashCode() : 0);
            result = 31 * result + (this.optimizeForEndUserLocation != null ? this.optimizeForEndUserLocation.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
