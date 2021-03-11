package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.199Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CognitoUserPoolLambdaConfig")
@software.amazon.jsii.Jsii.Proxy(CognitoUserPoolLambdaConfig.Jsii$Proxy.class)
public interface CognitoUserPoolLambdaConfig extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.String getCreateAuthChallenge() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getCustomMessage() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDefineAuthChallenge() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPostAuthentication() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPostConfirmation() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPreAuthentication() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPreSignUp() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPreTokenGeneration() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getUserMigration() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getVerifyAuthChallengeResponse() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CognitoUserPoolLambdaConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CognitoUserPoolLambdaConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CognitoUserPoolLambdaConfig> {
        private java.lang.String createAuthChallenge;
        private java.lang.String customMessage;
        private java.lang.String defineAuthChallenge;
        private java.lang.String postAuthentication;
        private java.lang.String postConfirmation;
        private java.lang.String preAuthentication;
        private java.lang.String preSignUp;
        private java.lang.String preTokenGeneration;
        private java.lang.String userMigration;
        private java.lang.String verifyAuthChallengeResponse;

        /**
         * Sets the value of {@link CognitoUserPoolLambdaConfig#getCreateAuthChallenge}
         * @param createAuthChallenge the value to be set.
         * @return {@code this}
         */
        public Builder createAuthChallenge(java.lang.String createAuthChallenge) {
            this.createAuthChallenge = createAuthChallenge;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolLambdaConfig#getCustomMessage}
         * @param customMessage the value to be set.
         * @return {@code this}
         */
        public Builder customMessage(java.lang.String customMessage) {
            this.customMessage = customMessage;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolLambdaConfig#getDefineAuthChallenge}
         * @param defineAuthChallenge the value to be set.
         * @return {@code this}
         */
        public Builder defineAuthChallenge(java.lang.String defineAuthChallenge) {
            this.defineAuthChallenge = defineAuthChallenge;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolLambdaConfig#getPostAuthentication}
         * @param postAuthentication the value to be set.
         * @return {@code this}
         */
        public Builder postAuthentication(java.lang.String postAuthentication) {
            this.postAuthentication = postAuthentication;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolLambdaConfig#getPostConfirmation}
         * @param postConfirmation the value to be set.
         * @return {@code this}
         */
        public Builder postConfirmation(java.lang.String postConfirmation) {
            this.postConfirmation = postConfirmation;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolLambdaConfig#getPreAuthentication}
         * @param preAuthentication the value to be set.
         * @return {@code this}
         */
        public Builder preAuthentication(java.lang.String preAuthentication) {
            this.preAuthentication = preAuthentication;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolLambdaConfig#getPreSignUp}
         * @param preSignUp the value to be set.
         * @return {@code this}
         */
        public Builder preSignUp(java.lang.String preSignUp) {
            this.preSignUp = preSignUp;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolLambdaConfig#getPreTokenGeneration}
         * @param preTokenGeneration the value to be set.
         * @return {@code this}
         */
        public Builder preTokenGeneration(java.lang.String preTokenGeneration) {
            this.preTokenGeneration = preTokenGeneration;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolLambdaConfig#getUserMigration}
         * @param userMigration the value to be set.
         * @return {@code this}
         */
        public Builder userMigration(java.lang.String userMigration) {
            this.userMigration = userMigration;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolLambdaConfig#getVerifyAuthChallengeResponse}
         * @param verifyAuthChallengeResponse the value to be set.
         * @return {@code this}
         */
        public Builder verifyAuthChallengeResponse(java.lang.String verifyAuthChallengeResponse) {
            this.verifyAuthChallengeResponse = verifyAuthChallengeResponse;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CognitoUserPoolLambdaConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CognitoUserPoolLambdaConfig build() {
            return new Jsii$Proxy(createAuthChallenge, customMessage, defineAuthChallenge, postAuthentication, postConfirmation, preAuthentication, preSignUp, preTokenGeneration, userMigration, verifyAuthChallengeResponse);
        }
    }

    /**
     * An implementation for {@link CognitoUserPoolLambdaConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CognitoUserPoolLambdaConfig {
        private final java.lang.String createAuthChallenge;
        private final java.lang.String customMessage;
        private final java.lang.String defineAuthChallenge;
        private final java.lang.String postAuthentication;
        private final java.lang.String postConfirmation;
        private final java.lang.String preAuthentication;
        private final java.lang.String preSignUp;
        private final java.lang.String preTokenGeneration;
        private final java.lang.String userMigration;
        private final java.lang.String verifyAuthChallengeResponse;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.createAuthChallenge = software.amazon.jsii.Kernel.get(this, "createAuthChallenge", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.customMessage = software.amazon.jsii.Kernel.get(this, "customMessage", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.defineAuthChallenge = software.amazon.jsii.Kernel.get(this, "defineAuthChallenge", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.postAuthentication = software.amazon.jsii.Kernel.get(this, "postAuthentication", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.postConfirmation = software.amazon.jsii.Kernel.get(this, "postConfirmation", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.preAuthentication = software.amazon.jsii.Kernel.get(this, "preAuthentication", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.preSignUp = software.amazon.jsii.Kernel.get(this, "preSignUp", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.preTokenGeneration = software.amazon.jsii.Kernel.get(this, "preTokenGeneration", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.userMigration = software.amazon.jsii.Kernel.get(this, "userMigration", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.verifyAuthChallengeResponse = software.amazon.jsii.Kernel.get(this, "verifyAuthChallengeResponse", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String createAuthChallenge, final java.lang.String customMessage, final java.lang.String defineAuthChallenge, final java.lang.String postAuthentication, final java.lang.String postConfirmation, final java.lang.String preAuthentication, final java.lang.String preSignUp, final java.lang.String preTokenGeneration, final java.lang.String userMigration, final java.lang.String verifyAuthChallengeResponse) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.createAuthChallenge = createAuthChallenge;
            this.customMessage = customMessage;
            this.defineAuthChallenge = defineAuthChallenge;
            this.postAuthentication = postAuthentication;
            this.postConfirmation = postConfirmation;
            this.preAuthentication = preAuthentication;
            this.preSignUp = preSignUp;
            this.preTokenGeneration = preTokenGeneration;
            this.userMigration = userMigration;
            this.verifyAuthChallengeResponse = verifyAuthChallengeResponse;
        }

        @Override
        public final java.lang.String getCreateAuthChallenge() {
            return this.createAuthChallenge;
        }

        @Override
        public final java.lang.String getCustomMessage() {
            return this.customMessage;
        }

        @Override
        public final java.lang.String getDefineAuthChallenge() {
            return this.defineAuthChallenge;
        }

        @Override
        public final java.lang.String getPostAuthentication() {
            return this.postAuthentication;
        }

        @Override
        public final java.lang.String getPostConfirmation() {
            return this.postConfirmation;
        }

        @Override
        public final java.lang.String getPreAuthentication() {
            return this.preAuthentication;
        }

        @Override
        public final java.lang.String getPreSignUp() {
            return this.preSignUp;
        }

        @Override
        public final java.lang.String getPreTokenGeneration() {
            return this.preTokenGeneration;
        }

        @Override
        public final java.lang.String getUserMigration() {
            return this.userMigration;
        }

        @Override
        public final java.lang.String getVerifyAuthChallengeResponse() {
            return this.verifyAuthChallengeResponse;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getCreateAuthChallenge() != null) {
                data.set("createAuthChallenge", om.valueToTree(this.getCreateAuthChallenge()));
            }
            if (this.getCustomMessage() != null) {
                data.set("customMessage", om.valueToTree(this.getCustomMessage()));
            }
            if (this.getDefineAuthChallenge() != null) {
                data.set("defineAuthChallenge", om.valueToTree(this.getDefineAuthChallenge()));
            }
            if (this.getPostAuthentication() != null) {
                data.set("postAuthentication", om.valueToTree(this.getPostAuthentication()));
            }
            if (this.getPostConfirmation() != null) {
                data.set("postConfirmation", om.valueToTree(this.getPostConfirmation()));
            }
            if (this.getPreAuthentication() != null) {
                data.set("preAuthentication", om.valueToTree(this.getPreAuthentication()));
            }
            if (this.getPreSignUp() != null) {
                data.set("preSignUp", om.valueToTree(this.getPreSignUp()));
            }
            if (this.getPreTokenGeneration() != null) {
                data.set("preTokenGeneration", om.valueToTree(this.getPreTokenGeneration()));
            }
            if (this.getUserMigration() != null) {
                data.set("userMigration", om.valueToTree(this.getUserMigration()));
            }
            if (this.getVerifyAuthChallengeResponse() != null) {
                data.set("verifyAuthChallengeResponse", om.valueToTree(this.getVerifyAuthChallengeResponse()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.CognitoUserPoolLambdaConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CognitoUserPoolLambdaConfig.Jsii$Proxy that = (CognitoUserPoolLambdaConfig.Jsii$Proxy) o;

            if (this.createAuthChallenge != null ? !this.createAuthChallenge.equals(that.createAuthChallenge) : that.createAuthChallenge != null) return false;
            if (this.customMessage != null ? !this.customMessage.equals(that.customMessage) : that.customMessage != null) return false;
            if (this.defineAuthChallenge != null ? !this.defineAuthChallenge.equals(that.defineAuthChallenge) : that.defineAuthChallenge != null) return false;
            if (this.postAuthentication != null ? !this.postAuthentication.equals(that.postAuthentication) : that.postAuthentication != null) return false;
            if (this.postConfirmation != null ? !this.postConfirmation.equals(that.postConfirmation) : that.postConfirmation != null) return false;
            if (this.preAuthentication != null ? !this.preAuthentication.equals(that.preAuthentication) : that.preAuthentication != null) return false;
            if (this.preSignUp != null ? !this.preSignUp.equals(that.preSignUp) : that.preSignUp != null) return false;
            if (this.preTokenGeneration != null ? !this.preTokenGeneration.equals(that.preTokenGeneration) : that.preTokenGeneration != null) return false;
            if (this.userMigration != null ? !this.userMigration.equals(that.userMigration) : that.userMigration != null) return false;
            return this.verifyAuthChallengeResponse != null ? this.verifyAuthChallengeResponse.equals(that.verifyAuthChallengeResponse) : that.verifyAuthChallengeResponse == null;
        }

        @Override
        public final int hashCode() {
            int result = this.createAuthChallenge != null ? this.createAuthChallenge.hashCode() : 0;
            result = 31 * result + (this.customMessage != null ? this.customMessage.hashCode() : 0);
            result = 31 * result + (this.defineAuthChallenge != null ? this.defineAuthChallenge.hashCode() : 0);
            result = 31 * result + (this.postAuthentication != null ? this.postAuthentication.hashCode() : 0);
            result = 31 * result + (this.postConfirmation != null ? this.postConfirmation.hashCode() : 0);
            result = 31 * result + (this.preAuthentication != null ? this.preAuthentication.hashCode() : 0);
            result = 31 * result + (this.preSignUp != null ? this.preSignUp.hashCode() : 0);
            result = 31 * result + (this.preTokenGeneration != null ? this.preTokenGeneration.hashCode() : 0);
            result = 31 * result + (this.userMigration != null ? this.userMigration.hashCode() : 0);
            result = 31 * result + (this.verifyAuthChallengeResponse != null ? this.verifyAuthChallengeResponse.hashCode() : 0);
            return result;
        }
    }
}
