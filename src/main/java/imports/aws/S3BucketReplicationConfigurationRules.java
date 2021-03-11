package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.838Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.S3BucketReplicationConfigurationRules")
@software.amazon.jsii.Jsii.Proxy(S3BucketReplicationConfigurationRules.Jsii$Proxy.class)
public interface S3BucketReplicationConfigurationRules extends software.amazon.jsii.JsiiSerializable {

    /**
     * destination block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.S3BucketReplicationConfigurationRulesDestination> getDestination();

    @org.jetbrains.annotations.NotNull java.lang.String getStatus();

    /**
     * filter block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.S3BucketReplicationConfigurationRulesFilter> getFilter() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPrefix() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getPriority() {
        return null;
    }

    /**
     * source_selection_criteria block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.S3BucketReplicationConfigurationRulesSourceSelectionCriteria> getSourceSelectionCriteria() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link S3BucketReplicationConfigurationRules}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link S3BucketReplicationConfigurationRules}
     */
    public static final class Builder implements software.amazon.jsii.Builder<S3BucketReplicationConfigurationRules> {
        private java.util.List<imports.aws.S3BucketReplicationConfigurationRulesDestination> destination;
        private java.lang.String status;
        private java.util.List<imports.aws.S3BucketReplicationConfigurationRulesFilter> filter;
        private java.lang.String id;
        private java.lang.String prefix;
        private java.lang.Number priority;
        private java.util.List<imports.aws.S3BucketReplicationConfigurationRulesSourceSelectionCriteria> sourceSelectionCriteria;

