package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.892Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.SsmAssociationConfig")
@software.amazon.jsii.Jsii.Proxy(SsmAssociationConfig.Jsii$Proxy.class)
public interface SsmAssociationConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    default @org.jetbrains.annotations.Nullable java.lang.String getAssociationName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getAutomationTargetParameterName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getComplianceSeverity() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDocumentVersion() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getInstanceId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getMaxConcurrency() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getMaxErrors() {
        return null;
    }

    /**
     * output_location block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SsmAssociationOutputLocation> getOutputLocation() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getParameters() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getScheduleExpression() {
        return null;
    }

    /**
     * targets block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SsmAssociationTargets> getTargets() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SsmAssociationConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SsmAssociationConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SsmAssociationConfig> {
        private java.lang.String name;
        private java.lang.String associationName;
        private java.lang.String automationTargetParameterName;
        private java.lang.String complianceSeverity;
        private java.lang.String documentVersion;
        private java.lang.String instanceId;
        private java.lang.String maxConcurrency;
        private java.lang.String maxErrors;
        private java.util.List<imports.aws.SsmAssociationOutputLocation> outputLocation;
        private java.util.Map<java.lang.String, java.lang.String> parameters;
        private java.lang.String scheduleExpression;
        private java.util.List<imports.aws.SsmAssociationTargets> targets;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link SsmAssociationConfig#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link SsmAssociationConfig#getAssociationName}
         * @param associationName the value to be set.
         * @return {@code this}
         */
        public Builder associationName(java.lang.String associationName) {
            this.associationName = associationName;
            return this;
        }

        /**
         * Sets the value of {@link SsmAssociationConfig#getAutomationTargetParameterName}
         * @param automationTargetParameterName the value to be set.
         * @return {@code this}
         */
        public Builder automationTargetParameterName(java.lang.String automationTargetParameterName) {
            this.automationTargetParameterName = automationTargetParameterName;
            return this;
        }

        /**
         * Sets the value of {@link SsmAssociationConfig#getComplianceSeverity}
         * @param complianceSeverity the value to be set.
         * @return {@code this}
         */
        public Builder complianceSeverity(java.lang.String complianceSeverity) {
            this.complianceSeverity = complianceSeverity;
            return this;
        }

        /**
         * Sets the value of {@link SsmAssociationConfig#getDocumentVersion}
         * @param documentVersion the value to be set.
         * @return {@code this}
         */
        public Builder documentVersion(java.lang.String documentVersion) {
            this.documentVersion = documentVersion;
            return this;
        }

        /**
         * Sets the value of {@link SsmAssociationConfig#getInstanceId}
         * @param instanceId the value to be set.
         * @return {@code this}
         */
        public Builder instanceId(java.lang.String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Sets the value of {@link SsmAssociationConfig#getMaxConcurrency}
         * @param maxConcurrency the value to be set.
         * @return {@code this}
         */
        public Builder maxConcurrency(java.lang.String maxConcurrency) {
            this.maxConcurrency = maxConcurrency;
            return this;
        }

        /**
         * Sets the value of {@link SsmAssociationConfig#getMaxErrors}
         * @param maxErrors the value to be set.
         * @return {@code this}
         */
        public Builder maxErrors(java.lang.String maxErrors) {
            this.maxErrors = maxErrors;
            return this;
        }

        /**
         * Sets the value of {@link SsmAssociationConfig#getOutputLocation}
         * @param outputLocation output_location block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder outputLocation(java.util.List<? extends imports.aws.SsmAssociationOutputLocation> outputLocation) {
            this.outputLocation = (java.util.List<imports.aws.SsmAssociationOutputLocation>)outputLocation;
            return this;
        }

        /**
         * Sets the value of {@link SsmAssociationConfig#getParameters}
         * @param parameters the value to be set.
         * @return {@code this}
         */
        public Builder parameters(java.util.Map<java.lang.String, java.lang.String> parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * Sets the value of {@link SsmAssociationConfig#getScheduleExpression}
         * @param scheduleExpression the value to be set.
         * @return {@code this}
         */
        public Builder scheduleExpression(java.lang.String scheduleExpression) {
            this.scheduleExpression = scheduleExpression;
            return this;
        }

        /**
         * Sets the value of {@link SsmAssociationConfig#getTargets}
         * @param targets targets block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder targets(java.util.List<? extends imports.aws.SsmAssociationTargets> targets) {
            this.targets = (java.util.List<imports.aws.SsmAssociationTargets>)targets;
            return this;
        }

        /**
         * Sets the value of {@link SsmAssociationConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link SsmAssociationConfig#getDependsOn}
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
         * Sets the value of {@link SsmAssociationConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link SsmAssociationConfig#getProvider}
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
         * @return a new instance of {@link SsmAssociationConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SsmAssociationConfig build() {
            return new Jsii$Proxy(name, associationName, automationTargetParameterName, complianceSeverity, documentVersion, instanceId, maxConcurrency, maxErrors, outputLocation, parameters, scheduleExpression, targets, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link SsmAssociationConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SsmAssociationConfig {
        private final java.lang.String name;
        private final java.lang.String associationName;
        private final java.lang.String automationTargetParameterName;
        private final java.lang.String complianceSeverity;
        private final java.lang.String documentVersion;
        private final java.lang.String instanceId;
        private final java.lang.String maxConcurrency;
        private final java.lang.String maxErrors;
        private final java.util.List<imports.aws.SsmAssociationOutputLocation> outputLocation;
        private final java.util.Map<java.lang.String, java.lang.String> parameters;
        private final java.lang.String scheduleExpression;
        private final java.util.List<imports.aws.SsmAssociationTargets> targets;
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
            this.associationName = software.amazon.jsii.Kernel.get(this, "associationName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.automationTargetParameterName = software.amazon.jsii.Kernel.get(this, "automationTargetParameterName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.complianceSeverity = software.amazon.jsii.Kernel.get(this, "complianceSeverity", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.documentVersion = software.amazon.jsii.Kernel.get(this, "documentVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.instanceId = software.amazon.jsii.Kernel.get(this, "instanceId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.maxConcurrency = software.amazon.jsii.Kernel.get(this, "maxConcurrency", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.maxErrors = software.amazon.jsii.Kernel.get(this, "maxErrors", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.outputLocation = software.amazon.jsii.Kernel.get(this, "outputLocation", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SsmAssociationOutputLocation.class)));
            this.parameters = software.amazon.jsii.Kernel.get(this, "parameters", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.scheduleExpression = software.amazon.jsii.Kernel.get(this, "scheduleExpression", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.targets = software.amazon.jsii.Kernel.get(this, "targets", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SsmAssociationTargets.class)));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String name, final java.lang.String associationName, final java.lang.String automationTargetParameterName, final java.lang.String complianceSeverity, final java.lang.String documentVersion, final java.lang.String instanceId, final java.lang.String maxConcurrency, final java.lang.String maxErrors, final java.util.List<? extends imports.aws.SsmAssociationOutputLocation> outputLocation, final java.util.Map<java.lang.String, java.lang.String> parameters, final java.lang.String scheduleExpression, final java.util.List<? extends imports.aws.SsmAssociationTargets> targets, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.associationName = associationName;
            this.automationTargetParameterName = automationTargetParameterName;
            this.complianceSeverity = complianceSeverity;
            this.documentVersion = documentVersion;
            this.instanceId = instanceId;
            this.maxConcurrency = maxConcurrency;
            this.maxErrors = maxErrors;
            this.outputLocation = (java.util.List<imports.aws.SsmAssociationOutputLocation>)outputLocation;
            this.parameters = parameters;
            this.scheduleExpression = scheduleExpression;
            this.targets = (java.util.List<imports.aws.SsmAssociationTargets>)targets;
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
        public final java.lang.String getAssociationName() {
            return this.associationName;
        }

        @Override
        public final java.lang.String getAutomationTargetParameterName() {
            return this.automationTargetParameterName;
        }

        @Override
        public final java.lang.String getComplianceSeverity() {
            return this.complianceSeverity;
        }

        @Override
        public final java.lang.String getDocumentVersion() {
            return this.documentVersion;
        }

        @Override
        public final java.lang.String getInstanceId() {
            return this.instanceId;
        }

        @Override
        public final java.lang.String getMaxConcurrency() {
            return this.maxConcurrency;
        }

        @Override
        public final java.lang.String getMaxErrors() {
            return this.maxErrors;
        }

        @Override
        public final java.util.List<imports.aws.SsmAssociationOutputLocation> getOutputLocation() {
            return this.outputLocation;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getParameters() {
            return this.parameters;
        }

        @Override
        public final java.lang.String getScheduleExpression() {
            return this.scheduleExpression;
        }

        @Override
        public final java.util.List<imports.aws.SsmAssociationTargets> getTargets() {
            return this.targets;
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
            if (this.getAssociationName() != null) {
                data.set("associationName", om.valueToTree(this.getAssociationName()));
            }
            if (this.getAutomationTargetParameterName() != null) {
                data.set("automationTargetParameterName", om.valueToTree(this.getAutomationTargetParameterName()));
            }
            if (this.getComplianceSeverity() != null) {
                data.set("complianceSeverity", om.valueToTree(this.getComplianceSeverity()));
            }
            if (this.getDocumentVersion() != null) {
                data.set("documentVersion", om.valueToTree(this.getDocumentVersion()));
            }
            if (this.getInstanceId() != null) {
                data.set("instanceId", om.valueToTree(this.getInstanceId()));
            }
            if (this.getMaxConcurrency() != null) {
                data.set("maxConcurrency", om.valueToTree(this.getMaxConcurrency()));
            }
            if (this.getMaxErrors() != null) {
                data.set("maxErrors", om.valueToTree(this.getMaxErrors()));
            }
            if (this.getOutputLocation() != null) {
                data.set("outputLocation", om.valueToTree(this.getOutputLocation()));
            }
            if (this.getParameters() != null) {
                data.set("parameters", om.valueToTree(this.getParameters()));
            }
            if (this.getScheduleExpression() != null) {
                data.set("scheduleExpression", om.valueToTree(this.getScheduleExpression()));
            }
            if (this.getTargets() != null) {
                data.set("targets", om.valueToTree(this.getTargets()));
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
            struct.set("fqn", om.valueToTree("aws.SsmAssociationConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SsmAssociationConfig.Jsii$Proxy that = (SsmAssociationConfig.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (this.associationName != null ? !this.associationName.equals(that.associationName) : that.associationName != null) return false;
            if (this.automationTargetParameterName != null ? !this.automationTargetParameterName.equals(that.automationTargetParameterName) : that.automationTargetParameterName != null) return false;
            if (this.complianceSeverity != null ? !this.complianceSeverity.equals(that.complianceSeverity) : that.complianceSeverity != null) return false;
            if (this.documentVersion != null ? !this.documentVersion.equals(that.documentVersion) : that.documentVersion != null) return false;
            if (this.instanceId != null ? !this.instanceId.equals(that.instanceId) : that.instanceId != null) return false;
            if (this.maxConcurrency != null ? !this.maxConcurrency.equals(that.maxConcurrency) : that.maxConcurrency != null) return false;
            if (this.maxErrors != null ? !this.maxErrors.equals(that.maxErrors) : that.maxErrors != null) return false;
            if (this.outputLocation != null ? !this.outputLocation.equals(that.outputLocation) : that.outputLocation != null) return false;
            if (this.parameters != null ? !this.parameters.equals(that.parameters) : that.parameters != null) return false;
            if (this.scheduleExpression != null ? !this.scheduleExpression.equals(that.scheduleExpression) : that.scheduleExpression != null) return false;
            if (this.targets != null ? !this.targets.equals(that.targets) : that.targets != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.associationName != null ? this.associationName.hashCode() : 0);
            result = 31 * result + (this.automationTargetParameterName != null ? this.automationTargetParameterName.hashCode() : 0);
            result = 31 * result + (this.complianceSeverity != null ? this.complianceSeverity.hashCode() : 0);
            result = 31 * result + (this.documentVersion != null ? this.documentVersion.hashCode() : 0);
            result = 31 * result + (this.instanceId != null ? this.instanceId.hashCode() : 0);
            result = 31 * result + (this.maxConcurrency != null ? this.maxConcurrency.hashCode() : 0);
            result = 31 * result + (this.maxErrors != null ? this.maxErrors.hashCode() : 0);
            result = 31 * result + (this.outputLocation != null ? this.outputLocation.hashCode() : 0);
            result = 31 * result + (this.parameters != null ? this.parameters.hashCode() : 0);
            result = 31 * result + (this.scheduleExpression != null ? this.scheduleExpression.hashCode() : 0);
            result = 31 * result + (this.targets != null ? this.targets.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}