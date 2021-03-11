package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.081Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AwsProviderAssumeRole")
@software.amazon.jsii.Jsii.Proxy(AwsProviderAssumeRole.Jsii$Proxy.class)
public interface AwsProviderAssumeRole extends software.amazon.jsii.JsiiSerializable {

    /**
     * The external ID to use when assuming the role.
     * <p>
     * If omitted, no external ID is passed to the AssumeRole call.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getExternalId() {
        return null;
    }

    /**
     * The permissions applied when assuming a role.
     * <p>
     * You cannot use, this policy to grant further permissions that are in excess to those of the,  role that is being assumed.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPolicy() {
        return null;
    }

    /**
     * The ARN of an IAM role to assume prior to making API calls.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRoleArn() {
        return null;
    }

    /**
     * The session name to use when assuming the role.
     * <p>
     * If omitted, no session name is passed to the AssumeRole call.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSessionName() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AwsProviderAssumeRole}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AwsProviderAssumeRole}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AwsProviderAssumeRole> {
        private java.lang.String externalId;
        private java.lang.String policy;
        private java.lang.String roleArn;
        private java.lang.String sessionName;

        /**
         * Sets the value of {@link AwsProviderAssumeRole#getExternalId}
         * @param externalId The external ID to use when assuming the role.
         *                   If omitted, no external ID is passed to the AssumeRole call.
         * @return {@code this}
         */
        public Builder externalId(java.lang.String externalId) {
            this.externalId = externalId;
            return this;
        }

        /**
         * Sets the value of {@link AwsProviderAssumeRole#getPolicy}
         * @param policy The permissions applied when assuming a role.
         *               You cannot use, this policy to grant further permissions that are in excess to those of the,  role that is being assumed.
         * @return {@code this}
         */
        public Builder policy(java.lang.String policy) {
            this.policy = policy;
            return this;
        }

        /**
         * Sets the value of {@link AwsProviderAssumeRole#getRoleArn}
         * @param roleArn The ARN of an IAM role to assume prior to making API calls.
         * @return {@code this}
         */
        public Builder roleArn(java.lang.String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        /**
         * Sets the value of {@link AwsProviderAssumeRole#getSessionName}
         * @param sessionName The session name to use when assuming the role.
         *                    If omitted, no session name is passed to the AssumeRole call.
         * @return {@code this}
         */
        public Builder sessionName(java.lang.String sessionName) {
            this.sessionName = sessionName;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AwsProviderAssumeRole}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AwsProviderAssumeRole build() {
            return new Jsii$Proxy(externalId, policy, roleArn, sessionName);
        }
    }

    /**
     * An implementation for {@link AwsProviderAssumeRole}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AwsProviderAssumeRole {
        private final java.lang.String externalId;
        private final java.lang.String policy;
        private final java.lang.String roleArn;
        private final java.lang.String sessionName;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.externalId = software.amazon.jsii.Kernel.get(this, "externalId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.policy = software.amazon.jsii.Kernel.get(this, "policy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.roleArn = software.amazon.jsii.Kernel.get(this, "roleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.sessionName = software.amazon.jsii.Kernel.get(this, "sessionName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String externalId, final java.lang.String policy, final java.lang.String roleArn, final java.lang.String sessionName) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.externalId = externalId;
            this.policy = policy;
            this.roleArn = roleArn;
            this.sessionName = sessionName;
        }

        @Override
        public final java.lang.String getExternalId() {
            return this.externalId;
        }

        @Override
        public final java.lang.String getPolicy() {
            return this.policy;
        }

        @Override
        public final java.lang.String getRoleArn() {
            return this.roleArn;
        }

        @Override
        public final java.lang.String getSessionName() {
            return this.sessionName;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getExternalId() != null) {
                data.set("externalId", om.valueToTree(this.getExternalId()));
            }
            if (this.getPolicy() != null) {
                data.set("policy", om.valueToTree(this.getPolicy()));
            }
            if (this.getRoleArn() != null) {
                data.set("roleArn", om.valueToTree(this.getRoleArn()));
            }
            if (this.getSessionName() != null) {
                data.set("sessionName", om.valueToTree(this.getSessionName()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.AwsProviderAssumeRole"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AwsProviderAssumeRole.Jsii$Proxy that = (AwsProviderAssumeRole.Jsii$Proxy) o;

            if (this.externalId != null ? !this.externalId.equals(that.externalId) : that.externalId != null) return false;
            if (this.policy != null ? !this.policy.equals(that.policy) : that.policy != null) return false;
            if (this.roleArn != null ? !this.roleArn.equals(that.roleArn) : that.roleArn != null) return false;
            return this.sessionName != null ? this.sessionName.equals(that.sessionName) : that.sessionName == null;
        }

        @Override
        public final int hashCode() {
            int result = this.externalId != null ? this.externalId.hashCode() : 0;
            result = 31 * result + (this.policy != null ? this.policy.hashCode() : 0);
            result = 31 * result + (this.roleArn != null ? this.roleArn.hashCode() : 0);
            result = 31 * result + (this.sessionName != null ? this.sessionName.hashCode() : 0);
            return result;
        }
    }
}
