package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.815Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Route53RecordConfig")
@software.amazon.jsii.Jsii.Proxy(Route53RecordConfig.Jsii$Proxy.class)
public interface Route53RecordConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    @org.jetbrains.annotations.NotNull java.lang.String getType();

    @org.jetbrains.annotations.NotNull java.lang.String getZoneId();

    /**
     * alias block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Route53RecordAlias> getAlias() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAllowOverwrite() {
        return null;
    }

    /**
     * failover_routing_policy block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Route53RecordFailoverRoutingPolicy> getFailoverRoutingPolicy() {
        return null;
    }

    /**
     * geolocation_routing_policy block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Route53RecordGeolocationRoutingPolicy> getGeolocationRoutingPolicy() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getHealthCheckId() {
        return null;
    }

    /**
     * latency_routing_policy block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Route53RecordLatencyRoutingPolicy> getLatencyRoutingPolicy() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getMultivalueAnswerRoutingPolicy() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getRecords() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSetIdentifier() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getTtl() {
        return null;
    }

    /**
     * weighted_routing_policy block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.Route53RecordWeightedRoutingPolicy> getWeightedRoutingPolicy() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Route53RecordConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Route53RecordConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Route53RecordConfig> {
        private java.lang.String name;
        private java.lang.String type;
        private java.lang.String zoneId;
        private java.util.List<imports.aws.Route53RecordAlias> alias;
        private java.lang.Boolean allowOverwrite;
        private java.util.List<imports.aws.Route53RecordFailoverRoutingPolicy> failoverRoutingPolicy;
        private java.util.List<imports.aws.Route53RecordGeolocationRoutingPolicy> geolocationRoutingPolicy;
        private java.lang.String healthCheckId;
        private java.util.List<imports.aws.Route53RecordLatencyRoutingPolicy> latencyRoutingPolicy;
        private java.lang.Boolean multivalueAnswerRoutingPolicy;
        private java.util.List<java.lang.String> records;
        private java.lang.String setIdentifier;
        private java.lang.Number ttl;
        private java.util.List<imports.aws.Route53RecordWeightedRoutingPolicy> weightedRoutingPolicy;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link Route53RecordConfig#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link Route53RecordConfig#getType}
         * @param type the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link Route53RecordConfig#getZoneId}
         * @param zoneId the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder zoneId(java.lang.String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        /**
         * Sets the value of {@link Route53RecordConfig#getAlias}
         * @param alias alias block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder alias(java.util.List<? extends imports.aws.Route53RecordAlias> alias) {
            this.alias = (java.util.List<imports.aws.Route53RecordAlias>)alias;
            return this;
        }

        /**
         * Sets the value of {@link Route53RecordConfig#getAllowOverwrite}
         * @param allowOverwrite the value to be set.
         * @return {@code this}
         */
        public Builder allowOverwrite(java.lang.Boolean allowOverwrite) {
            this.allowOverwrite = allowOverwrite;
            return this;
        }

        /**
         * Sets the value of {@link Route53RecordConfig#getFailoverRoutingPolicy}
         * @param failoverRoutingPolicy failover_routing_policy block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder failoverRoutingPolicy(java.util.List<? extends imports.aws.Route53RecordFailoverRoutingPolicy> failoverRoutingPolicy) {
            this.failoverRoutingPolicy = (java.util.List<imports.aws.Route53RecordFailoverRoutingPolicy>)failoverRoutingPolicy;
            return this;
        }

        /**
         * Sets the value of {@link Route53RecordConfig#getGeolocationRoutingPolicy}
         * @param geolocationRoutingPolicy geolocation_routing_policy block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder geolocationRoutingPolicy(java.util.List<? extends imports.aws.Route53RecordGeolocationRoutingPolicy> geolocationRoutingPolicy) {
            this.geolocationRoutingPolicy = (java.util.List<imports.aws.Route53RecordGeolocationRoutingPolicy>)geolocationRoutingPolicy;
            return this;
        }

        /**
         * Sets the value of {@link Route53RecordConfig#getHealthCheckId}
         * @param healthCheckId the value to be set.
         * @return {@code this}
         */
        public Builder healthCheckId(java.lang.String healthCheckId) {
            this.healthCheckId = healthCheckId;
            return this;
        }

        /**
         * Sets the value of {@link Route53RecordConfig#getLatencyRoutingPolicy}
         * @param latencyRoutingPolicy latency_routing_policy block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder latencyRoutingPolicy(java.util.List<? extends imports.aws.Route53RecordLatencyRoutingPolicy> latencyRoutingPolicy) {
            this.latencyRoutingPolicy = (java.util.List<imports.aws.Route53RecordLatencyRoutingPolicy>)latencyRoutingPolicy;
            return this;
        }

        /**
         * Sets the value of {@link Route53RecordConfig#getMultivalueAnswerRoutingPolicy}
         * @param multivalueAnswerRoutingPolicy the value to be set.
         * @return {@code this}
         */
        public Builder multivalueAnswerRoutingPolicy(java.lang.Boolean multivalueAnswerRoutingPolicy) {
            this.multivalueAnswerRoutingPolicy = multivalueAnswerRoutingPolicy;
            return this;
        }

        /**
         * Sets the value of {@link Route53RecordConfig#getRecords}
         * @param records the value to be set.
         * @return {@code this}
         */
        public Builder records(java.util.List<java.lang.String> records) {
            this.records = records;
            return this;
        }

        /**
         * Sets the value of {@link Route53RecordConfig#getSetIdentifier}
         * @param setIdentifier the value to be set.
         * @return {@code this}
         */
        public Builder setIdentifier(java.lang.String setIdentifier) {
            this.setIdentifier = setIdentifier;
            return this;
        }

        /**
         * Sets the value of {@link Route53RecordConfig#getTtl}
         * @param ttl the value to be set.
         * @return {@code this}
         */
        public Builder ttl(java.lang.Number ttl) {
            this.ttl = ttl;
            return this;
        }

        /**
         * Sets the value of {@link Route53RecordConfig#getWeightedRoutingPolicy}
         * @param weightedRoutingPolicy weighted_routing_policy block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder weightedRoutingPolicy(java.util.List<? extends imports.aws.Route53RecordWeightedRoutingPolicy> weightedRoutingPolicy) {
            this.weightedRoutingPolicy = (java.util.List<imports.aws.Route53RecordWeightedRoutingPolicy>)weightedRoutingPolicy;
            return this;
        }

        /**
         * Sets the value of {@link Route53RecordConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link Route53RecordConfig#getDependsOn}
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
         * Sets the value of {@link Route53RecordConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link Route53RecordConfig#getProvider}
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
         * @return a new instance of {@link Route53RecordConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Route53RecordConfig build() {
            return new Jsii$Proxy(name, type, zoneId, alias, allowOverwrite, failoverRoutingPolicy, geolocationRoutingPolicy, healthCheckId, latencyRoutingPolicy, multivalueAnswerRoutingPolicy, records, setIdentifier, ttl, weightedRoutingPolicy, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link Route53RecordConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Route53RecordConfig {
        private final java.lang.String name;
        private final java.lang.String type;
        private final java.lang.String zoneId;
        private final java.util.List<imports.aws.Route53RecordAlias> alias;
        private final java.lang.Boolean allowOverwrite;
        private final java.util.List<imports.aws.Route53RecordFailoverRoutingPolicy> failoverRoutingPolicy;
        private final java.util.List<imports.aws.Route53RecordGeolocationRoutingPolicy> geolocationRoutingPolicy;
        private final java.lang.String healthCheckId;
        private final java.util.List<imports.aws.Route53RecordLatencyRoutingPolicy> latencyRoutingPolicy;
        private final java.lang.Boolean multivalueAnswerRoutingPolicy;
        private final java.util.List<java.lang.String> records;
        private final java.lang.String setIdentifier;
        private final java.lang.Number ttl;
        private final java.util.List<imports.aws.Route53RecordWeightedRoutingPolicy> weightedRoutingPolicy;
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
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.zoneId = software.amazon.jsii.Kernel.get(this, "zoneId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.alias = software.amazon.jsii.Kernel.get(this, "alias", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Route53RecordAlias.class)));
            this.allowOverwrite = software.amazon.jsii.Kernel.get(this, "allowOverwrite", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.failoverRoutingPolicy = software.amazon.jsii.Kernel.get(this, "failoverRoutingPolicy", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Route53RecordFailoverRoutingPolicy.class)));
            this.geolocationRoutingPolicy = software.amazon.jsii.Kernel.get(this, "geolocationRoutingPolicy", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Route53RecordGeolocationRoutingPolicy.class)));
            this.healthCheckId = software.amazon.jsii.Kernel.get(this, "healthCheckId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.latencyRoutingPolicy = software.amazon.jsii.Kernel.get(this, "latencyRoutingPolicy", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Route53RecordLatencyRoutingPolicy.class)));
            this.multivalueAnswerRoutingPolicy = software.amazon.jsii.Kernel.get(this, "multivalueAnswerRoutingPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.records = software.amazon.jsii.Kernel.get(this, "records", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.setIdentifier = software.amazon.jsii.Kernel.get(this, "setIdentifier", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.ttl = software.amazon.jsii.Kernel.get(this, "ttl", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.weightedRoutingPolicy = software.amazon.jsii.Kernel.get(this, "weightedRoutingPolicy", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.Route53RecordWeightedRoutingPolicy.class)));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String name, final java.lang.String type, final java.lang.String zoneId, final java.util.List<? extends imports.aws.Route53RecordAlias> alias, final java.lang.Boolean allowOverwrite, final java.util.List<? extends imports.aws.Route53RecordFailoverRoutingPolicy> failoverRoutingPolicy, final java.util.List<? extends imports.aws.Route53RecordGeolocationRoutingPolicy> geolocationRoutingPolicy, final java.lang.String healthCheckId, final java.util.List<? extends imports.aws.Route53RecordLatencyRoutingPolicy> latencyRoutingPolicy, final java.lang.Boolean multivalueAnswerRoutingPolicy, final java.util.List<java.lang.String> records, final java.lang.String setIdentifier, final java.lang.Number ttl, final java.util.List<? extends imports.aws.Route53RecordWeightedRoutingPolicy> weightedRoutingPolicy, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.type = java.util.Objects.requireNonNull(type, "type is required");
            this.zoneId = java.util.Objects.requireNonNull(zoneId, "zoneId is required");
            this.alias = (java.util.List<imports.aws.Route53RecordAlias>)alias;
            this.allowOverwrite = allowOverwrite;
            this.failoverRoutingPolicy = (java.util.List<imports.aws.Route53RecordFailoverRoutingPolicy>)failoverRoutingPolicy;
            this.geolocationRoutingPolicy = (java.util.List<imports.aws.Route53RecordGeolocationRoutingPolicy>)geolocationRoutingPolicy;
            this.healthCheckId = healthCheckId;
            this.latencyRoutingPolicy = (java.util.List<imports.aws.Route53RecordLatencyRoutingPolicy>)latencyRoutingPolicy;
            this.multivalueAnswerRoutingPolicy = multivalueAnswerRoutingPolicy;
            this.records = records;
            this.setIdentifier = setIdentifier;
            this.ttl = ttl;
            this.weightedRoutingPolicy = (java.util.List<imports.aws.Route53RecordWeightedRoutingPolicy>)weightedRoutingPolicy;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        public final java.lang.String getZoneId() {
            return this.zoneId;
        }

        @Override
        public final java.util.List<imports.aws.Route53RecordAlias> getAlias() {
            return this.alias;
        }

        @Override
        public final java.lang.Boolean getAllowOverwrite() {
            return this.allowOverwrite;
        }

        @Override
        public final java.util.List<imports.aws.Route53RecordFailoverRoutingPolicy> getFailoverRoutingPolicy() {
            return this.failoverRoutingPolicy;
        }

        @Override
        public final java.util.List<imports.aws.Route53RecordGeolocationRoutingPolicy> getGeolocationRoutingPolicy() {
            return this.geolocationRoutingPolicy;
        }

        @Override
        public final java.lang.String getHealthCheckId() {
            return this.healthCheckId;
        }

        @Override
        public final java.util.List<imports.aws.Route53RecordLatencyRoutingPolicy> getLatencyRoutingPolicy() {
            return this.latencyRoutingPolicy;
        }

        @Override
        public final java.lang.Boolean getMultivalueAnswerRoutingPolicy() {
            return this.multivalueAnswerRoutingPolicy;
        }

        @Override
        public final java.util.List<java.lang.String> getRecords() {
            return this.records;
        }

        @Override
        public final java.lang.String getSetIdentifier() {
            return this.setIdentifier;
        }

        @Override
        public final java.lang.Number getTtl() {
            return this.ttl;
        }

        @Override
        public final java.util.List<imports.aws.Route53RecordWeightedRoutingPolicy> getWeightedRoutingPolicy() {
            return this.weightedRoutingPolicy;
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

            data.set("name", om.valueToTree(this.getName()));
            data.set("type", om.valueToTree(this.getType()));
            data.set("zoneId", om.valueToTree(this.getZoneId()));
            if (this.getAlias() != null) {
                data.set("alias", om.valueToTree(this.getAlias()));
            }
            if (this.getAllowOverwrite() != null) {
                data.set("allowOverwrite", om.valueToTree(this.getAllowOverwrite()));
            }
            if (this.getFailoverRoutingPolicy() != null) {
                data.set("failoverRoutingPolicy", om.valueToTree(this.getFailoverRoutingPolicy()));
            }
            if (this.getGeolocationRoutingPolicy() != null) {
                data.set("geolocationRoutingPolicy", om.valueToTree(this.getGeolocationRoutingPolicy()));
            }
            if (this.getHealthCheckId() != null) {
                data.set("healthCheckId", om.valueToTree(this.getHealthCheckId()));
            }
            if (this.getLatencyRoutingPolicy() != null) {
                data.set("latencyRoutingPolicy", om.valueToTree(this.getLatencyRoutingPolicy()));
            }
            if (this.getMultivalueAnswerRoutingPolicy() != null) {
                data.set("multivalueAnswerRoutingPolicy", om.valueToTree(this.getMultivalueAnswerRoutingPolicy()));
            }
            if (this.getRecords() != null) {
                data.set("records", om.valueToTree(this.getRecords()));
            }
            if (this.getSetIdentifier() != null) {
                data.set("setIdentifier", om.valueToTree(this.getSetIdentifier()));
            }
            if (this.getTtl() != null) {
                data.set("ttl", om.valueToTree(this.getTtl()));
            }
            if (this.getWeightedRoutingPolicy() != null) {
                data.set("weightedRoutingPolicy", om.valueToTree(this.getWeightedRoutingPolicy()));
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
            struct.set("fqn", om.valueToTree("aws.Route53RecordConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Route53RecordConfig.Jsii$Proxy that = (Route53RecordConfig.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (!type.equals(that.type)) return false;
            if (!zoneId.equals(that.zoneId)) return false;
            if (this.alias != null ? !this.alias.equals(that.alias) : that.alias != null) return false;
            if (this.allowOverwrite != null ? !this.allowOverwrite.equals(that.allowOverwrite) : that.allowOverwrite != null) return false;
            if (this.failoverRoutingPolicy != null ? !this.failoverRoutingPolicy.equals(that.failoverRoutingPolicy) : that.failoverRoutingPolicy != null) return false;
            if (this.geolocationRoutingPolicy != null ? !this.geolocationRoutingPolicy.equals(that.geolocationRoutingPolicy) : that.geolocationRoutingPolicy != null) return false;
            if (this.healthCheckId != null ? !this.healthCheckId.equals(that.healthCheckId) : that.healthCheckId != null) return false;
            if (this.latencyRoutingPolicy != null ? !this.latencyRoutingPolicy.equals(that.latencyRoutingPolicy) : that.latencyRoutingPolicy != null) return false;
            if (this.multivalueAnswerRoutingPolicy != null ? !this.multivalueAnswerRoutingPolicy.equals(that.multivalueAnswerRoutingPolicy) : that.multivalueAnswerRoutingPolicy != null) return false;
            if (this.records != null ? !this.records.equals(that.records) : that.records != null) return false;
            if (this.setIdentifier != null ? !this.setIdentifier.equals(that.setIdentifier) : that.setIdentifier != null) return false;
            if (this.ttl != null ? !this.ttl.equals(that.ttl) : that.ttl != null) return false;
            if (this.weightedRoutingPolicy != null ? !this.weightedRoutingPolicy.equals(that.weightedRoutingPolicy) : that.weightedRoutingPolicy != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.type.hashCode());
            result = 31 * result + (this.zoneId.hashCode());
            result = 31 * result + (this.alias != null ? this.alias.hashCode() : 0);
            result = 31 * result + (this.allowOverwrite != null ? this.allowOverwrite.hashCode() : 0);
            result = 31 * result + (this.failoverRoutingPolicy != null ? this.failoverRoutingPolicy.hashCode() : 0);
            result = 31 * result + (this.geolocationRoutingPolicy != null ? this.geolocationRoutingPolicy.hashCode() : 0);
            result = 31 * result + (this.healthCheckId != null ? this.healthCheckId.hashCode() : 0);
            result = 31 * result + (this.latencyRoutingPolicy != null ? this.latencyRoutingPolicy.hashCode() : 0);
            result = 31 * result + (this.multivalueAnswerRoutingPolicy != null ? this.multivalueAnswerRoutingPolicy.hashCode() : 0);
            result = 31 * result + (this.records != null ? this.records.hashCode() : 0);
            result = 31 * result + (this.setIdentifier != null ? this.setIdentifier.hashCode() : 0);
            result = 31 * result + (this.ttl != null ? this.ttl.hashCode() : 0);
            result = 31 * result + (this.weightedRoutingPolicy != null ? this.weightedRoutingPolicy.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
