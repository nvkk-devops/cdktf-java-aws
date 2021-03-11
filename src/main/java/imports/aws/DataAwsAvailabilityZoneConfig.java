package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.236Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.DataAwsAvailabilityZoneConfig")
@software.amazon.jsii.Jsii.Proxy(DataAwsAvailabilityZoneConfig.Jsii$Proxy.class)
public interface DataAwsAvailabilityZoneConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAllAvailabilityZones() {
        return null;
    }

    /**
     * filter block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.DataAwsAvailabilityZoneFilter> getFilter() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getState() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getZoneId() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DataAwsAvailabilityZoneConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DataAwsAvailabilityZoneConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DataAwsAvailabilityZoneConfig> {
        private java.lang.Boolean allAvailabilityZones;
        private java.util.List<imports.aws.DataAwsAvailabilityZoneFilter> filter;
        private java.lang.String name;
        private java.lang.String state;
        private java.lang.String zoneId;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link DataAwsAvailabilityZoneConfig#getAllAvailabilityZones}
         * @param allAvailabilityZones the value to be set.
         * @return {@code this}
         */
        public Builder allAvailabilityZones(java.lang.Boolean allAvailabilityZones) {
            this.allAvailabilityZones = allAvailabilityZones;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsAvailabilityZoneConfig#getFilter}
         * @param filter filter block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder filter(java.util.List<? extends imports.aws.DataAwsAvailabilityZoneFilter> filter) {
            this.filter = (java.util.List<imports.aws.DataAwsAvailabilityZoneFilter>)filter;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsAvailabilityZoneConfig#getName}
         * @param name the value to be set.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsAvailabilityZoneConfig#getState}
         * @param state the value to be set.
         * @return {@code this}
         */
        public Builder state(java.lang.String state) {
            this.state = state;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsAvailabilityZoneConfig#getZoneId}
         * @param zoneId the value to be set.
         * @return {@code this}
         */
        public Builder zoneId(java.lang.String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsAvailabilityZoneConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsAvailabilityZoneConfig#getDependsOn}
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
         * Sets the value of {@link DataAwsAvailabilityZoneConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsAvailabilityZoneConfig#getProvider}
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
         * @return a new instance of {@link DataAwsAvailabilityZoneConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DataAwsAvailabilityZoneConfig build() {
            return new Jsii$Proxy(allAvailabilityZones, filter, name, state, zoneId, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link DataAwsAvailabilityZoneConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DataAwsAvailabilityZoneConfig {
        private final java.lang.Boolean allAvailabilityZones;
        private final java.util.List<imports.aws.DataAwsAvailabilityZoneFilter> filter;
        private final java.lang.String name;
        private final java.lang.String state;
        private final java.lang.String zoneId;
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
            this.allAvailabilityZones = software.amazon.jsii.Kernel.get(this, "allAvailabilityZones", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.filter = software.amazon.jsii.Kernel.get(this, "filter", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.DataAwsAvailabilityZoneFilter.class)));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.state = software.amazon.jsii.Kernel.get(this, "state", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.zoneId = software.amazon.jsii.Kernel.get(this, "zoneId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.Boolean allAvailabilityZones, final java.util.List<? extends imports.aws.DataAwsAvailabilityZoneFilter> filter, final java.lang.String name, final java.lang.String state, final java.lang.String zoneId, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.allAvailabilityZones = allAvailabilityZones;
            this.filter = (java.util.List<imports.aws.DataAwsAvailabilityZoneFilter>)filter;
            this.name = name;
            this.state = state;
            this.zoneId = zoneId;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.Boolean getAllAvailabilityZones() {
            return this.allAvailabilityZones;
        }

        @Override
        public final java.util.List<imports.aws.DataAwsAvailabilityZoneFilter> getFilter() {
            return this.filter;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getState() {
            return this.state;
        }

        @Override
        public final java.lang.String getZoneId() {
            return this.zoneId;
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

            if (this.getAllAvailabilityZones() != null) {
                data.set("allAvailabilityZones", om.valueToTree(this.getAllAvailabilityZones()));
            }
            if (this.getFilter() != null) {
                data.set("filter", om.valueToTree(this.getFilter()));
            }
            if (this.getName() != null) {
                data.set("name", om.valueToTree(this.getName()));
            }
            if (this.getState() != null) {
                data.set("state", om.valueToTree(this.getState()));
            }
            if (this.getZoneId() != null) {
                data.set("zoneId", om.valueToTree(this.getZoneId()));
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
            struct.set("fqn", om.valueToTree("aws.DataAwsAvailabilityZoneConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DataAwsAvailabilityZoneConfig.Jsii$Proxy that = (DataAwsAvailabilityZoneConfig.Jsii$Proxy) o;

            if (this.allAvailabilityZones != null ? !this.allAvailabilityZones.equals(that.allAvailabilityZones) : that.allAvailabilityZones != null) return false;
            if (this.filter != null ? !this.filter.equals(that.filter) : that.filter != null) return false;
            if (this.name != null ? !this.name.equals(that.name) : that.name != null) return false;
            if (this.state != null ? !this.state.equals(that.state) : that.state != null) return false;
            if (this.zoneId != null ? !this.zoneId.equals(that.zoneId) : that.zoneId != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.allAvailabilityZones != null ? this.allAvailabilityZones.hashCode() : 0;
            result = 31 * result + (this.filter != null ? this.filter.hashCode() : 0);
            result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
            result = 31 * result + (this.state != null ? this.state.hashCode() : 0);
            result = 31 * result + (this.zoneId != null ? this.zoneId.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
