package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.172Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CodecommitTriggerTrigger")
@software.amazon.jsii.Jsii.Proxy(CodecommitTriggerTrigger.Jsii$Proxy.class)
public interface CodecommitTriggerTrigger extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getDestinationArn();

    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getEvents();

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getBranches() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getCustomData() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CodecommitTriggerTrigger}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CodecommitTriggerTrigger}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CodecommitTriggerTrigger> {
        private java.lang.String destinationArn;
        private java.util.List<java.lang.String> events;
        private java.lang.String name;
        private java.util.List<java.lang.String> branches;
        private java.lang.String customData;

        /**
         * Sets the value of {@link CodecommitTriggerTrigger#getDestinationArn}
         * @param destinationArn the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder destinationArn(java.lang.String destinationArn) {
            this.destinationArn = destinationArn;
            return this;
        }

        /**
         * Sets the value of {@link CodecommitTriggerTrigger#getEvents}
         * @param events the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder events(java.util.List<java.lang.String> events) {
            this.events = events;
            return this;
        }

        /**
         * Sets the value of {@link CodecommitTriggerTrigger#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link CodecommitTriggerTrigger#getBranches}
         * @param branches the value to be set.
         * @return {@code this}
         */
        public Builder branches(java.util.List<java.lang.String> branches) {
            this.branches = branches;
            return this;
        }

        /**
         * Sets the value of {@link CodecommitTriggerTrigger#getCustomData}
         * @param customData the value to be set.
         * @return {@code this}
         */
        public Builder customData(java.lang.String customData) {
            this.customData = customData;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CodecommitTriggerTrigger}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CodecommitTriggerTrigger build() {
            return new Jsii$Proxy(destinationArn, events, name, branches, customData);
        }
    }

    /**
     * An implementation for {@link CodecommitTriggerTrigger}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CodecommitTriggerTrigger {
        private final java.lang.String destinationArn;
        private final java.util.List<java.lang.String> events;
        private final java.lang.String name;
        private final java.util.List<java.lang.String> branches;
        private final java.lang.String customData;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.destinationArn = software.amazon.jsii.Kernel.get(this, "destinationArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.events = software.amazon.jsii.Kernel.get(this, "events", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.branches = software.amazon.jsii.Kernel.get(this, "branches", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.customData = software.amazon.jsii.Kernel.get(this, "customData", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String destinationArn, final java.util.List<java.lang.String> events, final java.lang.String name, final java.util.List<java.lang.String> branches, final java.lang.String customData) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.destinationArn = java.util.Objects.requireNonNull(destinationArn, "destinationArn is required");
            this.events = java.util.Objects.requireNonNull(events, "events is required");
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.branches = branches;
            this.customData = customData;
        }

        @Override
        public final java.lang.String getDestinationArn() {
            return this.destinationArn;
        }

        @Override
        public final java.util.List<java.lang.String> getEvents() {
            return this.events;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.util.List<java.lang.String> getBranches() {
            return this.branches;
        }

        @Override
        public final java.lang.String getCustomData() {
            return this.customData;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("destinationArn", om.valueToTree(this.getDestinationArn()));
            data.set("events", om.valueToTree(this.getEvents()));
            data.set("name", om.valueToTree(this.getName()));
            if (this.getBranches() != null) {
                data.set("branches", om.valueToTree(this.getBranches()));
            }
            if (this.getCustomData() != null) {
                data.set("customData", om.valueToTree(this.getCustomData()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.CodecommitTriggerTrigger"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CodecommitTriggerTrigger.Jsii$Proxy that = (CodecommitTriggerTrigger.Jsii$Proxy) o;

            if (!destinationArn.equals(that.destinationArn)) return false;
            if (!events.equals(that.events)) return false;
            if (!name.equals(that.name)) return false;
            if (this.branches != null ? !this.branches.equals(that.branches) : that.branches != null) return false;
            return this.customData != null ? this.customData.equals(that.customData) : that.customData == null;
        }

        @Override
        public final int hashCode() {
            int result = this.destinationArn.hashCode();
            result = 31 * result + (this.events.hashCode());
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.branches != null ? this.branches.hashCode() : 0);
            result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
            return result;
        }
    }
}
