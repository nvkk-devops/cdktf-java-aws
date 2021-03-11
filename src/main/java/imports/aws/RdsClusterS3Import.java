package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.804Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.RdsClusterS3Import")
@software.amazon.jsii.Jsii.Proxy(RdsClusterS3Import.Jsii$Proxy.class)
public interface RdsClusterS3Import extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getBucketName();

    @org.jetbrains.annotations.NotNull java.lang.String getIngestionRole();

    @org.jetbrains.annotations.NotNull java.lang.String getSourceEngine();

    @org.jetbrains.annotations.NotNull java.lang.String getSourceEngineVersion();

    default @org.jetbrains.annotations.Nullable java.lang.String getBucketPrefix() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link RdsClusterS3Import}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link RdsClusterS3Import}
     */
    public static final class Builder implements software.amazon.jsii.Builder<RdsClusterS3Import> {
        private java.lang.String bucketName;
        private java.lang.String ingestionRole;
        private java.lang.String sourceEngine;
        private java.lang.String sourceEngineVersion;
        private java.lang.String bucketPrefix;

        /**
         * Sets the value of {@link RdsClusterS3Import#getBucketName}
         * @param bucketName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder bucketName(java.lang.String bucketName) {
            this.bucketName = bucketName;
            return this;
        }

        /**
         * Sets the value of {@link RdsClusterS3Import#getIngestionRole}
         * @param ingestionRole the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder ingestionRole(java.lang.String ingestionRole) {
            this.ingestionRole = ingestionRole;
            return this;
        }

        /**
         * Sets the value of {@link RdsClusterS3Import#getSourceEngine}
         * @param sourceEngine the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder sourceEngine(java.lang.String sourceEngine) {
            this.sourceEngine = sourceEngine;
            return this;
        }

        /**
         * Sets the value of {@link RdsClusterS3Import#getSourceEngineVersion}
         * @param sourceEngineVersion the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder sourceEngineVersion(java.lang.String sourceEngineVersion) {
            this.sourceEngineVersion = sourceEngineVersion;
            return this;
        }

        /**
         * Sets the value of {@link RdsClusterS3Import#getBucketPrefix}
         * @param bucketPrefix the value to be set.
         * @return {@code this}
         */
        public Builder bucketPrefix(java.lang.String bucketPrefix) {
            this.bucketPrefix = bucketPrefix;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link RdsClusterS3Import}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public RdsClusterS3Import build() {
            return new Jsii$Proxy(bucketName, ingestionRole, sourceEngine, sourceEngineVersion, bucketPrefix);
        }
    }

    /**
     * An implementation for {@link RdsClusterS3Import}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements RdsClusterS3Import {
        private final java.lang.String bucketName;
        private final java.lang.String ingestionRole;
        private final java.lang.String sourceEngine;
        private final java.lang.String sourceEngineVersion;
        private final java.lang.String bucketPrefix;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.bucketName = software.amazon.jsii.Kernel.get(this, "bucketName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.ingestionRole = software.amazon.jsii.Kernel.get(this, "ingestionRole", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.sourceEngine = software.amazon.jsii.Kernel.get(this, "sourceEngine", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.sourceEngineVersion = software.amazon.jsii.Kernel.get(this, "sourceEngineVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.bucketPrefix = software.amazon.jsii.Kernel.get(this, "bucketPrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String bucketName, final java.lang.String ingestionRole, final java.lang.String sourceEngine, final java.lang.String sourceEngineVersion, final java.lang.String bucketPrefix) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.bucketName = java.util.Objects.requireNonNull(bucketName, "bucketName is required");
            this.ingestionRole = java.util.Objects.requireNonNull(ingestionRole, "ingestionRole is required");
            this.sourceEngine = java.util.Objects.requireNonNull(sourceEngine, "sourceEngine is required");
            this.sourceEngineVersion = java.util.Objects.requireNonNull(sourceEngineVersion, "sourceEngineVersion is required");
            this.bucketPrefix = bucketPrefix;
        }

        @Override
        public final java.lang.String getBucketName() {
            return this.bucketName;
        }

        @Override
        public final java.lang.String getIngestionRole() {
            return this.ingestionRole;
        }

        @Override
        public final java.lang.String getSourceEngine() {
            return this.sourceEngine;
        }

        @Override
        public final java.lang.String getSourceEngineVersion() {
            return this.sourceEngineVersion;
        }

        @Override
        public final java.lang.String getBucketPrefix() {
            return this.bucketPrefix;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("bucketName", om.valueToTree(this.getBucketName()));
            data.set("ingestionRole", om.valueToTree(this.getIngestionRole()));
            data.set("sourceEngine", om.valueToTree(this.getSourceEngine()));
            data.set("sourceEngineVersion", om.valueToTree(this.getSourceEngineVersion()));
            if (this.getBucketPrefix() != null) {
                data.set("bucketPrefix", om.valueToTree(this.getBucketPrefix()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.RdsClusterS3Import"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            RdsClusterS3Import.Jsii$Proxy that = (RdsClusterS3Import.Jsii$Proxy) o;

            if (!bucketName.equals(that.bucketName)) return false;
            if (!ingestionRole.equals(that.ingestionRole)) return false;
            if (!sourceEngine.equals(that.sourceEngine)) return false;
            if (!sourceEngineVersion.equals(that.sourceEngineVersion)) return false;
            return this.bucketPrefix != null ? this.bucketPrefix.equals(that.bucketPrefix) : that.bucketPrefix == null;
        }

        @Override
        public final int hashCode() {
            int result = this.bucketName.hashCode();
            result = 31 * result + (this.ingestionRole.hashCode());
            result = 31 * result + (this.sourceEngine.hashCode());
            result = 31 * result + (this.sourceEngineVersion.hashCode());
            result = 31 * result + (this.bucketPrefix != null ? this.bucketPrefix.hashCode() : 0);
            return result;
        }
    }
}
