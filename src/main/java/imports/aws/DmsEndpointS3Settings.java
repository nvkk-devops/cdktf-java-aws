package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.443Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.DmsEndpointS3Settings")
@software.amazon.jsii.Jsii.Proxy(DmsEndpointS3Settings.Jsii$Proxy.class)
public interface DmsEndpointS3Settings extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.String getBucketFolder() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getBucketName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getCompressionType() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getCsvDelimiter() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getCsvRowDelimiter() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getExternalTableDefinition() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getServiceAccessRoleArn() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DmsEndpointS3Settings}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DmsEndpointS3Settings}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DmsEndpointS3Settings> {
        private java.lang.String bucketFolder;
        private java.lang.String bucketName;
        private java.lang.String compressionType;
        private java.lang.String csvDelimiter;
        private java.lang.String csvRowDelimiter;
        private java.lang.String externalTableDefinition;
        private java.lang.String serviceAccessRoleArn;

        /**
         * Sets the value of {@link DmsEndpointS3Settings#getBucketFolder}
         * @param bucketFolder the value to be set.
         * @return {@code this}
         */
        public Builder bucketFolder(java.lang.String bucketFolder) {
            this.bucketFolder = bucketFolder;
            return this;
        }

        /**
         * Sets the value of {@link DmsEndpointS3Settings#getBucketName}
         * @param bucketName the value to be set.
         * @return {@code this}
         */
        public Builder bucketName(java.lang.String bucketName) {
            this.bucketName = bucketName;
            return this;
        }

        /**
         * Sets the value of {@link DmsEndpointS3Settings#getCompressionType}
         * @param compressionType the value to be set.
         * @return {@code this}
         */
        public Builder compressionType(java.lang.String compressionType) {
            this.compressionType = compressionType;
            return this;
        }

        /**
         * Sets the value of {@link DmsEndpointS3Settings#getCsvDelimiter}
         * @param csvDelimiter the value to be set.
         * @return {@code this}
         */
        public Builder csvDelimiter(java.lang.String csvDelimiter) {
            this.csvDelimiter = csvDelimiter;
            return this;
        }

        /**
         * Sets the value of {@link DmsEndpointS3Settings#getCsvRowDelimiter}
         * @param csvRowDelimiter the value to be set.
         * @return {@code this}
         */
        public Builder csvRowDelimiter(java.lang.String csvRowDelimiter) {
            this.csvRowDelimiter = csvRowDelimiter;
            return this;
        }

        /**
         * Sets the value of {@link DmsEndpointS3Settings#getExternalTableDefinition}
         * @param externalTableDefinition the value to be set.
         * @return {@code this}
         */
        public Builder externalTableDefinition(java.lang.String externalTableDefinition) {
            this.externalTableDefinition = externalTableDefinition;
            return this;
        }

