package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.414Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.DbEventSubscriptionConfig")
@software.amazon.jsii.Jsii.Proxy(DbEventSubscriptionConfig.Jsii$Proxy.class)
public interface DbEventSubscriptionConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getSnsTopic();

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getEnabled() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getEventCategories() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getNamePrefix() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSourceIds() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSourceType() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * timeouts block.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.DbEventSubscriptionTimeouts getTimeouts() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DbEventSubscriptionConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DbEventSubscriptionConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DbEventSubscriptionConfig> {
        private java.lang.String snsTopic;
        private java.lang.Boolean enabled;
        private java.util.List<java.lang.String> eventCategories;
        private java.lang.String name;
        private java.lang.String namePrefix;
        private java.util.List<java.lang.String> sourceIds;
        private java.lang.String sourceType;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private imports.aws.DbEventSubscriptionTimeouts timeouts;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link DbEventSubscriptionConfig#getSnsTopic}
         * @param snsTopic the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder snsTopic(java.lang.String snsTopic) {
            this.snsTopic = snsTopic;
            return this;
        }

        /**
         * Sets the value of {@link DbEventSubscriptionConfig#getEnabled}
         * @param enabled the value to be set.
         * @return {@code this}
         */
        public Builder enabled(java.lang.Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Sets the value of {@link DbEventSubscriptionConfig#getEventCategories}
         * @param eventCategories the value to be set.
         * @return {@code this}
         */
        public Builder eventCategories(java.util.List<java.lang.String> eventCategories) {
            this.eventCategories = eventCategories;
            return this;
        }

        /**
         * Sets the value of {@link DbEventSubscriptionConfig#getName}
         * @param name the value to be set.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link DbEventSubscriptionConfig#getNamePrefix}
         * @param namePrefix the value to be set.
         * @return {@code this}
         */
        public Builder namePrefix(java.lang.String namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }

        /**
         * Sets the value of {@link DbEventSubscriptionConfig#getSourceIds}
         * @param sourceIds the value to be set.
         * @return {@code this}
         */
        public Builder sourceIds(java.util.List<java.lang.String> sourceIds) {
            this.sourceIds = sourceIds;
            return this;
        }

        /**
         * Sets the value of {@link DbEventSubscriptionConfig#getSourceType}
         * @param sourceType the value to be set.
         * @return {@code this}
         */
        public Builder sourceType(java.lang.String sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        /**
         * Sets the value of {@link DbEventSubscriptionConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link DbEventSubscriptionConfig#getTimeouts}
         * @param timeouts timeouts block.
         * @return {@code this}
         */
        public Builder timeouts(imports.aws.DbEventSubscriptionTimeouts timeouts) {
            this.timeouts = timeouts;
            return this;
        }

        /**
         * Sets the value of {@link DbEventSubscriptionConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link DbEventSubscriptionConfig#getDependsOn}
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
         * Sets the value of {@link DbEventSubscriptionConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link DbEventSubscriptionConfig#getProvider}
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
         * @return a new instance of {@link DbEventSubscriptionConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DbEventSubscriptionConfig build() {
            return new Jsii$Proxy(snsTopic, enabled, eventCategories, name, namePrefix, sourceIds, sourceType, tags, timeouts, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link DbEventSubscriptionConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DbEventSubscriptionConfig {
        private final java.lang.String snsTopic;
        private final java.lang.Boolean enabled;
        private final java.util.List<java.lang.String> eventCategories;
        private final java.lang.String name;
        private final java.lang.String namePrefix;
        private final java.util.List<java.lang.String> sourceIds;
        private final java.lang.String sourceType;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final imports.aws.DbEventSubscriptionTimeouts timeouts;
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
            this.snsTopic = software.amazon.jsii.Kernel.get(this, "snsTopic", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.enabled = software.amazon.jsii.Kernel.get(this, "enabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.eventCategories = software.amazon.jsii.Kernel.get(this, "eventCategories", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.namePrefix = software.amazon.jsii.Kernel.get(this, "namePrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.sourceIds = software.amazon.jsii.Kernel.get(this, "sourceIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.sourceType = software.amazon.jsii.Kernel.get(this, "sourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.timeouts = software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.DbEventSubscriptionTimeouts.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String snsTopic, final java.lang.Boolean enabled, final java.util.List<java.lang.String> eventCategories, final java.lang.String name, final java.lang.String namePrefix, final java.util.List<java.lang.String> sourceIds, final java.lang.String sourceType, final java.util.Map<java.lang.String, java.lang.String> tags, final imports.aws.DbEventSubscriptionTimeouts timeouts, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.snsTopic = java.util.Objects.requireNonNull(snsTopic, "snsTopic is required");
            this.enabled = enabled;
            this.eventCategories = eventCategories;
            this.name = name;
            this.namePrefix = namePrefix;
            this.sourceIds = sourceIds;
            this.sourceType = sourceType;
            this.tags = tags;
            this.timeouts = timeouts;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getSnsTopic() {
            return this.snsTopic;
        }

        @Override
        public final java.lang.Boolean getEnabled() {
            return this.enabled;
        }

        @Override
        public final java.util.List<java.lang.String> getEventCategories() {
            return this.eventCategories;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getNamePrefix() {
            return this.namePrefix;
        }

        @Override
        public final java.util.List<java.lang.String> getSourceIds() {
            return this.sourceIds;
        }

        @Override
        public final java.lang.String getSourceType() {
            return this.sourceType;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final imports.aws.DbEventSubscriptionTimeouts getTimeouts() {
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

            data.set("snsTopic", om.valueToTree(this.getSnsTopic()));
            if (this.getEnabled() != null) {
                data.set("enabled", om.valueToTree(this.getEnabled()));
            }
            if (this.getEventCategories() != null) {
                data.set("eventCategories", om.valueToTree(this.getEventCategories()));
            }
            if (this.getName() != null) {
                data.set("name", om.valueToTree(this.getName()));
            }
            if (this.getNamePrefix() != null) {
                data.set("namePrefix", om.valueToTree(this.getNamePrefix()));
            }
            if (this.getSourceIds() != null) {
                data.set("sourceIds", om.valueToTree(this.getSourceIds()));
            }
            if (this.getSourceType() != null) {
                data.set("sourceType", om.valueToTree(this.getSourceType()));
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
            struct.set("fqn", om.valueToTree("aws.DbEventSubscriptionConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DbEventSubscriptionConfig.Jsii$Proxy that = (DbEventSubscriptionConfig.Jsii$Proxy) o;

            if (!snsTopic.equals(that.snsTopic)) return false;
            if (this.enabled != null ? !this.enabled.equals(that.enabled) : that.enabled != null) return false;
            if (this.eventCategories != null ? !this.eventCategories.equals(that.eventCategories) : that.eventCategories != null) return false;
            if (this.name != null ? !this.name.equals(that.name) : that.name != null) return false;
            if (this.namePrefix != null ? !this.namePrefix.equals(that.namePrefix) : that.namePrefix != null) return false;
            if (this.sourceIds != null ? !this.sourceIds.equals(that.sourceIds) : that.sourceIds != null) return false;
            if (this.sourceType != null ? !this.sourceType.equals(that.sourceType) : that.sourceType != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.timeouts != null ? !this.timeouts.equals(that.timeouts) : that.timeouts != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.snsTopic.hashCode();
            result = 31 * result + (this.enabled != null ? this.enabled.hashCode() : 0);
            result = 31 * result + (this.eventCategories != null ? this.eventCategories.hashCode() : 0);
            result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
            result = 31 * result + (this.namePrefix != null ? this.namePrefix.hashCode() : 0);
            result = 31 * result + (this.sourceIds != null ? this.sourceIds.hashCode() : 0);
            result = 31 * result + (this.sourceType != null ? this.sourceType.hashCode() : 0);
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
