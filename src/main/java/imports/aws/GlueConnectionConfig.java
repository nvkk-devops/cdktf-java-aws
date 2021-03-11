package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.593Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.GlueConnectionConfig")
@software.amazon.jsii.Jsii.Proxy(GlueConnectionConfig.Jsii$Proxy.class)
public interface GlueConnectionConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getConnectionProperties();

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    default @org.jetbrains.annotations.Nullable java.lang.String getCatalogId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getConnectionType() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getMatchCriteria() {
        return null;
    }

    /**
     * physical_connection_requirements block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.GlueConnectionPhysicalConnectionRequirements> getPhysicalConnectionRequirements() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link GlueConnectionConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link GlueConnectionConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<GlueConnectionConfig> {
        private java.util.Map<java.lang.String, java.lang.String> connectionProperties;
        private java.lang.String name;
        private java.lang.String catalogId;
        private java.lang.String connectionType;
        private java.lang.String description;
        private java.util.List<java.lang.String> matchCriteria;
        private java.util.List<imports.aws.GlueConnectionPhysicalConnectionRequirements> physicalConnectionRequirements;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link GlueConnectionConfig#getConnectionProperties}
         * @param connectionProperties the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder connectionProperties(java.util.Map<java.lang.String, java.lang.String> connectionProperties) {
            this.connectionProperties = connectionProperties;
            return this;
        }

        /**
         * Sets the value of {@link GlueConnectionConfig#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link GlueConnectionConfig#getCatalogId}
         * @param catalogId the value to be set.
         * @return {@code this}
         */
        public Builder catalogId(java.lang.String catalogId) {
            this.catalogId = catalogId;
            return this;
        }

        /**
         * Sets the value of {@link GlueConnectionConfig#getConnectionType}
         * @param connectionType the value to be set.
         * @return {@code this}
         */
        public Builder connectionType(java.lang.String connectionType) {
            this.connectionType = connectionType;
            return this;
        }

        /**
         * Sets the value of {@link GlueConnectionConfig#getDescription}
         * @param description the value to be set.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link GlueConnectionConfig#getMatchCriteria}
         * @param matchCriteria the value to be set.
         * @return {@code this}
         */
        public Builder matchCriteria(java.util.List<java.lang.String> matchCriteria) {
            this.matchCriteria = matchCriteria;
            return this;
        }

        /**
         * Sets the value of {@link GlueConnectionConfig#getPhysicalConnectionRequirements}
         * @param physicalConnectionRequirements physical_connection_requirements block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder physicalConnectionRequirements(java.util.List<? extends imports.aws.GlueConnectionPhysicalConnectionRequirements> physicalConnectionRequirements) {
            this.physicalConnectionRequirements = (java.util.List<imports.aws.GlueConnectionPhysicalConnectionRequirements>)physicalConnectionRequirements;
            return this;
        }

        /**
         * Sets the value of {@link GlueConnectionConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link GlueConnectionConfig#getDependsOn}
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
         * Sets the value of {@link GlueConnectionConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link GlueConnectionConfig#getProvider}
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
         * @return a new instance of {@link GlueConnectionConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public GlueConnectionConfig build() {
            return new Jsii$Proxy(connectionProperties, name, catalogId, connectionType, description, matchCriteria, physicalConnectionRequirements, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link GlueConnectionConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements GlueConnectionConfig {
        private final java.util.Map<java.lang.String, java.lang.String> connectionProperties;
        private final java.lang.String name;
        private final java.lang.String catalogId;
        private final java.lang.String connectionType;
        private final java.lang.String description;
        private final java.util.List<java.lang.String> matchCriteria;
        private final java.util.List<imports.aws.GlueConnectionPhysicalConnectionRequirements> physicalConnectionRequirements;
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
            this.connectionProperties = software.amazon.jsii.Kernel.get(this, "connectionProperties", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.catalogId = software.amazon.jsii.Kernel.get(this, "catalogId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.connectionType = software.amazon.jsii.Kernel.get(this, "connectionType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.matchCriteria = software.amazon.jsii.Kernel.get(this, "matchCriteria", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.physicalConnectionRequirements = software.amazon.jsii.Kernel.get(this, "physicalConnectionRequirements", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.GlueConnectionPhysicalConnectionRequirements.class)));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.Map<java.lang.String, java.lang.String> connectionProperties, final java.lang.String name, final java.lang.String catalogId, final java.lang.String connectionType, final java.lang.String description, final java.util.List<java.lang.String> matchCriteria, final java.util.List<? extends imports.aws.GlueConnectionPhysicalConnectionRequirements> physicalConnectionRequirements, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.connectionProperties = java.util.Objects.requireNonNull(connectionProperties, "connectionProperties is required");
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.catalogId = catalogId;
            this.connectionType = connectionType;
            this.description = description;
            this.matchCriteria = matchCriteria;
            this.physicalConnectionRequirements = (java.util.List<imports.aws.GlueConnectionPhysicalConnectionRequirements>)physicalConnectionRequirements;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getConnectionProperties() {
            return this.connectionProperties;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getCatalogId() {
            return this.catalogId;
        }

        @Override
        public final java.lang.String getConnectionType() {
            return this.connectionType;
        }

        @Override
        public final java.lang.String getDescription() {
            return this.description;
        }

        @Override
        public final java.util.List<java.lang.String> getMatchCriteria() {
            return this.matchCriteria;
        }

        @Override
        public final java.util.List<imports.aws.GlueConnectionPhysicalConnectionRequirements> getPhysicalConnectionRequirements() {
            return this.physicalConnectionRequirements;
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

            data.set("connectionProperties", om.valueToTree(this.getConnectionProperties()));
            data.set("name", om.valueToTree(this.getName()));
            if (this.getCatalogId() != null) {
                data.set("catalogId", om.valueToTree(this.getCatalogId()));
            }
            if (this.getConnectionType() != null) {
                data.set("connectionType", om.valueToTree(this.getConnectionType()));
            }
            if (this.getDescription() != null) {
                data.set("description", om.valueToTree(this.getDescription()));
            }
            if (this.getMatchCriteria() != null) {
                data.set("matchCriteria", om.valueToTree(this.getMatchCriteria()));
            }
            if (this.getPhysicalConnectionRequirements() != null) {
                data.set("physicalConnectionRequirements", om.valueToTree(this.getPhysicalConnectionRequirements()));
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
            struct.set("fqn", om.valueToTree("aws.GlueConnectionConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            GlueConnectionConfig.Jsii$Proxy that = (GlueConnectionConfig.Jsii$Proxy) o;

            if (!connectionProperties.equals(that.connectionProperties)) return false;
            if (!name.equals(that.name)) return false;
            if (this.catalogId != null ? !this.catalogId.equals(that.catalogId) : that.catalogId != null) return false;
            if (this.connectionType != null ? !this.connectionType.equals(that.connectionType) : that.connectionType != null) return false;
            if (this.description != null ? !this.description.equals(that.description) : that.description != null) return false;
            if (this.matchCriteria != null ? !this.matchCriteria.equals(that.matchCriteria) : that.matchCriteria != null) return false;
            if (this.physicalConnectionRequirements != null ? !this.physicalConnectionRequirements.equals(that.physicalConnectionRequirements) : that.physicalConnectionRequirements != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.connectionProperties.hashCode();
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.catalogId != null ? this.catalogId.hashCode() : 0);
            result = 31 * result + (this.connectionType != null ? this.connectionType.hashCode() : 0);
            result = 31 * result + (this.description != null ? this.description.hashCode() : 0);
            result = 31 * result + (this.matchCriteria != null ? this.matchCriteria.hashCode() : 0);
            result = 31 * result + (this.physicalConnectionRequirements != null ? this.physicalConnectionRequirements.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
