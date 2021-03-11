package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.670Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.KmsGrantConfig")
@software.amazon.jsii.Jsii.Proxy(KmsGrantConfig.Jsii$Proxy.class)
public interface KmsGrantConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getGranteePrincipal();

    @org.jetbrains.annotations.NotNull java.lang.String getKeyId();

    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getOperations();

    /**
     * constraints block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.KmsGrantConstraints> getConstraints() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getGrantCreationTokens() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getRetireOnDelete() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getRetiringPrincipal() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KmsGrantConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KmsGrantConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KmsGrantConfig> {
        private java.lang.String granteePrincipal;
        private java.lang.String keyId;
        private java.util.List<java.lang.String> operations;
        private java.util.List<imports.aws.KmsGrantConstraints> constraints;
        private java.util.List<java.lang.String> grantCreationTokens;
        private java.lang.String name;
        private java.lang.Boolean retireOnDelete;
        private java.lang.String retiringPrincipal;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link KmsGrantConfig#getGranteePrincipal}
         * @param granteePrincipal the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder granteePrincipal(java.lang.String granteePrincipal) {
            this.granteePrincipal = granteePrincipal;
            return this;
        }

        /**
         * Sets the value of {@link KmsGrantConfig#getKeyId}
         * @param keyId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder keyId(java.lang.String keyId) {
            this.keyId = keyId;
            return this;
        }

        /**
         * Sets the value of {@link KmsGrantConfig#getOperations}
         * @param operations the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder operations(java.util.List<java.lang.String> operations) {
            this.operations = operations;
            return this;
        }

        /**
         * Sets the value of {@link KmsGrantConfig#getConstraints}
         * @param constraints constraints block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder constraints(java.util.List<? extends imports.aws.KmsGrantConstraints> constraints) {
            this.constraints = (java.util.List<imports.aws.KmsGrantConstraints>)constraints;
            return this;
        }

        /**
         * Sets the value of {@link KmsGrantConfig#getGrantCreationTokens}
         * @param grantCreationTokens the value to be set.
         * @return {@code this}
         */
        public Builder grantCreationTokens(java.util.List<java.lang.String> grantCreationTokens) {
            this.grantCreationTokens = grantCreationTokens;
            return this;
        }

        /**
         * Sets the value of {@link KmsGrantConfig#getName}
         * @param name the value to be set.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link KmsGrantConfig#getRetireOnDelete}
         * @param retireOnDelete the value to be set.
         * @return {@code this}
         */
        public Builder retireOnDelete(java.lang.Boolean retireOnDelete) {
            this.retireOnDelete = retireOnDelete;
            return this;
        }

        /**
         * Sets the value of {@link KmsGrantConfig#getRetiringPrincipal}
         * @param retiringPrincipal the value to be set.
         * @return {@code this}
         */
        public Builder retiringPrincipal(java.lang.String retiringPrincipal) {
            this.retiringPrincipal = retiringPrincipal;
            return this;
        }

        /**
         * Sets the value of {@link KmsGrantConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link KmsGrantConfig#getDependsOn}
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
         * Sets the value of {@link KmsGrantConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link KmsGrantConfig#getProvider}
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
         * @return a new instance of {@link KmsGrantConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KmsGrantConfig build() {
            return new Jsii$Proxy(granteePrincipal, keyId, operations, constraints, grantCreationTokens, name, retireOnDelete, retiringPrincipal, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link KmsGrantConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KmsGrantConfig {
        private final java.lang.String granteePrincipal;
        private final java.lang.String keyId;
        private final java.util.List<java.lang.String> operations;
        private final java.util.List<imports.aws.KmsGrantConstraints> constraints;
        private final java.util.List<java.lang.String> grantCreationTokens;
        private final java.lang.String name;
        private final java.lang.Boolean retireOnDelete;
        private final java.lang.String retiringPrincipal;
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
            this.granteePrincipal = software.amazon.jsii.Kernel.get(this, "granteePrincipal", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.keyId = software.amazon.jsii.Kernel.get(this, "keyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.operations = software.amazon.jsii.Kernel.get(this, "operations", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.constraints = software.amazon.jsii.Kernel.get(this, "constraints", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KmsGrantConstraints.class)));
            this.grantCreationTokens = software.amazon.jsii.Kernel.get(this, "grantCreationTokens", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.retireOnDelete = software.amazon.jsii.Kernel.get(this, "retireOnDelete", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.retiringPrincipal = software.amazon.jsii.Kernel.get(this, "retiringPrincipal", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String granteePrincipal, final java.lang.String keyId, final java.util.List<java.lang.String> operations, final java.util.List<? extends imports.aws.KmsGrantConstraints> constraints, final java.util.List<java.lang.String> grantCreationTokens, final java.lang.String name, final java.lang.Boolean retireOnDelete, final java.lang.String retiringPrincipal, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.granteePrincipal = java.util.Objects.requireNonNull(granteePrincipal, "granteePrincipal is required");
            this.keyId = java.util.Objects.requireNonNull(keyId, "keyId is required");
            this.operations = java.util.Objects.requireNonNull(operations, "operations is required");
            this.constraints = (java.util.List<imports.aws.KmsGrantConstraints>)constraints;
            this.grantCreationTokens = grantCreationTokens;
            this.name = name;
            this.retireOnDelete = retireOnDelete;
            this.retiringPrincipal = retiringPrincipal;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getGranteePrincipal() {
            return this.granteePrincipal;
        }

        @Override
        public final java.lang.String getKeyId() {
            return this.keyId;
        }

        @Override
        public final java.util.List<java.lang.String> getOperations() {
            return this.operations;
        }

        @Override
        public final java.util.List<imports.aws.KmsGrantConstraints> getConstraints() {
            return this.constraints;
        }

        @Override
        public final java.util.List<java.lang.String> getGrantCreationTokens() {
            return this.grantCreationTokens;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.Boolean getRetireOnDelete() {
            return this.retireOnDelete;
        }

        @Override
        public final java.lang.String getRetiringPrincipal() {
            return this.retiringPrincipal;
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

            data.set("granteePrincipal", om.valueToTree(this.getGranteePrincipal()));
            data.set("keyId", om.valueToTree(this.getKeyId()));
            data.set("operations", om.valueToTree(this.getOperations()));
            if (this.getConstraints() != null) {
                data.set("constraints", om.valueToTree(this.getConstraints()));
            }
            if (this.getGrantCreationTokens() != null) {
                data.set("grantCreationTokens", om.valueToTree(this.getGrantCreationTokens()));
            }
            if (this.getName() != null) {
                data.set("name", om.valueToTree(this.getName()));
            }
            if (this.getRetireOnDelete() != null) {
                data.set("retireOnDelete", om.valueToTree(this.getRetireOnDelete()));
            }
            if (this.getRetiringPrincipal() != null) {
                data.set("retiringPrincipal", om.valueToTree(this.getRetiringPrincipal()));
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
            struct.set("fqn", om.valueToTree("aws.KmsGrantConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KmsGrantConfig.Jsii$Proxy that = (KmsGrantConfig.Jsii$Proxy) o;

            if (!granteePrincipal.equals(that.granteePrincipal)) return false;
            if (!keyId.equals(that.keyId)) return false;
            if (!operations.equals(that.operations)) return false;
            if (this.constraints != null ? !this.constraints.equals(that.constraints) : that.constraints != null) return false;
            if (this.grantCreationTokens != null ? !this.grantCreationTokens.equals(that.grantCreationTokens) : that.grantCreationTokens != null) return false;
            if (this.name != null ? !this.name.equals(that.name) : that.name != null) return false;
            if (this.retireOnDelete != null ? !this.retireOnDelete.equals(that.retireOnDelete) : that.retireOnDelete != null) return false;
            if (this.retiringPrincipal != null ? !this.retiringPrincipal.equals(that.retiringPrincipal) : that.retiringPrincipal != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.granteePrincipal.hashCode();
            result = 31 * result + (this.keyId.hashCode());
            result = 31 * result + (this.operations.hashCode());
            result = 31 * result + (this.constraints != null ? this.constraints.hashCode() : 0);
            result = 31 * result + (this.grantCreationTokens != null ? this.grantCreationTokens.hashCode() : 0);
            result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
            result = 31 * result + (this.retireOnDelete != null ? this.retireOnDelete.hashCode() : 0);
            result = 31 * result + (this.retiringPrincipal != null ? this.retiringPrincipal.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
