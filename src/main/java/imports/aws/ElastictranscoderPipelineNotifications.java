package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.556Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.ElastictranscoderPipelineNotifications")
@software.amazon.jsii.Jsii.Proxy(ElastictranscoderPipelineNotifications.Jsii$Proxy.class)
public interface ElastictranscoderPipelineNotifications extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.String getCompleted() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getError() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getProgressing() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getWarning() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ElastictranscoderPipelineNotifications}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ElastictranscoderPipelineNotifications}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ElastictranscoderPipelineNotifications> {
        private java.lang.String completed;
        private java.lang.String error;
        private java.lang.String progressing;
        private java.lang.String warning;

        /**
         * Sets the value of {@link ElastictranscoderPipelineNotifications#getCompleted}
         * @param completed the value to be set.
         * @return {@code this}
         */
        public Builder completed(java.lang.String completed) {
            this.completed = completed;
            return this;
        }

        /**
         * Sets the value of {@link ElastictranscoderPipelineNotifications#getError}
         * @param error the value to be set.
         * @return {@code this}
         */
        public Builder error(java.lang.String error) {
            this.error = error;
            return this;
        }

        /**
         * Sets the value of {@link ElastictranscoderPipelineNotifications#getProgressing}
         * @param progressing the value to be set.
         * @return {@code this}
         */
        public Builder progressing(java.lang.String progressing) {
            this.progressing = progressing;
            return this;
        }

        /**
         * Sets the value of {@link ElastictranscoderPipelineNotifications#getWarning}
         * @param warning the value to be set.
         * @return {@code this}
         */
        public Builder warning(java.lang.String warning) {
            this.warning = warning;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ElastictranscoderPipelineNotifications}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ElastictranscoderPipelineNotifications build() {
            return new Jsii$Proxy(completed, error, progressing, warning);
        }
    }

    /**
     * An implementation for {@link ElastictranscoderPipelineNotifications}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ElastictranscoderPipelineNotifications {
        private final java.lang.String completed;
        private final java.lang.String error;
        private final java.lang.String progressing;
        private final java.lang.String warning;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.completed = software.amazon.jsii.Kernel.get(this, "completed", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.error = software.amazon.jsii.Kernel.get(this, "error", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.progressing = software.amazon.jsii.Kernel.get(this, "progressing", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.warning = software.amazon.jsii.Kernel.get(this, "warning", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String completed, final java.lang.String error, final java.lang.String progressing, final java.lang.String warning) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.completed = completed;
            this.error = error;
            this.progressing = progressing;
            this.warning = warning;
        }

        @Override
        public final java.lang.String getCompleted() {
            return this.completed;
        }

        @Override
        public final java.lang.String getError() {
            return this.error;
        }

        @Override
        public final java.lang.String getProgressing() {
            return this.progressing;
        }

        @Override
        public final java.lang.String getWarning() {
            return this.warning;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getCompleted() != null) {
                data.set("completed", om.valueToTree(this.getCompleted()));
            }
            if (this.getError() != null) {
                data.set("error", om.valueToTree(this.getError()));
            }
            if (this.getProgressing() != null) {
                data.set("progressing", om.valueToTree(this.getProgressing()));
            }
            if (this.getWarning() != null) {
                data.set("warning", om.valueToTree(this.getWarning()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.ElastictranscoderPipelineNotifications"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ElastictranscoderPipelineNotifications.Jsii$Proxy that = (ElastictranscoderPipelineNotifications.Jsii$Proxy) o;

            if (this.completed != null ? !this.completed.equals(that.completed) : that.completed != null) return false;
            if (this.error != null ? !this.error.equals(that.error) : that.error != null) return false;
            if (this.progressing != null ? !this.progressing.equals(that.progressing) : that.progressing != null) return false;
            return this.warning != null ? this.warning.equals(that.warning) : that.warning == null;
        }

        @Override
        public final int hashCode() {
            int result = this.completed != null ? this.completed.hashCode() : 0;
            result = 31 * result + (this.error != null ? this.error.hashCode() : 0);
            result = 31 * result + (this.progressing != null ? this.progressing.hashCode() : 0);
            result = 31 * result + (this.warning != null ? this.warning.hashCode() : 0);
            return result;
        }
    }
}
