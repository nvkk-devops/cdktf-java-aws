package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.642Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.IotTopicRuleErrorActionDynamodb")
@software.amazon.jsii.Jsii.Proxy(IotTopicRuleErrorActionDynamodb.Jsii$Proxy.class)
public interface IotTopicRuleErrorActionDynamodb extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getHashKeyField();

    @org.jetbrains.annotations.NotNull java.lang.String getHashKeyValue();

    @org.jetbrains.annotations.NotNull java.lang.String getRoleArn();

    @org.jetbrains.annotations.NotNull java.lang.String getTableName();

    default @org.jetbrains.annotations.Nullable java.lang.String getHashKeyType() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getOperation() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPayloadField() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getRangeKeyField() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getRangeKeyType() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getRangeKeyValue() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link IotTopicRuleErrorActionDynamodb}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link IotTopicRuleErrorActionDynamodb}
     */
    public static final class Builder implements software.amazon.jsii.Builder<IotTopicRuleErrorActionDynamodb> {
        private java.lang.String hashKeyField;
        private java.lang.String hashKeyValue;
        private java.lang.String roleArn;
        private java.lang.String tableName;
        private java.lang.String hashKeyType;
        private java.lang.String operation;
        private java.lang.String payloadField;
        private java.lang.String rangeKeyField;
        private java.lang.String rangeKeyType;
        private java.lang.String rangeKeyValue;

        /**
         * Sets the value of {@link IotTopicRuleErrorActionDynamodb#getHashKeyField}
         * @param hashKeyField the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder hashKeyField(java.lang.String hashKeyField) {
            this.hashKeyField = hashKeyField;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleErrorActionDynamodb#getHashKeyValue}
         * @param hashKeyValue the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder hashKeyValue(java.lang.String hashKeyValue) {
            this.hashKeyValue = hashKeyValue;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleErrorActionDynamodb#getRoleArn}
         * @param roleArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder roleArn(java.lang.String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleErrorActionDynamodb#getTableName}
         * @param tableName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder tableName(java.lang.String tableName) {
            this.tableName = tableName;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleErrorActionDynamodb#getHashKeyType}
         * @param hashKeyType the value to be set.
         * @return {@code this}
         */
        public Builder hashKeyType(java.lang.String hashKeyType) {
            this.hashKeyType = hashKeyType;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleErrorActionDynamodb#getOperation}
         * @param operation the value to be set.
         * @return {@code this}
         */
        public Builder operation(java.lang.String operation) {
            this.operation = operation;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleErrorActionDynamodb#getPayloadField}
         * @param payloadField the value to be set.
         * @return {@code this}
         */
        public Builder payloadField(java.lang.String payloadField) {
            this.payloadField = payloadField;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleErrorActionDynamodb#getRangeKeyField}
         * @param rangeKeyField the value to be set.
         * @return {@code this}
         */
        public Builder rangeKeyField(java.lang.String rangeKeyField) {
            this.rangeKeyField = rangeKeyField;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleErrorActionDynamodb#getRangeKeyType}
         * @param rangeKeyType the value to be set.
         * @return {@code this}
         */
        public Builder rangeKeyType(java.lang.String rangeKeyType) {
            this.rangeKeyType = rangeKeyType;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleErrorActionDynamodb#getRangeKeyValue}
         * @param rangeKeyValue the value to be set.
         * @return {@code this}
         */
        public Builder rangeKeyValue(java.lang.String rangeKeyValue) {
            this.rangeKeyValue = rangeKeyValue;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link IotTopicRuleErrorActionDynamodb}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public IotTopicRuleErrorActionDynamodb build() {
            return new Jsii$Proxy(hashKeyField, hashKeyValue, roleArn, tableName, hashKeyType, operation, payloadField, rangeKeyField, rangeKeyType, rangeKeyValue);
        }
    }

    /**
     * An implementation for {@link IotTopicRuleErrorActionDynamodb}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements IotTopicRuleErrorActionDynamodb {
        private final java.lang.String hashKeyField;
        private final java.lang.String hashKeyValue;
        private final java.lang.String roleArn;
        private final java.lang.String tableName;
        private final java.lang.String hashKeyType;
        private final java.lang.String operation;
        private final java.lang.String payloadField;
        private final java.lang.String rangeKeyField;
        private final java.lang.String rangeKeyType;
        private final java.lang.String rangeKeyValue;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.hashKeyField = software.amazon.jsii.Kernel.get(this, "hashKeyField", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.hashKeyValue = software.amazon.jsii.Kernel.get(this, "hashKeyValue", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.roleArn = software.amazon.jsii.Kernel.get(this, "roleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tableName = software.amazon.jsii.Kernel.get(this, "tableName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.hashKeyType = software.amazon.jsii.Kernel.get(this, "hashKeyType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.operation = software.amazon.jsii.Kernel.get(this, "operation", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.payloadField = software.amazon.jsii.Kernel.get(this, "payloadField", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.rangeKeyField = software.amazon.jsii.Kernel.get(this, "rangeKeyField", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.rangeKeyType = software.amazon.jsii.Kernel.get(this, "rangeKeyType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.rangeKeyValue = software.amazon.jsii.Kernel.get(this, "rangeKeyValue", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String hashKeyField, final java.lang.String hashKeyValue, final java.lang.String roleArn, final java.lang.String tableName, final java.lang.String hashKeyType, final java.lang.String operation, final java.lang.String payloadField, final java.lang.String rangeKeyField, final java.lang.String rangeKeyType, final java.lang.String rangeKeyValue) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.hashKeyField = java.util.Objects.requireNonNull(hashKeyField, "hashKeyField is required");
            this.hashKeyValue = java.util.Objects.requireNonNull(hashKeyValue, "hashKeyValue is required");
            this.roleArn = java.util.Objects.requireNonNull(roleArn, "roleArn is required");
            this.tableName = java.util.Objects.requireNonNull(tableName, "tableName is required");
            this.hashKeyType = hashKeyType;
            this.operation = operation;
            this.payloadField = payloadField;
            this.rangeKeyField = rangeKeyField;
            this.rangeKeyType = rangeKeyType;
            this.rangeKeyValue = rangeKeyValue;
        }

        @Override
        public final java.lang.String getHashKeyField() {
            return this.hashKeyField;
        }

        @Override
        public final java.lang.String getHashKeyValue() {
            return this.hashKeyValue;
        }

        @Override
        public final java.lang.String getRoleArn() {
            return this.roleArn;
        }

        @Override
        public final java.lang.String getTableName() {
            return this.tableName;
        }

        @Override
        public final java.lang.String getHashKeyType() {
            return this.hashKeyType;
        }

        @Override
        public final java.lang.String getOperation() {
            return this.operation;
        }

        @Override
        public final java.lang.String getPayloadField() {
            return this.payloadField;
        }

        @Override
        public final java.lang.String getRangeKeyField() {
            return this.rangeKeyField;
        }

        @Override
        public final java.lang.String getRangeKeyType() {
            return this.rangeKeyType;
        }

        @Override
        public final java.lang.String getRangeKeyValue() {
            return this.rangeKeyValue;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("hashKeyField", om.valueToTree(this.getHashKeyField()));
            data.set("hashKeyValue", om.valueToTree(this.getHashKeyValue()));
            data.set("roleArn", om.valueToTree(this.getRoleArn()));
            data.set("tableName", om.valueToTree(this.getTableName()));
            if (this.getHashKeyType() != null) {
                data.set("hashKeyType", om.valueToTree(this.getHashKeyType()));
            }
            if (this.getOperation() != null) {
                data.set("operation", om.valueToTree(this.getOperation()));
            }
            if (this.getPayloadField() != null) {
                data.set("payloadField", om.valueToTree(this.getPayloadField()));
            }
            if (this.getRangeKeyField() != null) {
                data.set("rangeKeyField", om.valueToTree(this.getRangeKeyField()));
            }
            if (this.getRangeKeyType() != null) {
                data.set("rangeKeyType", om.valueToTree(this.getRangeKeyType()));
            }
            if (this.getRangeKeyValue() != null) {
                data.set("rangeKeyValue", om.valueToTree(this.getRangeKeyValue()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.IotTopicRuleErrorActionDynamodb"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            IotTopicRuleErrorActionDynamodb.Jsii$Proxy that = (IotTopicRuleErrorActionDynamodb.Jsii$Proxy) o;

            if (!hashKeyField.equals(that.hashKeyField)) return false;
            if (!hashKeyValue.equals(that.hashKeyValue)) return false;
            if (!roleArn.equals(that.roleArn)) return false;
            if (!tableName.equals(that.tableName)) return false;
            if (this.hashKeyType != null ? !this.hashKeyType.equals(that.hashKeyType) : that.hashKeyType != null) return false;
            if (this.operation != null ? !this.operation.equals(that.operation) : that.operation != null) return false;
            if (this.payloadField != null ? !this.payloadField.equals(that.payloadField) : that.payloadField != null) return false;
            if (this.rangeKeyField != null ? !this.rangeKeyField.equals(that.rangeKeyField) : that.rangeKeyField != null) return false;
            if (this.rangeKeyType != null ? !this.rangeKeyType.equals(that.rangeKeyType) : that.rangeKeyType != null) return false;
            return this.rangeKeyValue != null ? this.rangeKeyValue.equals(that.rangeKeyValue) : that.rangeKeyValue == null;
        }

        @Override
        public final int hashCode() {
            int result = this.hashKeyField.hashCode();
            result = 31 * result + (this.hashKeyValue.hashCode());
            result = 31 * result + (this.roleArn.hashCode());
            result = 31 * result + (this.tableName.hashCode());
            result = 31 * result + (this.hashKeyType != null ? this.hashKeyType.hashCode() : 0);
            result = 31 * result + (this.operation != null ? this.operation.hashCode() : 0);
            result = 31 * result + (this.payloadField != null ? this.payloadField.hashCode() : 0);
            result = 31 * result + (this.rangeKeyField != null ? this.rangeKeyField.hashCode() : 0);
            result = 31 * result + (this.rangeKeyType != null ? this.rangeKeyType.hashCode() : 0);
            result = 31 * result + (this.rangeKeyValue != null ? this.rangeKeyValue.hashCode() : 0);
            return result;
        }
    }
}
