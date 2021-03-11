package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.837Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.S3BucketObjectLockConfigurationRuleDefaultRetention")
@software.amazon.jsii.Jsii.Proxy(S3BucketObjectLockConfigurationRuleDefaultRetention.Jsii$Proxy.class)
public interface S3BucketObjectLockConfigurationRuleDefaultRetention extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getMode();

    default @org.jetbrains.annotations.Nullable java.lang.Number getDays() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getYears() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link S3BucketObjectLockConfigurationRuleDefaultRetention}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link S3BucketObjectLockConfigurationRuleDefaultRetention}
     */
    public static final class Builder implements software.amazon.jsii.Builder<S3BucketObjectLockConfigurationRuleDefaultRetention> {
        private java.lang.String mode;
        private java.lang.Number days;
        private java.lang.Number years;

        /**
         * Sets the value of {@link S3BucketObjectLockConfigurationRuleDefaultRetention#getMode}
         * @param mode the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder mode(java.lang.String mode) {
            this.mode = mode;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketObjectLockConfigurationRuleDefaultRetention#getDays}
         * @param days the value to be set.
         * @return {@code this}
         */
        public Builder days(java.lang.Number days) {
            this.days = days;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketObjectLockConfigurationRuleDefaultRetention#getYears}
         * @param years the value to be set.
         * @return {@code this}
         */
        public Builder years(java.lang.Number years) {
            this.years = years;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link S3BucketObjectLockConfigurationRuleDefaultRetention}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public S3BucketObjectLockConfigurationRuleDefaultRetention build() {
            return new Jsii$Proxy(mode, days, years);
        }
    }

    /**
     * An implementation for {@link S3BucketObjectLockConfigurationRuleDefaultRetention}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements S3BucketObjectLockConfigurationRuleDefaultRetention {
        private final java.lang.String mode;
        private final java.lang.Number days;
        private final java.lang.Number years;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.mode = software.amazon.jsii.Kernel.get(this, "mode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.days = software.amazon.jsii.Kernel.get(this, "days", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.years = software.amazon.jsii.Kernel.get(this, "years", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String mode, final java.lang.Number days, final java.lang.Number years) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.mode = java.util.Objects.requireNonNull(mode, "mode is required");
            this.days = days;
            this.years = years;
        }

        @Override
        public final java.lang.String getMode() {
            return this.mode;
        }

        @Override
        public final java.lang.Number getDays() {
            return this.days;
        }

        @Override
        public final java.lang.Number getYears() {
            return this.years;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("mode", om.valueToTree(this.getMode()));
            if (this.getDays() != null) {
                data.set("days", om.valueToTree(this.getDays()));
            }
            if (this.getYears() != null) {
                data.set("years", om.valueToTree(this.getYears()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.S3BucketObjectLockConfigurationRuleDefaultRetention"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            S3BucketObjectLockConfigurationRuleDefaultRetention.Jsii$Proxy that = (S3BucketObjectLockConfigurationRuleDefaultRetention.Jsii$Proxy) o;

            if (!mode.equals(that.mode)) return false;
            if (this.days != null ? !this.days.equals(that.days) : that.days != null) return false;
            return this.years != null ? this.years.equals(that.years) : that.years == null;
        }

        @Override
        public final int hashCode() {
            int result = this.mode.hashCode();
            result = 31 * result + (this.days != null ? this.days.hashCode() : 0);
            result = 31 * result + (this.years != null ? this.years.hashCode() : 0);
            return result;
        }
    }
}
