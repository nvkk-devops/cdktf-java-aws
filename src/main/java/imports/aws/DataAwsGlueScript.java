package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.307Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.DataAwsGlueScript")
public class DataAwsGlueScript extends com.hashicorp.cdktf.TerraformDataSource {

    protected DataAwsGlueScript(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DataAwsGlueScript(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public DataAwsGlueScript(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.DataAwsGlueScriptConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetLanguage() {
        software.amazon.jsii.Kernel.call(this, "resetLanguage", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.DataAwsGlueScriptDagEdge> getDagEdgeInput() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "dagEdgeInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DataAwsGlueScriptDagEdge.class))));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.DataAwsGlueScriptDagNode> getDagNodeInput() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "dagNodeInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DataAwsGlueScriptDagNode.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPythonScript() {
        return software.amazon.jsii.Kernel.get(this, "pythonScript", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getScalaCode() {
        return software.amazon.jsii.Kernel.get(this, "scalaCode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getLanguageInput() {
        return software.amazon.jsii.Kernel.get(this, "languageInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.DataAwsGlueScriptDagEdge> getDagEdge() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "dagEdge", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DataAwsGlueScriptDagEdge.class))));
    }

    public void setDagEdge(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.DataAwsGlueScriptDagEdge> value) {
        software.amazon.jsii.Kernel.set(this, "dagEdge", java.util.Objects.requireNonNull(value, "dagEdge is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.DataAwsGlueScriptDagNode> getDagNode() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "dagNode", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DataAwsGlueScriptDagNode.class))));
    }

    public void setDagNode(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.DataAwsGlueScriptDagNode> value) {
        software.amazon.jsii.Kernel.set(this, "dagNode", java.util.Objects.requireNonNull(value, "dagNode is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLanguage() {
        return software.amazon.jsii.Kernel.get(this, "language", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLanguage(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "language", java.util.Objects.requireNonNull(value, "language is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.DataAwsGlueScript}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.DataAwsGlueScript> {
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
        private final imports.aws.DataAwsGlueScriptConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.DataAwsGlueScriptConfig.Builder();
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
         * dag_edge block.
         * <p>
         * @return {@code this}
         * @param dagEdge dag_edge block. This parameter is required.
         */
        public Builder dagEdge(final java.util.List<? extends imports.aws.DataAwsGlueScriptDagEdge> dagEdge) {
            this.config.dagEdge(dagEdge);
            return this;
        }

        /**
         * dag_node block.
         * <p>
         * @return {@code this}
         * @param dagNode dag_node block. This parameter is required.
         */
        public Builder dagNode(final java.util.List<? extends imports.aws.DataAwsGlueScriptDagNode> dagNode) {
            this.config.dagNode(dagNode);
            return this;
        }

        /**
         * @return {@code this}
         * @param language This parameter is required.
         */
        public Builder language(final java.lang.String language) {
            this.config.language(language);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.DataAwsGlueScript}.
         */
        @Override
        public imports.aws.DataAwsGlueScript build() {
            return new imports.aws.DataAwsGlueScript(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
