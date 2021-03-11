package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.188Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CodestarnotificationsNotificationRuleConfig")
@software.amazon.jsii.Jsii.Proxy(CodestarnotificationsNotificationRuleConfig.Jsii$Proxy.class)
public interface CodestarnotificationsNotificationRuleConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getDetailType();

    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getEventTypeIds();

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    @org.jetbrains.annotations.NotNull java.lang.String getResource();

    default @org.jetbrains.annotations.Nullable java.lang.String getStatus() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * target block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.CodestarnotificationsNotificationRuleTarget> getTarget() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CodestarnotificationsNotificationRuleConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CodestarnotificationsNotificationRuleConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CodestarnotificationsNotificationRuleConfig> {
        private java.lang.String detailType;
        private java.util.List<java.lang.String> eventTypeIds;
        private java.lang.String name;
        private java.lang.String resource;
        private java.lang.String status;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.util.List<imports.aws.CodestarnotificationsNotificationRuleTarget> target;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link CodestarnotificationsNotificationRuleConfig#getDetailType}
         * @param detailType the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder detailType(java.lang.String detailType) {
            this.detailType = detailType;
            return this;
        }

        /**
         * Sets the value of {@link CodestarnotificationsNotificationRuleConfig#getEventTypeIds}
         * @param eventTypeIds the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder eventTypeIds(java.util.List<java.lang.String> eventTypeIds) {
            this.eventTypeIds = eventTypeIds;
            return this;
        }

        /**
         * Sets the value of {@link CodestarnotificationsNotificationRuleConfig#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link CodestarnotificationsNotificationRuleConfig#getResource}
         * @param resource the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder resource(java.lang.String resource) {
            this.resource = resource;
            return this;
        }

        /**
         * Sets the value of {@link CodestarnotificationsNotificationRuleConfig#getStatus}
         * @param status the value to be set.
         * @return {@code this}
         */
        public Builder status(java.lang.String status) {
            this.status = status;
            return this;
        }

        /**
         * Sets the value of {@link CodestarnotificationsNotificationRuleConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link CodestarnotificationsNotificationRuleConfig#getTarget}
         * @param target target block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder target(java.util.List<? extends imports.aws.CodestarnotificationsNotificationRuleTarget> target) {
            this.target = (java.util.List<imports.aws.CodestarnotificationsNotificationRuleTarget>)target;
            return this;
        }

        /**
         * Sets the value of {@link CodestarnotificationsNotificationRuleConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link CodestarnotificationsNotificationRuleConfig#getDependsOn}
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
         * Sets the value of {@link CodestarnotificationsNotificationRuleConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link CodestarnotificationsNotificationRuleConfig#getProvider}
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
         * @return a new instance of {@link CodestarnotificationsNotificationRuleConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CodestarnotificationsNotificationRuleConfig build() {
            return new Jsii$Proxy(detailType, eventTypeIds, name, resource, status, tags, target, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link CodestarnotificationsNotificationRuleConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CodestarnotificationsNotificationRuleConfig {
        private final java.lang.String detailType;
        private final java.util.List<java.lang.String> eventTypeIds;
        private final java.lang.String name;
        private final java.lang.String resource;
        private final java.lang.String status;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.util.List<imports.aws.CodestarnotificationsNotificationRuleTarget> target;
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
            this.detailType = software.amazon.jsii.Kernel.get(this, "detailType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.eventTypeIds = software.amazon.jsii.Kernel.get(this, "eventTypeIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.resource = software.amazon.jsii.Kernel.get(this, "resource", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.status = software.amazon.jsii.Kernel.get(this, "status", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.target = software.amazon.jsii.Kernel.get(this, "target", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.CodestarnotificationsNotificationRuleTarget.class)));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String detailType, final java.util.List<java.lang.String> eventTypeIds, final java.lang.String name, final java.lang.String resource, final java.lang.String status, final java.util.Map<java.lang.String, java.lang.String> tags, final java.util.List<? extends imports.aws.CodestarnotificationsNotificationRuleTarget> target, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.detailType = java.util.Objects.requireNonNull(detailType, "detailType is required");
            this.eventTypeIds = java.util.Objects.requireNonNull(eventTypeIds, "eventTypeIds is required");
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.resource = java.util.Objects.requireNonNull(resource, "resource is required");
            this.status = status;
            this.tags = tags;
            this.target = (java.util.List<imports.aws.CodestarnotificationsNotificationRuleTarget>)target;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getDetailType() {
            return this.detailType;
        }

        @Override
        public final java.util.List<java.lang.String> getEventTypeIds() {
            return this.eventTypeIds;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getResource() {
            return this.resource;
        }

        @Override
        public final java.lang.String getStatus() {
            return this.status;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.util.List<imports.aws.CodestarnotificationsNotificationRuleTarget> getTarget() {
            return this.target;
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

            data.set("detailType", om.valueToTree(this.getDetailType()));
            data.set("eventTypeIds", om.valueToTree(this.getEventTypeIds()));
            data.set("name", om.valueToTree(this.getName()));
            data.set("resource", om.valueToTree(this.getResource()));
            if (this.getStatus() != null) {
                data.set("status", om.valueToTree(this.getStatus()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getTarget() != null) {
                data.set("target", om.valueToTree(this.getTarget()));
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
            struct.set("fqn", om.valueToTree("aws.CodestarnotificationsNotificationRuleConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CodestarnotificationsNotificationRuleConfig.Jsii$Proxy that = (CodestarnotificationsNotificationRuleConfig.Jsii$Proxy) o;

            if (!detailType.equals(that.detailType)) return false;
            if (!eventTypeIds.equals(that.eventTypeIds)) return false;
            if (!name.equals(that.name)) return false;
            if (!resource.equals(that.resource)) return false;
            if (this.status != null ? !this.status.equals(that.status) : that.status != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.target != null ? !this.target.equals(that.target) : that.target != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.detailType.hashCode();
            result = 31 * result + (this.eventTypeIds.hashCode());
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.resource.hashCode());
            result = 31 * result + (this.status != null ? this.status.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.target != null ? this.target.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
