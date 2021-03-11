package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.530Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.EipConfig")
@software.amazon.jsii.Jsii.Proxy(EipConfig.Jsii$Proxy.class)
public interface EipConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    default @org.jetbrains.annotations.Nullable java.lang.String getAssociateWithPrivateIp() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getCustomerOwnedIpv4Pool() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getInstance() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getNetworkInterface() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPublicIpv4Pool() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * timeouts block.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.EipTimeouts getTimeouts() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getVpc() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link EipConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link EipConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<EipConfig> {
        private java.lang.String associateWithPrivateIp;
        private java.lang.String customerOwnedIpv4Pool;
        private java.lang.String instance;
        private java.lang.String networkInterface;
        private java.lang.String publicIpv4Pool;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private imports.aws.EipTimeouts timeouts;
        private java.lang.Boolean vpc;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link EipConfig#getAssociateWithPrivateIp}
         * @param associateWithPrivateIp the value to be set.
         * @return {@code this}
         */
        public Builder associateWithPrivateIp(java.lang.String associateWithPrivateIp) {
            this.associateWithPrivateIp = associateWithPrivateIp;
            return this;
        }

        /**
         * Sets the value of {@link EipConfig#getCustomerOwnedIpv4Pool}
         * @param customerOwnedIpv4Pool the value to be set.
         * @return {@code this}
         */
        public Builder customerOwnedIpv4Pool(java.lang.String customerOwnedIpv4Pool) {
            this.customerOwnedIpv4Pool = customerOwnedIpv4Pool;
            return this;
        }

        /**
         * Sets the value of {@link EipConfig#getInstance}
         * @param instance the value to be set.
         * @return {@code this}
         */
        public Builder instance(java.lang.String instance) {
            this.instance = instance;
            return this;
        }

        /**
         * Sets the value of {@link EipConfig#getNetworkInterface}
         * @param networkInterface the value to be set.
         * @return {@code this}
         */
        public Builder networkInterface(java.lang.String networkInterface) {
            this.networkInterface = networkInterface;
            return this;
        }

        /**
         * Sets the value of {@link EipConfig#getPublicIpv4Pool}
         * @param publicIpv4Pool the value to be set.
         * @return {@code this}
         */
        public Builder publicIpv4Pool(java.lang.String publicIpv4Pool) {
            this.publicIpv4Pool = publicIpv4Pool;
            return this;
        }

        /**
         * Sets the value of {@link EipConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link EipConfig#getTimeouts}
         * @param timeouts timeouts block.
         * @return {@code this}
         */
        public Builder timeouts(imports.aws.EipTimeouts timeouts) {
            this.timeouts = timeouts;
            return this;
        }

        /**
         * Sets the value of {@link EipConfig#getVpc}
         * @param vpc the value to be set.
         * @return {@code this}
         */
        public Builder vpc(java.lang.Boolean vpc) {
            this.vpc = vpc;
            return this;
        }

