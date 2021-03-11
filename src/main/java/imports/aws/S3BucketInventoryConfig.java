package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.832Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.S3BucketInventoryConfig")
@software.amazon.jsii.Jsii.Proxy(S3BucketInventoryConfig.Jsii$Proxy.class)
public interface S3BucketInventoryConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getBucket();

    /**
     * destination block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.S3BucketInventoryDestination> getDestination();

    @org.jetbrains.annotations.NotNull java.lang.String getIncludedObjectVersions();

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * schedule block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.S3BucketInventorySchedule> getSchedule();

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getEnabled() {
        return null;
    }

    /**
     * filter block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.S3BucketInventoryFilter> getFilter() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getOptionalFields() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link S3BucketInventoryConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link S3BucketInventoryConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<S3BucketInventoryConfig> {
        private java.lang.String bucket;
        private java.util.List<imports.aws.S3BucketInventoryDestination> destination;
        private java.lang.String includedObjectVersions;
        private java.lang.String name;
        private java.util.List<imports.aws.S3BucketInventorySchedule> schedule;
        private java.lang.Boolean enabled;
        private java.util.List<imports.aws.S3BucketInventoryFilter> filter;
        private java.util.List<java.lang.String> optionalFields;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link S3BucketInventoryConfig#getBucket}
         * @param bucket the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder bucket(java.lang.String bucket) {
            this.bucket = bucket;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketInventoryConfig#getDestination}
         * @param destination destination block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder destination(java.util.List<? extends imports.aws.S3BucketInventoryDestination> destination) {
            this.destination = (java.util.List<imports.aws.S3BucketInventoryDestination>)destination;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketInventoryConfig#getIncludedObjectVersions}
         * @param includedObjectVersions the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder includedObjectVersions(java.lang.String includedObjectVersions) {
            this.includedObjectVersions = includedObjectVersions;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketInventoryConfig#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketInventoryConfig#getSchedule}
         * @param schedule schedule block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder schedule(java.util.List<? extends imports.aws.S3BucketInventorySchedule> schedule) {
            this.schedule = (java.util.List<imports.aws.S3BucketInventorySchedule>)schedule;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketInventoryConfig#getEnabled}
         * @param enabled the value to be set.
         * @return {@code this}
         */
        public Builder enabled(java.lang.Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketInventoryConfig#getFilter}
         * @param filter filter block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder filter(java.util.List<? extends imports.aws.S3BucketInventoryFilter> filter) {
            this.filter = (java.util.List<imports.aws.S3BucketInventoryFilter>)filter;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketInventoryConfig#getOptionalFields}
         * @param optionalFields the value to be set.
         * @return {@code this}
         */
        public Builder optionalFields(java.util.List<java.lang.String> optionalFields) {
            this.optionalFields = optionalFields;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketInventoryConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketInventoryConfig#getDependsOn}
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
         * Sets the value of {@link S3BucketInventoryConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketInventoryConfig#getProvider}
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
         * @return a new instance of {@link S3BucketInventoryConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public S3BucketInventoryConfig build() {
            return new Jsii$Proxy(bucket, destination, includedObjectVersions, name, schedule, enabled, filter, optionalFields, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link S3BucketInventoryConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements S3BucketInventoryConfig {
        private final java.lang.String bucket;
        private final java.util.List<imports.aws.S3BucketInventoryDestination> destination;
        private final java.lang.String includedObjectVersions;
        private final java.lang.String name;
        private final java.util.List<imports.aws.S3BucketInventorySchedule> schedule;
        private final java.lang.Boolean enabled;
        private final java.util.List<imports.aws.S3BucketInventoryFilter> filter;
        private final java.util.List<java.lang.String> optionalFields;
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
            this.bucket = software.amazon.jsii.Kernel.get(this, "bucket", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.destination = software.amazon.jsii.Kernel.get(this, "destination", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.S3BucketInventoryDestination.class)));
            this.includedObjectVersions = software.amazon.jsii.Kernel.get(this, "includedObjectVersions", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.schedule = software.amazon.jsii.Kernel.get(this, "schedule", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.S3BucketInventorySchedule.class)));
            this.enabled = software.amazon.jsii.Kernel.get(this, "enabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.filter = software.amazon.jsii.Kernel.get(this, "filter", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.S3BucketInventoryFilter.class)));
            this.optionalFields = software.amazon.jsii.Kernel.get(this, "optionalFields", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String bucket, final java.util.List<? extends imports.aws.S3BucketInventoryDestination> destination, final java.lang.String includedObjectVersions, final java.lang.String name, final java.util.List<? extends imports.aws.S3BucketInventorySchedule> schedule, final java.lang.Boolean enabled, final java.util.List<? extends imports.aws.S3BucketInventoryFilter> filter, final java.util.List<java.lang.String> optionalFields, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.bucket = java.util.Objects.requireNonNull(bucket, "bucket is required");
            this.destination = (java.util.List<imports.aws.S3BucketInventoryDestination>)java.util.Objects.requireNonNull(destination, "destination is required");
            this.includedObjectVersions = java.util.Objects.requireNonNull(includedObjectVersions, "includedObjectVersions is required");
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.schedule = (java.util.List<imports.aws.S3BucketInventorySchedule>)java.util.Objects.requireNonNull(schedule, "schedule is required");
            this.enabled = enabled;
            this.filter = (java.util.List<imports.aws.S3BucketInventoryFilter>)filter;
            this.optionalFields = optionalFields;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getBucket() {
            return this.bucket;
        }

        @Override
        public final java.util.List<imports.aws.S3BucketInventoryDestination> getDestination() {
            return this.destination;
        }

        @Override
        public final java.lang.String getIncludedObjectVersions() {
            return this.includedObjectVersions;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.util.List<imports.aws.S3BucketInventorySchedule> getSchedule() {
            return this.schedule;
        }

        @Override
        public final java.lang.Boolean getEnabled() {
            return this.enabled;
        }

        @Override
        public final java.util.List<imports.aws.S3BucketInventoryFilter> getFilter() {
            return this.filter;
        }

        @Override
        public final java.util.List<java.lang.String> getOptionalFields() {
            return this.optionalFields;
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

            data.set("bucket", om.valueToTree(this.getBucket()));
            data.set("destination", om.valueToTree(this.getDestination()));
            data.set("includedObjectVersions", om.valueToTree(this.getIncludedObjectVersions()));
            data.set("name", om.valueToTree(this.getName()));
            data.set("schedule", om.valueToTree(this.getSchedule()));
            if (this.getEnabled() != null) {
                data.set("enabled", om.valueToTree(this.getEnabled()));
            }
            if (this.getFilter() != null) {
                data.set("filter", om.valueToTree(this.getFilter()));
            }
            if (this.getOptionalFields() != null) {
                data.set("optionalFields", om.valueToTree(this.getOptionalFields()));
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
            struct.set("fqn", om.valueToTree("aws.S3BucketInventoryConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            S3BucketInventoryConfig.Jsii$Proxy that = (S3BucketInventoryConfig.Jsii$Proxy) o;

            if (!bucket.equals(that.bucket)) return false;
            if (!destination.equals(that.destination)) return false;
            if (!includedObjectVersions.equals(that.includedObjectVersions)) return false;
            if (!name.equals(that.name)) return false;
            if (!schedule.equals(that.schedule)) return false;
            if (this.enabled != null ? !this.enabled.equals(that.enabled) : that.enabled != null) return false;
            if (this.filter != null ? !this.filter.equals(that.filter) : that.filter != null) return false;
            if (this.optionalFields != null ? !this.optionalFields.equals(that.optionalFields) : that.optionalFields != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.bucket.hashCode();
            result = 31 * result + (this.destination.hashCode());
            result = 31 * result + (this.includedObjectVersions.hashCode());
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.schedule.hashCode());
            result = 31 * result + (this.enabled != null ? this.enabled.hashCode() : 0);
            result = 31 * result + (this.filter != null ? this.filter.hashCode() : 0);
            result = 31 * result + (this.optionalFields != null ? this.optionalFields.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
