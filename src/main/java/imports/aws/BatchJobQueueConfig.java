package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.107Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.BatchJobQueueConfig")
@software.amazon.jsii.Jsii.Proxy(BatchJobQueueConfig.Jsii$Proxy.class)
public interface BatchJobQueueConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getComputeEnvironments();

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    @org.jetbrains.annotations.NotNull java.lang.Number getPriority();

    @org.jetbrains.annotations.NotNull java.lang.String getState();

    /**
     * @return a {@link Builder} of {@link BatchJobQueueConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BatchJobQueueConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BatchJobQueueConfig> {
        private java.util.List<java.lang.String> computeEnvironments;
        private java.lang.String name;
        private java.lang.Number priority;
        private java.lang.String state;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link BatchJobQueueConfig#getComputeEnvironments}
         * @param computeEnvironments the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder computeEnvironments(java.util.List<java.lang.String> computeEnvironments) {
            this.computeEnvironments = computeEnvironments;
            return this;
        }

        /**
         * Sets the value of {@link BatchJobQueueConfig#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link BatchJobQueueConfig#getPriority}
         * @param priority the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder priority(java.lang.Number priority) {
            this.priority = priority;
            return this;
        }

        /**
         * Sets the value of {@link BatchJobQueueConfig#getState}
         * @param state the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder state(java.lang.String state) {
            this.state = state;
            return this;
        }

        /**
         * Sets the value of {@link BatchJobQueueConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link BatchJobQueueConfig#getDependsOn}
         * @param dependsOn the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder dependsOn(java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            return this;
        }

        /**
         * Sets the value of {@link BatchJobQueueConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link BatchJobQueueConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BatchJobQueueConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BatchJobQueueConfig build() {
            return new Jsii$Proxy(computeEnvironments, name, priority, state, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link BatchJobQueueConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BatchJobQueueConfig {
        private final java.util.List<java.lang.String> computeEnvironments;
        private final java.lang.String name;
        private final java.lang.Number priority;
        private final java.lang.String state;
        private final java.lang.Number count;
        private final java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private final com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.computeEnvironments = software.amazon.jsii.Kernel.get(this, "computeEnvironments", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.priority = software.amazon.jsii.Kernel.get(this, "priority", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.state = software.amazon.jsii.Kernel.get(this, "state", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<java.lang.String> computeEnvironments, final java.lang.String name, final java.lang.Number priority, final java.lang.String state, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.computeEnvironments = java.util.Objects.requireNonNull(computeEnvironments, "computeEnvironments is required");
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.priority = java.util.Objects.requireNonNull(priority, "priority is required");
            this.state = java.util.Objects.requireNonNull(state, "state is required");
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.util.List<java.lang.String> getComputeEnvironments() {
            return this.computeEnvironments;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.Number getPriority() {
            return this.priority;
        }

        @Override
        public final java.lang.String getState() {
            return this.state;
        }

        @Override
        public final java.lang.Number getCount() {
            return this.count;
        }

        @Override
        public final java.util.List<com.hashicorp.cdktf.ITerraformDependable> getDependsOn() {
            return this.dependsOn;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformResourceLifecycle getLifecycle() {
            return this.lifecycle;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformProvider getProvider() {
            return this.provider;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("computeEnvironments", om.valueToTree(this.getComputeEnvironments()));
            data.set("name", om.valueToTree(this.getName()));
            data.set("priority", om.valueToTree(this.getPriority()));
            data.set("state", om.valueToTree(this.getState()));
            if (this.getCount() != null) {
                data.set("count", om.valueToTree(this.getCount()));
            }
            if (this.getDependsOn() != null) {
                data.set("dependsOn", om.valueToTree(this.getDependsOn()));
            }
            if (this.getLifecycle() != null) {
                data.set("lifecycle", om.valueToTree(this.getLifecycle()));
            }
            if (this.getProvider() != null) {
                data.set("provider", om.valueToTree(this.getProvider()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.BatchJobQueueConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BatchJobQueueConfig.Jsii$Proxy that = (BatchJobQueueConfig.Jsii$Proxy) o;

            if (!computeEnvironments.equals(that.computeEnvironments)) return false;
            if (!name.equals(that.name)) return false;
            if (!priority.equals(that.priority)) return false;
            if (!state.equals(that.state)) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.computeEnvironments.hashCode();
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.priority.hashCode());
            result = 31 * result + (this.state.hashCode());
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
