package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.486Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Ec2ClientVpnEndpointConnectionLogOptions")
@software.amazon.jsii.Jsii.Proxy(Ec2ClientVpnEndpointConnectionLogOptions.Jsii$Proxy.class)
public interface Ec2ClientVpnEndpointConnectionLogOptions extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.Boolean getEnabled();

    default @org.jetbrains.annotations.Nullable java.lang.String getCloudwatchLogGroup() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getCloudwatchLogStream() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Ec2ClientVpnEndpointConnectionLogOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Ec2ClientVpnEndpointConnectionLogOptions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Ec2ClientVpnEndpointConnectionLogOptions> {
        private java.lang.Boolean enabled;
        private java.lang.String cloudwatchLogGroup;
        private java.lang.String cloudwatchLogStream;

        /**
         * Sets the value of {@link Ec2ClientVpnEndpointConnectionLogOptions#getEnabled}
         * @param enabled the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder enabled(java.lang.Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Sets the value of {@link Ec2ClientVpnEndpointConnectionLogOptions#getCloudwatchLogGroup}
         * @param cloudwatchLogGroup the value to be set.
         * @return {@code this}
         */
        public Builder cloudwatchLogGroup(java.lang.String cloudwatchLogGroup) {
            this.cloudwatchLogGroup = cloudwatchLogGroup;
            return this;
        }

        /**
         * Sets the value of {@link Ec2ClientVpnEndpointConnectionLogOptions#getCloudwatchLogStream}
         * @param cloudwatchLogStream the value to be set.
         * @return {@code this}
         */
        public Builder cloudwatchLogStream(java.lang.String cloudwatchLogStream) {
            this.cloudwatchLogStream = cloudwatchLogStream;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Ec2ClientVpnEndpointConnectionLogOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Ec2ClientVpnEndpointConnectionLogOptions build() {
            return new Jsii$Proxy(enabled, cloudwatchLogGroup, cloudwatchLogStream);
        }
    }

    /**
     * An implementation for {@link Ec2ClientVpnEndpointConnectionLogOptions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Ec2ClientVpnEndpointConnectionLogOptions {
        private final java.lang.Boolean enabled;
        private final java.lang.String cloudwatchLogGroup;
        private final java.lang.String cloudwatchLogStream;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.enabled = software.amazon.jsii.Kernel.get(this, "enabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.cloudwatchLogGroup = software.amazon.jsii.Kernel.get(this, "cloudwatchLogGroup", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.cloudwatchLogStream = software.amazon.jsii.Kernel.get(this, "cloudwatchLogStream", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.Boolean enabled, final java.lang.String cloudwatchLogGroup, final java.lang.String cloudwatchLogStream) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.enabled = java.util.Objects.requireNonNull(enabled, "enabled is required");
            this.cloudwatchLogGroup = cloudwatchLogGroup;
            this.cloudwatchLogStream = cloudwatchLogStream;
        }

        @Override
        public final java.lang.Boolean getEnabled() {
            return this.enabled;
        }

        @Override
        public final java.lang.String getCloudwatchLogGroup() {
            return this.cloudwatchLogGroup;
        }

        @Override
        public final java.lang.String getCloudwatchLogStream() {
            return this.cloudwatchLogStream;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("enabled", om.valueToTree(this.getEnabled()));
            if (this.getCloudwatchLogGroup() != null) {
                data.set("cloudwatchLogGroup", om.valueToTree(this.getCloudwatchLogGroup()));
            }
            if (this.getCloudwatchLogStream() != null) {
                data.set("cloudwatchLogStream", om.valueToTree(this.getCloudwatchLogStream()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.Ec2ClientVpnEndpointConnectionLogOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Ec2ClientVpnEndpointConnectionLogOptions.Jsii$Proxy that = (Ec2ClientVpnEndpointConnectionLogOptions.Jsii$Proxy) o;

            if (!enabled.equals(that.enabled)) return false;
            if (this.cloudwatchLogGroup != null ? !this.cloudwatchLogGroup.equals(that.cloudwatchLogGroup) : that.cloudwatchLogGroup != null) return false;
            return this.cloudwatchLogStream != null ? this.cloudwatchLogStream.equals(that.cloudwatchLogStream) : that.cloudwatchLogStream == null;
        }

        @Override
        public final int hashCode() {
            int result = this.enabled.hashCode();
            result = 31 * result + (this.cloudwatchLogGroup != null ? this.cloudwatchLogGroup.hashCode() : 0);
            result = 31 * result + (this.cloudwatchLogStream != null ? this.cloudwatchLogStream.hashCode() : 0);
            return result;
        }
    }
}