        /**
         * Sets the value of {@link DmsEndpointS3Settings#getServiceAccessRoleArn}
         * @param serviceAccessRoleArn the value to be set.
         * @return {@code this}
         */
        public Builder serviceAccessRoleArn(java.lang.String serviceAccessRoleArn) {
            this.serviceAccessRoleArn = serviceAccessRoleArn;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DmsEndpointS3Settings}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DmsEndpointS3Settings build() {
            return new Jsii$Proxy(bucketFolder, bucketName, compressionType, csvDelimiter, csvRowDelimiter, externalTableDefinition, serviceAccessRoleArn);
        }
    }

    /**
     * An implementation for {@link DmsEndpointS3Settings}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DmsEndpointS3Settings {
        private final java.lang.String bucketFolder;
        private final java.lang.String bucketName;
        private final java.lang.String compressionType;
        private final java.lang.String csvDelimiter;
        private final java.lang.String csvRowDelimiter;
        private final java.lang.String externalTableDefinition;
        private final java.lang.String serviceAccessRoleArn;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.bucketFolder = software.amazon.jsii.Kernel.get(this, "bucketFolder", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.bucketName = software.amazon.jsii.Kernel.get(this, "bucketName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.compressionType = software.amazon.jsii.Kernel.get(this, "compressionType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.csvDelimiter = software.amazon.jsii.Kernel.get(this, "csvDelimiter", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.csvRowDelimiter = software.amazon.jsii.Kernel.get(this, "csvRowDelimiter", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.externalTableDefinition = software.amazon.jsii.Kernel.get(this, "externalTableDefinition", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.serviceAccessRoleArn = software.amazon.jsii.Kernel.get(this, "serviceAccessRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String bucketFolder, final java.lang.String bucketName, final java.lang.String compressionType, final java.lang.String csvDelimiter, final java.lang.String csvRowDelimiter, final java.lang.String externalTableDefinition, final java.lang.String serviceAccessRoleArn) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.bucketFolder = bucketFolder;
            this.bucketName = bucketName;
            this.compressionType = compressionType;
            this.csvDelimiter = csvDelimiter;
            this.csvRowDelimiter = csvRowDelimiter;
            this.externalTableDefinition = externalTableDefinition;
            this.serviceAccessRoleArn = serviceAccessRoleArn;
        }

        @Override
        public final java.lang.String getBucketFolder() {
            return this.bucketFolder;
        }

        @Override
        public final java.lang.String getBucketName() {
            return this.bucketName;
        }

        @Override
        public final java.lang.String getCompressionType() {
            return this.compressionType;
        }

        @Override
        public final java.lang.String getCsvDelimiter() {
            return this.csvDelimiter;
        }

        @Override
        public final java.lang.String getCsvRowDelimiter() {
            return this.csvRowDelimiter;
        }

        @Override
        public final java.lang.String getExternalTableDefinition() {
            return this.externalTableDefinition;
        }

        @Override
        public final java.lang.String getServiceAccessRoleArn() {
            return this.serviceAccessRoleArn;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getBucketFolder() != null) {
                data.set("bucketFolder", om.valueToTree(this.getBucketFolder()));
            }
            if (this.getBucketName() != null) {
                data.set("bucketName", om.valueToTree(this.getBucketName()));
            }
            if (this.getCompressionType() != null) {
                data.set("compressionType", om.valueToTree(this.getCompressionType()));
            }
            if (this.getCsvDelimiter() != null) {
                data.set("csvDelimiter", om.valueToTree(this.getCsvDelimiter()));
            }
            if (this.getCsvRowDelimiter() != null) {
                data.set("csvRowDelimiter", om.valueToTree(this.getCsvRowDelimiter()));
            }
            if (this.getExternalTableDefinition() != null) {
                data.set("externalTableDefinition", om.valueToTree(this.getExternalTableDefinition()));
            }
            if (this.getServiceAccessRoleArn() != null) {
                data.set("serviceAccessRoleArn", om.valueToTree(this.getServiceAccessRoleArn()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.DmsEndpointS3Settings"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DmsEndpointS3Settings.Jsii$Proxy that = (DmsEndpointS3Settings.Jsii$Proxy) o;

            if (this.bucketFolder != null ? !this.bucketFolder.equals(that.bucketFolder) : that.bucketFolder != null) return false;
            if (this.bucketName != null ? !this.bucketName.equals(that.bucketName) : that.bucketName != null) return false;
            if (this.compressionType != null ? !this.compressionType.equals(that.compressionType) : that.compressionType != null) return false;
            if (this.csvDelimiter != null ? !this.csvDelimiter.equals(that.csvDelimiter) : that.csvDelimiter != null) return false;
            if (this.csvRowDelimiter != null ? !this.csvRowDelimiter.equals(that.csvRowDelimiter) : that.csvRowDelimiter != null) return false;
            if (this.externalTableDefinition != null ? !this.externalTableDefinition.equals(that.externalTableDefinition) : that.externalTableDefinition != null) return false;
            return this.serviceAccessRoleArn != null ? this.serviceAccessRoleArn.equals(that.serviceAccessRoleArn) : that.serviceAccessRoleArn == null;
        }

        @Override
        public final int hashCode() {
            int result = this.bucketFolder != null ? this.bucketFolder.hashCode() : 0;
            result = 31 * result + (this.bucketName != null ? this.bucketName.hashCode() : 0);
            result = 31 * result + (this.compressionType != null ? this.compressionType.hashCode() : 0);
            result = 31 * result + (this.csvDelimiter != null ? this.csvDelimiter.hashCode() : 0);
            result = 31 * result + (this.csvRowDelimiter != null ? this.csvRowDelimiter.hashCode() : 0);
            result = 31 * result + (this.externalTableDefinition != null ? this.externalTableDefinition.hashCode() : 0);
            result = 31 * result + (this.serviceAccessRoleArn != null ? this.serviceAccessRoleArn.hashCode() : 0);
            return result;
        }
    }
}
