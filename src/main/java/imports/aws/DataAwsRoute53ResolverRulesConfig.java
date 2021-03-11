package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.353Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.DataAwsRoute53ResolverRulesConfig")
@software.amazon.jsii.Jsii.Proxy(DataAwsRoute53ResolverRulesConfig.Jsii$Proxy.class)
public interface DataAwsRoute53ResolverRulesConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    default @org.jetbrains.annotations.Nullable java.lang.String getOwnerId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getResolverEndpointId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getRuleType() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getShareStatus() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DataAwsRoute53ResolverRulesConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DataAwsRoute53ResolverRulesConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DataAwsRoute53ResolverRulesConfig> {
        private java.lang.String ownerId;
        private java.lang.String resolverEndpointId;
        private java.lang.String ruleType;
        private java.lang.String shareStatus;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link DataAwsRoute53ResolverRulesConfig#getOwnerId}
         * @param ownerId the value to be set.
         * @return {@code this}
         */
        public Builder ownerId(java.lang.String ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsRoute53ResolverRulesConfig#getResolverEndpointId}
         * @param resolverEndpointId the value to be set.
         * @return {@code this}
         */
        public Builder resolverEndpointId(java.lang.String resolverEndpointId) {
            this.resolverEndpointId = resolverEndpointId;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsRoute53ResolverRulesConfig#getRuleType}
         * @param ruleType the value to be set.
         * @return {@code this}
         */
        public Builder ruleType(java.lang.String ruleType) {
            this.ruleType = ruleType;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsRoute53ResolverRulesConfig#getShareStatus}
         * @param shareStatus the value to be set.
         * @return {@code this}
         */
        public Builder shareStatus(java.lang.String shareStatus) {
            this.shareStatus = shareStatus;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsRoute53ResolverRulesConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsRoute53ResolverRulesConfig#getDependsOn}
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
         * Sets the value of {@link DataAwsRoute53ResolverRulesConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsRoute53ResolverRulesConfig#getProvider}
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
         * @return a new instance of {@link DataAwsRoute53ResolverRulesConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DataAwsRoute53ResolverRulesConfig build() {
            return new Jsii$Proxy(ownerId, resolverEndpointId, ruleType, shareStatus, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link DataAwsRoute53ResolverRulesConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DataAwsRoute53ResolverRulesConfig {
        private final java.lang.String ownerId;
        private final java.lang.String resolverEndpointId;
        private final java.lang.String ruleType;
        private final java.lang.String shareStatus;
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
            this.ownerId = software.amazon.jsii.Kernel.get(this, "ownerId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.resolverEndpointId = software.amazon.jsii.Kernel.get(this, "resolverEndpointId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.ruleType = software.amazon.jsii.Kernel.get(this, "ruleType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.shareStatus = software.amazon.jsii.Kernel.get(this, "shareStatus", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String ownerId, final java.lang.String resolverEndpointId, final java.lang.String ruleType, final java.lang.String shareStatus, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.ownerId = ownerId;
            this.resolverEndpointId = resolverEndpointId;
            this.ruleType = ruleType;
            this.shareStatus = shareStatus;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getOwnerId() {
            return this.ownerId;
        }

        @Override
        public final java.lang.String getResolverEndpointId() {
            return this.resolverEndpointId;
        }

        @Override
        public final java.lang.String getRuleType() {
            return this.ruleType;
        }

        @Override
        public final java.lang.String getShareStatus() {
            return this.shareStatus;
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

            if (this.getOwnerId() != null) {
                data.set("ownerId", om.valueToTree(this.getOwnerId()));
            }
            if (this.getResolverEndpointId() != null) {
                data.set("resolverEndpointId", om.valueToTree(this.getResolverEndpointId()));
            }
            if (this.getRuleType() != null) {
                data.set("ruleType", om.valueToTree(this.getRuleType()));
            }
            if (this.getShareStatus() != null) {
                data.set("shareStatus", om.valueToTree(this.getShareStatus()));
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
            struct.set("fqn", om.valueToTree("aws.DataAwsRoute53ResolverRulesConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DataAwsRoute53ResolverRulesConfig.Jsii$Proxy that = (DataAwsRoute53ResolverRulesConfig.Jsii$Proxy) o;

            if (this.ownerId != null ? !this.ownerId.equals(that.ownerId) : that.ownerId != null) return false;
            if (this.resolverEndpointId != null ? !this.resolverEndpointId.equals(that.resolverEndpointId) : that.resolverEndpointId != null) return false;
            if (this.ruleType != null ? !this.ruleType.equals(that.ruleType) : that.ruleType != null) return false;
            if (this.shareStatus != null ? !this.shareStatus.equals(that.shareStatus) : that.shareStatus != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.ownerId != null ? this.ownerId.hashCode() : 0;
            result = 31 * result + (this.resolverEndpointId != null ? this.resolverEndpointId.hashCode() : 0);
            result = 31 * result + (this.ruleType != null ? this.ruleType.hashCode() : 0);
            result = 31 * result + (this.shareStatus != null ? this.shareStatus.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
