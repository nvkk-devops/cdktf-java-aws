package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.860Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.SesDomainMailFrom")
public class SesDomainMailFrom extends com.hashicorp.cdktf.TerraformResource {

    protected SesDomainMailFrom(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SesDomainMailFrom(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public SesDomainMailFrom(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.SesDomainMailFromConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetBehaviorOnMxFailure() {
        software.amazon.jsii.Kernel.call(this, "resetBehaviorOnMxFailure", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDomainInput() {
        return software.amazon.jsii.Kernel.get(this, "domainInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getMailFromDomainInput() {
        return software.amazon.jsii.Kernel.get(this, "mailFromDomainInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getBehaviorOnMxFailureInput() {
        return software.amazon.jsii.Kernel.get(this, "behaviorOnMxFailureInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBehaviorOnMxFailure() {
        return software.amazon.jsii.Kernel.get(this, "behaviorOnMxFailure", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setBehaviorOnMxFailure(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "behaviorOnMxFailure", java.util.Objects.requireNonNull(value, "behaviorOnMxFailure is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDomain() {
        return software.amazon.jsii.Kernel.get(this, "domain", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDomain(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "domain", java.util.Objects.requireNonNull(value, "domain is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getMailFromDomain() {
        return software.amazon.jsii.Kernel.get(this, "mailFromDomain", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setMailFromDomain(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "mailFromDomain", java.util.Objects.requireNonNull(value, "mailFromDomain is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.SesDomainMailFrom}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.SesDomainMailFrom> {
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
        private final imports.aws.SesDomainMailFromConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.SesDomainMailFromConfig.Builder();
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
         * @param domain This parameter is required.
         */
        public Builder domain(final java.lang.String domain) {
            this.config.domain(domain);
            return this;
        }

        /**
         * @return {@code this}
         * @param mailFromDomain This parameter is required.
         */
        public Builder mailFromDomain(final java.lang.String mailFromDomain) {
            this.config.mailFromDomain(mailFromDomain);
            return this;
        }

        /**
         * @return {@code this}
         * @param behaviorOnMxFailure This parameter is required.
         */
        public Builder behaviorOnMxFailure(final java.lang.String behaviorOnMxFailure) {
            this.config.behaviorOnMxFailure(behaviorOnMxFailure);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.SesDomainMailFrom}.
         */
        @Override
        public imports.aws.SesDomainMailFrom build() {
            return new imports.aws.SesDomainMailFrom(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
