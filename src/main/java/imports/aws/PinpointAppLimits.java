package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.785Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.PinpointAppLimits")
@software.amazon.jsii.Jsii.Proxy(PinpointAppLimits.Jsii$Proxy.class)
public interface PinpointAppLimits extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.Number getDaily() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getMaximumDuration() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getMessagesPerSecond() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getTotal() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PinpointAppLimits}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PinpointAppLimits}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PinpointAppLimits> {
        private java.lang.Number daily;
        private java.lang.Number maximumDuration;
        private java.lang.Number messagesPerSecond;
        private java.lang.Number total;

        /**
         * Sets the value of {@link PinpointAppLimits#getDaily}
         * @param daily the value to be set.
         * @return {@code this}
         */
        public Builder daily(java.lang.Number daily) {
            this.daily = daily;
            return this;
        }

        /**
         * Sets the value of {@link PinpointAppLimits#getMaximumDuration}
         * @param maximumDuration the value to be set.
         * @return {@code this}
         */
        public Builder maximumDuration(java.lang.Number maximumDuration) {
            this.maximumDuration = maximumDuration;
            return this;
        }

        /**
         * Sets the value of {@link PinpointAppLimits#getMessagesPerSecond}
         * @param messagesPerSecond the value to be set.
         * @return {@code this}
         */
        public Builder messagesPerSecond(java.lang.Number messagesPerSecond) {
            this.messagesPerSecond = messagesPerSecond;
            return this;
        }

        /**
         * Sets the value of {@link PinpointAppLimits#getTotal}
         * @param total the value to be set.
         * @return {@code this}
         */
        public Builder total(java.lang.Number total) {
            this.total = total;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PinpointAppLimits}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PinpointAppLimits build() {
            return new Jsii$Proxy(daily, maximumDuration, messagesPerSecond, total);
        }
    }

    /**
     * An implementation for {@link PinpointAppLimits}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PinpointAppLimits {
        private final java.lang.Number daily;
        private final java.lang.Number maximumDuration;
        private final java.lang.Number messagesPerSecond;
        private final java.lang.Number total;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.daily = software.amazon.jsii.Kernel.get(this, "daily", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.maximumDuration = software.amazon.jsii.Kernel.get(this, "maximumDuration", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.messagesPerSecond = software.amazon.jsii.Kernel.get(this, "messagesPerSecond", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.total = software.amazon.jsii.Kernel.get(this, "total", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.Number daily, final java.lang.Number maximumDuration, final java.lang.Number messagesPerSecond, final java.lang.Number total) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.daily = daily;
            this.maximumDuration = maximumDuration;
            this.messagesPerSecond = messagesPerSecond;
            this.total = total;
        }

        @Override
        public final java.lang.Number getDaily() {
            return this.daily;
        }

        @Override
        public final java.lang.Number getMaximumDuration() {
            return this.maximumDuration;
        }

        @Override
        public final java.lang.Number getMessagesPerSecond() {
            return this.messagesPerSecond;
        }

        @Override
        public final java.lang.Number getTotal() {
            return this.total;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getDaily() != null) {
                data.set("daily", om.valueToTree(this.getDaily()));
            }
            if (this.getMaximumDuration() != null) {
                data.set("maximumDuration", om.valueToTree(this.getMaximumDuration()));
            }
            if (this.getMessagesPerSecond() != null) {
                data.set("messagesPerSecond", om.valueToTree(this.getMessagesPerSecond()));
            }
            if (this.getTotal() != null) {
                data.set("total", om.valueToTree(this.getTotal()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.PinpointAppLimits"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PinpointAppLimits.Jsii$Proxy that = (PinpointAppLimits.Jsii$Proxy) o;

            if (this.daily != null ? !this.daily.equals(that.daily) : that.daily != null) return false;
            if (this.maximumDuration != null ? !this.maximumDuration.equals(that.maximumDuration) : that.maximumDuration != null) return false;
            if (this.messagesPerSecond != null ? !this.messagesPerSecond.equals(that.messagesPerSecond) : that.messagesPerSecond != null) return false;
            return this.total != null ? this.total.equals(that.total) : that.total == null;
        }

        @Override
        public final int hashCode() {
            int result = this.daily != null ? this.daily.hashCode() : 0;
            result = 31 * result + (this.maximumDuration != null ? this.maximumDuration.hashCode() : 0);
            result = 31 * result + (this.messagesPerSecond != null ? this.messagesPerSecond.hashCode() : 0);
            result = 31 * result + (this.total != null ? this.total.hashCode() : 0);
            return result;
        }
    }
}
