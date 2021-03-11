package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.592Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.GlueClassifier")
public class GlueClassifier extends com.hashicorp.cdktf.TerraformResource {

    protected GlueClassifier(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected GlueClassifier(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public GlueClassifier(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.GlueClassifierConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetCsvClassifier() {
        software.amazon.jsii.Kernel.call(this, "resetCsvClassifier", software.amazon.jsii.NativeType.VOID);
    }

    public void resetGrokClassifier() {
        software.amazon.jsii.Kernel.call(this, "resetGrokClassifier", software.amazon.jsii.NativeType.VOID);
    }

    public void resetJsonClassifier() {
        software.amazon.jsii.Kernel.call(this, "resetJsonClassifier", software.amazon.jsii.NativeType.VOID);
    }

    public void resetXmlClassifier() {
        software.amazon.jsii.Kernel.call(this, "resetXmlClassifier", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.GlueClassifierCsvClassifier> getCsvClassifierInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.GlueClassifierCsvClassifier>)(software.amazon.jsii.Kernel.get(this, "csvClassifierInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.GlueClassifierCsvClassifier.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.GlueClassifierGrokClassifier> getGrokClassifierInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.GlueClassifierGrokClassifier>)(software.amazon.jsii.Kernel.get(this, "grokClassifierInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.GlueClassifierGrokClassifier.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.GlueClassifierJsonClassifier> getJsonClassifierInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.GlueClassifierJsonClassifier>)(software.amazon.jsii.Kernel.get(this, "jsonClassifierInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.GlueClassifierJsonClassifier.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.GlueClassifierXmlClassifier> getXmlClassifierInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.GlueClassifierXmlClassifier>)(software.amazon.jsii.Kernel.get(this, "xmlClassifierInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.GlueClassifierXmlClassifier.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.GlueClassifierCsvClassifier> getCsvClassifier() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "csvClassifier", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.GlueClassifierCsvClassifier.class))));
    }

    public void setCsvClassifier(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.GlueClassifierCsvClassifier> value) {
        software.amazon.jsii.Kernel.set(this, "csvClassifier", java.util.Objects.requireNonNull(value, "csvClassifier is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.GlueClassifierGrokClassifier> getGrokClassifier() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "grokClassifier", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.GlueClassifierGrokClassifier.class))));
    }

    public void setGrokClassifier(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.GlueClassifierGrokClassifier> value) {
        software.amazon.jsii.Kernel.set(this, "grokClassifier", java.util.Objects.requireNonNull(value, "grokClassifier is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.GlueClassifierJsonClassifier> getJsonClassifier() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "jsonClassifier", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.GlueClassifierJsonClassifier.class))));
    }

    public void setJsonClassifier(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.GlueClassifierJsonClassifier> value) {
        software.amazon.jsii.Kernel.set(this, "jsonClassifier", java.util.Objects.requireNonNull(value, "jsonClassifier is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.GlueClassifierXmlClassifier> getXmlClassifier() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "xmlClassifier", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.GlueClassifierXmlClassifier.class))));
    }

    public void setXmlClassifier(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.GlueClassifierXmlClassifier> value) {
        software.amazon.jsii.Kernel.set(this, "xmlClassifier", java.util.Objects.requireNonNull(value, "xmlClassifier is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.GlueClassifier}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.GlueClassifier> {
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
        private final imports.aws.GlueClassifierConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.GlueClassifierConfig.Builder();
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
         * csv_classifier block.
         * <p>
         * @return {@code this}
         * @param csvClassifier csv_classifier block. This parameter is required.
         */
        public Builder csvClassifier(final java.util.List<? extends imports.aws.GlueClassifierCsvClassifier> csvClassifier) {
            this.config.csvClassifier(csvClassifier);
            return this;
        }

        /**
         * grok_classifier block.
         * <p>
         * @return {@code this}
         * @param grokClassifier grok_classifier block. This parameter is required.
         */
        public Builder grokClassifier(final java.util.List<? extends imports.aws.GlueClassifierGrokClassifier> grokClassifier) {
            this.config.grokClassifier(grokClassifier);
            return this;
        }

        /**
         * json_classifier block.
         * <p>
         * @return {@code this}
         * @param jsonClassifier json_classifier block. This parameter is required.
         */
        public Builder jsonClassifier(final java.util.List<? extends imports.aws.GlueClassifierJsonClassifier> jsonClassifier) {
            this.config.jsonClassifier(jsonClassifier);
            return this;
        }

        /**
         * xml_classifier block.
         * <p>
         * @return {@code this}
         * @param xmlClassifier xml_classifier block. This parameter is required.
         */
        public Builder xmlClassifier(final java.util.List<? extends imports.aws.GlueClassifierXmlClassifier> xmlClassifier) {
            this.config.xmlClassifier(xmlClassifier);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.GlueClassifier}.
         */
        @Override
        public imports.aws.GlueClassifier build() {
            return new imports.aws.GlueClassifier(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
