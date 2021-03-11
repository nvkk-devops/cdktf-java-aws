package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.777Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.OrganizationsAccountConfig")
@software.amazon.jsii.Jsii.Proxy(OrganizationsAccountConfig.Jsii$Proxy.class)
public interface OrganizationsAccountConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getEmail();

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    default @org.jetbrains.annotations.Nullable java.lang.String getIamUserAccessToBilling() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getParentId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getRoleName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link OrganizationsAccountConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link OrganizationsAccountConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<OrganizationsAccountConfig> {
        private java.lang.String email;
        private java.lang.String name;
        private java.lang.String iamUserAccessToBilling;
        private java.lang.String parentId;
        private java.lang.String roleName;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link OrganizationsAccountConfig#getEmail}
         * @param email the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder email(java.lang.String email) {
            this.email = email;
            return this;
        }

        /**
         * Sets the value of {@link OrganizationsAccountConfig#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link OrganizationsAccountConfig#getIamUserAccessToBilling}
         * @param iamUserAccessToBilling the value to be set.
         * @return {@code this}
         */
        public Builder iamUserAccessToBilling(java.lang.String iamUserAccessToBilling) {
            this.iamUserAccessToBilling = iamUserAccessToBilling;
            return this;
        }

        /**
         * Sets the value of {@link OrganizationsAccountConfig#getParentId}
         * @param parentId the value to be set.
         * @return {@code this}
         */
        public Builder parentId(java.lang.String parentId) {
            this.parentId = parentId;
            return this;
        }

        /**
         * Sets the value of {@link OrganizationsAccountConfig#getRoleName}
         * @param roleName the value to be set.
         * @return {@code this}
         */
        public Builder roleName(java.lang.String roleName) {
            this.roleName = roleName;
            return this;
        }

        /**
         * Sets the value of {@link OrganizationsAccountConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link OrganizationsAccountConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link OrganizationsAccountConfig#getDependsOn}
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
         * Sets the value of {@link OrganizationsAccountConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link OrganizationsAccountConfig#getProvider}
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
         * @return a new instance of {@link OrganizationsAccountConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public OrganizationsAccountConfig build() {
            return new Jsii$Proxy(email, name, iamUserAccessToBilling, parentId, roleName, tags, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link OrganizationsAccountConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements OrganizationsAccountConfig {
        private final java.lang.String email;
        private final java.lang.String name;
        private final java.lang.String iamUserAccessToBilling;
        private final java.lang.String parentId;
        private final java.lang.String roleName;
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
            this.email = software.amazon.jsii.Kernel.get(this, "email", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.iamUserAccessToBilling = software.amazon.jsii.Kernel.get(this, "iamUserAccessToBilling", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.parentId = software.amazon.jsii.Kernel.get(this, "parentId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.roleName = software.amazon.jsii.Kernel.get(this, "roleName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
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
        protected Jsii$Proxy(final java.lang.String email, final java.lang.String name, final java.lang.String iamUserAccessToBilling, final java.lang.String parentId, final java.lang.String roleName, final java.util.Map<java.lang.String, java.lang.String> tags, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.email = java.util.Objects.requireNonNull(email, "email is required");
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.iamUserAccessToBilling = iamUserAccessToBilling;
            this.parentId = parentId;
            this.roleName = roleName;
            this.tags = tags;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getEmail() {
            return this.email;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getIamUserAccessToBilling() {
            return this.iamUserAccessToBilling;
        }

        @Override
        public final java.lang.String getParentId() {
            return this.parentId;
        }

        @Override
        public final java.lang.String getRoleName() {
            return this.roleName;
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

            data.set("email", om.valueToTree(this.getEmail()));
            data.set("name", om.valueToTree(this.getName()));
            if (this.getIamUserAccessToBilling() != null) {
                data.set("iamUserAccessToBilling", om.valueToTree(this.getIamUserAccessToBilling()));
            }
            if (this.getParentId() != null) {
                data.set("parentId", om.valueToTree(this.getParentId()));
            }
            if (this.getRoleName() != null) {
                data.set("roleName", om.valueToTree(this.getRoleName()));
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
            struct.set("fqn", om.valueToTree("aws.OrganizationsAccountConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            OrganizationsAccountConfig.Jsii$Proxy that = (OrganizationsAccountConfig.Jsii$Proxy) o;

            if (!email.equals(that.email)) return false;
            if (!name.equals(that.name)) return false;
            if (this.iamUserAccessToBilling != null ? !this.iamUserAccessToBilling.equals(that.iamUserAccessToBilling) : that.iamUserAccessToBilling != null) return false;
            if (this.parentId != null ? !this.parentId.equals(that.parentId) : that.parentId != null) return false;
            if (this.roleName != null ? !this.roleName.equals(that.roleName) : that.roleName != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.email.hashCode();
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.iamUserAccessToBilling != null ? this.iamUserAccessToBilling.hashCode() : 0);
            result = 31 * result + (this.parentId != null ? this.parentId.hashCode() : 0);
            result = 31 * result + (this.roleName != null ? this.roleName.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}