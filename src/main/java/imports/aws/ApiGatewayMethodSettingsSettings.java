package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:01.986Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.ApiGatewayMethodSettingsSettings")
@software.amazon.jsii.Jsii.Proxy(ApiGatewayMethodSettingsSettings.Jsii$Proxy.class)
public interface ApiGatewayMethodSettingsSettings extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getCacheDataEncrypted() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getCacheTtlInSeconds() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getCachingEnabled() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getDataTraceEnabled() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getLoggingLevel() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getMetricsEnabled() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getRequireAuthorizationForCacheControl() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getThrottlingBurstLimit() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getThrottlingRateLimit() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getUnauthorizedCacheControlHeaderStrategy() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ApiGatewayMethodSettingsSettings}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ApiGatewayMethodSettingsSettings}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ApiGatewayMethodSettingsSettings> {
        private java.lang.Boolean cacheDataEncrypted;
        private java.lang.Number cacheTtlInSeconds;
        private java.lang.Boolean cachingEnabled;
        private java.lang.Boolean dataTraceEnabled;
        private java.lang.String loggingLevel;
        private java.lang.Boolean metricsEnabled;
        private java.lang.Boolean requireAuthorizationForCacheControl;
        private java.lang.Number throttlingBurstLimit;
        private java.lang.Number throttlingRateLimit;
        private java.lang.String unauthorizedCacheControlHeaderStrategy;

