package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.605Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.GlueTriggerActions")
@software.amazon.jsii.Jsii.Proxy(GlueTriggerActions.Jsii$Proxy.class)
public interface GlueTriggerActions extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getArguments() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getCrawlerName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getJobName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getTimeout() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link GlueTriggerActions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link GlueTriggerActions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<GlueTriggerActions> {
        private java.util.Map<java.lang.String, java.lang.String> arguments;
        private java.lang.String crawlerName;
        private java.lang.String jobName;
        private java.lang.Number timeout;

        /**
         * Sets the value of {@link GlueTriggerActions#getArguments}
         * @param arguments the value to be set.
         * @return {@code this}
         */
        public Builder arguments(java.util.Map<java.lang.String, java.lang.String> arguments) {
            this.arguments = arguments;
            return this;
        }

        /**
         * Sets the value of {@link GlueTriggerActions#getCrawlerName}
         * @param crawlerName the value to be set.
         * @return {@code this}
         */
        public Builder crawlerName(java.lang.String crawlerName) {
            this.crawlerName = crawlerName;
            return this;
        }

        /**
         * Sets the value of {@link GlueTriggerActions#getJobName}
         * @param jobName the value to be set.
         * @return {@code this}
         */
        public Builder jobName(java.lang.String jobName) {
            this.jobName = jobName;
            return this;
        }

        /**
         * Sets the value of {@link GlueTriggerActions#getTimeout}
         * @param timeout the value to be set.
         * @return {@code this}
         */
        public Builder timeout(java.lang.Number timeout) {
            this.timeout = timeout;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link GlueTriggerActions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public GlueTriggerActions build() {
            return new Jsii$Proxy(arguments, crawlerName, jobName, timeout);
        }
    }

    /**
     * An implementation for {@link GlueTriggerActions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements GlueTriggerActions {
        private final java.util.Map<java.lang.String, java.lang.String> arguments;
        private final java.lang.String crawlerName;
        private final java.lang.String jobName;
        private final java.lang.Number timeout;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.arguments = software.amazon.jsii.Kernel.get(this, "arguments", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.crawlerName = software.amazon.jsii.Kernel.get(this, "crawlerName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.jobName = software.amazon.jsii.Kernel.get(this, "jobName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.timeout = software.amazon.jsii.Kernel.get(this, "timeout", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.util.Map<java.lang.String, java.lang.String> arguments, final java.lang.String crawlerName, final java.lang.String jobName, final java.lang.Number timeout) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.arguments = arguments;
            this.crawlerName = crawlerName;
            this.jobName = jobName;
            this.timeout = timeout;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getArguments() {
            return this.arguments;
        }

        @Override
        public final java.lang.String getCrawlerName() {
            return this.crawlerName;
        }

        @Override
        public final java.lang.String getJobName() {
            return this.jobName;
        }

        @Override
        public final java.lang.Number getTimeout() {
            return this.timeout;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getArguments() != null) {
                data.set("arguments", om.valueToTree(this.getArguments()));
            }
            if (this.getCrawlerName() != null) {
                data.set("crawlerName", om.valueToTree(this.getCrawlerName()));
            }
            if (this.getJobName() != null) {
                data.set("jobName", om.valueToTree(this.getJobName()));
            }
            if (this.getTimeout() != null) {
                data.set("timeout", om.valueToTree(this.getTimeout()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.GlueTriggerActions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            GlueTriggerActions.Jsii$Proxy that = (GlueTriggerActions.Jsii$Proxy) o;

            if (this.arguments != null ? !this.arguments.equals(that.arguments) : that.arguments != null) return false;
            if (this.crawlerName != null ? !this.crawlerName.equals(that.crawlerName) : that.crawlerName != null) return false;
            if (this.jobName != null ? !this.jobName.equals(that.jobName) : that.jobName != null) return false;
            return this.timeout != null ? this.timeout.equals(that.timeout) : that.timeout == null;
        }

        @Override
        public final int hashCode() {
            int result = this.arguments != null ? this.arguments.hashCode() : 0;
            result = 31 * result + (this.crawlerName != null ? this.crawlerName.hashCode() : 0);
            result = 31 * result + (this.jobName != null ? this.jobName.hashCode() : 0);
            result = 31 * result + (this.timeout != null ? this.timeout.hashCode() : 0);
            return result;
        }
    }
}
