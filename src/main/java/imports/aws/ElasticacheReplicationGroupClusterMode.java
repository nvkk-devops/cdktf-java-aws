package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.549Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.ElasticacheReplicationGroupClusterMode")
@software.amazon.jsii.Jsii.Proxy(ElasticacheReplicationGroupClusterMode.Jsii$Proxy.class)
public interface ElasticacheReplicationGroupClusterMode extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.Number getNumNodeGroups();

    @org.jetbrains.annotations.NotNull java.lang.Number getReplicasPerNodeGroup();

    /**
     * @return a {@link Builder} of {@link ElasticacheReplicationGroupClusterMode}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ElasticacheReplicationGroupClusterMode}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ElasticacheReplicationGroupClusterMode> {
        private java.lang.Number numNodeGroups;
        private java.lang.Number replicasPerNodeGroup;

        /**
         * Sets the value of {@link ElasticacheReplicationGroupClusterMode#getNumNodeGroups}
         * @param numNodeGroups the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder numNodeGroups(java.lang.Number numNodeGroups) {
            this.numNodeGroups = numNodeGroups;
            return this;
        }

        /**
         * Sets the value of {@link ElasticacheReplicationGroupClusterMode#getReplicasPerNodeGroup}
         * @param replicasPerNodeGroup the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder replicasPerNodeGroup(java.lang.Number replicasPerNodeGroup) {
            this.replicasPerNodeGroup = replicasPerNodeGroup;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ElasticacheReplicationGroupClusterMode}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ElasticacheReplicationGroupClusterMode build() {
            return new Jsii$Proxy(numNodeGroups, replicasPerNodeGroup);
        }
    }

    /**
     * An implementation for {@link ElasticacheReplicationGroupClusterMode}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ElasticacheReplicationGroupClusterMode {
        private final java.lang.Number numNodeGroups;
        private final java.lang.Number replicasPerNodeGroup;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.numNodeGroups = software.amazon.jsii.Kernel.get(this, "numNodeGroups", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.replicasPerNodeGroup = software.amazon.jsii.Kernel.get(this, "replicasPerNodeGroup", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.Number numNodeGroups, final java.lang.Number replicasPerNodeGroup) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.numNodeGroups = java.util.Objects.requireNonNull(numNodeGroups, "numNodeGroups is required");
            this.replicasPerNodeGroup = java.util.Objects.requireNonNull(replicasPerNodeGroup, "replicasPerNodeGroup is required");
        }

        @Override
        public final java.lang.Number getNumNodeGroups() {
            return this.numNodeGroups;
        }

        @Override
        public final java.lang.Number getReplicasPerNodeGroup() {
            return this.replicasPerNodeGroup;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("numNodeGroups", om.valueToTree(this.getNumNodeGroups()));
            data.set("replicasPerNodeGroup", om.valueToTree(this.getReplicasPerNodeGroup()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.ElasticacheReplicationGroupClusterMode"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ElasticacheReplicationGroupClusterMode.Jsii$Proxy that = (ElasticacheReplicationGroupClusterMode.Jsii$Proxy) o;

            if (!numNodeGroups.equals(that.numNodeGroups)) return false;
            return this.replicasPerNodeGroup.equals(that.replicasPerNodeGroup);
        }

        @Override
        public final int hashCode() {
            int result = this.numNodeGroups.hashCode();
            result = 31 * result + (this.replicasPerNodeGroup.hashCode());
            return result;
        }
    }
}