        /**
         * Sets the value of {@link S3BucketReplicationConfigurationRules#getDestination}
         * @param destination destination block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder destination(java.util.List<? extends imports.aws.S3BucketReplicationConfigurationRulesDestination> destination) {
            this.destination = (java.util.List<imports.aws.S3BucketReplicationConfigurationRulesDestination>)destination;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketReplicationConfigurationRules#getStatus}
         * @param status the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder status(java.lang.String status) {
            this.status = status;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketReplicationConfigurationRules#getFilter}
         * @param filter filter block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder filter(java.util.List<? extends imports.aws.S3BucketReplicationConfigurationRulesFilter> filter) {
            this.filter = (java.util.List<imports.aws.S3BucketReplicationConfigurationRulesFilter>)filter;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketReplicationConfigurationRules#getId}
         * @param id the value to be set.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketReplicationConfigurationRules#getPrefix}
         * @param prefix the value to be set.
         * @return {@code this}
         */
        public Builder prefix(java.lang.String prefix) {
            this.prefix = prefix;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketReplicationConfigurationRules#getPriority}
         * @param priority the value to be set.
         * @return {@code this}
         */
        public Builder priority(java.lang.Number priority) {
            this.priority = priority;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketReplicationConfigurationRules#getSourceSelectionCriteria}
         * @param sourceSelectionCriteria source_selection_criteria block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder sourceSelectionCriteria(java.util.List<? extends imports.aws.S3BucketReplicationConfigurationRulesSourceSelectionCriteria> sourceSelectionCriteria) {
            this.sourceSelectionCriteria = (java.util.List<imports.aws.S3BucketReplicationConfigurationRulesSourceSelectionCriteria>)sourceSelectionCriteria;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link S3BucketReplicationConfigurationRules}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public S3BucketReplicationConfigurationRules build() {
            return new Jsii$Proxy(destination, status, filter, id, prefix, priority, sourceSelectionCriteria);
        }
    }

    /**
     * An implementation for {@link S3BucketReplicationConfigurationRules}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements S3BucketReplicationConfigurationRules {
        private final java.util.List<imports.aws.S3BucketReplicationConfigurationRulesDestination> destination;
        private final java.lang.String status;
        private final java.util.List<imports.aws.S3BucketReplicationConfigurationRulesFilter> filter;
        private final java.lang.String id;
        private final java.lang.String prefix;
        private final java.lang.Number priority;
        private final java.util.List<imports.aws.S3BucketReplicationConfigurationRulesSourceSelectionCriteria> sourceSelectionCriteria;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.destination = software.amazon.jsii.Kernel.get(this, "destination", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.S3BucketReplicationConfigurationRulesDestination.class)));
            this.status = software.amazon.jsii.Kernel.get(this, "status", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.filter = software.amazon.jsii.Kernel.get(this, "filter", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.S3BucketReplicationConfigurationRulesFilter.class)));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.prefix = software.amazon.jsii.Kernel.get(this, "prefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.priority = software.amazon.jsii.Kernel.get(this, "priority", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.sourceSelectionCriteria = software.amazon.jsii.Kernel.get(this, "sourceSelectionCriteria", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.S3BucketReplicationConfigurationRulesSourceSelectionCriteria.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.S3BucketReplicationConfigurationRulesDestination> destination, final java.lang.String status, final java.util.List<? extends imports.aws.S3BucketReplicationConfigurationRulesFilter> filter, final java.lang.String id, final java.lang.String prefix, final java.lang.Number priority, final java.util.List<? extends imports.aws.S3BucketReplicationConfigurationRulesSourceSelectionCriteria> sourceSelectionCriteria) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.destination = (java.util.List<imports.aws.S3BucketReplicationConfigurationRulesDestination>)java.util.Objects.requireNonNull(destination, "destination is required");
            this.status = java.util.Objects.requireNonNull(status, "status is required");
            this.filter = (java.util.List<imports.aws.S3BucketReplicationConfigurationRulesFilter>)filter;
            this.id = id;
            this.prefix = prefix;
            this.priority = priority;
            this.sourceSelectionCriteria = (java.util.List<imports.aws.S3BucketReplicationConfigurationRulesSourceSelectionCriteria>)sourceSelectionCriteria;
        }

        @Override
        public final java.util.List<imports.aws.S3BucketReplicationConfigurationRulesDestination> getDestination() {
            return this.destination;
        }

        @Override
        public final java.lang.String getStatus() {
            return this.status;
        }

        @Override
        public final java.util.List<imports.aws.S3BucketReplicationConfigurationRulesFilter> getFilter() {
            return this.filter;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        public final java.lang.String getPrefix() {
            return this.prefix;
        }

        @Override
        public final java.lang.Number getPriority() {
            return this.priority;
        }

        @Override
        public final java.util.List<imports.aws.S3BucketReplicationConfigurationRulesSourceSelectionCriteria> getSourceSelectionCriteria() {
            return this.sourceSelectionCriteria;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("destination", om.valueToTree(this.getDestination()));
            data.set("status", om.valueToTree(this.getStatus()));
            if (this.getFilter() != null) {
                data.set("filter", om.valueToTree(this.getFilter()));
            }
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
            }
            if (this.getPrefix() != null) {
                data.set("prefix", om.valueToTree(this.getPrefix()));
            }
            if (this.getPriority() != null) {
                data.set("priority", om.valueToTree(this.getPriority()));
            }
            if (this.getSourceSelectionCriteria() != null) {
                data.set("sourceSelectionCriteria", om.valueToTree(this.getSourceSelectionCriteria()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.S3BucketReplicationConfigurationRules"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            S3BucketReplicationConfigurationRules.Jsii$Proxy that = (S3BucketReplicationConfigurationRules.Jsii$Proxy) o;

            if (!destination.equals(that.destination)) return false;
            if (!status.equals(that.status)) return false;
            if (this.filter != null ? !this.filter.equals(that.filter) : that.filter != null) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
            if (this.prefix != null ? !this.prefix.equals(that.prefix) : that.prefix != null) return false;
            if (this.priority != null ? !this.priority.equals(that.priority) : that.priority != null) return false;
            return this.sourceSelectionCriteria != null ? this.sourceSelectionCriteria.equals(that.sourceSelectionCriteria) : that.sourceSelectionCriteria == null;
        }

        @Override
        public final int hashCode() {
            int result = this.destination.hashCode();
            result = 31 * result + (this.status.hashCode());
            result = 31 * result + (this.filter != null ? this.filter.hashCode() : 0);
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
            result = 31 * result + (this.prefix != null ? this.prefix.hashCode() : 0);
            result = 31 * result + (this.priority != null ? this.priority.hashCode() : 0);
            result = 31 * result + (this.sourceSelectionCriteria != null ? this.sourceSelectionCriteria.hashCode() : 0);
            return result;
        }
    }
}