        /**
         * Sets the value of {@link ApiGatewayMethodSettingsSettings#getCacheDataEncrypted}
         * @param cacheDataEncrypted the value to be set.
         * @return {@code this}
         */
        public Builder cacheDataEncrypted(java.lang.Boolean cacheDataEncrypted) {
            this.cacheDataEncrypted = cacheDataEncrypted;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayMethodSettingsSettings#getCacheTtlInSeconds}
         * @param cacheTtlInSeconds the value to be set.
         * @return {@code this}
         */
        public Builder cacheTtlInSeconds(java.lang.Number cacheTtlInSeconds) {
            this.cacheTtlInSeconds = cacheTtlInSeconds;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayMethodSettingsSettings#getCachingEnabled}
         * @param cachingEnabled the value to be set.
         * @return {@code this}
         */
        public Builder cachingEnabled(java.lang.Boolean cachingEnabled) {
            this.cachingEnabled = cachingEnabled;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayMethodSettingsSettings#getDataTraceEnabled}
         * @param dataTraceEnabled the value to be set.
         * @return {@code this}
         */
        public Builder dataTraceEnabled(java.lang.Boolean dataTraceEnabled) {
            this.dataTraceEnabled = dataTraceEnabled;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayMethodSettingsSettings#getLoggingLevel}
         * @param loggingLevel the value to be set.
         * @return {@code this}
         */
        public Builder loggingLevel(java.lang.String loggingLevel) {
            this.loggingLevel = loggingLevel;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayMethodSettingsSettings#getMetricsEnabled}
         * @param metricsEnabled the value to be set.
         * @return {@code this}
         */
        public Builder metricsEnabled(java.lang.Boolean metricsEnabled) {
            this.metricsEnabled = metricsEnabled;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayMethodSettingsSettings#getRequireAuthorizationForCacheControl}
         * @param requireAuthorizationForCacheControl the value to be set.
         * @return {@code this}
         */
        public Builder requireAuthorizationForCacheControl(java.lang.Boolean requireAuthorizationForCacheControl) {
            this.requireAuthorizationForCacheControl = requireAuthorizationForCacheControl;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayMethodSettingsSettings#getThrottlingBurstLimit}
         * @param throttlingBurstLimit the value to be set.
         * @return {@code this}
         */
        public Builder throttlingBurstLimit(java.lang.Number throttlingBurstLimit) {
            this.throttlingBurstLimit = throttlingBurstLimit;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayMethodSettingsSettings#getThrottlingRateLimit}
         * @param throttlingRateLimit the value to be set.
         * @return {@code this}
         */
        public Builder throttlingRateLimit(java.lang.Number throttlingRateLimit) {
            this.throttlingRateLimit = throttlingRateLimit;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayMethodSettingsSettings#getUnauthorizedCacheControlHeaderStrategy}
         * @param unauthorizedCacheControlHeaderStrategy the value to be set.
         * @return {@code this}
         */
        public Builder unauthorizedCacheControlHeaderStrategy(java.lang.String unauthorizedCacheControlHeaderStrategy) {
            this.unauthorizedCacheControlHeaderStrategy = unauthorizedCacheControlHeaderStrategy;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ApiGatewayMethodSettingsSettings}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ApiGatewayMethodSettingsSettings build() {
            return new Jsii$Proxy(cacheDataEncrypted, cacheTtlInSeconds, cachingEnabled, dataTraceEnabled, loggingLevel, metricsEnabled, requireAuthorizationForCacheControl, throttlingBurstLimit, throttlingRateLimit, unauthorizedCacheControlHeaderStrategy);
        }
    }

    /**
     * An implementation for {@link ApiGatewayMethodSettingsSettings}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ApiGatewayMethodSettingsSettings {
        private final java.lang.Boolean cacheDataEncrypted;
        private final java.lang.Number cacheTtlInSeconds;
        private final java.lang.Boolean cachingEnabled;
        private final java.lang.Boolean dataTraceEnabled;
        private final java.lang.String loggingLevel;
        private final java.lang.Boolean metricsEnabled;
        private final java.lang.Boolean requireAuthorizationForCacheControl;
        private final java.lang.Number throttlingBurstLimit;
        private final java.lang.Number throttlingRateLimit;
        private final java.lang.String unauthorizedCacheControlHeaderStrategy;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.cacheDataEncrypted = software.amazon.jsii.Kernel.get(this, "cacheDataEncrypted", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.cacheTtlInSeconds = software.amazon.jsii.Kernel.get(this, "cacheTtlInSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.cachingEnabled = software.amazon.jsii.Kernel.get(this, "cachingEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.dataTraceEnabled = software.amazon.jsii.Kernel.get(this, "dataTraceEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.loggingLevel = software.amazon.jsii.Kernel.get(this, "loggingLevel", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.metricsEnabled = software.amazon.jsii.Kernel.get(this, "metricsEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.requireAuthorizationForCacheControl = software.amazon.jsii.Kernel.get(this, "requireAuthorizationForCacheControl", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.throttlingBurstLimit = software.amazon.jsii.Kernel.get(this, "throttlingBurstLimit", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.throttlingRateLimit = software.amazon.jsii.Kernel.get(this, "throttlingRateLimit", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.unauthorizedCacheControlHeaderStrategy = software.amazon.jsii.Kernel.get(this, "unauthorizedCacheControlHeaderStrategy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.Boolean cacheDataEncrypted, final java.lang.Number cacheTtlInSeconds, final java.lang.Boolean cachingEnabled, final java.lang.Boolean dataTraceEnabled, final java.lang.String loggingLevel, final java.lang.Boolean metricsEnabled, final java.lang.Boolean requireAuthorizationForCacheControl, final java.lang.Number throttlingBurstLimit, final java.lang.Number throttlingRateLimit, final java.lang.String unauthorizedCacheControlHeaderStrategy) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.cacheDataEncrypted = cacheDataEncrypted;
            this.cacheTtlInSeconds = cacheTtlInSeconds;
            this.cachingEnabled = cachingEnabled;
            this.dataTraceEnabled = dataTraceEnabled;
            this.loggingLevel = loggingLevel;
            this.metricsEnabled = metricsEnabled;
            this.requireAuthorizationForCacheControl = requireAuthorizationForCacheControl;
            this.throttlingBurstLimit = throttlingBurstLimit;
            this.throttlingRateLimit = throttlingRateLimit;
            this.unauthorizedCacheControlHeaderStrategy = unauthorizedCacheControlHeaderStrategy;
        }

        @Override
        public final java.lang.Boolean getCacheDataEncrypted() {
            return this.cacheDataEncrypted;
        }

        @Override
        public final java.lang.Number getCacheTtlInSeconds() {
            return this.cacheTtlInSeconds;
        }

        @Override
        public final java.lang.Boolean getCachingEnabled() {
            return this.cachingEnabled;
        }

        @Override
        public final java.lang.Boolean getDataTraceEnabled() {
            return this.dataTraceEnabled;
        }

        @Override
        public final java.lang.String getLoggingLevel() {
            return this.loggingLevel;
        }

        @Override
        public final java.lang.Boolean getMetricsEnabled() {
            return this.metricsEnabled;
        }

        @Override
        public final java.lang.Boolean getRequireAuthorizationForCacheControl() {
            return this.requireAuthorizationForCacheControl;
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
        public final java.lang.String getUnauthorizedCacheControlHeaderStrategy() {
            return this.unauthorizedCacheControlHeaderStrategy;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getCacheDataEncrypted() != null) {
                data.set("cacheDataEncrypted", om.valueToTree(this.getCacheDataEncrypted()));
            }
            if (this.getCacheTtlInSeconds() != null) {
                data.set("cacheTtlInSeconds", om.valueToTree(this.getCacheTtlInSeconds()));
            }
            if (this.getCachingEnabled() != null) {
                data.set("cachingEnabled", om.valueToTree(this.getCachingEnabled()));
            }
            if (this.getDataTraceEnabled() != null) {
                data.set("dataTraceEnabled", om.valueToTree(this.getDataTraceEnabled()));
            }
            if (this.getLoggingLevel() != null) {
                data.set("loggingLevel", om.valueToTree(this.getLoggingLevel()));
            }
            if (this.getMetricsEnabled() != null) {
                data.set("metricsEnabled", om.valueToTree(this.getMetricsEnabled()));
            }
            if (this.getRequireAuthorizationForCacheControl() != null) {
                data.set("requireAuthorizationForCacheControl", om.valueToTree(this.getRequireAuthorizationForCacheControl()));
            }
            if (this.getThrottlingBurstLimit() != null) {
                data.set("throttlingBurstLimit", om.valueToTree(this.getThrottlingBurstLimit()));
            }
            if (this.getThrottlingRateLimit() != null) {
                data.set("throttlingRateLimit", om.valueToTree(this.getThrottlingRateLimit()));
            }
            if (this.getUnauthorizedCacheControlHeaderStrategy() != null) {
                data.set("unauthorizedCacheControlHeaderStrategy", om.valueToTree(this.getUnauthorizedCacheControlHeaderStrategy()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.ApiGatewayMethodSettingsSettings"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ApiGatewayMethodSettingsSettings.Jsii$Proxy that = (ApiGatewayMethodSettingsSettings.Jsii$Proxy) o;

            if (this.cacheDataEncrypted != null ? !this.cacheDataEncrypted.equals(that.cacheDataEncrypted) : that.cacheDataEncrypted != null) return false;
            if (this.cacheTtlInSeconds != null ? !this.cacheTtlInSeconds.equals(that.cacheTtlInSeconds) : that.cacheTtlInSeconds != null) return false;
            if (this.cachingEnabled != null ? !this.cachingEnabled.equals(that.cachingEnabled) : that.cachingEnabled != null) return false;
            if (this.dataTraceEnabled != null ? !this.dataTraceEnabled.equals(that.dataTraceEnabled) : that.dataTraceEnabled != null) return false;
            if (this.loggingLevel != null ? !this.loggingLevel.equals(that.loggingLevel) : that.loggingLevel != null) return false;
            if (this.metricsEnabled != null ? !this.metricsEnabled.equals(that.metricsEnabled) : that.metricsEnabled != null) return false;
            if (this.requireAuthorizationForCacheControl != null ? !this.requireAuthorizationForCacheControl.equals(that.requireAuthorizationForCacheControl) : that.requireAuthorizationForCacheControl != null) return false;
            if (this.throttlingBurstLimit != null ? !this.throttlingBurstLimit.equals(that.throttlingBurstLimit) : that.throttlingBurstLimit != null) return false;
            if (this.throttlingRateLimit != null ? !this.throttlingRateLimit.equals(that.throttlingRateLimit) : that.throttlingRateLimit != null) return false;
            return this.unauthorizedCacheControlHeaderStrategy != null ? this.unauthorizedCacheControlHeaderStrategy.equals(that.unauthorizedCacheControlHeaderStrategy) : that.unauthorizedCacheControlHeaderStrategy == null;
        }

        @Override
        public final int hashCode() {
            int result = this.cacheDataEncrypted != null ? this.cacheDataEncrypted.hashCode() : 0;
            result = 31 * result + (this.cacheTtlInSeconds != null ? this.cacheTtlInSeconds.hashCode() : 0);
            result = 31 * result + (this.cachingEnabled != null ? this.cachingEnabled.hashCode() : 0);
            result = 31 * result + (this.dataTraceEnabled != null ? this.dataTraceEnabled.hashCode() : 0);
            result = 31 * result + (this.loggingLevel != null ? this.loggingLevel.hashCode() : 0);
            result = 31 * result + (this.metricsEnabled != null ? this.metricsEnabled.hashCode() : 0);
            result = 31 * result + (this.requireAuthorizationForCacheControl != null ? this.requireAuthorizationForCacheControl.hashCode() : 0);
            result = 31 * result + (this.throttlingBurstLimit != null ? this.throttlingBurstLimit.hashCode() : 0);
            result = 31 * result + (this.throttlingRateLimit != null ? this.throttlingRateLimit.hashCode() : 0);
            result = 31 * result + (this.unauthorizedCacheControlHeaderStrategy != null ? this.unauthorizedCacheControlHeaderStrategy.hashCode() : 0);
            return result;
        }
    }
}
