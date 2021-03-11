package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.109Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.BudgetsBudgetCostTypes")
@software.amazon.jsii.Jsii.Proxy(BudgetsBudgetCostTypes.Jsii$Proxy.class)
public interface BudgetsBudgetCostTypes extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getIncludeCredit() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getIncludeDiscount() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getIncludeOtherSubscription() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getIncludeRecurring() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getIncludeRefund() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getIncludeSubscription() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getIncludeSupport() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getIncludeTax() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getIncludeUpfront() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getUseAmortized() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getUseBlended() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BudgetsBudgetCostTypes}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BudgetsBudgetCostTypes}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BudgetsBudgetCostTypes> {
        private java.lang.Boolean includeCredit;
        private java.lang.Boolean includeDiscount;
        private java.lang.Boolean includeOtherSubscription;
        private java.lang.Boolean includeRecurring;
        private java.lang.Boolean includeRefund;
        private java.lang.Boolean includeSubscription;
        private java.lang.Boolean includeSupport;
        private java.lang.Boolean includeTax;
        private java.lang.Boolean includeUpfront;
        private java.lang.Boolean useAmortized;
        private java.lang.Boolean useBlended;

        /**
         * Sets the value of {@link BudgetsBudgetCostTypes#getIncludeCredit}
         * @param includeCredit the value to be set.
         * @return {@code this}
         */
        public Builder includeCredit(java.lang.Boolean includeCredit) {
            this.includeCredit = includeCredit;
            return this;
        }

        /**
         * Sets the value of {@link BudgetsBudgetCostTypes#getIncludeDiscount}
         * @param includeDiscount the value to be set.
         * @return {@code this}
         */
        public Builder includeDiscount(java.lang.Boolean includeDiscount) {
            this.includeDiscount = includeDiscount;
            return this;
        }

        /**
         * Sets the value of {@link BudgetsBudgetCostTypes#getIncludeOtherSubscription}
         * @param includeOtherSubscription the value to be set.
         * @return {@code this}
         */
        public Builder includeOtherSubscription(java.lang.Boolean includeOtherSubscription) {
            this.includeOtherSubscription = includeOtherSubscription;
            return this;
        }

        /**
         * Sets the value of {@link BudgetsBudgetCostTypes#getIncludeRecurring}
         * @param includeRecurring the value to be set.
         * @return {@code this}
         */
        public Builder includeRecurring(java.lang.Boolean includeRecurring) {
            this.includeRecurring = includeRecurring;
            return this;
        }

        /**
         * Sets the value of {@link BudgetsBudgetCostTypes#getIncludeRefund}
         * @param includeRefund the value to be set.
         * @return {@code this}
         */
        public Builder includeRefund(java.lang.Boolean includeRefund) {
            this.includeRefund = includeRefund;
            return this;
        }

        /**
         * Sets the value of {@link BudgetsBudgetCostTypes#getIncludeSubscription}
         * @param includeSubscription the value to be set.
         * @return {@code this}
         */
        public Builder includeSubscription(java.lang.Boolean includeSubscription) {
            this.includeSubscription = includeSubscription;
            return this;
        }

        /**
         * Sets the value of {@link BudgetsBudgetCostTypes#getIncludeSupport}
         * @param includeSupport the value to be set.
         * @return {@code this}
         */
        public Builder includeSupport(java.lang.Boolean includeSupport) {
            this.includeSupport = includeSupport;
            return this;
        }

        /**
         * Sets the value of {@link BudgetsBudgetCostTypes#getIncludeTax}
         * @param includeTax the value to be set.
         * @return {@code this}
         */
        public Builder includeTax(java.lang.Boolean includeTax) {
            this.includeTax = includeTax;
            return this;
        }

        /**
         * Sets the value of {@link BudgetsBudgetCostTypes#getIncludeUpfront}
         * @param includeUpfront the value to be set.
         * @return {@code this}
         */
        public Builder includeUpfront(java.lang.Boolean includeUpfront) {
            this.includeUpfront = includeUpfront;
            return this;
        }

        /**
         * Sets the value of {@link BudgetsBudgetCostTypes#getUseAmortized}
         * @param useAmortized the value to be set.
         * @return {@code this}
         */
        public Builder useAmortized(java.lang.Boolean useAmortized) {
            this.useAmortized = useAmortized;
            return this;
        }

