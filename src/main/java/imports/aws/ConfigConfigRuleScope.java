package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.202Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.ConfigConfigRuleScope")
@software.amazon.jsii.Jsii.Proxy(ConfigConfigRuleScope.Jsii$Proxy.class)
public interface ConfigConfigRuleScope extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.String getComplianceResourceId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getComplianceResourceTypes() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getTagKey() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getTagValue() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ConfigConfigRuleScope}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ConfigConfigRuleScope}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ConfigConfigRuleScope> {
        private java.lang.String complianceResourceId;
        private java.util.List<java.lang.String> complianceResourceTypes;
        private java.lang.String tagKey;
        private java.lang.String tagValue;

        /**
         * Sets the value of {@link ConfigConfigRuleScope#getComplianceResourceId}
         * @param complianceResourceId the value to be set.
         * @return {@code this}
         */
        public Builder complianceResourceId(java.lang.String complianceResourceId) {
            this.complianceResourceId = complianceResourceId;
            return this;
        }

        /**
         * Sets the value of {@link ConfigConfigRuleScope#getComplianceResourceTypes}
         * @param complianceResourceTypes the value to be set.
         * @return {@code this}
         */
        public Builder complianceResourceTypes(java.util.List<java.lang.String> complianceResourceTypes) {
            this.complianceResourceTypes = complianceResourceTypes;
            return this;
        }

        /**
         * Sets the value of {@link ConfigConfigRuleScope#getTagKey}
         * @param tagKey the value to be set.
         * @return {@code this}
         */
        public Builder tagKey(java.lang.String tagKey) {
            this.tagKey = tagKey;
            return this;
        }

        /**
         * Sets the value of {@link ConfigConfigRuleScope#getTagValue}
         * @param tagValue the value to be set.
         * @return {@code this}
         */
        public Builder tagValue(java.lang.String tagValue) {
            this.tagValue = tagValue;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ConfigConfigRuleScope}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ConfigConfigRuleScope build() {
            return new Jsii$Proxy(complianceResourceId, complianceResourceTypes, tagKey, tagValue);
        }
    }

    /**
     * An implementation for {@link ConfigConfigRuleScope}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ConfigConfigRuleScope {
        private final java.lang.String complianceResourceId;
        private final java.util.List<java.lang.String> complianceResourceTypes;
        private final java.lang.String tagKey;
        private final java.lang.String tagValue;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.complianceResourceId = software.amazon.jsii.Kernel.get(this, "complianceResourceId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.complianceResourceTypes = software.amazon.jsii.Kernel.get(this, "complianceResourceTypes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.tagKey = software.amazon.jsii.Kernel.get(this, "tagKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tagValue = software.amazon.jsii.Kernel.get(this, "tagValue", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String complianceResourceId, final java.util.List<java.lang.String> complianceResourceTypes, final java.lang.String tagKey, final java.lang.String tagValue) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.complianceResourceId = complianceResourceId;
            this.complianceResourceTypes = complianceResourceTypes;
            this.tagKey = tagKey;
            this.tagValue = tagValue;
        }

        @Override
        public final java.lang.String getComplianceResourceId() {
            return this.complianceResourceId;
        }

        @Override
        public final java.util.List<java.lang.String> getComplianceResourceTypes() {
            return this.complianceResourceTypes;
        }

        @Override
        public final java.lang.String getTagKey() {
            return this.tagKey;
        }

        @Override
        public final java.lang.String getTagValue() {
            return this.tagValue;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getComplianceResourceId() != null) {
                data.set("complianceResourceId", om.valueToTree(this.getComplianceResourceId()));
            }
            if (this.getComplianceResourceTypes() != null) {
                data.set("complianceResourceTypes", om.valueToTree(this.getComplianceResourceTypes()));
            }
            if (this.getTagKey() != null) {
                data.set("tagKey", om.valueToTree(this.getTagKey()));
            }
            if (this.getTagValue() != null) {
                data.set("tagValue", om.valueToTree(this.getTagValue()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.ConfigConfigRuleScope"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ConfigConfigRuleScope.Jsii$Proxy that = (ConfigConfigRuleScope.Jsii$Proxy) o;

            if (this.complianceResourceId != null ? !this.complianceResourceId.equals(that.complianceResourceId) : that.complianceResourceId != null) return false;
            if (this.complianceResourceTypes != null ? !this.complianceResourceTypes.equals(that.complianceResourceTypes) : that.complianceResourceTypes != null) return false;
            if (this.tagKey != null ? !this.tagKey.equals(that.tagKey) : that.tagKey != null) return false;
            return this.tagValue != null ? this.tagValue.equals(that.tagValue) : that.tagValue == null;
        }

        @Override
        public final int hashCode() {
            int result = this.complianceResourceId != null ? this.complianceResourceId.hashCode() : 0;
            result = 31 * result + (this.complianceResourceTypes != null ? this.complianceResourceTypes.hashCode() : 0);
            result = 31 * result + (this.tagKey != null ? this.tagKey.hashCode() : 0);
            result = 31 * result + (this.tagValue != null ? this.tagValue.hashCode() : 0);
            return result;
        }
    }
}
