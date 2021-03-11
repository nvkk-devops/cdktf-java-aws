package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.692Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.LaunchTemplateCpuOptions")
@software.amazon.jsii.Jsii.Proxy(LaunchTemplateCpuOptions.Jsii$Proxy.class)
public interface LaunchTemplateCpuOptions extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.Number getCoreCount() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getThreadsPerCore() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link LaunchTemplateCpuOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LaunchTemplateCpuOptions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LaunchTemplateCpuOptions> {
        private java.lang.Number coreCount;
        private java.lang.Number threadsPerCore;

        /**
         * Sets the value of {@link LaunchTemplateCpuOptions#getCoreCount}
         * @param coreCount the value to be set.
         * @return {@code this}
         */
        public Builder coreCount(java.lang.Number coreCount) {
            this.coreCount = coreCount;
            return this;
        }

        /**
         * Sets the value of {@link LaunchTemplateCpuOptions#getThreadsPerCore}
         * @param threadsPerCore the value to be set.
         * @return {@code this}
         */
        public Builder threadsPerCore(java.lang.Number threadsPerCore) {
            this.threadsPerCore = threadsPerCore;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link LaunchTemplateCpuOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LaunchTemplateCpuOptions build() {
            return new Jsii$Proxy(coreCount, threadsPerCore);
        }
    }

    /**
     * An implementation for {@link LaunchTemplateCpuOptions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LaunchTemplateCpuOptions {
        private final java.lang.Number coreCount;
        private final java.lang.Number threadsPerCore;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.coreCount = software.amazon.jsii.Kernel.get(this, "coreCount", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.threadsPerCore = software.amazon.jsii.Kernel.get(this, "threadsPerCore", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.Number coreCount, final java.lang.Number threadsPerCore) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.coreCount = coreCount;
            this.threadsPerCore = threadsPerCore;
        }

        @Override
        public final java.lang.Number getCoreCount() {
            return this.coreCount;
        }

        @Override
        public final java.lang.Number getThreadsPerCore() {
            return this.threadsPerCore;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getCoreCount() != null) {
                data.set("coreCount", om.valueToTree(this.getCoreCount()));
            }
            if (this.getThreadsPerCore() != null) {
                data.set("threadsPerCore", om.valueToTree(this.getThreadsPerCore()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.LaunchTemplateCpuOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LaunchTemplateCpuOptions.Jsii$Proxy that = (LaunchTemplateCpuOptions.Jsii$Proxy) o;

            if (this.coreCount != null ? !this.coreCount.equals(that.coreCount) : that.coreCount != null) return false;
            return this.threadsPerCore != null ? this.threadsPerCore.equals(that.threadsPerCore) : that.threadsPerCore == null;
        }

        @Override
        public final int hashCode() {
            int result = this.coreCount != null ? this.coreCount.hashCode() : 0;
            result = 31 * result + (this.threadsPerCore != null ? this.threadsPerCore.hashCode() : 0);
            return result;
        }
    }
}
