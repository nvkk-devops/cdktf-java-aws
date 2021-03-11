package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.520Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.EcsTaskDefinitionVolumeDockerVolumeConfiguration")
@software.amazon.jsii.Jsii.Proxy(EcsTaskDefinitionVolumeDockerVolumeConfiguration.Jsii$Proxy.class)
public interface EcsTaskDefinitionVolumeDockerVolumeConfiguration extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAutoprovision() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDriver() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getDriverOpts() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getLabels() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getScope() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link EcsTaskDefinitionVolumeDockerVolumeConfiguration}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link EcsTaskDefinitionVolumeDockerVolumeConfiguration}
     */
    public static final class Builder implements software.amazon.jsii.Builder<EcsTaskDefinitionVolumeDockerVolumeConfiguration> {
        private java.lang.Boolean autoprovision;
        private java.lang.String driver;
        private java.util.Map<java.lang.String, java.lang.String> driverOpts;
        private java.util.Map<java.lang.String, java.lang.String> labels;
        private java.lang.String scope;

        /**
         * Sets the value of {@link EcsTaskDefinitionVolumeDockerVolumeConfiguration#getAutoprovision}
         * @param autoprovision the value to be set.
         * @return {@code this}
         */
        public Builder autoprovision(java.lang.Boolean autoprovision) {
            this.autoprovision = autoprovision;
            return this;
        }

        /**
         * Sets the value of {@link EcsTaskDefinitionVolumeDockerVolumeConfiguration#getDriver}
         * @param driver the value to be set.
         * @return {@code this}
         */
        public Builder driver(java.lang.String driver) {
            this.driver = driver;
            return this;
        }

        /**
         * Sets the value of {@link EcsTaskDefinitionVolumeDockerVolumeConfiguration#getDriverOpts}
         * @param driverOpts the value to be set.
         * @return {@code this}
         */
        public Builder driverOpts(java.util.Map<java.lang.String, java.lang.String> driverOpts) {
            this.driverOpts = driverOpts;
            return this;
        }

        /**
         * Sets the value of {@link EcsTaskDefinitionVolumeDockerVolumeConfiguration#getLabels}
         * @param labels the value to be set.
         * @return {@code this}
         */
        public Builder labels(java.util.Map<java.lang.String, java.lang.String> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * Sets the value of {@link EcsTaskDefinitionVolumeDockerVolumeConfiguration#getScope}
         * @param scope the value to be set.
         * @return {@code this}
         */
        public Builder scope(java.lang.String scope) {
            this.scope = scope;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link EcsTaskDefinitionVolumeDockerVolumeConfiguration}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public EcsTaskDefinitionVolumeDockerVolumeConfiguration build() {
            return new Jsii$Proxy(autoprovision, driver, driverOpts, labels, scope);
        }
    }

    /**
     * An implementation for {@link EcsTaskDefinitionVolumeDockerVolumeConfiguration}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements EcsTaskDefinitionVolumeDockerVolumeConfiguration {
        private final java.lang.Boolean autoprovision;
        private final java.lang.String driver;
        private final java.util.Map<java.lang.String, java.lang.String> driverOpts;
        private final java.util.Map<java.lang.String, java.lang.String> labels;
        private final java.lang.String scope;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.autoprovision = software.amazon.jsii.Kernel.get(this, "autoprovision", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.driver = software.amazon.jsii.Kernel.get(this, "driver", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.driverOpts = software.amazon.jsii.Kernel.get(this, "driverOpts", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.labels = software.amazon.jsii.Kernel.get(this, "labels", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.scope = software.amazon.jsii.Kernel.get(this, "scope", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.Boolean autoprovision, final java.lang.String driver, final java.util.Map<java.lang.String, java.lang.String> driverOpts, final java.util.Map<java.lang.String, java.lang.String> labels, final java.lang.String scope) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.autoprovision = autoprovision;
            this.driver = driver;
            this.driverOpts = driverOpts;
            this.labels = labels;
            this.scope = scope;
        }

        @Override
        public final java.lang.Boolean getAutoprovision() {
            return this.autoprovision;
        }

        @Override
        public final java.lang.String getDriver() {
            return this.driver;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getDriverOpts() {
            return this.driverOpts;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getLabels() {
            return this.labels;
        }

        @Override
        public final java.lang.String getScope() {
            return this.scope;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAutoprovision() != null) {
                data.set("autoprovision", om.valueToTree(this.getAutoprovision()));
            }
            if (this.getDriver() != null) {
                data.set("driver", om.valueToTree(this.getDriver()));
            }
            if (this.getDriverOpts() != null) {
                data.set("driverOpts", om.valueToTree(this.getDriverOpts()));
            }
            if (this.getLabels() != null) {
                data.set("labels", om.valueToTree(this.getLabels()));
            }
            if (this.getScope() != null) {
                data.set("scope", om.valueToTree(this.getScope()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.EcsTaskDefinitionVolumeDockerVolumeConfiguration"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EcsTaskDefinitionVolumeDockerVolumeConfiguration.Jsii$Proxy that = (EcsTaskDefinitionVolumeDockerVolumeConfiguration.Jsii$Proxy) o;

            if (this.autoprovision != null ? !this.autoprovision.equals(that.autoprovision) : that.autoprovision != null) return false;
            if (this.driver != null ? !this.driver.equals(that.driver) : that.driver != null) return false;
            if (this.driverOpts != null ? !this.driverOpts.equals(that.driverOpts) : that.driverOpts != null) return false;
            if (this.labels != null ? !this.labels.equals(that.labels) : that.labels != null) return false;
            return this.scope != null ? this.scope.equals(that.scope) : that.scope == null;
        }

        @Override
        public final int hashCode() {
            int result = this.autoprovision != null ? this.autoprovision.hashCode() : 0;
            result = 31 * result + (this.driver != null ? this.driver.hashCode() : 0);
            result = 31 * result + (this.driverOpts != null ? this.driverOpts.hashCode() : 0);
            result = 31 * result + (this.labels != null ? this.labels.hashCode() : 0);
            result = 31 * result + (this.scope != null ? this.scope.hashCode() : 0);
            return result;
        }
    }
}