        /**
         * Sets the value of {@link EipConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link EipConfig#getDependsOn}
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
         * Sets the value of {@link EipConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link EipConfig#getProvider}
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
         * @return a new instance of {@link EipConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public EipConfig build() {
            return new Jsii$Proxy(associateWithPrivateIp, customerOwnedIpv4Pool, instance, networkInterface, publicIpv4Pool, tags, timeouts, vpc, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link EipConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements EipConfig {
        private final java.lang.String associateWithPrivateIp;
        private final java.lang.String customerOwnedIpv4Pool;
        private final java.lang.String instance;
        private final java.lang.String networkInterface;
        private final java.lang.String publicIpv4Pool;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final imports.aws.EipTimeouts timeouts;
        private final java.lang.Boolean vpc;
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
            this.associateWithPrivateIp = software.amazon.jsii.Kernel.get(this, "associateWithPrivateIp", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.customerOwnedIpv4Pool = software.amazon.jsii.Kernel.get(this, "customerOwnedIpv4Pool", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.instance = software.amazon.jsii.Kernel.get(this, "instance", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.networkInterface = software.amazon.jsii.Kernel.get(this, "networkInterface", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.publicIpv4Pool = software.amazon.jsii.Kernel.get(this, "publicIpv4Pool", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.timeouts = software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.EipTimeouts.class));
            this.vpc = software.amazon.jsii.Kernel.get(this, "vpc", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String associateWithPrivateIp, final java.lang.String customerOwnedIpv4Pool, final java.lang.String instance, final java.lang.String networkInterface, final java.lang.String publicIpv4Pool, final java.util.Map<java.lang.String, java.lang.String> tags, final imports.aws.EipTimeouts timeouts, final java.lang.Boolean vpc, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.associateWithPrivateIp = associateWithPrivateIp;
            this.customerOwnedIpv4Pool = customerOwnedIpv4Pool;
            this.instance = instance;
            this.networkInterface = networkInterface;
            this.publicIpv4Pool = publicIpv4Pool;
            this.tags = tags;
            this.timeouts = timeouts;
            this.vpc = vpc;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getAssociateWithPrivateIp() {
            return this.associateWithPrivateIp;
        }

        @Override
        public final java.lang.String getCustomerOwnedIpv4Pool() {
            return this.customerOwnedIpv4Pool;
        }

        @Override
        public final java.lang.String getInstance() {
            return this.instance;
        }

        @Override
        public final java.lang.String getNetworkInterface() {
            return this.networkInterface;
        }

        @Override
        public final java.lang.String getPublicIpv4Pool() {
            return this.publicIpv4Pool;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final imports.aws.EipTimeouts getTimeouts() {
            return this.timeouts;
        }

        @Override
        public final java.lang.Boolean getVpc() {
            return this.vpc;
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

            if (this.getAssociateWithPrivateIp() != null) {
                data.set("associateWithPrivateIp", om.valueToTree(this.getAssociateWithPrivateIp()));
            }
            if (this.getCustomerOwnedIpv4Pool() != null) {
                data.set("customerOwnedIpv4Pool", om.valueToTree(this.getCustomerOwnedIpv4Pool()));
            }
            if (this.getInstance() != null) {
                data.set("instance", om.valueToTree(this.getInstance()));
            }
            if (this.getNetworkInterface() != null) {
                data.set("networkInterface", om.valueToTree(this.getNetworkInterface()));
            }
            if (this.getPublicIpv4Pool() != null) {
                data.set("publicIpv4Pool", om.valueToTree(this.getPublicIpv4Pool()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getTimeouts() != null) {
                data.set("timeouts", om.valueToTree(this.getTimeouts()));
            }
            if (this.getVpc() != null) {
                data.set("vpc", om.valueToTree(this.getVpc()));
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
            struct.set("fqn", om.valueToTree("aws.EipConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EipConfig.Jsii$Proxy that = (EipConfig.Jsii$Proxy) o;

            if (this.associateWithPrivateIp != null ? !this.associateWithPrivateIp.equals(that.associateWithPrivateIp) : that.associateWithPrivateIp != null) return false;
            if (this.customerOwnedIpv4Pool != null ? !this.customerOwnedIpv4Pool.equals(that.customerOwnedIpv4Pool) : that.customerOwnedIpv4Pool != null) return false;
            if (this.instance != null ? !this.instance.equals(that.instance) : that.instance != null) return false;
            if (this.networkInterface != null ? !this.networkInterface.equals(that.networkInterface) : that.networkInterface != null) return false;
            if (this.publicIpv4Pool != null ? !this.publicIpv4Pool.equals(that.publicIpv4Pool) : that.publicIpv4Pool != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.timeouts != null ? !this.timeouts.equals(that.timeouts) : that.timeouts != null) return false;
            if (this.vpc != null ? !this.vpc.equals(that.vpc) : that.vpc != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.associateWithPrivateIp != null ? this.associateWithPrivateIp.hashCode() : 0;
            result = 31 * result + (this.customerOwnedIpv4Pool != null ? this.customerOwnedIpv4Pool.hashCode() : 0);
            result = 31 * result + (this.instance != null ? this.instance.hashCode() : 0);
            result = 31 * result + (this.networkInterface != null ? this.networkInterface.hashCode() : 0);
            result = 31 * result + (this.publicIpv4Pool != null ? this.publicIpv4Pool.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.timeouts != null ? this.timeouts.hashCode() : 0);
            result = 31 * result + (this.vpc != null ? this.vpc.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
