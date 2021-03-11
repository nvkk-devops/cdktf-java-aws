package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.593Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.GlueClassifierCsvClassifier")
@software.amazon.jsii.Jsii.Proxy(GlueClassifierCsvClassifier.Jsii$Proxy.class)
public interface GlueClassifierCsvClassifier extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAllowSingleColumn() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getContainsHeader() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDelimiter() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getDisableValueTrimming() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getHeader() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getQuoteSymbol() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link GlueClassifierCsvClassifier}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link GlueClassifierCsvClassifier}
     */
    public static final class Builder implements software.amazon.jsii.Builder<GlueClassifierCsvClassifier> {
        private java.lang.Boolean allowSingleColumn;
        private java.lang.String containsHeader;
        private java.lang.String delimiter;
        private java.lang.Boolean disableValueTrimming;
        private java.util.List<java.lang.String> header;
        private java.lang.String quoteSymbol;

        /**
         * Sets the value of {@link GlueClassifierCsvClassifier#getAllowSingleColumn}
         * @param allowSingleColumn the value to be set.
         * @return {@code this}
         */
        public Builder allowSingleColumn(java.lang.Boolean allowSingleColumn) {
            this.allowSingleColumn = allowSingleColumn;
            return this;
        }

        /**
         * Sets the value of {@link GlueClassifierCsvClassifier#getContainsHeader}
         * @param containsHeader the value to be set.
         * @return {@code this}
         */
        public Builder containsHeader(java.lang.String containsHeader) {
            this.containsHeader = containsHeader;
            return this;
        }

        /**
         * Sets the value of {@link GlueClassifierCsvClassifier#getDelimiter}
         * @param delimiter the value to be set.
         * @return {@code this}
         */
        public Builder delimiter(java.lang.String delimiter) {
            this.delimiter = delimiter;
            return this;
        }

        /**
         * Sets the value of {@link GlueClassifierCsvClassifier#getDisableValueTrimming}
         * @param disableValueTrimming the value to be set.
         * @return {@code this}
         */
        public Builder disableValueTrimming(java.lang.Boolean disableValueTrimming) {
            this.disableValueTrimming = disableValueTrimming;
            return this;
        }

        /**
         * Sets the value of {@link GlueClassifierCsvClassifier#getHeader}
         * @param header the value to be set.
         * @return {@code this}
         */
        public Builder header(java.util.List<java.lang.String> header) {
            this.header = header;
            return this;
        }

        /**
         * Sets the value of {@link GlueClassifierCsvClassifier#getQuoteSymbol}
         * @param quoteSymbol the value to be set.
         * @return {@code this}
         */
        public Builder quoteSymbol(java.lang.String quoteSymbol) {
            this.quoteSymbol = quoteSymbol;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link GlueClassifierCsvClassifier}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public GlueClassifierCsvClassifier build() {
            return new Jsii$Proxy(allowSingleColumn, containsHeader, delimiter, disableValueTrimming, header, quoteSymbol);
        }
    }

    /**
     * An implementation for {@link GlueClassifierCsvClassifier}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements GlueClassifierCsvClassifier {
        private final java.lang.Boolean allowSingleColumn;
        private final java.lang.String containsHeader;
        private final java.lang.String delimiter;
        private final java.lang.Boolean disableValueTrimming;
        private final java.util.List<java.lang.String> header;
        private final java.lang.String quoteSymbol;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.allowSingleColumn = software.amazon.jsii.Kernel.get(this, "allowSingleColumn", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.containsHeader = software.amazon.jsii.Kernel.get(this, "containsHeader", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.delimiter = software.amazon.jsii.Kernel.get(this, "delimiter", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.disableValueTrimming = software.amazon.jsii.Kernel.get(this, "disableValueTrimming", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.header = software.amazon.jsii.Kernel.get(this, "header", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.quoteSymbol = software.amazon.jsii.Kernel.get(this, "quoteSymbol", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.Boolean allowSingleColumn, final java.lang.String containsHeader, final java.lang.String delimiter, final java.lang.Boolean disableValueTrimming, final java.util.List<java.lang.String> header, final java.lang.String quoteSymbol) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.allowSingleColumn = allowSingleColumn;
            this.containsHeader = containsHeader;
            this.delimiter = delimiter;
            this.disableValueTrimming = disableValueTrimming;
            this.header = header;
            this.quoteSymbol = quoteSymbol;
        }

        @Override
        public final java.lang.Boolean getAllowSingleColumn() {
            return this.allowSingleColumn;
        }

        @Override
        public final java.lang.String getContainsHeader() {
            return this.containsHeader;
        }

        @Override
        public final java.lang.String getDelimiter() {
            return this.delimiter;
        }

        @Override
        public final java.lang.Boolean getDisableValueTrimming() {
            return this.disableValueTrimming;
        }

        @Override
        public final java.util.List<java.lang.String> getHeader() {
            return this.header;
        }

        @Override
        public final java.lang.String getQuoteSymbol() {
            return this.quoteSymbol;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAllowSingleColumn() != null) {
                data.set("allowSingleColumn", om.valueToTree(this.getAllowSingleColumn()));
            }
            if (this.getContainsHeader() != null) {
                data.set("containsHeader", om.valueToTree(this.getContainsHeader()));
            }
            if (this.getDelimiter() != null) {
                data.set("delimiter", om.valueToTree(this.getDelimiter()));
            }
            if (this.getDisableValueTrimming() != null) {
                data.set("disableValueTrimming", om.valueToTree(this.getDisableValueTrimming()));
            }
            if (this.getHeader() != null) {
                data.set("header", om.valueToTree(this.getHeader()));
            }
            if (this.getQuoteSymbol() != null) {
                data.set("quoteSymbol", om.valueToTree(this.getQuoteSymbol()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.GlueClassifierCsvClassifier"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            GlueClassifierCsvClassifier.Jsii$Proxy that = (GlueClassifierCsvClassifier.Jsii$Proxy) o;

            if (this.allowSingleColumn != null ? !this.allowSingleColumn.equals(that.allowSingleColumn) : that.allowSingleColumn != null) return false;
            if (this.containsHeader != null ? !this.containsHeader.equals(that.containsHeader) : that.containsHeader != null) return false;
            if (this.delimiter != null ? !this.delimiter.equals(that.delimiter) : that.delimiter != null) return false;
            if (this.disableValueTrimming != null ? !this.disableValueTrimming.equals(that.disableValueTrimming) : that.disableValueTrimming != null) return false;
            if (this.header != null ? !this.header.equals(that.header) : that.header != null) return false;
            return this.quoteSymbol != null ? this.quoteSymbol.equals(that.quoteSymbol) : that.quoteSymbol == null;
        }

        @Override
        public final int hashCode() {
            int result = this.allowSingleColumn != null ? this.allowSingleColumn.hashCode() : 0;
            result = 31 * result + (this.containsHeader != null ? this.containsHeader.hashCode() : 0);
            result = 31 * result + (this.delimiter != null ? this.delimiter.hashCode() : 0);
            result = 31 * result + (this.disableValueTrimming != null ? this.disableValueTrimming.hashCode() : 0);
            result = 31 * result + (this.header != null ? this.header.hashCode() : 0);
            result = 31 * result + (this.quoteSymbol != null ? this.quoteSymbol.hashCode() : 0);
            return result;
        }
    }
}
