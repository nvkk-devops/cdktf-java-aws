package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.447Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.DmsReplicationTaskConfig")
@software.amazon.jsii.Jsii.Proxy(DmsReplicationTaskConfig.Jsii$Proxy.class)
public interface DmsReplicationTaskConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getMigrationType();

    @org.jetbrains.annotations.NotNull java.lang.String getReplicationInstanceArn();

    @org.jetbrains.annotations.NotNull java.lang.String getReplicationTaskId();

    @org.jetbrains.annotations.NotNull java.lang.String getSourceEndpointArn();

    @org.jetbrains.annotations.NotNull java.lang.String getTableMappings();

    @org.jetbrains.annotations.NotNull java.lang.String getTargetEndpointArn();

    default @org.jetbrains.annotations.Nullable java.lang.String getCdcStartTime() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getReplicationTaskSettings() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DmsReplicationTaskConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DmsReplicationTaskConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DmsReplicationTaskConfig> {
        private java.lang.String migrationType;
        private java.lang.String replicationInstanceArn;
        private java.lang.String replicationTaskId;
        private java.lang.String sourceEndpointArn;
        private java.lang.String tableMappings;
        private java.lang.String targetEndpointArn;
        private java.lang.String cdcStartTime;
        private java.lang.String replicationTaskSettings;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link DmsReplicationTaskConfig#getMigrationType}
         * @param migrationType the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder migrationType(java.lang.String migrationType) {
            this.migrationType = migrationType;
            return this;
        }

        /**
         * Sets the value of {@link DmsReplicationTaskConfig#getReplicationInstanceArn}
         * @param replicationInstanceArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder replicationInstanceArn(java.lang.String replicationInstanceArn) {
            this.replicationInstanceArn = replicationInstanceArn;
            return this;
        }

        /**
         * Sets the value of {@link DmsReplicationTaskConfig#getReplicationTaskId}
         * @param replicationTaskId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder replicationTaskId(java.lang.String replicationTaskId) {
            this.replicationTaskId = replicationTaskId;
            return this;
        }

        /**
         * Sets the value of {@link DmsReplicationTaskConfig#getSourceEndpointArn}
         * @param sourceEndpointArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder sourceEndpointArn(java.lang.String sourceEndpointArn) {
            this.sourceEndpointArn = sourceEndpointArn;
            return this;
        }

        /**
         * Sets the value of {@link DmsReplicationTaskConfig#getTableMappings}
         * @param tableMappings the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder tableMappings(java.lang.String tableMappings) {
            this.tableMappings = tableMappings;
            return this;
        }

        /**
         * Sets the value of {@link DmsReplicationTaskConfig#getTargetEndpointArn}
         * @param targetEndpointArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder targetEndpointArn(java.lang.String targetEndpointArn) {
            this.targetEndpointArn = targetEndpointArn;
            return this;
        }

        /**
         * Sets the value of {@link DmsReplicationTaskConfig#getCdcStartTime}
         * @param cdcStartTime the value to be set.
         * @return {@code this}
         */
        public Builder cdcStartTime(java.lang.String cdcStartTime) {
            this.cdcStartTime = cdcStartTime;
            return this;
        }

        /**
         * Sets the value of {@link DmsReplicationTaskConfig#getReplicationTaskSettings}
         * @param replicationTaskSettings the value to be set.
         * @return {@code this}
         */
        public Builder replicationTaskSettings(java.lang.String replicationTaskSettings) {
            this.replicationTaskSettings = replicationTaskSettings;
            return this;
        }

        /**
         * Sets the value of {@link DmsReplicationTaskConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link DmsReplicationTaskConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link DmsReplicationTaskConfig#getDependsOn}
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
         * Sets the value of {@link DmsReplicationTaskConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link DmsReplicationTaskConfig#getProvider}
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
         * @return a new instance of {@link DmsReplicationTaskConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DmsReplicationTaskConfig build() {
            return new Jsii$Proxy(migrationType, replicationInstanceArn, replicationTaskId, sourceEndpointArn, tableMappings, targetEndpointArn, cdcStartTime, replicationTaskSettings, tags, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link DmsReplicationTaskConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DmsReplicationTaskConfig {
        private final java.lang.String migrationType;
        private final java.lang.String replicationInstanceArn;
        private final java.lang.String replicationTaskId;
        private final java.lang.String sourceEndpointArn;
        private final java.lang.String tableMappings;
        private final java.lang.String targetEndpointArn;
        private final java.lang.String cdcStartTime;
        private final java.lang.String replicationTaskSettings;
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
            this.migrationType = software.amazon.jsii.Kernel.get(this, "migrationType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.replicationInstanceArn = software.amazon.jsii.Kernel.get(this, "replicationInstanceArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.replicationTaskId = software.amazon.jsii.Kernel.get(this, "replicationTaskId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.sourceEndpointArn = software.amazon.jsii.Kernel.get(this, "sourceEndpointArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tableMappings = software.amazon.jsii.Kernel.get(this, "tableMappings", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.targetEndpointArn = software.amazon.jsii.Kernel.get(this, "targetEndpointArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.cdcStartTime = software.amazon.jsii.Kernel.get(this, "cdcStartTime", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.replicationTaskSettings = software.amazon.jsii.Kernel.get(this, "replicationTaskSettings", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
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
        protected Jsii$Proxy(final java.lang.String migrationType, final java.lang.String replicationInstanceArn, final java.lang.String replicationTaskId, final java.lang.String sourceEndpointArn, final java.lang.String tableMappings, final java.lang.String targetEndpointArn, final java.lang.String cdcStartTime, final java.lang.String replicationTaskSettings, final java.util.Map<java.lang.String, java.lang.String> tags, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.migrationType = java.util.Objects.requireNonNull(migrationType, "migrationType is required");
            this.replicationInstanceArn = java.util.Objects.requireNonNull(replicationInstanceArn, "replicationInstanceArn is required");
            this.replicationTaskId = java.util.Objects.requireNonNull(replicationTaskId, "replicationTaskId is required");
            this.sourceEndpointArn = java.util.Objects.requireNonNull(sourceEndpointArn, "sourceEndpointArn is required");
            this.tableMappings = java.util.Objects.requireNonNull(tableMappings, "tableMappings is required");
            this.targetEndpointArn = java.util.Objects.requireNonNull(targetEndpointArn, "targetEndpointArn is required");
            this.cdcStartTime = cdcStartTime;
            this.replicationTaskSettings = replicationTaskSettings;
            this.tags = tags;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getMigrationType() {
            return this.migrationType;
        }

        @Override
        public final java.lang.String getReplicationInstanceArn() {
            return this.replicationInstanceArn;
        }

        @Override
        public final java.lang.String getReplicationTaskId() {
            return this.replicationTaskId;
        }

        @Override
        public final java.lang.String getSourceEndpointArn() {
            return this.sourceEndpointArn;
        }

        @Override
        public final java.lang.String getTableMappings() {
            return this.tableMappings;
        }

        @Override
        public final java.lang.String getTargetEndpointArn() {
            return this.targetEndpointArn;
        }

        @Override
        public final java.lang.String getCdcStartTime() {
            return this.cdcStartTime;
        }

        @Override
        public final java.lang.String getReplicationTaskSettings() {
            return this.replicationTaskSettings;
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

            data.set("migrationType", om.valueToTree(this.getMigrationType()));
            data.set("replicationInstanceArn", om.valueToTree(this.getReplicationInstanceArn()));
            data.set("replicationTaskId", om.valueToTree(this.getReplicationTaskId()));
            data.set("sourceEndpointArn", om.valueToTree(this.getSourceEndpointArn()));
            data.set("tableMappings", om.valueToTree(this.getTableMappings()));
            data.set("targetEndpointArn", om.valueToTree(this.getTargetEndpointArn()));
            if (this.getCdcStartTime() != null) {
                data.set("cdcStartTime", om.valueToTree(this.getCdcStartTime()));
            }
            if (this.getReplicationTaskSettings() != null) {
                data.set("replicationTaskSettings", om.valueToTree(this.getReplicationTaskSettings()));
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
            struct.set("fqn", om.valueToTree("aws.DmsReplicationTaskConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DmsReplicationTaskConfig.Jsii$Proxy that = (DmsReplicationTaskConfig.Jsii$Proxy) o;

            if (!migrationType.equals(that.migrationType)) return false;
            if (!replicationInstanceArn.equals(that.replicationInstanceArn)) return false;
            if (!replicationTaskId.equals(that.replicationTaskId)) return false;
            if (!sourceEndpointArn.equals(that.sourceEndpointArn)) return false;
            if (!tableMappings.equals(that.tableMappings)) return false;
            if (!targetEndpointArn.equals(that.targetEndpointArn)) return false;
            if (this.cdcStartTime != null ? !this.cdcStartTime.equals(that.cdcStartTime) : that.cdcStartTime != null) return false;
            if (this.replicationTaskSettings != null ? !this.replicationTaskSettings.equals(that.replicationTaskSettings) : that.replicationTaskSettings != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.migrationType.hashCode();
            result = 31 * result + (this.replicationInstanceArn.hashCode());
            result = 31 * result + (this.replicationTaskId.hashCode());
            result = 31 * result + (this.sourceEndpointArn.hashCode());
            result = 31 * result + (this.tableMappings.hashCode());
            result = 31 * result + (this.targetEndpointArn.hashCode());
            result = 31 * result + (this.cdcStartTime != null ? this.cdcStartTime.hashCode() : 0);
            result = 31 * result + (this.replicationTaskSettings != null ? this.replicationTaskSettings.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
