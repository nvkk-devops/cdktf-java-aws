package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.922Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.VpcPeeringConnectionConfig")
@software.amazon.jsii.Jsii.Proxy(VpcPeeringConnectionConfig.Jsii$Proxy.class)
public interface VpcPeeringConnectionConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getPeerVpcId();

    @org.jetbrains.annotations.NotNull java.lang.String getVpcId();

    /**
     * accepter block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.VpcPeeringConnectionAccepter> getAccepter() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAutoAccept() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPeerOwnerId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPeerRegion() {
        return null;
    }

    /**
     * requester block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.VpcPeeringConnectionRequester> getRequester() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * timeouts block.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.VpcPeeringConnectionTimeouts getTimeouts() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link VpcPeeringConnectionConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link VpcPeeringConnectionConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<VpcPeeringConnectionConfig> {
        private java.lang.String peerVpcId;
        private java.lang.String vpcId;
        private java.util.List<imports.aws.VpcPeeringConnectionAccepter> accepter;
        private java.lang.Boolean autoAccept;
        private java.lang.String peerOwnerId;
        private java.lang.String peerRegion;
        private java.util.List<imports.aws.VpcPeeringConnectionRequester> requester;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private imports.aws.VpcPeeringConnectionTimeouts timeouts;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link VpcPeeringConnectionConfig#getPeerVpcId}
         * @param peerVpcId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder peerVpcId(java.lang.String peerVpcId) {
            this.peerVpcId = peerVpcId;
            return this;
        }

        /**
         * Sets the value of {@link VpcPeeringConnectionConfig#getVpcId}
         * @param vpcId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder vpcId(java.lang.String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        /**
         * Sets the value of {@link VpcPeeringConnectionConfig#getAccepter}
         * @param accepter accepter block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder accepter(java.util.List<? extends imports.aws.VpcPeeringConnectionAccepter> accepter) {
            this.accepter = (java.util.List<imports.aws.VpcPeeringConnectionAccepter>)accepter;
            return this;
        }

        /**
         * Sets the value of {@link VpcPeeringConnectionConfig#getAutoAccept}
         * @param autoAccept the value to be set.
         * @return {@code this}
         */
        public Builder autoAccept(java.lang.Boolean autoAccept) {
            this.autoAccept = autoAccept;
            return this;
        }

        /**
         * Sets the value of {@link VpcPeeringConnectionConfig#getPeerOwnerId}
         * @param peerOwnerId the value to be set.
         * @return {@code this}
         */
        public Builder peerOwnerId(java.lang.String peerOwnerId) {
            this.peerOwnerId = peerOwnerId;
            return this;
        }

        /**
         * Sets the value of {@link VpcPeeringConnectionConfig#getPeerRegion}
         * @param peerRegion the value to be set.
         * @return {@code this}
         */
        public Builder peerRegion(java.lang.String peerRegion) {
            this.peerRegion = peerRegion;
            return this;
        }

        /**
         * Sets the value of {@link VpcPeeringConnectionConfig#getRequester}
         * @param requester requester block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder requester(java.util.List<? extends imports.aws.VpcPeeringConnectionRequester> requester) {
            this.requester = (java.util.List<imports.aws.VpcPeeringConnectionRequester>)requester;
            return this;
        }

        /**
         * Sets the value of {@link VpcPeeringConnectionConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link VpcPeeringConnectionConfig#getTimeouts}
         * @param timeouts timeouts block.
         * @return {@code this}
         */
        public Builder timeouts(imports.aws.VpcPeeringConnectionTimeouts timeouts) {
            this.timeouts = timeouts;
            return this;
        }

        /**
         * Sets the value of {@link VpcPeeringConnectionConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link VpcPeeringConnectionConfig#getDependsOn}
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
         * Sets the value of {@link VpcPeeringConnectionConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link VpcPeeringConnectionConfig#getProvider}
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
         * @return a new instance of {@link VpcPeeringConnectionConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public VpcPeeringConnectionConfig build() {
            return new Jsii$Proxy(peerVpcId, vpcId, accepter, autoAccept, peerOwnerId, peerRegion, requester, tags, timeouts, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link VpcPeeringConnectionConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements VpcPeeringConnectionConfig {
        private final java.lang.String peerVpcId;
        private final java.lang.String vpcId;
        private final java.util.List<imports.aws.VpcPeeringConnectionAccepter> accepter;
        private final java.lang.Boolean autoAccept;
        private final java.lang.String peerOwnerId;
        private final java.lang.String peerRegion;
        private final java.util.List<imports.aws.VpcPeeringConnectionRequester> requester;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final imports.aws.VpcPeeringConnectionTimeouts timeouts;
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
            this.peerVpcId = software.amazon.jsii.Kernel.get(this, "peerVpcId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.vpcId = software.amazon.jsii.Kernel.get(this, "vpcId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.accepter = software.amazon.jsii.Kernel.get(this, "accepter", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.VpcPeeringConnectionAccepter.class)));
            this.autoAccept = software.amazon.jsii.Kernel.get(this, "autoAccept", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.peerOwnerId = software.amazon.jsii.Kernel.get(this, "peerOwnerId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.peerRegion = software.amazon.jsii.Kernel.get(this, "peerRegion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.requester = software.amazon.jsii.Kernel.get(this, "requester", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.VpcPeeringConnectionRequester.class)));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.timeouts = software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.VpcPeeringConnectionTimeouts.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String peerVpcId, final java.lang.String vpcId, final java.util.List<? extends imports.aws.VpcPeeringConnectionAccepter> accepter, final java.lang.Boolean autoAccept, final java.lang.String peerOwnerId, final java.lang.String peerRegion, final java.util.List<? extends imports.aws.VpcPeeringConnectionRequester> requester, final java.util.Map<java.lang.String, java.lang.String> tags, final imports.aws.VpcPeeringConnectionTimeouts timeouts, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.peerVpcId = java.util.Objects.requireNonNull(peerVpcId, "peerVpcId is required");
            this.vpcId = java.util.Objects.requireNonNull(vpcId, "vpcId is required");
            this.accepter = (java.util.List<imports.aws.VpcPeeringConnectionAccepter>)accepter;
            this.autoAccept = autoAccept;
            this.peerOwnerId = peerOwnerId;
            this.peerRegion = peerRegion;
            this.requester = (java.util.List<imports.aws.VpcPeeringConnectionRequester>)requester;
            this.tags = tags;
            this.timeouts = timeouts;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getPeerVpcId() {
            return this.peerVpcId;
        }

        @Override
        public final java.lang.String getVpcId() {
            return this.vpcId;
        }

        @Override
        public final java.util.List<imports.aws.VpcPeeringConnectionAccepter> getAccepter() {
            return this.accepter;
        }

        @Override
        public final java.lang.Boolean getAutoAccept() {
            return this.autoAccept;
        }

        @Override
        public final java.lang.String getPeerOwnerId() {
            return this.peerOwnerId;
        }

        @Override
        public final java.lang.String getPeerRegion() {
            return this.peerRegion;
        }

        @Override
        public final java.util.List<imports.aws.VpcPeeringConnectionRequester> getRequester() {
            return this.requester;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final imports.aws.VpcPeeringConnectionTimeouts getTimeouts() {
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

            data.set("peerVpcId", om.valueToTree(this.getPeerVpcId()));
            data.set("vpcId", om.valueToTree(this.getVpcId()));
            if (this.getAccepter() != null) {
                data.set("accepter", om.valueToTree(this.getAccepter()));
            }
            if (this.getAutoAccept() != null) {
                data.set("autoAccept", om.valueToTree(this.getAutoAccept()));
            }
            if (this.getPeerOwnerId() != null) {
                data.set("peerOwnerId", om.valueToTree(this.getPeerOwnerId()));
            }
            if (this.getPeerRegion() != null) {
                data.set("peerRegion", om.valueToTree(this.getPeerRegion()));
            }
            if (this.getRequester() != null) {
                data.set("requester", om.valueToTree(this.getRequester()));
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
            struct.set("fqn", om.valueToTree("aws.VpcPeeringConnectionConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            VpcPeeringConnectionConfig.Jsii$Proxy that = (VpcPeeringConnectionConfig.Jsii$Proxy) o;

            if (!peerVpcId.equals(that.peerVpcId)) return false;
            if (!vpcId.equals(that.vpcId)) return false;
            if (this.accepter != null ? !this.accepter.equals(that.accepter) : that.accepter != null) return false;
            if (this.autoAccept != null ? !this.autoAccept.equals(that.autoAccept) : that.autoAccept != null) return false;
            if (this.peerOwnerId != null ? !this.peerOwnerId.equals(that.peerOwnerId) : that.peerOwnerId != null) return false;
            if (this.peerRegion != null ? !this.peerRegion.equals(that.peerRegion) : that.peerRegion != null) return false;
            if (this.requester != null ? !this.requester.equals(that.requester) : that.requester != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.timeouts != null ? !this.timeouts.equals(that.timeouts) : that.timeouts != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.peerVpcId.hashCode();
            result = 31 * result + (this.vpcId.hashCode());
            result = 31 * result + (this.accepter != null ? this.accepter.hashCode() : 0);
            result = 31 * result + (this.autoAccept != null ? this.autoAccept.hashCode() : 0);
            result = 31 * result + (this.peerOwnerId != null ? this.peerOwnerId.hashCode() : 0);
            result = 31 * result + (this.peerRegion != null ? this.peerRegion.hashCode() : 0);
            result = 31 * result + (this.requester != null ? this.requester.hashCode() : 0);
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
