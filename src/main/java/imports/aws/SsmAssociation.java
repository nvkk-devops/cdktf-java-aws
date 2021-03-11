package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.891Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.SsmAssociation")
public class SsmAssociation extends com.hashicorp.cdktf.TerraformResource {

    protected SsmAssociation(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SsmAssociation(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public SsmAssociation(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.SsmAssociationConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetAssociationName() {
        software.amazon.jsii.Kernel.call(this, "resetAssociationName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAutomationTargetParameterName() {
        software.amazon.jsii.Kernel.call(this, "resetAutomationTargetParameterName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetComplianceSeverity() {
        software.amazon.jsii.Kernel.call(this, "resetComplianceSeverity", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDocumentVersion() {
        software.amazon.jsii.Kernel.call(this, "resetDocumentVersion", software.amazon.jsii.NativeType.VOID);
    }

    public void resetInstanceId() {
        software.amazon.jsii.Kernel.call(this, "resetInstanceId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMaxConcurrency() {
        software.amazon.jsii.Kernel.call(this, "resetMaxConcurrency", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMaxErrors() {
        software.amazon.jsii.Kernel.call(this, "resetMaxErrors", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOutputLocation() {
        software.amazon.jsii.Kernel.call(this, "resetOutputLocation", software.amazon.jsii.NativeType.VOID);
    }

    public void resetParameters() {
        software.amazon.jsii.Kernel.call(this, "resetParameters", software.amazon.jsii.NativeType.VOID);
    }

    public void resetScheduleExpression() {
        software.amazon.jsii.Kernel.call(this, "resetScheduleExpression", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTargets() {
        software.amazon.jsii.Kernel.call(this, "resetTargets", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAssociationId() {
        return software.amazon.jsii.Kernel.get(this, "associationId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAssociationNameInput() {
        return software.amazon.jsii.Kernel.get(this, "associationNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAutomationTargetParameterNameInput() {
        return software.amazon.jsii.Kernel.get(this, "automationTargetParameterNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getComplianceSeverityInput() {
        return software.amazon.jsii.Kernel.get(this, "complianceSeverityInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDocumentVersionInput() {
        return software.amazon.jsii.Kernel.get(this, "documentVersionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getInstanceIdInput() {
        return software.amazon.jsii.Kernel.get(this, "instanceIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getMaxConcurrencyInput() {
        return software.amazon.jsii.Kernel.get(this, "maxConcurrencyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getMaxErrorsInput() {
        return software.amazon.jsii.Kernel.get(this, "maxErrorsInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SsmAssociationOutputLocation> getOutputLocationInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.SsmAssociationOutputLocation>)(software.amazon.jsii.Kernel.get(this, "outputLocationInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SsmAssociationOutputLocation.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getParametersInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "parametersInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getScheduleExpressionInput() {
        return software.amazon.jsii.Kernel.get(this, "scheduleExpressionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SsmAssociationTargets> getTargetsInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.SsmAssociationTargets>)(software.amazon.jsii.Kernel.get(this, "targetsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SsmAssociationTargets.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAssociationName() {
        return software.amazon.jsii.Kernel.get(this, "associationName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAssociationName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "associationName", java.util.Objects.requireNonNull(value, "associationName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAutomationTargetParameterName() {
        return software.amazon.jsii.Kernel.get(this, "automationTargetParameterName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAutomationTargetParameterName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "automationTargetParameterName", java.util.Objects.requireNonNull(value, "automationTargetParameterName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getComplianceSeverity() {
        return software.amazon.jsii.Kernel.get(this, "complianceSeverity", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setComplianceSeverity(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "complianceSeverity", java.util.Objects.requireNonNull(value, "complianceSeverity is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDocumentVersion() {
        return software.amazon.jsii.Kernel.get(this, "documentVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDocumentVersion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "documentVersion", java.util.Objects.requireNonNull(value, "documentVersion is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getInstanceId() {
        return software.amazon.jsii.Kernel.get(this, "instanceId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setInstanceId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "instanceId", java.util.Objects.requireNonNull(value, "instanceId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getMaxConcurrency() {
        return software.amazon.jsii.Kernel.get(this, "maxConcurrency", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setMaxConcurrency(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "maxConcurrency", java.util.Objects.requireNonNull(value, "maxConcurrency is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getMaxErrors() {
        return software.amazon.jsii.Kernel.get(this, "maxErrors", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setMaxErrors(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "maxErrors", java.util.Objects.requireNonNull(value, "maxErrors is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.SsmAssociationOutputLocation> getOutputLocation() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "outputLocation", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SsmAssociationOutputLocation.class))));
    }

    public void setOutputLocation(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.SsmAssociationOutputLocation> value) {
        software.amazon.jsii.Kernel.set(this, "outputLocation", java.util.Objects.requireNonNull(value, "outputLocation is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getParameters() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "parameters", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setParameters(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "parameters", java.util.Objects.requireNonNull(value, "parameters is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getScheduleExpression() {
        return software.amazon.jsii.Kernel.get(this, "scheduleExpression", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setScheduleExpression(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "scheduleExpression", java.util.Objects.requireNonNull(value, "scheduleExpression is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.SsmAssociationTargets> getTargets() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "targets", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SsmAssociationTargets.class))));
    }

    public void setTargets(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.SsmAssociationTargets> value) {
        software.amazon.jsii.Kernel.set(this, "targets", java.util.Objects.requireNonNull(value, "targets is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.SsmAssociation}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.SsmAssociation> {
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
        private final imports.aws.SsmAssociationConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.SsmAssociationConfig.Builder();
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
         * @param name This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * @return {@code this}
         * @param associationName This parameter is required.
         */
        public Builder associationName(final java.lang.String associationName) {
            this.config.associationName(associationName);
            return this;
        }

        /**
         * @return {@code this}
         * @param automationTargetParameterName This parameter is required.
         */
        public Builder automationTargetParameterName(final java.lang.String automationTargetParameterName) {
            this.config.automationTargetParameterName(automationTargetParameterName);
            return this;
        }

        /**
         * @return {@code this}
         * @param complianceSeverity This parameter is required.
         */
        public Builder complianceSeverity(final java.lang.String complianceSeverity) {
            this.config.complianceSeverity(complianceSeverity);
            return this;
        }

        /**
         * @return {@code this}
         * @param documentVersion This parameter is required.
         */
        public Builder documentVersion(final java.lang.String documentVersion) {
            this.config.documentVersion(documentVersion);
            return this;
        }

        /**
         * @return {@code this}
         * @param instanceId This parameter is required.
         */
        public Builder instanceId(final java.lang.String instanceId) {
            this.config.instanceId(instanceId);
            return this;
        }

        /**
         * @return {@code this}
         * @param maxConcurrency This parameter is required.
         */
        public Builder maxConcurrency(final java.lang.String maxConcurrency) {
            this.config.maxConcurrency(maxConcurrency);
            return this;
        }

        /**
         * @return {@code this}
         * @param maxErrors This parameter is required.
         */
        public Builder maxErrors(final java.lang.String maxErrors) {
            this.config.maxErrors(maxErrors);
            return this;
        }

        /**
         * output_location block.
         * <p>
         * @return {@code this}
         * @param outputLocation output_location block. This parameter is required.
         */
        public Builder outputLocation(final java.util.List<? extends imports.aws.SsmAssociationOutputLocation> outputLocation) {
            this.config.outputLocation(outputLocation);
            return this;
        }

        /**
         * @return {@code this}
         * @param parameters This parameter is required.
         */
        public Builder parameters(final java.util.Map<java.lang.String, java.lang.String> parameters) {
            this.config.parameters(parameters);
            return this;
        }

        /**
         * @return {@code this}
         * @param scheduleExpression This parameter is required.
         */
        public Builder scheduleExpression(final java.lang.String scheduleExpression) {
            this.config.scheduleExpression(scheduleExpression);
            return this;
        }

        /**
         * targets block.
         * <p>
         * @return {@code this}
         * @param targets targets block. This parameter is required.
         */
        public Builder targets(final java.util.List<? extends imports.aws.SsmAssociationTargets> targets) {
            this.config.targets(targets);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.SsmAssociation}.
         */
        @Override
        public imports.aws.SsmAssociation build() {
            return new imports.aws.SsmAssociation(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
