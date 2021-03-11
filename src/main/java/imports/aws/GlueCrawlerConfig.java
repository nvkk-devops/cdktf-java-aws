package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.595Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.GlueCrawlerConfig")
@software.amazon.jsii.Jsii.Proxy(GlueCrawlerConfig.Jsii$Proxy.class)
public interface GlueCrawlerConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getDatabaseName();

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    @org.jetbrains.annotations.NotNull java.lang.String getRole();

    /**
     * catalog_target block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.GlueCrawlerCatalogTarget> getCatalogTarget() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getClassifiers() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getConfiguration() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return null;
    }

    /**
     * dynamodb_target block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.GlueCrawlerDynamodbTarget> getDynamodbTarget() {
        return null;
    }

    /**
     * jdbc_target block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.GlueCrawlerJdbcTarget> getJdbcTarget() {
        return null;
    }

    /**
     * s3_target block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.GlueCrawlerS3Target> getS3Target() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSchedule() {
        return null;
    }

    /**
     * schema_change_policy block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.GlueCrawlerSchemaChangePolicy> getSchemaChangePolicy() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSecurityConfiguration() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getTablePrefix() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link GlueCrawlerConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link GlueCrawlerConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<GlueCrawlerConfig> {
        private java.lang.String databaseName;
        private java.lang.String name;
        private java.lang.String role;
        private java.util.List<imports.aws.GlueCrawlerCatalogTarget> catalogTarget;
        private java.util.List<java.lang.String> classifiers;
        private java.lang.String configuration;
        private java.lang.String description;
        private java.util.List<imports.aws.GlueCrawlerDynamodbTarget> dynamodbTarget;
        private java.util.List<imports.aws.GlueCrawlerJdbcTarget> jdbcTarget;
        private java.util.List<imports.aws.GlueCrawlerS3Target> s3Target;
        private java.lang.String schedule;
        private java.util.List<imports.aws.GlueCrawlerSchemaChangePolicy> schemaChangePolicy;
        private java.lang.String securityConfiguration;
        private java.lang.String tablePrefix;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link GlueCrawlerConfig#getDatabaseName}
         * @param databaseName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder databaseName(java.lang.String databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        /**
         * Sets the value of {@link GlueCrawlerConfig#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link GlueCrawlerConfig#getRole}
         * @param role the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder role(java.lang.String role) {
            this.role = role;
            return this;
        }

        /**
         * Sets the value of {@link GlueCrawlerConfig#getCatalogTarget}
         * @param catalogTarget catalog_target block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder catalogTarget(java.util.List<? extends imports.aws.GlueCrawlerCatalogTarget> catalogTarget) {
            this.catalogTarget = (java.util.List<imports.aws.GlueCrawlerCatalogTarget>)catalogTarget;
            return this;
        }

        /**
         * Sets the value of {@link GlueCrawlerConfig#getClassifiers}
         * @param classifiers the value to be set.
         * @return {@code this}
         */
        public Builder classifiers(java.util.List<java.lang.String> classifiers) {
            this.classifiers = classifiers;
            return this;
        }

        /**
         * Sets the value of {@link GlueCrawlerConfig#getConfiguration}
         * @param configuration the value to be set.
         * @return {@code this}
         */
        public Builder configuration(java.lang.String configuration) {
            this.configuration = configuration;
            return this;
        }

        /**
         * Sets the value of {@link GlueCrawlerConfig#getDescription}
         * @param description the value to be set.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link GlueCrawlerConfig#getDynamodbTarget}
         * @param dynamodbTarget dynamodb_target block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder dynamodbTarget(java.util.List<? extends imports.aws.GlueCrawlerDynamodbTarget> dynamodbTarget) {
            this.dynamodbTarget = (java.util.List<imports.aws.GlueCrawlerDynamodbTarget>)dynamodbTarget;
            return this;
        }

        /**
         * Sets the value of {@link GlueCrawlerConfig#getJdbcTarget}
         * @param jdbcTarget jdbc_target block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder jdbcTarget(java.util.List<? extends imports.aws.GlueCrawlerJdbcTarget> jdbcTarget) {
            this.jdbcTarget = (java.util.List<imports.aws.GlueCrawlerJdbcTarget>)jdbcTarget;
            return this;
        }

        /**
         * Sets the value of {@link GlueCrawlerConfig#getS3Target}
         * @param s3Target s3_target block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder s3Target(java.util.List<? extends imports.aws.GlueCrawlerS3Target> s3Target) {
            this.s3Target = (java.util.List<imports.aws.GlueCrawlerS3Target>)s3Target;
            return this;
        }

        /**
         * Sets the value of {@link GlueCrawlerConfig#getSchedule}
         * @param schedule the value to be set.
         * @return {@code this}
         */
        public Builder schedule(java.lang.String schedule) {
            this.schedule = schedule;
            return this;
        }

        /**
         * Sets the value of {@link GlueCrawlerConfig#getSchemaChangePolicy}
         * @param schemaChangePolicy schema_change_policy block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder schemaChangePolicy(java.util.List<? extends imports.aws.GlueCrawlerSchemaChangePolicy> schemaChangePolicy) {
            this.schemaChangePolicy = (java.util.List<imports.aws.GlueCrawlerSchemaChangePolicy>)schemaChangePolicy;
            return this;
        }

        /**
         * Sets the value of {@link GlueCrawlerConfig#getSecurityConfiguration}
         * @param securityConfiguration the value to be set.
         * @return {@code this}
         */
        public Builder securityConfiguration(java.lang.String securityConfiguration) {
            this.securityConfiguration = securityConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link GlueCrawlerConfig#getTablePrefix}
         * @param tablePrefix the value to be set.
         * @return {@code this}
         */
        public Builder tablePrefix(java.lang.String tablePrefix) {
            this.tablePrefix = tablePrefix;
            return this;
        }

        /**
         * Sets the value of {@link GlueCrawlerConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link GlueCrawlerConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link GlueCrawlerConfig#getDependsOn}
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
         * Sets the value of {@link GlueCrawlerConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link GlueCrawlerConfig#getProvider}
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
         * @return a new instance of {@link GlueCrawlerConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public GlueCrawlerConfig build() {
            return new Jsii$Proxy(databaseName, name, role, catalogTarget, classifiers, configuration, description, dynamodbTarget, jdbcTarget, s3Target, schedule, schemaChangePolicy, securityConfiguration, tablePrefix, tags, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link GlueCrawlerConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements GlueCrawlerConfig {
        private final java.lang.String databaseName;
        private final java.lang.String name;
        private final java.lang.String role;
        private final java.util.List<imports.aws.GlueCrawlerCatalogTarget> catalogTarget;
        private final java.util.List<java.lang.String> classifiers;
        private final java.lang.String configuration;
        private final java.lang.String description;
        private final java.util.List<imports.aws.GlueCrawlerDynamodbTarget> dynamodbTarget;
        private final java.util.List<imports.aws.GlueCrawlerJdbcTarget> jdbcTarget;
        private final java.util.List<imports.aws.GlueCrawlerS3Target> s3Target;
        private final java.lang.String schedule;
        private final java.util.List<imports.aws.GlueCrawlerSchemaChangePolicy> schemaChangePolicy;
        private final java.lang.String securityConfiguration;
        private final java.lang.String tablePrefix;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
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
            this.databaseName = software.amazon.jsii.Kernel.get(this, "databaseName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.role = software.amazon.jsii.Kernel.get(this, "role", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.catalogTarget = software.amazon.jsii.Kernel.get(this, "catalogTarget", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.GlueCrawlerCatalogTarget.class)));
            this.classifiers = software.amazon.jsii.Kernel.get(this, "classifiers", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.configuration = software.amazon.jsii.Kernel.get(this, "configuration", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.dynamodbTarget = software.amazon.jsii.Kernel.get(this, "dynamodbTarget", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.GlueCrawlerDynamodbTarget.class)));
            this.jdbcTarget = software.amazon.jsii.Kernel.get(this, "jdbcTarget", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.GlueCrawlerJdbcTarget.class)));
            this.s3Target = software.amazon.jsii.Kernel.get(this, "s3Target", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.GlueCrawlerS3Target.class)));
            this.schedule = software.amazon.jsii.Kernel.get(this, "schedule", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.schemaChangePolicy = software.amazon.jsii.Kernel.get(this, "schemaChangePolicy", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.GlueCrawlerSchemaChangePolicy.class)));
            this.securityConfiguration = software.amazon.jsii.Kernel.get(this, "securityConfiguration", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tablePrefix = software.amazon.jsii.Kernel.get(this, "tablePrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String databaseName, final java.lang.String name, final java.lang.String role, final java.util.List<? extends imports.aws.GlueCrawlerCatalogTarget> catalogTarget, final java.util.List<java.lang.String> classifiers, final java.lang.String configuration, final java.lang.String description, final java.util.List<? extends imports.aws.GlueCrawlerDynamodbTarget> dynamodbTarget, final java.util.List<? extends imports.aws.GlueCrawlerJdbcTarget> jdbcTarget, final java.util.List<? extends imports.aws.GlueCrawlerS3Target> s3Target, final java.lang.String schedule, final java.util.List<? extends imports.aws.GlueCrawlerSchemaChangePolicy> schemaChangePolicy, final java.lang.String securityConfiguration, final java.lang.String tablePrefix, final java.util.Map<java.lang.String, java.lang.String> tags, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.databaseName = java.util.Objects.requireNonNull(databaseName, "databaseName is required");
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.role = java.util.Objects.requireNonNull(role, "role is required");
            this.catalogTarget = (java.util.List<imports.aws.GlueCrawlerCatalogTarget>)catalogTarget;
            this.classifiers = classifiers;
            this.configuration = configuration;
            this.description = description;
            this.dynamodbTarget = (java.util.List<imports.aws.GlueCrawlerDynamodbTarget>)dynamodbTarget;
            this.jdbcTarget = (java.util.List<imports.aws.GlueCrawlerJdbcTarget>)jdbcTarget;
            this.s3Target = (java.util.List<imports.aws.GlueCrawlerS3Target>)s3Target;
            this.schedule = schedule;
            this.schemaChangePolicy = (java.util.List<imports.aws.GlueCrawlerSchemaChangePolicy>)schemaChangePolicy;
            this.securityConfiguration = securityConfiguration;
            this.tablePrefix = tablePrefix;
            this.tags = tags;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getDatabaseName() {
            return this.databaseName;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getRole() {
            return this.role;
        }

        @Override
        public final java.util.List<imports.aws.GlueCrawlerCatalogTarget> getCatalogTarget() {
            return this.catalogTarget;
        }

        @Override
        public final java.util.List<java.lang.String> getClassifiers() {
            return this.classifiers;
        }

        @Override
        public final java.lang.String getConfiguration() {
            return this.configuration;
        }

        @Override
        public final java.lang.String getDescription() {
            return this.description;
        }

        @Override
        public final java.util.List<imports.aws.GlueCrawlerDynamodbTarget> getDynamodbTarget() {
            return this.dynamodbTarget;
        }

        @Override
        public final java.util.List<imports.aws.GlueCrawlerJdbcTarget> getJdbcTarget() {
            return this.jdbcTarget;
        }

        @Override
        public final java.util.List<imports.aws.GlueCrawlerS3Target> getS3Target() {
            return this.s3Target;
        }

        @Override
        public final java.lang.String getSchedule() {
            return this.schedule;
        }

        @Override
        public final java.util.List<imports.aws.GlueCrawlerSchemaChangePolicy> getSchemaChangePolicy() {
            return this.schemaChangePolicy;
        }

        @Override
        public final java.lang.String getSecurityConfiguration() {
            return this.securityConfiguration;
        }

        @Override
        public final java.lang.String getTablePrefix() {
            return this.tablePrefix;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
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

            data.set("databaseName", om.valueToTree(this.getDatabaseName()));
            data.set("name", om.valueToTree(this.getName()));
            data.set("role", om.valueToTree(this.getRole()));
            if (this.getCatalogTarget() != null) {
                data.set("catalogTarget", om.valueToTree(this.getCatalogTarget()));
            }
            if (this.getClassifiers() != null) {
                data.set("classifiers", om.valueToTree(this.getClassifiers()));
            }
            if (this.getConfiguration() != null) {
                data.set("configuration", om.valueToTree(this.getConfiguration()));
            }
            if (this.getDescription() != null) {
                data.set("description", om.valueToTree(this.getDescription()));
            }
            if (this.getDynamodbTarget() != null) {
                data.set("dynamodbTarget", om.valueToTree(this.getDynamodbTarget()));
            }
            if (this.getJdbcTarget() != null) {
                data.set("jdbcTarget", om.valueToTree(this.getJdbcTarget()));
            }
            if (this.getS3Target() != null) {
                data.set("s3Target", om.valueToTree(this.getS3Target()));
            }
            if (this.getSchedule() != null) {
                data.set("schedule", om.valueToTree(this.getSchedule()));
            }
            if (this.getSchemaChangePolicy() != null) {
                data.set("schemaChangePolicy", om.valueToTree(this.getSchemaChangePolicy()));
            }
            if (this.getSecurityConfiguration() != null) {
                data.set("securityConfiguration", om.valueToTree(this.getSecurityConfiguration()));
            }
            if (this.getTablePrefix() != null) {
                data.set("tablePrefix", om.valueToTree(this.getTablePrefix()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
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
            struct.set("fqn", om.valueToTree("aws.GlueCrawlerConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            GlueCrawlerConfig.Jsii$Proxy that = (GlueCrawlerConfig.Jsii$Proxy) o;

            if (!databaseName.equals(that.databaseName)) return false;
            if (!name.equals(that.name)) return false;
            if (!role.equals(that.role)) return false;
            if (this.catalogTarget != null ? !this.catalogTarget.equals(that.catalogTarget) : that.catalogTarget != null) return false;
            if (this.classifiers != null ? !this.classifiers.equals(that.classifiers) : that.classifiers != null) return false;
            if (this.configuration != null ? !this.configuration.equals(that.configuration) : that.configuration != null) return false;
            if (this.description != null ? !this.description.equals(that.description) : that.description != null) return false;
            if (this.dynamodbTarget != null ? !this.dynamodbTarget.equals(that.dynamodbTarget) : that.dynamodbTarget != null) return false;
            if (this.jdbcTarget != null ? !this.jdbcTarget.equals(that.jdbcTarget) : that.jdbcTarget != null) return false;
            if (this.s3Target != null ? !this.s3Target.equals(that.s3Target) : that.s3Target != null) return false;
            if (this.schedule != null ? !this.schedule.equals(that.schedule) : that.schedule != null) return false;
            if (this.schemaChangePolicy != null ? !this.schemaChangePolicy.equals(that.schemaChangePolicy) : that.schemaChangePolicy != null) return false;
            if (this.securityConfiguration != null ? !this.securityConfiguration.equals(that.securityConfiguration) : that.securityConfiguration != null) return false;
            if (this.tablePrefix != null ? !this.tablePrefix.equals(that.tablePrefix) : that.tablePrefix != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.databaseName.hashCode();
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.role.hashCode());
            result = 31 * result + (this.catalogTarget != null ? this.catalogTarget.hashCode() : 0);
            result = 31 * result + (this.classifiers != null ? this.classifiers.hashCode() : 0);
            result = 31 * result + (this.configuration != null ? this.configuration.hashCode() : 0);
            result = 31 * result + (this.description != null ? this.description.hashCode() : 0);
            result = 31 * result + (this.dynamodbTarget != null ? this.dynamodbTarget.hashCode() : 0);
            result = 31 * result + (this.jdbcTarget != null ? this.jdbcTarget.hashCode() : 0);
            result = 31 * result + (this.s3Target != null ? this.s3Target.hashCode() : 0);
            result = 31 * result + (this.schedule != null ? this.schedule.hashCode() : 0);
            result = 31 * result + (this.schemaChangePolicy != null ? this.schemaChangePolicy.hashCode() : 0);
            result = 31 * result + (this.securityConfiguration != null ? this.securityConfiguration.hashCode() : 0);
            result = 31 * result + (this.tablePrefix != null ? this.tablePrefix.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
