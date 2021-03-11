package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.572Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.EmrClusterEc2Attributes")
@software.amazon.jsii.Jsii.Proxy(EmrClusterEc2Attributes.Jsii$Proxy.class)
public interface EmrClusterEc2Attributes extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getInstanceProfile();

    default @org.jetbrains.annotations.Nullable java.lang.String getAdditionalMasterSecurityGroups() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getAdditionalSlaveSecurityGroups() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getEmrManagedMasterSecurityGroup() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getEmrManagedSlaveSecurityGroup() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getKeyName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getServiceAccessSecurityGroup() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSubnetId() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link EmrClusterEc2Attributes}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link EmrClusterEc2Attributes}
     */
    public static final class Builder implements software.amazon.jsii.Builder<EmrClusterEc2Attributes> {
        private java.lang.String instanceProfile;
        private java.lang.String additionalMasterSecurityGroups;
        private java.lang.String additionalSlaveSecurityGroups;
        private java.lang.String emrManagedMasterSecurityGroup;
        private java.lang.String emrManagedSlaveSecurityGroup;
        private java.lang.String keyName;
        private java.lang.String serviceAccessSecurityGroup;
        private java.lang.String subnetId;

        /**
         * Sets the value of {@link EmrClusterEc2Attributes#getInstanceProfile}
         * @param instanceProfile the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder instanceProfile(java.lang.String instanceProfile) {
            this.instanceProfile = instanceProfile;
            return this;
        }

        /**
         * Sets the value of {@link EmrClusterEc2Attributes#getAdditionalMasterSecurityGroups}
         * @param additionalMasterSecurityGroups the value to be set.
         * @return {@code this}
         */
        public Builder additionalMasterSecurityGroups(java.lang.String additionalMasterSecurityGroups) {
            this.additionalMasterSecurityGroups = additionalMasterSecurityGroups;
            return this;
        }

        /**
         * Sets the value of {@link EmrClusterEc2Attributes#getAdditionalSlaveSecurityGroups}
         * @param additionalSlaveSecurityGroups the value to be set.
         * @return {@code this}
         */
        public Builder additionalSlaveSecurityGroups(java.lang.String additionalSlaveSecurityGroups) {
            this.additionalSlaveSecurityGroups = additionalSlaveSecurityGroups;
            return this;
        }

        /**
         * Sets the value of {@link EmrClusterEc2Attributes#getEmrManagedMasterSecurityGroup}
         * @param emrManagedMasterSecurityGroup the value to be set.
         * @return {@code this}
         */
        public Builder emrManagedMasterSecurityGroup(java.lang.String emrManagedMasterSecurityGroup) {
            this.emrManagedMasterSecurityGroup = emrManagedMasterSecurityGroup;
            return this;
        }

        /**
         * Sets the value of {@link EmrClusterEc2Attributes#getEmrManagedSlaveSecurityGroup}
         * @param emrManagedSlaveSecurityGroup the value to be set.
         * @return {@code this}
         */
        public Builder emrManagedSlaveSecurityGroup(java.lang.String emrManagedSlaveSecurityGroup) {
            this.emrManagedSlaveSecurityGroup = emrManagedSlaveSecurityGroup;
            return this;
        }

        /**
         * Sets the value of {@link EmrClusterEc2Attributes#getKeyName}
         * @param keyName the value to be set.
         * @return {@code this}
         */
        public Builder keyName(java.lang.String keyName) {
            this.keyName = keyName;
            return this;
        }

        /**
         * Sets the value of {@link EmrClusterEc2Attributes#getServiceAccessSecurityGroup}
         * @param serviceAccessSecurityGroup the value to be set.
         * @return {@code this}
         */
        public Builder serviceAccessSecurityGroup(java.lang.String serviceAccessSecurityGroup) {
            this.serviceAccessSecurityGroup = serviceAccessSecurityGroup;
            return this;
        }

        /**
         * Sets the value of {@link EmrClusterEc2Attributes#getSubnetId}
         * @param subnetId the value to be set.
         * @return {@code this}
         */
        public Builder subnetId(java.lang.String subnetId) {
            this.subnetId = subnetId;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link EmrClusterEc2Attributes}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public EmrClusterEc2Attributes build() {
            return new Jsii$Proxy(instanceProfile, additionalMasterSecurityGroups, additionalSlaveSecurityGroups, emrManagedMasterSecurityGroup, emrManagedSlaveSecurityGroup, keyName, serviceAccessSecurityGroup, subnetId);
        }
    }

    /**
     * An implementation for {@link EmrClusterEc2Attributes}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements EmrClusterEc2Attributes {
        private final java.lang.String instanceProfile;
        private final java.lang.String additionalMasterSecurityGroups;
        private final java.lang.String additionalSlaveSecurityGroups;
        private final java.lang.String emrManagedMasterSecurityGroup;
        private final java.lang.String emrManagedSlaveSecurityGroup;
        private final java.lang.String keyName;
        private final java.lang.String serviceAccessSecurityGroup;
        private final java.lang.String subnetId;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.instanceProfile = software.amazon.jsii.Kernel.get(this, "instanceProfile", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.additionalMasterSecurityGroups = software.amazon.jsii.Kernel.get(this, "additionalMasterSecurityGroups", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.additionalSlaveSecurityGroups = software.amazon.jsii.Kernel.get(this, "additionalSlaveSecurityGroups", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.emrManagedMasterSecurityGroup = software.amazon.jsii.Kernel.get(this, "emrManagedMasterSecurityGroup", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.emrManagedSlaveSecurityGroup = software.amazon.jsii.Kernel.get(this, "emrManagedSlaveSecurityGroup", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.keyName = software.amazon.jsii.Kernel.get(this, "keyName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.serviceAccessSecurityGroup = software.amazon.jsii.Kernel.get(this, "serviceAccessSecurityGroup", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.subnetId = software.amazon.jsii.Kernel.get(this, "subnetId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String instanceProfile, final java.lang.String additionalMasterSecurityGroups, final java.lang.String additionalSlaveSecurityGroups, final java.lang.String emrManagedMasterSecurityGroup, final java.lang.String emrManagedSlaveSecurityGroup, final java.lang.String keyName, final java.lang.String serviceAccessSecurityGroup, final java.lang.String subnetId) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.instanceProfile = java.util.Objects.requireNonNull(instanceProfile, "instanceProfile is required");
            this.additionalMasterSecurityGroups = additionalMasterSecurityGroups;
            this.additionalSlaveSecurityGroups = additionalSlaveSecurityGroups;
            this.emrManagedMasterSecurityGroup = emrManagedMasterSecurityGroup;
            this.emrManagedSlaveSecurityGroup = emrManagedSlaveSecurityGroup;
            this.keyName = keyName;
            this.serviceAccessSecurityGroup = serviceAccessSecurityGroup;
            this.subnetId = subnetId;
        }

        @Override
        public final java.lang.String getInstanceProfile() {
            return this.instanceProfile;
        }

        @Override
        public final java.lang.String getAdditionalMasterSecurityGroups() {
            return this.additionalMasterSecurityGroups;
        }

        @Override
        public final java.lang.String getAdditionalSlaveSecurityGroups() {
            return this.additionalSlaveSecurityGroups;
        }

        @Override
        public final java.lang.String getEmrManagedMasterSecurityGroup() {
            return this.emrManagedMasterSecurityGroup;
        }

        @Override
        public final java.lang.String getEmrManagedSlaveSecurityGroup() {
            return this.emrManagedSlaveSecurityGroup;
        }

        @Override
        public final java.lang.String getKeyName() {
            return this.keyName;
        }

        @Override
        public final java.lang.String getServiceAccessSecurityGroup() {
            return this.serviceAccessSecurityGroup;
        }

        @Override
        public final java.lang.String getSubnetId() {
            return this.subnetId;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("instanceProfile", om.valueToTree(this.getInstanceProfile()));
            if (this.getAdditionalMasterSecurityGroups() != null) {
                data.set("additionalMasterSecurityGroups", om.valueToTree(this.getAdditionalMasterSecurityGroups()));
            }
            if (this.getAdditionalSlaveSecurityGroups() != null) {
                data.set("additionalSlaveSecurityGroups", om.valueToTree(this.getAdditionalSlaveSecurityGroups()));
            }
            if (this.getEmrManagedMasterSecurityGroup() != null) {
                data.set("emrManagedMasterSecurityGroup", om.valueToTree(this.getEmrManagedMasterSecurityGroup()));
            }
            if (this.getEmrManagedSlaveSecurityGroup() != null) {
                data.set("emrManagedSlaveSecurityGroup", om.valueToTree(this.getEmrManagedSlaveSecurityGroup()));
            }
            if (this.getKeyName() != null) {
                data.set("keyName", om.valueToTree(this.getKeyName()));
            }
            if (this.getServiceAccessSecurityGroup() != null) {
                data.set("serviceAccessSecurityGroup", om.valueToTree(this.getServiceAccessSecurityGroup()));
            }
            if (this.getSubnetId() != null) {
                data.set("subnetId", om.valueToTree(this.getSubnetId()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.EmrClusterEc2Attributes"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EmrClusterEc2Attributes.Jsii$Proxy that = (EmrClusterEc2Attributes.Jsii$Proxy) o;

            if (!instanceProfile.equals(that.instanceProfile)) return false;
            if (this.additionalMasterSecurityGroups != null ? !this.additionalMasterSecurityGroups.equals(that.additionalMasterSecurityGroups) : that.additionalMasterSecurityGroups != null) return false;
            if (this.additionalSlaveSecurityGroups != null ? !this.additionalSlaveSecurityGroups.equals(that.additionalSlaveSecurityGroups) : that.additionalSlaveSecurityGroups != null) return false;
            if (this.emrManagedMasterSecurityGroup != null ? !this.emrManagedMasterSecurityGroup.equals(that.emrManagedMasterSecurityGroup) : that.emrManagedMasterSecurityGroup != null) return false;
            if (this.emrManagedSlaveSecurityGroup != null ? !this.emrManagedSlaveSecurityGroup.equals(that.emrManagedSlaveSecurityGroup) : that.emrManagedSlaveSecurityGroup != null) return false;
            if (this.keyName != null ? !this.keyName.equals(that.keyName) : that.keyName != null) return false;
            if (this.serviceAccessSecurityGroup != null ? !this.serviceAccessSecurityGroup.equals(that.serviceAccessSecurityGroup) : that.serviceAccessSecurityGroup != null) return false;
            return this.subnetId != null ? this.subnetId.equals(that.subnetId) : that.subnetId == null;
        }

        @Override
        public final int hashCode() {
            int result = this.instanceProfile.hashCode();
            result = 31 * result + (this.additionalMasterSecurityGroups != null ? this.additionalMasterSecurityGroups.hashCode() : 0);
            result = 31 * result + (this.additionalSlaveSecurityGroups != null ? this.additionalSlaveSecurityGroups.hashCode() : 0);
            result = 31 * result + (this.emrManagedMasterSecurityGroup != null ? this.emrManagedMasterSecurityGroup.hashCode() : 0);
            result = 31 * result + (this.emrManagedSlaveSecurityGroup != null ? this.emrManagedSlaveSecurityGroup.hashCode() : 0);
            result = 31 * result + (this.keyName != null ? this.keyName.hashCode() : 0);
            result = 31 * result + (this.serviceAccessSecurityGroup != null ? this.serviceAccessSecurityGroup.hashCode() : 0);
            result = 31 * result + (this.subnetId != null ? this.subnetId.hashCode() : 0);
            return result;
        }
    }
}
