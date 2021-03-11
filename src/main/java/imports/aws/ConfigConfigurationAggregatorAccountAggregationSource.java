package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.203Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.ConfigConfigurationAggregatorAccountAggregationSource")
@software.amazon.jsii.Jsii.Proxy(ConfigConfigurationAggregatorAccountAggregationSource.Jsii$Proxy.class)
public interface ConfigConfigurationAggregatorAccountAggregationSource extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getAccountIds();

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAllRegions() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getRegions() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ConfigConfigurationAggregatorAccountAggregationSource}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ConfigConfigurationAggregatorAccountAggregationSource}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ConfigConfigurationAggregatorAccountAggregationSource> {
        private java.util.List<java.lang.String> accountIds;
        private java.lang.Boolean allRegions;
        private java.util.List<java.lang.String> regions;

        /**
         * Sets the value of {@link ConfigConfigurationAggregatorAccountAggregationSource#getAccountIds}
         * @param accountIds the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder accountIds(java.util.List<java.lang.String> accountIds) {
            this.accountIds = accountIds;
            return this;
        }

        /**
         * Sets the value of {@link ConfigConfigurationAggregatorAccountAggregationSource#getAllRegions}
         * @param allRegions the value to be set.
         * @return {@code this}
         */
        public Builder allRegions(java.lang.Boolean allRegions) {
            this.allRegions = allRegions;
            return this;
        }

        /**
         * Sets the value of {@link ConfigConfigurationAggregatorAccountAggregationSource#getRegions}
         * @param regions the value to be set.
         * @return {@code this}
         */
        public Builder regions(java.util.List<java.lang.String> regions) {
            this.regions = regions;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ConfigConfigurationAggregatorAccountAggregationSource}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ConfigConfigurationAggregatorAccountAggregationSource build() {
            return new Jsii$Proxy(accountIds, allRegions, regions);
        }
    }

    /**
     * An implementation for {@link ConfigConfigurationAggregatorAccountAggregationSource}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ConfigConfigurationAggregatorAccountAggregationSource {
        private final java.util.List<java.lang.String> accountIds;
        private final java.lang.Boolean allRegions;
        private final java.util.List<java.lang.String> regions;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.accountIds = software.amazon.jsii.Kernel.get(this, "accountIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.allRegions = software.amazon.jsii.Kernel.get(this, "allRegions", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.regions = software.amazon.jsii.Kernel.get(this, "regions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.util.List<java.lang.String> accountIds, final java.lang.Boolean allRegions, final java.util.List<java.lang.String> regions) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.accountIds = java.util.Objects.requireNonNull(accountIds, "accountIds is required");
            this.allRegions = allRegions;
            this.regions = regions;
        }

        @Override
        public final java.util.List<java.lang.String> getAccountIds() {
            return this.accountIds;
        }

        @Override
        public final java.lang.Boolean getAllRegions() {
            return this.allRegions;
        }

        @Override
        public final java.util.List<java.lang.String> getRegions() {
            return this.regions;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("accountIds", om.valueToTree(this.getAccountIds()));
            if (this.getAllRegions() != null) {
                data.set("allRegions", om.valueToTree(this.getAllRegions()));
            }
            if (this.getRegions() != null) {
                data.set("regions", om.valueToTree(this.getRegions()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.ConfigConfigurationAggregatorAccountAggregationSource"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ConfigConfigurationAggregatorAccountAggregationSource.Jsii$Proxy that = (ConfigConfigurationAggregatorAccountAggregationSource.Jsii$Proxy) o;

            if (!accountIds.equals(that.accountIds)) return false;
            if (this.allRegions != null ? !this.allRegions.equals(that.allRegions) : that.allRegions != null) return false;
            return this.regions != null ? this.regions.equals(that.regions) : that.regions == null;
        }

        @Override
        public final int hashCode() {
            int result = this.accountIds.hashCode();
            result = 31 * result + (this.allRegions != null ? this.allRegions.hashCode() : 0);
            result = 31 * result + (this.regions != null ? this.regions.hashCode() : 0);
            return result;
        }
    }
}
