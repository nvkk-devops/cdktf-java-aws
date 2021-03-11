package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.477Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.DynamodbTableGlobalSecondaryIndex")
@software.amazon.jsii.Jsii.Proxy(DynamodbTableGlobalSecondaryIndex.Jsii$Proxy.class)
public interface DynamodbTableGlobalSecondaryIndex extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getHashKey();

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    @org.jetbrains.annotations.NotNull java.lang.String getProjectionType();

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getNonKeyAttributes() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getRangeKey() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getReadCapacity() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getWriteCapacity() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DynamodbTableGlobalSecondaryIndex}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DynamodbTableGlobalSecondaryIndex}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DynamodbTableGlobalSecondaryIndex> {
        private java.lang.String hashKey;
        private java.lang.String name;
        private java.lang.String projectionType;
        private java.util.List<java.lang.String> nonKeyAttributes;
        private java.lang.String rangeKey;
        private java.lang.Number readCapacity;
        private java.lang.Number writeCapacity;

        /**
         * Sets the value of {@link DynamodbTableGlobalSecondaryIndex#getHashKey}
         * @param hashKey the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder hashKey(java.lang.String hashKey) {
            this.hashKey = hashKey;
            return this;
        }

        /**
         * Sets the value of {@link DynamodbTableGlobalSecondaryIndex#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link DynamodbTableGlobalSecondaryIndex#getProjectionType}
         * @param projectionType the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder projectionType(java.lang.String projectionType) {
            this.projectionType = projectionType;
            return this;
        }

        /**
         * Sets the value of {@link DynamodbTableGlobalSecondaryIndex#getNonKeyAttributes}
         * @param nonKeyAttributes the value to be set.
         * @return {@code this}
         */
        public Builder nonKeyAttributes(java.util.List<java.lang.String> nonKeyAttributes) {
            this.nonKeyAttributes = nonKeyAttributes;
            return this;
        }

        /**
         * Sets the value of {@link DynamodbTableGlobalSecondaryIndex#getRangeKey}
         * @param rangeKey the value to be set.
         * @return {@code this}
         */
        public Builder rangeKey(java.lang.String rangeKey) {
            this.rangeKey = rangeKey;
            return this;
        }

        /**
         * Sets the value of {@link DynamodbTableGlobalSecondaryIndex#getReadCapacity}
         * @param readCapacity the value to be set.
         * @return {@code this}
         */
        public Builder readCapacity(java.lang.Number readCapacity) {
            this.readCapacity = readCapacity;
            return this;
        }

        /**
         * Sets the value of {@link DynamodbTableGlobalSecondaryIndex#getWriteCapacity}
         * @param writeCapacity the value to be set.
         * @return {@code this}
         */
        public Builder writeCapacity(java.lang.Number writeCapacity) {
            this.writeCapacity = writeCapacity;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DynamodbTableGlobalSecondaryIndex}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DynamodbTableGlobalSecondaryIndex build() {
            return new Jsii$Proxy(hashKey, name, projectionType, nonKeyAttributes, rangeKey, readCapacity, writeCapacity);
        }
    }

    /**
     * An implementation for {@link DynamodbTableGlobalSecondaryIndex}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DynamodbTableGlobalSecondaryIndex {
        private final java.lang.String hashKey;
        private final java.lang.String name;
        private final java.lang.String projectionType;
        private final java.util.List<java.lang.String> nonKeyAttributes;
        private final java.lang.String rangeKey;
        private final java.lang.Number readCapacity;
        private final java.lang.Number writeCapacity;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.hashKey = software.amazon.jsii.Kernel.get(this, "hashKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.projectionType = software.amazon.jsii.Kernel.get(this, "projectionType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.nonKeyAttributes = software.amazon.jsii.Kernel.get(this, "nonKeyAttributes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.rangeKey = software.amazon.jsii.Kernel.get(this, "rangeKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.readCapacity = software.amazon.jsii.Kernel.get(this, "readCapacity", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.writeCapacity = software.amazon.jsii.Kernel.get(this, "writeCapacity", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String hashKey, final java.lang.String name, final java.lang.String projectionType, final java.util.List<java.lang.String> nonKeyAttributes, final java.lang.String rangeKey, final java.lang.Number readCapacity, final java.lang.Number writeCapacity) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.hashKey = java.util.Objects.requireNonNull(hashKey, "hashKey is required");
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.projectionType = java.util.Objects.requireNonNull(projectionType, "projectionType is required");
            this.nonKeyAttributes = nonKeyAttributes;
            this.rangeKey = rangeKey;
            this.readCapacity = readCapacity;
            this.writeCapacity = writeCapacity;
        }

        @Override
        public final java.lang.String getHashKey() {
            return this.hashKey;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getProjectionType() {
            return this.projectionType;
        }

        @Override
        public final java.util.List<java.lang.String> getNonKeyAttributes() {
            return this.nonKeyAttributes;
        }

        @Override
        public final java.lang.String getRangeKey() {
            return this.rangeKey;
        }

        @Override
        public final java.lang.Number getReadCapacity() {
            return this.readCapacity;
        }

        @Override
        public final java.lang.Number getWriteCapacity() {
            return this.writeCapacity;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("hashKey", om.valueToTree(this.getHashKey()));
            data.set("name", om.valueToTree(this.getName()));
            data.set("projectionType", om.valueToTree(this.getProjectionType()));
            if (this.getNonKeyAttributes() != null) {
                data.set("nonKeyAttributes", om.valueToTree(this.getNonKeyAttributes()));
            }
            if (this.getRangeKey() != null) {
                data.set("rangeKey", om.valueToTree(this.getRangeKey()));
            }
            if (this.getReadCapacity() != null) {
                data.set("readCapacity", om.valueToTree(this.getReadCapacity()));
            }
            if (this.getWriteCapacity() != null) {
                data.set("writeCapacity", om.valueToTree(this.getWriteCapacity()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.DynamodbTableGlobalSecondaryIndex"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DynamodbTableGlobalSecondaryIndex.Jsii$Proxy that = (DynamodbTableGlobalSecondaryIndex.Jsii$Proxy) o;

            if (!hashKey.equals(that.hashKey)) return false;
            if (!name.equals(that.name)) return false;
            if (!projectionType.equals(that.projectionType)) return false;
            if (this.nonKeyAttributes != null ? !this.nonKeyAttributes.equals(that.nonKeyAttributes) : that.nonKeyAttributes != null) return false;
            if (this.rangeKey != null ? !this.rangeKey.equals(that.rangeKey) : that.rangeKey != null) return false;
            if (this.readCapacity != null ? !this.readCapacity.equals(that.readCapacity) : that.readCapacity != null) return false;
            return this.writeCapacity != null ? this.writeCapacity.equals(that.writeCapacity) : that.writeCapacity == null;
        }

        @Override
        public final int hashCode() {
            int result = this.hashKey.hashCode();
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.projectionType.hashCode());
            result = 31 * result + (this.nonKeyAttributes != null ? this.nonKeyAttributes.hashCode() : 0);
            result = 31 * result + (this.rangeKey != null ? this.rangeKey.hashCode() : 0);
            result = 31 * result + (this.readCapacity != null ? this.readCapacity.hashCode() : 0);
            result = 31 * result + (this.writeCapacity != null ? this.writeCapacity.hashCode() : 0);
            return result;
        }
    }
}
