package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.445Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.DmsReplicationInstanceConfig")
@software.amazon.jsii.Jsii.Proxy(DmsReplicationInstanceConfig.Jsii$Proxy.class)
public interface DmsReplicationInstanceConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getReplicationInstanceClass();

    @org.jetbrains.annotations.NotNull java.lang.String getReplicationInstanceId();

    default @org.jetbrains.annotations.Nullable java.lang.Number getAllocatedStorage() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getApplyImmediately() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAutoMinorVersionUpgrade() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getAvailabilityZone() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getEngineVersion() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getKmsKeyArn() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getMultiAz() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPreferredMaintenanceWindow() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getPubliclyAccessible() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getReplicationSubnetGroupId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * timeouts block.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.DmsReplicationInstanceTimeouts getTimeouts() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getVpcSecurityGroupIds() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DmsReplicationInstanceConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DmsReplicationInstanceConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DmsReplicationInstanceConfig> {
        private java.lang.String replicationInstanceClass;
        private java.lang.String replicationInstanceId;
        private java.lang.Number allocatedStorage;
        private java.lang.Boolean applyImmediately;
        private java.lang.Boolean autoMinorVersionUpgrade;
        private java.lang.String availabilityZone;
        private java.lang.String engineVersion;
        private java.lang.String kmsKeyArn;
        private java.lang.Boolean multiAz;
        private java.lang.String preferredMaintenanceWindow;
        private java.lang.Boolean publiclyAccessible;
        private java.lang.String replicationSubnetGroupId;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private imports.aws.DmsReplicationInstanceTimeouts timeouts;
        private java.util.List<java.lang.String> vpcSecurityGroupIds;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link DmsReplicationInstanceConfig#getReplicationInstanceClass}
         * @param replicationInstanceClass the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder replicationInstanceClass(java.lang.String replicationInstanceClass) {
            this.replicationInstanceClass = replicationInstanceClass;
            return this;
        }

        /**
         * Sets the value of {@link DmsReplicationInstanceConfig#getReplicationInstanceId}
         * @param replicationInstanceId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder replicationInstanceId(java.lang.String replicationInstanceId) {
            this.replicationInstanceId = replicationInstanceId;
            return this;
        }

        /**
         * Sets the value of {@link DmsReplicationInstanceConfig#getAllocatedStorage}
         * @param allocatedStorage the value to be set.
         * @return {@code this}
         */
        public Builder allocatedStorage(java.lang.Number allocatedStorage) {
            this.allocatedStorage = allocatedStorage;
            return this;
        }

        /**
         * Sets the value of {@link DmsReplicationInstanceConfig#getApplyImmediately}
         * @param applyImmediately the value to be set.
         * @return {@code this}
         */
        public Builder applyImmediately(java.lang.Boolean applyImmediately) {
            this.applyImmediately = applyImmediately;
            return this;
        }

        /**
         * Sets the value of {@link DmsReplicationInstanceConfig#getAutoMinorVersionUpgrade}
         * @param autoMinorVersionUpgrade the value to be set.
         * @return {@code this}
         */
        public Builder autoMinorVersionUpgrade(java.lang.Boolean autoMinorVersionUpgrade) {
            this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
            return this;
        }

        /**
         * Sets the value of {@link DmsReplicationInstanceConfig#getAvailabilityZone}
         * @param availabilityZone the value to be set.
         * @return {@code this}
         */
        public Builder availabilityZone(java.lang.String availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }

        /**
         * Sets the value of {@link DmsReplicationInstanceConfig#getEngineVersion}
         * @param engineVersion the value to be set.
         * @return {@code this}
         */
        public Builder engineVersion(java.lang.String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * Sets the value of {@link DmsReplicationInstanceConfig#getKmsKeyArn}
         * @param kmsKeyArn the value to be set.
         * @return {@code this}
         */
        public Builder kmsKeyArn(java.lang.String kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }

        /**
         * Sets the value of {@link DmsReplicationInstanceConfig#getMultiAz}
         * @param multiAz the value to be set.
         * @return {@code this}
         */
        public Builder multiAz(java.lang.Boolean multiAz) {
            this.multiAz = multiAz;
            return this;
        }

        /**
         * Sets the value of {@link DmsReplicationInstanceConfig#getPreferredMaintenanceWindow}
         * @param preferredMaintenanceWindow the value to be set.
         * @return {@code this}
         */
        public Builder preferredMaintenanceWindow(java.lang.String preferredMaintenanceWindow) {
            this.preferredMaintenanceWindow = preferredMaintenanceWindow;
            return this;
        }

        /**
         * Sets the value of {@link DmsReplicationInstanceConfig#getPubliclyAccessible}
         * @param publiclyAccessible the value to be set.
         * @return {@code this}
         */
        public Builder publiclyAccessible(java.lang.Boolean publiclyAccessible) {
            this.publiclyAccessible = publiclyAccessible;
            return this;
        }

        /**
         * Sets the value of {@link DmsReplicationInstanceConfig#getReplicationSubnetGroupId}
         * @param replicationSubnetGroupId the value to be set.
         * @return {@code this}
         */
        public Builder replicationSubnetGroupId(java.lang.String replicationSubnetGroupId) {
            this.replicationSubnetGroupId = replicationSubnetGroupId;
            return this;
        }

        /**
         * Sets the value of {@link DmsReplicationInstanceConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link DmsReplicationInstanceConfig#getTimeouts}
         * @param timeouts timeouts block.
         * @return {@code this}
         */
        public Builder timeouts(imports.aws.DmsReplicationInstanceTimeouts timeouts) {
            this.timeouts = timeouts;
            return this;
        }

        /**
         * Sets the value of {@link DmsReplicationInstanceConfig#getVpcSecurityGroupIds}
         * @param vpcSecurityGroupIds the value to be set.
         * @return {@code this}
         */
        public Builder vpcSecurityGroupIds(java.util.List<java.lang.String> vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds = vpcSecurityGroupIds;
            return this;
        }

        /**
         * Sets the value of {@link DmsReplicationInstanceConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link DmsReplicationInstanceConfig#getDependsOn}
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
         * Sets the value of {@link DmsReplicationInstanceConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link DmsReplicationInstanceConfig#getProvider}
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
         * @return a new instance of {@link DmsReplicationInstanceConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DmsReplicationInstanceConfig build() {
            return new Jsii$Proxy(replicationInstanceClass, replicationInstanceId, allocatedStorage, applyImmediately, autoMinorVersionUpgrade, availabilityZone, engineVersion, kmsKeyArn, multiAz, preferredMaintenanceWindow, publiclyAccessible, replicationSubnetGroupId, tags, timeouts, vpcSecurityGroupIds, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link DmsReplicationInstanceConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DmsReplicationInstanceConfig {
        private final java.lang.String replicationInstanceClass;
        private final java.lang.String replicationInstanceId;
        private final java.lang.Number allocatedStorage;
        private final java.lang.Boolean applyImmediately;
        private final java.lang.Boolean autoMinorVersionUpgrade;
        private final java.lang.String availabilityZone;
        private final java.lang.String engineVersion;
        private final java.lang.String kmsKeyArn;
        private final java.lang.Boolean multiAz;
        private final java.lang.String preferredMaintenanceWindow;
        private final java.lang.Boolean publiclyAccessible;
        private final java.lang.String replicationSubnetGroupId;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final imports.aws.DmsReplicationInstanceTimeouts timeouts;
        private final java.util.List<java.lang.String> vpcSecurityGroupIds;
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
            this.replicationInstanceClass = software.amazon.jsii.Kernel.get(this, "replicationInstanceClass", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.replicationInstanceId = software.amazon.jsii.Kernel.get(this, "replicationInstanceId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.allocatedStorage = software.amazon.jsii.Kernel.get(this, "allocatedStorage", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.applyImmediately = software.amazon.jsii.Kernel.get(this, "applyImmediately", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.autoMinorVersionUpgrade = software.amazon.jsii.Kernel.get(this, "autoMinorVersionUpgrade", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.availabilityZone = software.amazon.jsii.Kernel.get(this, "availabilityZone", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.engineVersion = software.amazon.jsii.Kernel.get(this, "engineVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.kmsKeyArn = software.amazon.jsii.Kernel.get(this, "kmsKeyArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.multiAz = software.amazon.jsii.Kernel.get(this, "multiAz", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.preferredMaintenanceWindow = software.amazon.jsii.Kernel.get(this, "preferredMaintenanceWindow", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.publiclyAccessible = software.amazon.jsii.Kernel.get(this, "publiclyAccessible", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.replicationSubnetGroupId = software.amazon.jsii.Kernel.get(this, "replicationSubnetGroupId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.timeouts = software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.DmsReplicationInstanceTimeouts.class));
            this.vpcSecurityGroupIds = software.amazon.jsii.Kernel.get(this, "vpcSecurityGroupIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String replicationInstanceClass, final java.lang.String replicationInstanceId, final java.lang.Number allocatedStorage, final java.lang.Boolean applyImmediately, final java.lang.Boolean autoMinorVersionUpgrade, final java.lang.String availabilityZone, final java.lang.String engineVersion, final java.lang.String kmsKeyArn, final java.lang.Boolean multiAz, final java.lang.String preferredMaintenanceWindow, final java.lang.Boolean publiclyAccessible, final java.lang.String replicationSubnetGroupId, final java.util.Map<java.lang.String, java.lang.String> tags, final imports.aws.DmsReplicationInstanceTimeouts timeouts, final java.util.List<java.lang.String> vpcSecurityGroupIds, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.replicationInstanceClass = java.util.Objects.requireNonNull(replicationInstanceClass, "replicationInstanceClass is required");
            this.replicationInstanceId = java.util.Objects.requireNonNull(replicationInstanceId, "replicationInstanceId is required");
            this.allocatedStorage = allocatedStorage;
            this.applyImmediately = applyImmediately;
            this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
            this.availabilityZone = availabilityZone;
            this.engineVersion = engineVersion;
            this.kmsKeyArn = kmsKeyArn;
            this.multiAz = multiAz;
            this.preferredMaintenanceWindow = preferredMaintenanceWindow;
            this.publiclyAccessible = publiclyAccessible;
            this.replicationSubnetGroupId = replicationSubnetGroupId;
            this.tags = tags;
            this.timeouts = timeouts;
            this.vpcSecurityGroupIds = vpcSecurityGroupIds;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getReplicationInstanceClass() {
            return this.replicationInstanceClass;
        }

        @Override
        public final java.lang.String getReplicationInstanceId() {
            return this.replicationInstanceId;
        }

        @Override
        public final java.lang.Number getAllocatedStorage() {
            return this.allocatedStorage;
        }

        @Override
        public final java.lang.Boolean getApplyImmediately() {
            return this.applyImmediately;
        }

        @Override
        public final java.lang.Boolean getAutoMinorVersionUpgrade() {
            return this.autoMinorVersionUpgrade;
        }

        @Override
        public final java.lang.String getAvailabilityZone() {
            return this.availabilityZone;
        }

        @Override
        public final java.lang.String getEngineVersion() {
            return this.engineVersion;
        }

        @Override
        public final java.lang.String getKmsKeyArn() {
            return this.kmsKeyArn;
        }

        @Override
        public final java.lang.Boolean getMultiAz() {
            return this.multiAz;
        }

        @Override
        public final java.lang.String getPreferredMaintenanceWindow() {
            return this.preferredMaintenanceWindow;
        }

        @Override
        public final java.lang.Boolean getPubliclyAccessible() {
            return this.publiclyAccessible;
        }

        @Override
        public final java.lang.String getReplicationSubnetGroupId() {
            return this.replicationSubnetGroupId;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final imports.aws.DmsReplicationInstanceTimeouts getTimeouts() {
            return this.timeouts;
        }

        @Override
        public final java.util.List<java.lang.String> getVpcSecurityGroupIds() {
            return this.vpcSecurityGroupIds;
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

            data.set("replicationInstanceClass", om.valueToTree(this.getReplicationInstanceClass()));
            data.set("replicationInstanceId", om.valueToTree(this.getReplicationInstanceId()));
            if (this.getAllocatedStorage() != null) {
                data.set("allocatedStorage", om.valueToTree(this.getAllocatedStorage()));
            }
            if (this.getApplyImmediately() != null) {
                data.set("applyImmediately", om.valueToTree(this.getApplyImmediately()));
            }
            if (this.getAutoMinorVersionUpgrade() != null) {
                data.set("autoMinorVersionUpgrade", om.valueToTree(this.getAutoMinorVersionUpgrade()));
            }
            if (this.getAvailabilityZone() != null) {
                data.set("availabilityZone", om.valueToTree(this.getAvailabilityZone()));
            }
            if (this.getEngineVersion() != null) {
                data.set("engineVersion", om.valueToTree(this.getEngineVersion()));
            }
            if (this.getKmsKeyArn() != null) {
                data.set("kmsKeyArn", om.valueToTree(this.getKmsKeyArn()));
            }
            if (this.getMultiAz() != null) {
                data.set("multiAz", om.valueToTree(this.getMultiAz()));
            }
            if (this.getPreferredMaintenanceWindow() != null) {
                data.set("preferredMaintenanceWindow", om.valueToTree(this.getPreferredMaintenanceWindow()));
            }
            if (this.getPubliclyAccessible() != null) {
                data.set("publiclyAccessible", om.valueToTree(this.getPubliclyAccessible()));
            }
            if (this.getReplicationSubnetGroupId() != null) {
                data.set("replicationSubnetGroupId", om.valueToTree(this.getReplicationSubnetGroupId()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getTimeouts() != null) {
                data.set("timeouts", om.valueToTree(this.getTimeouts()));
            }
            if (this.getVpcSecurityGroupIds() != null) {
                data.set("vpcSecurityGroupIds", om.valueToTree(this.getVpcSecurityGroupIds()));
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
            struct.set("fqn", om.valueToTree("aws.DmsReplicationInstanceConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DmsReplicationInstanceConfig.Jsii$Proxy that = (DmsReplicationInstanceConfig.Jsii$Proxy) o;

            if (!replicationInstanceClass.equals(that.replicationInstanceClass)) return false;
            if (!replicationInstanceId.equals(that.replicationInstanceId)) return false;
            if (this.allocatedStorage != null ? !this.allocatedStorage.equals(that.allocatedStorage) : that.allocatedStorage != null) return false;
            if (this.applyImmediately != null ? !this.applyImmediately.equals(that.applyImmediately) : that.applyImmediately != null) return false;
            if (this.autoMinorVersionUpgrade != null ? !this.autoMinorVersionUpgrade.equals(that.autoMinorVersionUpgrade) : that.autoMinorVersionUpgrade != null) return false;
            if (this.availabilityZone != null ? !this.availabilityZone.equals(that.availabilityZone) : that.availabilityZone != null) return false;
            if (this.engineVersion != null ? !this.engineVersion.equals(that.engineVersion) : that.engineVersion != null) return false;
            if (this.kmsKeyArn != null ? !this.kmsKeyArn.equals(that.kmsKeyArn) : that.kmsKeyArn != null) return false;
            if (this.multiAz != null ? !this.multiAz.equals(that.multiAz) : that.multiAz != null) return false;
            if (this.preferredMaintenanceWindow != null ? !this.preferredMaintenanceWindow.equals(that.preferredMaintenanceWindow) : that.preferredMaintenanceWindow != null) return false;
            if (this.publiclyAccessible != null ? !this.publiclyAccessible.equals(that.publiclyAccessible) : that.publiclyAccessible != null) return false;
            if (this.replicationSubnetGroupId != null ? !this.replicationSubnetGroupId.equals(that.replicationSubnetGroupId) : that.replicationSubnetGroupId != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.timeouts != null ? !this.timeouts.equals(that.timeouts) : that.timeouts != null) return false;
            if (this.vpcSecurityGroupIds != null ? !this.vpcSecurityGroupIds.equals(that.vpcSecurityGroupIds) : that.vpcSecurityGroupIds != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.replicationInstanceClass.hashCode();
            result = 31 * result + (this.replicationInstanceId.hashCode());
            result = 31 * result + (this.allocatedStorage != null ? this.allocatedStorage.hashCode() : 0);
            result = 31 * result + (this.applyImmediately != null ? this.applyImmediately.hashCode() : 0);
            result = 31 * result + (this.autoMinorVersionUpgrade != null ? this.autoMinorVersionUpgrade.hashCode() : 0);
            result = 31 * result + (this.availabilityZone != null ? this.availabilityZone.hashCode() : 0);
            result = 31 * result + (this.engineVersion != null ? this.engineVersion.hashCode() : 0);
            result = 31 * result + (this.kmsKeyArn != null ? this.kmsKeyArn.hashCode() : 0);
            result = 31 * result + (this.multiAz != null ? this.multiAz.hashCode() : 0);
            result = 31 * result + (this.preferredMaintenanceWindow != null ? this.preferredMaintenanceWindow.hashCode() : 0);
            result = 31 * result + (this.publiclyAccessible != null ? this.publiclyAccessible.hashCode() : 0);
            result = 31 * result + (this.replicationSubnetGroupId != null ? this.replicationSubnetGroupId.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.timeouts != null ? this.timeouts.hashCode() : 0);
            result = 31 * result + (this.vpcSecurityGroupIds != null ? this.vpcSecurityGroupIds.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
