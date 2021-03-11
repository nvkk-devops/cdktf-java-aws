package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.908Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.StoragegatewayNfsFileShareConfig")
@software.amazon.jsii.Jsii.Proxy(StoragegatewayNfsFileShareConfig.Jsii$Proxy.class)
public interface StoragegatewayNfsFileShareConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getClientList();

    @org.jetbrains.annotations.NotNull java.lang.String getGatewayArn();

    @org.jetbrains.annotations.NotNull java.lang.String getLocationArn();

    @org.jetbrains.annotations.NotNull java.lang.String getRoleArn();

    default @org.jetbrains.annotations.Nullable java.lang.String getDefaultStorageClass() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getGuessMimeTypeEnabled() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getKmsEncrypted() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getKmsKeyArn() {
        return null;
    }

    /**
     * nfs_file_share_defaults block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.StoragegatewayNfsFileShareNfsFileShareDefaults> getNfsFileShareDefaults() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getObjectAcl() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getReadOnly() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getRequesterPays() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSquash() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * timeouts block.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.StoragegatewayNfsFileShareTimeouts getTimeouts() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link StoragegatewayNfsFileShareConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link StoragegatewayNfsFileShareConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<StoragegatewayNfsFileShareConfig> {
        private java.util.List<java.lang.String> clientList;
        private java.lang.String gatewayArn;
        private java.lang.String locationArn;
        private java.lang.String roleArn;
        private java.lang.String defaultStorageClass;
        private java.lang.Boolean guessMimeTypeEnabled;
        private java.lang.Boolean kmsEncrypted;
        private java.lang.String kmsKeyArn;
        private java.util.List<imports.aws.StoragegatewayNfsFileShareNfsFileShareDefaults> nfsFileShareDefaults;
        private java.lang.String objectAcl;
        private java.lang.Boolean readOnly;
        private java.lang.Boolean requesterPays;
        private java.lang.String squash;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private imports.aws.StoragegatewayNfsFileShareTimeouts timeouts;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link StoragegatewayNfsFileShareConfig#getClientList}
         * @param clientList the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder clientList(java.util.List<java.lang.String> clientList) {
            this.clientList = clientList;
            return this;
        }

        /**
         * Sets the value of {@link StoragegatewayNfsFileShareConfig#getGatewayArn}
         * @param gatewayArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder gatewayArn(java.lang.String gatewayArn) {
            this.gatewayArn = gatewayArn;
            return this;
        }

        /**
         * Sets the value of {@link StoragegatewayNfsFileShareConfig#getLocationArn}
         * @param locationArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder locationArn(java.lang.String locationArn) {
            this.locationArn = locationArn;
            return this;
        }

        /**
         * Sets the value of {@link StoragegatewayNfsFileShareConfig#getRoleArn}
         * @param roleArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder roleArn(java.lang.String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        /**
         * Sets the value of {@link StoragegatewayNfsFileShareConfig#getDefaultStorageClass}
         * @param defaultStorageClass the value to be set.
         * @return {@code this}
         */
        public Builder defaultStorageClass(java.lang.String defaultStorageClass) {
            this.defaultStorageClass = defaultStorageClass;
            return this;
        }

        /**
         * Sets the value of {@link StoragegatewayNfsFileShareConfig#getGuessMimeTypeEnabled}
         * @param guessMimeTypeEnabled the value to be set.
         * @return {@code this}
         */
        public Builder guessMimeTypeEnabled(java.lang.Boolean guessMimeTypeEnabled) {
            this.guessMimeTypeEnabled = guessMimeTypeEnabled;
            return this;
        }

        /**
         * Sets the value of {@link StoragegatewayNfsFileShareConfig#getKmsEncrypted}
         * @param kmsEncrypted the value to be set.
         * @return {@code this}
         */
        public Builder kmsEncrypted(java.lang.Boolean kmsEncrypted) {
            this.kmsEncrypted = kmsEncrypted;
            return this;
        }

        /**
         * Sets the value of {@link StoragegatewayNfsFileShareConfig#getKmsKeyArn}
         * @param kmsKeyArn the value to be set.
         * @return {@code this}
         */
        public Builder kmsKeyArn(java.lang.String kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }

        /**
         * Sets the value of {@link StoragegatewayNfsFileShareConfig#getNfsFileShareDefaults}
         * @param nfsFileShareDefaults nfs_file_share_defaults block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder nfsFileShareDefaults(java.util.List<? extends imports.aws.StoragegatewayNfsFileShareNfsFileShareDefaults> nfsFileShareDefaults) {
            this.nfsFileShareDefaults = (java.util.List<imports.aws.StoragegatewayNfsFileShareNfsFileShareDefaults>)nfsFileShareDefaults;
            return this;
        }

        /**
         * Sets the value of {@link StoragegatewayNfsFileShareConfig#getObjectAcl}
         * @param objectAcl the value to be set.
         * @return {@code this}
         */
        public Builder objectAcl(java.lang.String objectAcl) {
            this.objectAcl = objectAcl;
            return this;
        }

        /**
         * Sets the value of {@link StoragegatewayNfsFileShareConfig#getReadOnly}
         * @param readOnly the value to be set.
         * @return {@code this}
         */
        public Builder readOnly(java.lang.Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        /**
         * Sets the value of {@link StoragegatewayNfsFileShareConfig#getRequesterPays}
         * @param requesterPays the value to be set.
         * @return {@code this}
         */
        public Builder requesterPays(java.lang.Boolean requesterPays) {
            this.requesterPays = requesterPays;
            return this;
        }

        /**
         * Sets the value of {@link StoragegatewayNfsFileShareConfig#getSquash}
         * @param squash the value to be set.
         * @return {@code this}
         */
        public Builder squash(java.lang.String squash) {
            this.squash = squash;
            return this;
        }

        /**
         * Sets the value of {@link StoragegatewayNfsFileShareConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link StoragegatewayNfsFileShareConfig#getTimeouts}
         * @param timeouts timeouts block.
         * @return {@code this}
         */
        public Builder timeouts(imports.aws.StoragegatewayNfsFileShareTimeouts timeouts) {
            this.timeouts = timeouts;
            return this;
        }

        /**
         * Sets the value of {@link StoragegatewayNfsFileShareConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link StoragegatewayNfsFileShareConfig#getDependsOn}
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
         * Sets the value of {@link StoragegatewayNfsFileShareConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link StoragegatewayNfsFileShareConfig#getProvider}
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
         * @return a new instance of {@link StoragegatewayNfsFileShareConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public StoragegatewayNfsFileShareConfig build() {
            return new Jsii$Proxy(clientList, gatewayArn, locationArn, roleArn, defaultStorageClass, guessMimeTypeEnabled, kmsEncrypted, kmsKeyArn, nfsFileShareDefaults, objectAcl, readOnly, requesterPays, squash, tags, timeouts, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link StoragegatewayNfsFileShareConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements StoragegatewayNfsFileShareConfig {
        private final java.util.List<java.lang.String> clientList;
        private final java.lang.String gatewayArn;
        private final java.lang.String locationArn;
        private final java.lang.String roleArn;
        private final java.lang.String defaultStorageClass;
        private final java.lang.Boolean guessMimeTypeEnabled;
        private final java.lang.Boolean kmsEncrypted;
        private final java.lang.String kmsKeyArn;
        private final java.util.List<imports.aws.StoragegatewayNfsFileShareNfsFileShareDefaults> nfsFileShareDefaults;
        private final java.lang.String objectAcl;
        private final java.lang.Boolean readOnly;
        private final java.lang.Boolean requesterPays;
        private final java.lang.String squash;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final imports.aws.StoragegatewayNfsFileShareTimeouts timeouts;
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
            this.clientList = software.amazon.jsii.Kernel.get(this, "clientList", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.gatewayArn = software.amazon.jsii.Kernel.get(this, "gatewayArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.locationArn = software.amazon.jsii.Kernel.get(this, "locationArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.roleArn = software.amazon.jsii.Kernel.get(this, "roleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.defaultStorageClass = software.amazon.jsii.Kernel.get(this, "defaultStorageClass", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.guessMimeTypeEnabled = software.amazon.jsii.Kernel.get(this, "guessMimeTypeEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.kmsEncrypted = software.amazon.jsii.Kernel.get(this, "kmsEncrypted", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.kmsKeyArn = software.amazon.jsii.Kernel.get(this, "kmsKeyArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.nfsFileShareDefaults = software.amazon.jsii.Kernel.get(this, "nfsFileShareDefaults", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.StoragegatewayNfsFileShareNfsFileShareDefaults.class)));
            this.objectAcl = software.amazon.jsii.Kernel.get(this, "objectAcl", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.readOnly = software.amazon.jsii.Kernel.get(this, "readOnly", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.requesterPays = software.amazon.jsii.Kernel.get(this, "requesterPays", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.squash = software.amazon.jsii.Kernel.get(this, "squash", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.timeouts = software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.StoragegatewayNfsFileShareTimeouts.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<java.lang.String> clientList, final java.lang.String gatewayArn, final java.lang.String locationArn, final java.lang.String roleArn, final java.lang.String defaultStorageClass, final java.lang.Boolean guessMimeTypeEnabled, final java.lang.Boolean kmsEncrypted, final java.lang.String kmsKeyArn, final java.util.List<? extends imports.aws.StoragegatewayNfsFileShareNfsFileShareDefaults> nfsFileShareDefaults, final java.lang.String objectAcl, final java.lang.Boolean readOnly, final java.lang.Boolean requesterPays, final java.lang.String squash, final java.util.Map<java.lang.String, java.lang.String> tags, final imports.aws.StoragegatewayNfsFileShareTimeouts timeouts, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.clientList = java.util.Objects.requireNonNull(clientList, "clientList is required");
            this.gatewayArn = java.util.Objects.requireNonNull(gatewayArn, "gatewayArn is required");
            this.locationArn = java.util.Objects.requireNonNull(locationArn, "locationArn is required");
            this.roleArn = java.util.Objects.requireNonNull(roleArn, "roleArn is required");
            this.defaultStorageClass = defaultStorageClass;
            this.guessMimeTypeEnabled = guessMimeTypeEnabled;
            this.kmsEncrypted = kmsEncrypted;
            this.kmsKeyArn = kmsKeyArn;
            this.nfsFileShareDefaults = (java.util.List<imports.aws.StoragegatewayNfsFileShareNfsFileShareDefaults>)nfsFileShareDefaults;
            this.objectAcl = objectAcl;
            this.readOnly = readOnly;
            this.requesterPays = requesterPays;
            this.squash = squash;
            this.tags = tags;
            this.timeouts = timeouts;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.util.List<java.lang.String> getClientList() {
            return this.clientList;
        }

        @Override
        public final java.lang.String getGatewayArn() {
            return this.gatewayArn;
        }

        @Override
        public final java.lang.String getLocationArn() {
            return this.locationArn;
        }

        @Override
        public final java.lang.String getRoleArn() {
            return this.roleArn;
        }

        @Override
        public final java.lang.String getDefaultStorageClass() {
            return this.defaultStorageClass;
        }

        @Override
        public final java.lang.Boolean getGuessMimeTypeEnabled() {
            return this.guessMimeTypeEnabled;
        }

        @Override
        public final java.lang.Boolean getKmsEncrypted() {
            return this.kmsEncrypted;
        }

        @Override
        public final java.lang.String getKmsKeyArn() {
            return this.kmsKeyArn;
        }

        @Override
        public final java.util.List<imports.aws.StoragegatewayNfsFileShareNfsFileShareDefaults> getNfsFileShareDefaults() {
            return this.nfsFileShareDefaults;
        }

        @Override
        public final java.lang.String getObjectAcl() {
            return this.objectAcl;
        }

        @Override
        public final java.lang.Boolean getReadOnly() {
            return this.readOnly;
        }

        @Override
        public final java.lang.Boolean getRequesterPays() {
            return this.requesterPays;
        }

        @Override
        public final java.lang.String getSquash() {
            return this.squash;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final imports.aws.StoragegatewayNfsFileShareTimeouts getTimeouts() {
            return this.timeouts;
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

            data.set("clientList", om.valueToTree(this.getClientList()));
            data.set("gatewayArn", om.valueToTree(this.getGatewayArn()));
            data.set("locationArn", om.valueToTree(this.getLocationArn()));
            data.set("roleArn", om.valueToTree(this.getRoleArn()));
            if (this.getDefaultStorageClass() != null) {
                data.set("defaultStorageClass", om.valueToTree(this.getDefaultStorageClass()));
            }
            if (this.getGuessMimeTypeEnabled() != null) {
                data.set("guessMimeTypeEnabled", om.valueToTree(this.getGuessMimeTypeEnabled()));
            }
            if (this.getKmsEncrypted() != null) {
                data.set("kmsEncrypted", om.valueToTree(this.getKmsEncrypted()));
            }
            if (this.getKmsKeyArn() != null) {
                data.set("kmsKeyArn", om.valueToTree(this.getKmsKeyArn()));
            }
            if (this.getNfsFileShareDefaults() != null) {
                data.set("nfsFileShareDefaults", om.valueToTree(this.getNfsFileShareDefaults()));
            }
            if (this.getObjectAcl() != null) {
                data.set("objectAcl", om.valueToTree(this.getObjectAcl()));
            }
            if (this.getReadOnly() != null) {
                data.set("readOnly", om.valueToTree(this.getReadOnly()));
            }
            if (this.getRequesterPays() != null) {
                data.set("requesterPays", om.valueToTree(this.getRequesterPays()));
            }
            if (this.getSquash() != null) {
                data.set("squash", om.valueToTree(this.getSquash()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getTimeouts() != null) {
                data.set("timeouts", om.valueToTree(this.getTimeouts()));
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
            struct.set("fqn", om.valueToTree("aws.StoragegatewayNfsFileShareConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            StoragegatewayNfsFileShareConfig.Jsii$Proxy that = (StoragegatewayNfsFileShareConfig.Jsii$Proxy) o;

            if (!clientList.equals(that.clientList)) return false;
            if (!gatewayArn.equals(that.gatewayArn)) return false;
            if (!locationArn.equals(that.locationArn)) return false;
            if (!roleArn.equals(that.roleArn)) return false;
            if (this.defaultStorageClass != null ? !this.defaultStorageClass.equals(that.defaultStorageClass) : that.defaultStorageClass != null) return false;
            if (this.guessMimeTypeEnabled != null ? !this.guessMimeTypeEnabled.equals(that.guessMimeTypeEnabled) : that.guessMimeTypeEnabled != null) return false;
            if (this.kmsEncrypted != null ? !this.kmsEncrypted.equals(that.kmsEncrypted) : that.kmsEncrypted != null) return false;
            if (this.kmsKeyArn != null ? !this.kmsKeyArn.equals(that.kmsKeyArn) : that.kmsKeyArn != null) return false;
            if (this.nfsFileShareDefaults != null ? !this.nfsFileShareDefaults.equals(that.nfsFileShareDefaults) : that.nfsFileShareDefaults != null) return false;
            if (this.objectAcl != null ? !this.objectAcl.equals(that.objectAcl) : that.objectAcl != null) return false;
            if (this.readOnly != null ? !this.readOnly.equals(that.readOnly) : that.readOnly != null) return false;
            if (this.requesterPays != null ? !this.requesterPays.equals(that.requesterPays) : that.requesterPays != null) return false;
            if (this.squash != null ? !this.squash.equals(that.squash) : that.squash != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.timeouts != null ? !this.timeouts.equals(that.timeouts) : that.timeouts != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.clientList.hashCode();
            result = 31 * result + (this.gatewayArn.hashCode());
            result = 31 * result + (this.locationArn.hashCode());
            result = 31 * result + (this.roleArn.hashCode());
            result = 31 * result + (this.defaultStorageClass != null ? this.defaultStorageClass.hashCode() : 0);
            result = 31 * result + (this.guessMimeTypeEnabled != null ? this.guessMimeTypeEnabled.hashCode() : 0);
            result = 31 * result + (this.kmsEncrypted != null ? this.kmsEncrypted.hashCode() : 0);
            result = 31 * result + (this.kmsKeyArn != null ? this.kmsKeyArn.hashCode() : 0);
            result = 31 * result + (this.nfsFileShareDefaults != null ? this.nfsFileShareDefaults.hashCode() : 0);
            result = 31 * result + (this.objectAcl != null ? this.objectAcl.hashCode() : 0);
            result = 31 * result + (this.readOnly != null ? this.readOnly.hashCode() : 0);
            result = 31 * result + (this.requesterPays != null ? this.requesterPays.hashCode() : 0);
            result = 31 * result + (this.squash != null ? this.squash.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.timeouts != null ? this.timeouts.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
