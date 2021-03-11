package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.594Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.GlueCrawler")
public class GlueCrawler extends com.hashicorp.cdktf.TerraformResource {

    protected GlueCrawler(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected GlueCrawler(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public GlueCrawler(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.GlueCrawlerConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetCatalogTarget() {
        software.amazon.jsii.Kernel.call(this, "resetCatalogTarget", software.amazon.jsii.NativeType.VOID);
    }

    public void resetClassifiers() {
        software.amazon.jsii.Kernel.call(this, "resetClassifiers", software.amazon.jsii.NativeType.VOID);
    }

    public void resetConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDescription() {
        software.amazon.jsii.Kernel.call(this, "resetDescription", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDynamodbTarget() {
        software.amazon.jsii.Kernel.call(this, "resetDynamodbTarget", software.amazon.jsii.NativeType.VOID);
    }

    public void resetJdbcTarget() {
        software.amazon.jsii.Kernel.call(this, "resetJdbcTarget", software.amazon.jsii.NativeType.VOID);
    }

    public void resetS3Target() {
        software.amazon.jsii.Kernel.call(this, "resetS3Target", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSchedule() {
        software.amazon.jsii.Kernel.call(this, "resetSchedule", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSchemaChangePolicy() {
        software.amazon.jsii.Kernel.call(this, "resetSchemaChangePolicy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSecurityConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetSecurityConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTablePrefix() {
        software.amazon.jsii.Kernel.call(this, "resetTablePrefix", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDatabaseNameInput() {
        return software.amazon.jsii.Kernel.get(this, "databaseNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRoleInput() {
        return software.amazon.jsii.Kernel.get(this, "roleInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.GlueCrawlerCatalogTarget> getCatalogTargetInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.GlueCrawlerCatalogTarget>)(software.amazon.jsii.Kernel.get(this, "catalogTargetInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.GlueCrawlerCatalogTarget.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getClassifiersInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "classifiersInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "configurationInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDescriptionInput() {
        return software.amazon.jsii.Kernel.get(this, "descriptionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.GlueCrawlerDynamodbTarget> getDynamodbTargetInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.GlueCrawlerDynamodbTarget>)(software.amazon.jsii.Kernel.get(this, "dynamodbTargetInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.GlueCrawlerDynamodbTarget.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.GlueCrawlerJdbcTarget> getJdbcTargetInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.GlueCrawlerJdbcTarget>)(software.amazon.jsii.Kernel.get(this, "jdbcTargetInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.GlueCrawlerJdbcTarget.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.GlueCrawlerS3Target> getS3TargetInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.GlueCrawlerS3Target>)(software.amazon.jsii.Kernel.get(this, "s3TargetInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.GlueCrawlerS3Target.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getScheduleInput() {
        return software.amazon.jsii.Kernel.get(this, "scheduleInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.GlueCrawlerSchemaChangePolicy> getSchemaChangePolicyInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.GlueCrawlerSchemaChangePolicy>)(software.amazon.jsii.Kernel.get(this, "schemaChangePolicyInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.GlueCrawlerSchemaChangePolicy.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSecurityConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "securityConfigurationInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTablePrefixInput() {
        return software.amazon.jsii.Kernel.get(this, "tablePrefixInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.GlueCrawlerCatalogTarget> getCatalogTarget() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "catalogTarget", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.GlueCrawlerCatalogTarget.class))));
    }

    public void setCatalogTarget(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.GlueCrawlerCatalogTarget> value) {
        software.amazon.jsii.Kernel.set(this, "catalogTarget", java.util.Objects.requireNonNull(value, "catalogTarget is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getClassifiers() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "classifiers", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setClassifiers(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "classifiers", java.util.Objects.requireNonNull(value, "classifiers is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "configuration", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setConfiguration(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "configuration", java.util.Objects.requireNonNull(value, "configuration is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDatabaseName() {
        return software.amazon.jsii.Kernel.get(this, "databaseName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDatabaseName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "databaseName", java.util.Objects.requireNonNull(value, "databaseName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDescription() {
        return software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDescription(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "description", java.util.Objects.requireNonNull(value, "description is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.GlueCrawlerDynamodbTarget> getDynamodbTarget() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "dynamodbTarget", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.GlueCrawlerDynamodbTarget.class))));
    }

    public void setDynamodbTarget(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.GlueCrawlerDynamodbTarget> value) {
        software.amazon.jsii.Kernel.set(this, "dynamodbTarget", java.util.Objects.requireNonNull(value, "dynamodbTarget is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.GlueCrawlerJdbcTarget> getJdbcTarget() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "jdbcTarget", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.GlueCrawlerJdbcTarget.class))));
    }

    public void setJdbcTarget(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.GlueCrawlerJdbcTarget> value) {
        software.amazon.jsii.Kernel.set(this, "jdbcTarget", java.util.Objects.requireNonNull(value, "jdbcTarget is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRole() {
        return software.amazon.jsii.Kernel.get(this, "role", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRole(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "role", java.util.Objects.requireNonNull(value, "role is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.GlueCrawlerS3Target> getS3Target() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "s3Target", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.GlueCrawlerS3Target.class))));
    }

    public void setS3Target(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.GlueCrawlerS3Target> value) {
        software.amazon.jsii.Kernel.set(this, "s3Target", java.util.Objects.requireNonNull(value, "s3Target is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSchedule() {
        return software.amazon.jsii.Kernel.get(this, "schedule", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSchedule(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "schedule", java.util.Objects.requireNonNull(value, "schedule is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.GlueCrawlerSchemaChangePolicy> getSchemaChangePolicy() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "schemaChangePolicy", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.GlueCrawlerSchemaChangePolicy.class))));
    }

    public void setSchemaChangePolicy(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.GlueCrawlerSchemaChangePolicy> value) {
        software.amazon.jsii.Kernel.set(this, "schemaChangePolicy", java.util.Objects.requireNonNull(value, "schemaChangePolicy is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSecurityConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "securityConfiguration", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSecurityConfiguration(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "securityConfiguration", java.util.Objects.requireNonNull(value, "securityConfiguration is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTablePrefix() {
        return software.amazon.jsii.Kernel.get(this, "tablePrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTablePrefix(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "tablePrefix", java.util.Objects.requireNonNull(value, "tablePrefix is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.GlueCrawler}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.GlueCrawler> {
        /**
         * @return a new instance of {@link Builder}.
         * @param scope This parameter is required.
         * @param id This parameter is required.
         */
        public static Builder create(final software.constructs.Construct scope, final java.lang.String id) {
            return new Builder(scope, id);
        }

        private final software.constructs.Construct scope;
        private final java.lang.String id;
        private final imports.aws.GlueCrawlerConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.GlueCrawlerConfig.Builder();
        }

        /**
         * @return {@code this}
         * @param count This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(final java.lang.Number count) {
            this.config.count(count);
            return this;
        }

        /**
         * @return {@code this}
         * @param dependsOn This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder dependsOn(final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.config.dependsOn(dependsOn);
            return this;
        }

        /**
         * @return {@code this}
         * @param lifecycle This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.config.lifecycle(lifecycle);
            return this;
        }

        /**
         * @return {@code this}
         * @param provider This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(final com.hashicorp.cdktf.TerraformProvider provider) {
            this.config.provider(provider);
            return this;
        }

        /**
         * @return {@code this}
         * @param databaseName This parameter is required.
         */
        public Builder databaseName(final java.lang.String databaseName) {
            this.config.databaseName(databaseName);
            return this;
        }

        /**
         * @return {@code this}
         * @param name This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * @return {@code this}
         * @param role This parameter is required.
         */
        public Builder role(final java.lang.String role) {
            this.config.role(role);
            return this;
        }

        /**
         * catalog_target block.
         * <p>
         * @return {@code this}
         * @param catalogTarget catalog_target block. This parameter is required.
         */
        public Builder catalogTarget(final java.util.List<? extends imports.aws.GlueCrawlerCatalogTarget> catalogTarget) {
            this.config.catalogTarget(catalogTarget);
            return this;
        }

        /**
         * @return {@code this}
         * @param classifiers This parameter is required.
         */
        public Builder classifiers(final java.util.List<java.lang.String> classifiers) {
            this.config.classifiers(classifiers);
            return this;
        }

        /**
         * @return {@code this}
         * @param configuration This parameter is required.
         */
        public Builder configuration(final java.lang.String configuration) {
            this.config.configuration(configuration);
            return this;
        }

        /**
         * @return {@code this}
         * @param description This parameter is required.
         */
        public Builder description(final java.lang.String description) {
            this.config.description(description);
            return this;
        }

        /**
         * dynamodb_target block.
         * <p>
         * @return {@code this}
         * @param dynamodbTarget dynamodb_target block. This parameter is required.
         */
        public Builder dynamodbTarget(final java.util.List<? extends imports.aws.GlueCrawlerDynamodbTarget> dynamodbTarget) {
            this.config.dynamodbTarget(dynamodbTarget);
            return this;
        }

        /**
         * jdbc_target block.
         * <p>
         * @return {@code this}
         * @param jdbcTarget jdbc_target block. This parameter is required.
         */
        public Builder jdbcTarget(final java.util.List<? extends imports.aws.GlueCrawlerJdbcTarget> jdbcTarget) {
            this.config.jdbcTarget(jdbcTarget);
            return this;
        }

        /**
         * s3_target block.
         * <p>
         * @return {@code this}
         * @param s3Target s3_target block. This parameter is required.
         */
        public Builder s3Target(final java.util.List<? extends imports.aws.GlueCrawlerS3Target> s3Target) {
            this.config.s3Target(s3Target);
            return this;
        }

        /**
         * @return {@code this}
         * @param schedule This parameter is required.
         */
        public Builder schedule(final java.lang.String schedule) {
            this.config.schedule(schedule);
            return this;
        }

        /**
         * schema_change_policy block.
         * <p>
         * @return {@code this}
         * @param schemaChangePolicy schema_change_policy block. This parameter is required.
         */
        public Builder schemaChangePolicy(final java.util.List<? extends imports.aws.GlueCrawlerSchemaChangePolicy> schemaChangePolicy) {
            this.config.schemaChangePolicy(schemaChangePolicy);
            return this;
        }

        /**
         * @return {@code this}
         * @param securityConfiguration This parameter is required.
         */
        public Builder securityConfiguration(final java.lang.String securityConfiguration) {
            this.config.securityConfiguration(securityConfiguration);
            return this;
        }

        /**
         * @return {@code this}
         * @param tablePrefix This parameter is required.
         */
        public Builder tablePrefix(final java.lang.String tablePrefix) {
            this.config.tablePrefix(tablePrefix);
            return this;
        }

        /**
         * @return {@code this}
         * @param tags This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config.tags(tags);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.GlueCrawler}.
         */
        @Override
        public imports.aws.GlueCrawler build() {
            return new imports.aws.GlueCrawler(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
