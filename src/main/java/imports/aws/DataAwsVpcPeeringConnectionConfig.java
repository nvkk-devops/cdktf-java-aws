package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.385Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.DataAwsVpcPeeringConnectionConfig")
@software.amazon.jsii.Jsii.Proxy(DataAwsVpcPeeringConnectionConfig.Jsii$Proxy.class)
public interface DataAwsVpcPeeringConnectionConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    default @org.jetbrains.annotations.Nullable java.lang.String getCidrBlock() {
        return null;
    }

    /**
     * filter block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.DataAwsVpcPeeringConnectionFilter> getFilter() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getOwnerId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPeerCidrBlock() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPeerOwnerId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPeerRegion() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPeerVpcId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getRegion() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getStatus() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getVpcId() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DataAwsVpcPeeringConnectionConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DataAwsVpcPeeringConnectionConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DataAwsVpcPeeringConnectionConfig> {
        private java.lang.String cidrBlock;
        private java.util.List<imports.aws.DataAwsVpcPeeringConnectionFilter> filter;
        private java.lang.String ownerId;
        private java.lang.String peerCidrBlock;
        private java.lang.String peerOwnerId;
        private java.lang.String peerRegion;
        private java.lang.String peerVpcId;
        private java.lang.String region;
        private java.lang.String status;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.lang.String vpcId;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link DataAwsVpcPeeringConnectionConfig#getCidrBlock}
         * @param cidrBlock the value to be set.
         * @return {@code this}
         */
        public Builder cidrBlock(java.lang.String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsVpcPeeringConnectionConfig#getFilter}
         * @param filter filter block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder filter(java.util.List<? extends imports.aws.DataAwsVpcPeeringConnectionFilter> filter) {
            this.filter = (java.util.List<imports.aws.DataAwsVpcPeeringConnectionFilter>)filter;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsVpcPeeringConnectionConfig#getOwnerId}
         * @param ownerId the value to be set.
         * @return {@code this}
         */
        public Builder ownerId(java.lang.String ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsVpcPeeringConnectionConfig#getPeerCidrBlock}
         * @param peerCidrBlock the value to be set.
         * @return {@code this}
         */
        public Builder peerCidrBlock(java.lang.String peerCidrBlock) {
            this.peerCidrBlock = peerCidrBlock;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsVpcPeeringConnectionConfig#getPeerOwnerId}
         * @param peerOwnerId the value to be set.
         * @return {@code this}
         */
        public Builder peerOwnerId(java.lang.String peerOwnerId) {
            this.peerOwnerId = peerOwnerId;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsVpcPeeringConnectionConfig#getPeerRegion}
         * @param peerRegion the value to be set.
         * @return {@code this}
         */
        public Builder peerRegion(java.lang.String peerRegion) {
            this.peerRegion = peerRegion;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsVpcPeeringConnectionConfig#getPeerVpcId}
         * @param peerVpcId the value to be set.
         * @return {@code this}
         */
        public Builder peerVpcId(java.lang.String peerVpcId) {
            this.peerVpcId = peerVpcId;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsVpcPeeringConnectionConfig#getRegion}
         * @param region the value to be set.
         * @return {@code this}
         */
        public Builder region(java.lang.String region) {
            this.region = region;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsVpcPeeringConnectionConfig#getStatus}
         * @param status the value to be set.
         * @return {@code this}
         */
        public Builder status(java.lang.String status) {
            this.status = status;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsVpcPeeringConnectionConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsVpcPeeringConnectionConfig#getVpcId}
         * @param vpcId the value to be set.
         * @return {@code this}
         */
        public Builder vpcId(java.lang.String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsVpcPeeringConnectionConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsVpcPeeringConnectionConfig#getDependsOn}
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
         * Sets the value of {@link DataAwsVpcPeeringConnectionConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsVpcPeeringConnectionConfig#getProvider}
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
         * @return a new instance of {@link DataAwsVpcPeeringConnectionConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DataAwsVpcPeeringConnectionConfig build() {
            return new Jsii$Proxy(cidrBlock, filter, ownerId, peerCidrBlock, peerOwnerId, peerRegion, peerVpcId, region, status, tags, vpcId, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link DataAwsVpcPeeringConnectionConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DataAwsVpcPeeringConnectionConfig {
        private final java.lang.String cidrBlock;
        private final java.util.List<imports.aws.DataAwsVpcPeeringConnectionFilter> filter;
        private final java.lang.String ownerId;
        private final java.lang.String peerCidrBlock;
        private final java.lang.String peerOwnerId;
        private final java.lang.String peerRegion;
        private final java.lang.String peerVpcId;
        private final java.lang.String region;
        private final java.lang.String status;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.lang.String vpcId;
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
            this.cidrBlock = software.amazon.jsii.Kernel.get(this, "cidrBlock", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.filter = software.amazon.jsii.Kernel.get(this, "filter", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DataAwsVpcPeeringConnectionFilter.class)));
            this.ownerId = software.amazon.jsii.Kernel.get(this, "ownerId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.peerCidrBlock = software.amazon.jsii.Kernel.get(this, "peerCidrBlock", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.peerOwnerId = software.amazon.jsii.Kernel.get(this, "peerOwnerId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.peerRegion = software.amazon.jsii.Kernel.get(this, "peerRegion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.peerVpcId = software.amazon.jsii.Kernel.get(this, "peerVpcId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.region = software.amazon.jsii.Kernel.get(this, "region", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.status = software.amazon.jsii.Kernel.get(this, "status", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.vpcId = software.amazon.jsii.Kernel.get(this, "vpcId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String cidrBlock, final java.util.List<? extends imports.aws.DataAwsVpcPeeringConnectionFilter> filter, final java.lang.String ownerId, final java.lang.String peerCidrBlock, final java.lang.String peerOwnerId, final java.lang.String peerRegion, final java.lang.String peerVpcId, final java.lang.String region, final java.lang.String status, final java.util.Map<java.lang.String, java.lang.String> tags, final java.lang.String vpcId, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.cidrBlock = cidrBlock;
            this.filter = (java.util.List<imports.aws.DataAwsVpcPeeringConnectionFilter>)filter;
            this.ownerId = ownerId;
            this.peerCidrBlock = peerCidrBlock;
            this.peerOwnerId = peerOwnerId;
            this.peerRegion = peerRegion;
            this.peerVpcId = peerVpcId;
            this.region = region;
            this.status = status;
            this.tags = tags;
            this.vpcId = vpcId;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getCidrBlock() {
            return this.cidrBlock;
        }

        @Override
        public final java.util.List<imports.aws.DataAwsVpcPeeringConnectionFilter> getFilter() {
            return this.filter;
        }

        @Override
        public final java.lang.String getOwnerId() {
            return this.ownerId;
        }

        @Override
        public final java.lang.String getPeerCidrBlock() {
            return this.peerCidrBlock;
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
        public final java.lang.String getPeerVpcId() {
            return this.peerVpcId;
        }

        @Override
        public final java.lang.String getRegion() {
            return this.region;
        }

        @Override
        public final java.lang.String getStatus() {
            return this.status;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.lang.String getVpcId() {
            return this.vpcId;
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

            if (this.getCidrBlock() != null) {
                data.set("cidrBlock", om.valueToTree(this.getCidrBlock()));
            }
            if (this.getFilter() != null) {
                data.set("filter", om.valueToTree(this.getFilter()));
            }
            if (this.getOwnerId() != null) {
                data.set("ownerId", om.valueToTree(this.getOwnerId()));
            }
            if (this.getPeerCidrBlock() != null) {
                data.set("peerCidrBlock", om.valueToTree(this.getPeerCidrBlock()));
            }
            if (this.getPeerOwnerId() != null) {
                data.set("peerOwnerId", om.valueToTree(this.getPeerOwnerId()));
            }
            if (this.getPeerRegion() != null) {
                data.set("peerRegion", om.valueToTree(this.getPeerRegion()));
            }
            if (this.getPeerVpcId() != null) {
                data.set("peerVpcId", om.valueToTree(this.getPeerVpcId()));
            }
            if (this.getRegion() != null) {
                data.set("region", om.valueToTree(this.getRegion()));
            }
            if (this.getStatus() != null) {
                data.set("status", om.valueToTree(this.getStatus()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getVpcId() != null) {
                data.set("vpcId", om.valueToTree(this.getVpcId()));
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
            struct.set("fqn", om.valueToTree("aws.DataAwsVpcPeeringConnectionConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DataAwsVpcPeeringConnectionConfig.Jsii$Proxy that = (DataAwsVpcPeeringConnectionConfig.Jsii$Proxy) o;

            if (this.cidrBlock != null ? !this.cidrBlock.equals(that.cidrBlock) : that.cidrBlock != null) return false;
            if (this.filter != null ? !this.filter.equals(that.filter) : that.filter != null) return false;
            if (this.ownerId != null ? !this.ownerId.equals(that.ownerId) : that.ownerId != null) return false;
            if (this.peerCidrBlock != null ? !this.peerCidrBlock.equals(that.peerCidrBlock) : that.peerCidrBlock != null) return false;
            if (this.peerOwnerId != null ? !this.peerOwnerId.equals(that.peerOwnerId) : that.peerOwnerId != null) return false;
            if (this.peerRegion != null ? !this.peerRegion.equals(that.peerRegion) : that.peerRegion != null) return false;
            if (this.peerVpcId != null ? !this.peerVpcId.equals(that.peerVpcId) : that.peerVpcId != null) return false;
            if (this.region != null ? !this.region.equals(that.region) : that.region != null) return false;
            if (this.status != null ? !this.status.equals(that.status) : that.status != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.vpcId != null ? !this.vpcId.equals(that.vpcId) : that.vpcId != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.cidrBlock != null ? this.cidrBlock.hashCode() : 0;
            result = 31 * result + (this.filter != null ? this.filter.hashCode() : 0);
            result = 31 * result + (this.ownerId != null ? this.ownerId.hashCode() : 0);
            result = 31 * result + (this.peerCidrBlock != null ? this.peerCidrBlock.hashCode() : 0);
            result = 31 * result + (this.peerOwnerId != null ? this.peerOwnerId.hashCode() : 0);
            result = 31 * result + (this.peerRegion != null ? this.peerRegion.hashCode() : 0);
            result = 31 * result + (this.peerVpcId != null ? this.peerVpcId.hashCode() : 0);
            result = 31 * result + (this.region != null ? this.region.hashCode() : 0);
            result = 31 * result + (this.status != null ? this.status.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.vpcId != null ? this.vpcId.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
