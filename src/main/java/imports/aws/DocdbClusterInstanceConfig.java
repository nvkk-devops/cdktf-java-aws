package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.450Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.DocdbClusterInstanceConfig")
@software.amazon.jsii.Jsii.Proxy(DocdbClusterInstanceConfig.Jsii$Proxy.class)
public interface DocdbClusterInstanceConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getClusterIdentifier();

    @org.jetbrains.annotations.NotNull java.lang.String getInstanceClass();

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getApplyImmediately() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAutoMinorVersionUpgrade() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getAvailabilityZone() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getCaCertIdentifier() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getEngine() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getIdentifier() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getIdentifierPrefix() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPreferredMaintenanceWindow() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getPromotionTier() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * timeouts block.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.DocdbClusterInstanceTimeouts getTimeouts() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DocdbClusterInstanceConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DocdbClusterInstanceConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DocdbClusterInstanceConfig> {
        private java.lang.String clusterIdentifier;
        private java.lang.String instanceClass;
        private java.lang.Boolean applyImmediately;
        private java.lang.Boolean autoMinorVersionUpgrade;
        private java.lang.String availabilityZone;
        private java.lang.String caCertIdentifier;
        private java.lang.String engine;
        private java.lang.String identifier;
        private java.lang.String identifierPrefix;
        private java.lang.String preferredMaintenanceWindow;
        private java.lang.Number promotionTier;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private imports.aws.DocdbClusterInstanceTimeouts timeouts;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link DocdbClusterInstanceConfig#getClusterIdentifier}
         * @param clusterIdentifier the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder clusterIdentifier(java.lang.String clusterIdentifier) {
            this.clusterIdentifier = clusterIdentifier;
            return this;
        }

        /**
         * Sets the value of {@link DocdbClusterInstanceConfig#getInstanceClass}
         * @param instanceClass the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder instanceClass(java.lang.String instanceClass) {
            this.instanceClass = instanceClass;
            return this;
        }

        /**
         * Sets the value of {@link DocdbClusterInstanceConfig#getApplyImmediately}
         * @param applyImmediately the value to be set.
         * @return {@code this}
         */
        public Builder applyImmediately(java.lang.Boolean applyImmediately) {
            this.applyImmediately = applyImmediately;
            return this;
        }

        /**
         * Sets the value of {@link DocdbClusterInstanceConfig#getAutoMinorVersionUpgrade}
         * @param autoMinorVersionUpgrade the value to be set.
         * @return {@code this}
         */
        public Builder autoMinorVersionUpgrade(java.lang.Boolean autoMinorVersionUpgrade) {
            this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
            return this;
        }

        /**
         * Sets the value of {@link DocdbClusterInstanceConfig#getAvailabilityZone}
         * @param availabilityZone the value to be set.
         * @return {@code this}
         */
        public Builder availabilityZone(java.lang.String availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }

        /**
         * Sets the value of {@link DocdbClusterInstanceConfig#getCaCertIdentifier}
         * @param caCertIdentifier the value to be set.
         * @return {@code this}
         */
        public Builder caCertIdentifier(java.lang.String caCertIdentifier) {
            this.caCertIdentifier = caCertIdentifier;
            return this;
        }

        /**
         * Sets the value of {@link DocdbClusterInstanceConfig#getEngine}
         * @param engine the value to be set.
         * @return {@code this}
         */
        public Builder engine(java.lang.String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * Sets the value of {@link DocdbClusterInstanceConfig#getIdentifier}
         * @param identifier the value to be set.
         * @return {@code this}
         */
        public Builder identifier(java.lang.String identifier) {
            this.identifier = identifier;
            return this;
        }

        /**
         * Sets the value of {@link DocdbClusterInstanceConfig#getIdentifierPrefix}
         * @param identifierPrefix the value to be set.
         * @return {@code this}
         */
        public Builder identifierPrefix(java.lang.String identifierPrefix) {
            this.identifierPrefix = identifierPrefix;
            return this;
        }

        /**
         * Sets the value of {@link DocdbClusterInstanceConfig#getPreferredMaintenanceWindow}
         * @param preferredMaintenanceWindow the value to be set.
         * @return {@code this}
         */
        public Builder preferredMaintenanceWindow(java.lang.String preferredMaintenanceWindow) {
            this.preferredMaintenanceWindow = preferredMaintenanceWindow;
            return this;
        }

        /**
         * Sets the value of {@link DocdbClusterInstanceConfig#getPromotionTier}
         * @param promotionTier the value to be set.
         * @return {@code this}
         */
        public Builder promotionTier(java.lang.Number promotionTier) {
            this.promotionTier = promotionTier;
            return this;
        }

        /**
         * Sets the value of {@link DocdbClusterInstanceConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link DocdbClusterInstanceConfig#getTimeouts}
         * @param timeouts timeouts block.
         * @return {@code this}
         */
        public Builder timeouts(imports.aws.DocdbClusterInstanceTimeouts timeouts) {
            this.timeouts = timeouts;
            return this;
        }

        /**
         * Sets the value of {@link DocdbClusterInstanceConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link DocdbClusterInstanceConfig#getDependsOn}
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
         * Sets the value of {@link DocdbClusterInstanceConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link DocdbClusterInstanceConfig#getProvider}
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
         * @return a new instance of {@link DocdbClusterInstanceConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DocdbClusterInstanceConfig build() {
            return new Jsii$Proxy(clusterIdentifier, instanceClass, applyImmediately, autoMinorVersionUpgrade, availabilityZone, caCertIdentifier, engine, identifier, identifierPrefix, preferredMaintenanceWindow, promotionTier, tags, timeouts, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link DocdbClusterInstanceConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DocdbClusterInstanceConfig {
        private final java.lang.String clusterIdentifier;
        private final java.lang.String instanceClass;
        private final java.lang.Boolean applyImmediately;
        private final java.lang.Boolean autoMinorVersionUpgrade;
        private final java.lang.String availabilityZone;
        private final java.lang.String caCertIdentifier;
        private final java.lang.String engine;
        private final java.lang.String identifier;
        private final java.lang.String identifierPrefix;
        private final java.lang.String preferredMaintenanceWindow;
        private final java.lang.Number promotionTier;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final imports.aws.DocdbClusterInstanceTimeouts timeouts;
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
            this.clusterIdentifier = software.amazon.jsii.Kernel.get(this, "clusterIdentifier", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.instanceClass = software.amazon.jsii.Kernel.get(this, "instanceClass", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.applyImmediately = software.amazon.jsii.Kernel.get(this, "applyImmediately", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.autoMinorVersionUpgrade = software.amazon.jsii.Kernel.get(this, "autoMinorVersionUpgrade", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.availabilityZone = software.amazon.jsii.Kernel.get(this, "availabilityZone", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.caCertIdentifier = software.amazon.jsii.Kernel.get(this, "caCertIdentifier", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.engine = software.amazon.jsii.Kernel.get(this, "engine", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.identifier = software.amazon.jsii.Kernel.get(this, "identifier", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.identifierPrefix = software.amazon.jsii.Kernel.get(this, "identifierPrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.preferredMaintenanceWindow = software.amazon.jsii.Kernel.get(this, "preferredMaintenanceWindow", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.promotionTier = software.amazon.jsii.Kernel.get(this, "promotionTier", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.timeouts = software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.DocdbClusterInstanceTimeouts.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String clusterIdentifier, final java.lang.String instanceClass, final java.lang.Boolean applyImmediately, final java.lang.Boolean autoMinorVersionUpgrade, final java.lang.String availabilityZone, final java.lang.String caCertIdentifier, final java.lang.String engine, final java.lang.String identifier, final java.lang.String identifierPrefix, final java.lang.String preferredMaintenanceWindow, final java.lang.Number promotionTier, final java.util.Map<java.lang.String, java.lang.String> tags, final imports.aws.DocdbClusterInstanceTimeouts timeouts, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.clusterIdentifier = java.util.Objects.requireNonNull(clusterIdentifier, "clusterIdentifier is required");
            this.instanceClass = java.util.Objects.requireNonNull(instanceClass, "instanceClass is required");
            this.applyImmediately = applyImmediately;
            this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
            this.availabilityZone = availabilityZone;
            this.caCertIdentifier = caCertIdentifier;
            this.engine = engine;
            this.identifier = identifier;
            this.identifierPrefix = identifierPrefix;
            this.preferredMaintenanceWindow = preferredMaintenanceWindow;
            this.promotionTier = promotionTier;
            this.tags = tags;
            this.timeouts = timeouts;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getClusterIdentifier() {
            return this.clusterIdentifier;
        }

        @Override
        public final java.lang.String getInstanceClass() {
            return this.instanceClass;
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
        public final java.lang.String getCaCertIdentifier() {
            return this.caCertIdentifier;
        }

        @Override
        public final java.lang.String getEngine() {
            return this.engine;
        }

        @Override
        public final java.lang.String getIdentifier() {
            return this.identifier;
        }

        @Override
        public final java.lang.String getIdentifierPrefix() {
            return this.identifierPrefix;
        }

        @Override
        public final java.lang.String getPreferredMaintenanceWindow() {
            return this.preferredMaintenanceWindow;
        }

        @Override
        public final java.lang.Number getPromotionTier() {
            return this.promotionTier;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final imports.aws.DocdbClusterInstanceTimeouts getTimeouts() {
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

            data.set("clusterIdentifier", om.valueToTree(this.getClusterIdentifier()));
            data.set("instanceClass", om.valueToTree(this.getInstanceClass()));
            if (this.getApplyImmediately() != null) {
                data.set("applyImmediately", om.valueToTree(this.getApplyImmediately()));
            }
            if (this.getAutoMinorVersionUpgrade() != null) {
                data.set("autoMinorVersionUpgrade", om.valueToTree(this.getAutoMinorVersionUpgrade()));
            }
            if (this.getAvailabilityZone() != null) {
                data.set("availabilityZone", om.valueToTree(this.getAvailabilityZone()));
            }
            if (this.getCaCertIdentifier() != null) {
                data.set("caCertIdentifier", om.valueToTree(this.getCaCertIdentifier()));
            }
            if (this.getEngine() != null) {
                data.set("engine", om.valueToTree(this.getEngine()));
            }
            if (this.getIdentifier() != null) {
                data.set("identifier", om.valueToTree(this.getIdentifier()));
            }
            if (this.getIdentifierPrefix() != null) {
                data.set("identifierPrefix", om.valueToTree(this.getIdentifierPrefix()));
            }
            if (this.getPreferredMaintenanceWindow() != null) {
                data.set("preferredMaintenanceWindow", om.valueToTree(this.getPreferredMaintenanceWindow()));
            }
            if (this.getPromotionTier() != null) {
                data.set("promotionTier", om.valueToTree(this.getPromotionTier()));
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
            struct.set("fqn", om.valueToTree("aws.DocdbClusterInstanceConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DocdbClusterInstanceConfig.Jsii$Proxy that = (DocdbClusterInstanceConfig.Jsii$Proxy) o;

            if (!clusterIdentifier.equals(that.clusterIdentifier)) return false;
            if (!instanceClass.equals(that.instanceClass)) return false;
            if (this.applyImmediately != null ? !this.applyImmediately.equals(that.applyImmediately) : that.applyImmediately != null) return false;
            if (this.autoMinorVersionUpgrade != null ? !this.autoMinorVersionUpgrade.equals(that.autoMinorVersionUpgrade) : that.autoMinorVersionUpgrade != null) return false;
            if (this.availabilityZone != null ? !this.availabilityZone.equals(that.availabilityZone) : that.availabilityZone != null) return false;
            if (this.caCertIdentifier != null ? !this.caCertIdentifier.equals(that.caCertIdentifier) : that.caCertIdentifier != null) return false;
            if (this.engine != null ? !this.engine.equals(that.engine) : that.engine != null) return false;
            if (this.identifier != null ? !this.identifier.equals(that.identifier) : that.identifier != null) return false;
            if (this.identifierPrefix != null ? !this.identifierPrefix.equals(that.identifierPrefix) : that.identifierPrefix != null) return false;
            if (this.preferredMaintenanceWindow != null ? !this.preferredMaintenanceWindow.equals(that.preferredMaintenanceWindow) : that.preferredMaintenanceWindow != null) return false;
            if (this.promotionTier != null ? !this.promotionTier.equals(that.promotionTier) : that.promotionTier != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.timeouts != null ? !this.timeouts.equals(that.timeouts) : that.timeouts != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.clusterIdentifier.hashCode();
            result = 31 * result + (this.instanceClass.hashCode());
            result = 31 * result + (this.applyImmediately != null ? this.applyImmediately.hashCode() : 0);
            result = 31 * result + (this.autoMinorVersionUpgrade != null ? this.autoMinorVersionUpgrade.hashCode() : 0);
            result = 31 * result + (this.availabilityZone != null ? this.availabilityZone.hashCode() : 0);
            result = 31 * result + (this.caCertIdentifier != null ? this.caCertIdentifier.hashCode() : 0);
            result = 31 * result + (this.engine != null ? this.engine.hashCode() : 0);
            result = 31 * result + (this.identifier != null ? this.identifier.hashCode() : 0);
            result = 31 * result + (this.identifierPrefix != null ? this.identifierPrefix.hashCode() : 0);
            result = 31 * result + (this.preferredMaintenanceWindow != null ? this.preferredMaintenanceWindow.hashCode() : 0);
            result = 31 * result + (this.promotionTier != null ? this.promotionTier.hashCode() : 0);
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
