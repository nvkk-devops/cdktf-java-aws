package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.573Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.EmrClusterMasterInstanceGroup")
@software.amazon.jsii.Jsii.Proxy(EmrClusterMasterInstanceGroup.Jsii$Proxy.class)
public interface EmrClusterMasterInstanceGroup extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getInstanceType();

    default @org.jetbrains.annotations.Nullable java.lang.String getBidPrice() {
        return null;
    }

    /**
     * ebs_config block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.EmrClusterMasterInstanceGroupEbsConfig> getEbsConfig() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getInstanceCount() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link EmrClusterMasterInstanceGroup}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link EmrClusterMasterInstanceGroup}
     */
    public static final class Builder implements software.amazon.jsii.Builder<EmrClusterMasterInstanceGroup> {
        private java.lang.String instanceType;
        private java.lang.String bidPrice;
        private java.util.List<imports.aws.EmrClusterMasterInstanceGroupEbsConfig> ebsConfig;
        private java.lang.Number instanceCount;
        private java.lang.String name;

        /**
         * Sets the value of {@link EmrClusterMasterInstanceGroup#getInstanceType}
         * @param instanceType the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder instanceType(java.lang.String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * Sets the value of {@link EmrClusterMasterInstanceGroup#getBidPrice}
         * @param bidPrice the value to be set.
         * @return {@code this}
         */
        public Builder bidPrice(java.lang.String bidPrice) {
            this.bidPrice = bidPrice;
            return this;
        }

        /**
         * Sets the value of {@link EmrClusterMasterInstanceGroup#getEbsConfig}
         * @param ebsConfig ebs_config block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder ebsConfig(java.util.List<? extends imports.aws.EmrClusterMasterInstanceGroupEbsConfig> ebsConfig) {
            this.ebsConfig = (java.util.List<imports.aws.EmrClusterMasterInstanceGroupEbsConfig>)ebsConfig;
            return this;
        }

        /**
         * Sets the value of {@link EmrClusterMasterInstanceGroup#getInstanceCount}
         * @param instanceCount the value to be set.
         * @return {@code this}
         */
        public Builder instanceCount(java.lang.Number instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }

        /**
         * Sets the value of {@link EmrClusterMasterInstanceGroup#getName}
         * @param name the value to be set.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link EmrClusterMasterInstanceGroup}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public EmrClusterMasterInstanceGroup build() {
            return new Jsii$Proxy(instanceType, bidPrice, ebsConfig, instanceCount, name);
        }
    }

    /**
     * An implementation for {@link EmrClusterMasterInstanceGroup}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements EmrClusterMasterInstanceGroup {
        private final java.lang.String instanceType;
        private final java.lang.String bidPrice;
        private final java.util.List<imports.aws.EmrClusterMasterInstanceGroupEbsConfig> ebsConfig;
        private final java.lang.Number instanceCount;
        private final java.lang.String name;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.instanceType = software.amazon.jsii.Kernel.get(this, "instanceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.bidPrice = software.amazon.jsii.Kernel.get(this, "bidPrice", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.ebsConfig = software.amazon.jsii.Kernel.get(this, "ebsConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EmrClusterMasterInstanceGroupEbsConfig.class)));
            this.instanceCount = software.amazon.jsii.Kernel.get(this, "instanceCount", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String instanceType, final java.lang.String bidPrice, final java.util.List<? extends imports.aws.EmrClusterMasterInstanceGroupEbsConfig> ebsConfig, final java.lang.Number instanceCount, final java.lang.String name) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.instanceType = java.util.Objects.requireNonNull(instanceType, "instanceType is required");
            this.bidPrice = bidPrice;
            this.ebsConfig = (java.util.List<imports.aws.EmrClusterMasterInstanceGroupEbsConfig>)ebsConfig;
            this.instanceCount = instanceCount;
            this.name = name;
        }

        @Override
        public final java.lang.String getInstanceType() {
            return this.instanceType;
        }

        @Override
        public final java.lang.String getBidPrice() {
            return this.bidPrice;
        }

        @Override
        public final java.util.List<imports.aws.EmrClusterMasterInstanceGroupEbsConfig> getEbsConfig() {
            return this.ebsConfig;
        }

        @Override
        public final java.lang.Number getInstanceCount() {
            return this.instanceCount;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("instanceType", om.valueToTree(this.getInstanceType()));
            if (this.getBidPrice() != null) {
                data.set("bidPrice", om.valueToTree(this.getBidPrice()));
            }
            if (this.getEbsConfig() != null) {
                data.set("ebsConfig", om.valueToTree(this.getEbsConfig()));
            }
            if (this.getInstanceCount() != null) {
                data.set("instanceCount", om.valueToTree(this.getInstanceCount()));
            }
            if (this.getName() != null) {
                data.set("name", om.valueToTree(this.getName()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.EmrClusterMasterInstanceGroup"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EmrClusterMasterInstanceGroup.Jsii$Proxy that = (EmrClusterMasterInstanceGroup.Jsii$Proxy) o;

            if (!instanceType.equals(that.instanceType)) return false;
            if (this.bidPrice != null ? !this.bidPrice.equals(that.bidPrice) : that.bidPrice != null) return false;
            if (this.ebsConfig != null ? !this.ebsConfig.equals(that.ebsConfig) : that.ebsConfig != null) return false;
            if (this.instanceCount != null ? !this.instanceCount.equals(that.instanceCount) : that.instanceCount != null) return false;
            return this.name != null ? this.name.equals(that.name) : that.name == null;
        }

        @Override
        public final int hashCode() {
            int result = this.instanceType.hashCode();
            result = 31 * result + (this.bidPrice != null ? this.bidPrice.hashCode() : 0);
            result = 31 * result + (this.ebsConfig != null ? this.ebsConfig.hashCode() : 0);
            result = 31 * result + (this.instanceCount != null ? this.instanceCount.hashCode() : 0);
            result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
            return result;
        }
    }
}
