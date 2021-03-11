package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.813Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Route53HealthCheckConfig")
@software.amazon.jsii.Jsii.Proxy(Route53HealthCheckConfig.Jsii$Proxy.class)
public interface Route53HealthCheckConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getType();

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getChildHealthchecks() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getChildHealthThreshold() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getCloudwatchAlarmName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getCloudwatchAlarmRegion() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getEnableSni() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getFailureThreshold() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getFqdn() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getInsufficientDataHealthStatus() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getInvertHealthcheck() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getIpAddress() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getMeasureLatency() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getPort() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getReferenceName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getRegions() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getRequestInterval() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getResourcePath() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSearchString() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Route53HealthCheckConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Route53HealthCheckConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Route53HealthCheckConfig> {
        private java.lang.String type;
        private java.util.List<java.lang.String> childHealthchecks;
        private java.lang.Number childHealthThreshold;
        private java.lang.String cloudwatchAlarmName;
        private java.lang.String cloudwatchAlarmRegion;
        private java.lang.Boolean enableSni;
        private java.lang.Number failureThreshold;
        private java.lang.String fqdn;
        private java.lang.String insufficientDataHealthStatus;
        private java.lang.Boolean invertHealthcheck;
        private java.lang.String ipAddress;
        private java.lang.Boolean measureLatency;
        private java.lang.Number port;
        private java.lang.String referenceName;
        private java.util.List<java.lang.String> regions;
        private java.lang.Number requestInterval;
        private java.lang.String resourcePath;
        private java.lang.String searchString;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link Route53HealthCheckConfig#getType}
         * @param type the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link Route53HealthCheckConfig#getChildHealthchecks}
         * @param childHealthchecks the value to be set.
         * @return {@code this}
         */
        public Builder childHealthchecks(java.util.List<java.lang.String> childHealthchecks) {
            this.childHealthchecks = childHealthchecks;
            return this;
        }

        /**
         * Sets the value of {@link Route53HealthCheckConfig#getChildHealthThreshold}
         * @param childHealthThreshold the value to be set.
         * @return {@code this}
         */
        public Builder childHealthThreshold(java.lang.Number childHealthThreshold) {
            this.childHealthThreshold = childHealthThreshold;
            return this;
        }

        /**
         * Sets the value of {@link Route53HealthCheckConfig#getCloudwatchAlarmName}
         * @param cloudwatchAlarmName the value to be set.
         * @return {@code this}
         */
        public Builder cloudwatchAlarmName(java.lang.String cloudwatchAlarmName) {
            this.cloudwatchAlarmName = cloudwatchAlarmName;
            return this;
        }

        /**
         * Sets the value of {@link Route53HealthCheckConfig#getCloudwatchAlarmRegion}
         * @param cloudwatchAlarmRegion the value to be set.
         * @return {@code this}
         */
        public Builder cloudwatchAlarmRegion(java.lang.String cloudwatchAlarmRegion) {
            this.cloudwatchAlarmRegion = cloudwatchAlarmRegion;
            return this;
        }

        /**
         * Sets the value of {@link Route53HealthCheckConfig#getEnableSni}
         * @param enableSni the value to be set.
         * @return {@code this}
         */
        public Builder enableSni(java.lang.Boolean enableSni) {
            this.enableSni = enableSni;
            return this;
        }

        /**
         * Sets the value of {@link Route53HealthCheckConfig#getFailureThreshold}
         * @param failureThreshold the value to be set.
         * @return {@code this}
         */
        public Builder failureThreshold(java.lang.Number failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }

        /**
         * Sets the value of {@link Route53HealthCheckConfig#getFqdn}
         * @param fqdn the value to be set.
         * @return {@code this}
         */
        public Builder fqdn(java.lang.String fqdn) {
            this.fqdn = fqdn;
            return this;
        }

        /**
         * Sets the value of {@link Route53HealthCheckConfig#getInsufficientDataHealthStatus}
         * @param insufficientDataHealthStatus the value to be set.
         * @return {@code this}
         */
        public Builder insufficientDataHealthStatus(java.lang.String insufficientDataHealthStatus) {
            this.insufficientDataHealthStatus = insufficientDataHealthStatus;
            return this;
        }

        /**
         * Sets the value of {@link Route53HealthCheckConfig#getInvertHealthcheck}
         * @param invertHealthcheck the value to be set.
         * @return {@code this}
         */
        public Builder invertHealthcheck(java.lang.Boolean invertHealthcheck) {
            this.invertHealthcheck = invertHealthcheck;
            return this;
        }

        /**
         * Sets the value of {@link Route53HealthCheckConfig#getIpAddress}
         * @param ipAddress the value to be set.
         * @return {@code this}
         */
        public Builder ipAddress(java.lang.String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        /**
         * Sets the value of {@link Route53HealthCheckConfig#getMeasureLatency}
         * @param measureLatency the value to be set.
         * @return {@code this}
         */
        public Builder measureLatency(java.lang.Boolean measureLatency) {
            this.measureLatency = measureLatency;
            return this;
        }

        /**
         * Sets the value of {@link Route53HealthCheckConfig#getPort}
         * @param port the value to be set.
         * @return {@code this}
         */
        public Builder port(java.lang.Number port) {
            this.port = port;
            return this;
        }

        /**
         * Sets the value of {@link Route53HealthCheckConfig#getReferenceName}
         * @param referenceName the value to be set.
         * @return {@code this}
         */
        public Builder referenceName(java.lang.String referenceName) {
            this.referenceName = referenceName;
            return this;
        }

        /**
         * Sets the value of {@link Route53HealthCheckConfig#getRegions}
         * @param regions the value to be set.
         * @return {@code this}
         */
        public Builder regions(java.util.List<java.lang.String> regions) {
            this.regions = regions;
            return this;
        }

        /**
         * Sets the value of {@link Route53HealthCheckConfig#getRequestInterval}
         * @param requestInterval the value to be set.
         * @return {@code this}
         */
        public Builder requestInterval(java.lang.Number requestInterval) {
            this.requestInterval = requestInterval;
            return this;
        }

        /**
         * Sets the value of {@link Route53HealthCheckConfig#getResourcePath}
         * @param resourcePath the value to be set.
         * @return {@code this}
         */
        public Builder resourcePath(java.lang.String resourcePath) {
            this.resourcePath = resourcePath;
            return this;
        }

        /**
         * Sets the value of {@link Route53HealthCheckConfig#getSearchString}
         * @param searchString the value to be set.
         * @return {@code this}
         */
        public Builder searchString(java.lang.String searchString) {
            this.searchString = searchString;
            return this;
        }

        /**
         * Sets the value of {@link Route53HealthCheckConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link Route53HealthCheckConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link Route53HealthCheckConfig#getDependsOn}
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
         * Sets the value of {@link Route53HealthCheckConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link Route53HealthCheckConfig#getProvider}
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
         * @return a new instance of {@link Route53HealthCheckConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Route53HealthCheckConfig build() {
            return new Jsii$Proxy(type, childHealthchecks, childHealthThreshold, cloudwatchAlarmName, cloudwatchAlarmRegion, enableSni, failureThreshold, fqdn, insufficientDataHealthStatus, invertHealthcheck, ipAddress, measureLatency, port, referenceName, regions, requestInterval, resourcePath, searchString, tags, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link Route53HealthCheckConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Route53HealthCheckConfig {
        private final java.lang.String type;
        private final java.util.List<java.lang.String> childHealthchecks;
        private final java.lang.Number childHealthThreshold;
        private final java.lang.String cloudwatchAlarmName;
        private final java.lang.String cloudwatchAlarmRegion;
        private final java.lang.Boolean enableSni;
        private final java.lang.Number failureThreshold;
        private final java.lang.String fqdn;
        private final java.lang.String insufficientDataHealthStatus;
        private final java.lang.Boolean invertHealthcheck;
        private final java.lang.String ipAddress;
        private final java.lang.Boolean measureLatency;
        private final java.lang.Number port;
        private final java.lang.String referenceName;
        private final java.util.List<java.lang.String> regions;
        private final java.lang.Number requestInterval;
        private final java.lang.String resourcePath;
        private final java.lang.String searchString;
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
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.childHealthchecks = software.amazon.jsii.Kernel.get(this, "childHealthchecks", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.childHealthThreshold = software.amazon.jsii.Kernel.get(this, "childHealthThreshold", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.cloudwatchAlarmName = software.amazon.jsii.Kernel.get(this, "cloudwatchAlarmName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.cloudwatchAlarmRegion = software.amazon.jsii.Kernel.get(this, "cloudwatchAlarmRegion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.enableSni = software.amazon.jsii.Kernel.get(this, "enableSni", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.failureThreshold = software.amazon.jsii.Kernel.get(this, "failureThreshold", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.fqdn = software.amazon.jsii.Kernel.get(this, "fqdn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.insufficientDataHealthStatus = software.amazon.jsii.Kernel.get(this, "insufficientDataHealthStatus", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.invertHealthcheck = software.amazon.jsii.Kernel.get(this, "invertHealthcheck", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.ipAddress = software.amazon.jsii.Kernel.get(this, "ipAddress", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.measureLatency = software.amazon.jsii.Kernel.get(this, "measureLatency", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.port = software.amazon.jsii.Kernel.get(this, "port", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.referenceName = software.amazon.jsii.Kernel.get(this, "referenceName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.regions = software.amazon.jsii.Kernel.get(this, "regions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.requestInterval = software.amazon.jsii.Kernel.get(this, "requestInterval", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.resourcePath = software.amazon.jsii.Kernel.get(this, "resourcePath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.searchString = software.amazon.jsii.Kernel.get(this, "searchString", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
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
        protected Jsii$Proxy(final java.lang.String type, final java.util.List<java.lang.String> childHealthchecks, final java.lang.Number childHealthThreshold, final java.lang.String cloudwatchAlarmName, final java.lang.String cloudwatchAlarmRegion, final java.lang.Boolean enableSni, final java.lang.Number failureThreshold, final java.lang.String fqdn, final java.lang.String insufficientDataHealthStatus, final java.lang.Boolean invertHealthcheck, final java.lang.String ipAddress, final java.lang.Boolean measureLatency, final java.lang.Number port, final java.lang.String referenceName, final java.util.List<java.lang.String> regions, final java.lang.Number requestInterval, final java.lang.String resourcePath, final java.lang.String searchString, final java.util.Map<java.lang.String, java.lang.String> tags, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.type = java.util.Objects.requireNonNull(type, "type is required");
            this.childHealthchecks = childHealthchecks;
            this.childHealthThreshold = childHealthThreshold;
            this.cloudwatchAlarmName = cloudwatchAlarmName;
            this.cloudwatchAlarmRegion = cloudwatchAlarmRegion;
            this.enableSni = enableSni;
            this.failureThreshold = failureThreshold;
            this.fqdn = fqdn;
            this.insufficientDataHealthStatus = insufficientDataHealthStatus;
            this.invertHealthcheck = invertHealthcheck;
            this.ipAddress = ipAddress;
            this.measureLatency = measureLatency;
            this.port = port;
            this.referenceName = referenceName;
            this.regions = regions;
            this.requestInterval = requestInterval;
            this.resourcePath = resourcePath;
            this.searchString = searchString;
            this.tags = tags;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        public final java.util.List<java.lang.String> getChildHealthchecks() {
            return this.childHealthchecks;
        }

        @Override
        public final java.lang.Number getChildHealthThreshold() {
            return this.childHealthThreshold;
        }

        @Override
        public final java.lang.String getCloudwatchAlarmName() {
            return this.cloudwatchAlarmName;
        }

        @Override
        public final java.lang.String getCloudwatchAlarmRegion() {
            return this.cloudwatchAlarmRegion;
        }

        @Override
        public final java.lang.Boolean getEnableSni() {
            return this.enableSni;
        }

        @Override
        public final java.lang.Number getFailureThreshold() {
            return this.failureThreshold;
        }

        @Override
        public final java.lang.String getFqdn() {
            return this.fqdn;
        }

        @Override
        public final java.lang.String getInsufficientDataHealthStatus() {
            return this.insufficientDataHealthStatus;
        }

        @Override
        public final java.lang.Boolean getInvertHealthcheck() {
            return this.invertHealthcheck;
        }

        @Override
        public final java.lang.String getIpAddress() {
            return this.ipAddress;
        }

        @Override
        public final java.lang.Boolean getMeasureLatency() {
            return this.measureLatency;
        }

        @Override
        public final java.lang.Number getPort() {
            return this.port;
        }

        @Override
        public final java.lang.String getReferenceName() {
            return this.referenceName;
        }

        @Override
        public final java.util.List<java.lang.String> getRegions() {
            return this.regions;
        }

        @Override
        public final java.lang.Number getRequestInterval() {
            return this.requestInterval;
        }

        @Override
        public final java.lang.String getResourcePath() {
            return this.resourcePath;
        }

        @Override
        public final java.lang.String getSearchString() {
            return this.searchString;
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

            data.set("type", om.valueToTree(this.getType()));
            if (this.getChildHealthchecks() != null) {
                data.set("childHealthchecks", om.valueToTree(this.getChildHealthchecks()));
            }
            if (this.getChildHealthThreshold() != null) {
                data.set("childHealthThreshold", om.valueToTree(this.getChildHealthThreshold()));
            }
            if (this.getCloudwatchAlarmName() != null) {
                data.set("cloudwatchAlarmName", om.valueToTree(this.getCloudwatchAlarmName()));
            }
            if (this.getCloudwatchAlarmRegion() != null) {
                data.set("cloudwatchAlarmRegion", om.valueToTree(this.getCloudwatchAlarmRegion()));
            }
            if (this.getEnableSni() != null) {
                data.set("enableSni", om.valueToTree(this.getEnableSni()));
            }
            if (this.getFailureThreshold() != null) {
                data.set("failureThreshold", om.valueToTree(this.getFailureThreshold()));
            }
            if (this.getFqdn() != null) {
                data.set("fqdn", om.valueToTree(this.getFqdn()));
            }
            if (this.getInsufficientDataHealthStatus() != null) {
                data.set("insufficientDataHealthStatus", om.valueToTree(this.getInsufficientDataHealthStatus()));
            }
            if (this.getInvertHealthcheck() != null) {
                data.set("invertHealthcheck", om.valueToTree(this.getInvertHealthcheck()));
            }
            if (this.getIpAddress() != null) {
                data.set("ipAddress", om.valueToTree(this.getIpAddress()));
            }
            if (this.getMeasureLatency() != null) {
                data.set("measureLatency", om.valueToTree(this.getMeasureLatency()));
            }
            if (this.getPort() != null) {
                data.set("port", om.valueToTree(this.getPort()));
            }
            if (this.getReferenceName() != null) {
                data.set("referenceName", om.valueToTree(this.getReferenceName()));
            }
            if (this.getRegions() != null) {
                data.set("regions", om.valueToTree(this.getRegions()));
            }
            if (this.getRequestInterval() != null) {
                data.set("requestInterval", om.valueToTree(this.getRequestInterval()));
            }
            if (this.getResourcePath() != null) {
                data.set("resourcePath", om.valueToTree(this.getResourcePath()));
            }
            if (this.getSearchString() != null) {
                data.set("searchString", om.valueToTree(this.getSearchString()));
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
            struct.set("fqn", om.valueToTree("aws.Route53HealthCheckConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Route53HealthCheckConfig.Jsii$Proxy that = (Route53HealthCheckConfig.Jsii$Proxy) o;

            if (!type.equals(that.type)) return false;
            if (this.childHealthchecks != null ? !this.childHealthchecks.equals(that.childHealthchecks) : that.childHealthchecks != null) return false;
            if (this.childHealthThreshold != null ? !this.childHealthThreshold.equals(that.childHealthThreshold) : that.childHealthThreshold != null) return false;
            if (this.cloudwatchAlarmName != null ? !this.cloudwatchAlarmName.equals(that.cloudwatchAlarmName) : that.cloudwatchAlarmName != null) return false;
            if (this.cloudwatchAlarmRegion != null ? !this.cloudwatchAlarmRegion.equals(that.cloudwatchAlarmRegion) : that.cloudwatchAlarmRegion != null) return false;
            if (this.enableSni != null ? !this.enableSni.equals(that.enableSni) : that.enableSni != null) return false;
            if (this.failureThreshold != null ? !this.failureThreshold.equals(that.failureThreshold) : that.failureThreshold != null) return false;
            if (this.fqdn != null ? !this.fqdn.equals(that.fqdn) : that.fqdn != null) return false;
            if (this.insufficientDataHealthStatus != null ? !this.insufficientDataHealthStatus.equals(that.insufficientDataHealthStatus) : that.insufficientDataHealthStatus != null) return false;
            if (this.invertHealthcheck != null ? !this.invertHealthcheck.equals(that.invertHealthcheck) : that.invertHealthcheck != null) return false;
            if (this.ipAddress != null ? !this.ipAddress.equals(that.ipAddress) : that.ipAddress != null) return false;
            if (this.measureLatency != null ? !this.measureLatency.equals(that.measureLatency) : that.measureLatency != null) return false;
            if (this.port != null ? !this.port.equals(that.port) : that.port != null) return false;
            if (this.referenceName != null ? !this.referenceName.equals(that.referenceName) : that.referenceName != null) return false;
            if (this.regions != null ? !this.regions.equals(that.regions) : that.regions != null) return false;
            if (this.requestInterval != null ? !this.requestInterval.equals(that.requestInterval) : that.requestInterval != null) return false;
            if (this.resourcePath != null ? !this.resourcePath.equals(that.resourcePath) : that.resourcePath != null) return false;
            if (this.searchString != null ? !this.searchString.equals(that.searchString) : that.searchString != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.type.hashCode();
            result = 31 * result + (this.childHealthchecks != null ? this.childHealthchecks.hashCode() : 0);
            result = 31 * result + (this.childHealthThreshold != null ? this.childHealthThreshold.hashCode() : 0);
            result = 31 * result + (this.cloudwatchAlarmName != null ? this.cloudwatchAlarmName.hashCode() : 0);
            result = 31 * result + (this.cloudwatchAlarmRegion != null ? this.cloudwatchAlarmRegion.hashCode() : 0);
            result = 31 * result + (this.enableSni != null ? this.enableSni.hashCode() : 0);
            result = 31 * result + (this.failureThreshold != null ? this.failureThreshold.hashCode() : 0);
            result = 31 * result + (this.fqdn != null ? this.fqdn.hashCode() : 0);
            result = 31 * result + (this.insufficientDataHealthStatus != null ? this.insufficientDataHealthStatus.hashCode() : 0);
            result = 31 * result + (this.invertHealthcheck != null ? this.invertHealthcheck.hashCode() : 0);
            result = 31 * result + (this.ipAddress != null ? this.ipAddress.hashCode() : 0);
            result = 31 * result + (this.measureLatency != null ? this.measureLatency.hashCode() : 0);
            result = 31 * result + (this.port != null ? this.port.hashCode() : 0);
            result = 31 * result + (this.referenceName != null ? this.referenceName.hashCode() : 0);
            result = 31 * result + (this.regions != null ? this.regions.hashCode() : 0);
            result = 31 * result + (this.requestInterval != null ? this.requestInterval.hashCode() : 0);
            result = 31 * result + (this.resourcePath != null ? this.resourcePath.hashCode() : 0);
            result = 31 * result + (this.searchString != null ? this.searchString.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
