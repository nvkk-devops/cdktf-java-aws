package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.398Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.DatasyncTaskConfig")
@software.amazon.jsii.Jsii.Proxy(DatasyncTaskConfig.Jsii$Proxy.class)
public interface DatasyncTaskConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getDestinationLocationArn();

    @org.jetbrains.annotations.NotNull java.lang.String getSourceLocationArn();

    default @org.jetbrains.annotations.Nullable java.lang.String getCloudwatchLogGroupArn() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    /**
     * options block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.DatasyncTaskOptions> getOptions() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * timeouts block.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.DatasyncTaskTimeouts getTimeouts() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DatasyncTaskConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DatasyncTaskConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DatasyncTaskConfig> {
        private java.lang.String destinationLocationArn;
        private java.lang.String sourceLocationArn;
        private java.lang.String cloudwatchLogGroupArn;
        private java.lang.String name;
        private java.util.List<imports.aws.DatasyncTaskOptions> options;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private imports.aws.DatasyncTaskTimeouts timeouts;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link DatasyncTaskConfig#getDestinationLocationArn}
         * @param destinationLocationArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder destinationLocationArn(java.lang.String destinationLocationArn) {
            this.destinationLocationArn = destinationLocationArn;
            return this;
        }

        /**
         * Sets the value of {@link DatasyncTaskConfig#getSourceLocationArn}
         * @param sourceLocationArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder sourceLocationArn(java.lang.String sourceLocationArn) {
            this.sourceLocationArn = sourceLocationArn;
            return this;
        }

        /**
         * Sets the value of {@link DatasyncTaskConfig#getCloudwatchLogGroupArn}
         * @param cloudwatchLogGroupArn the value to be set.
         * @return {@code this}
         */
        public Builder cloudwatchLogGroupArn(java.lang.String cloudwatchLogGroupArn) {
            this.cloudwatchLogGroupArn = cloudwatchLogGroupArn;
            return this;
        }

        /**
         * Sets the value of {@link DatasyncTaskConfig#getName}
         * @param name the value to be set.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link DatasyncTaskConfig#getOptions}
         * @param options options block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder options(java.util.List<? extends imports.aws.DatasyncTaskOptions> options) {
            this.options = (java.util.List<imports.aws.DatasyncTaskOptions>)options;
            return this;
        }

        /**
         * Sets the value of {@link DatasyncTaskConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link DatasyncTaskConfig#getTimeouts}
         * @param timeouts timeouts block.
         * @return {@code this}
         */
        public Builder timeouts(imports.aws.DatasyncTaskTimeouts timeouts) {
            this.timeouts = timeouts;
            return this;
        }

        /**
         * Sets the value of {@link DatasyncTaskConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link DatasyncTaskConfig#getDependsOn}
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
         * Sets the value of {@link DatasyncTaskConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link DatasyncTaskConfig#getProvider}
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
         * @return a new instance of {@link DatasyncTaskConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DatasyncTaskConfig build() {
            return new Jsii$Proxy(destinationLocationArn, sourceLocationArn, cloudwatchLogGroupArn, name, options, tags, timeouts, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link DatasyncTaskConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DatasyncTaskConfig {
        private final java.lang.String destinationLocationArn;
        private final java.lang.String sourceLocationArn;
        private final java.lang.String cloudwatchLogGroupArn;
        private final java.lang.String name;
        private final java.util.List<imports.aws.DatasyncTaskOptions> options;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final imports.aws.DatasyncTaskTimeouts timeouts;
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
            this.destinationLocationArn = software.amazon.jsii.Kernel.get(this, "destinationLocationArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.sourceLocationArn = software.amazon.jsii.Kernel.get(this, "sourceLocationArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.cloudwatchLogGroupArn = software.amazon.jsii.Kernel.get(this, "cloudwatchLogGroupArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.options = software.amazon.jsii.Kernel.get(this, "options", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DatasyncTaskOptions.class)));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.timeouts = software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.DatasyncTaskTimeouts.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String destinationLocationArn, final java.lang.String sourceLocationArn, final java.lang.String cloudwatchLogGroupArn, final java.lang.String name, final java.util.List<? extends imports.aws.DatasyncTaskOptions> options, final java.util.Map<java.lang.String, java.lang.String> tags, final imports.aws.DatasyncTaskTimeouts timeouts, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.destinationLocationArn = java.util.Objects.requireNonNull(destinationLocationArn, "destinationLocationArn is required");
            this.sourceLocationArn = java.util.Objects.requireNonNull(sourceLocationArn, "sourceLocationArn is required");
            this.cloudwatchLogGroupArn = cloudwatchLogGroupArn;
            this.name = name;
            this.options = (java.util.List<imports.aws.DatasyncTaskOptions>)options;
            this.tags = tags;
            this.timeouts = timeouts;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getDestinationLocationArn() {
            return this.destinationLocationArn;
        }

        @Override
        public final java.lang.String getSourceLocationArn() {
            return this.sourceLocationArn;
        }

        @Override
        public final java.lang.String getCloudwatchLogGroupArn() {
            return this.cloudwatchLogGroupArn;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.util.List<imports.aws.DatasyncTaskOptions> getOptions() {
            return this.options;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final imports.aws.DatasyncTaskTimeouts getTimeouts() {
            return this.timeouts;
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

            data.set("destinationLocationArn", om.valueToTree(this.getDestinationLocationArn()));
            data.set("sourceLocationArn", om.valueToTree(this.getSourceLocationArn()));
            if (this.getCloudwatchLogGroupArn() != null) {
                data.set("cloudwatchLogGroupArn", om.valueToTree(this.getCloudwatchLogGroupArn()));
            }
            if (this.getName() != null) {
                data.set("name", om.valueToTree(this.getName()));
            }
            if (this.getOptions() != null) {
                data.set("options", om.valueToTree(this.getOptions()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getTimeouts() != null) {
                data.set("timeouts", om.valueToTree(this.getTimeouts()));
            }
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
            struct.set("fqn", om.valueToTree("aws.DatasyncTaskConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DatasyncTaskConfig.Jsii$Proxy that = (DatasyncTaskConfig.Jsii$Proxy) o;

            if (!destinationLocationArn.equals(that.destinationLocationArn)) return false;
            if (!sourceLocationArn.equals(that.sourceLocationArn)) return false;
            if (this.cloudwatchLogGroupArn != null ? !this.cloudwatchLogGroupArn.equals(that.cloudwatchLogGroupArn) : that.cloudwatchLogGroupArn != null) return false;
            if (this.name != null ? !this.name.equals(that.name) : that.name != null) return false;
            if (this.options != null ? !this.options.equals(that.options) : that.options != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.timeouts != null ? !this.timeouts.equals(that.timeouts) : that.timeouts != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.destinationLocationArn.hashCode();
            result = 31 * result + (this.sourceLocationArn.hashCode());
            result = 31 * result + (this.cloudwatchLogGroupArn != null ? this.cloudwatchLogGroupArn.hashCode() : 0);
            result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
            result = 31 * result + (this.options != null ? this.options.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.timeouts != null ? this.timeouts.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
