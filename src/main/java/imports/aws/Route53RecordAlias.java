package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.815Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Route53RecordAlias")
@software.amazon.jsii.Jsii.Proxy(Route53RecordAlias.Jsii$Proxy.class)
public interface Route53RecordAlias extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.Boolean getEvaluateTargetHealth();

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    @org.jetbrains.annotations.NotNull java.lang.String getZoneId();

    /**
     * @return a {@link Builder} of {@link Route53RecordAlias}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Route53RecordAlias}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Route53RecordAlias> {
        private java.lang.Boolean evaluateTargetHealth;
        private java.lang.String name;
        private java.lang.String zoneId;

        /**
         * Sets the value of {@link Route53RecordAlias#getEvaluateTargetHealth}
         * @param evaluateTargetHealth the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder evaluateTargetHealth(java.lang.Boolean evaluateTargetHealth) {
            this.evaluateTargetHealth = evaluateTargetHealth;
            return this;
        }

        /**
         * Sets the value of {@link Route53RecordAlias#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link Route53RecordAlias#getZoneId}
         * @param zoneId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder zoneId(java.lang.String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Route53RecordAlias}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Route53RecordAlias build() {
            return new Jsii$Proxy(evaluateTargetHealth, name, zoneId);
        }
    }

    /**
     * An implementation for {@link Route53RecordAlias}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Route53RecordAlias {
        private final java.lang.Boolean evaluateTargetHealth;
        private final java.lang.String name;
        private final java.lang.String zoneId;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.evaluateTargetHealth = software.amazon.jsii.Kernel.get(this, "evaluateTargetHealth", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.zoneId = software.amazon.jsii.Kernel.get(this, "zoneId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.Boolean evaluateTargetHealth, final java.lang.String name, final java.lang.String zoneId) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.evaluateTargetHealth = java.util.Objects.requireNonNull(evaluateTargetHealth, "evaluateTargetHealth is required");
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.zoneId = java.util.Objects.requireNonNull(zoneId, "zoneId is required");
        }

        @Override
        public final java.lang.Boolean getEvaluateTargetHealth() {
            return this.evaluateTargetHealth;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getZoneId() {
            return this.zoneId;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("evaluateTargetHealth", om.valueToTree(this.getEvaluateTargetHealth()));
            data.set("name", om.valueToTree(this.getName()));
            data.set("zoneId", om.valueToTree(this.getZoneId()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.Route53RecordAlias"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Route53RecordAlias.Jsii$Proxy that = (Route53RecordAlias.Jsii$Proxy) o;

            if (!evaluateTargetHealth.equals(that.evaluateTargetHealth)) return false;
            if (!name.equals(that.name)) return false;
            return this.zoneId.equals(that.zoneId);
        }

        @Override
        public final int hashCode() {
            int result = this.evaluateTargetHealth.hashCode();
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.zoneId.hashCode());
            return result;
        }
    }
}
