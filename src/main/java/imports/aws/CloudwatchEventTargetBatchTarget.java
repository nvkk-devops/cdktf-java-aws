package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.153Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CloudwatchEventTargetBatchTarget")
@software.amazon.jsii.Jsii.Proxy(CloudwatchEventTargetBatchTarget.Jsii$Proxy.class)
public interface CloudwatchEventTargetBatchTarget extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getJobDefinition();

    @org.jetbrains.annotations.NotNull java.lang.String getJobName();

    default @org.jetbrains.annotations.Nullable java.lang.Number getArraySize() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Number getJobAttempts() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CloudwatchEventTargetBatchTarget}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CloudwatchEventTargetBatchTarget}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CloudwatchEventTargetBatchTarget> {
        private java.lang.String jobDefinition;
        private java.lang.String jobName;
        private java.lang.Number arraySize;
        private java.lang.Number jobAttempts;

        /**
         * Sets the value of {@link CloudwatchEventTargetBatchTarget#getJobDefinition}
         * @param jobDefinition the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder jobDefinition(java.lang.String jobDefinition) {
            this.jobDefinition = jobDefinition;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchEventTargetBatchTarget#getJobName}
         * @param jobName the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder jobName(java.lang.String jobName) {
            this.jobName = jobName;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchEventTargetBatchTarget#getArraySize}
         * @param arraySize the value to be set.
         * @return {@code this}
         */
        public Builder arraySize(java.lang.Number arraySize) {
            this.arraySize = arraySize;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchEventTargetBatchTarget#getJobAttempts}
         * @param jobAttempts the value to be set.
         * @return {@code this}
         */
        public Builder jobAttempts(java.lang.Number jobAttempts) {
            this.jobAttempts = jobAttempts;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CloudwatchEventTargetBatchTarget}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CloudwatchEventTargetBatchTarget build() {
            return new Jsii$Proxy(jobDefinition, jobName, arraySize, jobAttempts);
        }
    }

    /**
     * An implementation for {@link CloudwatchEventTargetBatchTarget}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CloudwatchEventTargetBatchTarget {
        private final java.lang.String jobDefinition;
        private final java.lang.String jobName;
        private final java.lang.Number arraySize;
        private final java.lang.Number jobAttempts;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.jobDefinition = software.amazon.jsii.Kernel.get(this, "jobDefinition", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.jobName = software.amazon.jsii.Kernel.get(this, "jobName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.arraySize = software.amazon.jsii.Kernel.get(this, "arraySize", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.jobAttempts = software.amazon.jsii.Kernel.get(this, "jobAttempts", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String jobDefinition, final java.lang.String jobName, final java.lang.Number arraySize, final java.lang.Number jobAttempts) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.jobDefinition = java.util.Objects.requireNonNull(jobDefinition, "jobDefinition is required");
            this.jobName = java.util.Objects.requireNonNull(jobName, "jobName is required");
            this.arraySize = arraySize;
            this.jobAttempts = jobAttempts;
        }

        @Override
        public final java.lang.String getJobDefinition() {
            return this.jobDefinition;
        }

        @Override
        public final java.lang.String getJobName() {
            return this.jobName;
        }

        @Override
        public final java.lang.Number getArraySize() {
            return this.arraySize;
        }

        @Override
        public final java.lang.Number getJobAttempts() {
            return this.jobAttempts;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("jobDefinition", om.valueToTree(this.getJobDefinition()));
            data.set("jobName", om.valueToTree(this.getJobName()));
            if (this.getArraySize() != null) {
                data.set("arraySize", om.valueToTree(this.getArraySize()));
            }
            if (this.getJobAttempts() != null) {
                data.set("jobAttempts", om.valueToTree(this.getJobAttempts()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.CloudwatchEventTargetBatchTarget"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CloudwatchEventTargetBatchTarget.Jsii$Proxy that = (CloudwatchEventTargetBatchTarget.Jsii$Proxy) o;

            if (!jobDefinition.equals(that.jobDefinition)) return false;
            if (!jobName.equals(that.jobName)) return false;
            if (this.arraySize != null ? !this.arraySize.equals(that.arraySize) : that.arraySize != null) return false;
            return this.jobAttempts != null ? this.jobAttempts.equals(that.jobAttempts) : that.jobAttempts == null;
        }

        @Override
        public final int hashCode() {
            int result = this.jobDefinition.hashCode();
            result = 31 * result + (this.jobName.hashCode());
            result = 31 * result + (this.arraySize != null ? this.arraySize.hashCode() : 0);
            result = 31 * result + (this.jobAttempts != null ? this.jobAttempts.hashCode() : 0);
            return result;
        }
    }
}
