package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.202Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.ConfigConfigRuleSource")
@software.amazon.jsii.Jsii.Proxy(ConfigConfigRuleSource.Jsii$Proxy.class)
public interface ConfigConfigRuleSource extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getOwner();

    @org.jetbrains.annotations.NotNull java.lang.String getSourceIdentifier();

    /**
     * source_detail block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ConfigConfigRuleSourceSourceDetail> getSourceDetail() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ConfigConfigRuleSource}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ConfigConfigRuleSource}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ConfigConfigRuleSource> {
        private java.lang.String owner;
        private java.lang.String sourceIdentifier;
        private java.util.List<imports.aws.ConfigConfigRuleSourceSourceDetail> sourceDetail;

        /**
         * Sets the value of {@link ConfigConfigRuleSource#getOwner}
         * @param owner the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder owner(java.lang.String owner) {
            this.owner = owner;
            return this;
        }

        /**
         * Sets the value of {@link ConfigConfigRuleSource#getSourceIdentifier}
         * @param sourceIdentifier the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder sourceIdentifier(java.lang.String sourceIdentifier) {
            this.sourceIdentifier = sourceIdentifier;
            return this;
        }

        /**
         * Sets the value of {@link ConfigConfigRuleSource#getSourceDetail}
         * @param sourceDetail source_detail block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder sourceDetail(java.util.List<? extends imports.aws.ConfigConfigRuleSourceSourceDetail> sourceDetail) {
            this.sourceDetail = (java.util.List<imports.aws.ConfigConfigRuleSourceSourceDetail>)sourceDetail;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ConfigConfigRuleSource}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ConfigConfigRuleSource build() {
            return new Jsii$Proxy(owner, sourceIdentifier, sourceDetail);
        }
    }

    /**
     * An implementation for {@link ConfigConfigRuleSource}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ConfigConfigRuleSource {
        private final java.lang.String owner;
        private final java.lang.String sourceIdentifier;
        private final java.util.List<imports.aws.ConfigConfigRuleSourceSourceDetail> sourceDetail;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.owner = software.amazon.jsii.Kernel.get(this, "owner", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.sourceIdentifier = software.amazon.jsii.Kernel.get(this, "sourceIdentifier", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.sourceDetail = software.amazon.jsii.Kernel.get(this, "sourceDetail", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ConfigConfigRuleSourceSourceDetail.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String owner, final java.lang.String sourceIdentifier, final java.util.List<? extends imports.aws.ConfigConfigRuleSourceSourceDetail> sourceDetail) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.owner = java.util.Objects.requireNonNull(owner, "owner is required");
            this.sourceIdentifier = java.util.Objects.requireNonNull(sourceIdentifier, "sourceIdentifier is required");
            this.sourceDetail = (java.util.List<imports.aws.ConfigConfigRuleSourceSourceDetail>)sourceDetail;
        }

        @Override
        public final java.lang.String getOwner() {
            return this.owner;
        }

        @Override
        public final java.lang.String getSourceIdentifier() {
            return this.sourceIdentifier;
        }

        @Override
        public final java.util.List<imports.aws.ConfigConfigRuleSourceSourceDetail> getSourceDetail() {
            return this.sourceDetail;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("owner", om.valueToTree(this.getOwner()));
            data.set("sourceIdentifier", om.valueToTree(this.getSourceIdentifier()));
            if (this.getSourceDetail() != null) {
                data.set("sourceDetail", om.valueToTree(this.getSourceDetail()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.ConfigConfigRuleSource"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ConfigConfigRuleSource.Jsii$Proxy that = (ConfigConfigRuleSource.Jsii$Proxy) o;

            if (!owner.equals(that.owner)) return false;
            if (!sourceIdentifier.equals(that.sourceIdentifier)) return false;
            return this.sourceDetail != null ? this.sourceDetail.equals(that.sourceDetail) : that.sourceDetail == null;
        }

        @Override
        public final int hashCode() {
            int result = this.owner.hashCode();
            result = 31 * result + (this.sourceIdentifier.hashCode());
            result = 31 * result + (this.sourceDetail != null ? this.sourceDetail.hashCode() : 0);
            return result;
        }
    }
}
