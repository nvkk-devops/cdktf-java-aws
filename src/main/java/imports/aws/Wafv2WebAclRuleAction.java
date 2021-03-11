package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:03.023Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Wafv2WebAclRuleAction")
@software.amazon.jsii.Jsii.Proxy(Wafv2WebAclRuleAction.Jsii$Proxy.class)
public interface Wafv2WebAclRuleAction extends software.amazon.jsii.JsiiSerializable {

    /**
     * allow block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Wafv2WebAclRuleActionAllow> getAllow() {
        return null;
    }

    /**
     * block block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Wafv2WebAclRuleActionBlock> getBlock() {
        return null;
    }

    /**
     * count block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Wafv2WebAclRuleActionCount> getCount() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Wafv2WebAclRuleAction}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Wafv2WebAclRuleAction}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Wafv2WebAclRuleAction> {
        private java.util.List<imports.aws.Wafv2WebAclRuleActionAllow> allow;
        private java.util.List<imports.aws.Wafv2WebAclRuleActionBlock> block;
        private java.util.List<imports.aws.Wafv2WebAclRuleActionCount> count;

        /**
         * Sets the value of {@link Wafv2WebAclRuleAction#getAllow}
         * @param allow allow block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder allow(java.util.List<? extends imports.aws.Wafv2WebAclRuleActionAllow> allow) {
            this.allow = (java.util.List<imports.aws.Wafv2WebAclRuleActionAllow>)allow;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclRuleAction#getBlock}
         * @param block block block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder block(java.util.List<? extends imports.aws.Wafv2WebAclRuleActionBlock> block) {
            this.block = (java.util.List<imports.aws.Wafv2WebAclRuleActionBlock>)block;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclRuleAction#getCount}
         * @param count count block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder count(java.util.List<? extends imports.aws.Wafv2WebAclRuleActionCount> count) {
            this.count = (java.util.List<imports.aws.Wafv2WebAclRuleActionCount>)count;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Wafv2WebAclRuleAction}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Wafv2WebAclRuleAction build() {
            return new Jsii$Proxy(allow, block, count);
        }
    }

    /**
     * An implementation for {@link Wafv2WebAclRuleAction}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Wafv2WebAclRuleAction {
        private final java.util.List<imports.aws.Wafv2WebAclRuleActionAllow> allow;
        private final java.util.List<imports.aws.Wafv2WebAclRuleActionBlock> block;
        private final java.util.List<imports.aws.Wafv2WebAclRuleActionCount> count;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.allow = software.amazon.jsii.Kernel.get(this, "allow", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Wafv2WebAclRuleActionAllow.class)));
            this.block = software.amazon.jsii.Kernel.get(this, "block", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Wafv2WebAclRuleActionBlock.class)));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Wafv2WebAclRuleActionCount.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.Wafv2WebAclRuleActionAllow> allow, final java.util.List<? extends imports.aws.Wafv2WebAclRuleActionBlock> block, final java.util.List<? extends imports.aws.Wafv2WebAclRuleActionCount> count) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.allow = (java.util.List<imports.aws.Wafv2WebAclRuleActionAllow>)allow;
            this.block = (java.util.List<imports.aws.Wafv2WebAclRuleActionBlock>)block;
            this.count = (java.util.List<imports.aws.Wafv2WebAclRuleActionCount>)count;
        }

        @Override
        public final java.util.List<imports.aws.Wafv2WebAclRuleActionAllow> getAllow() {
            return this.allow;
        }

        @Override
        public final java.util.List<imports.aws.Wafv2WebAclRuleActionBlock> getBlock() {
            return this.block;
        }

        @Override
        public final java.util.List<imports.aws.Wafv2WebAclRuleActionCount> getCount() {
            return this.count;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAllow() != null) {
                data.set("allow", om.valueToTree(this.getAllow()));
            }
            if (this.getBlock() != null) {
                data.set("block", om.valueToTree(this.getBlock()));
            }
            if (this.getCount() != null) {
                data.set("count", om.valueToTree(this.getCount()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.Wafv2WebAclRuleAction"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Wafv2WebAclRuleAction.Jsii$Proxy that = (Wafv2WebAclRuleAction.Jsii$Proxy) o;

            if (this.allow != null ? !this.allow.equals(that.allow) : that.allow != null) return false;
            if (this.block != null ? !this.block.equals(that.block) : that.block != null) return false;
            return this.count != null ? this.count.equals(that.count) : that.count == null;
        }

        @Override
        public final int hashCode() {
            int result = this.allow != null ? this.allow.hashCode() : 0;
            result = 31 * result + (this.block != null ? this.block.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            return result;
        }
    }
}
