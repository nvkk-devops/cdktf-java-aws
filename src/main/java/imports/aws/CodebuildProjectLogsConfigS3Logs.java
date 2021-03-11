package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.168Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CodebuildProjectLogsConfigS3Logs")
@software.amazon.jsii.Jsii.Proxy(CodebuildProjectLogsConfigS3Logs.Jsii$Proxy.class)
public interface CodebuildProjectLogsConfigS3Logs extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getEncryptionDisabled() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getLocation() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getStatus() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CodebuildProjectLogsConfigS3Logs}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CodebuildProjectLogsConfigS3Logs}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CodebuildProjectLogsConfigS3Logs> {
        private java.lang.Boolean encryptionDisabled;
        private java.lang.String location;
        private java.lang.String status;

        /**
         * Sets the value of {@link CodebuildProjectLogsConfigS3Logs#getEncryptionDisabled}
         * @param encryptionDisabled the value to be set.
         * @return {@code this}
         */
        public Builder encryptionDisabled(java.lang.Boolean encryptionDisabled) {
            this.encryptionDisabled = encryptionDisabled;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildProjectLogsConfigS3Logs#getLocation}
         * @param location the value to be set.
         * @return {@code this}
         */
        public Builder location(java.lang.String location) {
            this.location = location;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildProjectLogsConfigS3Logs#getStatus}
         * @param status the value to be set.
         * @return {@code this}
         */
        public Builder status(java.lang.String status) {
            this.status = status;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CodebuildProjectLogsConfigS3Logs}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CodebuildProjectLogsConfigS3Logs build() {
            return new Jsii$Proxy(encryptionDisabled, location, status);
        }
    }

    /**
     * An implementation for {@link CodebuildProjectLogsConfigS3Logs}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CodebuildProjectLogsConfigS3Logs {
        private final java.lang.Boolean encryptionDisabled;
        private final java.lang.String location;
        private final java.lang.String status;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.encryptionDisabled = software.amazon.jsii.Kernel.get(this, "encryptionDisabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.location = software.amazon.jsii.Kernel.get(this, "location", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.status = software.amazon.jsii.Kernel.get(this, "status", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.Boolean encryptionDisabled, final java.lang.String location, final java.lang.String status) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.encryptionDisabled = encryptionDisabled;
            this.location = location;
            this.status = status;
        }

        @Override
        public final java.lang.Boolean getEncryptionDisabled() {
            return this.encryptionDisabled;
        }

        @Override
        public final java.lang.String getLocation() {
            return this.location;
        }

        @Override
        public final java.lang.String getStatus() {
            return this.status;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getEncryptionDisabled() != null) {
                data.set("encryptionDisabled", om.valueToTree(this.getEncryptionDisabled()));
            }
            if (this.getLocation() != null) {
                data.set("location", om.valueToTree(this.getLocation()));
            }
            if (this.getStatus() != null) {
                data.set("status", om.valueToTree(this.getStatus()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.CodebuildProjectLogsConfigS3Logs"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CodebuildProjectLogsConfigS3Logs.Jsii$Proxy that = (CodebuildProjectLogsConfigS3Logs.Jsii$Proxy) o;

            if (this.encryptionDisabled != null ? !this.encryptionDisabled.equals(that.encryptionDisabled) : that.encryptionDisabled != null) return false;
            if (this.location != null ? !this.location.equals(that.location) : that.location != null) return false;
            return this.status != null ? this.status.equals(that.status) : that.status == null;
        }

        @Override
        public final int hashCode() {
            int result = this.encryptionDisabled != null ? this.encryptionDisabled.hashCode() : 0;
            result = 31 * result + (this.location != null ? this.location.hashCode() : 0);
            result = 31 * result + (this.status != null ? this.status.hashCode() : 0);
            return result;
        }
    }
}
