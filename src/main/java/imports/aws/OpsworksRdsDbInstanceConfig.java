package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.768Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.OpsworksRdsDbInstanceConfig")
@software.amazon.jsii.Jsii.Proxy(OpsworksRdsDbInstanceConfig.Jsii$Proxy.class)
public interface OpsworksRdsDbInstanceConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getDbPassword();

    @org.jetbrains.annotations.NotNull java.lang.String getDbUser();

    @org.jetbrains.annotations.NotNull java.lang.String getRdsDbInstanceArn();

    @org.jetbrains.annotations.NotNull java.lang.String getStackId();

    /**
     * @return a {@link Builder} of {@link OpsworksRdsDbInstanceConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link OpsworksRdsDbInstanceConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<OpsworksRdsDbInstanceConfig> {
        private java.lang.String dbPassword;
        private java.lang.String dbUser;
        private java.lang.String rdsDbInstanceArn;
        private java.lang.String stackId;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link OpsworksRdsDbInstanceConfig#getDbPassword}
         * @param dbPassword the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder dbPassword(java.lang.String dbPassword) {
            this.dbPassword = dbPassword;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksRdsDbInstanceConfig#getDbUser}
         * @param dbUser the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder dbUser(java.lang.String dbUser) {
            this.dbUser = dbUser;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksRdsDbInstanceConfig#getRdsDbInstanceArn}
         * @param rdsDbInstanceArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder rdsDbInstanceArn(java.lang.String rdsDbInstanceArn) {
            this.rdsDbInstanceArn = rdsDbInstanceArn;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksRdsDbInstanceConfig#getStackId}
         * @param stackId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder stackId(java.lang.String stackId) {
            this.stackId = stackId;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksRdsDbInstanceConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksRdsDbInstanceConfig#getDependsOn}
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
         * Sets the value of {@link OpsworksRdsDbInstanceConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksRdsDbInstanceConfig#getProvider}
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
         * @return a new instance of {@link OpsworksRdsDbInstanceConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public OpsworksRdsDbInstanceConfig build() {
            return new Jsii$Proxy(dbPassword, dbUser, rdsDbInstanceArn, stackId, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link OpsworksRdsDbInstanceConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements OpsworksRdsDbInstanceConfig {
        private final java.lang.String dbPassword;
        private final java.lang.String dbUser;
        private final java.lang.String rdsDbInstanceArn;
        private final java.lang.String stackId;
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
            this.dbPassword = software.amazon.jsii.Kernel.get(this, "dbPassword", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.dbUser = software.amazon.jsii.Kernel.get(this, "dbUser", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.rdsDbInstanceArn = software.amazon.jsii.Kernel.get(this, "rdsDbInstanceArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.stackId = software.amazon.jsii.Kernel.get(this, "stackId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String dbPassword, final java.lang.String dbUser, final java.lang.String rdsDbInstanceArn, final java.lang.String stackId, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.dbPassword = java.util.Objects.requireNonNull(dbPassword, "dbPassword is required");
            this.dbUser = java.util.Objects.requireNonNull(dbUser, "dbUser is required");
            this.rdsDbInstanceArn = java.util.Objects.requireNonNull(rdsDbInstanceArn, "rdsDbInstanceArn is required");
            this.stackId = java.util.Objects.requireNonNull(stackId, "stackId is required");
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getDbPassword() {
            return this.dbPassword;
        }

        @Override
        public final java.lang.String getDbUser() {
            return this.dbUser;
        }

        @Override
        public final java.lang.String getRdsDbInstanceArn() {
            return this.rdsDbInstanceArn;
        }

        @Override
        public final java.lang.String getStackId() {
            return this.stackId;
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

            data.set("dbPassword", om.valueToTree(this.getDbPassword()));
            data.set("dbUser", om.valueToTree(this.getDbUser()));
            data.set("rdsDbInstanceArn", om.valueToTree(this.getRdsDbInstanceArn()));
            data.set("stackId", om.valueToTree(this.getStackId()));
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
            struct.set("fqn", om.valueToTree("aws.OpsworksRdsDbInstanceConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            OpsworksRdsDbInstanceConfig.Jsii$Proxy that = (OpsworksRdsDbInstanceConfig.Jsii$Proxy) o;

            if (!dbPassword.equals(that.dbPassword)) return false;
            if (!dbUser.equals(that.dbUser)) return false;
            if (!rdsDbInstanceArn.equals(that.rdsDbInstanceArn)) return false;
            if (!stackId.equals(that.stackId)) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.dbPassword.hashCode();
            result = 31 * result + (this.dbUser.hashCode());
            result = 31 * result + (this.rdsDbInstanceArn.hashCode());
            result = 31 * result + (this.stackId.hashCode());
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
