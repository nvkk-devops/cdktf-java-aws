package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.558Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.ElastictranscoderPresetThumbnails")
@software.amazon.jsii.Jsii.Proxy(ElastictranscoderPresetThumbnails.Jsii$Proxy.class)
public interface ElastictranscoderPresetThumbnails extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.String getAspectRatio() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getFormat() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getInterval() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getMaxHeight() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getMaxWidth() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPaddingPolicy() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getResolution() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSizingPolicy() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ElastictranscoderPresetThumbnails}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ElastictranscoderPresetThumbnails}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ElastictranscoderPresetThumbnails> {
        private java.lang.String aspectRatio;
        private java.lang.String format;
        private java.lang.String interval;
        private java.lang.String maxHeight;
        private java.lang.String maxWidth;
        private java.lang.String paddingPolicy;
        private java.lang.String resolution;
        private java.lang.String sizingPolicy;

        /**
         * Sets the value of {@link ElastictranscoderPresetThumbnails#getAspectRatio}
         * @param aspectRatio the value to be set.
         * @return {@code this}
         */
        public Builder aspectRatio(java.lang.String aspectRatio) {
            this.aspectRatio = aspectRatio;
            return this;
        }

        /**
         * Sets the value of {@link ElastictranscoderPresetThumbnails#getFormat}
         * @param format the value to be set.
         * @return {@code this}
         */
        public Builder format(java.lang.String format) {
            this.format = format;
            return this;
        }

        /**
         * Sets the value of {@link ElastictranscoderPresetThumbnails#getInterval}
         * @param interval the value to be set.
         * @return {@code this}
         */
        public Builder interval(java.lang.String interval) {
            this.interval = interval;
            return this;
        }

        /**
         * Sets the value of {@link ElastictranscoderPresetThumbnails#getMaxHeight}
         * @param maxHeight the value to be set.
         * @return {@code this}
         */
        public Builder maxHeight(java.lang.String maxHeight) {
            this.maxHeight = maxHeight;
            return this;
        }

        /**
         * Sets the value of {@link ElastictranscoderPresetThumbnails#getMaxWidth}
         * @param maxWidth the value to be set.
         * @return {@code this}
         */
        public Builder maxWidth(java.lang.String maxWidth) {
            this.maxWidth = maxWidth;
            return this;
        }

        /**
         * Sets the value of {@link ElastictranscoderPresetThumbnails#getPaddingPolicy}
         * @param paddingPolicy the value to be set.
         * @return {@code this}
         */
        public Builder paddingPolicy(java.lang.String paddingPolicy) {
            this.paddingPolicy = paddingPolicy;
            return this;
        }

        /**
         * Sets the value of {@link ElastictranscoderPresetThumbnails#getResolution}
         * @param resolution the value to be set.
         * @return {@code this}
         */
        public Builder resolution(java.lang.String resolution) {
            this.resolution = resolution;
            return this;
        }

