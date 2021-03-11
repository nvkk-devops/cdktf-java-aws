package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.108Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.BudgetsBudgetConfig")
@software.amazon.jsii.Jsii.Proxy(BudgetsBudgetConfig.Jsii$Proxy.class)
public interface BudgetsBudgetConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getBudgetType();

    @org.jetbrains.annotations.NotNull java.lang.String getLimitAmount();

    @org.jetbrains.annotations.NotNull java.lang.String getLimitUnit();

    @org.jetbrains.annotations.NotNull java.lang.String getTimePeriodStart();

    @org.jetbrains.annotations.NotNull java.lang.String getTimeUnit();

    default @org.jetbrains.annotations.Nullable java.lang.String getAccountId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getCostFilters() {
        return null;
    }

    /**
     * cost_types block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.BudgetsBudgetCostTypes> getCostTypes() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getNamePrefix() {
        return null;
    }

    /**
     * notification block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.BudgetsBudgetNotification> getNotification() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getTimePeriodEnd() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BudgetsBudgetConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BudgetsBudgetConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BudgetsBudgetConfig> {
        private java.lang.String budgetType;
        private java.lang.String limitAmount;
        private java.lang.String limitUnit;
        private java.lang.String timePeriodStart;
        private java.lang.String timeUnit;
        private java.lang.String accountId;
        private java.util.Map<java.lang.String, java.lang.String> costFilters;
        private java.util.List<imports.aws.BudgetsBudgetCostTypes> costTypes;
        private java.lang.String name;
        private java.lang.String namePrefix;
        private java.util.List<imports.aws.BudgetsBudgetNotification> notification;
        private java.lang.String timePeriodEnd;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link BudgetsBudgetConfig#getBudgetType}
         * @param budgetType the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder budgetType(java.lang.String budgetType) {
            this.budgetType = budgetType;
            return this;
        }

        /**
         * Sets the value of {@link BudgetsBudgetConfig#getLimitAmount}
         * @param limitAmount the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder limitAmount(java.lang.String limitAmount) {
            this.limitAmount = limitAmount;
            return this;
        }

        /**
         * Sets the value of {@link BudgetsBudgetConfig#getLimitUnit}
         * @param limitUnit the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder limitUnit(java.lang.String limitUnit) {
            this.limitUnit = limitUnit;
            return this;
        }

        /**
         * Sets the value of {@link BudgetsBudgetConfig#getTimePeriodStart}
         * @param timePeriodStart the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder timePeriodStart(java.lang.String timePeriodStart) {
            this.timePeriodStart = timePeriodStart;
            return this;
        }

        /**
         * Sets the value of {@link BudgetsBudgetConfig#getTimeUnit}
         * @param timeUnit the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder timeUnit(java.lang.String timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }

        /**
         * Sets the value of {@link BudgetsBudgetConfig#getAccountId}
         * @param accountId the value to be set.
         * @return {@code this}
         */
        public Builder accountId(java.lang.String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * Sets the value of {@link BudgetsBudgetConfig#getCostFilters}
         * @param costFilters the value to be set.
         * @return {@code this}
         */
        public Builder costFilters(java.util.Map<java.lang.String, java.lang.String> costFilters) {
            this.costFilters = costFilters;
            return this;
        }

        /**
         * Sets the value of {@link BudgetsBudgetConfig#getCostTypes}
         * @param costTypes cost_types block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder costTypes(java.util.List<? extends imports.aws.BudgetsBudgetCostTypes> costTypes) {
            this.costTypes = (java.util.List<imports.aws.BudgetsBudgetCostTypes>)costTypes;
            return this;
        }

        /**
         * Sets the value of {@link BudgetsBudgetConfig#getName}
         * @param name the value to be set.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link BudgetsBudgetConfig#getNamePrefix}
         * @param namePrefix the value to be set.
         * @return {@code this}
         */
        public Builder namePrefix(java.lang.String namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }

        /**
         * Sets the value of {@link BudgetsBudgetConfig#getNotification}
         * @param notification notification block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder notification(java.util.List<? extends imports.aws.BudgetsBudgetNotification> notification) {
            this.notification = (java.util.List<imports.aws.BudgetsBudgetNotification>)notification;
            return this;
        }

        /**
         * Sets the value of {@link BudgetsBudgetConfig#getTimePeriodEnd}
         * @param timePeriodEnd the value to be set.
         * @return {@code this}
         */
        public Builder timePeriodEnd(java.lang.String timePeriodEnd) {
            this.timePeriodEnd = timePeriodEnd;
            return this;
        }

        /**
         * Sets the value of {@link BudgetsBudgetConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link BudgetsBudgetConfig#getDependsOn}
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
         * Sets the value of {@link BudgetsBudgetConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link BudgetsBudgetConfig#getProvider}
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
         * @return a new instance of {@link BudgetsBudgetConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BudgetsBudgetConfig build() {
            return new Jsii$Proxy(budgetType, limitAmount, limitUnit, timePeriodStart, timeUnit, accountId, costFilters, costTypes, name, namePrefix, notification, timePeriodEnd, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link BudgetsBudgetConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BudgetsBudgetConfig {
        private final java.lang.String budgetType;
        private final java.lang.String limitAmount;
        private final java.lang.String limitUnit;
        private final java.lang.String timePeriodStart;
        private final java.lang.String timeUnit;
        private final java.lang.String accountId;
        private final java.util.Map<java.lang.String, java.lang.String> costFilters;
        private final java.util.List<imports.aws.BudgetsBudgetCostTypes> costTypes;
        private final java.lang.String name;
        private final java.lang.String namePrefix;
        private final java.util.List<imports.aws.BudgetsBudgetNotification> notification;
        private final java.lang.String timePeriodEnd;
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
            this.budgetType = software.amazon.jsii.Kernel.get(this, "budgetType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.limitAmount = software.amazon.jsii.Kernel.get(this, "limitAmount", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.limitUnit = software.amazon.jsii.Kernel.get(this, "limitUnit", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.timePeriodStart = software.amazon.jsii.Kernel.get(this, "timePeriodStart", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.timeUnit = software.amazon.jsii.Kernel.get(this, "timeUnit", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.accountId = software.amazon.jsii.Kernel.get(this, "accountId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.costFilters = software.amazon.jsii.Kernel.get(this, "costFilters", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.costTypes = software.amazon.jsii.Kernel.get(this, "costTypes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.BudgetsBudgetCostTypes.class)));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.namePrefix = software.amazon.jsii.Kernel.get(this, "namePrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.notification = software.amazon.jsii.Kernel.get(this, "notification", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.BudgetsBudgetNotification.class)));
            this.timePeriodEnd = software.amazon.jsii.Kernel.get(this, "timePeriodEnd", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String budgetType, final java.lang.String limitAmount, final java.lang.String limitUnit, final java.lang.String timePeriodStart, final java.lang.String timeUnit, final java.lang.String accountId, final java.util.Map<java.lang.String, java.lang.String> costFilters, final java.util.List<? extends imports.aws.BudgetsBudgetCostTypes> costTypes, final java.lang.String name, final java.lang.String namePrefix, final java.util.List<? extends imports.aws.BudgetsBudgetNotification> notification, final java.lang.String timePeriodEnd, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.budgetType = java.util.Objects.requireNonNull(budgetType, "budgetType is required");
            this.limitAmount = java.util.Objects.requireNonNull(limitAmount, "limitAmount is required");
            this.limitUnit = java.util.Objects.requireNonNull(limitUnit, "limitUnit is required");
            this.timePeriodStart = java.util.Objects.requireNonNull(timePeriodStart, "timePeriodStart is required");
            this.timeUnit = java.util.Objects.requireNonNull(timeUnit, "timeUnit is required");
            this.accountId = accountId;
            this.costFilters = costFilters;
            this.costTypes = (java.util.List<imports.aws.BudgetsBudgetCostTypes>)costTypes;
            this.name = name;
            this.namePrefix = namePrefix;
            this.notification = (java.util.List<imports.aws.BudgetsBudgetNotification>)notification;
            this.timePeriodEnd = timePeriodEnd;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getBudgetType() {
            return this.budgetType;
        }

        @Override
        public final java.lang.String getLimitAmount() {
            return this.limitAmount;
        }

        @Override
        public final java.lang.String getLimitUnit() {
            return this.limitUnit;
        }

        @Override
        public final java.lang.String getTimePeriodStart() {
            return this.timePeriodStart;
        }

        @Override
        public final java.lang.String getTimeUnit() {
            return this.timeUnit;
        }

        @Override
        public final java.lang.String getAccountId() {
            return this.accountId;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getCostFilters() {
            return this.costFilters;
        }

        @Override
        public final java.util.List<imports.aws.BudgetsBudgetCostTypes> getCostTypes() {
            return this.costTypes;
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
        public final java.util.List<imports.aws.BudgetsBudgetNotification> getNotification() {
            return this.notification;
        }

        @Override
        public final java.lang.String getTimePeriodEnd() {
            return this.timePeriodEnd;
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

            data.set("budgetType", om.valueToTree(this.getBudgetType()));
            data.set("limitAmount", om.valueToTree(this.getLimitAmount()));
            data.set("limitUnit", om.valueToTree(this.getLimitUnit()));
            data.set("timePeriodStart", om.valueToTree(this.getTimePeriodStart()));
            data.set("timeUnit", om.valueToTree(this.getTimeUnit()));
            if (this.getAccountId() != null) {
                data.set("accountId", om.valueToTree(this.getAccountId()));
            }
            if (this.getCostFilters() != null) {
                data.set("costFilters", om.valueToTree(this.getCostFilters()));
            }
            if (this.getCostTypes() != null) {
                data.set("costTypes", om.valueToTree(this.getCostTypes()));
            }
            if (this.getName() != null) {
                data.set("name", om.valueToTree(this.getName()));
            }
            if (this.getNamePrefix() != null) {
                data.set("namePrefix", om.valueToTree(this.getNamePrefix()));
            }
            if (this.getNotification() != null) {
                data.set("notification", om.valueToTree(this.getNotification()));
            }
            if (this.getTimePeriodEnd() != null) {
                data.set("timePeriodEnd", om.valueToTree(this.getTimePeriodEnd()));
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
            struct.set("fqn", om.valueToTree("aws.BudgetsBudgetConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BudgetsBudgetConfig.Jsii$Proxy that = (BudgetsBudgetConfig.Jsii$Proxy) o;

            if (!budgetType.equals(that.budgetType)) return false;
            if (!limitAmount.equals(that.limitAmount)) return false;
            if (!limitUnit.equals(that.limitUnit)) return false;
            if (!timePeriodStart.equals(that.timePeriodStart)) return false;
            if (!timeUnit.equals(that.timeUnit)) return false;
            if (this.accountId != null ? !this.accountId.equals(that.accountId) : that.accountId != null) return false;
            if (this.costFilters != null ? !this.costFilters.equals(that.costFilters) : that.costFilters != null) return false;
            if (this.costTypes != null ? !this.costTypes.equals(that.costTypes) : that.costTypes != null) return false;
            if (this.name != null ? !this.name.equals(that.name) : that.name != null) return false;
            if (this.namePrefix != null ? !this.namePrefix.equals(that.namePrefix) : that.namePrefix != null) return false;
            if (this.notification != null ? !this.notification.equals(that.notification) : that.notification != null) return false;
            if (this.timePeriodEnd != null ? !this.timePeriodEnd.equals(that.timePeriodEnd) : that.timePeriodEnd != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.budgetType.hashCode();
            result = 31 * result + (this.limitAmount.hashCode());
            result = 31 * result + (this.limitUnit.hashCode());
            result = 31 * result + (this.timePeriodStart.hashCode());
            result = 31 * result + (this.timeUnit.hashCode());
            result = 31 * result + (this.accountId != null ? this.accountId.hashCode() : 0);
            result = 31 * result + (this.costFilters != null ? this.costFilters.hashCode() : 0);
            result = 31 * result + (this.costTypes != null ? this.costTypes.hashCode() : 0);
            result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
            result = 31 * result + (this.namePrefix != null ? this.namePrefix.hashCode() : 0);
            result = 31 * result + (this.notification != null ? this.notification.hashCode() : 0);
            result = 31 * result + (this.timePeriodEnd != null ? this.timePeriodEnd.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
