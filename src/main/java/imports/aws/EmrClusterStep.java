package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.573Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.EmrClusterStep")
@software.amazon.jsii.Jsii.Proxy(EmrClusterStep.Jsii$Proxy.class)
public interface EmrClusterStep extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.String getActionOnFailure() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.EmrClusterStepHadoopJarStep> getHadoopJarStep() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link EmrClusterStep}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link EmrClusterStep}
     */
    public static final class Builder implements software.amazon.jsii.Builder<EmrClusterStep> {
        private java.lang.String actionOnFailure;
        private java.util.List<imports.aws.EmrClusterStepHadoopJarStep> hadoopJarStep;
        private java.lang.String name;

        /**
         * Sets the value of {@link EmrClusterStep#getActionOnFailure}
         * @param actionOnFailure the value to be set.
         * @return {@code this}
         */
        public Builder actionOnFailure(java.lang.String actionOnFailure) {
            this.actionOnFailure = actionOnFailure;
            return this;
        }

        /**
         * Sets the value of {@link EmrClusterStep#getHadoopJarStep}
         * @param hadoopJarStep the value to be set.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder hadoopJarStep(java.util.List<? extends imports.aws.EmrClusterStepHadoopJarStep> hadoopJarStep) {
            this.hadoopJarStep = (java.util.List<imports.aws.EmrClusterStepHadoopJarStep>)hadoopJarStep;
            return this;
        }

        /**
         * Sets the value of {@link EmrClusterStep#getName}
         * @param name the value to be set.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link EmrClusterStep}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public EmrClusterStep build() {
            return new Jsii$Proxy(actionOnFailure, hadoopJarStep, name);
        }
    }

    /**
     * An implementation for {@link EmrClusterStep}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements EmrClusterStep {
        private final java.lang.String actionOnFailure;
        private final java.util.List<imports.aws.EmrClusterStepHadoopJarStep> hadoopJarStep;
        private final java.lang.String name;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.actionOnFailure = software.amazon.jsii.Kernel.get(this, "actionOnFailure", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.hadoopJarStep = software.amazon.jsii.Kernel.get(this, "hadoopJarStep", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.EmrClusterStepHadoopJarStep.class)));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String actionOnFailure, final java.util.List<? extends imports.aws.EmrClusterStepHadoopJarStep> hadoopJarStep, final java.lang.String name) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.actionOnFailure = actionOnFailure;
            this.hadoopJarStep = (java.util.List<imports.aws.EmrClusterStepHadoopJarStep>)hadoopJarStep;
            this.name = name;
        }

        @Override
        public final java.lang.String getActionOnFailure() {
            return this.actionOnFailure;
        }

        @Override
        public final java.util.List<imports.aws.EmrClusterStepHadoopJarStep> getHadoopJarStep() {
            return this.hadoopJarStep;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getActionOnFailure() != null) {
                data.set("actionOnFailure", om.valueToTree(this.getActionOnFailure()));
            }
            if (this.getHadoopJarStep() != null) {
                data.set("hadoopJarStep", om.valueToTree(this.getHadoopJarStep()));
            }
            if (this.getName() != null) {
                data.set("name", om.valueToTree(this.getName()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.EmrClusterStep"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EmrClusterStep.Jsii$Proxy that = (EmrClusterStep.Jsii$Proxy) o;

            if (this.actionOnFailure != null ? !this.actionOnFailure.equals(that.actionOnFailure) : that.actionOnFailure != null) return false;
            if (this.hadoopJarStep != null ? !this.hadoopJarStep.equals(that.hadoopJarStep) : that.hadoopJarStep != null) return false;
            return this.name != null ? this.name.equals(that.name) : that.name == null;
        }

        @Override
        public final int hashCode() {
            int result = this.actionOnFailure != null ? this.actionOnFailure.hashCode() : 0;
            result = 31 * result + (this.hadoopJarStep != null ? this.hadoopJarStep.hashCode() : 0);
            result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
            return result;
        }
    }
}
