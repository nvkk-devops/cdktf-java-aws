package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.489Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Ec2FleetSpotOptions")
@software.amazon.jsii.Jsii.Proxy(Ec2FleetSpotOptions.Jsii$Proxy.class)
public interface Ec2FleetSpotOptions extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.String getAllocationStrategy() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getInstanceInterruptionBehavior() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getInstancePoolsToUseCount() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Ec2FleetSpotOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Ec2FleetSpotOptions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Ec2FleetSpotOptions> {
        private java.lang.String allocationStrategy;
        private java.lang.String instanceInterruptionBehavior;
        private java.lang.Number instancePoolsToUseCount;

        /**
         * Sets the value of {@link Ec2FleetSpotOptions#getAllocationStrategy}
         * @param allocationStrategy the value to be set.
         * @return {@code this}
         */
        public Builder allocationStrategy(java.lang.String allocationStrategy) {
            this.allocationStrategy = allocationStrategy;
            return this;
        }

        /**
         * Sets the value of {@link Ec2FleetSpotOptions#getInstanceInterruptionBehavior}
         * @param instanceInterruptionBehavior the value to be set.
         * @return {@code this}
         */
        public Builder instanceInterruptionBehavior(java.lang.String instanceInterruptionBehavior) {
            this.instanceInterruptionBehavior = instanceInterruptionBehavior;
            return this;
        }

        /**
         * Sets the value of {@link Ec2FleetSpotOptions#getInstancePoolsToUseCount}
         * @param instancePoolsToUseCount the value to be set.
         * @return {@code this}
         */
        public Builder instancePoolsToUseCount(java.lang.Number instancePoolsToUseCount) {
            this.instancePoolsToUseCount = instancePoolsToUseCount;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Ec2FleetSpotOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Ec2FleetSpotOptions build() {
            return new Jsii$Proxy(allocationStrategy, instanceInterruptionBehavior, instancePoolsToUseCount);
        }
    }

    /**
     * An implementation for {@link Ec2FleetSpotOptions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Ec2FleetSpotOptions {
        private final java.lang.String allocationStrategy;
        private final java.lang.String instanceInterruptionBehavior;
        private final java.lang.Number instancePoolsToUseCount;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.allocationStrategy = software.amazon.jsii.Kernel.get(this, "allocationStrategy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.instanceInterruptionBehavior = software.amazon.jsii.Kernel.get(this, "instanceInterruptionBehavior", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.instancePoolsToUseCount = software.amazon.jsii.Kernel.get(this, "instancePoolsToUseCount", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String allocationStrategy, final java.lang.String instanceInterruptionBehavior, final java.lang.Number instancePoolsToUseCount) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.allocationStrategy = allocationStrategy;
            this.instanceInterruptionBehavior = instanceInterruptionBehavior;
            this.instancePoolsToUseCount = instancePoolsToUseCount;
        }

        @Override
        public final java.lang.String getAllocationStrategy() {
            return this.allocationStrategy;
        }

        @Override
        public final java.lang.String getInstanceInterruptionBehavior() {
            return this.instanceInterruptionBehavior;
        }

        @Override
        public final java.lang.Number getInstancePoolsToUseCount() {
            return this.instancePoolsToUseCount;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAllocationStrategy() != null) {
                data.set("allocationStrategy", om.valueToTree(this.getAllocationStrategy()));
            }
            if (this.getInstanceInterruptionBehavior() != null) {
                data.set("instanceInterruptionBehavior", om.valueToTree(this.getInstanceInterruptionBehavior()));
            }
            if (this.getInstancePoolsToUseCount() != null) {
                data.set("instancePoolsToUseCount", om.valueToTree(this.getInstancePoolsToUseCount()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.Ec2FleetSpotOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Ec2FleetSpotOptions.Jsii$Proxy that = (Ec2FleetSpotOptions.Jsii$Proxy) o;

            if (this.allocationStrategy != null ? !this.allocationStrategy.equals(that.allocationStrategy) : that.allocationStrategy != null) return false;
            if (this.instanceInterruptionBehavior != null ? !this.instanceInterruptionBehavior.equals(that.instanceInterruptionBehavior) : that.instanceInterruptionBehavior != null) return false;
            return this.instancePoolsToUseCount != null ? this.instancePoolsToUseCount.equals(that.instancePoolsToUseCount) : that.instancePoolsToUseCount == null;
        }

        @Override
        public final int hashCode() {
            int result = this.allocationStrategy != null ? this.allocationStrategy.hashCode() : 0;
            result = 31 * result + (this.instanceInterruptionBehavior != null ? this.instanceInterruptionBehavior.hashCode() : 0);
            result = 31 * result + (this.instancePoolsToUseCount != null ? this.instancePoolsToUseCount.hashCode() : 0);
            return result;
        }
    }
}
