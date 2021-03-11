package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.024Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Apigatewayv2StageRouteSettings")
@software.amazon.jsii.Jsii.Proxy(Apigatewayv2StageRouteSettings.Jsii$Proxy.class)
public interface Apigatewayv2StageRouteSettings extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getRouteKey();

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getDataTraceEnabled() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getDetailedMetricsEnabled() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getLoggingLevel() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getThrottlingBurstLimit() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getThrottlingRateLimit() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Apigatewayv2StageRouteSettings}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Apigatewayv2StageRouteSettings}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Apigatewayv2StageRouteSettings> {
        private java.lang.String routeKey;
        private java.lang.Boolean dataTraceEnabled;
        private java.lang.Boolean detailedMetricsEnabled;
        private java.lang.String loggingLevel;
        private java.lang.Number throttlingBurstLimit;
        private java.lang.Number throttlingRateLimit;

        /**
         * Sets the value of {@link Apigatewayv2StageRouteSettings#getRouteKey}
         * @param routeKey the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder routeKey(java.lang.String routeKey) {
            this.routeKey = routeKey;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2StageRouteSettings#getDataTraceEnabled}
         * @param dataTraceEnabled the value to be set.
         * @return {@code this}
         */
        public Builder dataTraceEnabled(java.lang.Boolean dataTraceEnabled) {
            this.dataTraceEnabled = dataTraceEnabled;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2StageRouteSettings#getDetailedMetricsEnabled}
         * @param detailedMetricsEnabled the value to be set.
         * @return {@code this}
         */
        public Builder detailedMetricsEnabled(java.lang.Boolean detailedMetricsEnabled) {
            this.detailedMetricsEnabled = detailedMetricsEnabled;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2StageRouteSettings#getLoggingLevel}
         * @param loggingLevel the value to be set.
         * @return {@code this}
         */
        public Builder loggingLevel(java.lang.String loggingLevel) {
            this.loggingLevel = loggingLevel;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2StageRouteSettings#getThrottlingBurstLimit}
         * @param throttlingBurstLimit the value to be set.
         * @return {@code this}
         */
        public Builder throttlingBurstLimit(java.lang.Number throttlingBurstLimit) {
            this.throttlingBurstLimit = throttlingBurstLimit;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2StageRouteSettings#getThrottlingRateLimit}
         * @param throttlingRateLimit the value to be set.
         * @return {@code this}
         */
        public Builder throttlingRateLimit(java.lang.Number throttlingRateLimit) {
            this.throttlingRateLimit = throttlingRateLimit;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Apigatewayv2StageRouteSettings}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Apigatewayv2StageRouteSettings build() {
            return new Jsii$Proxy(routeKey, dataTraceEnabled, detailedMetricsEnabled, loggingLevel, throttlingBurstLimit, throttlingRateLimit);
        }
    }

    /**
     * An implementation for {@link Apigatewayv2StageRouteSettings}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Apigatewayv2StageRouteSettings {
        private final java.lang.String routeKey;
        private final java.lang.Boolean dataTraceEnabled;
        private final java.lang.Boolean detailedMetricsEnabled;
        private final java.lang.String loggingLevel;
        private final java.lang.Number throttlingBurstLimit;
        private final java.lang.Number throttlingRateLimit;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.routeKey = software.amazon.jsii.Kernel.get(this, "routeKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.dataTraceEnabled = software.amazon.jsii.Kernel.get(this, "dataTraceEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.detailedMetricsEnabled = software.amazon.jsii.Kernel.get(this, "detailedMetricsEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.loggingLevel = software.amazon.jsii.Kernel.get(this, "loggingLevel", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.throttlingBurstLimit = software.amazon.jsii.Kernel.get(this, "throttlingBurstLimit", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.throttlingRateLimit = software.amazon.jsii.Kernel.get(this, "throttlingRateLimit", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String routeKey, final java.lang.Boolean dataTraceEnabled, final java.lang.Boolean detailedMetricsEnabled, final java.lang.String loggingLevel, final java.lang.Number throttlingBurstLimit, final java.lang.Number throttlingRateLimit) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.routeKey = java.util.Objects.requireNonNull(routeKey, "routeKey is required");
            this.dataTraceEnabled = dataTraceEnabled;
            this.detailedMetricsEnabled = detailedMetricsEnabled;
            this.loggingLevel = loggingLevel;
            this.throttlingBurstLimit = throttlingBurstLimit;
            this.throttlingRateLimit = throttlingRateLimit;
        }

        @Override
        public final java.lang.String getRouteKey() {
            return this.routeKey;
        }

        @Override
        public final java.lang.Boolean getDataTraceEnabled() {
            return this.dataTraceEnabled;
        }

        @Override
        public final java.lang.Boolean getDetailedMetricsEnabled() {
            return this.detailedMetricsEnabled;
        }

        @Override
        public final java.lang.String getLoggingLevel() {
            return this.loggingLevel;
        }

        @Override
        public final java.lang.Number getThrottlingBurstLimit() {
            return this.throttlingBurstLimit;
        }

        @Override
        public final java.lang.Number getThrottlingRateLimit() {
            return this.throttlingRateLimit;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("routeKey", om.valueToTree(this.getRouteKey()));
            if (this.getDataTraceEnabled() != null) {
                data.set("dataTraceEnabled", om.valueToTree(this.getDataTraceEnabled()));
            }
            if (this.getDetailedMetricsEnabled() != null) {
                data.set("detailedMetricsEnabled", om.valueToTree(this.getDetailedMetricsEnabled()));
            }
            if (this.getLoggingLevel() != null) {
                data.set("loggingLevel", om.valueToTree(this.getLoggingLevel()));
            }
            if (this.getThrottlingBurstLimit() != null) {
                data.set("throttlingBurstLimit", om.valueToTree(this.getThrottlingBurstLimit()));
            }
            if (this.getThrottlingRateLimit() != null) {
                data.set("throttlingRateLimit", om.valueToTree(this.getThrottlingRateLimit()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.Apigatewayv2StageRouteSettings"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Apigatewayv2StageRouteSettings.Jsii$Proxy that = (Apigatewayv2StageRouteSettings.Jsii$Proxy) o;

            if (!routeKey.equals(that.routeKey)) return false;
            if (this.dataTraceEnabled != null ? !this.dataTraceEnabled.equals(that.dataTraceEnabled) : that.dataTraceEnabled != null) return false;
            if (this.detailedMetricsEnabled != null ? !this.detailedMetricsEnabled.equals(that.detailedMetricsEnabled) : that.detailedMetricsEnabled != null) return false;
            if (this.loggingLevel != null ? !this.loggingLevel.equals(that.loggingLevel) : that.loggingLevel != null) return false;
            if (this.throttlingBurstLimit != null ? !this.throttlingBurstLimit.equals(that.throttlingBurstLimit) : that.throttlingBurstLimit != null) return false;
            return this.throttlingRateLimit != null ? this.throttlingRateLimit.equals(that.throttlingRateLimit) : that.throttlingRateLimit == null;
        }

        @Override
        public final int hashCode() {
            int result = this.routeKey.hashCode();
            result = 31 * result + (this.dataTraceEnabled != null ? this.dataTraceEnabled.hashCode() : 0);
            result = 31 * result + (this.detailedMetricsEnabled != null ? this.detailedMetricsEnabled.hashCode() : 0);
            result = 31 * result + (this.loggingLevel != null ? this.loggingLevel.hashCode() : 0);
            result = 31 * result + (this.throttlingBurstLimit != null ? this.throttlingBurstLimit.hashCode() : 0);
            result = 31 * result + (this.throttlingRateLimit != null ? this.throttlingRateLimit.hashCode() : 0);
            return result;
        }
    }
}
