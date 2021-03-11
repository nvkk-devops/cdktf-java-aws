package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.227Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.DataAwsAmiIdsConfig")
@software.amazon.jsii.Jsii.Proxy(DataAwsAmiIdsConfig.Jsii$Proxy.class)
public interface DataAwsAmiIdsConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getOwners();

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getExecutableUsers() {
        return null;
    }

    /**
     * filter block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.DataAwsAmiIdsFilter> getFilter() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getNameRegex() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getSortAscending() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DataAwsAmiIdsConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DataAwsAmiIdsConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DataAwsAmiIdsConfig> {
        private java.util.List<java.lang.String> owners;
        private java.util.List<java.lang.String> executableUsers;
        private java.util.List<imports.aws.DataAwsAmiIdsFilter> filter;
        private java.lang.String nameRegex;
        private java.lang.Boolean sortAscending;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link DataAwsAmiIdsConfig#getOwners}
         * @param owners the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder owners(java.util.List<java.lang.String> owners) {
            this.owners = owners;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsAmiIdsConfig#getExecutableUsers}
         * @param executableUsers the value to be set.
         * @return {@code this}
         */
        public Builder executableUsers(java.util.List<java.lang.String> executableUsers) {
            this.executableUsers = executableUsers;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsAmiIdsConfig#getFilter}
         * @param filter filter block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder filter(java.util.List<? extends imports.aws.DataAwsAmiIdsFilter> filter) {
            this.filter = (java.util.List<imports.aws.DataAwsAmiIdsFilter>)filter;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsAmiIdsConfig#getNameRegex}
         * @param nameRegex the value to be set.
         * @return {@code this}
         */
        public Builder nameRegex(java.lang.String nameRegex) {
            this.nameRegex = nameRegex;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsAmiIdsConfig#getSortAscending}
         * @param sortAscending the value to be set.
         * @return {@code this}
         */
        public Builder sortAscending(java.lang.Boolean sortAscending) {
            this.sortAscending = sortAscending;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsAmiIdsConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsAmiIdsConfig#getDependsOn}
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
         * Sets the value of {@link DataAwsAmiIdsConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsAmiIdsConfig#getProvider}
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
         * @return a new instance of {@link DataAwsAmiIdsConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DataAwsAmiIdsConfig build() {
            return new Jsii$Proxy(owners, executableUsers, filter, nameRegex, sortAscending, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link DataAwsAmiIdsConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DataAwsAmiIdsConfig {
        private final java.util.List<java.lang.String> owners;
        private final java.util.List<java.lang.String> executableUsers;
        private final java.util.List<imports.aws.DataAwsAmiIdsFilter> filter;
        private final java.lang.String nameRegex;
        private final java.lang.Boolean sortAscending;
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
            this.owners = software.amazon.jsii.Kernel.get(this, "owners", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.executableUsers = software.amazon.jsii.Kernel.get(this, "executableUsers", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.filter = software.amazon.jsii.Kernel.get(this, "filter", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DataAwsAmiIdsFilter.class)));
            this.nameRegex = software.amazon.jsii.Kernel.get(this, "nameRegex", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.sortAscending = software.amazon.jsii.Kernel.get(this, "sortAscending", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<java.lang.String> owners, final java.util.List<java.lang.String> executableUsers, final java.util.List<? extends imports.aws.DataAwsAmiIdsFilter> filter, final java.lang.String nameRegex, final java.lang.Boolean sortAscending, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.owners = java.util.Objects.requireNonNull(owners, "owners is required");
            this.executableUsers = executableUsers;
            this.filter = (java.util.List<imports.aws.DataAwsAmiIdsFilter>)filter;
            this.nameRegex = nameRegex;
            this.sortAscending = sortAscending;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.util.List<java.lang.String> getOwners() {
            return this.owners;
        }

        @Override
        public final java.util.List<java.lang.String> getExecutableUsers() {
            return this.executableUsers;
        }

        @Override
        public final java.util.List<imports.aws.DataAwsAmiIdsFilter> getFilter() {
            return this.filter;
        }

        @Override
        public final java.lang.String getNameRegex() {
            return this.nameRegex;
        }

        @Override
        public final java.lang.Boolean getSortAscending() {
            return this.sortAscending;
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

            data.set("owners", om.valueToTree(this.getOwners()));
            if (this.getExecutableUsers() != null) {
                data.set("executableUsers", om.valueToTree(this.getExecutableUsers()));
            }
            if (this.getFilter() != null) {
                data.set("filter", om.valueToTree(this.getFilter()));
            }
            if (this.getNameRegex() != null) {
                data.set("nameRegex", om.valueToTree(this.getNameRegex()));
            }
            if (this.getSortAscending() != null) {
                data.set("sortAscending", om.valueToTree(this.getSortAscending()));
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
            struct.set("fqn", om.valueToTree("aws.DataAwsAmiIdsConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DataAwsAmiIdsConfig.Jsii$Proxy that = (DataAwsAmiIdsConfig.Jsii$Proxy) o;

            if (!owners.equals(that.owners)) return false;
            if (this.executableUsers != null ? !this.executableUsers.equals(that.executableUsers) : that.executableUsers != null) return false;
            if (this.filter != null ? !this.filter.equals(that.filter) : that.filter != null) return false;
            if (this.nameRegex != null ? !this.nameRegex.equals(that.nameRegex) : that.nameRegex != null) return false;
            if (this.sortAscending != null ? !this.sortAscending.equals(that.sortAscending) : that.sortAscending != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.owners.hashCode();
            result = 31 * result + (this.executableUsers != null ? this.executableUsers.hashCode() : 0);
            result = 31 * result + (this.filter != null ? this.filter.hashCode() : 0);
            result = 31 * result + (this.nameRegex != null ? this.nameRegex.hashCode() : 0);
            result = 31 * result + (this.sortAscending != null ? this.sortAscending.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
