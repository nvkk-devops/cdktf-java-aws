package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.893Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.SsmMaintenanceWindowConfig")
@software.amazon.jsii.Jsii.Proxy(SsmMaintenanceWindowConfig.Jsii$Proxy.class)
public interface SsmMaintenanceWindowConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.Number getCutoff();

    @org.jetbrains.annotations.NotNull java.lang.Number getDuration();

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    @org.jetbrains.annotations.NotNull java.lang.String getSchedule();

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAllowUnassociatedTargets() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getEnabled() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getEndDate() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getScheduleTimezone() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getStartDate() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SsmMaintenanceWindowConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SsmMaintenanceWindowConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SsmMaintenanceWindowConfig> {
        private java.lang.Number cutoff;
        private java.lang.Number duration;
        private java.lang.String name;
        private java.lang.String schedule;
        private java.lang.Boolean allowUnassociatedTargets;
        private java.lang.String description;
        private java.lang.Boolean enabled;
        private java.lang.String endDate;
        private java.lang.String scheduleTimezone;
        private java.lang.String startDate;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link SsmMaintenanceWindowConfig#getCutoff}
         * @param cutoff the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder cutoff(java.lang.Number cutoff) {
            this.cutoff = cutoff;
            return this;
        }

        /**
         * Sets the value of {@link SsmMaintenanceWindowConfig#getDuration}
         * @param duration the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder duration(java.lang.Number duration) {
            this.duration = duration;
            return this;
        }

        /**
         * Sets the value of {@link SsmMaintenanceWindowConfig#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link SsmMaintenanceWindowConfig#getSchedule}
         * @param schedule the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder schedule(java.lang.String schedule) {
            this.schedule = schedule;
            return this;
        }

        /**
         * Sets the value of {@link SsmMaintenanceWindowConfig#getAllowUnassociatedTargets}
         * @param allowUnassociatedTargets the value to be set.
         * @return {@code this}
         */
        public Builder allowUnassociatedTargets(java.lang.Boolean allowUnassociatedTargets) {
            this.allowUnassociatedTargets = allowUnassociatedTargets;
            return this;
        }

        /**
         * Sets the value of {@link SsmMaintenanceWindowConfig#getDescription}
         * @param description the value to be set.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link SsmMaintenanceWindowConfig#getEnabled}
         * @param enabled the value to be set.
         * @return {@code this}
         */
        public Builder enabled(java.lang.Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Sets the value of {@link SsmMaintenanceWindowConfig#getEndDate}
         * @param endDate the value to be set.
         * @return {@code this}
         */
        public Builder endDate(java.lang.String endDate) {
            this.endDate = endDate;
            return this;
        }

        /**
         * Sets the value of {@link SsmMaintenanceWindowConfig#getScheduleTimezone}
         * @param scheduleTimezone the value to be set.
         * @return {@code this}
         */
        public Builder scheduleTimezone(java.lang.String scheduleTimezone) {
            this.scheduleTimezone = scheduleTimezone;
            return this;
        }

        /**
         * Sets the value of {@link SsmMaintenanceWindowConfig#getStartDate}
         * @param startDate the value to be set.
         * @return {@code this}
         */
        public Builder startDate(java.lang.String startDate) {
            this.startDate = startDate;
            return this;
        }

        /**
         * Sets the value of {@link SsmMaintenanceWindowConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link SsmMaintenanceWindowConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link SsmMaintenanceWindowConfig#getDependsOn}
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
         * Sets the value of {@link SsmMaintenanceWindowConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link SsmMaintenanceWindowConfig#getProvider}
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
         * @return a new instance of {@link SsmMaintenanceWindowConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SsmMaintenanceWindowConfig build() {
            return new Jsii$Proxy(cutoff, duration, name, schedule, allowUnassociatedTargets, description, enabled, endDate, scheduleTimezone, startDate, tags, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link SsmMaintenanceWindowConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SsmMaintenanceWindowConfig {
        private final java.lang.Number cutoff;
        private final java.lang.Number duration;
        private final java.lang.String name;
        private final java.lang.String schedule;
        private final java.lang.Boolean allowUnassociatedTargets;
        private final java.lang.String description;
        private final java.lang.Boolean enabled;
        private final java.lang.String endDate;
        private final java.lang.String scheduleTimezone;
        private final java.lang.String startDate;
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
            this.cutoff = software.amazon.jsii.Kernel.get(this, "cutoff", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.duration = software.amazon.jsii.Kernel.get(this, "duration", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.schedule = software.amazon.jsii.Kernel.get(this, "schedule", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.allowUnassociatedTargets = software.amazon.jsii.Kernel.get(this, "allowUnassociatedTargets", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.enabled = software.amazon.jsii.Kernel.get(this, "enabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.endDate = software.amazon.jsii.Kernel.get(this, "endDate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.scheduleTimezone = software.amazon.jsii.Kernel.get(this, "scheduleTimezone", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.startDate = software.amazon.jsii.Kernel.get(this, "startDate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
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
        protected Jsii$Proxy(final java.lang.Number cutoff, final java.lang.Number duration, final java.lang.String name, final java.lang.String schedule, final java.lang.Boolean allowUnassociatedTargets, final java.lang.String description, final java.lang.Boolean enabled, final java.lang.String endDate, final java.lang.String scheduleTimezone, final java.lang.String startDate, final java.util.Map<java.lang.String, java.lang.String> tags, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.cutoff = java.util.Objects.requireNonNull(cutoff, "cutoff is required");
            this.duration = java.util.Objects.requireNonNull(duration, "duration is required");
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.schedule = java.util.Objects.requireNonNull(schedule, "schedule is required");
            this.allowUnassociatedTargets = allowUnassociatedTargets;
            this.description = description;
            this.enabled = enabled;
            this.endDate = endDate;
            this.scheduleTimezone = scheduleTimezone;
            this.startDate = startDate;
            this.tags = tags;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.Number getCutoff() {
            return this.cutoff;
        }

        @Override
        public final java.lang.Number getDuration() {
            return this.duration;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getSchedule() {
            return this.schedule;
        }

        @Override
        public final java.lang.Boolean getAllowUnassociatedTargets() {
            return this.allowUnassociatedTargets;
        }

        @Override
        public final java.lang.String getDescription() {
            return this.description;
        }

        @Override
        public final java.lang.Boolean getEnabled() {
            return this.enabled;
        }

        @Override
        public final java.lang.String getEndDate() {
            return this.endDate;
        }

        @Override
        public final java.lang.String getScheduleTimezone() {
            return this.scheduleTimezone;
        }

        @Override
        public final java.lang.String getStartDate() {
            return this.startDate;
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

            data.set("cutoff", om.valueToTree(this.getCutoff()));
            data.set("duration", om.valueToTree(this.getDuration()));
            data.set("name", om.valueToTree(this.getName()));
            data.set("schedule", om.valueToTree(this.getSchedule()));
            if (this.getAllowUnassociatedTargets() != null) {
                data.set("allowUnassociatedTargets", om.valueToTree(this.getAllowUnassociatedTargets()));
            }
            if (this.getDescription() != null) {
                data.set("description", om.valueToTree(this.getDescription()));
            }
            if (this.getEnabled() != null) {
                data.set("enabled", om.valueToTree(this.getEnabled()));
            }
            if (this.getEndDate() != null) {
                data.set("endDate", om.valueToTree(this.getEndDate()));
            }
            if (this.getScheduleTimezone() != null) {
                data.set("scheduleTimezone", om.valueToTree(this.getScheduleTimezone()));
            }
            if (this.getStartDate() != null) {
                data.set("startDate", om.valueToTree(this.getStartDate()));
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
            struct.set("fqn", om.valueToTree("aws.SsmMaintenanceWindowConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SsmMaintenanceWindowConfig.Jsii$Proxy that = (SsmMaintenanceWindowConfig.Jsii$Proxy) o;

            if (!cutoff.equals(that.cutoff)) return false;
            if (!duration.equals(that.duration)) return false;
            if (!name.equals(that.name)) return false;
            if (!schedule.equals(that.schedule)) return false;
            if (this.allowUnassociatedTargets != null ? !this.allowUnassociatedTargets.equals(that.allowUnassociatedTargets) : that.allowUnassociatedTargets != null) return false;
            if (this.description != null ? !this.description.equals(that.description) : that.description != null) return false;
            if (this.enabled != null ? !this.enabled.equals(that.enabled) : that.enabled != null) return false;
            if (this.endDate != null ? !this.endDate.equals(that.endDate) : that.endDate != null) return false;
            if (this.scheduleTimezone != null ? !this.scheduleTimezone.equals(that.scheduleTimezone) : that.scheduleTimezone != null) return false;
            if (this.startDate != null ? !this.startDate.equals(that.startDate) : that.startDate != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.cutoff.hashCode();
            result = 31 * result + (this.duration.hashCode());
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.schedule.hashCode());
            result = 31 * result + (this.allowUnassociatedTargets != null ? this.allowUnassociatedTargets.hashCode() : 0);
            result = 31 * result + (this.description != null ? this.description.hashCode() : 0);
            result = 31 * result + (this.enabled != null ? this.enabled.hashCode() : 0);
            result = 31 * result + (this.endDate != null ? this.endDate.hashCode() : 0);
            result = 31 * result + (this.scheduleTimezone != null ? this.scheduleTimezone.hashCode() : 0);
            result = 31 * result + (this.startDate != null ? this.startDate.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
