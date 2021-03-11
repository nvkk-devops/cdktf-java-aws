package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.584Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.GameliftGameSessionQueueConfig")
@software.amazon.jsii.Jsii.Proxy(GameliftGameSessionQueueConfig.Jsii$Proxy.class)
public interface GameliftGameSessionQueueConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getDestinations() {
        return null;
    }

    /**
     * player_latency_policy block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.GameliftGameSessionQueuePlayerLatencyPolicy> getPlayerLatencyPolicy() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getTimeoutInSeconds() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link GameliftGameSessionQueueConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link GameliftGameSessionQueueConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<GameliftGameSessionQueueConfig> {
        private java.lang.String name;
        private java.util.List<java.lang.String> destinations;
        private java.util.List<imports.aws.GameliftGameSessionQueuePlayerLatencyPolicy> playerLatencyPolicy;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.lang.Number timeoutInSeconds;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link GameliftGameSessionQueueConfig#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link GameliftGameSessionQueueConfig#getDestinations}
         * @param destinations the value to be set.
         * @return {@code this}
         */
        public Builder destinations(java.util.List<java.lang.String> destinations) {
            this.destinations = destinations;
            return this;
        }

        /**
         * Sets the value of {@link GameliftGameSessionQueueConfig#getPlayerLatencyPolicy}
         * @param playerLatencyPolicy player_latency_policy block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder playerLatencyPolicy(java.util.List<? extends imports.aws.GameliftGameSessionQueuePlayerLatencyPolicy> playerLatencyPolicy) {
            this.playerLatencyPolicy = (java.util.List<imports.aws.GameliftGameSessionQueuePlayerLatencyPolicy>)playerLatencyPolicy;
            return this;
        }

        /**
         * Sets the value of {@link GameliftGameSessionQueueConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link GameliftGameSessionQueueConfig#getTimeoutInSeconds}
         * @param timeoutInSeconds the value to be set.
         * @return {@code this}
         */
        public Builder timeoutInSeconds(java.lang.Number timeoutInSeconds) {
            this.timeoutInSeconds = timeoutInSeconds;
            return this;
        }

        /**
         * Sets the value of {@link GameliftGameSessionQueueConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link GameliftGameSessionQueueConfig#getDependsOn}
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
         * Sets the value of {@link GameliftGameSessionQueueConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link GameliftGameSessionQueueConfig#getProvider}
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
         * @return a new instance of {@link GameliftGameSessionQueueConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public GameliftGameSessionQueueConfig build() {
            return new Jsii$Proxy(name, destinations, playerLatencyPolicy, tags, timeoutInSeconds, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link GameliftGameSessionQueueConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements GameliftGameSessionQueueConfig {
        private final java.lang.String name;
        private final java.util.List<java.lang.String> destinations;
        private final java.util.List<imports.aws.GameliftGameSessionQueuePlayerLatencyPolicy> playerLatencyPolicy;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.lang.Number timeoutInSeconds;
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
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.destinations = software.amazon.jsii.Kernel.get(this, "destinations", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.playerLatencyPolicy = software.amazon.jsii.Kernel.get(this, "playerLatencyPolicy", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.GameliftGameSessionQueuePlayerLatencyPolicy.class)));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.timeoutInSeconds = software.amazon.jsii.Kernel.get(this, "timeoutInSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String name, final java.util.List<java.lang.String> destinations, final java.util.List<? extends imports.aws.GameliftGameSessionQueuePlayerLatencyPolicy> playerLatencyPolicy, final java.util.Map<java.lang.String, java.lang.String> tags, final java.lang.Number timeoutInSeconds, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.destinations = destinations;
            this.playerLatencyPolicy = (java.util.List<imports.aws.GameliftGameSessionQueuePlayerLatencyPolicy>)playerLatencyPolicy;
            this.tags = tags;
            this.timeoutInSeconds = timeoutInSeconds;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.util.List<java.lang.String> getDestinations() {
            return this.destinations;
        }

        @Override
        public final java.util.List<imports.aws.GameliftGameSessionQueuePlayerLatencyPolicy> getPlayerLatencyPolicy() {
            return this.playerLatencyPolicy;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.lang.Number getTimeoutInSeconds() {
            return this.timeoutInSeconds;
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

            data.set("name", om.valueToTree(this.getName()));
            if (this.getDestinations() != null) {
                data.set("destinations", om.valueToTree(this.getDestinations()));
            }
            if (this.getPlayerLatencyPolicy() != null) {
                data.set("playerLatencyPolicy", om.valueToTree(this.getPlayerLatencyPolicy()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getTimeoutInSeconds() != null) {
                data.set("timeoutInSeconds", om.valueToTree(this.getTimeoutInSeconds()));
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
            struct.set("fqn", om.valueToTree("aws.GameliftGameSessionQueueConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            GameliftGameSessionQueueConfig.Jsii$Proxy that = (GameliftGameSessionQueueConfig.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (this.destinations != null ? !this.destinations.equals(that.destinations) : that.destinations != null) return false;
            if (this.playerLatencyPolicy != null ? !this.playerLatencyPolicy.equals(that.playerLatencyPolicy) : that.playerLatencyPolicy != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.timeoutInSeconds != null ? !this.timeoutInSeconds.equals(that.timeoutInSeconds) : that.timeoutInSeconds != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.destinations != null ? this.destinations.hashCode() : 0);
            result = 31 * result + (this.playerLatencyPolicy != null ? this.playerLatencyPolicy.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.timeoutInSeconds != null ? this.timeoutInSeconds.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
