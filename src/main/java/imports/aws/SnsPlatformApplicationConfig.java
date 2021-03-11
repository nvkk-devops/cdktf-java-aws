package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.869Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.SnsPlatformApplicationConfig")
@software.amazon.jsii.Jsii.Proxy(SnsPlatformApplicationConfig.Jsii$Proxy.class)
public interface SnsPlatformApplicationConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    @org.jetbrains.annotations.NotNull java.lang.String getPlatform();

    @org.jetbrains.annotations.NotNull java.lang.String getPlatformCredential();

    default @org.jetbrains.annotations.Nullable java.lang.String getEventDeliveryFailureTopicArn() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getEventEndpointCreatedTopicArn() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getEventEndpointDeletedTopicArn() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getEventEndpointUpdatedTopicArn() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getFailureFeedbackRoleArn() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPlatformPrincipal() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSuccessFeedbackRoleArn() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSuccessFeedbackSampleRate() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SnsPlatformApplicationConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SnsPlatformApplicationConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SnsPlatformApplicationConfig> {
        private java.lang.String name;
        private java.lang.String platform;
        private java.lang.String platformCredential;
        private java.lang.String eventDeliveryFailureTopicArn;
        private java.lang.String eventEndpointCreatedTopicArn;
        private java.lang.String eventEndpointDeletedTopicArn;
        private java.lang.String eventEndpointUpdatedTopicArn;
        private java.lang.String failureFeedbackRoleArn;
        private java.lang.String platformPrincipal;
        private java.lang.String successFeedbackRoleArn;
        private java.lang.String successFeedbackSampleRate;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link SnsPlatformApplicationConfig#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link SnsPlatformApplicationConfig#getPlatform}
         * @param platform the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder platform(java.lang.String platform) {
            this.platform = platform;
            return this;
        }

        /**
         * Sets the value of {@link SnsPlatformApplicationConfig#getPlatformCredential}
         * @param platformCredential the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder platformCredential(java.lang.String platformCredential) {
            this.platformCredential = platformCredential;
            return this;
        }

        /**
         * Sets the value of {@link SnsPlatformApplicationConfig#getEventDeliveryFailureTopicArn}
         * @param eventDeliveryFailureTopicArn the value to be set.
         * @return {@code this}
         */
        public Builder eventDeliveryFailureTopicArn(java.lang.String eventDeliveryFailureTopicArn) {
            this.eventDeliveryFailureTopicArn = eventDeliveryFailureTopicArn;
            return this;
        }

        /**
         * Sets the value of {@link SnsPlatformApplicationConfig#getEventEndpointCreatedTopicArn}
         * @param eventEndpointCreatedTopicArn the value to be set.
         * @return {@code this}
         */
        public Builder eventEndpointCreatedTopicArn(java.lang.String eventEndpointCreatedTopicArn) {
            this.eventEndpointCreatedTopicArn = eventEndpointCreatedTopicArn;
            return this;
        }

        /**
         * Sets the value of {@link SnsPlatformApplicationConfig#getEventEndpointDeletedTopicArn}
         * @param eventEndpointDeletedTopicArn the value to be set.
         * @return {@code this}
         */
        public Builder eventEndpointDeletedTopicArn(java.lang.String eventEndpointDeletedTopicArn) {
            this.eventEndpointDeletedTopicArn = eventEndpointDeletedTopicArn;
            return this;
        }

        /**
         * Sets the value of {@link SnsPlatformApplicationConfig#getEventEndpointUpdatedTopicArn}
         * @param eventEndpointUpdatedTopicArn the value to be set.
         * @return {@code this}
         */
        public Builder eventEndpointUpdatedTopicArn(java.lang.String eventEndpointUpdatedTopicArn) {
            this.eventEndpointUpdatedTopicArn = eventEndpointUpdatedTopicArn;
            return this;
        }

        /**
         * Sets the value of {@link SnsPlatformApplicationConfig#getFailureFeedbackRoleArn}
         * @param failureFeedbackRoleArn the value to be set.
         * @return {@code this}
         */
        public Builder failureFeedbackRoleArn(java.lang.String failureFeedbackRoleArn) {
            this.failureFeedbackRoleArn = failureFeedbackRoleArn;
            return this;
        }

        /**
         * Sets the value of {@link SnsPlatformApplicationConfig#getPlatformPrincipal}
         * @param platformPrincipal the value to be set.
         * @return {@code this}
         */
        public Builder platformPrincipal(java.lang.String platformPrincipal) {
            this.platformPrincipal = platformPrincipal;
            return this;
        }

        /**
         * Sets the value of {@link SnsPlatformApplicationConfig#getSuccessFeedbackRoleArn}
         * @param successFeedbackRoleArn the value to be set.
         * @return {@code this}
         */
        public Builder successFeedbackRoleArn(java.lang.String successFeedbackRoleArn) {
            this.successFeedbackRoleArn = successFeedbackRoleArn;
            return this;
        }

        /**
         * Sets the value of {@link SnsPlatformApplicationConfig#getSuccessFeedbackSampleRate}
         * @param successFeedbackSampleRate the value to be set.
         * @return {@code this}
         */
        public Builder successFeedbackSampleRate(java.lang.String successFeedbackSampleRate) {
            this.successFeedbackSampleRate = successFeedbackSampleRate;
            return this;
        }

        /**
         * Sets the value of {@link SnsPlatformApplicationConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link SnsPlatformApplicationConfig#getDependsOn}
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
         * Sets the value of {@link SnsPlatformApplicationConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link SnsPlatformApplicationConfig#getProvider}
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
         * @return a new instance of {@link SnsPlatformApplicationConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SnsPlatformApplicationConfig build() {
            return new Jsii$Proxy(name, platform, platformCredential, eventDeliveryFailureTopicArn, eventEndpointCreatedTopicArn, eventEndpointDeletedTopicArn, eventEndpointUpdatedTopicArn, failureFeedbackRoleArn, platformPrincipal, successFeedbackRoleArn, successFeedbackSampleRate, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link SnsPlatformApplicationConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SnsPlatformApplicationConfig {
        private final java.lang.String name;
        private final java.lang.String platform;
        private final java.lang.String platformCredential;
        private final java.lang.String eventDeliveryFailureTopicArn;
        private final java.lang.String eventEndpointCreatedTopicArn;
        private final java.lang.String eventEndpointDeletedTopicArn;
        private final java.lang.String eventEndpointUpdatedTopicArn;
        private final java.lang.String failureFeedbackRoleArn;
        private final java.lang.String platformPrincipal;
        private final java.lang.String successFeedbackRoleArn;
        private final java.lang.String successFeedbackSampleRate;
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
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.platform = software.amazon.jsii.Kernel.get(this, "platform", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.platformCredential = software.amazon.jsii.Kernel.get(this, "platformCredential", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.eventDeliveryFailureTopicArn = software.amazon.jsii.Kernel.get(this, "eventDeliveryFailureTopicArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.eventEndpointCreatedTopicArn = software.amazon.jsii.Kernel.get(this, "eventEndpointCreatedTopicArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.eventEndpointDeletedTopicArn = software.amazon.jsii.Kernel.get(this, "eventEndpointDeletedTopicArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.eventEndpointUpdatedTopicArn = software.amazon.jsii.Kernel.get(this, "eventEndpointUpdatedTopicArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.failureFeedbackRoleArn = software.amazon.jsii.Kernel.get(this, "failureFeedbackRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.platformPrincipal = software.amazon.jsii.Kernel.get(this, "platformPrincipal", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.successFeedbackRoleArn = software.amazon.jsii.Kernel.get(this, "successFeedbackRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.successFeedbackSampleRate = software.amazon.jsii.Kernel.get(this, "successFeedbackSampleRate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String name, final java.lang.String platform, final java.lang.String platformCredential, final java.lang.String eventDeliveryFailureTopicArn, final java.lang.String eventEndpointCreatedTopicArn, final java.lang.String eventEndpointDeletedTopicArn, final java.lang.String eventEndpointUpdatedTopicArn, final java.lang.String failureFeedbackRoleArn, final java.lang.String platformPrincipal, final java.lang.String successFeedbackRoleArn, final java.lang.String successFeedbackSampleRate, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.platform = java.util.Objects.requireNonNull(platform, "platform is required");
            this.platformCredential = java.util.Objects.requireNonNull(platformCredential, "platformCredential is required");
            this.eventDeliveryFailureTopicArn = eventDeliveryFailureTopicArn;
            this.eventEndpointCreatedTopicArn = eventEndpointCreatedTopicArn;
            this.eventEndpointDeletedTopicArn = eventEndpointDeletedTopicArn;
            this.eventEndpointUpdatedTopicArn = eventEndpointUpdatedTopicArn;
            this.failureFeedbackRoleArn = failureFeedbackRoleArn;
            this.platformPrincipal = platformPrincipal;
            this.successFeedbackRoleArn = successFeedbackRoleArn;
            this.successFeedbackSampleRate = successFeedbackSampleRate;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getPlatform() {
            return this.platform;
        }

        @Override
        public final java.lang.String getPlatformCredential() {
            return this.platformCredential;
        }

        @Override
        public final java.lang.String getEventDeliveryFailureTopicArn() {
            return this.eventDeliveryFailureTopicArn;
        }

        @Override
        public final java.lang.String getEventEndpointCreatedTopicArn() {
            return this.eventEndpointCreatedTopicArn;
        }

        @Override
        public final java.lang.String getEventEndpointDeletedTopicArn() {
            return this.eventEndpointDeletedTopicArn;
        }

        @Override
        public final java.lang.String getEventEndpointUpdatedTopicArn() {
            return this.eventEndpointUpdatedTopicArn;
        }

        @Override
        public final java.lang.String getFailureFeedbackRoleArn() {
            return this.failureFeedbackRoleArn;
        }

        @Override
        public final java.lang.String getPlatformPrincipal() {
            return this.platformPrincipal;
        }

        @Override
        public final java.lang.String getSuccessFeedbackRoleArn() {
            return this.successFeedbackRoleArn;
        }

        @Override
        public final java.lang.String getSuccessFeedbackSampleRate() {
            return this.successFeedbackSampleRate;
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

            data.set("name", om.valueToTree(this.getName()));
            data.set("platform", om.valueToTree(this.getPlatform()));
            data.set("platformCredential", om.valueToTree(this.getPlatformCredential()));
            if (this.getEventDeliveryFailureTopicArn() != null) {
                data.set("eventDeliveryFailureTopicArn", om.valueToTree(this.getEventDeliveryFailureTopicArn()));
            }
            if (this.getEventEndpointCreatedTopicArn() != null) {
                data.set("eventEndpointCreatedTopicArn", om.valueToTree(this.getEventEndpointCreatedTopicArn()));
            }
            if (this.getEventEndpointDeletedTopicArn() != null) {
                data.set("eventEndpointDeletedTopicArn", om.valueToTree(this.getEventEndpointDeletedTopicArn()));
            }
            if (this.getEventEndpointUpdatedTopicArn() != null) {
                data.set("eventEndpointUpdatedTopicArn", om.valueToTree(this.getEventEndpointUpdatedTopicArn()));
            }
            if (this.getFailureFeedbackRoleArn() != null) {
                data.set("failureFeedbackRoleArn", om.valueToTree(this.getFailureFeedbackRoleArn()));
            }
            if (this.getPlatformPrincipal() != null) {
                data.set("platformPrincipal", om.valueToTree(this.getPlatformPrincipal()));
            }
            if (this.getSuccessFeedbackRoleArn() != null) {
                data.set("successFeedbackRoleArn", om.valueToTree(this.getSuccessFeedbackRoleArn()));
            }
            if (this.getSuccessFeedbackSampleRate() != null) {
                data.set("successFeedbackSampleRate", om.valueToTree(this.getSuccessFeedbackSampleRate()));
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
            struct.set("fqn", om.valueToTree("aws.SnsPlatformApplicationConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SnsPlatformApplicationConfig.Jsii$Proxy that = (SnsPlatformApplicationConfig.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (!platform.equals(that.platform)) return false;
            if (!platformCredential.equals(that.platformCredential)) return false;
            if (this.eventDeliveryFailureTopicArn != null ? !this.eventDeliveryFailureTopicArn.equals(that.eventDeliveryFailureTopicArn) : that.eventDeliveryFailureTopicArn != null) return false;
            if (this.eventEndpointCreatedTopicArn != null ? !this.eventEndpointCreatedTopicArn.equals(that.eventEndpointCreatedTopicArn) : that.eventEndpointCreatedTopicArn != null) return false;
            if (this.eventEndpointDeletedTopicArn != null ? !this.eventEndpointDeletedTopicArn.equals(that.eventEndpointDeletedTopicArn) : that.eventEndpointDeletedTopicArn != null) return false;
            if (this.eventEndpointUpdatedTopicArn != null ? !this.eventEndpointUpdatedTopicArn.equals(that.eventEndpointUpdatedTopicArn) : that.eventEndpointUpdatedTopicArn != null) return false;
            if (this.failureFeedbackRoleArn != null ? !this.failureFeedbackRoleArn.equals(that.failureFeedbackRoleArn) : that.failureFeedbackRoleArn != null) return false;
            if (this.platformPrincipal != null ? !this.platformPrincipal.equals(that.platformPrincipal) : that.platformPrincipal != null) return false;
            if (this.successFeedbackRoleArn != null ? !this.successFeedbackRoleArn.equals(that.successFeedbackRoleArn) : that.successFeedbackRoleArn != null) return false;
            if (this.successFeedbackSampleRate != null ? !this.successFeedbackSampleRate.equals(that.successFeedbackSampleRate) : that.successFeedbackSampleRate != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.platform.hashCode());
            result = 31 * result + (this.platformCredential.hashCode());
            result = 31 * result + (this.eventDeliveryFailureTopicArn != null ? this.eventDeliveryFailureTopicArn.hashCode() : 0);
            result = 31 * result + (this.eventEndpointCreatedTopicArn != null ? this.eventEndpointCreatedTopicArn.hashCode() : 0);
            result = 31 * result + (this.eventEndpointDeletedTopicArn != null ? this.eventEndpointDeletedTopicArn.hashCode() : 0);
            result = 31 * result + (this.eventEndpointUpdatedTopicArn != null ? this.eventEndpointUpdatedTopicArn.hashCode() : 0);
            result = 31 * result + (this.failureFeedbackRoleArn != null ? this.failureFeedbackRoleArn.hashCode() : 0);
            result = 31 * result + (this.platformPrincipal != null ? this.platformPrincipal.hashCode() : 0);
            result = 31 * result + (this.successFeedbackRoleArn != null ? this.successFeedbackRoleArn.hashCode() : 0);
            result = 31 * result + (this.successFeedbackSampleRate != null ? this.successFeedbackSampleRate.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
