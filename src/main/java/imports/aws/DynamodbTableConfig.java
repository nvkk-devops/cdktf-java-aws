package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.476Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.DynamodbTableConfig")
@software.amazon.jsii.Jsii.Proxy(DynamodbTableConfig.Jsii$Proxy.class)
public interface DynamodbTableConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * attribute block.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.aws.DynamodbTableAttribute> getAttribute();

    @org.jetbrains.annotations.NotNull java.lang.String getHashKey();

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    default @org.jetbrains.annotations.Nullable java.lang.String getBillingMode() {
        return null;
    }

    /**
     * global_secondary_index block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.DynamodbTableGlobalSecondaryIndex> getGlobalSecondaryIndex() {
        return null;
    }

    /**
     * local_secondary_index block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.DynamodbTableLocalSecondaryIndex> getLocalSecondaryIndex() {
        return null;
    }

    /**
     * point_in_time_recovery block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.DynamodbTablePointInTimeRecovery> getPointInTimeRecovery() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getRangeKey() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getReadCapacity() {
        return null;
    }

    /**
     * replica block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.DynamodbTableReplica> getReplica() {
        return null;
    }

    /**
     * server_side_encryption block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.DynamodbTableServerSideEncryption> getServerSideEncryption() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getStreamEnabled() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getStreamViewType() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * timeouts block.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.DynamodbTableTimeouts getTimeouts() {
        return null;
    }

    /**
     * ttl block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.DynamodbTableTtl> getTtl() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getWriteCapacity() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DynamodbTableConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DynamodbTableConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DynamodbTableConfig> {
        private java.util.List<imports.aws.DynamodbTableAttribute> attribute;
        private java.lang.String hashKey;
        private java.lang.String name;
        private java.lang.String billingMode;
        private java.util.List<imports.aws.DynamodbTableGlobalSecondaryIndex> globalSecondaryIndex;
        private java.util.List<imports.aws.DynamodbTableLocalSecondaryIndex> localSecondaryIndex;
        private java.util.List<imports.aws.DynamodbTablePointInTimeRecovery> pointInTimeRecovery;
        private java.lang.String rangeKey;
        private java.lang.Number readCapacity;
        private java.util.List<imports.aws.DynamodbTableReplica> replica;
        private java.util.List<imports.aws.DynamodbTableServerSideEncryption> serverSideEncryption;
        private java.lang.Boolean streamEnabled;
        private java.lang.String streamViewType;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private imports.aws.DynamodbTableTimeouts timeouts;
        private java.util.List<imports.aws.DynamodbTableTtl> ttl;
        private java.lang.Number writeCapacity;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link DynamodbTableConfig#getAttribute}
         * @param attribute attribute block. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder attribute(java.util.List<? extends imports.aws.DynamodbTableAttribute> attribute) {
            this.attribute = (java.util.List<imports.aws.DynamodbTableAttribute>)attribute;
            return this;
        }

        /**
         * Sets the value of {@link DynamodbTableConfig#getHashKey}
         * @param hashKey the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder hashKey(java.lang.String hashKey) {
            this.hashKey = hashKey;
            return this;
        }

        /**
         * Sets the value of {@link DynamodbTableConfig#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link DynamodbTableConfig#getBillingMode}
         * @param billingMode the value to be set.
         * @return {@code this}
         */
        public Builder billingMode(java.lang.String billingMode) {
            this.billingMode = billingMode;
            return this;
        }

        /**
         * Sets the value of {@link DynamodbTableConfig#getGlobalSecondaryIndex}
         * @param globalSecondaryIndex global_secondary_index block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder globalSecondaryIndex(java.util.List<? extends imports.aws.DynamodbTableGlobalSecondaryIndex> globalSecondaryIndex) {
            this.globalSecondaryIndex = (java.util.List<imports.aws.DynamodbTableGlobalSecondaryIndex>)globalSecondaryIndex;
            return this;
        }

        /**
         * Sets the value of {@link DynamodbTableConfig#getLocalSecondaryIndex}
         * @param localSecondaryIndex local_secondary_index block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder localSecondaryIndex(java.util.List<? extends imports.aws.DynamodbTableLocalSecondaryIndex> localSecondaryIndex) {
            this.localSecondaryIndex = (java.util.List<imports.aws.DynamodbTableLocalSecondaryIndex>)localSecondaryIndex;
            return this;
        }

        /**
         * Sets the value of {@link DynamodbTableConfig#getPointInTimeRecovery}
         * @param pointInTimeRecovery point_in_time_recovery block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder pointInTimeRecovery(java.util.List<? extends imports.aws.DynamodbTablePointInTimeRecovery> pointInTimeRecovery) {
            this.pointInTimeRecovery = (java.util.List<imports.aws.DynamodbTablePointInTimeRecovery>)pointInTimeRecovery;
            return this;
        }

        /**
         * Sets the value of {@link DynamodbTableConfig#getRangeKey}
         * @param rangeKey the value to be set.
         * @return {@code this}
         */
        public Builder rangeKey(java.lang.String rangeKey) {
            this.rangeKey = rangeKey;
            return this;
        }

        /**
         * Sets the value of {@link DynamodbTableConfig#getReadCapacity}
         * @param readCapacity the value to be set.
         * @return {@code this}
         */
        public Builder readCapacity(java.lang.Number readCapacity) {
            this.readCapacity = readCapacity;
            return this;
        }

        /**
         * Sets the value of {@link DynamodbTableConfig#getReplica}
         * @param replica replica block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder replica(java.util.List<? extends imports.aws.DynamodbTableReplica> replica) {
            this.replica = (java.util.List<imports.aws.DynamodbTableReplica>)replica;
            return this;
        }

        /**
         * Sets the value of {@link DynamodbTableConfig#getServerSideEncryption}
         * @param serverSideEncryption server_side_encryption block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder serverSideEncryption(java.util.List<? extends imports.aws.DynamodbTableServerSideEncryption> serverSideEncryption) {
            this.serverSideEncryption = (java.util.List<imports.aws.DynamodbTableServerSideEncryption>)serverSideEncryption;
            return this;
        }

        /**
         * Sets the value of {@link DynamodbTableConfig#getStreamEnabled}
         * @param streamEnabled the value to be set.
         * @return {@code this}
         */
        public Builder streamEnabled(java.lang.Boolean streamEnabled) {
            this.streamEnabled = streamEnabled;
            return this;
        }

        /**
         * Sets the value of {@link DynamodbTableConfig#getStreamViewType}
         * @param streamViewType the value to be set.
         * @return {@code this}
         */
        public Builder streamViewType(java.lang.String streamViewType) {
            this.streamViewType = streamViewType;
            return this;
        }

        /**
         * Sets the value of {@link DynamodbTableConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link DynamodbTableConfig#getTimeouts}
         * @param timeouts timeouts block.
         * @return {@code this}
         */
        public Builder timeouts(imports.aws.DynamodbTableTimeouts timeouts) {
            this.timeouts = timeouts;
            return this;
        }

        /**
         * Sets the value of {@link DynamodbTableConfig#getTtl}
         * @param ttl ttl block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder ttl(java.util.List<? extends imports.aws.DynamodbTableTtl> ttl) {
            this.ttl = (java.util.List<imports.aws.DynamodbTableTtl>)ttl;
            return this;
        }

        /**
         * Sets the value of {@link DynamodbTableConfig#getWriteCapacity}
         * @param writeCapacity the value to be set.
         * @return {@code this}
         */
        public Builder writeCapacity(java.lang.Number writeCapacity) {
            this.writeCapacity = writeCapacity;
            return this;
        }

        /**
         * Sets the value of {@link DynamodbTableConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link DynamodbTableConfig#getDependsOn}
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
         * Sets the value of {@link DynamodbTableConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link DynamodbTableConfig#getProvider}
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
         * @return a new instance of {@link DynamodbTableConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DynamodbTableConfig build() {
            return new Jsii$Proxy(attribute, hashKey, name, billingMode, globalSecondaryIndex, localSecondaryIndex, pointInTimeRecovery, rangeKey, readCapacity, replica, serverSideEncryption, streamEnabled, streamViewType, tags, timeouts, ttl, writeCapacity, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link DynamodbTableConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DynamodbTableConfig {
        private final java.util.List<imports.aws.DynamodbTableAttribute> attribute;
        private final java.lang.String hashKey;
        private final java.lang.String name;
        private final java.lang.String billingMode;
        private final java.util.List<imports.aws.DynamodbTableGlobalSecondaryIndex> globalSecondaryIndex;
        private final java.util.List<imports.aws.DynamodbTableLocalSecondaryIndex> localSecondaryIndex;
        private final java.util.List<imports.aws.DynamodbTablePointInTimeRecovery> pointInTimeRecovery;
        private final java.lang.String rangeKey;
        private final java.lang.Number readCapacity;
        private final java.util.List<imports.aws.DynamodbTableReplica> replica;
        private final java.util.List<imports.aws.DynamodbTableServerSideEncryption> serverSideEncryption;
        private final java.lang.Boolean streamEnabled;
        private final java.lang.String streamViewType;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final imports.aws.DynamodbTableTimeouts timeouts;
        private final java.util.List<imports.aws.DynamodbTableTtl> ttl;
        private final java.lang.Number writeCapacity;
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
            this.attribute = software.amazon.jsii.Kernel.get(this, "attribute", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DynamodbTableAttribute.class)));
            this.hashKey = software.amazon.jsii.Kernel.get(this, "hashKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.billingMode = software.amazon.jsii.Kernel.get(this, "billingMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.globalSecondaryIndex = software.amazon.jsii.Kernel.get(this, "globalSecondaryIndex", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DynamodbTableGlobalSecondaryIndex.class)));
            this.localSecondaryIndex = software.amazon.jsii.Kernel.get(this, "localSecondaryIndex", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DynamodbTableLocalSecondaryIndex.class)));
            this.pointInTimeRecovery = software.amazon.jsii.Kernel.get(this, "pointInTimeRecovery", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DynamodbTablePointInTimeRecovery.class)));
            this.rangeKey = software.amazon.jsii.Kernel.get(this, "rangeKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.readCapacity = software.amazon.jsii.Kernel.get(this, "readCapacity", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.replica = software.amazon.jsii.Kernel.get(this, "replica", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DynamodbTableReplica.class)));
            this.serverSideEncryption = software.amazon.jsii.Kernel.get(this, "serverSideEncryption", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DynamodbTableServerSideEncryption.class)));
            this.streamEnabled = software.amazon.jsii.Kernel.get(this, "streamEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.streamViewType = software.amazon.jsii.Kernel.get(this, "streamViewType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.timeouts = software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.DynamodbTableTimeouts.class));
            this.ttl = software.amazon.jsii.Kernel.get(this, "ttl", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DynamodbTableTtl.class)));
            this.writeCapacity = software.amazon.jsii.Kernel.get(this, "writeCapacity", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.aws.DynamodbTableAttribute> attribute, final java.lang.String hashKey, final java.lang.String name, final java.lang.String billingMode, final java.util.List<? extends imports.aws.DynamodbTableGlobalSecondaryIndex> globalSecondaryIndex, final java.util.List<? extends imports.aws.DynamodbTableLocalSecondaryIndex> localSecondaryIndex, final java.util.List<? extends imports.aws.DynamodbTablePointInTimeRecovery> pointInTimeRecovery, final java.lang.String rangeKey, final java.lang.Number readCapacity, final java.util.List<? extends imports.aws.DynamodbTableReplica> replica, final java.util.List<? extends imports.aws.DynamodbTableServerSideEncryption> serverSideEncryption, final java.lang.Boolean streamEnabled, final java.lang.String streamViewType, final java.util.Map<java.lang.String, java.lang.String> tags, final imports.aws.DynamodbTableTimeouts timeouts, final java.util.List<? extends imports.aws.DynamodbTableTtl> ttl, final java.lang.Number writeCapacity, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.attribute = (java.util.List<imports.aws.DynamodbTableAttribute>)java.util.Objects.requireNonNull(attribute, "attribute is required");
            this.hashKey = java.util.Objects.requireNonNull(hashKey, "hashKey is required");
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.billingMode = billingMode;
            this.globalSecondaryIndex = (java.util.List<imports.aws.DynamodbTableGlobalSecondaryIndex>)globalSecondaryIndex;
            this.localSecondaryIndex = (java.util.List<imports.aws.DynamodbTableLocalSecondaryIndex>)localSecondaryIndex;
            this.pointInTimeRecovery = (java.util.List<imports.aws.DynamodbTablePointInTimeRecovery>)pointInTimeRecovery;
            this.rangeKey = rangeKey;
            this.readCapacity = readCapacity;
            this.replica = (java.util.List<imports.aws.DynamodbTableReplica>)replica;
            this.serverSideEncryption = (java.util.List<imports.aws.DynamodbTableServerSideEncryption>)serverSideEncryption;
            this.streamEnabled = streamEnabled;
            this.streamViewType = streamViewType;
            this.tags = tags;
            this.timeouts = timeouts;
            this.ttl = (java.util.List<imports.aws.DynamodbTableTtl>)ttl;
            this.writeCapacity = writeCapacity;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.util.List<imports.aws.DynamodbTableAttribute> getAttribute() {
            return this.attribute;
        }

        @Override
        public final java.lang.String getHashKey() {
            return this.hashKey;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getBillingMode() {
            return this.billingMode;
        }

        @Override
        public final java.util.List<imports.aws.DynamodbTableGlobalSecondaryIndex> getGlobalSecondaryIndex() {
            return this.globalSecondaryIndex;
        }

        @Override
        public final java.util.List<imports.aws.DynamodbTableLocalSecondaryIndex> getLocalSecondaryIndex() {
            return this.localSecondaryIndex;
        }

        @Override
        public final java.util.List<imports.aws.DynamodbTablePointInTimeRecovery> getPointInTimeRecovery() {
            return this.pointInTimeRecovery;
        }

        @Override
        public final java.lang.String getRangeKey() {
            return this.rangeKey;
        }

        @Override
        public final java.lang.Number getReadCapacity() {
            return this.readCapacity;
        }

        @Override
        public final java.util.List<imports.aws.DynamodbTableReplica> getReplica() {
            return this.replica;
        }

        @Override
        public final java.util.List<imports.aws.DynamodbTableServerSideEncryption> getServerSideEncryption() {
            return this.serverSideEncryption;
        }

        @Override
        public final java.lang.Boolean getStreamEnabled() {
            return this.streamEnabled;
        }

        @Override
        public final java.lang.String getStreamViewType() {
            return this.streamViewType;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final imports.aws.DynamodbTableTimeouts getTimeouts() {
            return this.timeouts;
        }

        @Override
        public final java.util.List<imports.aws.DynamodbTableTtl> getTtl() {
            return this.ttl;
        }

        @Override
        public final java.lang.Number getWriteCapacity() {
            return this.writeCapacity;
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

            data.set("attribute", om.valueToTree(this.getAttribute()));
            data.set("hashKey", om.valueToTree(this.getHashKey()));
            data.set("name", om.valueToTree(this.getName()));
            if (this.getBillingMode() != null) {
                data.set("billingMode", om.valueToTree(this.getBillingMode()));
            }
            if (this.getGlobalSecondaryIndex() != null) {
                data.set("globalSecondaryIndex", om.valueToTree(this.getGlobalSecondaryIndex()));
            }
            if (this.getLocalSecondaryIndex() != null) {
                data.set("localSecondaryIndex", om.valueToTree(this.getLocalSecondaryIndex()));
            }
            if (this.getPointInTimeRecovery() != null) {
                data.set("pointInTimeRecovery", om.valueToTree(this.getPointInTimeRecovery()));
            }
            if (this.getRangeKey() != null) {
                data.set("rangeKey", om.valueToTree(this.getRangeKey()));
            }
            if (this.getReadCapacity() != null) {
                data.set("readCapacity", om.valueToTree(this.getReadCapacity()));
            }
            if (this.getReplica() != null) {
                data.set("replica", om.valueToTree(this.getReplica()));
            }
            if (this.getServerSideEncryption() != null) {
                data.set("serverSideEncryption", om.valueToTree(this.getServerSideEncryption()));
            }
            if (this.getStreamEnabled() != null) {
                data.set("streamEnabled", om.valueToTree(this.getStreamEnabled()));
            }
            if (this.getStreamViewType() != null) {
                data.set("streamViewType", om.valueToTree(this.getStreamViewType()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getTimeouts() != null) {
                data.set("timeouts", om.valueToTree(this.getTimeouts()));
            }
            if (this.getTtl() != null) {
                data.set("ttl", om.valueToTree(this.getTtl()));
            }
            if (this.getWriteCapacity() != null) {
                data.set("writeCapacity", om.valueToTree(this.getWriteCapacity()));
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
            struct.set("fqn", om.valueToTree("aws.DynamodbTableConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DynamodbTableConfig.Jsii$Proxy that = (DynamodbTableConfig.Jsii$Proxy) o;

            if (!attribute.equals(that.attribute)) return false;
            if (!hashKey.equals(that.hashKey)) return false;
            if (!name.equals(that.name)) return false;
            if (this.billingMode != null ? !this.billingMode.equals(that.billingMode) : that.billingMode != null) return false;
            if (this.globalSecondaryIndex != null ? !this.globalSecondaryIndex.equals(that.globalSecondaryIndex) : that.globalSecondaryIndex != null) return false;
            if (this.localSecondaryIndex != null ? !this.localSecondaryIndex.equals(that.localSecondaryIndex) : that.localSecondaryIndex != null) return false;
            if (this.pointInTimeRecovery != null ? !this.pointInTimeRecovery.equals(that.pointInTimeRecovery) : that.pointInTimeRecovery != null) return false;
            if (this.rangeKey != null ? !this.rangeKey.equals(that.rangeKey) : that.rangeKey != null) return false;
            if (this.readCapacity != null ? !this.readCapacity.equals(that.readCapacity) : that.readCapacity != null) return false;
            if (this.replica != null ? !this.replica.equals(that.replica) : that.replica != null) return false;
            if (this.serverSideEncryption != null ? !this.serverSideEncryption.equals(that.serverSideEncryption) : that.serverSideEncryption != null) return false;
            if (this.streamEnabled != null ? !this.streamEnabled.equals(that.streamEnabled) : that.streamEnabled != null) return false;
            if (this.streamViewType != null ? !this.streamViewType.equals(that.streamViewType) : that.streamViewType != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.timeouts != null ? !this.timeouts.equals(that.timeouts) : that.timeouts != null) return false;
            if (this.ttl != null ? !this.ttl.equals(that.ttl) : that.ttl != null) return false;
            if (this.writeCapacity != null ? !this.writeCapacity.equals(that.writeCapacity) : that.writeCapacity != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.attribute.hashCode();
            result = 31 * result + (this.hashKey.hashCode());
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.billingMode != null ? this.billingMode.hashCode() : 0);
            result = 31 * result + (this.globalSecondaryIndex != null ? this.globalSecondaryIndex.hashCode() : 0);
            result = 31 * result + (this.localSecondaryIndex != null ? this.localSecondaryIndex.hashCode() : 0);
            result = 31 * result + (this.pointInTimeRecovery != null ? this.pointInTimeRecovery.hashCode() : 0);
            result = 31 * result + (this.rangeKey != null ? this.rangeKey.hashCode() : 0);
            result = 31 * result + (this.readCapacity != null ? this.readCapacity.hashCode() : 0);
            result = 31 * result + (this.replica != null ? this.replica.hashCode() : 0);
            result = 31 * result + (this.serverSideEncryption != null ? this.serverSideEncryption.hashCode() : 0);
            result = 31 * result + (this.streamEnabled != null ? this.streamEnabled.hashCode() : 0);
            result = 31 * result + (this.streamViewType != null ? this.streamViewType.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.timeouts != null ? this.timeouts.hashCode() : 0);
            result = 31 * result + (this.ttl != null ? this.ttl.hashCode() : 0);
            result = 31 * result + (this.writeCapacity != null ? this.writeCapacity.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
