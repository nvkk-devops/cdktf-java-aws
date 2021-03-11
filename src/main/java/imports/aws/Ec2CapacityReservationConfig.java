package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.483Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Ec2CapacityReservationConfig")
@software.amazon.jsii.Jsii.Proxy(Ec2CapacityReservationConfig.Jsii$Proxy.class)
public interface Ec2CapacityReservationConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getAvailabilityZone();

    @org.jetbrains.annotations.NotNull java.lang.Number getInstanceCount();

    @org.jetbrains.annotations.NotNull java.lang.String getInstancePlatform();

    @org.jetbrains.annotations.NotNull java.lang.String getInstanceType();

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getEbsOptimized() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getEndDate() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getEndDateType() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getEphemeralStorage() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getInstanceMatchCriteria() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getTenancy() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Ec2CapacityReservationConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Ec2CapacityReservationConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Ec2CapacityReservationConfig> {
        private java.lang.String availabilityZone;
        private java.lang.Number instanceCount;
        private java.lang.String instancePlatform;
        private java.lang.String instanceType;
        private java.lang.Boolean ebsOptimized;
        private java.lang.String endDate;
        private java.lang.String endDateType;
        private java.lang.Boolean ephemeralStorage;
        private java.lang.String instanceMatchCriteria;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.lang.String tenancy;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link Ec2CapacityReservationConfig#getAvailabilityZone}
         * @param availabilityZone the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder availabilityZone(java.lang.String availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }

        /**
         * Sets the value of {@link Ec2CapacityReservationConfig#getInstanceCount}
         * @param instanceCount the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder instanceCount(java.lang.Number instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }

        /**
         * Sets the value of {@link Ec2CapacityReservationConfig#getInstancePlatform}
         * @param instancePlatform the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder instancePlatform(java.lang.String instancePlatform) {
            this.instancePlatform = instancePlatform;
            return this;
        }

        /**
         * Sets the value of {@link Ec2CapacityReservationConfig#getInstanceType}
         * @param instanceType the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder instanceType(java.lang.String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * Sets the value of {@link Ec2CapacityReservationConfig#getEbsOptimized}
         * @param ebsOptimized the value to be set.
         * @return {@code this}
         */
        public Builder ebsOptimized(java.lang.Boolean ebsOptimized) {
            this.ebsOptimized = ebsOptimized;
            return this;
        }

        /**
         * Sets the value of {@link Ec2CapacityReservationConfig#getEndDate}
         * @param endDate the value to be set.
         * @return {@code this}
         */
        public Builder endDate(java.lang.String endDate) {
            this.endDate = endDate;
            return this;
        }

        /**
         * Sets the value of {@link Ec2CapacityReservationConfig#getEndDateType}
         * @param endDateType the value to be set.
         * @return {@code this}
         */
        public Builder endDateType(java.lang.String endDateType) {
            this.endDateType = endDateType;
            return this;
        }

        /**
         * Sets the value of {@link Ec2CapacityReservationConfig#getEphemeralStorage}
         * @param ephemeralStorage the value to be set.
         * @return {@code this}
         */
        public Builder ephemeralStorage(java.lang.Boolean ephemeralStorage) {
            this.ephemeralStorage = ephemeralStorage;
            return this;
        }

        /**
         * Sets the value of {@link Ec2CapacityReservationConfig#getInstanceMatchCriteria}
         * @param instanceMatchCriteria the value to be set.
         * @return {@code this}
         */
        public Builder instanceMatchCriteria(java.lang.String instanceMatchCriteria) {
            this.instanceMatchCriteria = instanceMatchCriteria;
            return this;
        }

        /**
         * Sets the value of {@link Ec2CapacityReservationConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link Ec2CapacityReservationConfig#getTenancy}
         * @param tenancy the value to be set.
         * @return {@code this}
         */
        public Builder tenancy(java.lang.String tenancy) {
            this.tenancy = tenancy;
            return this;
        }

        /**
         * Sets the value of {@link Ec2CapacityReservationConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link Ec2CapacityReservationConfig#getDependsOn}
         * @param dependsOn the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder dependsOn(java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            return this;
        }

        /**
         * Sets the value of {@link Ec2CapacityReservationConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link Ec2CapacityReservationConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Ec2CapacityReservationConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Ec2CapacityReservationConfig build() {
            return new Jsii$Proxy(availabilityZone, instanceCount, instancePlatform, instanceType, ebsOptimized, endDate, endDateType, ephemeralStorage, instanceMatchCriteria, tags, tenancy, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link Ec2CapacityReservationConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Ec2CapacityReservationConfig {
        private final java.lang.String availabilityZone;
        private final java.lang.Number instanceCount;
        private final java.lang.String instancePlatform;
        private final java.lang.String instanceType;
        private final java.lang.Boolean ebsOptimized;
        private final java.lang.String endDate;
        private final java.lang.String endDateType;
        private final java.lang.Boolean ephemeralStorage;
        private final java.lang.String instanceMatchCriteria;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.lang.String tenancy;
        private final java.lang.Number count;
        private final java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private final com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.availabilityZone = software.amazon.jsii.Kernel.get(this, "availabilityZone", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.instanceCount = software.amazon.jsii.Kernel.get(this, "instanceCount", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.instancePlatform = software.amazon.jsii.Kernel.get(this, "instancePlatform", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.instanceType = software.amazon.jsii.Kernel.get(this, "instanceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.ebsOptimized = software.amazon.jsii.Kernel.get(this, "ebsOptimized", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.endDate = software.amazon.jsii.Kernel.get(this, "endDate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.endDateType = software.amazon.jsii.Kernel.get(this, "endDateType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.ephemeralStorage = software.amazon.jsii.Kernel.get(this, "ephemeralStorage", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.instanceMatchCriteria = software.amazon.jsii.Kernel.get(this, "instanceMatchCriteria", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.tenancy = software.amazon.jsii.Kernel.get(this, "tenancy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String availabilityZone, final java.lang.Number instanceCount, final java.lang.String instancePlatform, final java.lang.String instanceType, final java.lang.Boolean ebsOptimized, final java.lang.String endDate, final java.lang.String endDateType, final java.lang.Boolean ephemeralStorage, final java.lang.String instanceMatchCriteria, final java.util.Map<java.lang.String, java.lang.String> tags, final java.lang.String tenancy, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.availabilityZone = java.util.Objects.requireNonNull(availabilityZone, "availabilityZone is required");
            this.instanceCount = java.util.Objects.requireNonNull(instanceCount, "instanceCount is required");
            this.instancePlatform = java.util.Objects.requireNonNull(instancePlatform, "instancePlatform is required");
            this.instanceType = java.util.Objects.requireNonNull(instanceType, "instanceType is required");
            this.ebsOptimized = ebsOptimized;
            this.endDate = endDate;
            this.endDateType = endDateType;
            this.ephemeralStorage = ephemeralStorage;
            this.instanceMatchCriteria = instanceMatchCriteria;
            this.tags = tags;
            this.tenancy = tenancy;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getAvailabilityZone() {
            return this.availabilityZone;
        }

        @Override
        public final java.lang.Number getInstanceCount() {
            return this.instanceCount;
        }

        @Override
        public final java.lang.String getInstancePlatform() {
            return this.instancePlatform;
        }

        @Override
        public final java.lang.String getInstanceType() {
            return this.instanceType;
        }

        @Override
        public final java.lang.Boolean getEbsOptimized() {
            return this.ebsOptimized;
        }

        @Override
        public final java.lang.String getEndDate() {
            return this.endDate;
        }

        @Override
        public final java.lang.String getEndDateType() {
            return this.endDateType;
        }

        @Override
        public final java.lang.Boolean getEphemeralStorage() {
            return this.ephemeralStorage;
        }

        @Override
        public final java.lang.String getInstanceMatchCriteria() {
            return this.instanceMatchCriteria;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.lang.String getTenancy() {
            return this.tenancy;
        }

        @Override
        public final java.lang.Number getCount() {
            return this.count;
        }

        @Override
        public final java.util.List<com.hashicorp.cdktf.ITerraformDependable> getDependsOn() {
            return this.dependsOn;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformResourceLifecycle getLifecycle() {
            return this.lifecycle;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformProvider getProvider() {
            return this.provider;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("availabilityZone", om.valueToTree(this.getAvailabilityZone()));
            data.set("instanceCount", om.valueToTree(this.getInstanceCount()));
            data.set("instancePlatform", om.valueToTree(this.getInstancePlatform()));
            data.set("instanceType", om.valueToTree(this.getInstanceType()));
            if (this.getEbsOptimized() != null) {
                data.set("ebsOptimized", om.valueToTree(this.getEbsOptimized()));
            }
            if (this.getEndDate() != null) {
                data.set("endDate", om.valueToTree(this.getEndDate()));
            }
            if (this.getEndDateType() != null) {
                data.set("endDateType", om.valueToTree(this.getEndDateType()));
            }
            if (this.getEphemeralStorage() != null) {
                data.set("ephemeralStorage", om.valueToTree(this.getEphemeralStorage()));
            }
            if (this.getInstanceMatchCriteria() != null) {
                data.set("instanceMatchCriteria", om.valueToTree(this.getInstanceMatchCriteria()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getTenancy() != null) {
                data.set("tenancy", om.valueToTree(this.getTenancy()));
            }
            if (this.getCount() != null) {
                data.set("count", om.valueToTree(this.getCount()));
            }
            if (this.getDependsOn() != null) {
                data.set("dependsOn", om.valueToTree(this.getDependsOn()));
            }
            if (this.getLifecycle() != null) {
                data.set("lifecycle", om.valueToTree(this.getLifecycle()));
            }
            if (this.getProvider() != null) {
                data.set("provider", om.valueToTree(this.getProvider()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.Ec2CapacityReservationConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Ec2CapacityReservationConfig.Jsii$Proxy that = (Ec2CapacityReservationConfig.Jsii$Proxy) o;

            if (!availabilityZone.equals(that.availabilityZone)) return false;
            if (!instanceCount.equals(that.instanceCount)) return false;
            if (!instancePlatform.equals(that.instancePlatform)) return false;
            if (!instanceType.equals(that.instanceType)) return false;
            if (this.ebsOptimized != null ? !this.ebsOptimized.equals(that.ebsOptimized) : that.ebsOptimized != null) return false;
            if (this.endDate != null ? !this.endDate.equals(that.endDate) : that.endDate != null) return false;
            if (this.endDateType != null ? !this.endDateType.equals(that.endDateType) : that.endDateType != null) return false;
            if (this.ephemeralStorage != null ? !this.ephemeralStorage.equals(that.ephemeralStorage) : that.ephemeralStorage != null) return false;
            if (this.instanceMatchCriteria != null ? !this.instanceMatchCriteria.equals(that.instanceMatchCriteria) : that.instanceMatchCriteria != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.tenancy != null ? !this.tenancy.equals(that.tenancy) : that.tenancy != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.availabilityZone.hashCode();
            result = 31 * result + (this.instanceCount.hashCode());
            result = 31 * result + (this.instancePlatform.hashCode());
            result = 31 * result + (this.instanceType.hashCode());
            result = 31 * result + (this.ebsOptimized != null ? this.ebsOptimized.hashCode() : 0);
            result = 31 * result + (this.endDate != null ? this.endDate.hashCode() : 0);
            result = 31 * result + (this.endDateType != null ? this.endDateType.hashCode() : 0);
            result = 31 * result + (this.ephemeralStorage != null ? this.ephemeralStorage.hashCode() : 0);
            result = 31 * result + (this.instanceMatchCriteria != null ? this.instanceMatchCriteria.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.tenancy != null ? this.tenancy.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
