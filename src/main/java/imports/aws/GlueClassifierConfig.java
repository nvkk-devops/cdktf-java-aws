package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.592Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.GlueClassifierConfig")
@software.amazon.jsii.Jsii.Proxy(GlueClassifierConfig.Jsii$Proxy.class)
public interface GlueClassifierConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * csv_classifier block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.GlueClassifierCsvClassifier> getCsvClassifier() {
        return null;
    }

    /**
     * grok_classifier block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.GlueClassifierGrokClassifier> getGrokClassifier() {
        return null;
    }

    /**
     * json_classifier block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.GlueClassifierJsonClassifier> getJsonClassifier() {
        return null;
    }

    /**
     * xml_classifier block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.GlueClassifierXmlClassifier> getXmlClassifier() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link GlueClassifierConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link GlueClassifierConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<GlueClassifierConfig> {
        private java.lang.String name;
        private java.util.List<imports.aws.GlueClassifierCsvClassifier> csvClassifier;
        private java.util.List<imports.aws.GlueClassifierGrokClassifier> grokClassifier;
        private java.util.List<imports.aws.GlueClassifierJsonClassifier> jsonClassifier;
        private java.util.List<imports.aws.GlueClassifierXmlClassifier> xmlClassifier;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link GlueClassifierConfig#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link GlueClassifierConfig#getCsvClassifier}
         * @param csvClassifier csv_classifier block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder csvClassifier(java.util.List<? extends imports.aws.GlueClassifierCsvClassifier> csvClassifier) {
            this.csvClassifier = (java.util.List<imports.aws.GlueClassifierCsvClassifier>)csvClassifier;
            return this;
        }

        /**
         * Sets the value of {@link GlueClassifierConfig#getGrokClassifier}
         * @param grokClassifier grok_classifier block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder grokClassifier(java.util.List<? extends imports.aws.GlueClassifierGrokClassifier> grokClassifier) {
            this.grokClassifier = (java.util.List<imports.aws.GlueClassifierGrokClassifier>)grokClassifier;
            return this;
        }

        /**
         * Sets the value of {@link GlueClassifierConfig#getJsonClassifier}
         * @param jsonClassifier json_classifier block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder jsonClassifier(java.util.List<? extends imports.aws.GlueClassifierJsonClassifier> jsonClassifier) {
            this.jsonClassifier = (java.util.List<imports.aws.GlueClassifierJsonClassifier>)jsonClassifier;
            return this;
        }

        /**
         * Sets the value of {@link GlueClassifierConfig#getXmlClassifier}
         * @param xmlClassifier xml_classifier block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder xmlClassifier(java.util.List<? extends imports.aws.GlueClassifierXmlClassifier> xmlClassifier) {
            this.xmlClassifier = (java.util.List<imports.aws.GlueClassifierXmlClassifier>)xmlClassifier;
            return this;
        }

        /**
         * Sets the value of {@link GlueClassifierConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link GlueClassifierConfig#getDependsOn}
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
         * Sets the value of {@link GlueClassifierConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link GlueClassifierConfig#getProvider}
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
         * @return a new instance of {@link GlueClassifierConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public GlueClassifierConfig build() {
            return new Jsii$Proxy(name, csvClassifier, grokClassifier, jsonClassifier, xmlClassifier, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link GlueClassifierConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements GlueClassifierConfig {
        private final java.lang.String name;
        private final java.util.List<imports.aws.GlueClassifierCsvClassifier> csvClassifier;
        private final java.util.List<imports.aws.GlueClassifierGrokClassifier> grokClassifier;
        private final java.util.List<imports.aws.GlueClassifierJsonClassifier> jsonClassifier;
        private final java.util.List<imports.aws.GlueClassifierXmlClassifier> xmlClassifier;
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
            this.csvClassifier = software.amazon.jsii.Kernel.get(this, "csvClassifier", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.GlueClassifierCsvClassifier.class)));
            this.grokClassifier = software.amazon.jsii.Kernel.get(this, "grokClassifier", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.GlueClassifierGrokClassifier.class)));
            this.jsonClassifier = software.amazon.jsii.Kernel.get(this, "jsonClassifier", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.GlueClassifierJsonClassifier.class)));
            this.xmlClassifier = software.amazon.jsii.Kernel.get(this, "xmlClassifier", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.GlueClassifierXmlClassifier.class)));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String name, final java.util.List<? extends imports.aws.GlueClassifierCsvClassifier> csvClassifier, final java.util.List<? extends imports.aws.GlueClassifierGrokClassifier> grokClassifier, final java.util.List<? extends imports.aws.GlueClassifierJsonClassifier> jsonClassifier, final java.util.List<? extends imports.aws.GlueClassifierXmlClassifier> xmlClassifier, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.csvClassifier = (java.util.List<imports.aws.GlueClassifierCsvClassifier>)csvClassifier;
            this.grokClassifier = (java.util.List<imports.aws.GlueClassifierGrokClassifier>)grokClassifier;
            this.jsonClassifier = (java.util.List<imports.aws.GlueClassifierJsonClassifier>)jsonClassifier;
            this.xmlClassifier = (java.util.List<imports.aws.GlueClassifierXmlClassifier>)xmlClassifier;
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
        public final java.util.List<imports.aws.GlueClassifierCsvClassifier> getCsvClassifier() {
            return this.csvClassifier;
        }

        @Override
        public final java.util.List<imports.aws.GlueClassifierGrokClassifier> getGrokClassifier() {
            return this.grokClassifier;
        }

        @Override
        public final java.util.List<imports.aws.GlueClassifierJsonClassifier> getJsonClassifier() {
            return this.jsonClassifier;
        }

        @Override
        public final java.util.List<imports.aws.GlueClassifierXmlClassifier> getXmlClassifier() {
            return this.xmlClassifier;
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
            if (this.getCsvClassifier() != null) {
                data.set("csvClassifier", om.valueToTree(this.getCsvClassifier()));
            }
            if (this.getGrokClassifier() != null) {
                data.set("grokClassifier", om.valueToTree(this.getGrokClassifier()));
            }
            if (this.getJsonClassifier() != null) {
                data.set("jsonClassifier", om.valueToTree(this.getJsonClassifier()));
            }
            if (this.getXmlClassifier() != null) {
                data.set("xmlClassifier", om.valueToTree(this.getXmlClassifier()));
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
            struct.set("fqn", om.valueToTree("aws.GlueClassifierConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            GlueClassifierConfig.Jsii$Proxy that = (GlueClassifierConfig.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (this.csvClassifier != null ? !this.csvClassifier.equals(that.csvClassifier) : that.csvClassifier != null) return false;
            if (this.grokClassifier != null ? !this.grokClassifier.equals(that.grokClassifier) : that.grokClassifier != null) return false;
            if (this.jsonClassifier != null ? !this.jsonClassifier.equals(that.jsonClassifier) : that.jsonClassifier != null) return false;
            if (this.xmlClassifier != null ? !this.xmlClassifier.equals(that.xmlClassifier) : that.xmlClassifier != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.csvClassifier != null ? this.csvClassifier.hashCode() : 0);
            result = 31 * result + (this.grokClassifier != null ? this.grokClassifier.hashCode() : 0);
            result = 31 * result + (this.jsonClassifier != null ? this.jsonClassifier.hashCode() : 0);
            result = 31 * result + (this.xmlClassifier != null ? this.xmlClassifier.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
