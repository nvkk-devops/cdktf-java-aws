package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.266Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.DataAwsDbClusterSnapshotConfig")
@software.amazon.jsii.Jsii.Proxy(DataAwsDbClusterSnapshotConfig.Jsii$Proxy.class)
public interface DataAwsDbClusterSnapshotConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    default @org.jetbrains.annotations.Nullable java.lang.String getDbClusterIdentifier() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDbClusterSnapshotIdentifier() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getIncludePublic() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getIncludeShared() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getMostRecent() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSnapshotType() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DataAwsDbClusterSnapshotConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DataAwsDbClusterSnapshotConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DataAwsDbClusterSnapshotConfig> {
        private java.lang.String dbClusterIdentifier;
        private java.lang.String dbClusterSnapshotIdentifier;
        private java.lang.Boolean includePublic;
        private java.lang.Boolean includeShared;
        private java.lang.Boolean mostRecent;
        private java.lang.String snapshotType;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link DataAwsDbClusterSnapshotConfig#getDbClusterIdentifier}
         * @param dbClusterIdentifier the value to be set.
         * @return {@code this}
         */
        public Builder dbClusterIdentifier(java.lang.String dbClusterIdentifier) {
            this.dbClusterIdentifier = dbClusterIdentifier;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsDbClusterSnapshotConfig#getDbClusterSnapshotIdentifier}
         * @param dbClusterSnapshotIdentifier the value to be set.
         * @return {@code this}
         */
        public Builder dbClusterSnapshotIdentifier(java.lang.String dbClusterSnapshotIdentifier) {
            this.dbClusterSnapshotIdentifier = dbClusterSnapshotIdentifier;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsDbClusterSnapshotConfig#getIncludePublic}
         * @param includePublic the value to be set.
         * @return {@code this}
         */
        public Builder includePublic(java.lang.Boolean includePublic) {
            this.includePublic = includePublic;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsDbClusterSnapshotConfig#getIncludeShared}
         * @param includeShared the value to be set.
         * @return {@code this}
         */
        public Builder includeShared(java.lang.Boolean includeShared) {
            this.includeShared = includeShared;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsDbClusterSnapshotConfig#getMostRecent}
         * @param mostRecent the value to be set.
         * @return {@code this}
         */
        public Builder mostRecent(java.lang.Boolean mostRecent) {
            this.mostRecent = mostRecent;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsDbClusterSnapshotConfig#getSnapshotType}
         * @param snapshotType the value to be set.
         * @return {@code this}
         */
        public Builder snapshotType(java.lang.String snapshotType) {
            this.snapshotType = snapshotType;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsDbClusterSnapshotConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsDbClusterSnapshotConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsDbClusterSnapshotConfig#getDependsOn}
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
         * Sets the value of {@link DataAwsDbClusterSnapshotConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsDbClusterSnapshotConfig#getProvider}
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
         * @return a new instance of {@link DataAwsDbClusterSnapshotConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DataAwsDbClusterSnapshotConfig build() {
            return new Jsii$Proxy(dbClusterIdentifier, dbClusterSnapshotIdentifier, includePublic, includeShared, mostRecent, snapshotType, tags, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link DataAwsDbClusterSnapshotConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DataAwsDbClusterSnapshotConfig {
        private final java.lang.String dbClusterIdentifier;
        private final java.lang.String dbClusterSnapshotIdentifier;
        private final java.lang.Boolean includePublic;
        private final java.lang.Boolean includeShared;
        private final java.lang.Boolean mostRecent;
        private final java.lang.String snapshotType;
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
            this.dbClusterIdentifier = software.amazon.jsii.Kernel.get(this, "dbClusterIdentifier", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.dbClusterSnapshotIdentifier = software.amazon.jsii.Kernel.get(this, "dbClusterSnapshotIdentifier", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.includePublic = software.amazon.jsii.Kernel.get(this, "includePublic", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.includeShared = software.amazon.jsii.Kernel.get(this, "includeShared", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.mostRecent = software.amazon.jsii.Kernel.get(this, "mostRecent", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.snapshotType = software.amazon.jsii.Kernel.get(this, "snapshotType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
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
        protected Jsii$Proxy(final java.lang.String dbClusterIdentifier, final java.lang.String dbClusterSnapshotIdentifier, final java.lang.Boolean includePublic, final java.lang.Boolean includeShared, final java.lang.Boolean mostRecent, final java.lang.String snapshotType, final java.util.Map<java.lang.String, java.lang.String> tags, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.dbClusterIdentifier = dbClusterIdentifier;
            this.dbClusterSnapshotIdentifier = dbClusterSnapshotIdentifier;
            this.includePublic = includePublic;
            this.includeShared = includeShared;
            this.mostRecent = mostRecent;
            this.snapshotType = snapshotType;
            this.tags = tags;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getDbClusterIdentifier() {
            return this.dbClusterIdentifier;
        }

        @Override
        public final java.lang.String getDbClusterSnapshotIdentifier() {
            return this.dbClusterSnapshotIdentifier;
        }

        @Override
        public final java.lang.Boolean getIncludePublic() {
            return this.includePublic;
        }

        @Override
        public final java.lang.Boolean getIncludeShared() {
            return this.includeShared;
        }

        @Override
        public final java.lang.Boolean getMostRecent() {
            return this.mostRecent;
        }

        @Override
        public final java.lang.String getSnapshotType() {
            return this.snapshotType;
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

            if (this.getDbClusterIdentifier() != null) {
                data.set("dbClusterIdentifier", om.valueToTree(this.getDbClusterIdentifier()));
            }
            if (this.getDbClusterSnapshotIdentifier() != null) {
                data.set("dbClusterSnapshotIdentifier", om.valueToTree(this.getDbClusterSnapshotIdentifier()));
            }
            if (this.getIncludePublic() != null) {
                data.set("includePublic", om.valueToTree(this.getIncludePublic()));
            }
            if (this.getIncludeShared() != null) {
                data.set("includeShared", om.valueToTree(this.getIncludeShared()));
            }
            if (this.getMostRecent() != null) {
                data.set("mostRecent", om.valueToTree(this.getMostRecent()));
            }
            if (this.getSnapshotType() != null) {
                data.set("snapshotType", om.valueToTree(this.getSnapshotType()));
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
            struct.set("fqn", om.valueToTree("aws.DataAwsDbClusterSnapshotConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DataAwsDbClusterSnapshotConfig.Jsii$Proxy that = (DataAwsDbClusterSnapshotConfig.Jsii$Proxy) o;

            if (this.dbClusterIdentifier != null ? !this.dbClusterIdentifier.equals(that.dbClusterIdentifier) : that.dbClusterIdentifier != null) return false;
            if (this.dbClusterSnapshotIdentifier != null ? !this.dbClusterSnapshotIdentifier.equals(that.dbClusterSnapshotIdentifier) : that.dbClusterSnapshotIdentifier != null) return false;
            if (this.includePublic != null ? !this.includePublic.equals(that.includePublic) : that.includePublic != null) return false;
            if (this.includeShared != null ? !this.includeShared.equals(that.includeShared) : that.includeShared != null) return false;
            if (this.mostRecent != null ? !this.mostRecent.equals(that.mostRecent) : that.mostRecent != null) return false;
            if (this.snapshotType != null ? !this.snapshotType.equals(that.snapshotType) : that.snapshotType != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.dbClusterIdentifier != null ? this.dbClusterIdentifier.hashCode() : 0;
            result = 31 * result + (this.dbClusterSnapshotIdentifier != null ? this.dbClusterSnapshotIdentifier.hashCode() : 0);
            result = 31 * result + (this.includePublic != null ? this.includePublic.hashCode() : 0);
            result = 31 * result + (this.includeShared != null ? this.includeShared.hashCode() : 0);
            result = 31 * result + (this.mostRecent != null ? this.mostRecent.hashCode() : 0);
            result = 31 * result + (this.snapshotType != null ? this.snapshotType.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
