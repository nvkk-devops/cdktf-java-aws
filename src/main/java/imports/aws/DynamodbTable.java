package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.475Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.DynamodbTable")
public class DynamodbTable extends com.hashicorp.cdktf.TerraformResource {

    protected DynamodbTable(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DynamodbTable(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public DynamodbTable(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.DynamodbTableConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetBillingMode() {
        software.amazon.jsii.Kernel.call(this, "resetBillingMode", software.amazon.jsii.NativeType.VOID);
    }

    public void resetGlobalSecondaryIndex() {
        software.amazon.jsii.Kernel.call(this, "resetGlobalSecondaryIndex", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLocalSecondaryIndex() {
        software.amazon.jsii.Kernel.call(this, "resetLocalSecondaryIndex", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPointInTimeRecovery() {
        software.amazon.jsii.Kernel.call(this, "resetPointInTimeRecovery", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRangeKey() {
        software.amazon.jsii.Kernel.call(this, "resetRangeKey", software.amazon.jsii.NativeType.VOID);
    }

    public void resetReadCapacity() {
        software.amazon.jsii.Kernel.call(this, "resetReadCapacity", software.amazon.jsii.NativeType.VOID);
    }

    public void resetReplica() {
        software.amazon.jsii.Kernel.call(this, "resetReplica", software.amazon.jsii.NativeType.VOID);
    }

    public void resetServerSideEncryption() {
        software.amazon.jsii.Kernel.call(this, "resetServerSideEncryption", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStreamEnabled() {
        software.amazon.jsii.Kernel.call(this, "resetStreamEnabled", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStreamViewType() {
        software.amazon.jsii.Kernel.call(this, "resetStreamViewType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTimeouts() {
        software.amazon.jsii.Kernel.call(this, "resetTimeouts", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTtl() {
        software.amazon.jsii.Kernel.call(this, "resetTtl", software.amazon.jsii.NativeType.VOID);
    }

    public void resetWriteCapacity() {
        software.amazon.jsii.Kernel.call(this, "resetWriteCapacity", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.DynamodbTableAttribute> getAttributeInput() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "attributeInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DynamodbTableAttribute.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getHashKeyInput() {
        return software.amazon.jsii.Kernel.get(this, "hashKeyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStreamArn() {
        return software.amazon.jsii.Kernel.get(this, "streamArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStreamLabel() {
        return software.amazon.jsii.Kernel.get(this, "streamLabel", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getBillingModeInput() {
        return software.amazon.jsii.Kernel.get(this, "billingModeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.DynamodbTableGlobalSecondaryIndex> getGlobalSecondaryIndexInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.DynamodbTableGlobalSecondaryIndex>)(software.amazon.jsii.Kernel.get(this, "globalSecondaryIndexInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DynamodbTableGlobalSecondaryIndex.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.DynamodbTableLocalSecondaryIndex> getLocalSecondaryIndexInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.DynamodbTableLocalSecondaryIndex>)(software.amazon.jsii.Kernel.get(this, "localSecondaryIndexInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DynamodbTableLocalSecondaryIndex.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.DynamodbTablePointInTimeRecovery> getPointInTimeRecoveryInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.DynamodbTablePointInTimeRecovery>)(software.amazon.jsii.Kernel.get(this, "pointInTimeRecoveryInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DynamodbTablePointInTimeRecovery.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRangeKeyInput() {
        return software.amazon.jsii.Kernel.get(this, "rangeKeyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getReadCapacityInput() {
        return software.amazon.jsii.Kernel.get(this, "readCapacityInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.DynamodbTableReplica> getReplicaInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.DynamodbTableReplica>)(software.amazon.jsii.Kernel.get(this, "replicaInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DynamodbTableReplica.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.DynamodbTableServerSideEncryption> getServerSideEncryptionInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.DynamodbTableServerSideEncryption>)(software.amazon.jsii.Kernel.get(this, "serverSideEncryptionInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DynamodbTableServerSideEncryption.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getStreamEnabledInput() {
        return software.amazon.jsii.Kernel.get(this, "streamEnabledInput", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getStreamViewTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "streamViewTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable imports.aws.DynamodbTableTimeouts getTimeoutsInput() {
        return software.amazon.jsii.Kernel.get(this, "timeoutsInput", software.amazon.jsii.NativeType.forClass(imports.aws.DynamodbTableTimeouts.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.DynamodbTableTtl> getTtlInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.DynamodbTableTtl>)(software.amazon.jsii.Kernel.get(this, "ttlInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DynamodbTableTtl.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getWriteCapacityInput() {
        return software.amazon.jsii.Kernel.get(this, "writeCapacityInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.DynamodbTableAttribute> getAttribute() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "attribute", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DynamodbTableAttribute.class))));
    }

    public void setAttribute(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.DynamodbTableAttribute> value) {
        software.amazon.jsii.Kernel.set(this, "attribute", java.util.Objects.requireNonNull(value, "attribute is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBillingMode() {
        return software.amazon.jsii.Kernel.get(this, "billingMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setBillingMode(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "billingMode", java.util.Objects.requireNonNull(value, "billingMode is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.DynamodbTableGlobalSecondaryIndex> getGlobalSecondaryIndex() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "globalSecondaryIndex", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DynamodbTableGlobalSecondaryIndex.class))));
    }

    public void setGlobalSecondaryIndex(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.DynamodbTableGlobalSecondaryIndex> value) {
        software.amazon.jsii.Kernel.set(this, "globalSecondaryIndex", java.util.Objects.requireNonNull(value, "globalSecondaryIndex is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getHashKey() {
        return software.amazon.jsii.Kernel.get(this, "hashKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setHashKey(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "hashKey", java.util.Objects.requireNonNull(value, "hashKey is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.DynamodbTableLocalSecondaryIndex> getLocalSecondaryIndex() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "localSecondaryIndex", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DynamodbTableLocalSecondaryIndex.class))));
    }

    public void setLocalSecondaryIndex(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.DynamodbTableLocalSecondaryIndex> value) {
        software.amazon.jsii.Kernel.set(this, "localSecondaryIndex", java.util.Objects.requireNonNull(value, "localSecondaryIndex is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.DynamodbTablePointInTimeRecovery> getPointInTimeRecovery() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "pointInTimeRecovery", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DynamodbTablePointInTimeRecovery.class))));
    }

    public void setPointInTimeRecovery(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.DynamodbTablePointInTimeRecovery> value) {
        software.amazon.jsii.Kernel.set(this, "pointInTimeRecovery", java.util.Objects.requireNonNull(value, "pointInTimeRecovery is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRangeKey() {
        return software.amazon.jsii.Kernel.get(this, "rangeKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRangeKey(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "rangeKey", java.util.Objects.requireNonNull(value, "rangeKey is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getReadCapacity() {
        return software.amazon.jsii.Kernel.get(this, "readCapacity", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setReadCapacity(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "readCapacity", java.util.Objects.requireNonNull(value, "readCapacity is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.DynamodbTableReplica> getReplica() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "replica", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DynamodbTableReplica.class))));
    }

    public void setReplica(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.DynamodbTableReplica> value) {
        software.amazon.jsii.Kernel.set(this, "replica", java.util.Objects.requireNonNull(value, "replica is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.DynamodbTableServerSideEncryption> getServerSideEncryption() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "serverSideEncryption", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DynamodbTableServerSideEncryption.class))));
    }

    public void setServerSideEncryption(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.DynamodbTableServerSideEncryption> value) {
        software.amazon.jsii.Kernel.set(this, "serverSideEncryption", java.util.Objects.requireNonNull(value, "serverSideEncryption is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Boolean getStreamEnabled() {
        return software.amazon.jsii.Kernel.get(this, "streamEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setStreamEnabled(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "streamEnabled", java.util.Objects.requireNonNull(value, "streamEnabled is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStreamViewType() {
        return software.amazon.jsii.Kernel.get(this, "streamViewType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setStreamViewType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "streamViewType", java.util.Objects.requireNonNull(value, "streamViewType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.DynamodbTableTimeouts getTimeouts() {
        return software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.DynamodbTableTimeouts.class));
    }

    public void setTimeouts(final @org.jetbrains.annotations.NotNull imports.aws.DynamodbTableTimeouts value) {
        software.amazon.jsii.Kernel.set(this, "timeouts", java.util.Objects.requireNonNull(value, "timeouts is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.DynamodbTableTtl> getTtl() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "ttl", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DynamodbTableTtl.class))));
    }

    public void setTtl(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.DynamodbTableTtl> value) {
        software.amazon.jsii.Kernel.set(this, "ttl", java.util.Objects.requireNonNull(value, "ttl is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getWriteCapacity() {
        return software.amazon.jsii.Kernel.get(this, "writeCapacity", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setWriteCapacity(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "writeCapacity", java.util.Objects.requireNonNull(value, "writeCapacity is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.DynamodbTable}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.DynamodbTable> {
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
        private final imports.aws.DynamodbTableConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.DynamodbTableConfig.Builder();
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
         * attribute block.
         * <p>
         * @return {@code this}
         * @param attribute attribute block. This parameter is required.
         */
        public Builder attribute(final java.util.List<? extends imports.aws.DynamodbTableAttribute> attribute) {
            this.config.attribute(attribute);
            return this;
        }

        /**
         * @return {@code this}
         * @param hashKey This parameter is required.
         */
        public Builder hashKey(final java.lang.String hashKey) {
            this.config.hashKey(hashKey);
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
         * @param billingMode This parameter is required.
         */
        public Builder billingMode(final java.lang.String billingMode) {
            this.config.billingMode(billingMode);
            return this;
        }

        /**
         * global_secondary_index block.
         * <p>
         * @return {@code this}
         * @param globalSecondaryIndex global_secondary_index block. This parameter is required.
         */
        public Builder globalSecondaryIndex(final java.util.List<? extends imports.aws.DynamodbTableGlobalSecondaryIndex> globalSecondaryIndex) {
            this.config.globalSecondaryIndex(globalSecondaryIndex);
            return this;
        }

        /**
         * local_secondary_index block.
         * <p>
         * @return {@code this}
         * @param localSecondaryIndex local_secondary_index block. This parameter is required.
         */
        public Builder localSecondaryIndex(final java.util.List<? extends imports.aws.DynamodbTableLocalSecondaryIndex> localSecondaryIndex) {
            this.config.localSecondaryIndex(localSecondaryIndex);
            return this;
        }

        /**
         * point_in_time_recovery block.
         * <p>
         * @return {@code this}
         * @param pointInTimeRecovery point_in_time_recovery block. This parameter is required.
         */
        public Builder pointInTimeRecovery(final java.util.List<? extends imports.aws.DynamodbTablePointInTimeRecovery> pointInTimeRecovery) {
            this.config.pointInTimeRecovery(pointInTimeRecovery);
            return this;
        }

        /**
         * @return {@code this}
         * @param rangeKey This parameter is required.
         */
        public Builder rangeKey(final java.lang.String rangeKey) {
            this.config.rangeKey(rangeKey);
            return this;
        }

        /**
         * @return {@code this}
         * @param readCapacity This parameter is required.
         */
        public Builder readCapacity(final java.lang.Number readCapacity) {
            this.config.readCapacity(readCapacity);
            return this;
        }

        /**
         * replica block.
         * <p>
         * @return {@code this}
         * @param replica replica block. This parameter is required.
         */
        public Builder replica(final java.util.List<? extends imports.aws.DynamodbTableReplica> replica) {
            this.config.replica(replica);
            return this;
        }

        /**
         * server_side_encryption block.
         * <p>
         * @return {@code this}
         * @param serverSideEncryption server_side_encryption block. This parameter is required.
         */
        public Builder serverSideEncryption(final java.util.List<? extends imports.aws.DynamodbTableServerSideEncryption> serverSideEncryption) {
            this.config.serverSideEncryption(serverSideEncryption);
            return this;
        }

        /**
         * @return {@code this}
         * @param streamEnabled This parameter is required.
         */
        public Builder streamEnabled(final java.lang.Boolean streamEnabled) {
            this.config.streamEnabled(streamEnabled);
            return this;
        }

        /**
         * @return {@code this}
         * @param streamViewType This parameter is required.
         */
        public Builder streamViewType(final java.lang.String streamViewType) {
            this.config.streamViewType(streamViewType);
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
         * timeouts block.
         * <p>
         * @return {@code this}
         * @param timeouts timeouts block. This parameter is required.
         */
        public Builder timeouts(final imports.aws.DynamodbTableTimeouts timeouts) {
            this.config.timeouts(timeouts);
            return this;
        }

        /**
         * ttl block.
         * <p>
         * @return {@code this}
         * @param ttl ttl block. This parameter is required.
         */
        public Builder ttl(final java.util.List<? extends imports.aws.DynamodbTableTtl> ttl) {
            this.config.ttl(ttl);
            return this;
        }

        /**
         * @return {@code this}
         * @param writeCapacity This parameter is required.
         */
        public Builder writeCapacity(final java.lang.Number writeCapacity) {
            this.config.writeCapacity(writeCapacity);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.DynamodbTable}.
         */
        @Override
        public imports.aws.DynamodbTable build() {
            return new imports.aws.DynamodbTable(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
