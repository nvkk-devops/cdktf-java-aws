package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.169Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CodebuildProjectSource")
@software.amazon.jsii.Jsii.Proxy(CodebuildProjectSource.Jsii$Proxy.class)
public interface CodebuildProjectSource extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getType();

    /**
     * auth block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CodebuildProjectSourceAuth> getAuth() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getBuildspec() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getGitCloneDepth() {
        return null;
    }

    /**
     * git_submodules_config block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CodebuildProjectSourceGitSubmodulesConfig> getGitSubmodulesConfig() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getInsecureSsl() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getLocation() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getReportBuildStatus() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CodebuildProjectSource}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CodebuildProjectSource}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CodebuildProjectSource> {
        private java.lang.String type;
        private java.util.List<imports.aws.CodebuildProjectSourceAuth> auth;
        private java.lang.String buildspec;
        private java.lang.Number gitCloneDepth;
        private java.util.List<imports.aws.CodebuildProjectSourceGitSubmodulesConfig> gitSubmodulesConfig;
        private java.lang.Boolean insecureSsl;
        private java.lang.String location;
        private java.lang.Boolean reportBuildStatus;

        /**
         * Sets the value of {@link CodebuildProjectSource#getType}
         * @param type the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildProjectSource#getAuth}
         * @param auth auth block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder auth(java.util.List<? extends imports.aws.CodebuildProjectSourceAuth> auth) {
            this.auth = (java.util.List<imports.aws.CodebuildProjectSourceAuth>)auth;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildProjectSource#getBuildspec}
         * @param buildspec the value to be set.
         * @return {@code this}
         */
        public Builder buildspec(java.lang.String buildspec) {
            this.buildspec = buildspec;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildProjectSource#getGitCloneDepth}
         * @param gitCloneDepth the value to be set.
         * @return {@code this}
         */
        public Builder gitCloneDepth(java.lang.Number gitCloneDepth) {
            this.gitCloneDepth = gitCloneDepth;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildProjectSource#getGitSubmodulesConfig}
         * @param gitSubmodulesConfig git_submodules_config block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder gitSubmodulesConfig(java.util.List<? extends imports.aws.CodebuildProjectSourceGitSubmodulesConfig> gitSubmodulesConfig) {
            this.gitSubmodulesConfig = (java.util.List<imports.aws.CodebuildProjectSourceGitSubmodulesConfig>)gitSubmodulesConfig;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildProjectSource#getInsecureSsl}
         * @param insecureSsl the value to be set.
         * @return {@code this}
         */
        public Builder insecureSsl(java.lang.Boolean insecureSsl) {
            this.insecureSsl = insecureSsl;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildProjectSource#getLocation}
         * @param location the value to be set.
         * @return {@code this}
         */
        public Builder location(java.lang.String location) {
            this.location = location;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildProjectSource#getReportBuildStatus}
         * @param reportBuildStatus the value to be set.
         * @return {@code this}
         */
        public Builder reportBuildStatus(java.lang.Boolean reportBuildStatus) {
            this.reportBuildStatus = reportBuildStatus;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CodebuildProjectSource}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CodebuildProjectSource build() {
            return new Jsii$Proxy(type, auth, buildspec, gitCloneDepth, gitSubmodulesConfig, insecureSsl, location, reportBuildStatus);
        }
    }

    /**
     * An implementation for {@link CodebuildProjectSource}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CodebuildProjectSource {
        private final java.lang.String type;
        private final java.util.List<imports.aws.CodebuildProjectSourceAuth> auth;
        private final java.lang.String buildspec;
        private final java.lang.Number gitCloneDepth;
        private final java.util.List<imports.aws.CodebuildProjectSourceGitSubmodulesConfig> gitSubmodulesConfig;
        private final java.lang.Boolean insecureSsl;
        private final java.lang.String location;
        private final java.lang.Boolean reportBuildStatus;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.auth = software.amazon.jsii.Kernel.get(this, "auth", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodebuildProjectSourceAuth.class)));
            this.buildspec = software.amazon.jsii.Kernel.get(this, "buildspec", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.gitCloneDepth = software.amazon.jsii.Kernel.get(this, "gitCloneDepth", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.gitSubmodulesConfig = software.amazon.jsii.Kernel.get(this, "gitSubmodulesConfig", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodebuildProjectSourceGitSubmodulesConfig.class)));
            this.insecureSsl = software.amazon.jsii.Kernel.get(this, "insecureSsl", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.location = software.amazon.jsii.Kernel.get(this, "location", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.reportBuildStatus = software.amazon.jsii.Kernel.get(this, "reportBuildStatus", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String type, final java.util.List<? extends imports.aws.CodebuildProjectSourceAuth> auth, final java.lang.String buildspec, final java.lang.Number gitCloneDepth, final java.util.List<? extends imports.aws.CodebuildProjectSourceGitSubmodulesConfig> gitSubmodulesConfig, final java.lang.Boolean insecureSsl, final java.lang.String location, final java.lang.Boolean reportBuildStatus) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.type = java.util.Objects.requireNonNull(type, "type is required");
            this.auth = (java.util.List<imports.aws.CodebuildProjectSourceAuth>)auth;
            this.buildspec = buildspec;
            this.gitCloneDepth = gitCloneDepth;
            this.gitSubmodulesConfig = (java.util.List<imports.aws.CodebuildProjectSourceGitSubmodulesConfig>)gitSubmodulesConfig;
            this.insecureSsl = insecureSsl;
            this.location = location;
            this.reportBuildStatus = reportBuildStatus;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        public final java.util.List<imports.aws.CodebuildProjectSourceAuth> getAuth() {
            return this.auth;
        }

        @Override
        public final java.lang.String getBuildspec() {
            return this.buildspec;
        }

        @Override
        public final java.lang.Number getGitCloneDepth() {
            return this.gitCloneDepth;
        }

        @Override
        public final java.util.List<imports.aws.CodebuildProjectSourceGitSubmodulesConfig> getGitSubmodulesConfig() {
            return this.gitSubmodulesConfig;
        }

        @Override
        public final java.lang.Boolean getInsecureSsl() {
            return this.insecureSsl;
        }

        @Override
        public final java.lang.String getLocation() {
            return this.location;
        }

        @Override
        public final java.lang.Boolean getReportBuildStatus() {
            return this.reportBuildStatus;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("type", om.valueToTree(this.getType()));
            if (this.getAuth() != null) {
                data.set("auth", om.valueToTree(this.getAuth()));
            }
            if (this.getBuildspec() != null) {
                data.set("buildspec", om.valueToTree(this.getBuildspec()));
            }
            if (this.getGitCloneDepth() != null) {
                data.set("gitCloneDepth", om.valueToTree(this.getGitCloneDepth()));
            }
            if (this.getGitSubmodulesConfig() != null) {
                data.set("gitSubmodulesConfig", om.valueToTree(this.getGitSubmodulesConfig()));
            }
            if (this.getInsecureSsl() != null) {
                data.set("insecureSsl", om.valueToTree(this.getInsecureSsl()));
            }
            if (this.getLocation() != null) {
                data.set("location", om.valueToTree(this.getLocation()));
            }
            if (this.getReportBuildStatus() != null) {
                data.set("reportBuildStatus", om.valueToTree(this.getReportBuildStatus()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.CodebuildProjectSource"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CodebuildProjectSource.Jsii$Proxy that = (CodebuildProjectSource.Jsii$Proxy) o;

            if (!type.equals(that.type)) return false;
            if (this.auth != null ? !this.auth.equals(that.auth) : that.auth != null) return false;
            if (this.buildspec != null ? !this.buildspec.equals(that.buildspec) : that.buildspec != null) return false;
            if (this.gitCloneDepth != null ? !this.gitCloneDepth.equals(that.gitCloneDepth) : that.gitCloneDepth != null) return false;
            if (this.gitSubmodulesConfig != null ? !this.gitSubmodulesConfig.equals(that.gitSubmodulesConfig) : that.gitSubmodulesConfig != null) return false;
            if (this.insecureSsl != null ? !this.insecureSsl.equals(that.insecureSsl) : that.insecureSsl != null) return false;
            if (this.location != null ? !this.location.equals(that.location) : that.location != null) return false;
            return this.reportBuildStatus != null ? this.reportBuildStatus.equals(that.reportBuildStatus) : that.reportBuildStatus == null;
        }

        @Override
        public final int hashCode() {
            int result = this.type.hashCode();
            result = 31 * result + (this.auth != null ? this.auth.hashCode() : 0);
            result = 31 * result + (this.buildspec != null ? this.buildspec.hashCode() : 0);
            result = 31 * result + (this.gitCloneDepth != null ? this.gitCloneDepth.hashCode() : 0);
            result = 31 * result + (this.gitSubmodulesConfig != null ? this.gitSubmodulesConfig.hashCode() : 0);
            result = 31 * result + (this.insecureSsl != null ? this.insecureSsl.hashCode() : 0);
            result = 31 * result + (this.location != null ? this.location.hashCode() : 0);
            result = 31 * result + (this.reportBuildStatus != null ? this.reportBuildStatus.hashCode() : 0);
            return result;
        }
    }
}
