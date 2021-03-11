package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.694Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.LaunchTemplatePlacement")
@software.amazon.jsii.Jsii.Proxy(LaunchTemplatePlacement.Jsii$Proxy.class)
public interface LaunchTemplatePlacement extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.String getAffinity() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getAvailabilityZone() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getGroupName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getHostId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getPartitionNumber() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSpreadDomain() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getTenancy() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link LaunchTemplatePlacement}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LaunchTemplatePlacement}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LaunchTemplatePlacement> {
        private java.lang.String affinity;
        private java.lang.String availabilityZone;
        private java.lang.String groupName;
        private java.lang.String hostId;
        private java.lang.Number partitionNumber;
        private java.lang.String spreadDomain;
        private java.lang.String tenancy;

        /**
         * Sets the value of {@link LaunchTemplatePlacement#getAffinity}
         * @param affinity the value to be set.
         * @return {@code this}
         */
        public Builder affinity(java.lang.String affinity) {
            this.affinity = affinity;
            return this;
        }

        /**
         * Sets the value of {@link LaunchTemplatePlacement#getAvailabilityZone}
         * @param availabilityZone the value to be set.
         * @return {@code this}
         */
        public Builder availabilityZone(java.lang.String availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }

        /**
         * Sets the value of {@link LaunchTemplatePlacement#getGroupName}
         * @param groupName the value to be set.
         * @return {@code this}
         */
        public Builder groupName(java.lang.String groupName) {
            this.groupName = groupName;
            return this;
        }

        /**
         * Sets the value of {@link LaunchTemplatePlacement#getHostId}
         * @param hostId the value to be set.
         * @return {@code this}
         */
        public Builder hostId(java.lang.String hostId) {
            this.hostId = hostId;
            return this;
        }

        /**
         * Sets the value of {@link LaunchTemplatePlacement#getPartitionNumber}
         * @param partitionNumber the value to be set.
         * @return {@code this}
         */
        public Builder partitionNumber(java.lang.Number partitionNumber) {
            this.partitionNumber = partitionNumber;
            return this;
        }

        /**
         * Sets the value of {@link LaunchTemplatePlacement#getSpreadDomain}
         * @param spreadDomain the value to be set.
         * @return {@code this}
         */
        public Builder spreadDomain(java.lang.String spreadDomain) {
            this.spreadDomain = spreadDomain;
            return this;
        }

        /**
         * Sets the value of {@link LaunchTemplatePlacement#getTenancy}
         * @param tenancy the value to be set.
         * @return {@code this}
         */
        public Builder tenancy(java.lang.String tenancy) {
            this.tenancy = tenancy;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link LaunchTemplatePlacement}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LaunchTemplatePlacement build() {
            return new Jsii$Proxy(affinity, availabilityZone, groupName, hostId, partitionNumber, spreadDomain, tenancy);
        }
    }

    /**
     * An implementation for {@link LaunchTemplatePlacement}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LaunchTemplatePlacement {
        private final java.lang.String affinity;
        private final java.lang.String availabilityZone;
        private final java.lang.String groupName;
        private final java.lang.String hostId;
        private final java.lang.Number partitionNumber;
        private final java.lang.String spreadDomain;
        private final java.lang.String tenancy;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.affinity = software.amazon.jsii.Kernel.get(this, "affinity", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.availabilityZone = software.amazon.jsii.Kernel.get(this, "availabilityZone", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.groupName = software.amazon.jsii.Kernel.get(this, "groupName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.hostId = software.amazon.jsii.Kernel.get(this, "hostId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.partitionNumber = software.amazon.jsii.Kernel.get(this, "partitionNumber", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.spreadDomain = software.amazon.jsii.Kernel.get(this, "spreadDomain", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tenancy = software.amazon.jsii.Kernel.get(this, "tenancy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String affinity, final java.lang.String availabilityZone, final java.lang.String groupName, final java.lang.String hostId, final java.lang.Number partitionNumber, final java.lang.String spreadDomain, final java.lang.String tenancy) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.affinity = affinity;
            this.availabilityZone = availabilityZone;
            this.groupName = groupName;
            this.hostId = hostId;
            this.partitionNumber = partitionNumber;
            this.spreadDomain = spreadDomain;
            this.tenancy = tenancy;
        }

        @Override
        public final java.lang.String getAffinity() {
            return this.affinity;
        }

        @Override
        public final java.lang.String getAvailabilityZone() {
            return this.availabilityZone;
        }

        @Override
        public final java.lang.String getGroupName() {
            return this.groupName;
        }

        @Override
        public final java.lang.String getHostId() {
            return this.hostId;
        }

        @Override
        public final java.lang.Number getPartitionNumber() {
            return this.partitionNumber;
        }

        @Override
        public final java.lang.String getSpreadDomain() {
            return this.spreadDomain;
        }

        @Override
        public final java.lang.String getTenancy() {
            return this.tenancy;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAffinity() != null) {
                data.set("affinity", om.valueToTree(this.getAffinity()));
            }
            if (this.getAvailabilityZone() != null) {
                data.set("availabilityZone", om.valueToTree(this.getAvailabilityZone()));
            }
            if (this.getGroupName() != null) {
                data.set("groupName", om.valueToTree(this.getGroupName()));
            }
            if (this.getHostId() != null) {
                data.set("hostId", om.valueToTree(this.getHostId()));
            }
            if (this.getPartitionNumber() != null) {
                data.set("partitionNumber", om.valueToTree(this.getPartitionNumber()));
            }
            if (this.getSpreadDomain() != null) {
                data.set("spreadDomain", om.valueToTree(this.getSpreadDomain()));
            }
            if (this.getTenancy() != null) {
                data.set("tenancy", om.valueToTree(this.getTenancy()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.LaunchTemplatePlacement"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LaunchTemplatePlacement.Jsii$Proxy that = (LaunchTemplatePlacement.Jsii$Proxy) o;

            if (this.affinity != null ? !this.affinity.equals(that.affinity) : that.affinity != null) return false;
            if (this.availabilityZone != null ? !this.availabilityZone.equals(that.availabilityZone) : that.availabilityZone != null) return false;
            if (this.groupName != null ? !this.groupName.equals(that.groupName) : that.groupName != null) return false;
            if (this.hostId != null ? !this.hostId.equals(that.hostId) : that.hostId != null) return false;
            if (this.partitionNumber != null ? !this.partitionNumber.equals(that.partitionNumber) : that.partitionNumber != null) return false;
            if (this.spreadDomain != null ? !this.spreadDomain.equals(that.spreadDomain) : that.spreadDomain != null) return false;
            return this.tenancy != null ? this.tenancy.equals(that.tenancy) : that.tenancy == null;
        }

        @Override
        public final int hashCode() {
            int result = this.affinity != null ? this.affinity.hashCode() : 0;
            result = 31 * result + (this.availabilityZone != null ? this.availabilityZone.hashCode() : 0);
            result = 31 * result + (this.groupName != null ? this.groupName.hashCode() : 0);
            result = 31 * result + (this.hostId != null ? this.hostId.hashCode() : 0);
            result = 31 * result + (this.partitionNumber != null ? this.partitionNumber.hashCode() : 0);
            result = 31 * result + (this.spreadDomain != null ? this.spreadDomain.hashCode() : 0);
            result = 31 * result + (this.tenancy != null ? this.tenancy.hashCode() : 0);
            return result;
        }
    }
}
