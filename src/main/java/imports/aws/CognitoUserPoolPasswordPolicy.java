package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.199Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CognitoUserPoolPasswordPolicy")
@software.amazon.jsii.Jsii.Proxy(CognitoUserPoolPasswordPolicy.Jsii$Proxy.class)
public interface CognitoUserPoolPasswordPolicy extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.Number getMinimumLength() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getRequireLowercase() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getRequireNumbers() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getRequireSymbols() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getRequireUppercase() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getTemporaryPasswordValidityDays() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CognitoUserPoolPasswordPolicy}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CognitoUserPoolPasswordPolicy}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CognitoUserPoolPasswordPolicy> {
        private java.lang.Number minimumLength;
        private java.lang.Boolean requireLowercase;
        private java.lang.Boolean requireNumbers;
        private java.lang.Boolean requireSymbols;
        private java.lang.Boolean requireUppercase;
        private java.lang.Number temporaryPasswordValidityDays;

        /**
         * Sets the value of {@link CognitoUserPoolPasswordPolicy#getMinimumLength}
         * @param minimumLength the value to be set.
         * @return {@code this}
         */
        public Builder minimumLength(java.lang.Number minimumLength) {
            this.minimumLength = minimumLength;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolPasswordPolicy#getRequireLowercase}
         * @param requireLowercase the value to be set.
         * @return {@code this}
         */
        public Builder requireLowercase(java.lang.Boolean requireLowercase) {
            this.requireLowercase = requireLowercase;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolPasswordPolicy#getRequireNumbers}
         * @param requireNumbers the value to be set.
         * @return {@code this}
         */
        public Builder requireNumbers(java.lang.Boolean requireNumbers) {
            this.requireNumbers = requireNumbers;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolPasswordPolicy#getRequireSymbols}
         * @param requireSymbols the value to be set.
         * @return {@code this}
         */
        public Builder requireSymbols(java.lang.Boolean requireSymbols) {
            this.requireSymbols = requireSymbols;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolPasswordPolicy#getRequireUppercase}
         * @param requireUppercase the value to be set.
         * @return {@code this}
         */
        public Builder requireUppercase(java.lang.Boolean requireUppercase) {
            this.requireUppercase = requireUppercase;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolPasswordPolicy#getTemporaryPasswordValidityDays}
         * @param temporaryPasswordValidityDays the value to be set.
         * @return {@code this}
         */
        public Builder temporaryPasswordValidityDays(java.lang.Number temporaryPasswordValidityDays) {
            this.temporaryPasswordValidityDays = temporaryPasswordValidityDays;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CognitoUserPoolPasswordPolicy}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CognitoUserPoolPasswordPolicy build() {
            return new Jsii$Proxy(minimumLength, requireLowercase, requireNumbers, requireSymbols, requireUppercase, temporaryPasswordValidityDays);
        }
    }

    /**
     * An implementation for {@link CognitoUserPoolPasswordPolicy}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CognitoUserPoolPasswordPolicy {
        private final java.lang.Number minimumLength;
        private final java.lang.Boolean requireLowercase;
        private final java.lang.Boolean requireNumbers;
        private final java.lang.Boolean requireSymbols;
        private final java.lang.Boolean requireUppercase;
        private final java.lang.Number temporaryPasswordValidityDays;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.minimumLength = software.amazon.jsii.Kernel.get(this, "minimumLength", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.requireLowercase = software.amazon.jsii.Kernel.get(this, "requireLowercase", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.requireNumbers = software.amazon.jsii.Kernel.get(this, "requireNumbers", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.requireSymbols = software.amazon.jsii.Kernel.get(this, "requireSymbols", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.requireUppercase = software.amazon.jsii.Kernel.get(this, "requireUppercase", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.temporaryPasswordValidityDays = software.amazon.jsii.Kernel.get(this, "temporaryPasswordValidityDays", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.Number minimumLength, final java.lang.Boolean requireLowercase, final java.lang.Boolean requireNumbers, final java.lang.Boolean requireSymbols, final java.lang.Boolean requireUppercase, final java.lang.Number temporaryPasswordValidityDays) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.minimumLength = minimumLength;
            this.requireLowercase = requireLowercase;
            this.requireNumbers = requireNumbers;
            this.requireSymbols = requireSymbols;
            this.requireUppercase = requireUppercase;
            this.temporaryPasswordValidityDays = temporaryPasswordValidityDays;
        }

        @Override
        public final java.lang.Number getMinimumLength() {
            return this.minimumLength;
        }

        @Override
        public final java.lang.Boolean getRequireLowercase() {
            return this.requireLowercase;
        }

        @Override
        public final java.lang.Boolean getRequireNumbers() {
            return this.requireNumbers;
        }

        @Override
        public final java.lang.Boolean getRequireSymbols() {
            return this.requireSymbols;
        }

        @Override
        public final java.lang.Boolean getRequireUppercase() {
            return this.requireUppercase;
        }

        @Override
        public final java.lang.Number getTemporaryPasswordValidityDays() {
            return this.temporaryPasswordValidityDays;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getMinimumLength() != null) {
                data.set("minimumLength", om.valueToTree(this.getMinimumLength()));
            }
            if (this.getRequireLowercase() != null) {
                data.set("requireLowercase", om.valueToTree(this.getRequireLowercase()));
            }
            if (this.getRequireNumbers() != null) {
                data.set("requireNumbers", om.valueToTree(this.getRequireNumbers()));
            }
            if (this.getRequireSymbols() != null) {
                data.set("requireSymbols", om.valueToTree(this.getRequireSymbols()));
            }
            if (this.getRequireUppercase() != null) {
                data.set("requireUppercase", om.valueToTree(this.getRequireUppercase()));
            }
            if (this.getTemporaryPasswordValidityDays() != null) {
                data.set("temporaryPasswordValidityDays", om.valueToTree(this.getTemporaryPasswordValidityDays()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.CognitoUserPoolPasswordPolicy"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CognitoUserPoolPasswordPolicy.Jsii$Proxy that = (CognitoUserPoolPasswordPolicy.Jsii$Proxy) o;

            if (this.minimumLength != null ? !this.minimumLength.equals(that.minimumLength) : that.minimumLength != null) return false;
            if (this.requireLowercase != null ? !this.requireLowercase.equals(that.requireLowercase) : that.requireLowercase != null) return false;
            if (this.requireNumbers != null ? !this.requireNumbers.equals(that.requireNumbers) : that.requireNumbers != null) return false;
            if (this.requireSymbols != null ? !this.requireSymbols.equals(that.requireSymbols) : that.requireSymbols != null) return false;
            if (this.requireUppercase != null ? !this.requireUppercase.equals(that.requireUppercase) : that.requireUppercase != null) return false;
            return this.temporaryPasswordValidityDays != null ? this.temporaryPasswordValidityDays.equals(that.temporaryPasswordValidityDays) : that.temporaryPasswordValidityDays == null;
        }

        @Override
        public final int hashCode() {
            int result = this.minimumLength != null ? this.minimumLength.hashCode() : 0;
            result = 31 * result + (this.requireLowercase != null ? this.requireLowercase.hashCode() : 0);
            result = 31 * result + (this.requireNumbers != null ? this.requireNumbers.hashCode() : 0);
            result = 31 * result + (this.requireSymbols != null ? this.requireSymbols.hashCode() : 0);
            result = 31 * result + (this.requireUppercase != null ? this.requireUppercase.hashCode() : 0);
            result = 31 * result + (this.temporaryPasswordValidityDays != null ? this.temporaryPasswordValidityDays.hashCode() : 0);
            return result;
        }
    }
}