        /**
         * Sets the value of {@link ElastictranscoderPresetThumbnails#getSizingPolicy}
         * @param sizingPolicy the value to be set.
         * @return {@code this}
         */
        public Builder sizingPolicy(java.lang.String sizingPolicy) {
            this.sizingPolicy = sizingPolicy;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ElastictranscoderPresetThumbnails}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ElastictranscoderPresetThumbnails build() {
            return new Jsii$Proxy(aspectRatio, format, interval, maxHeight, maxWidth, paddingPolicy, resolution, sizingPolicy);
        }
    }

    /**
     * An implementation for {@link ElastictranscoderPresetThumbnails}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ElastictranscoderPresetThumbnails {
        private final java.lang.String aspectRatio;
        private final java.lang.String format;
        private final java.lang.String interval;
        private final java.lang.String maxHeight;
        private final java.lang.String maxWidth;
        private final java.lang.String paddingPolicy;
        private final java.lang.String resolution;
        private final java.lang.String sizingPolicy;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.aspectRatio = software.amazon.jsii.Kernel.get(this, "aspectRatio", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.format = software.amazon.jsii.Kernel.get(this, "format", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.interval = software.amazon.jsii.Kernel.get(this, "interval", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.maxHeight = software.amazon.jsii.Kernel.get(this, "maxHeight", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.maxWidth = software.amazon.jsii.Kernel.get(this, "maxWidth", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.paddingPolicy = software.amazon.jsii.Kernel.get(this, "paddingPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.resolution = software.amazon.jsii.Kernel.get(this, "resolution", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.sizingPolicy = software.amazon.jsii.Kernel.get(this, "sizingPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String aspectRatio, final java.lang.String format, final java.lang.String interval, final java.lang.String maxHeight, final java.lang.String maxWidth, final java.lang.String paddingPolicy, final java.lang.String resolution, final java.lang.String sizingPolicy) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.aspectRatio = aspectRatio;
            this.format = format;
            this.interval = interval;
            this.maxHeight = maxHeight;
            this.maxWidth = maxWidth;
            this.paddingPolicy = paddingPolicy;
            this.resolution = resolution;
            this.sizingPolicy = sizingPolicy;
        }

        @Override
        public final java.lang.String getAspectRatio() {
            return this.aspectRatio;
        }

        @Override
        public final java.lang.String getFormat() {
            return this.format;
        }

        @Override
        public final java.lang.String getInterval() {
            return this.interval;
        }

        @Override
        public final java.lang.String getMaxHeight() {
            return this.maxHeight;
        }

        @Override
        public final java.lang.String getMaxWidth() {
            return this.maxWidth;
        }

        @Override
        public final java.lang.String getPaddingPolicy() {
            return this.paddingPolicy;
        }

        @Override
        public final java.lang.String getResolution() {
            return this.resolution;
        }

        @Override
        public final java.lang.String getSizingPolicy() {
            return this.sizingPolicy;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAspectRatio() != null) {
                data.set("aspectRatio", om.valueToTree(this.getAspectRatio()));
            }
            if (this.getFormat() != null) {
                data.set("format", om.valueToTree(this.getFormat()));
            }
            if (this.getInterval() != null) {
                data.set("interval", om.valueToTree(this.getInterval()));
            }
            if (this.getMaxHeight() != null) {
                data.set("maxHeight", om.valueToTree(this.getMaxHeight()));
            }
            if (this.getMaxWidth() != null) {
                data.set("maxWidth", om.valueToTree(this.getMaxWidth()));
            }
            if (this.getPaddingPolicy() != null) {
                data.set("paddingPolicy", om.valueToTree(this.getPaddingPolicy()));
            }
            if (this.getResolution() != null) {
                data.set("resolution", om.valueToTree(this.getResolution()));
            }
            if (this.getSizingPolicy() != null) {
                data.set("sizingPolicy", om.valueToTree(this.getSizingPolicy()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.ElastictranscoderPresetThumbnails"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ElastictranscoderPresetThumbnails.Jsii$Proxy that = (ElastictranscoderPresetThumbnails.Jsii$Proxy) o;

            if (this.aspectRatio != null ? !this.aspectRatio.equals(that.aspectRatio) : that.aspectRatio != null) return false;
            if (this.format != null ? !this.format.equals(that.format) : that.format != null) return false;
            if (this.interval != null ? !this.interval.equals(that.interval) : that.interval != null) return false;
            if (this.maxHeight != null ? !this.maxHeight.equals(that.maxHeight) : that.maxHeight != null) return false;
            if (this.maxWidth != null ? !this.maxWidth.equals(that.maxWidth) : that.maxWidth != null) return false;
            if (this.paddingPolicy != null ? !this.paddingPolicy.equals(that.paddingPolicy) : that.paddingPolicy != null) return false;
            if (this.resolution != null ? !this.resolution.equals(that.resolution) : that.resolution != null) return false;
            return this.sizingPolicy != null ? this.sizingPolicy.equals(that.sizingPolicy) : that.sizingPolicy == null;
        }

        @Override
        public final int hashCode() {
            int result = this.aspectRatio != null ? this.aspectRatio.hashCode() : 0;
            result = 31 * result + (this.format != null ? this.format.hashCode() : 0);
            result = 31 * result + (this.interval != null ? this.interval.hashCode() : 0);
            result = 31 * result + (this.maxHeight != null ? this.maxHeight.hashCode() : 0);
            result = 31 * result + (this.maxWidth != null ? this.maxWidth.hashCode() : 0);
            result = 31 * result + (this.paddingPolicy != null ? this.paddingPolicy.hashCode() : 0);
            result = 31 * result + (this.resolution != null ? this.resolution.hashCode() : 0);
            result = 31 * result + (this.sizingPolicy != null ? this.sizingPolicy.hashCode() : 0);
            return result;
        }
    }
}
