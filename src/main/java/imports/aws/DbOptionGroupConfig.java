package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.421Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.DbOptionGroupConfig")
@software.amazon.jsii.Jsii.Proxy(DbOptionGroupConfig.Jsii$Proxy.class)
public interface DbOptionGroupConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getEngineName();

    @org.jetbrains.annotations.NotNull java.lang.String getMajorEngineVersion();

    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getNamePrefix() {
        return null;
    }

    /**
     * option block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.DbOptionGroupOption> getOption() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getOptionGroupDescription() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * timeouts block.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.DbOptionGroupTimeouts getTimeouts() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DbOptionGroupConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DbOptionGroupConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DbOptionGroupConfig> {
        private java.lang.String engineName;
        private java.lang.String majorEngineVersion;
        private java.lang.String name;
        private java.lang.String namePrefix;
        private java.util.List<imports.aws.DbOptionGroupOption> option;
        private java.lang.String optionGroupDescription;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private imports.aws.DbOptionGroupTimeouts timeouts;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link DbOptionGroupConfig#getEngineName}
         * @param engineName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder engineName(java.lang.String engineName) {
            this.engineName = engineName;
            return this;
        }

        /**
         * Sets the value of {@link DbOptionGroupConfig#getMajorEngineVersion}
         * @param majorEngineVersion the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder majorEngineVersion(java.lang.String majorEngineVersion) {
            this.majorEngineVersion = majorEngineVersion;
            return this;
        }

        /**
         * Sets the value of {@link DbOptionGroupConfig#getName}
         * @param name the value to be set.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link DbOptionGroupConfig#getNamePrefix}
         * @param namePrefix the value to be set.
         * @return {@code this}
         */
        public Builder namePrefix(java.lang.String namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }

        /**
         * Sets the value of {@link DbOptionGroupConfig#getOption}
         * @param option option block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder option(java.util.List<? extends imports.aws.DbOptionGroupOption> option) {
            this.option = (java.util.List<imports.aws.DbOptionGroupOption>)option;
            return this;
        }

        /**
         * Sets the value of {@link DbOptionGroupConfig#getOptionGroupDescription}
         * @param optionGroupDescription the value to be set.
         * @return {@code this}
         */
        public Builder optionGroupDescription(java.lang.String optionGroupDescription) {
            this.optionGroupDescription = optionGroupDescription;
            return this;
        }

        /**
         * Sets the value of {@link DbOptionGroupConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link DbOptionGroupConfig#getTimeouts}
         * @param timeouts timeouts block.
         * @return {@code this}
         */
        public Builder timeouts(imports.aws.DbOptionGroupTimeouts timeouts) {
            this.timeouts = timeouts;
            return this;
        }

        /**
         * Sets the value of {@link DbOptionGroupConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link DbOptionGroupConfig#getDependsOn}
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
         * Sets the value of {@link DbOptionGroupConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link DbOptionGroupConfig#getProvider}
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
         * @return a new instance of {@link DbOptionGroupConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DbOptionGroupConfig build() {
            return new Jsii$Proxy(engineName, majorEngineVersion, name, namePrefix, option, optionGroupDescription, tags, timeouts, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link DbOptionGroupConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DbOptionGroupConfig {
        private final java.lang.String engineName;
        private final java.lang.String majorEngineVersion;
        private final java.lang.String name;
        private final java.lang.String namePrefix;
        private final java.util.List<imports.aws.DbOptionGroupOption> option;
        private final java.lang.String optionGroupDescription;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final imports.aws.DbOptionGroupTimeouts timeouts;
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
            this.engineName = software.amazon.jsii.Kernel.get(this, "engineName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.majorEngineVersion = software.amazon.jsii.Kernel.get(this, "majorEngineVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.namePrefix = software.amazon.jsii.Kernel.get(this, "namePrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.option = software.amazon.jsii.Kernel.get(this, "option", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DbOptionGroupOption.class)));
            this.optionGroupDescription = software.amazon.jsii.Kernel.get(this, "optionGroupDescription", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.timeouts = software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.DbOptionGroupTimeouts.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String engineName, final java.lang.String majorEngineVersion, final java.lang.String name, final java.lang.String namePrefix, final java.util.List<? extends imports.aws.DbOptionGroupOption> option, final java.lang.String optionGroupDescription, final java.util.Map<java.lang.String, java.lang.String> tags, final imports.aws.DbOptionGroupTimeouts timeouts, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.engineName = java.util.Objects.requireNonNull(engineName, "engineName is required");
            this.majorEngineVersion = java.util.Objects.requireNonNull(majorEngineVersion, "majorEngineVersion is required");
            this.name = name;
            this.namePrefix = namePrefix;
            this.option = (java.util.List<imports.aws.DbOptionGroupOption>)option;
            this.optionGroupDescription = optionGroupDescription;
            this.tags = tags;
            this.timeouts = timeouts;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getEngineName() {
            return this.engineName;
        }

        @Override
        public final java.lang.String getMajorEngineVersion() {
            return this.majorEngineVersion;
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
        public final java.util.List<imports.aws.DbOptionGroupOption> getOption() {
            return this.option;
        }

        @Override
        public final java.lang.String getOptionGroupDescription() {
            return this.optionGroupDescription;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final imports.aws.DbOptionGroupTimeouts getTimeouts() {
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

            data.set("engineName", om.valueToTree(this.getEngineName()));
            data.set("majorEngineVersion", om.valueToTree(this.getMajorEngineVersion()));
            if (this.getName() != null) {
                data.set("name", om.valueToTree(this.getName()));
            }
            if (this.getNamePrefix() != null) {
                data.set("namePrefix", om.valueToTree(this.getNamePrefix()));
            }
            if (this.getOption() != null) {
                data.set("option", om.valueToTree(this.getOption()));
            }
            if (this.getOptionGroupDescription() != null) {
                data.set("optionGroupDescription", om.valueToTree(this.getOptionGroupDescription()));
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
            struct.set("fqn", om.valueToTree("aws.DbOptionGroupConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DbOptionGroupConfig.Jsii$Proxy that = (DbOptionGroupConfig.Jsii$Proxy) o;

            if (!engineName.equals(that.engineName)) return false;
            if (!majorEngineVersion.equals(that.majorEngineVersion)) return false;
            if (this.name != null ? !this.name.equals(that.name) : that.name != null) return false;
            if (this.namePrefix != null ? !this.namePrefix.equals(that.namePrefix) : that.namePrefix != null) return false;
            if (this.option != null ? !this.option.equals(that.option) : that.option != null) return false;
            if (this.optionGroupDescription != null ? !this.optionGroupDescription.equals(that.optionGroupDescription) : that.optionGroupDescription != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.timeouts != null ? !this.timeouts.equals(that.timeouts) : that.timeouts != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.engineName.hashCode();
            result = 31 * result + (this.majorEngineVersion.hashCode());
            result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
            result = 31 * result + (this.namePrefix != null ? this.namePrefix.hashCode() : 0);
            result = 31 * result + (this.option != null ? this.option.hashCode() : 0);
            result = 31 * result + (this.optionGroupDescription != null ? this.optionGroupDescription.hashCode() : 0);
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
