package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.910Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.StoragegatewaySmbFileShareConfig")
@software.amazon.jsii.Jsii.Proxy(StoragegatewaySmbFileShareConfig.Jsii$Proxy.class)
public interface StoragegatewaySmbFileShareConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getGatewayArn();

    @org.jetbrains.annotations.NotNull java.lang.String getLocationArn();

    @org.jetbrains.annotations.NotNull java.lang.String getRoleArn();

    default @org.jetbrains.annotations.Nullable java.lang.String getAuthentication() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDefaultStorageClass() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getGuessMimeTypeEnabled() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getInvalidUserList() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getKmsEncrypted() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getKmsKeyArn() {
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

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * timeouts block.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.StoragegatewaySmbFileShareTimeouts getTimeouts() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getValidUserList() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link StoragegatewaySmbFileShareConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link StoragegatewaySmbFileShareConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<StoragegatewaySmbFileShareConfig> {
        private java.lang.String gatewayArn;
        private java.lang.String locationArn;
        private java.lang.String roleArn;
        private java.lang.String authentication;
        private java.lang.String defaultStorageClass;
        private java.lang.Boolean guessMimeTypeEnabled;
        private java.util.List<java.lang.String> invalidUserList;
        private java.lang.Boolean kmsEncrypted;
        private java.lang.String kmsKeyArn;
        private java.lang.String objectAcl;
        private java.lang.Boolean readOnly;
        private java.lang.Boolean requesterPays;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private imports.aws.StoragegatewaySmbFileShareTimeouts timeouts;
        private java.util.List<java.lang.String> validUserList;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link StoragegatewaySmbFileShareConfig#getGatewayArn}
         * @param gatewayArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder gatewayArn(java.lang.String gatewayArn) {
            this.gatewayArn = gatewayArn;
            return this;
        }

        /**
         * Sets the value of {@link StoragegatewaySmbFileShareConfig#getLocationArn}
         * @param locationArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder locationArn(java.lang.String locationArn) {
            this.locationArn = locationArn;
            return this;
        }

        /**
         * Sets the value of {@link StoragegatewaySmbFileShareConfig#getRoleArn}
         * @param roleArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder roleArn(java.lang.String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        /**
         * Sets the value of {@link StoragegatewaySmbFileShareConfig#getAuthentication}
         * @param authentication the value to be set.
         * @return {@code this}
         */
        public Builder authentication(java.lang.String authentication) {
            this.authentication = authentication;
            return this;
        }

        /**
         * Sets the value of {@link StoragegatewaySmbFileShareConfig#getDefaultStorageClass}
         * @param defaultStorageClass the value to be set.
         * @return {@code this}
         */
        public Builder defaultStorageClass(java.lang.String defaultStorageClass) {
            this.defaultStorageClass = defaultStorageClass;
            return this;
        }

        /**
         * Sets the value of {@link StoragegatewaySmbFileShareConfig#getGuessMimeTypeEnabled}
         * @param guessMimeTypeEnabled the value to be set.
         * @return {@code this}
         */
        public Builder guessMimeTypeEnabled(java.lang.Boolean guessMimeTypeEnabled) {
            this.guessMimeTypeEnabled = guessMimeTypeEnabled;
            return this;
        }

        /**
         * Sets the value of {@link StoragegatewaySmbFileShareConfig#getInvalidUserList}
         * @param invalidUserList the value to be set.
         * @return {@code this}
         */
        public Builder invalidUserList(java.util.List<java.lang.String> invalidUserList) {
            this.invalidUserList = invalidUserList;
            return this;
        }

        /**
         * Sets the value of {@link StoragegatewaySmbFileShareConfig#getKmsEncrypted}
         * @param kmsEncrypted the value to be set.
         * @return {@code this}
         */
        public Builder kmsEncrypted(java.lang.Boolean kmsEncrypted) {
            this.kmsEncrypted = kmsEncrypted;
            return this;
        }

        /**
         * Sets the value of {@link StoragegatewaySmbFileShareConfig#getKmsKeyArn}
         * @param kmsKeyArn the value to be set.
         * @return {@code this}
         */
        public Builder kmsKeyArn(java.lang.String kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }

        /**
         * Sets the value of {@link StoragegatewaySmbFileShareConfig#getObjectAcl}
         * @param objectAcl the value to be set.
         * @return {@code this}
         */
        public Builder objectAcl(java.lang.String objectAcl) {
            this.objectAcl = objectAcl;
            return this;
        }

        /**
         * Sets the value of {@link StoragegatewaySmbFileShareConfig#getReadOnly}
         * @param readOnly the value to be set.
         * @return {@code this}
         */
        public Builder readOnly(java.lang.Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        /**
         * Sets the value of {@link StoragegatewaySmbFileShareConfig#getRequesterPays}
         * @param requesterPays the value to be set.
         * @return {@code this}
         */
        public Builder requesterPays(java.lang.Boolean requesterPays) {
            this.requesterPays = requesterPays;
            return this;
        }

        /**
         * Sets the value of {@link StoragegatewaySmbFileShareConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link StoragegatewaySmbFileShareConfig#getTimeouts}
         * @param timeouts timeouts block.
         * @return {@code this}
         */
        public Builder timeouts(imports.aws.StoragegatewaySmbFileShareTimeouts timeouts) {
            this.timeouts = timeouts;
            return this;
        }

        /**
         * Sets the value of {@link StoragegatewaySmbFileShareConfig#getValidUserList}
         * @param validUserList the value to be set.
         * @return {@code this}
         */
        public Builder validUserList(java.util.List<java.lang.String> validUserList) {
            this.validUserList = validUserList;
            return this;
        }

        /**
         * Sets the value of {@link StoragegatewaySmbFileShareConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link StoragegatewaySmbFileShareConfig#getDependsOn}
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
         * Sets the value of {@link StoragegatewaySmbFileShareConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link StoragegatewaySmbFileShareConfig#getProvider}
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
         * @return a new instance of {@link StoragegatewaySmbFileShareConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public StoragegatewaySmbFileShareConfig build() {
            return new Jsii$Proxy(gatewayArn, locationArn, roleArn, authentication, defaultStorageClass, guessMimeTypeEnabled, invalidUserList, kmsEncrypted, kmsKeyArn, objectAcl, readOnly, requesterPays, tags, timeouts, validUserList, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link StoragegatewaySmbFileShareConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements StoragegatewaySmbFileShareConfig {
        private final java.lang.String gatewayArn;
        private final java.lang.String locationArn;
        private final java.lang.String roleArn;
        private final java.lang.String authentication;
        private final java.lang.String defaultStorageClass;
        private final java.lang.Boolean guessMimeTypeEnabled;
        private final java.util.List<java.lang.String> invalidUserList;
        private final java.lang.Boolean kmsEncrypted;
        private final java.lang.String kmsKeyArn;
        private final java.lang.String objectAcl;
        private final java.lang.Boolean readOnly;
        private final java.lang.Boolean requesterPays;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final imports.aws.StoragegatewaySmbFileShareTimeouts timeouts;
        private final java.util.List<java.lang.String> validUserList;
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
            this.gatewayArn = software.amazon.jsii.Kernel.get(this, "gatewayArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.locationArn = software.amazon.jsii.Kernel.get(this, "locationArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.roleArn = software.amazon.jsii.Kernel.get(this, "roleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.authentication = software.amazon.jsii.Kernel.get(this, "authentication", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.defaultStorageClass = software.amazon.jsii.Kernel.get(this, "defaultStorageClass", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.guessMimeTypeEnabled = software.amazon.jsii.Kernel.get(this, "guessMimeTypeEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.invalidUserList = software.amazon.jsii.Kernel.get(this, "invalidUserList", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.kmsEncrypted = software.amazon.jsii.Kernel.get(this, "kmsEncrypted", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.kmsKeyArn = software.amazon.jsii.Kernel.get(this, "kmsKeyArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.objectAcl = software.amazon.jsii.Kernel.get(this, "objectAcl", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.readOnly = software.amazon.jsii.Kernel.get(this, "readOnly", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.requesterPays = software.amazon.jsii.Kernel.get(this, "requesterPays", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.timeouts = software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.StoragegatewaySmbFileShareTimeouts.class));
            this.validUserList = software.amazon.jsii.Kernel.get(this, "validUserList", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String gatewayArn, final java.lang.String locationArn, final java.lang.String roleArn, final java.lang.String authentication, final java.lang.String defaultStorageClass, final java.lang.Boolean guessMimeTypeEnabled, final java.util.List<java.lang.String> invalidUserList, final java.lang.Boolean kmsEncrypted, final java.lang.String kmsKeyArn, final java.lang.String objectAcl, final java.lang.Boolean readOnly, final java.lang.Boolean requesterPays, final java.util.Map<java.lang.String, java.lang.String> tags, final imports.aws.StoragegatewaySmbFileShareTimeouts timeouts, final java.util.List<java.lang.String> validUserList, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.gatewayArn = java.util.Objects.requireNonNull(gatewayArn, "gatewayArn is required");
            this.locationArn = java.util.Objects.requireNonNull(locationArn, "locationArn is required");
            this.roleArn = java.util.Objects.requireNonNull(roleArn, "roleArn is required");
            this.authentication = authentication;
            this.defaultStorageClass = defaultStorageClass;
            this.guessMimeTypeEnabled = guessMimeTypeEnabled;
            this.invalidUserList = invalidUserList;
            this.kmsEncrypted = kmsEncrypted;
            this.kmsKeyArn = kmsKeyArn;
            this.objectAcl = objectAcl;
            this.readOnly = readOnly;
            this.requesterPays = requesterPays;
            this.tags = tags;
            this.timeouts = timeouts;
            this.validUserList = validUserList;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
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
        public final java.lang.String getAuthentication() {
            return this.authentication;
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
        public final java.util.List<java.lang.String> getInvalidUserList() {
            return this.invalidUserList;
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
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final imports.aws.StoragegatewaySmbFileShareTimeouts getTimeouts() {
            return this.timeouts;
        }

        @Override
        public final java.util.List<java.lang.String> getValidUserList() {
            return this.validUserList;
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

            data.set("gatewayArn", om.valueToTree(this.getGatewayArn()));
            data.set("locationArn", om.valueToTree(this.getLocationArn()));
            data.set("roleArn", om.valueToTree(this.getRoleArn()));
            if (this.getAuthentication() != null) {
                data.set("authentication", om.valueToTree(this.getAuthentication()));
            }
            if (this.getDefaultStorageClass() != null) {
                data.set("defaultStorageClass", om.valueToTree(this.getDefaultStorageClass()));
            }
            if (this.getGuessMimeTypeEnabled() != null) {
                data.set("guessMimeTypeEnabled", om.valueToTree(this.getGuessMimeTypeEnabled()));
            }
            if (this.getInvalidUserList() != null) {
                data.set("invalidUserList", om.valueToTree(this.getInvalidUserList()));
            }
            if (this.getKmsEncrypted() != null) {
                data.set("kmsEncrypted", om.valueToTree(this.getKmsEncrypted()));
            }
            if (this.getKmsKeyArn() != null) {
                data.set("kmsKeyArn", om.valueToTree(this.getKmsKeyArn()));
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
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getTimeouts() != null) {
                data.set("timeouts", om.valueToTree(this.getTimeouts()));
            }
            if (this.getValidUserList() != null) {
                data.set("validUserList", om.valueToTree(this.getValidUserList()));
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
            struct.set("fqn", om.valueToTree("aws.StoragegatewaySmbFileShareConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            StoragegatewaySmbFileShareConfig.Jsii$Proxy that = (StoragegatewaySmbFileShareConfig.Jsii$Proxy) o;

            if (!gatewayArn.equals(that.gatewayArn)) return false;
            if (!locationArn.equals(that.locationArn)) return false;
            if (!roleArn.equals(that.roleArn)) return false;
            if (this.authentication != null ? !this.authentication.equals(that.authentication) : that.authentication != null) return false;
            if (this.defaultStorageClass != null ? !this.defaultStorageClass.equals(that.defaultStorageClass) : that.defaultStorageClass != null) return false;
            if (this.guessMimeTypeEnabled != null ? !this.guessMimeTypeEnabled.equals(that.guessMimeTypeEnabled) : that.guessMimeTypeEnabled != null) return false;
            if (this.invalidUserList != null ? !this.invalidUserList.equals(that.invalidUserList) : that.invalidUserList != null) return false;
            if (this.kmsEncrypted != null ? !this.kmsEncrypted.equals(that.kmsEncrypted) : that.kmsEncrypted != null) return false;
            if (this.kmsKeyArn != null ? !this.kmsKeyArn.equals(that.kmsKeyArn) : that.kmsKeyArn != null) return false;
            if (this.objectAcl != null ? !this.objectAcl.equals(that.objectAcl) : that.objectAcl != null) return false;
            if (this.readOnly != null ? !this.readOnly.equals(that.readOnly) : that.readOnly != null) return false;
            if (this.requesterPays != null ? !this.requesterPays.equals(that.requesterPays) : that.requesterPays != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.timeouts != null ? !this.timeouts.equals(that.timeouts) : that.timeouts != null) return false;
            if (this.validUserList != null ? !this.validUserList.equals(that.validUserList) : that.validUserList != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.gatewayArn.hashCode();
            result = 31 * result + (this.locationArn.hashCode());
            result = 31 * result + (this.roleArn.hashCode());
            result = 31 * result + (this.authentication != null ? this.authentication.hashCode() : 0);
            result = 31 * result + (this.defaultStorageClass != null ? this.defaultStorageClass.hashCode() : 0);
            result = 31 * result + (this.guessMimeTypeEnabled != null ? this.guessMimeTypeEnabled.hashCode() : 0);
            result = 31 * result + (this.invalidUserList != null ? this.invalidUserList.hashCode() : 0);
            result = 31 * result + (this.kmsEncrypted != null ? this.kmsEncrypted.hashCode() : 0);
            result = 31 * result + (this.kmsKeyArn != null ? this.kmsKeyArn.hashCode() : 0);
            result = 31 * result + (this.objectAcl != null ? this.objectAcl.hashCode() : 0);
            result = 31 * result + (this.readOnly != null ? this.readOnly.hashCode() : 0);
            result = 31 * result + (this.requesterPays != null ? this.requesterPays.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.timeouts != null ? this.timeouts.hashCode() : 0);
            result = 31 * result + (this.validUserList != null ? this.validUserList.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