        /**
         * Sets the value of {@link BudgetsBudgetCostTypes#getUseBlended}
         * @param useBlended the value to be set.
         * @return {@code this}
         */
        public Builder useBlended(java.lang.Boolean useBlended) {
            this.useBlended = useBlended;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BudgetsBudgetCostTypes}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BudgetsBudgetCostTypes build() {
            return new Jsii$Proxy(includeCredit, includeDiscount, includeOtherSubscription, includeRecurring, includeRefund, includeSubscription, includeSupport, includeTax, includeUpfront, useAmortized, useBlended);
        }
    }

    /**
     * An implementation for {@link BudgetsBudgetCostTypes}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BudgetsBudgetCostTypes {
        private final java.lang.Boolean includeCredit;
        private final java.lang.Boolean includeDiscount;
        private final java.lang.Boolean includeOtherSubscription;
        private final java.lang.Boolean includeRecurring;
        private final java.lang.Boolean includeRefund;
        private final java.lang.Boolean includeSubscription;
        private final java.lang.Boolean includeSupport;
        private final java.lang.Boolean includeTax;
        private final java.lang.Boolean includeUpfront;
        private final java.lang.Boolean useAmortized;
        private final java.lang.Boolean useBlended;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.includeCredit = software.amazon.jsii.Kernel.get(this, "includeCredit", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.includeDiscount = software.amazon.jsii.Kernel.get(this, "includeDiscount", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.includeOtherSubscription = software.amazon.jsii.Kernel.get(this, "includeOtherSubscription", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.includeRecurring = software.amazon.jsii.Kernel.get(this, "includeRecurring", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.includeRefund = software.amazon.jsii.Kernel.get(this, "includeRefund", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.includeSubscription = software.amazon.jsii.Kernel.get(this, "includeSubscription", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.includeSupport = software.amazon.jsii.Kernel.get(this, "includeSupport", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.includeTax = software.amazon.jsii.Kernel.get(this, "includeTax", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.includeUpfront = software.amazon.jsii.Kernel.get(this, "includeUpfront", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.useAmortized = software.amazon.jsii.Kernel.get(this, "useAmortized", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.useBlended = software.amazon.jsii.Kernel.get(this, "useBlended", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.Boolean includeCredit, final java.lang.Boolean includeDiscount, final java.lang.Boolean includeOtherSubscription, final java.lang.Boolean includeRecurring, final java.lang.Boolean includeRefund, final java.lang.Boolean includeSubscription, final java.lang.Boolean includeSupport, final java.lang.Boolean includeTax, final java.lang.Boolean includeUpfront, final java.lang.Boolean useAmortized, final java.lang.Boolean useBlended) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.includeCredit = includeCredit;
            this.includeDiscount = includeDiscount;
            this.includeOtherSubscription = includeOtherSubscription;
            this.includeRecurring = includeRecurring;
            this.includeRefund = includeRefund;
            this.includeSubscription = includeSubscription;
            this.includeSupport = includeSupport;
            this.includeTax = includeTax;
            this.includeUpfront = includeUpfront;
            this.useAmortized = useAmortized;
            this.useBlended = useBlended;
        }

        @Override
        public final java.lang.Boolean getIncludeCredit() {
            return this.includeCredit;
        }

        @Override
        public final java.lang.Boolean getIncludeDiscount() {
            return this.includeDiscount;
        }

        @Override
        public final java.lang.Boolean getIncludeOtherSubscription() {
            return this.includeOtherSubscription;
        }

        @Override
        public final java.lang.Boolean getIncludeRecurring() {
            return this.includeRecurring;
        }

        @Override
        public final java.lang.Boolean getIncludeRefund() {
            return this.includeRefund;
        }

        @Override
        public final java.lang.Boolean getIncludeSubscription() {
            return this.includeSubscription;
        }

        @Override
        public final java.lang.Boolean getIncludeSupport() {
            return this.includeSupport;
        }

        @Override
        public final java.lang.Boolean getIncludeTax() {
            return this.includeTax;
        }

        @Override
        public final java.lang.Boolean getIncludeUpfront() {
            return this.includeUpfront;
        }

        @Override
        public final java.lang.Boolean getUseAmortized() {
            return this.useAmortized;
        }

        @Override
        public final java.lang.Boolean getUseBlended() {
            return this.useBlended;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getIncludeCredit() != null) {
                data.set("includeCredit", om.valueToTree(this.getIncludeCredit()));
            }
            if (this.getIncludeDiscount() != null) {
                data.set("includeDiscount", om.valueToTree(this.getIncludeDiscount()));
            }
            if (this.getIncludeOtherSubscription() != null) {
                data.set("includeOtherSubscription", om.valueToTree(this.getIncludeOtherSubscription()));
            }
            if (this.getIncludeRecurring() != null) {
                data.set("includeRecurring", om.valueToTree(this.getIncludeRecurring()));
            }
            if (this.getIncludeRefund() != null) {
                data.set("includeRefund", om.valueToTree(this.getIncludeRefund()));
            }
            if (this.getIncludeSubscription() != null) {
                data.set("includeSubscription", om.valueToTree(this.getIncludeSubscription()));
            }
            if (this.getIncludeSupport() != null) {
                data.set("includeSupport", om.valueToTree(this.getIncludeSupport()));
            }
            if (this.getIncludeTax() != null) {
                data.set("includeTax", om.valueToTree(this.getIncludeTax()));
            }
            if (this.getIncludeUpfront() != null) {
                data.set("includeUpfront", om.valueToTree(this.getIncludeUpfront()));
            }
            if (this.getUseAmortized() != null) {
                data.set("useAmortized", om.valueToTree(this.getUseAmortized()));
            }
            if (this.getUseBlended() != null) {
                data.set("useBlended", om.valueToTree(this.getUseBlended()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.BudgetsBudgetCostTypes"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BudgetsBudgetCostTypes.Jsii$Proxy that = (BudgetsBudgetCostTypes.Jsii$Proxy) o;

            if (this.includeCredit != null ? !this.includeCredit.equals(that.includeCredit) : that.includeCredit != null) return false;
            if (this.includeDiscount != null ? !this.includeDiscount.equals(that.includeDiscount) : that.includeDiscount != null) return false;
            if (this.includeOtherSubscription != null ? !this.includeOtherSubscription.equals(that.includeOtherSubscription) : that.includeOtherSubscription != null) return false;
            if (this.includeRecurring != null ? !this.includeRecurring.equals(that.includeRecurring) : that.includeRecurring != null) return false;
            if (this.includeRefund != null ? !this.includeRefund.equals(that.includeRefund) : that.includeRefund != null) return false;
            if (this.includeSubscription != null ? !this.includeSubscription.equals(that.includeSubscription) : that.includeSubscription != null) return false;
            if (this.includeSupport != null ? !this.includeSupport.equals(that.includeSupport) : that.includeSupport != null) return false;
            if (this.includeTax != null ? !this.includeTax.equals(that.includeTax) : that.includeTax != null) return false;
            if (this.includeUpfront != null ? !this.includeUpfront.equals(that.includeUpfront) : that.includeUpfront != null) return false;
            if (this.useAmortized != null ? !this.useAmortized.equals(that.useAmortized) : that.useAmortized != null) return false;
            return this.useBlended != null ? this.useBlended.equals(that.useBlended) : that.useBlended == null;
        }

        @Override
        public final int hashCode() {
            int result = this.includeCredit != null ? this.includeCredit.hashCode() : 0;
            result = 31 * result + (this.includeDiscount != null ? this.includeDiscount.hashCode() : 0);
            result = 31 * result + (this.includeOtherSubscription != null ? this.includeOtherSubscription.hashCode() : 0);
            result = 31 * result + (this.includeRecurring != null ? this.includeRecurring.hashCode() : 0);
            result = 31 * result + (this.includeRefund != null ? this.includeRefund.hashCode() : 0);
            result = 31 * result + (this.includeSubscription != null ? this.includeSubscription.hashCode() : 0);
            result = 31 * result + (this.includeSupport != null ? this.includeSupport.hashCode() : 0);
            result = 31 * result + (this.includeTax != null ? this.includeTax.hashCode() : 0);
            result = 31 * result + (this.includeUpfront != null ? this.includeUpfront.hashCode() : 0);
            result = 31 * result + (this.useAmortized != null ? this.useAmortized.hashCode() : 0);
            result = 31 * result + (this.useBlended != null ? this.useBlended.hashCode() : 0);
            return result;
        }
    }
}
