package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.157Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CloudwatchEventTargetEcsTargetNetworkConfiguration")
@software.amazon.jsii.Jsii.Proxy(CloudwatchEventTargetEcsTargetNetworkConfiguration.Jsii$Proxy.class)
public interface CloudwatchEventTargetEcsTargetNetworkConfiguration extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getSubnets();

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAssignPublicIp() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSecurityGroups() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CloudwatchEventTargetEcsTargetNetworkConfiguration}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CloudwatchEventTargetEcsTargetNetworkConfiguration}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CloudwatchEventTargetEcsTargetNetworkConfiguration> {
        private java.util.List<java.lang.String> subnets;
        private java.lang.Boolean assignPublicIp;
        private java.util.List<java.lang.String> securityGroups;

        /**
         * Sets the value of {@link CloudwatchEventTargetEcsTargetNetworkConfiguration#getSubnets}
         * @param subnets the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder subnets(java.util.List<java.lang.String> subnets) {
            this.subnets = subnets;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchEventTargetEcsTargetNetworkConfiguration#getAssignPublicIp}
         * @param assignPublicIp the value to be set.
         * @return {@code this}
         */
        public Builder assignPublicIp(java.lang.Boolean assignPublicIp) {
            this.assignPublicIp = assignPublicIp;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchEventTargetEcsTargetNetworkConfiguration#getSecurityGroups}
         * @param securityGroups the value to be set.
         * @return {@code this}
         */
        public Builder securityGroups(java.util.List<java.lang.String> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CloudwatchEventTargetEcsTargetNetworkConfiguration}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CloudwatchEventTargetEcsTargetNetworkConfiguration build() {
            return new Jsii$Proxy(subnets, assignPublicIp, securityGroups);
        }
    }

    /**
     * An implementation for {@link CloudwatchEventTargetEcsTargetNetworkConfiguration}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CloudwatchEventTargetEcsTargetNetworkConfiguration {
        private final java.util.List<java.lang.String> subnets;
        private final java.lang.Boolean assignPublicIp;
        private final java.util.List<java.lang.String> securityGroups;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.subnets = software.amazon.jsii.Kernel.get(this, "subnets", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.assignPublicIp = software.amazon.jsii.Kernel.get(this, "assignPublicIp", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.securityGroups = software.amazon.jsii.Kernel.get(this, "securityGroups", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.util.List<java.lang.String> subnets, final java.lang.Boolean assignPublicIp, final java.util.List<java.lang.String> securityGroups) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.subnets = java.util.Objects.requireNonNull(subnets, "subnets is required");
            this.assignPublicIp = assignPublicIp;
            this.securityGroups = securityGroups;
        }

        @Override
        public final java.util.List<java.lang.String> getSubnets() {
            return this.subnets;
        }

        @Override
        public final java.lang.Boolean getAssignPublicIp() {
            return this.assignPublicIp;
        }

        @Override
        public final java.util.List<java.lang.String> getSecurityGroups() {
            return this.securityGroups;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("subnets", om.valueToTree(this.getSubnets()));
            if (this.getAssignPublicIp() != null) {
                data.set("assignPublicIp", om.valueToTree(this.getAssignPublicIp()));
            }
            if (this.getSecurityGroups() != null) {
                data.set("securityGroups", om.valueToTree(this.getSecurityGroups()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.CloudwatchEventTargetEcsTargetNetworkConfiguration"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CloudwatchEventTargetEcsTargetNetworkConfiguration.Jsii$Proxy that = (CloudwatchEventTargetEcsTargetNetworkConfiguration.Jsii$Proxy) o;

            if (!subnets.equals(that.subnets)) return false;
            if (this.assignPublicIp != null ? !this.assignPublicIp.equals(that.assignPublicIp) : that.assignPublicIp != null) return false;
            return this.securityGroups != null ? this.securityGroups.equals(that.securityGroups) : that.securityGroups == null;
        }

        @Override
        public final int hashCode() {
            int result = this.subnets.hashCode();
            result = 31 * result + (this.assignPublicIp != null ? this.assignPublicIp.hashCode() : 0);
            result = 31 * result + (this.securityGroups != null ? this.securityGroups.hashCode() : 0);
            return result;
        }
    }
}
