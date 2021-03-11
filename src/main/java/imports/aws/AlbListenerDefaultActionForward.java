package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:01.940Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.AlbListenerDefaultActionForward")
@software.amazon.jsii.Jsii.Proxy(AlbListenerDefaultActionForward.Jsii$Proxy.class)
public interface AlbListenerDefaultActionForward extends software.amazon.jsii.JsiiSerializable {

    /**
     * target_group block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.AlbListenerDefaultActionForwardTargetGroup> getTargetGroup();

    /**
     * stickiness block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AlbListenerDefaultActionForwardStickiness> getStickiness() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AlbListenerDefaultActionForward}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AlbListenerDefaultActionForward}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AlbListenerDefaultActionForward> {
        private java.util.List<imports.aws.AlbListenerDefaultActionForwardTargetGroup> targetGroup;
        private java.util.List<imports.aws.AlbListenerDefaultActionForwardStickiness> stickiness;

        /**
         * Sets the value of {@link AlbListenerDefaultActionForward#getTargetGroup}
         * @param targetGroup target_group block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder targetGroup(java.util.List<? extends imports.aws.AlbListenerDefaultActionForwardTargetGroup> targetGroup) {
            this.targetGroup = (java.util.List<imports.aws.AlbListenerDefaultActionForwardTargetGroup>)targetGroup;
            return this;
        }

        /**
         * Sets the value of {@link AlbListenerDefaultActionForward#getStickiness}
         * @param stickiness stickiness block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder stickiness(java.util.List<? extends imports.aws.AlbListenerDefaultActionForwardStickiness> stickiness) {
            this.stickiness = (java.util.List<imports.aws.AlbListenerDefaultActionForwardStickiness>)stickiness;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AlbListenerDefaultActionForward}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AlbListenerDefaultActionForward build() {
            return new Jsii$Proxy(targetGroup, stickiness);
        }
    }

    /**
     * An implementation for {@link AlbListenerDefaultActionForward}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AlbListenerDefaultActionForward {
        private final java.util.List<imports.aws.AlbListenerDefaultActionForwardTargetGroup> targetGroup;
        private final java.util.List<imports.aws.AlbListenerDefaultActionForwardStickiness> stickiness;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.targetGroup = software.amazon.jsii.Kernel.get(this, "targetGroup", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AlbListenerDefaultActionForwardTargetGroup.class)));
            this.stickiness = software.amazon.jsii.Kernel.get(this, "stickiness", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.AlbListenerDefaultActionForwardStickiness.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.AlbListenerDefaultActionForwardTargetGroup> targetGroup, final java.util.List<? extends imports.aws.AlbListenerDefaultActionForwardStickiness> stickiness) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.targetGroup = (java.util.List<imports.aws.AlbListenerDefaultActionForwardTargetGroup>)java.util.Objects.requireNonNull(targetGroup, "targetGroup is required");
            this.stickiness = (java.util.List<imports.aws.AlbListenerDefaultActionForwardStickiness>)stickiness;
        }

        @Override
        public final java.util.List<imports.aws.AlbListenerDefaultActionForwardTargetGroup> getTargetGroup() {
            return this.targetGroup;
        }

        @Override
        public final java.util.List<imports.aws.AlbListenerDefaultActionForwardStickiness> getStickiness() {
            return this.stickiness;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("targetGroup", om.valueToTree(this.getTargetGroup()));
            if (this.getStickiness() != null) {
                data.set("stickiness", om.valueToTree(this.getStickiness()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.AlbListenerDefaultActionForward"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AlbListenerDefaultActionForward.Jsii$Proxy that = (AlbListenerDefaultActionForward.Jsii$Proxy) o;

            if (!targetGroup.equals(that.targetGroup)) return false;
            return this.stickiness != null ? this.stickiness.equals(that.stickiness) : that.stickiness == null;
        }

        @Override
        public final int hashCode() {
            int result = this.targetGroup.hashCode();
            result = 31 * result + (this.stickiness != null ? this.stickiness.hashCode() : 0);
            return result;
        }
    }
}
