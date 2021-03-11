package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.373Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.DataAwsSsmPatchBaselineConfig")
@software.amazon.jsii.Jsii.Proxy(DataAwsSsmPatchBaselineConfig.Jsii$Proxy.class)
public interface DataAwsSsmPatchBaselineConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getOwner();

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getDefaultBaseline() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getNamePrefix() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getOperatingSystem() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DataAwsSsmPatchBaselineConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DataAwsSsmPatchBaselineConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DataAwsSsmPatchBaselineConfig> {
        private java.lang.String owner;
        private java.lang.Boolean defaultBaseline;
        private java.lang.String namePrefix;
        private java.lang.String operatingSystem;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link DataAwsSsmPatchBaselineConfig#getOwner}
         * @param owner the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder owner(java.lang.String owner) {
            this.owner = owner;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsSsmPatchBaselineConfig#getDefaultBaseline}
         * @param defaultBaseline the value to be set.
         * @return {@code this}
         */
        public Builder defaultBaseline(java.lang.Boolean defaultBaseline) {
            this.defaultBaseline = defaultBaseline;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsSsmPatchBaselineConfig#getNamePrefix}
         * @param namePrefix the value to be set.
         * @return {@code this}
         */
        public Builder namePrefix(java.lang.String namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsSsmPatchBaselineConfig#getOperatingSystem}
         * @param operatingSystem the value to be set.
         * @return {@code this}
         */
        public Builder operatingSystem(java.lang.String operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsSsmPatchBaselineConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsSsmPatchBaselineConfig#getDependsOn}
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
         * Sets the value of {@link DataAwsSsmPatchBaselineConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsSsmPatchBaselineConfig#getProvider}
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
         * @return a new instance of {@link DataAwsSsmPatchBaselineConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DataAwsSsmPatchBaselineConfig build() {
            return new Jsii$Proxy(owner, defaultBaseline, namePrefix, operatingSystem, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link DataAwsSsmPatchBaselineConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DataAwsSsmPatchBaselineConfig {
        private final java.lang.String owner;
        private final java.lang.Boolean defaultBaseline;
        private final java.lang.String namePrefix;
        private final java.lang.String operatingSystem;
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
            this.owner = software.amazon.jsii.Kernel.get(this, "owner", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.defaultBaseline = software.amazon.jsii.Kernel.get(this, "defaultBaseline", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.namePrefix = software.amazon.jsii.Kernel.get(this, "namePrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.operatingSystem = software.amazon.jsii.Kernel.get(this, "operatingSystem", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String owner, final java.lang.Boolean defaultBaseline, final java.lang.String namePrefix, final java.lang.String operatingSystem, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.owner = java.util.Objects.requireNonNull(owner, "owner is required");
            this.defaultBaseline = defaultBaseline;
            this.namePrefix = namePrefix;
            this.operatingSystem = operatingSystem;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getOwner() {
            return this.owner;
        }

        @Override
        public final java.lang.Boolean getDefaultBaseline() {
            return this.defaultBaseline;
        }

        @Override
        public final java.lang.String getNamePrefix() {
            return this.namePrefix;
        }

        @Override
        public final java.lang.String getOperatingSystem() {
            return this.operatingSystem;
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

            data.set("owner", om.valueToTree(this.getOwner()));
            if (this.getDefaultBaseline() != null) {
                data.set("defaultBaseline", om.valueToTree(this.getDefaultBaseline()));
            }
            if (this.getNamePrefix() != null) {
                data.set("namePrefix", om.valueToTree(this.getNamePrefix()));
            }
            if (this.getOperatingSystem() != null) {
                data.set("operatingSystem", om.valueToTree(this.getOperatingSystem()));
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
            struct.set("fqn", om.valueToTree("aws.DataAwsSsmPatchBaselineConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DataAwsSsmPatchBaselineConfig.Jsii$Proxy that = (DataAwsSsmPatchBaselineConfig.Jsii$Proxy) o;

            if (!owner.equals(that.owner)) return false;
            if (this.defaultBaseline != null ? !this.defaultBaseline.equals(that.defaultBaseline) : that.defaultBaseline != null) return false;
            if (this.namePrefix != null ? !this.namePrefix.equals(that.namePrefix) : that.namePrefix != null) return false;
            if (this.operatingSystem != null ? !this.operatingSystem.equals(that.operatingSystem) : that.operatingSystem != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.owner.hashCode();
            result = 31 * result + (this.defaultBaseline != null ? this.defaultBaseline.hashCode() : 0);
            result = 31 * result + (this.namePrefix != null ? this.namePrefix.hashCode() : 0);
            result = 31 * result + (this.operatingSystem != null ? this.operatingSystem.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}