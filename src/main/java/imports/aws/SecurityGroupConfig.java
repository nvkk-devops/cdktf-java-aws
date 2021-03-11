package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.852Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.SecurityGroupConfig")
@software.amazon.jsii.Jsii.Proxy(SecurityGroupConfig.Jsii$Proxy.class)
public interface SecurityGroupConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    default @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SecurityGroupEgress> getEgress() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.SecurityGroupIngress> getIngress() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getNamePrefix() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getRevokeRulesOnDelete() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * timeouts block.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.SecurityGroupTimeouts getTimeouts() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getVpcId() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SecurityGroupConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SecurityGroupConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SecurityGroupConfig> {
        private java.lang.String description;
        private java.util.List<imports.aws.SecurityGroupEgress> egress;
        private java.util.List<imports.aws.SecurityGroupIngress> ingress;
        private java.lang.String name;
        private java.lang.String namePrefix;
        private java.lang.Boolean revokeRulesOnDelete;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private imports.aws.SecurityGroupTimeouts timeouts;
        private java.lang.String vpcId;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link SecurityGroupConfig#getDescription}
         * @param description the value to be set.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link SecurityGroupConfig#getEgress}
         * @param egress the value to be set.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder egress(java.util.List<? extends imports.aws.SecurityGroupEgress> egress) {
            this.egress = (java.util.List<imports.aws.SecurityGroupEgress>)egress;
            return this;
        }

        /**
         * Sets the value of {@link SecurityGroupConfig#getIngress}
         * @param ingress the value to be set.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder ingress(java.util.List<? extends imports.aws.SecurityGroupIngress> ingress) {
            this.ingress = (java.util.List<imports.aws.SecurityGroupIngress>)ingress;
            return this;
        }

        /**
         * Sets the value of {@link SecurityGroupConfig#getName}
         * @param name the value to be set.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link SecurityGroupConfig#getNamePrefix}
         * @param namePrefix the value to be set.
         * @return {@code this}
         */
        public Builder namePrefix(java.lang.String namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }

        /**
         * Sets the value of {@link SecurityGroupConfig#getRevokeRulesOnDelete}
         * @param revokeRulesOnDelete the value to be set.
         * @return {@code this}
         */
        public Builder revokeRulesOnDelete(java.lang.Boolean revokeRulesOnDelete) {
            this.revokeRulesOnDelete = revokeRulesOnDelete;
            return this;
        }

        /**
         * Sets the value of {@link SecurityGroupConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link SecurityGroupConfig#getTimeouts}
         * @param timeouts timeouts block.
         * @return {@code this}
         */
        public Builder timeouts(imports.aws.SecurityGroupTimeouts timeouts) {
            this.timeouts = timeouts;
            return this;
        }

