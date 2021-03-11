package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.515Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.EcsServiceLoadBalancer")
@software.amazon.jsii.Jsii.Proxy(EcsServiceLoadBalancer.Jsii$Proxy.class)
public interface EcsServiceLoadBalancer extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getContainerName();

    @org.jetbrains.annotations.NotNull java.lang.Number getContainerPort();

    default @org.jetbrains.annotations.Nullable java.lang.String getElbName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getTargetGroupArn() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link EcsServiceLoadBalancer}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link EcsServiceLoadBalancer}
     */
    public static final class Builder implements software.amazon.jsii.Builder<EcsServiceLoadBalancer> {
        private java.lang.String containerName;
        private java.lang.Number containerPort;
        private java.lang.String elbName;
        private java.lang.String targetGroupArn;

        /**
         * Sets the value of {@link EcsServiceLoadBalancer#getContainerName}
         * @param containerName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder containerName(java.lang.String containerName) {
            this.containerName = containerName;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceLoadBalancer#getContainerPort}
         * @param containerPort the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder containerPort(java.lang.Number containerPort) {
            this.containerPort = containerPort;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceLoadBalancer#getElbName}
         * @param elbName the value to be set.
         * @return {@code this}
         */
        public Builder elbName(java.lang.String elbName) {
            this.elbName = elbName;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceLoadBalancer#getTargetGroupArn}
         * @param targetGroupArn the value to be set.
         * @return {@code this}
         */
        public Builder targetGroupArn(java.lang.String targetGroupArn) {
            this.targetGroupArn = targetGroupArn;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link EcsServiceLoadBalancer}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public EcsServiceLoadBalancer build() {
            return new Jsii$Proxy(containerName, containerPort, elbName, targetGroupArn);
        }
    }

    /**
     * An implementation for {@link EcsServiceLoadBalancer}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements EcsServiceLoadBalancer {
        private final java.lang.String containerName;
        private final java.lang.Number containerPort;
        private final java.lang.String elbName;
        private final java.lang.String targetGroupArn;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.containerName = software.amazon.jsii.Kernel.get(this, "containerName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.containerPort = software.amazon.jsii.Kernel.get(this, "containerPort", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.elbName = software.amazon.jsii.Kernel.get(this, "elbName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.targetGroupArn = software.amazon.jsii.Kernel.get(this, "targetGroupArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String containerName, final java.lang.Number containerPort, final java.lang.String elbName, final java.lang.String targetGroupArn) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.containerName = java.util.Objects.requireNonNull(containerName, "containerName is required");
            this.containerPort = java.util.Objects.requireNonNull(containerPort, "containerPort is required");
            this.elbName = elbName;
            this.targetGroupArn = targetGroupArn;
        }

        @Override
        public final java.lang.String getContainerName() {
            return this.containerName;
        }

        @Override
        public final java.lang.Number getContainerPort() {
            return this.containerPort;
        }

        @Override
        public final java.lang.String getElbName() {
            return this.elbName;
        }

        @Override
        public final java.lang.String getTargetGroupArn() {
            return this.targetGroupArn;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("containerName", om.valueToTree(this.getContainerName()));
            data.set("containerPort", om.valueToTree(this.getContainerPort()));
            if (this.getElbName() != null) {
                data.set("elbName", om.valueToTree(this.getElbName()));
            }
            if (this.getTargetGroupArn() != null) {
                data.set("targetGroupArn", om.valueToTree(this.getTargetGroupArn()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.EcsServiceLoadBalancer"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EcsServiceLoadBalancer.Jsii$Proxy that = (EcsServiceLoadBalancer.Jsii$Proxy) o;

            if (!containerName.equals(that.containerName)) return false;
            if (!containerPort.equals(that.containerPort)) return false;
            if (this.elbName != null ? !this.elbName.equals(that.elbName) : that.elbName != null) return false;
            return this.targetGroupArn != null ? this.targetGroupArn.equals(that.targetGroupArn) : that.targetGroupArn == null;
        }

        @Override
        public final int hashCode() {
            int result = this.containerName.hashCode();
            result = 31 * result + (this.containerPort.hashCode());
            result = 31 * result + (this.elbName != null ? this.elbName.hashCode() : 0);
            result = 31 * result + (this.targetGroupArn != null ? this.targetGroupArn.hashCode() : 0);
            return result;
        }
    }
}
