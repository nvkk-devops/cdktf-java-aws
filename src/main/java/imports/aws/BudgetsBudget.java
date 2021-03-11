package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.107Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.BudgetsBudget")
public class BudgetsBudget extends com.hashicorp.cdktf.TerraformResource {

    protected BudgetsBudget(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected BudgetsBudget(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public BudgetsBudget(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.BudgetsBudgetConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetAccountId() {
        software.amazon.jsii.Kernel.call(this, "resetAccountId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCostFilters() {
        software.amazon.jsii.Kernel.call(this, "resetCostFilters", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCostTypes() {
        software.amazon.jsii.Kernel.call(this, "resetCostTypes", software.amazon.jsii.NativeType.VOID);
    }

    public void resetName() {
        software.amazon.jsii.Kernel.call(this, "resetName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetNamePrefix() {
        software.amazon.jsii.Kernel.call(this, "resetNamePrefix", software.amazon.jsii.NativeType.VOID);
    }

    public void resetNotification() {
        software.amazon.jsii.Kernel.call(this, "resetNotification", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTimePeriodEnd() {
        software.amazon.jsii.Kernel.call(this, "resetTimePeriodEnd", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBudgetTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "budgetTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLimitAmountInput() {
        return software.amazon.jsii.Kernel.get(this, "limitAmountInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLimitUnitInput() {
        return software.amazon.jsii.Kernel.get(this, "limitUnitInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTimePeriodStartInput() {
        return software.amazon.jsii.Kernel.get(this, "timePeriodStartInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTimeUnitInput() {
        return software.amazon.jsii.Kernel.get(this, "timeUnitInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAccountIdInput() {
        return software.amazon.jsii.Kernel.get(this, "accountIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getCostFiltersInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "costFiltersInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.BudgetsBudgetCostTypes> getCostTypesInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.BudgetsBudgetCostTypes>)(software.amazon.jsii.Kernel.get(this, "costTypesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.BudgetsBudgetCostTypes.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNamePrefixInput() {
        return software.amazon.jsii.Kernel.get(this, "namePrefixInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.BudgetsBudgetNotification> getNotificationInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.BudgetsBudgetNotification>)(software.amazon.jsii.Kernel.get(this, "notificationInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.BudgetsBudgetNotification.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTimePeriodEndInput() {
        return software.amazon.jsii.Kernel.get(this, "timePeriodEndInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAccountId() {
        return software.amazon.jsii.Kernel.get(this, "accountId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAccountId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "accountId", java.util.Objects.requireNonNull(value, "accountId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBudgetType() {
        return software.amazon.jsii.Kernel.get(this, "budgetType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setBudgetType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "budgetType", java.util.Objects.requireNonNull(value, "budgetType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getCostFilters() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "costFilters", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setCostFilters(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "costFilters", java.util.Objects.requireNonNull(value, "costFilters is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.BudgetsBudgetCostTypes> getCostTypes() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "costTypes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.BudgetsBudgetCostTypes.class))));
    }

    public void setCostTypes(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.BudgetsBudgetCostTypes> value) {
        software.amazon.jsii.Kernel.set(this, "costTypes", java.util.Objects.requireNonNull(value, "costTypes is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLimitAmount() {
        return software.amazon.jsii.Kernel.get(this, "limitAmount", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLimitAmount(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "limitAmount", java.util.Objects.requireNonNull(value, "limitAmount is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLimitUnit() {
        return software.amazon.jsii.Kernel.get(this, "limitUnit", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLimitUnit(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "limitUnit", java.util.Objects.requireNonNull(value, "limitUnit is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNamePrefix() {
        return software.amazon.jsii.Kernel.get(this, "namePrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setNamePrefix(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "namePrefix", java.util.Objects.requireNonNull(value, "namePrefix is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.BudgetsBudgetNotification> getNotification() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "notification", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.BudgetsBudgetNotification.class))));
    }

    public void setNotification(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.BudgetsBudgetNotification> value) {
        software.amazon.jsii.Kernel.set(this, "notification", java.util.Objects.requireNonNull(value, "notification is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTimePeriodEnd() {
        return software.amazon.jsii.Kernel.get(this, "timePeriodEnd", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTimePeriodEnd(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "timePeriodEnd", java.util.Objects.requireNonNull(value, "timePeriodEnd is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTimePeriodStart() {
        return software.amazon.jsii.Kernel.get(this, "timePeriodStart", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTimePeriodStart(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "timePeriodStart", java.util.Objects.requireNonNull(value, "timePeriodStart is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTimeUnit() {
        return software.amazon.jsii.Kernel.get(this, "timeUnit", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTimeUnit(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "timeUnit", java.util.Objects.requireNonNull(value, "timeUnit is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.BudgetsBudget}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.BudgetsBudget> {
        /**
         * @return a new instance of {@link Builder}.
         * @param scope This parameter is required.
         * @param id This parameter is required.
         */
        public static Builder create(final software.constructs.Construct scope, final java.lang.String id) {
            return new Builder(scope, id);
        }

        private final software.constructs.Construct scope;
        private final java.lang.String id;
        private final imports.aws.BudgetsBudgetConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.BudgetsBudgetConfig.Builder();
        }

        /**
         * @return {@code this}
         * @param count This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(final java.lang.Number count) {
            this.config.count(count);
            return this;
        }

        /**
         * @return {@code this}
         * @param dependsOn This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder dependsOn(final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.config.dependsOn(dependsOn);
            return this;
        }

        /**
         * @return {@code this}
         * @param lifecycle This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.config.lifecycle(lifecycle);
            return this;
        }

        /**
         * @return {@code this}
         * @param provider This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(final com.hashicorp.cdktf.TerraformProvider provider) {
            this.config.provider(provider);
            return this;
        }

        /**
         * @return {@code this}
         * @param budgetType This parameter is required.
         */
        public Builder budgetType(final java.lang.String budgetType) {
            this.config.budgetType(budgetType);
            return this;
        }

        /**
         * @return {@code this}
         * @param limitAmount This parameter is required.
         */
        public Builder limitAmount(final java.lang.String limitAmount) {
            this.config.limitAmount(limitAmount);
            return this;
        }

        /**
         * @return {@code this}
         * @param limitUnit This parameter is required.
         */
        public Builder limitUnit(final java.lang.String limitUnit) {
            this.config.limitUnit(limitUnit);
            return this;
        }

        /**
         * @return {@code this}
         * @param timePeriodStart This parameter is required.
         */
        public Builder timePeriodStart(final java.lang.String timePeriodStart) {
            this.config.timePeriodStart(timePeriodStart);
            return this;
        }

        /**
         * @return {@code this}
         * @param timeUnit This parameter is required.
         */
        public Builder timeUnit(final java.lang.String timeUnit) {
            this.config.timeUnit(timeUnit);
            return this;
        }

        /**
         * @return {@code this}
         * @param accountId This parameter is required.
         */
        public Builder accountId(final java.lang.String accountId) {
            this.config.accountId(accountId);
            return this;
        }

        /**
         * @return {@code this}
         * @param costFilters This parameter is required.
         */
        public Builder costFilters(final java.util.Map<java.lang.String, java.lang.String> costFilters) {
            this.config.costFilters(costFilters);
            return this;
        }

        /**
         * cost_types block.
         * <p>
         * @return {@code this}
         * @param costTypes cost_types block. This parameter is required.
         */
        public Builder costTypes(final java.util.List<? extends imports.aws.BudgetsBudgetCostTypes> costTypes) {
            this.config.costTypes(costTypes);
            return this;
        }

        /**
         * @return {@code this}
         * @param name This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * @return {@code this}
         * @param namePrefix This parameter is required.
         */
        public Builder namePrefix(final java.lang.String namePrefix) {
            this.config.namePrefix(namePrefix);
            return this;
        }

        /**
         * notification block.
         * <p>
         * @return {@code this}
         * @param notification notification block. This parameter is required.
         */
        public Builder notification(final java.util.List<? extends imports.aws.BudgetsBudgetNotification> notification) {
            this.config.notification(notification);
            return this;
        }

        /**
         * @return {@code this}
         * @param timePeriodEnd This parameter is required.
         */
        public Builder timePeriodEnd(final java.lang.String timePeriodEnd) {
            this.config.timePeriodEnd(timePeriodEnd);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.BudgetsBudget}.
         */
        @Override
        public imports.aws.BudgetsBudget build() {
            return new imports.aws.BudgetsBudget(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
