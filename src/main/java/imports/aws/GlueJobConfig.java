package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.603Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.GlueJobConfig")
@software.amazon.jsii.Jsii.Proxy(GlueJobConfig.Jsii$Proxy.class)
public interface GlueJobConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * command block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.GlueJobCommand> getCommand();

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    @org.jetbrains.annotations.NotNull java.lang.String getRoleArn();

    default @org.jetbrains.annotations.Nullable java.lang.Number getAllocatedCapacity() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getConnections() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getDefaultArguments() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return null;
    }

    /**
     * execution_property block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.GlueJobExecutionProperty> getExecutionProperty() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getGlueVersion() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getMaxCapacity() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getMaxRetries() {
        return null;
    }

    /**
     * notification_property block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.GlueJobNotificationProperty> getNotificationProperty() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getNumberOfWorkers() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSecurityConfiguration() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getTimeout() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getWorkerType() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link GlueJobConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link GlueJobConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<GlueJobConfig> {
        private java.util.List<imports.aws.GlueJobCommand> command;
        private java.lang.String name;
        private java.lang.String roleArn;
        private java.lang.Number allocatedCapacity;
        private java.util.List<java.lang.String> connections;
        private java.util.Map<java.lang.String, java.lang.String> defaultArguments;
        private java.lang.String description;
        private java.util.List<imports.aws.GlueJobExecutionProperty> executionProperty;
        private java.lang.String glueVersion;
        private java.lang.Number maxCapacity;
        private java.lang.Number maxRetries;
        private java.util.List<imports.aws.GlueJobNotificationProperty> notificationProperty;
        private java.lang.Number numberOfWorkers;
        private java.lang.String securityConfiguration;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.lang.Number timeout;
        private java.lang.String workerType;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link GlueJobConfig#getCommand}
         * @param command command block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder command(java.util.List<? extends imports.aws.GlueJobCommand> command) {
            this.command = (java.util.List<imports.aws.GlueJobCommand>)command;
            return this;
        }

        /**
         * Sets the value of {@link GlueJobConfig#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link GlueJobConfig#getRoleArn}
         * @param roleArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder roleArn(java.lang.String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        /**
         * Sets the value of {@link GlueJobConfig#getAllocatedCapacity}
         * @param allocatedCapacity the value to be set.
         * @return {@code this}
         */
        public Builder allocatedCapacity(java.lang.Number allocatedCapacity) {
            this.allocatedCapacity = allocatedCapacity;
            return this;
        }

        /**
         * Sets the value of {@link GlueJobConfig#getConnections}
         * @param connections the value to be set.
         * @return {@code this}
         */
        public Builder connections(java.util.List<java.lang.String> connections) {
            this.connections = connections;
            return this;
        }

        /**
         * Sets the value of {@link GlueJobConfig#getDefaultArguments}
         * @param defaultArguments the value to be set.
         * @return {@code this}
         */
        public Builder defaultArguments(java.util.Map<java.lang.String, java.lang.String> defaultArguments) {
            this.defaultArguments = defaultArguments;
            return this;
        }

        /**
         * Sets the value of {@link GlueJobConfig#getDescription}
         * @param description the value to be set.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link GlueJobConfig#getExecutionProperty}
         * @param executionProperty execution_property block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder executionProperty(java.util.List<? extends imports.aws.GlueJobExecutionProperty> executionProperty) {
            this.executionProperty = (java.util.List<imports.aws.GlueJobExecutionProperty>)executionProperty;
            return this;
        }

        /**
         * Sets the value of {@link GlueJobConfig#getGlueVersion}
         * @param glueVersion the value to be set.
         * @return {@code this}
         */
        public Builder glueVersion(java.lang.String glueVersion) {
            this.glueVersion = glueVersion;
            return this;
        }

        /**
         * Sets the value of {@link GlueJobConfig#getMaxCapacity}
         * @param maxCapacity the value to be set.
         * @return {@code this}
         */
        public Builder maxCapacity(java.lang.Number maxCapacity) {
            this.maxCapacity = maxCapacity;
            return this;
        }

        /**
         * Sets the value of {@link GlueJobConfig#getMaxRetries}
         * @param maxRetries the value to be set.
         * @return {@code this}
         */
        public Builder maxRetries(java.lang.Number maxRetries) {
            this.maxRetries = maxRetries;
            return this;
        }

        /**
         * Sets the value of {@link GlueJobConfig#getNotificationProperty}
         * @param notificationProperty notification_property block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder notificationProperty(java.util.List<? extends imports.aws.GlueJobNotificationProperty> notificationProperty) {
            this.notificationProperty = (java.util.List<imports.aws.GlueJobNotificationProperty>)notificationProperty;
            return this;
        }

        /**
         * Sets the value of {@link GlueJobConfig#getNumberOfWorkers}
         * @param numberOfWorkers the value to be set.
         * @return {@code this}
         */
        public Builder numberOfWorkers(java.lang.Number numberOfWorkers) {
            this.numberOfWorkers = numberOfWorkers;
            return this;
        }

        /**
         * Sets the value of {@link GlueJobConfig#getSecurityConfiguration}
         * @param securityConfiguration the value to be set.
         * @return {@code this}
         */
        public Builder securityConfiguration(java.lang.String securityConfiguration) {
            this.securityConfiguration = securityConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link GlueJobConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link GlueJobConfig#getTimeout}
         * @param timeout the value to be set.
         * @return {@code this}
         */
        public Builder timeout(java.lang.Number timeout) {
            this.timeout = timeout;
            return this;
        }

        /**
         * Sets the value of {@link GlueJobConfig#getWorkerType}
         * @param workerType the value to be set.
         * @return {@code this}
         */
        public Builder workerType(java.lang.String workerType) {
            this.workerType = workerType;
            return this;
        }

        /**
         * Sets the value of {@link GlueJobConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link GlueJobConfig#getDependsOn}
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
         * Sets the value of {@link GlueJobConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link GlueJobConfig#getProvider}
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
         * @return a new instance of {@link GlueJobConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public GlueJobConfig build() {
            return new Jsii$Proxy(command, name, roleArn, allocatedCapacity, connections, defaultArguments, description, executionProperty, glueVersion, maxCapacity, maxRetries, notificationProperty, numberOfWorkers, securityConfiguration, tags, timeout, workerType, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link GlueJobConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements GlueJobConfig {
        private final java.util.List<imports.aws.GlueJobCommand> command;
        private final java.lang.String name;
        private final java.lang.String roleArn;
        private final java.lang.Number allocatedCapacity;
        private final java.util.List<java.lang.String> connections;
        private final java.util.Map<java.lang.String, java.lang.String> defaultArguments;
        private final java.lang.String description;
        private final java.util.List<imports.aws.GlueJobExecutionProperty> executionProperty;
        private final java.lang.String glueVersion;
        private final java.lang.Number maxCapacity;
        private final java.lang.Number maxRetries;
        private final java.util.List<imports.aws.GlueJobNotificationProperty> notificationProperty;
        private final java.lang.Number numberOfWorkers;
        private final java.lang.String securityConfiguration;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.lang.Number timeout;
        private final java.lang.String workerType;
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
            this.command = software.amazon.jsii.Kernel.get(this, "command", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.GlueJobCommand.class)));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.roleArn = software.amazon.jsii.Kernel.get(this, "roleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.allocatedCapacity = software.amazon.jsii.Kernel.get(this, "allocatedCapacity", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.connections = software.amazon.jsii.Kernel.get(this, "connections", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.defaultArguments = software.amazon.jsii.Kernel.get(this, "defaultArguments", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.executionProperty = software.amazon.jsii.Kernel.get(this, "executionProperty", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.GlueJobExecutionProperty.class)));
            this.glueVersion = software.amazon.jsii.Kernel.get(this, "glueVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.maxCapacity = software.amazon.jsii.Kernel.get(this, "maxCapacity", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.maxRetries = software.amazon.jsii.Kernel.get(this, "maxRetries", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.notificationProperty = software.amazon.jsii.Kernel.get(this, "notificationProperty", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.GlueJobNotificationProperty.class)));
            this.numberOfWorkers = software.amazon.jsii.Kernel.get(this, "numberOfWorkers", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.securityConfiguration = software.amazon.jsii.Kernel.get(this, "securityConfiguration", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.timeout = software.amazon.jsii.Kernel.get(this, "timeout", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.workerType = software.amazon.jsii.Kernel.get(this, "workerType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.GlueJobCommand> command, final java.lang.String name, final java.lang.String roleArn, final java.lang.Number allocatedCapacity, final java.util.List<java.lang.String> connections, final java.util.Map<java.lang.String, java.lang.String> defaultArguments, final java.lang.String description, final java.util.List<? extends imports.aws.GlueJobExecutionProperty> executionProperty, final java.lang.String glueVersion, final java.lang.Number maxCapacity, final java.lang.Number maxRetries, final java.util.List<? extends imports.aws.GlueJobNotificationProperty> notificationProperty, final java.lang.Number numberOfWorkers, final java.lang.String securityConfiguration, final java.util.Map<java.lang.String, java.lang.String> tags, final java.lang.Number timeout, final java.lang.String workerType, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.command = (java.util.List<imports.aws.GlueJobCommand>)java.util.Objects.requireNonNull(command, "command is required");
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.roleArn = java.util.Objects.requireNonNull(roleArn, "roleArn is required");
            this.allocatedCapacity = allocatedCapacity;
            this.connections = connections;
            this.defaultArguments = defaultArguments;
            this.description = description;
            this.executionProperty = (java.util.List<imports.aws.GlueJobExecutionProperty>)executionProperty;
            this.glueVersion = glueVersion;
            this.maxCapacity = maxCapacity;
            this.maxRetries = maxRetries;
            this.notificationProperty = (java.util.List<imports.aws.GlueJobNotificationProperty>)notificationProperty;
            this.numberOfWorkers = numberOfWorkers;
            this.securityConfiguration = securityConfiguration;
            this.tags = tags;
            this.timeout = timeout;
            this.workerType = workerType;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.util.List<imports.aws.GlueJobCommand> getCommand() {
            return this.command;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getRoleArn() {
            return this.roleArn;
        }

        @Override
        public final java.lang.Number getAllocatedCapacity() {
            return this.allocatedCapacity;
        }

        @Override
        public final java.util.List<java.lang.String> getConnections() {
            return this.connections;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getDefaultArguments() {
            return this.defaultArguments;
        }

        @Override
        public final java.lang.String getDescription() {
            return this.description;
        }

        @Override
        public final java.util.List<imports.aws.GlueJobExecutionProperty> getExecutionProperty() {
            return this.executionProperty;
        }

        @Override
        public final java.lang.String getGlueVersion() {
            return this.glueVersion;
        }

        @Override
        public final java.lang.Number getMaxCapacity() {
            return this.maxCapacity;
        }

        @Override
        public final java.lang.Number getMaxRetries() {
            return this.maxRetries;
        }

        @Override
        public final java.util.List<imports.aws.GlueJobNotificationProperty> getNotificationProperty() {
            return this.notificationProperty;
        }

        @Override
        public final java.lang.Number getNumberOfWorkers() {
            return this.numberOfWorkers;
        }

        @Override
        public final java.lang.String getSecurityConfiguration() {
            return this.securityConfiguration;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.lang.Number getTimeout() {
            return this.timeout;
        }

        @Override
        public final java.lang.String getWorkerType() {
            return this.workerType;
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

            data.set("command", om.valueToTree(this.getCommand()));
            data.set("name", om.valueToTree(this.getName()));
            data.set("roleArn", om.valueToTree(this.getRoleArn()));
            if (this.getAllocatedCapacity() != null) {
                data.set("allocatedCapacity", om.valueToTree(this.getAllocatedCapacity()));
            }
            if (this.getConnections() != null) {
                data.set("connections", om.valueToTree(this.getConnections()));
            }
            if (this.getDefaultArguments() != null) {
                data.set("defaultArguments", om.valueToTree(this.getDefaultArguments()));
            }
            if (this.getDescription() != null) {
                data.set("description", om.valueToTree(this.getDescription()));
            }
            if (this.getExecutionProperty() != null) {
                data.set("executionProperty", om.valueToTree(this.getExecutionProperty()));
            }
            if (this.getGlueVersion() != null) {
                data.set("glueVersion", om.valueToTree(this.getGlueVersion()));
            }
            if (this.getMaxCapacity() != null) {
                data.set("maxCapacity", om.valueToTree(this.getMaxCapacity()));
            }
            if (this.getMaxRetries() != null) {
                data.set("maxRetries", om.valueToTree(this.getMaxRetries()));
            }
            if (this.getNotificationProperty() != null) {
                data.set("notificationProperty", om.valueToTree(this.getNotificationProperty()));
            }
            if (this.getNumberOfWorkers() != null) {
                data.set("numberOfWorkers", om.valueToTree(this.getNumberOfWorkers()));
            }
            if (this.getSecurityConfiguration() != null) {
                data.set("securityConfiguration", om.valueToTree(this.getSecurityConfiguration()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getTimeout() != null) {
                data.set("timeout", om.valueToTree(this.getTimeout()));
            }
            if (this.getWorkerType() != null) {
                data.set("workerType", om.valueToTree(this.getWorkerType()));
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
            struct.set("fqn", om.valueToTree("aws.GlueJobConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            GlueJobConfig.Jsii$Proxy that = (GlueJobConfig.Jsii$Proxy) o;

            if (!command.equals(that.command)) return false;
            if (!name.equals(that.name)) return false;
            if (!roleArn.equals(that.roleArn)) return false;
            if (this.allocatedCapacity != null ? !this.allocatedCapacity.equals(that.allocatedCapacity) : that.allocatedCapacity != null) return false;
            if (this.connections != null ? !this.connections.equals(that.connections) : that.connections != null) return false;
            if (this.defaultArguments != null ? !this.defaultArguments.equals(that.defaultArguments) : that.defaultArguments != null) return false;
            if (this.description != null ? !this.description.equals(that.description) : that.description != null) return false;
            if (this.executionProperty != null ? !this.executionProperty.equals(that.executionProperty) : that.executionProperty != null) return false;
            if (this.glueVersion != null ? !this.glueVersion.equals(that.glueVersion) : that.glueVersion != null) return false;
            if (this.maxCapacity != null ? !this.maxCapacity.equals(that.maxCapacity) : that.maxCapacity != null) return false;
            if (this.maxRetries != null ? !this.maxRetries.equals(that.maxRetries) : that.maxRetries != null) return false;
            if (this.notificationProperty != null ? !this.notificationProperty.equals(that.notificationProperty) : that.notificationProperty != null) return false;
            if (this.numberOfWorkers != null ? !this.numberOfWorkers.equals(that.numberOfWorkers) : that.numberOfWorkers != null) return false;
            if (this.securityConfiguration != null ? !this.securityConfiguration.equals(that.securityConfiguration) : that.securityConfiguration != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.timeout != null ? !this.timeout.equals(that.timeout) : that.timeout != null) return false;
            if (this.workerType != null ? !this.workerType.equals(that.workerType) : that.workerType != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.command.hashCode();
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.roleArn.hashCode());
            result = 31 * result + (this.allocatedCapacity != null ? this.allocatedCapacity.hashCode() : 0);
            result = 31 * result + (this.connections != null ? this.connections.hashCode() : 0);
            result = 31 * result + (this.defaultArguments != null ? this.defaultArguments.hashCode() : 0);
            result = 31 * result + (this.description != null ? this.description.hashCode() : 0);
            result = 31 * result + (this.executionProperty != null ? this.executionProperty.hashCode() : 0);
            result = 31 * result + (this.glueVersion != null ? this.glueVersion.hashCode() : 0);
            result = 31 * result + (this.maxCapacity != null ? this.maxCapacity.hashCode() : 0);
            result = 31 * result + (this.maxRetries != null ? this.maxRetries.hashCode() : 0);
            result = 31 * result + (this.notificationProperty != null ? this.notificationProperty.hashCode() : 0);
            result = 31 * result + (this.numberOfWorkers != null ? this.numberOfWorkers.hashCode() : 0);
            result = 31 * result + (this.securityConfiguration != null ? this.securityConfiguration.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.timeout != null ? this.timeout.hashCode() : 0);
            result = 31 * result + (this.workerType != null ? this.workerType.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
