package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.133Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CloudtrailEventSelector")
@software.amazon.jsii.Jsii.Proxy(CloudtrailEventSelector.Jsii$Proxy.class)
public interface CloudtrailEventSelector extends software.amazon.jsii.JsiiSerializable {

    /**
     * data_resource block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CloudtrailEventSelectorDataResource> getDataResource() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getIncludeManagementEvents() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getReadWriteType() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CloudtrailEventSelector}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CloudtrailEventSelector}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CloudtrailEventSelector> {
        private java.util.List<imports.aws.CloudtrailEventSelectorDataResource> dataResource;
        private java.lang.Boolean includeManagementEvents;
        private java.lang.String readWriteType;

        /**
         * Sets the value of {@link CloudtrailEventSelector#getDataResource}
         * @param dataResource data_resource block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder dataResource(java.util.List<? extends imports.aws.CloudtrailEventSelectorDataResource> dataResource) {
            this.dataResource = (java.util.List<imports.aws.CloudtrailEventSelectorDataResource>)dataResource;
            return this;
        }

        /**
         * Sets the value of {@link CloudtrailEventSelector#getIncludeManagementEvents}
         * @param includeManagementEvents the value to be set.
         * @return {@code this}
         */
        public Builder includeManagementEvents(java.lang.Boolean includeManagementEvents) {
            this.includeManagementEvents = includeManagementEvents;
            return this;
        }

        /**
         * Sets the value of {@link CloudtrailEventSelector#getReadWriteType}
         * @param readWriteType the value to be set.
         * @return {@code this}
         */
        public Builder readWriteType(java.lang.String readWriteType) {
            this.readWriteType = readWriteType;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CloudtrailEventSelector}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CloudtrailEventSelector build() {
            return new Jsii$Proxy(dataResource, includeManagementEvents, readWriteType);
        }
    }

    /**
     * An implementation for {@link CloudtrailEventSelector}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CloudtrailEventSelector {
        private final java.util.List<imports.aws.CloudtrailEventSelectorDataResource> dataResource;
        private final java.lang.Boolean includeManagementEvents;
        private final java.lang.String readWriteType;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.dataResource = software.amazon.jsii.Kernel.get(this, "dataResource", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CloudtrailEventSelectorDataResource.class)));
            this.includeManagementEvents = software.amazon.jsii.Kernel.get(this, "includeManagementEvents", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.readWriteType = software.amazon.jsii.Kernel.get(this, "readWriteType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.CloudtrailEventSelectorDataResource> dataResource, final java.lang.Boolean includeManagementEvents, final java.lang.String readWriteType) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.dataResource = (java.util.List<imports.aws.CloudtrailEventSelectorDataResource>)dataResource;
            this.includeManagementEvents = includeManagementEvents;
            this.readWriteType = readWriteType;
        }

        @Override
        public final java.util.List<imports.aws.CloudtrailEventSelectorDataResource> getDataResource() {
            return this.dataResource;
        }

        @Override
        public final java.lang.Boolean getIncludeManagementEvents() {
            return this.includeManagementEvents;
        }

        @Override
        public final java.lang.String getReadWriteType() {
            return this.readWriteType;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getDataResource() != null) {
                data.set("dataResource", om.valueToTree(this.getDataResource()));
            }
            if (this.getIncludeManagementEvents() != null) {
                data.set("includeManagementEvents", om.valueToTree(this.getIncludeManagementEvents()));
            }
            if (this.getReadWriteType() != null) {
                data.set("readWriteType", om.valueToTree(this.getReadWriteType()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.CloudtrailEventSelector"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CloudtrailEventSelector.Jsii$Proxy that = (CloudtrailEventSelector.Jsii$Proxy) o;

            if (this.dataResource != null ? !this.dataResource.equals(that.dataResource) : that.dataResource != null) return false;
            if (this.includeManagementEvents != null ? !this.includeManagementEvents.equals(that.includeManagementEvents) : that.includeManagementEvents != null) return false;
            return this.readWriteType != null ? this.readWriteType.equals(that.readWriteType) : that.readWriteType == null;
        }

        @Override
        public final int hashCode() {
            int result = this.dataResource != null ? this.dataResource.hashCode() : 0;
            result = 31 * result + (this.includeManagementEvents != null ? this.includeManagementEvents.hashCode() : 0);
            result = 31 * result + (this.readWriteType != null ? this.readWriteType.hashCode() : 0);
            return result;
        }
    }
}
