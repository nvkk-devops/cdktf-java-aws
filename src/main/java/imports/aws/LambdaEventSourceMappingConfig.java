package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.673Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.LambdaEventSourceMappingConfig")
@software.amazon.jsii.Jsii.Proxy(LambdaEventSourceMappingConfig.Jsii$Proxy.class)
public interface LambdaEventSourceMappingConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getEventSourceArn();

    @org.jetbrains.annotations.NotNull java.lang.String getFunctionName();

    default @org.jetbrains.annotations.Nullable java.lang.Number getBatchSize() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getBisectBatchOnFunctionError() {
        return null;
    }

    /**
     * destination_config block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.LambdaEventSourceMappingDestinationConfig> getDestinationConfig() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getEnabled() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getMaximumBatchingWindowInSeconds() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getMaximumRecordAgeInSeconds() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getMaximumRetryAttempts() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getParallelizationFactor() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getStartingPosition() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getStartingPositionTimestamp() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link LambdaEventSourceMappingConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LambdaEventSourceMappingConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LambdaEventSourceMappingConfig> {
        private java.lang.String eventSourceArn;
        private java.lang.String functionName;
        private java.lang.Number batchSize;
        private java.lang.Boolean bisectBatchOnFunctionError;
        private java.util.List<imports.aws.LambdaEventSourceMappingDestinationConfig> destinationConfig;
        private java.lang.Boolean enabled;
        private java.lang.Number maximumBatchingWindowInSeconds;
        private java.lang.Number maximumRecordAgeInSeconds;
        private java.lang.Number maximumRetryAttempts;
        private java.lang.Number parallelizationFactor;
        private java.lang.String startingPosition;
        private java.lang.String startingPositionTimestamp;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link LambdaEventSourceMappingConfig#getEventSourceArn}
         * @param eventSourceArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder eventSourceArn(java.lang.String eventSourceArn) {
            this.eventSourceArn = eventSourceArn;
            return this;
        }

        /**
         * Sets the value of {@link LambdaEventSourceMappingConfig#getFunctionName}
         * @param functionName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder functionName(java.lang.String functionName) {
            this.functionName = functionName;
            return this;
        }

        /**
         * Sets the value of {@link LambdaEventSourceMappingConfig#getBatchSize}
         * @param batchSize the value to be set.
         * @return {@code this}
         */
        public Builder batchSize(java.lang.Number batchSize) {
            this.batchSize = batchSize;
            return this;
        }

        /**
         * Sets the value of {@link LambdaEventSourceMappingConfig#getBisectBatchOnFunctionError}
         * @param bisectBatchOnFunctionError the value to be set.
         * @return {@code this}
         */
        public Builder bisectBatchOnFunctionError(java.lang.Boolean bisectBatchOnFunctionError) {
            this.bisectBatchOnFunctionError = bisectBatchOnFunctionError;
            return this;
        }

        /**
         * Sets the value of {@link LambdaEventSourceMappingConfig#getDestinationConfig}
         * @param destinationConfig destination_config block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder destinationConfig(java.util.List<? extends imports.aws.LambdaEventSourceMappingDestinationConfig> destinationConfig) {
            this.destinationConfig = (java.util.List<imports.aws.LambdaEventSourceMappingDestinationConfig>)destinationConfig;
            return this;
        }

        /**
         * Sets the value of {@link LambdaEventSourceMappingConfig#getEnabled}
         * @param enabled the value to be set.
         * @return {@code this}
         */
        public Builder enabled(java.lang.Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Sets the value of {@link LambdaEventSourceMappingConfig#getMaximumBatchingWindowInSeconds}
         * @param maximumBatchingWindowInSeconds the value to be set.
         * @return {@code this}
         */
        public Builder maximumBatchingWindowInSeconds(java.lang.Number maximumBatchingWindowInSeconds) {
            this.maximumBatchingWindowInSeconds = maximumBatchingWindowInSeconds;
            return this;
        }

        /**
         * Sets the value of {@link LambdaEventSourceMappingConfig#getMaximumRecordAgeInSeconds}
         * @param maximumRecordAgeInSeconds the value to be set.
         * @return {@code this}
         */
        public Builder maximumRecordAgeInSeconds(java.lang.Number maximumRecordAgeInSeconds) {
            this.maximumRecordAgeInSeconds = maximumRecordAgeInSeconds;
            return this;
        }

        /**
         * Sets the value of {@link LambdaEventSourceMappingConfig#getMaximumRetryAttempts}
         * @param maximumRetryAttempts the value to be set.
         * @return {@code this}
         */
        public Builder maximumRetryAttempts(java.lang.Number maximumRetryAttempts) {
            this.maximumRetryAttempts = maximumRetryAttempts;
            return this;
        }

        /**
         * Sets the value of {@link LambdaEventSourceMappingConfig#getParallelizationFactor}
         * @param parallelizationFactor the value to be set.
         * @return {@code this}
         */
        public Builder parallelizationFactor(java.lang.Number parallelizationFactor) {
            this.parallelizationFactor = parallelizationFactor;
            return this;
        }

        /**
         * Sets the value of {@link LambdaEventSourceMappingConfig#getStartingPosition}
         * @param startingPosition the value to be set.
         * @return {@code this}
         */
        public Builder startingPosition(java.lang.String startingPosition) {
            this.startingPosition = startingPosition;
            return this;
        }

        /**
         * Sets the value of {@link LambdaEventSourceMappingConfig#getStartingPositionTimestamp}
         * @param startingPositionTimestamp the value to be set.
         * @return {@code this}
         */
        public Builder startingPositionTimestamp(java.lang.String startingPositionTimestamp) {
            this.startingPositionTimestamp = startingPositionTimestamp;
            return this;
        }

        /**
         * Sets the value of {@link LambdaEventSourceMappingConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link LambdaEventSourceMappingConfig#getDependsOn}
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
         * Sets the value of {@link LambdaEventSourceMappingConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link LambdaEventSourceMappingConfig#getProvider}
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
         * @return a new instance of {@link LambdaEventSourceMappingConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LambdaEventSourceMappingConfig build() {
            return new Jsii$Proxy(eventSourceArn, functionName, batchSize, bisectBatchOnFunctionError, destinationConfig, enabled, maximumBatchingWindowInSeconds, maximumRecordAgeInSeconds, maximumRetryAttempts, parallelizationFactor, startingPosition, startingPositionTimestamp, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link LambdaEventSourceMappingConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LambdaEventSourceMappingConfig {
        private final java.lang.String eventSourceArn;
        private final java.lang.String functionName;
        private final java.lang.Number batchSize;
        private final java.lang.Boolean bisectBatchOnFunctionError;
        private final java.util.List<imports.aws.LambdaEventSourceMappingDestinationConfig> destinationConfig;
        private final java.lang.Boolean enabled;
        private final java.lang.Number maximumBatchingWindowInSeconds;
        private final java.lang.Number maximumRecordAgeInSeconds;
        private final java.lang.Number maximumRetryAttempts;
        private final java.lang.Number parallelizationFactor;
        private final java.lang.String startingPosition;
        private final java.lang.String startingPositionTimestamp;
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
            this.eventSourceArn = software.amazon.jsii.Kernel.get(this, "eventSourceArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.functionName = software.amazon.jsii.Kernel.get(this, "functionName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.batchSize = software.amazon.jsii.Kernel.get(this, "batchSize", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.bisectBatchOnFunctionError = software.amazon.jsii.Kernel.get(this, "bisectBatchOnFunctionError", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.destinationConfig = software.amazon.jsii.Kernel.get(this, "destinationConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.LambdaEventSourceMappingDestinationConfig.class)));
            this.enabled = software.amazon.jsii.Kernel.get(this, "enabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.maximumBatchingWindowInSeconds = software.amazon.jsii.Kernel.get(this, "maximumBatchingWindowInSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.maximumRecordAgeInSeconds = software.amazon.jsii.Kernel.get(this, "maximumRecordAgeInSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.maximumRetryAttempts = software.amazon.jsii.Kernel.get(this, "maximumRetryAttempts", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.parallelizationFactor = software.amazon.jsii.Kernel.get(this, "parallelizationFactor", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.startingPosition = software.amazon.jsii.Kernel.get(this, "startingPosition", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.startingPositionTimestamp = software.amazon.jsii.Kernel.get(this, "startingPositionTimestamp", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String eventSourceArn, final java.lang.String functionName, final java.lang.Number batchSize, final java.lang.Boolean bisectBatchOnFunctionError, final java.util.List<? extends imports.aws.LambdaEventSourceMappingDestinationConfig> destinationConfig, final java.lang.Boolean enabled, final java.lang.Number maximumBatchingWindowInSeconds, final java.lang.Number maximumRecordAgeInSeconds, final java.lang.Number maximumRetryAttempts, final java.lang.Number parallelizationFactor, final java.lang.String startingPosition, final java.lang.String startingPositionTimestamp, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.eventSourceArn = java.util.Objects.requireNonNull(eventSourceArn, "eventSourceArn is required");
            this.functionName = java.util.Objects.requireNonNull(functionName, "functionName is required");
            this.batchSize = batchSize;
            this.bisectBatchOnFunctionError = bisectBatchOnFunctionError;
            this.destinationConfig = (java.util.List<imports.aws.LambdaEventSourceMappingDestinationConfig>)destinationConfig;
            this.enabled = enabled;
            this.maximumBatchingWindowInSeconds = maximumBatchingWindowInSeconds;
            this.maximumRecordAgeInSeconds = maximumRecordAgeInSeconds;
            this.maximumRetryAttempts = maximumRetryAttempts;
            this.parallelizationFactor = parallelizationFactor;
            this.startingPosition = startingPosition;
            this.startingPositionTimestamp = startingPositionTimestamp;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getEventSourceArn() {
            return this.eventSourceArn;
        }

        @Override
        public final java.lang.String getFunctionName() {
            return this.functionName;
        }

        @Override
        public final java.lang.Number getBatchSize() {
            return this.batchSize;
        }

        @Override
        public final java.lang.Boolean getBisectBatchOnFunctionError() {
            return this.bisectBatchOnFunctionError;
        }

        @Override
        public final java.util.List<imports.aws.LambdaEventSourceMappingDestinationConfig> getDestinationConfig() {
            return this.destinationConfig;
        }

        @Override
        public final java.lang.Boolean getEnabled() {
            return this.enabled;
        }

        @Override
        public final java.lang.Number getMaximumBatchingWindowInSeconds() {
            return this.maximumBatchingWindowInSeconds;
        }

        @Override
        public final java.lang.Number getMaximumRecordAgeInSeconds() {
            return this.maximumRecordAgeInSeconds;
        }

        @Override
        public final java.lang.Number getMaximumRetryAttempts() {
            return this.maximumRetryAttempts;
        }

        @Override
        public final java.lang.Number getParallelizationFactor() {
            return this.parallelizationFactor;
        }

        @Override
        public final java.lang.String getStartingPosition() {
            return this.startingPosition;
        }

        @Override
        public final java.lang.String getStartingPositionTimestamp() {
            return this.startingPositionTimestamp;
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

            data.set("eventSourceArn", om.valueToTree(this.getEventSourceArn()));
            data.set("functionName", om.valueToTree(this.getFunctionName()));
            if (this.getBatchSize() != null) {
                data.set("batchSize", om.valueToTree(this.getBatchSize()));
            }
            if (this.getBisectBatchOnFunctionError() != null) {
                data.set("bisectBatchOnFunctionError", om.valueToTree(this.getBisectBatchOnFunctionError()));
            }
            if (this.getDestinationConfig() != null) {
                data.set("destinationConfig", om.valueToTree(this.getDestinationConfig()));
            }
            if (this.getEnabled() != null) {
                data.set("enabled", om.valueToTree(this.getEnabled()));
            }
            if (this.getMaximumBatchingWindowInSeconds() != null) {
                data.set("maximumBatchingWindowInSeconds", om.valueToTree(this.getMaximumBatchingWindowInSeconds()));
            }
            if (this.getMaximumRecordAgeInSeconds() != null) {
                data.set("maximumRecordAgeInSeconds", om.valueToTree(this.getMaximumRecordAgeInSeconds()));
            }
            if (this.getMaximumRetryAttempts() != null) {
                data.set("maximumRetryAttempts", om.valueToTree(this.getMaximumRetryAttempts()));
            }
            if (this.getParallelizationFactor() != null) {
                data.set("parallelizationFactor", om.valueToTree(this.getParallelizationFactor()));
            }
            if (this.getStartingPosition() != null) {
                data.set("startingPosition", om.valueToTree(this.getStartingPosition()));
            }
            if (this.getStartingPositionTimestamp() != null) {
                data.set("startingPositionTimestamp", om.valueToTree(this.getStartingPositionTimestamp()));
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
            struct.set("fqn", om.valueToTree("aws.LambdaEventSourceMappingConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LambdaEventSourceMappingConfig.Jsii$Proxy that = (LambdaEventSourceMappingConfig.Jsii$Proxy) o;

            if (!eventSourceArn.equals(that.eventSourceArn)) return false;
            if (!functionName.equals(that.functionName)) return false;
            if (this.batchSize != null ? !this.batchSize.equals(that.batchSize) : that.batchSize != null) return false;
            if (this.bisectBatchOnFunctionError != null ? !this.bisectBatchOnFunctionError.equals(that.bisectBatchOnFunctionError) : that.bisectBatchOnFunctionError != null) return false;
            if (this.destinationConfig != null ? !this.destinationConfig.equals(that.destinationConfig) : that.destinationConfig != null) return false;
            if (this.enabled != null ? !this.enabled.equals(that.enabled) : that.enabled != null) return false;
            if (this.maximumBatchingWindowInSeconds != null ? !this.maximumBatchingWindowInSeconds.equals(that.maximumBatchingWindowInSeconds) : that.maximumBatchingWindowInSeconds != null) return false;
            if (this.maximumRecordAgeInSeconds != null ? !this.maximumRecordAgeInSeconds.equals(that.maximumRecordAgeInSeconds) : that.maximumRecordAgeInSeconds != null) return false;
            if (this.maximumRetryAttempts != null ? !this.maximumRetryAttempts.equals(that.maximumRetryAttempts) : that.maximumRetryAttempts != null) return false;
            if (this.parallelizationFactor != null ? !this.parallelizationFactor.equals(that.parallelizationFactor) : that.parallelizationFactor != null) return false;
            if (this.startingPosition != null ? !this.startingPosition.equals(that.startingPosition) : that.startingPosition != null) return false;
            if (this.startingPositionTimestamp != null ? !this.startingPositionTimestamp.equals(that.startingPositionTimestamp) : that.startingPositionTimestamp != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.eventSourceArn.hashCode();
            result = 31 * result + (this.functionName.hashCode());
            result = 31 * result + (this.batchSize != null ? this.batchSize.hashCode() : 0);
            result = 31 * result + (this.bisectBatchOnFunctionError != null ? this.bisectBatchOnFunctionError.hashCode() : 0);
            result = 31 * result + (this.destinationConfig != null ? this.destinationConfig.hashCode() : 0);
            result = 31 * result + (this.enabled != null ? this.enabled.hashCode() : 0);
            result = 31 * result + (this.maximumBatchingWindowInSeconds != null ? this.maximumBatchingWindowInSeconds.hashCode() : 0);
            result = 31 * result + (this.maximumRecordAgeInSeconds != null ? this.maximumRecordAgeInSeconds.hashCode() : 0);
            result = 31 * result + (this.maximumRetryAttempts != null ? this.maximumRetryAttempts.hashCode() : 0);
            result = 31 * result + (this.parallelizationFactor != null ? this.parallelizationFactor.hashCode() : 0);
            result = 31 * result + (this.startingPosition != null ? this.startingPosition.hashCode() : 0);
            result = 31 * result + (this.startingPositionTimestamp != null ? this.startingPositionTimestamp.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
