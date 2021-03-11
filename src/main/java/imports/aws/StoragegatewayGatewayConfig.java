package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.907Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.StoragegatewayGatewayConfig")
@software.amazon.jsii.Jsii.Proxy(StoragegatewayGatewayConfig.Jsii$Proxy.class)
public interface StoragegatewayGatewayConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getGatewayName();

    @org.jetbrains.annotations.NotNull java.lang.String getGatewayTimezone();

    default @org.jetbrains.annotations.Nullable java.lang.String getActivationKey() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getCloudwatchLogGroupArn() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getGatewayIpAddress() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getGatewayType() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getGatewayVpcEndpoint() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getMediumChangerType() {
        return null;
    }

    /**
     * smb_active_directory_settings block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.StoragegatewayGatewaySmbActiveDirectorySettings> getSmbActiveDirectorySettings() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSmbGuestPassword() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getTapeDriveType() {
        return null;
    }

    /**
     * timeouts block.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.StoragegatewayGatewayTimeouts getTimeouts() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link StoragegatewayGatewayConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link StoragegatewayGatewayConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<StoragegatewayGatewayConfig> {
        private java.lang.String gatewayName;
        private java.lang.String gatewayTimezone;
        private java.lang.String activationKey;
        private java.lang.String cloudwatchLogGroupArn;
        private java.lang.String gatewayIpAddress;
        private java.lang.String gatewayType;
        private java.lang.String gatewayVpcEndpoint;
        private java.lang.String mediumChangerType;
        private java.util.List<imports.aws.StoragegatewayGatewaySmbActiveDirectorySettings> smbActiveDirectorySettings;
        private java.lang.String smbGuestPassword;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.lang.String tapeDriveType;
        private imports.aws.StoragegatewayGatewayTimeouts timeouts;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link StoragegatewayGatewayConfig#getGatewayName}
         * @param gatewayName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder gatewayName(java.lang.String gatewayName) {
            this.gatewayName = gatewayName;
            return this;
        }

        /**
         * Sets the value of {@link StoragegatewayGatewayConfig#getGatewayTimezone}
         * @param gatewayTimezone the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder gatewayTimezone(java.lang.String gatewayTimezone) {
            this.gatewayTimezone = gatewayTimezone;
            return this;
        }

        /**
         * Sets the value of {@link StoragegatewayGatewayConfig#getActivationKey}
         * @param activationKey the value to be set.
         * @return {@code this}
         */
        public Builder activationKey(java.lang.String activationKey) {
            this.activationKey = activationKey;
            return this;
        }

        /**
         * Sets the value of {@link StoragegatewayGatewayConfig#getCloudwatchLogGroupArn}
         * @param cloudwatchLogGroupArn the value to be set.
         * @return {@code this}
         */
        public Builder cloudwatchLogGroupArn(java.lang.String cloudwatchLogGroupArn) {
            this.cloudwatchLogGroupArn = cloudwatchLogGroupArn;
            return this;
        }

        /**
         * Sets the value of {@link StoragegatewayGatewayConfig#getGatewayIpAddress}
         * @param gatewayIpAddress the value to be set.
         * @return {@code this}
         */
        public Builder gatewayIpAddress(java.lang.String gatewayIpAddress) {
            this.gatewayIpAddress = gatewayIpAddress;
            return this;
        }

        /**
         * Sets the value of {@link StoragegatewayGatewayConfig#getGatewayType}
         * @param gatewayType the value to be set.
         * @return {@code this}
         */
        public Builder gatewayType(java.lang.String gatewayType) {
            this.gatewayType = gatewayType;
            return this;
        }

        /**
         * Sets the value of {@link StoragegatewayGatewayConfig#getGatewayVpcEndpoint}
         * @param gatewayVpcEndpoint the value to be set.
         * @return {@code this}
         */
        public Builder gatewayVpcEndpoint(java.lang.String gatewayVpcEndpoint) {
            this.gatewayVpcEndpoint = gatewayVpcEndpoint;
            return this;
        }

        /**
         * Sets the value of {@link StoragegatewayGatewayConfig#getMediumChangerType}
         * @param mediumChangerType the value to be set.
         * @return {@code this}
         */
        public Builder mediumChangerType(java.lang.String mediumChangerType) {
            this.mediumChangerType = mediumChangerType;
            return this;
        }

        /**
         * Sets the value of {@link StoragegatewayGatewayConfig#getSmbActiveDirectorySettings}
         * @param smbActiveDirectorySettings smb_active_directory_settings block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder smbActiveDirectorySettings(java.util.List<? extends imports.aws.StoragegatewayGatewaySmbActiveDirectorySettings> smbActiveDirectorySettings) {
            this.smbActiveDirectorySettings = (java.util.List<imports.aws.StoragegatewayGatewaySmbActiveDirectorySettings>)smbActiveDirectorySettings;
            return this;
        }

        /**
         * Sets the value of {@link StoragegatewayGatewayConfig#getSmbGuestPassword}
         * @param smbGuestPassword the value to be set.
         * @return {@code this}
         */
        public Builder smbGuestPassword(java.lang.String smbGuestPassword) {
            this.smbGuestPassword = smbGuestPassword;
            return this;
        }

        /**
         * Sets the value of {@link StoragegatewayGatewayConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link StoragegatewayGatewayConfig#getTapeDriveType}
         * @param tapeDriveType the value to be set.
         * @return {@code this}
         */
        public Builder tapeDriveType(java.lang.String tapeDriveType) {
            this.tapeDriveType = tapeDriveType;
            return this;
        }

        /**
         * Sets the value of {@link StoragegatewayGatewayConfig#getTimeouts}
         * @param timeouts timeouts block.
         * @return {@code this}
         */
        public Builder timeouts(imports.aws.StoragegatewayGatewayTimeouts timeouts) {
            this.timeouts = timeouts;
            return this;
        }

        /**
         * Sets the value of {@link StoragegatewayGatewayConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link StoragegatewayGatewayConfig#getDependsOn}
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
         * Sets the value of {@link StoragegatewayGatewayConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link StoragegatewayGatewayConfig#getProvider}
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
         * @return a new instance of {@link StoragegatewayGatewayConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public StoragegatewayGatewayConfig build() {
            return new Jsii$Proxy(gatewayName, gatewayTimezone, activationKey, cloudwatchLogGroupArn, gatewayIpAddress, gatewayType, gatewayVpcEndpoint, mediumChangerType, smbActiveDirectorySettings, smbGuestPassword, tags, tapeDriveType, timeouts, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link StoragegatewayGatewayConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements StoragegatewayGatewayConfig {
        private final java.lang.String gatewayName;
        private final java.lang.String gatewayTimezone;
        private final java.lang.String activationKey;
        private final java.lang.String cloudwatchLogGroupArn;
        private final java.lang.String gatewayIpAddress;
        private final java.lang.String gatewayType;
        private final java.lang.String gatewayVpcEndpoint;
        private final java.lang.String mediumChangerType;
        private final java.util.List<imports.aws.StoragegatewayGatewaySmbActiveDirectorySettings> smbActiveDirectorySettings;
        private final java.lang.String smbGuestPassword;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.lang.String tapeDriveType;
        private final imports.aws.StoragegatewayGatewayTimeouts timeouts;
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
            this.gatewayName = software.amazon.jsii.Kernel.get(this, "gatewayName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.gatewayTimezone = software.amazon.jsii.Kernel.get(this, "gatewayTimezone", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.activationKey = software.amazon.jsii.Kernel.get(this, "activationKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.cloudwatchLogGroupArn = software.amazon.jsii.Kernel.get(this, "cloudwatchLogGroupArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.gatewayIpAddress = software.amazon.jsii.Kernel.get(this, "gatewayIpAddress", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.gatewayType = software.amazon.jsii.Kernel.get(this, "gatewayType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.gatewayVpcEndpoint = software.amazon.jsii.Kernel.get(this, "gatewayVpcEndpoint", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.mediumChangerType = software.amazon.jsii.Kernel.get(this, "mediumChangerType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.smbActiveDirectorySettings = software.amazon.jsii.Kernel.get(this, "smbActiveDirectorySettings", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.StoragegatewayGatewaySmbActiveDirectorySettings.class)));
            this.smbGuestPassword = software.amazon.jsii.Kernel.get(this, "smbGuestPassword", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.tapeDriveType = software.amazon.jsii.Kernel.get(this, "tapeDriveType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.timeouts = software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.StoragegatewayGatewayTimeouts.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String gatewayName, final java.lang.String gatewayTimezone, final java.lang.String activationKey, final java.lang.String cloudwatchLogGroupArn, final java.lang.String gatewayIpAddress, final java.lang.String gatewayType, final java.lang.String gatewayVpcEndpoint, final java.lang.String mediumChangerType, final java.util.List<? extends imports.aws.StoragegatewayGatewaySmbActiveDirectorySettings> smbActiveDirectorySettings, final java.lang.String smbGuestPassword, final java.util.Map<java.lang.String, java.lang.String> tags, final java.lang.String tapeDriveType, final imports.aws.StoragegatewayGatewayTimeouts timeouts, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.gatewayName = java.util.Objects.requireNonNull(gatewayName, "gatewayName is required");
            this.gatewayTimezone = java.util.Objects.requireNonNull(gatewayTimezone, "gatewayTimezone is required");
            this.activationKey = activationKey;
            this.cloudwatchLogGroupArn = cloudwatchLogGroupArn;
            this.gatewayIpAddress = gatewayIpAddress;
            this.gatewayType = gatewayType;
            this.gatewayVpcEndpoint = gatewayVpcEndpoint;
            this.mediumChangerType = mediumChangerType;
            this.smbActiveDirectorySettings = (java.util.List<imports.aws.StoragegatewayGatewaySmbActiveDirectorySettings>)smbActiveDirectorySettings;
            this.smbGuestPassword = smbGuestPassword;
            this.tags = tags;
            this.tapeDriveType = tapeDriveType;
            this.timeouts = timeouts;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getGatewayName() {
            return this.gatewayName;
        }

        @Override
        public final java.lang.String getGatewayTimezone() {
            return this.gatewayTimezone;
        }

        @Override
        public final java.lang.String getActivationKey() {
            return this.activationKey;
        }

        @Override
        public final java.lang.String getCloudwatchLogGroupArn() {
            return this.cloudwatchLogGroupArn;
        }

        @Override
        public final java.lang.String getGatewayIpAddress() {
            return this.gatewayIpAddress;
        }

        @Override
        public final java.lang.String getGatewayType() {
            return this.gatewayType;
        }

        @Override
        public final java.lang.String getGatewayVpcEndpoint() {
            return this.gatewayVpcEndpoint;
        }

        @Override
        public final java.lang.String getMediumChangerType() {
            return this.mediumChangerType;
        }

        @Override
        public final java.util.List<imports.aws.StoragegatewayGatewaySmbActiveDirectorySettings> getSmbActiveDirectorySettings() {
            return this.smbActiveDirectorySettings;
        }

        @Override
        public final java.lang.String getSmbGuestPassword() {
            return this.smbGuestPassword;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.lang.String getTapeDriveType() {
            return this.tapeDriveType;
        }

        @Override
        public final imports.aws.StoragegatewayGatewayTimeouts getTimeouts() {
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

            data.set("gatewayName", om.valueToTree(this.getGatewayName()));
            data.set("gatewayTimezone", om.valueToTree(this.getGatewayTimezone()));
            if (this.getActivationKey() != null) {
                data.set("activationKey", om.valueToTree(this.getActivationKey()));
            }
            if (this.getCloudwatchLogGroupArn() != null) {
                data.set("cloudwatchLogGroupArn", om.valueToTree(this.getCloudwatchLogGroupArn()));
            }
            if (this.getGatewayIpAddress() != null) {
                data.set("gatewayIpAddress", om.valueToTree(this.getGatewayIpAddress()));
            }
            if (this.getGatewayType() != null) {
                data.set("gatewayType", om.valueToTree(this.getGatewayType()));
            }
            if (this.getGatewayVpcEndpoint() != null) {
                data.set("gatewayVpcEndpoint", om.valueToTree(this.getGatewayVpcEndpoint()));
            }
            if (this.getMediumChangerType() != null) {
                data.set("mediumChangerType", om.valueToTree(this.getMediumChangerType()));
            }
            if (this.getSmbActiveDirectorySettings() != null) {
                data.set("smbActiveDirectorySettings", om.valueToTree(this.getSmbActiveDirectorySettings()));
            }
            if (this.getSmbGuestPassword() != null) {
                data.set("smbGuestPassword", om.valueToTree(this.getSmbGuestPassword()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getTapeDriveType() != null) {
                data.set("tapeDriveType", om.valueToTree(this.getTapeDriveType()));
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
            struct.set("fqn", om.valueToTree("aws.StoragegatewayGatewayConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            StoragegatewayGatewayConfig.Jsii$Proxy that = (StoragegatewayGatewayConfig.Jsii$Proxy) o;

            if (!gatewayName.equals(that.gatewayName)) return false;
            if (!gatewayTimezone.equals(that.gatewayTimezone)) return false;
            if (this.activationKey != null ? !this.activationKey.equals(that.activationKey) : that.activationKey != null) return false;
            if (this.cloudwatchLogGroupArn != null ? !this.cloudwatchLogGroupArn.equals(that.cloudwatchLogGroupArn) : that.cloudwatchLogGroupArn != null) return false;
            if (this.gatewayIpAddress != null ? !this.gatewayIpAddress.equals(that.gatewayIpAddress) : that.gatewayIpAddress != null) return false;
            if (this.gatewayType != null ? !this.gatewayType.equals(that.gatewayType) : that.gatewayType != null) return false;
            if (this.gatewayVpcEndpoint != null ? !this.gatewayVpcEndpoint.equals(that.gatewayVpcEndpoint) : that.gatewayVpcEndpoint != null) return false;
            if (this.mediumChangerType != null ? !this.mediumChangerType.equals(that.mediumChangerType) : that.mediumChangerType != null) return false;
            if (this.smbActiveDirectorySettings != null ? !this.smbActiveDirectorySettings.equals(that.smbActiveDirectorySettings) : that.smbActiveDirectorySettings != null) return false;
            if (this.smbGuestPassword != null ? !this.smbGuestPassword.equals(that.smbGuestPassword) : that.smbGuestPassword != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.tapeDriveType != null ? !this.tapeDriveType.equals(that.tapeDriveType) : that.tapeDriveType != null) return false;
            if (this.timeouts != null ? !this.timeouts.equals(that.timeouts) : that.timeouts != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.gatewayName.hashCode();
            result = 31 * result + (this.gatewayTimezone.hashCode());
            result = 31 * result + (this.activationKey != null ? this.activationKey.hashCode() : 0);
            result = 31 * result + (this.cloudwatchLogGroupArn != null ? this.cloudwatchLogGroupArn.hashCode() : 0);
            result = 31 * result + (this.gatewayIpAddress != null ? this.gatewayIpAddress.hashCode() : 0);
            result = 31 * result + (this.gatewayType != null ? this.gatewayType.hashCode() : 0);
            result = 31 * result + (this.gatewayVpcEndpoint != null ? this.gatewayVpcEndpoint.hashCode() : 0);
            result = 31 * result + (this.mediumChangerType != null ? this.mediumChangerType.hashCode() : 0);
            result = 31 * result + (this.smbActiveDirectorySettings != null ? this.smbActiveDirectorySettings.hashCode() : 0);
            result = 31 * result + (this.smbGuestPassword != null ? this.smbGuestPassword.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.tapeDriveType != null ? this.tapeDriveType.hashCode() : 0);
            result = 31 * result + (this.timeouts != null ? this.timeouts.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