        /**
         * Sets the value of {@link SecurityGroupConfig#getVpcId}
         * @param vpcId the value to be set.
         * @return {@code this}
         */
        public Builder vpcId(java.lang.String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        /**
         * Sets the value of {@link SecurityGroupConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link SecurityGroupConfig#getDependsOn}
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
         * Sets the value of {@link SecurityGroupConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link SecurityGroupConfig#getProvider}
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
         * @return a new instance of {@link SecurityGroupConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SecurityGroupConfig build() {
            return new Jsii$Proxy(description, egress, ingress, name, namePrefix, revokeRulesOnDelete, tags, timeouts, vpcId, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link SecurityGroupConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SecurityGroupConfig {
        private final java.lang.String description;
        private final java.util.List<imports.aws.SecurityGroupEgress> egress;
        private final java.util.List<imports.aws.SecurityGroupIngress> ingress;
        private final java.lang.String name;
        private final java.lang.String namePrefix;
        private final java.lang.Boolean revokeRulesOnDelete;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final imports.aws.SecurityGroupTimeouts timeouts;
        private final java.lang.String vpcId;
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
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.egress = software.amazon.jsii.Kernel.get(this, "egress", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SecurityGroupEgress.class)));
            this.ingress = software.amazon.jsii.Kernel.get(this, "ingress", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.SecurityGroupIngress.class)));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.namePrefix = software.amazon.jsii.Kernel.get(this, "namePrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.revokeRulesOnDelete = software.amazon.jsii.Kernel.get(this, "revokeRulesOnDelete", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.timeouts = software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.SecurityGroupTimeouts.class));
            this.vpcId = software.amazon.jsii.Kernel.get(this, "vpcId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String description, final java.util.List<? extends imports.aws.SecurityGroupEgress> egress, final java.util.List<? extends imports.aws.SecurityGroupIngress> ingress, final java.lang.String name, final java.lang.String namePrefix, final java.lang.Boolean revokeRulesOnDelete, final java.util.Map<java.lang.String, java.lang.String> tags, final imports.aws.SecurityGroupTimeouts timeouts, final java.lang.String vpcId, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.description = description;
            this.egress = (java.util.List<imports.aws.SecurityGroupEgress>)egress;
            this.ingress = (java.util.List<imports.aws.SecurityGroupIngress>)ingress;
            this.name = name;
            this.namePrefix = namePrefix;
            this.revokeRulesOnDelete = revokeRulesOnDelete;
            this.tags = tags;
            this.timeouts = timeouts;
            this.vpcId = vpcId;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getDescription() {
            return this.description;
        }

        @Override
        public final java.util.List<imports.aws.SecurityGroupEgress> getEgress() {
            return this.egress;
        }

        @Override
        public final java.util.List<imports.aws.SecurityGroupIngress> getIngress() {
            return this.ingress;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getNamePrefix() {
            return this.namePrefix;
        }

        @Override
        public final java.lang.Boolean getRevokeRulesOnDelete() {
            return this.revokeRulesOnDelete;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final imports.aws.SecurityGroupTimeouts getTimeouts() {
            return this.timeouts;
        }

        @Override
        public final java.lang.String getVpcId() {
            return this.vpcId;
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

            if (this.getDescription() != null) {
                data.set("description", om.valueToTree(this.getDescription()));
            }
            if (this.getEgress() != null) {
                data.set("egress", om.valueToTree(this.getEgress()));
            }
            if (this.getIngress() != null) {
                data.set("ingress", om.valueToTree(this.getIngress()));
            }
            if (this.getName() != null) {
                data.set("name", om.valueToTree(this.getName()));
            }
            if (this.getNamePrefix() != null) {
                data.set("namePrefix", om.valueToTree(this.getNamePrefix()));
            }
            if (this.getRevokeRulesOnDelete() != null) {
                data.set("revokeRulesOnDelete", om.valueToTree(this.getRevokeRulesOnDelete()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getTimeouts() != null) {
                data.set("timeouts", om.valueToTree(this.getTimeouts()));
            }
            if (this.getVpcId() != null) {
                data.set("vpcId", om.valueToTree(this.getVpcId()));
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
            struct.set("fqn", om.valueToTree("aws.SecurityGroupConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SecurityGroupConfig.Jsii$Proxy that = (SecurityGroupConfig.Jsii$Proxy) o;

            if (this.description != null ? !this.description.equals(that.description) : that.description != null) return false;
            if (this.egress != null ? !this.egress.equals(that.egress) : that.egress != null) return false;
            if (this.ingress != null ? !this.ingress.equals(that.ingress) : that.ingress != null) return false;
            if (this.name != null ? !this.name.equals(that.name) : that.name != null) return false;
            if (this.namePrefix != null ? !this.namePrefix.equals(that.namePrefix) : that.namePrefix != null) return false;
            if (this.revokeRulesOnDelete != null ? !this.revokeRulesOnDelete.equals(that.revokeRulesOnDelete) : that.revokeRulesOnDelete != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.timeouts != null ? !this.timeouts.equals(that.timeouts) : that.timeouts != null) return false;
            if (this.vpcId != null ? !this.vpcId.equals(that.vpcId) : that.vpcId != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.description != null ? this.description.hashCode() : 0;
            result = 31 * result + (this.egress != null ? this.egress.hashCode() : 0);
            result = 31 * result + (this.ingress != null ? this.ingress.hashCode() : 0);
            result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
            result = 31 * result + (this.namePrefix != null ? this.namePrefix.hashCode() : 0);
            result = 31 * result + (this.revokeRulesOnDelete != null ? this.revokeRulesOnDelete.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.timeouts != null ? this.timeouts.hashCode() : 0);
            result = 31 * result + (this.vpcId != null ? this.vpcId.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
