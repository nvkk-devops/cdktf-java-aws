package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.102Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.BackupPlanRuleLifecycle")
@software.amazon.jsii.Jsii.Proxy(BackupPlanRuleLifecycle.Jsii$Proxy.class)
public interface BackupPlanRuleLifecycle extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.Number getColdStorageAfter() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getDeleteAfter() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BackupPlanRuleLifecycle}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BackupPlanRuleLifecycle}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BackupPlanRuleLifecycle> {
        private java.lang.Number coldStorageAfter;
        private java.lang.Number deleteAfter;

        /**
         * Sets the value of {@link BackupPlanRuleLifecycle#getColdStorageAfter}
         * @param coldStorageAfter the value to be set.
         * @return {@code this}
         */
        public Builder coldStorageAfter(java.lang.Number coldStorageAfter) {
            this.coldStorageAfter = coldStorageAfter;
            return this;
        }

        /**
         * Sets the value of {@link BackupPlanRuleLifecycle#getDeleteAfter}
         * @param deleteAfter the value to be set.
         * @return {@code this}
         */
        public Builder deleteAfter(java.lang.Number deleteAfter) {
            this.deleteAfter = deleteAfter;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BackupPlanRuleLifecycle}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BackupPlanRuleLifecycle build() {
            return new Jsii$Proxy(coldStorageAfter, deleteAfter);
        }
    }

    /**
     * An implementation for {@link BackupPlanRuleLifecycle}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BackupPlanRuleLifecycle {
        private final java.lang.Number coldStorageAfter;
        private final java.lang.Number deleteAfter;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.coldStorageAfter = software.amazon.jsii.Kernel.get(this, "coldStorageAfter", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.deleteAfter = software.amazon.jsii.Kernel.get(this, "deleteAfter", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.Number coldStorageAfter, final java.lang.Number deleteAfter) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.coldStorageAfter = coldStorageAfter;
            this.deleteAfter = deleteAfter;
        }

        @Override
        public final java.lang.Number getColdStorageAfter() {
            return this.coldStorageAfter;
        }

        @Override
        public final java.lang.Number getDeleteAfter() {
            return this.deleteAfter;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getColdStorageAfter() != null) {
                data.set("coldStorageAfter", om.valueToTree(this.getColdStorageAfter()));
            }
            if (this.getDeleteAfter() != null) {
                data.set("deleteAfter", om.valueToTree(this.getDeleteAfter()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.BackupPlanRuleLifecycle"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BackupPlanRuleLifecycle.Jsii$Proxy that = (BackupPlanRuleLifecycle.Jsii$Proxy) o;

            if (this.coldStorageAfter != null ? !this.coldStorageAfter.equals(that.coldStorageAfter) : that.coldStorageAfter != null) return false;
            return this.deleteAfter != null ? this.deleteAfter.equals(that.deleteAfter) : that.deleteAfter == null;
        }

        @Override
        public final int hashCode() {
            int result = this.coldStorageAfter != null ? this.coldStorageAfter.hashCode() : 0;
            result = 31 * result + (this.deleteAfter != null ? this.deleteAfter.hashCode() : 0);
            return result;
        }
    }
}
