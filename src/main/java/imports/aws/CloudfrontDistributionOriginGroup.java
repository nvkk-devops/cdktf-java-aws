package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.125Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CloudfrontDistributionOriginGroup")
@software.amazon.jsii.Jsii.Proxy(CloudfrontDistributionOriginGroup.Jsii$Proxy.class)
public interface CloudfrontDistributionOriginGroup extends software.amazon.jsii.JsiiSerializable {

    /**
     * failover_criteria block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CloudfrontDistributionOriginGroupFailoverCriteria> getFailoverCriteria();

    /**
     * member block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.CloudfrontDistributionOriginGroupMember> getMember();

    @org.jetbrains.annotations.NotNull java.lang.String getOriginId();

    /**
     * @return a {@link Builder} of {@link CloudfrontDistributionOriginGroup}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CloudfrontDistributionOriginGroup}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CloudfrontDistributionOriginGroup> {
        private java.util.List<imports.aws.CloudfrontDistributionOriginGroupFailoverCriteria> failoverCriteria;
        private java.util.List<imports.aws.CloudfrontDistributionOriginGroupMember> member;
        private java.lang.String originId;

        /**
         * Sets the value of {@link CloudfrontDistributionOriginGroup#getFailoverCriteria}
         * @param failoverCriteria failover_criteria block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder failoverCriteria(java.util.List<? extends imports.aws.CloudfrontDistributionOriginGroupFailoverCriteria> failoverCriteria) {
            this.failoverCriteria = (java.util.List<imports.aws.CloudfrontDistributionOriginGroupFailoverCriteria>)failoverCriteria;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionOriginGroup#getMember}
         * @param member member block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder member(java.util.List<? extends imports.aws.CloudfrontDistributionOriginGroupMember> member) {
            this.member = (java.util.List<imports.aws.CloudfrontDistributionOriginGroupMember>)member;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionOriginGroup#getOriginId}
         * @param originId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder originId(java.lang.String originId) {
            this.originId = originId;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CloudfrontDistributionOriginGroup}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CloudfrontDistributionOriginGroup build() {
            return new Jsii$Proxy(failoverCriteria, member, originId);
        }
    }

    /**
     * An implementation for {@link CloudfrontDistributionOriginGroup}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CloudfrontDistributionOriginGroup {
        private final java.util.List<imports.aws.CloudfrontDistributionOriginGroupFailoverCriteria> failoverCriteria;
        private final java.util.List<imports.aws.CloudfrontDistributionOriginGroupMember> member;
        private final java.lang.String originId;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.failoverCriteria = software.amazon.jsii.Kernel.get(this, "failoverCriteria", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CloudfrontDistributionOriginGroupFailoverCriteria.class)));
            this.member = software.amazon.jsii.Kernel.get(this, "member", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CloudfrontDistributionOriginGroupMember.class)));
            this.originId = software.amazon.jsii.Kernel.get(this, "originId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.CloudfrontDistributionOriginGroupFailoverCriteria> failoverCriteria, final java.util.List<? extends imports.aws.CloudfrontDistributionOriginGroupMember> member, final java.lang.String originId) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.failoverCriteria = (java.util.List<imports.aws.CloudfrontDistributionOriginGroupFailoverCriteria>)java.util.Objects.requireNonNull(failoverCriteria, "failoverCriteria is required");
            this.member = (java.util.List<imports.aws.CloudfrontDistributionOriginGroupMember>)java.util.Objects.requireNonNull(member, "member is required");
            this.originId = java.util.Objects.requireNonNull(originId, "originId is required");
        }

        @Override
        public final java.util.List<imports.aws.CloudfrontDistributionOriginGroupFailoverCriteria> getFailoverCriteria() {
            return this.failoverCriteria;
        }

        @Override
        public final java.util.List<imports.aws.CloudfrontDistributionOriginGroupMember> getMember() {
            return this.member;
        }

        @Override
        public final java.lang.String getOriginId() {
            return this.originId;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("failoverCriteria", om.valueToTree(this.getFailoverCriteria()));
            data.set("member", om.valueToTree(this.getMember()));
            data.set("originId", om.valueToTree(this.getOriginId()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.CloudfrontDistributionOriginGroup"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CloudfrontDistributionOriginGroup.Jsii$Proxy that = (CloudfrontDistributionOriginGroup.Jsii$Proxy) o;

            if (!failoverCriteria.equals(that.failoverCriteria)) return false;
            if (!member.equals(that.member)) return false;
            return this.originId.equals(that.originId);
        }

        @Override
        public final int hashCode() {
            int result = this.failoverCriteria.hashCode();
            result = 31 * result + (this.member.hashCode());
            result = 31 * result + (this.originId.hashCode());
            return result;
        }
    }
}
