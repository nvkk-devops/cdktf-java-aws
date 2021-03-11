package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.653Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.KinesisFirehoseDeliveryStreamConfig")
@software.amazon.jsii.Jsii.Proxy(KinesisFirehoseDeliveryStreamConfig.Jsii$Proxy.class)
public interface KinesisFirehoseDeliveryStreamConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getDestination();

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    default @org.jetbrains.annotations.Nullable java.lang.String getDestinationId() {
        return null;
    }

    /**
     * elasticsearch_configuration block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.KinesisFirehoseDeliveryStreamElasticsearchConfiguration> getElasticsearchConfiguration() {
        return null;
    }

    /**
     * extended_s3_configuration block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.KinesisFirehoseDeliveryStreamExtendedS3Configuration> getExtendedS3Configuration() {
        return null;
    }

    /**
     * kinesis_source_configuration block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.KinesisFirehoseDeliveryStreamKinesisSourceConfiguration> getKinesisSourceConfiguration() {
        return null;
    }

    /**
     * redshift_configuration block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.KinesisFirehoseDeliveryStreamRedshiftConfiguration> getRedshiftConfiguration() {
        return null;
    }

    /**
     * s3_configuration block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.KinesisFirehoseDeliveryStreamS3Configuration> getS3Configuration() {
        return null;
    }

    /**
     * server_side_encryption block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.KinesisFirehoseDeliveryStreamServerSideEncryption> getServerSideEncryption() {
        return null;
    }

    /**
     * splunk_configuration block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.KinesisFirehoseDeliveryStreamSplunkConfiguration> getSplunkConfiguration() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getVersionId() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KinesisFirehoseDeliveryStreamConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KinesisFirehoseDeliveryStreamConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KinesisFirehoseDeliveryStreamConfig> {
        private java.lang.String destination;
        private java.lang.String name;
        private java.lang.String destinationId;
        private java.util.List<imports.aws.KinesisFirehoseDeliveryStreamElasticsearchConfiguration> elasticsearchConfiguration;
        private java.util.List<imports.aws.KinesisFirehoseDeliveryStreamExtendedS3Configuration> extendedS3Configuration;
        private java.util.List<imports.aws.KinesisFirehoseDeliveryStreamKinesisSourceConfiguration> kinesisSourceConfiguration;
        private java.util.List<imports.aws.KinesisFirehoseDeliveryStreamRedshiftConfiguration> redshiftConfiguration;
        private java.util.List<imports.aws.KinesisFirehoseDeliveryStreamS3Configuration> s3Configuration;
        private java.util.List<imports.aws.KinesisFirehoseDeliveryStreamServerSideEncryption> serverSideEncryption;
        private java.util.List<imports.aws.KinesisFirehoseDeliveryStreamSplunkConfiguration> splunkConfiguration;
        private java.util.Map<java.lang.String, java.lang.String> tags;
        private java.lang.String versionId;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamConfig#getDestination}
         * @param destination the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder destination(java.lang.String destination) {
            this.destination = destination;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamConfig#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamConfig#getDestinationId}
         * @param destinationId the value to be set.
         * @return {@code this}
         */
        public Builder destinationId(java.lang.String destinationId) {
            this.destinationId = destinationId;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamConfig#getElasticsearchConfiguration}
         * @param elasticsearchConfiguration elasticsearch_configuration block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder elasticsearchConfiguration(java.util.List<? extends imports.aws.KinesisFirehoseDeliveryStreamElasticsearchConfiguration> elasticsearchConfiguration) {
            this.elasticsearchConfiguration = (java.util.List<imports.aws.KinesisFirehoseDeliveryStreamElasticsearchConfiguration>)elasticsearchConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamConfig#getExtendedS3Configuration}
         * @param extendedS3Configuration extended_s3_configuration block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder extendedS3Configuration(java.util.List<? extends imports.aws.KinesisFirehoseDeliveryStreamExtendedS3Configuration> extendedS3Configuration) {
            this.extendedS3Configuration = (java.util.List<imports.aws.KinesisFirehoseDeliveryStreamExtendedS3Configuration>)extendedS3Configuration;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamConfig#getKinesisSourceConfiguration}
         * @param kinesisSourceConfiguration kinesis_source_configuration block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder kinesisSourceConfiguration(java.util.List<? extends imports.aws.KinesisFirehoseDeliveryStreamKinesisSourceConfiguration> kinesisSourceConfiguration) {
            this.kinesisSourceConfiguration = (java.util.List<imports.aws.KinesisFirehoseDeliveryStreamKinesisSourceConfiguration>)kinesisSourceConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamConfig#getRedshiftConfiguration}
         * @param redshiftConfiguration redshift_configuration block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder redshiftConfiguration(java.util.List<? extends imports.aws.KinesisFirehoseDeliveryStreamRedshiftConfiguration> redshiftConfiguration) {
            this.redshiftConfiguration = (java.util.List<imports.aws.KinesisFirehoseDeliveryStreamRedshiftConfiguration>)redshiftConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamConfig#getS3Configuration}
         * @param s3Configuration s3_configuration block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder s3Configuration(java.util.List<? extends imports.aws.KinesisFirehoseDeliveryStreamS3Configuration> s3Configuration) {
            this.s3Configuration = (java.util.List<imports.aws.KinesisFirehoseDeliveryStreamS3Configuration>)s3Configuration;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamConfig#getServerSideEncryption}
         * @param serverSideEncryption server_side_encryption block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder serverSideEncryption(java.util.List<? extends imports.aws.KinesisFirehoseDeliveryStreamServerSideEncryption> serverSideEncryption) {
            this.serverSideEncryption = (java.util.List<imports.aws.KinesisFirehoseDeliveryStreamServerSideEncryption>)serverSideEncryption;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamConfig#getSplunkConfiguration}
         * @param splunkConfiguration splunk_configuration block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder splunkConfiguration(java.util.List<? extends imports.aws.KinesisFirehoseDeliveryStreamSplunkConfiguration> splunkConfiguration) {
            this.splunkConfiguration = (java.util.List<imports.aws.KinesisFirehoseDeliveryStreamSplunkConfiguration>)splunkConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamConfig#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamConfig#getVersionId}
         * @param versionId the value to be set.
         * @return {@code this}
         */
        public Builder versionId(java.lang.String versionId) {
            this.versionId = versionId;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamConfig#getDependsOn}
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
         * Sets the value of {@link KinesisFirehoseDeliveryStreamConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamConfig#getProvider}
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
         * @return a new instance of {@link KinesisFirehoseDeliveryStreamConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KinesisFirehoseDeliveryStreamConfig build() {
            return new Jsii$Proxy(destination, name, destinationId, elasticsearchConfiguration, extendedS3Configuration, kinesisSourceConfiguration, redshiftConfiguration, s3Configuration, serverSideEncryption, splunkConfiguration, tags, versionId, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link KinesisFirehoseDeliveryStreamConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KinesisFirehoseDeliveryStreamConfig {
        private final java.lang.String destination;
        private final java.lang.String name;
        private final java.lang.String destinationId;
        private final java.util.List<imports.aws.KinesisFirehoseDeliveryStreamElasticsearchConfiguration> elasticsearchConfiguration;
        private final java.util.List<imports.aws.KinesisFirehoseDeliveryStreamExtendedS3Configuration> extendedS3Configuration;
        private final java.util.List<imports.aws.KinesisFirehoseDeliveryStreamKinesisSourceConfiguration> kinesisSourceConfiguration;
        private final java.util.List<imports.aws.KinesisFirehoseDeliveryStreamRedshiftConfiguration> redshiftConfiguration;
        private final java.util.List<imports.aws.KinesisFirehoseDeliveryStreamS3Configuration> s3Configuration;
        private final java.util.List<imports.aws.KinesisFirehoseDeliveryStreamServerSideEncryption> serverSideEncryption;
        private final java.util.List<imports.aws.KinesisFirehoseDeliveryStreamSplunkConfiguration> splunkConfiguration;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.lang.String versionId;
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
            this.destination = software.amazon.jsii.Kernel.get(this, "destination", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.destinationId = software.amazon.jsii.Kernel.get(this, "destinationId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.elasticsearchConfiguration = software.amazon.jsii.Kernel.get(this, "elasticsearchConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisFirehoseDeliveryStreamElasticsearchConfiguration.class)));
            this.extendedS3Configuration = software.amazon.jsii.Kernel.get(this, "extendedS3Configuration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisFirehoseDeliveryStreamExtendedS3Configuration.class)));
            this.kinesisSourceConfiguration = software.amazon.jsii.Kernel.get(this, "kinesisSourceConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisFirehoseDeliveryStreamKinesisSourceConfiguration.class)));
            this.redshiftConfiguration = software.amazon.jsii.Kernel.get(this, "redshiftConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisFirehoseDeliveryStreamRedshiftConfiguration.class)));
            this.s3Configuration = software.amazon.jsii.Kernel.get(this, "s3Configuration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisFirehoseDeliveryStreamS3Configuration.class)));
            this.serverSideEncryption = software.amazon.jsii.Kernel.get(this, "serverSideEncryption", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisFirehoseDeliveryStreamServerSideEncryption.class)));
            this.splunkConfiguration = software.amazon.jsii.Kernel.get(this, "splunkConfiguration", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.KinesisFirehoseDeliveryStreamSplunkConfiguration.class)));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.versionId = software.amazon.jsii.Kernel.get(this, "versionId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String destination, final java.lang.String name, final java.lang.String destinationId, final java.util.List<? extends imports.aws.KinesisFirehoseDeliveryStreamElasticsearchConfiguration> elasticsearchConfiguration, final java.util.List<? extends imports.aws.KinesisFirehoseDeliveryStreamExtendedS3Configuration> extendedS3Configuration, final java.util.List<? extends imports.aws.KinesisFirehoseDeliveryStreamKinesisSourceConfiguration> kinesisSourceConfiguration, final java.util.List<? extends imports.aws.KinesisFirehoseDeliveryStreamRedshiftConfiguration> redshiftConfiguration, final java.util.List<? extends imports.aws.KinesisFirehoseDeliveryStreamS3Configuration> s3Configuration, final java.util.List<? extends imports.aws.KinesisFirehoseDeliveryStreamServerSideEncryption> serverSideEncryption, final java.util.List<? extends imports.aws.KinesisFirehoseDeliveryStreamSplunkConfiguration> splunkConfiguration, final java.util.Map<java.lang.String, java.lang.String> tags, final java.lang.String versionId, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.destination = java.util.Objects.requireNonNull(destination, "destination is required");
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.destinationId = destinationId;
            this.elasticsearchConfiguration = (java.util.List<imports.aws.KinesisFirehoseDeliveryStreamElasticsearchConfiguration>)elasticsearchConfiguration;
            this.extendedS3Configuration = (java.util.List<imports.aws.KinesisFirehoseDeliveryStreamExtendedS3Configuration>)extendedS3Configuration;
            this.kinesisSourceConfiguration = (java.util.List<imports.aws.KinesisFirehoseDeliveryStreamKinesisSourceConfiguration>)kinesisSourceConfiguration;
            this.redshiftConfiguration = (java.util.List<imports.aws.KinesisFirehoseDeliveryStreamRedshiftConfiguration>)redshiftConfiguration;
            this.s3Configuration = (java.util.List<imports.aws.KinesisFirehoseDeliveryStreamS3Configuration>)s3Configuration;
            this.serverSideEncryption = (java.util.List<imports.aws.KinesisFirehoseDeliveryStreamServerSideEncryption>)serverSideEncryption;
            this.splunkConfiguration = (java.util.List<imports.aws.KinesisFirehoseDeliveryStreamSplunkConfiguration>)splunkConfiguration;
            this.tags = tags;
            this.versionId = versionId;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getDestination() {
            return this.destination;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getDestinationId() {
            return this.destinationId;
        }

        @Override
        public final java.util.List<imports.aws.KinesisFirehoseDeliveryStreamElasticsearchConfiguration> getElasticsearchConfiguration() {
            return this.elasticsearchConfiguration;
        }

        @Override
        public final java.util.List<imports.aws.KinesisFirehoseDeliveryStreamExtendedS3Configuration> getExtendedS3Configuration() {
            return this.extendedS3Configuration;
        }

        @Override
        public final java.util.List<imports.aws.KinesisFirehoseDeliveryStreamKinesisSourceConfiguration> getKinesisSourceConfiguration() {
            return this.kinesisSourceConfiguration;
        }

        @Override
        public final java.util.List<imports.aws.KinesisFirehoseDeliveryStreamRedshiftConfiguration> getRedshiftConfiguration() {
            return this.redshiftConfiguration;
        }

        @Override
        public final java.util.List<imports.aws.KinesisFirehoseDeliveryStreamS3Configuration> getS3Configuration() {
            return this.s3Configuration;
        }

        @Override
        public final java.util.List<imports.aws.KinesisFirehoseDeliveryStreamServerSideEncryption> getServerSideEncryption() {
            return this.serverSideEncryption;
        }

        @Override
        public final java.util.List<imports.aws.KinesisFirehoseDeliveryStreamSplunkConfiguration> getSplunkConfiguration() {
            return this.splunkConfiguration;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.lang.String getVersionId() {
            return this.versionId;
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

            data.set("destination", om.valueToTree(this.getDestination()));
            data.set("name", om.valueToTree(this.getName()));
            if (this.getDestinationId() != null) {
                data.set("destinationId", om.valueToTree(this.getDestinationId()));
            }
            if (this.getElasticsearchConfiguration() != null) {
                data.set("elasticsearchConfiguration", om.valueToTree(this.getElasticsearchConfiguration()));
            }
            if (this.getExtendedS3Configuration() != null) {
                data.set("extendedS3Configuration", om.valueToTree(this.getExtendedS3Configuration()));
            }
            if (this.getKinesisSourceConfiguration() != null) {
                data.set("kinesisSourceConfiguration", om.valueToTree(this.getKinesisSourceConfiguration()));
            }
            if (this.getRedshiftConfiguration() != null) {
                data.set("redshiftConfiguration", om.valueToTree(this.getRedshiftConfiguration()));
            }
            if (this.getS3Configuration() != null) {
                data.set("s3Configuration", om.valueToTree(this.getS3Configuration()));
            }
            if (this.getServerSideEncryption() != null) {
                data.set("serverSideEncryption", om.valueToTree(this.getServerSideEncryption()));
            }
            if (this.getSplunkConfiguration() != null) {
                data.set("splunkConfiguration", om.valueToTree(this.getSplunkConfiguration()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getVersionId() != null) {
                data.set("versionId", om.valueToTree(this.getVersionId()));
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
            struct.set("fqn", om.valueToTree("aws.KinesisFirehoseDeliveryStreamConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KinesisFirehoseDeliveryStreamConfig.Jsii$Proxy that = (KinesisFirehoseDeliveryStreamConfig.Jsii$Proxy) o;

            if (!destination.equals(that.destination)) return false;
            if (!name.equals(that.name)) return false;
            if (this.destinationId != null ? !this.destinationId.equals(that.destinationId) : that.destinationId != null) return false;
            if (this.elasticsearchConfiguration != null ? !this.elasticsearchConfiguration.equals(that.elasticsearchConfiguration) : that.elasticsearchConfiguration != null) return false;
            if (this.extendedS3Configuration != null ? !this.extendedS3Configuration.equals(that.extendedS3Configuration) : that.extendedS3Configuration != null) return false;
            if (this.kinesisSourceConfiguration != null ? !this.kinesisSourceConfiguration.equals(that.kinesisSourceConfiguration) : that.kinesisSourceConfiguration != null) return false;
            if (this.redshiftConfiguration != null ? !this.redshiftConfiguration.equals(that.redshiftConfiguration) : that.redshiftConfiguration != null) return false;
            if (this.s3Configuration != null ? !this.s3Configuration.equals(that.s3Configuration) : that.s3Configuration != null) return false;
            if (this.serverSideEncryption != null ? !this.serverSideEncryption.equals(that.serverSideEncryption) : that.serverSideEncryption != null) return false;
            if (this.splunkConfiguration != null ? !this.splunkConfiguration.equals(that.splunkConfiguration) : that.splunkConfiguration != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.versionId != null ? !this.versionId.equals(that.versionId) : that.versionId != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.destination.hashCode();
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.destinationId != null ? this.destinationId.hashCode() : 0);
            result = 31 * result + (this.elasticsearchConfiguration != null ? this.elasticsearchConfiguration.hashCode() : 0);
            result = 31 * result + (this.extendedS3Configuration != null ? this.extendedS3Configuration.hashCode() : 0);
            result = 31 * result + (this.kinesisSourceConfiguration != null ? this.kinesisSourceConfiguration.hashCode() : 0);
            result = 31 * result + (this.redshiftConfiguration != null ? this.redshiftConfiguration.hashCode() : 0);
            result = 31 * result + (this.s3Configuration != null ? this.s3Configuration.hashCode() : 0);
            result = 31 * result + (this.serverSideEncryption != null ? this.serverSideEncryption.hashCode() : 0);
            result = 31 * result + (this.splunkConfiguration != null ? this.splunkConfiguration.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.versionId != null ? this.versionId.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
