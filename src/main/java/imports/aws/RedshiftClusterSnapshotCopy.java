package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.807Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.RedshiftClusterSnapshotCopy")
@software.amazon.jsii.Jsii.Proxy(RedshiftClusterSnapshotCopy.Jsii$Proxy.class)
public interface RedshiftClusterSnapshotCopy extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getDestinationRegion();

    default @org.jetbrains.annotations.Nullable java.lang.String getGrantName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getRetentionPeriod() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link RedshiftClusterSnapshotCopy}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link RedshiftClusterSnapshotCopy}
     */
    public static final class Builder implements software.amazon.jsii.Builder<RedshiftClusterSnapshotCopy> {
        private java.lang.String destinationRegion;
        private java.lang.String grantName;
        private java.lang.Number retentionPeriod;

        /**
         * Sets the value of {@link RedshiftClusterSnapshotCopy#getDestinationRegion}
         * @param destinationRegion the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder destinationRegion(java.lang.String destinationRegion) {
            this.destinationRegion = destinationRegion;
            return this;
        }

        /**
         * Sets the value of {@link RedshiftClusterSnapshotCopy#getGrantName}
         * @param grantName the value to be set.
         * @return {@code this}
         */
        public Builder grantName(java.lang.String grantName) {
            this.grantName = grantName;
            return this;
        }

        /**
         * Sets the value of {@link RedshiftClusterSnapshotCopy#getRetentionPeriod}
         * @param retentionPeriod the value to be set.
         * @return {@code this}
         */
        public Builder retentionPeriod(java.lang.Number retentionPeriod) {
            this.retentionPeriod = retentionPeriod;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link RedshiftClusterSnapshotCopy}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public RedshiftClusterSnapshotCopy build() {
            return new Jsii$Proxy(destinationRegion, grantName, retentionPeriod);
        }
    }

    /**
     * An implementation for {@link RedshiftClusterSnapshotCopy}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements RedshiftClusterSnapshotCopy {
        private final java.lang.String destinationRegion;
        private final java.lang.String grantName;
        private final java.lang.Number retentionPeriod;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.destinationRegion = software.amazon.jsii.Kernel.get(this, "destinationRegion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.grantName = software.amazon.jsii.Kernel.get(this, "grantName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.retentionPeriod = software.amazon.jsii.Kernel.get(this, "retentionPeriod", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String destinationRegion, final java.lang.String grantName, final java.lang.Number retentionPeriod) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.destinationRegion = java.util.Objects.requireNonNull(destinationRegion, "destinationRegion is required");
            this.grantName = grantName;
            this.retentionPeriod = retentionPeriod;
        }

        @Override
        public final java.lang.String getDestinationRegion() {
            return this.destinationRegion;
        }

        @Override
        public final java.lang.String getGrantName() {
            return this.grantName;
        }

        @Override
        public final java.lang.Number getRetentionPeriod() {
            return this.retentionPeriod;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("destinationRegion", om.valueToTree(this.getDestinationRegion()));
            if (this.getGrantName() != null) {
                data.set("grantName", om.valueToTree(this.getGrantName()));
            }
            if (this.getRetentionPeriod() != null) {
                data.set("retentionPeriod", om.valueToTree(this.getRetentionPeriod()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.RedshiftClusterSnapshotCopy"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            RedshiftClusterSnapshotCopy.Jsii$Proxy that = (RedshiftClusterSnapshotCopy.Jsii$Proxy) o;

            if (!destinationRegion.equals(that.destinationRegion)) return false;
            if (this.grantName != null ? !this.grantName.equals(that.grantName) : that.grantName != null) return false;
            return this.retentionPeriod != null ? this.retentionPeriod.equals(that.retentionPeriod) : that.retentionPeriod == null;
        }

        @Override
        public final int hashCode() {
            int result = this.destinationRegion.hashCode();
            result = 31 * result + (this.grantName != null ? this.grantName.hashCode() : 0);
            result = 31 * result + (this.retentionPeriod != null ? this.retentionPeriod.hashCode() : 0);
            return result;
        }
    }
}
