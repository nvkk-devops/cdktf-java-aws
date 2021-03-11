package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.063Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AutoscalingGroupMixedInstancesPolicyInstancesDistribution")
@software.amazon.jsii.Jsii.Proxy(AutoscalingGroupMixedInstancesPolicyInstancesDistribution.Jsii$Proxy.class)
public interface AutoscalingGroupMixedInstancesPolicyInstancesDistribution extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.String getOnDemandAllocationStrategy() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getOnDemandBaseCapacity() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getOnDemandPercentageAboveBaseCapacity() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSpotAllocationStrategy() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getSpotInstancePools() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSpotMaxPrice() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AutoscalingGroupMixedInstancesPolicyInstancesDistribution}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AutoscalingGroupMixedInstancesPolicyInstancesDistribution}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AutoscalingGroupMixedInstancesPolicyInstancesDistribution> {
        private java.lang.String onDemandAllocationStrategy;
        private java.lang.Number onDemandBaseCapacity;
        private java.lang.Number onDemandPercentageAboveBaseCapacity;
        private java.lang.String spotAllocationStrategy;
        private java.lang.Number spotInstancePools;
        private java.lang.String spotMaxPrice;

        /**
         * Sets the value of {@link AutoscalingGroupMixedInstancesPolicyInstancesDistribution#getOnDemandAllocationStrategy}
         * @param onDemandAllocationStrategy the value to be set.
         * @return {@code this}
         */
        public Builder onDemandAllocationStrategy(java.lang.String onDemandAllocationStrategy) {
            this.onDemandAllocationStrategy = onDemandAllocationStrategy;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingGroupMixedInstancesPolicyInstancesDistribution#getOnDemandBaseCapacity}
         * @param onDemandBaseCapacity the value to be set.
         * @return {@code this}
         */
        public Builder onDemandBaseCapacity(java.lang.Number onDemandBaseCapacity) {
            this.onDemandBaseCapacity = onDemandBaseCapacity;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingGroupMixedInstancesPolicyInstancesDistribution#getOnDemandPercentageAboveBaseCapacity}
         * @param onDemandPercentageAboveBaseCapacity the value to be set.
         * @return {@code this}
         */
        public Builder onDemandPercentageAboveBaseCapacity(java.lang.Number onDemandPercentageAboveBaseCapacity) {
            this.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingGroupMixedInstancesPolicyInstancesDistribution#getSpotAllocationStrategy}
         * @param spotAllocationStrategy the value to be set.
         * @return {@code this}
         */
        public Builder spotAllocationStrategy(java.lang.String spotAllocationStrategy) {
            this.spotAllocationStrategy = spotAllocationStrategy;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingGroupMixedInstancesPolicyInstancesDistribution#getSpotInstancePools}
         * @param spotInstancePools the value to be set.
         * @return {@code this}
         */
        public Builder spotInstancePools(java.lang.Number spotInstancePools) {
            this.spotInstancePools = spotInstancePools;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingGroupMixedInstancesPolicyInstancesDistribution#getSpotMaxPrice}
         * @param spotMaxPrice the value to be set.
         * @return {@code this}
         */
        public Builder spotMaxPrice(java.lang.String spotMaxPrice) {
            this.spotMaxPrice = spotMaxPrice;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AutoscalingGroupMixedInstancesPolicyInstancesDistribution}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AutoscalingGroupMixedInstancesPolicyInstancesDistribution build() {
            return new Jsii$Proxy(onDemandAllocationStrategy, onDemandBaseCapacity, onDemandPercentageAboveBaseCapacity, spotAllocationStrategy, spotInstancePools, spotMaxPrice);
        }
    }

    /**
     * An implementation for {@link AutoscalingGroupMixedInstancesPolicyInstancesDistribution}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AutoscalingGroupMixedInstancesPolicyInstancesDistribution {
        private final java.lang.String onDemandAllocationStrategy;
        private final java.lang.Number onDemandBaseCapacity;
        private final java.lang.Number onDemandPercentageAboveBaseCapacity;
        private final java.lang.String spotAllocationStrategy;
        private final java.lang.Number spotInstancePools;
        private final java.lang.String spotMaxPrice;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.onDemandAllocationStrategy = software.amazon.jsii.Kernel.get(this, "onDemandAllocationStrategy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.onDemandBaseCapacity = software.amazon.jsii.Kernel.get(this, "onDemandBaseCapacity", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.onDemandPercentageAboveBaseCapacity = software.amazon.jsii.Kernel.get(this, "onDemandPercentageAboveBaseCapacity", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.spotAllocationStrategy = software.amazon.jsii.Kernel.get(this, "spotAllocationStrategy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.spotInstancePools = software.amazon.jsii.Kernel.get(this, "spotInstancePools", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.spotMaxPrice = software.amazon.jsii.Kernel.get(this, "spotMaxPrice", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String onDemandAllocationStrategy, final java.lang.Number onDemandBaseCapacity, final java.lang.Number onDemandPercentageAboveBaseCapacity, final java.lang.String spotAllocationStrategy, final java.lang.Number spotInstancePools, final java.lang.String spotMaxPrice) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.onDemandAllocationStrategy = onDemandAllocationStrategy;
            this.onDemandBaseCapacity = onDemandBaseCapacity;
            this.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
            this.spotAllocationStrategy = spotAllocationStrategy;
            this.spotInstancePools = spotInstancePools;
            this.spotMaxPrice = spotMaxPrice;
        }

        @Override
        public final java.lang.String getOnDemandAllocationStrategy() {
            return this.onDemandAllocationStrategy;
        }

        @Override
        public final java.lang.Number getOnDemandBaseCapacity() {
            return this.onDemandBaseCapacity;
        }

        @Override
        public final java.lang.Number getOnDemandPercentageAboveBaseCapacity() {
            return this.onDemandPercentageAboveBaseCapacity;
        }

        @Override
        public final java.lang.String getSpotAllocationStrategy() {
            return this.spotAllocationStrategy;
        }

        @Override
        public final java.lang.Number getSpotInstancePools() {
            return this.spotInstancePools;
        }

        @Override
        public final java.lang.String getSpotMaxPrice() {
            return this.spotMaxPrice;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getOnDemandAllocationStrategy() != null) {
                data.set("onDemandAllocationStrategy", om.valueToTree(this.getOnDemandAllocationStrategy()));
            }
            if (this.getOnDemandBaseCapacity() != null) {
                data.set("onDemandBaseCapacity", om.valueToTree(this.getOnDemandBaseCapacity()));
            }
            if (this.getOnDemandPercentageAboveBaseCapacity() != null) {
                data.set("onDemandPercentageAboveBaseCapacity", om.valueToTree(this.getOnDemandPercentageAboveBaseCapacity()));
            }
            if (this.getSpotAllocationStrategy() != null) {
                data.set("spotAllocationStrategy", om.valueToTree(this.getSpotAllocationStrategy()));
            }
            if (this.getSpotInstancePools() != null) {
                data.set("spotInstancePools", om.valueToTree(this.getSpotInstancePools()));
            }
            if (this.getSpotMaxPrice() != null) {
                data.set("spotMaxPrice", om.valueToTree(this.getSpotMaxPrice()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.AutoscalingGroupMixedInstancesPolicyInstancesDistribution"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AutoscalingGroupMixedInstancesPolicyInstancesDistribution.Jsii$Proxy that = (AutoscalingGroupMixedInstancesPolicyInstancesDistribution.Jsii$Proxy) o;

            if (this.onDemandAllocationStrategy != null ? !this.onDemandAllocationStrategy.equals(that.onDemandAllocationStrategy) : that.onDemandAllocationStrategy != null) return false;
            if (this.onDemandBaseCapacity != null ? !this.onDemandBaseCapacity.equals(that.onDemandBaseCapacity) : that.onDemandBaseCapacity != null) return false;
            if (this.onDemandPercentageAboveBaseCapacity != null ? !this.onDemandPercentageAboveBaseCapacity.equals(that.onDemandPercentageAboveBaseCapacity) : that.onDemandPercentageAboveBaseCapacity != null) return false;
            if (this.spotAllocationStrategy != null ? !this.spotAllocationStrategy.equals(that.spotAllocationStrategy) : that.spotAllocationStrategy != null) return false;
            if (this.spotInstancePools != null ? !this.spotInstancePools.equals(that.spotInstancePools) : that.spotInstancePools != null) return false;
            return this.spotMaxPrice != null ? this.spotMaxPrice.equals(that.spotMaxPrice) : that.spotMaxPrice == null;
        }

        @Override
        public final int hashCode() {
            int result = this.onDemandAllocationStrategy != null ? this.onDemandAllocationStrategy.hashCode() : 0;
            result = 31 * result + (this.onDemandBaseCapacity != null ? this.onDemandBaseCapacity.hashCode() : 0);
            result = 31 * result + (this.onDemandPercentageAboveBaseCapacity != null ? this.onDemandPercentageAboveBaseCapacity.hashCode() : 0);
            result = 31 * result + (this.spotAllocationStrategy != null ? this.spotAllocationStrategy.hashCode() : 0);
            result = 31 * result + (this.spotInstancePools != null ? this.spotInstancePools.hashCode() : 0);
            result = 31 * result + (this.spotMaxPrice != null ? this.spotMaxPrice.hashCode() : 0);
            return result;
        }
    }
}
