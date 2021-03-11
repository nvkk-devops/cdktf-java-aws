package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.942Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.WafregionalByteMatchSetConfig")
@software.amazon.jsii.Jsii.Proxy(WafregionalByteMatchSetConfig.Jsii$Proxy.class)
public interface WafregionalByteMatchSetConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * byte_match_tuple block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.WafregionalByteMatchSetByteMatchTuple> getByteMatchTuple() {
        return null;
    }

    /**
     * byte_match_tuples block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.WafregionalByteMatchSetByteMatchTuples> getByteMatchTuples() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link WafregionalByteMatchSetConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link WafregionalByteMatchSetConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<WafregionalByteMatchSetConfig> {
        private java.lang.String name;
        private java.util.List<imports.aws.WafregionalByteMatchSetByteMatchTuple> byteMatchTuple;
        private java.util.List<imports.aws.WafregionalByteMatchSetByteMatchTuples> byteMatchTuples;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link WafregionalByteMatchSetConfig#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link WafregionalByteMatchSetConfig#getByteMatchTuple}
         * @param byteMatchTuple byte_match_tuple block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder byteMatchTuple(java.util.List<? extends imports.aws.WafregionalByteMatchSetByteMatchTuple> byteMatchTuple) {
            this.byteMatchTuple = (java.util.List<imports.aws.WafregionalByteMatchSetByteMatchTuple>)byteMatchTuple;
            return this;
        }

        /**
         * Sets the value of {@link WafregionalByteMatchSetConfig#getByteMatchTuples}
         * @param byteMatchTuples byte_match_tuples block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder byteMatchTuples(java.util.List<? extends imports.aws.WafregionalByteMatchSetByteMatchTuples> byteMatchTuples) {
            this.byteMatchTuples = (java.util.List<imports.aws.WafregionalByteMatchSetByteMatchTuples>)byteMatchTuples;
            return this;
        }

        /**
         * Sets the value of {@link WafregionalByteMatchSetConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link WafregionalByteMatchSetConfig#getDependsOn}
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
         * Sets the value of {@link WafregionalByteMatchSetConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link WafregionalByteMatchSetConfig#getProvider}
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
         * @return a new instance of {@link WafregionalByteMatchSetConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public WafregionalByteMatchSetConfig build() {
            return new Jsii$Proxy(name, byteMatchTuple, byteMatchTuples, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link WafregionalByteMatchSetConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements WafregionalByteMatchSetConfig {
        private final java.lang.String name;
        private final java.util.List<imports.aws.WafregionalByteMatchSetByteMatchTuple> byteMatchTuple;
        private final java.util.List<imports.aws.WafregionalByteMatchSetByteMatchTuples> byteMatchTuples;
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
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.byteMatchTuple = software.amazon.jsii.Kernel.get(this, "byteMatchTuple", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.WafregionalByteMatchSetByteMatchTuple.class)));
            this.byteMatchTuples = software.amazon.jsii.Kernel.get(this, "byteMatchTuples", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.WafregionalByteMatchSetByteMatchTuples.class)));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String name, final java.util.List<? extends imports.aws.WafregionalByteMatchSetByteMatchTuple> byteMatchTuple, final java.util.List<? extends imports.aws.WafregionalByteMatchSetByteMatchTuples> byteMatchTuples, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.byteMatchTuple = (java.util.List<imports.aws.WafregionalByteMatchSetByteMatchTuple>)byteMatchTuple;
            this.byteMatchTuples = (java.util.List<imports.aws.WafregionalByteMatchSetByteMatchTuples>)byteMatchTuples;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.util.List<imports.aws.WafregionalByteMatchSetByteMatchTuple> getByteMatchTuple() {
            return this.byteMatchTuple;
        }

        @Override
        public final java.util.List<imports.aws.WafregionalByteMatchSetByteMatchTuples> getByteMatchTuples() {
            return this.byteMatchTuples;
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

            data.set("name", om.valueToTree(this.getName()));
            if (this.getByteMatchTuple() != null) {
                data.set("byteMatchTuple", om.valueToTree(this.getByteMatchTuple()));
            }
            if (this.getByteMatchTuples() != null) {
                data.set("byteMatchTuples", om.valueToTree(this.getByteMatchTuples()));
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
            struct.set("fqn", om.valueToTree("aws.WafregionalByteMatchSetConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            WafregionalByteMatchSetConfig.Jsii$Proxy that = (WafregionalByteMatchSetConfig.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (this.byteMatchTuple != null ? !this.byteMatchTuple.equals(that.byteMatchTuple) : that.byteMatchTuple != null) return false;
            if (this.byteMatchTuples != null ? !this.byteMatchTuples.equals(that.byteMatchTuples) : that.byteMatchTuples != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.byteMatchTuple != null ? this.byteMatchTuple.hashCode() : 0);
            result = 31 * result + (this.byteMatchTuples != null ? this.byteMatchTuples.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
