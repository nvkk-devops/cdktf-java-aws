package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.606Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.GlueTriggerPredicate")
@software.amazon.jsii.Jsii.Proxy(GlueTriggerPredicate.Jsii$Proxy.class)
public interface GlueTriggerPredicate extends software.amazon.jsii.JsiiSerializable {

    /**
     * conditions block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.GlueTriggerPredicateConditions> getConditions();

    default @org.jetbrains.annotations.Nullable java.lang.String getLogical() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link GlueTriggerPredicate}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link GlueTriggerPredicate}
     */
    public static final class Builder implements software.amazon.jsii.Builder<GlueTriggerPredicate> {
        private java.util.List<imports.aws.GlueTriggerPredicateConditions> conditions;
        private java.lang.String logical;

        /**
         * Sets the value of {@link GlueTriggerPredicate#getConditions}
         * @param conditions conditions block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder conditions(java.util.List<? extends imports.aws.GlueTriggerPredicateConditions> conditions) {
            this.conditions = (java.util.List<imports.aws.GlueTriggerPredicateConditions>)conditions;
            return this;
        }

        /**
         * Sets the value of {@link GlueTriggerPredicate#getLogical}
         * @param logical the value to be set.
         * @return {@code this}
         */
        public Builder logical(java.lang.String logical) {
            this.logical = logical;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link GlueTriggerPredicate}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public GlueTriggerPredicate build() {
            return new Jsii$Proxy(conditions, logical);
        }
    }

    /**
     * An implementation for {@link GlueTriggerPredicate}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements GlueTriggerPredicate {
        private final java.util.List<imports.aws.GlueTriggerPredicateConditions> conditions;
        private final java.lang.String logical;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.conditions = software.amazon.jsii.Kernel.get(this, "conditions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.GlueTriggerPredicateConditions.class)));
            this.logical = software.amazon.jsii.Kernel.get(this, "logical", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.GlueTriggerPredicateConditions> conditions, final java.lang.String logical) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.conditions = (java.util.List<imports.aws.GlueTriggerPredicateConditions>)java.util.Objects.requireNonNull(conditions, "conditions is required");
            this.logical = logical;
        }

        @Override
        public final java.util.List<imports.aws.GlueTriggerPredicateConditions> getConditions() {
            return this.conditions;
        }

        @Override
        public final java.lang.String getLogical() {
            return this.logical;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("conditions", om.valueToTree(this.getConditions()));
            if (this.getLogical() != null) {
                data.set("logical", om.valueToTree(this.getLogical()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.GlueTriggerPredicate"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            GlueTriggerPredicate.Jsii$Proxy that = (GlueTriggerPredicate.Jsii$Proxy) o;

            if (!conditions.equals(that.conditions)) return false;
            return this.logical != null ? this.logical.equals(that.logical) : that.logical == null;
        }

        @Override
        public final int hashCode() {
            int result = this.conditions.hashCode();
            result = 31 * result + (this.logical != null ? this.logical.hashCode() : 0);
            return result;
        }
    }
}
