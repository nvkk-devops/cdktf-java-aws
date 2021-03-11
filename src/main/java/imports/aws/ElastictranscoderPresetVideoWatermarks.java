package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.559Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.ElastictranscoderPresetVideoWatermarks")
@software.amazon.jsii.Jsii.Proxy(ElastictranscoderPresetVideoWatermarks.Jsii$Proxy.class)
public interface ElastictranscoderPresetVideoWatermarks extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.String getHorizontalAlign() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getHorizontalOffset() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getMaxHeight() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getMaxWidth() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getOpacity() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSizingPolicy() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getTarget() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getVerticalAlign() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getVerticalOffset() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ElastictranscoderPresetVideoWatermarks}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ElastictranscoderPresetVideoWatermarks}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ElastictranscoderPresetVideoWatermarks> {
        private java.lang.String horizontalAlign;
        private java.lang.String horizontalOffset;
        private java.lang.String id;
        private java.lang.String maxHeight;
        private java.lang.String maxWidth;
        private java.lang.String opacity;
        private java.lang.String sizingPolicy;
        private java.lang.String target;
        private java.lang.String verticalAlign;
        private java.lang.String verticalOffset;

        /**
         * Sets the value of {@link ElastictranscoderPresetVideoWatermarks#getHorizontalAlign}
         * @param horizontalAlign the value to be set.
         * @return {@code this}
         */
        public Builder horizontalAlign(java.lang.String horizontalAlign) {
            this.horizontalAlign = horizontalAlign;
            return this;
        }

        /**
         * Sets the value of {@link ElastictranscoderPresetVideoWatermarks#getHorizontalOffset}
         * @param horizontalOffset the value to be set.
         * @return {@code this}
         */
        public Builder horizontalOffset(java.lang.String horizontalOffset) {
            this.horizontalOffset = horizontalOffset;
            return this;
        }

        /**
         * Sets the value of {@link ElastictranscoderPresetVideoWatermarks#getId}
         * @param id the value to be set.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link ElastictranscoderPresetVideoWatermarks#getMaxHeight}
         * @param maxHeight the value to be set.
         * @return {@code this}
         */
        public Builder maxHeight(java.lang.String maxHeight) {
            this.maxHeight = maxHeight;
            return this;
        }

        /**
         * Sets the value of {@link ElastictranscoderPresetVideoWatermarks#getMaxWidth}
         * @param maxWidth the value to be set.
         * @return {@code this}
         */
        public Builder maxWidth(java.lang.String maxWidth) {
            this.maxWidth = maxWidth;
            return this;
        }

        /**
         * Sets the value of {@link ElastictranscoderPresetVideoWatermarks#getOpacity}
         * @param opacity the value to be set.
         * @return {@code this}
         */
        public Builder opacity(java.lang.String opacity) {
            this.opacity = opacity;
            return this;
        }

        /**
         * Sets the value of {@link ElastictranscoderPresetVideoWatermarks#getSizingPolicy}
         * @param sizingPolicy the value to be set.
         * @return {@code this}
         */
        public Builder sizingPolicy(java.lang.String sizingPolicy) {
            this.sizingPolicy = sizingPolicy;
            return this;
        }

        /**
         * Sets the value of {@link ElastictranscoderPresetVideoWatermarks#getTarget}
         * @param target the value to be set.
         * @return {@code this}
         */
        public Builder target(java.lang.String target) {
            this.target = target;
            return this;
        }

        /**
         * Sets the value of {@link ElastictranscoderPresetVideoWatermarks#getVerticalAlign}
         * @param verticalAlign the value to be set.
         * @return {@code this}
         */
        public Builder verticalAlign(java.lang.String verticalAlign) {
            this.verticalAlign = verticalAlign;
            return this;
        }

        /**
         * Sets the value of {@link ElastictranscoderPresetVideoWatermarks#getVerticalOffset}
         * @param verticalOffset the value to be set.
         * @return {@code this}
         */
        public Builder verticalOffset(java.lang.String verticalOffset) {
            this.verticalOffset = verticalOffset;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ElastictranscoderPresetVideoWatermarks}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ElastictranscoderPresetVideoWatermarks build() {
            return new Jsii$Proxy(horizontalAlign, horizontalOffset, id, maxHeight, maxWidth, opacity, sizingPolicy, target, verticalAlign, verticalOffset);
        }
    }

    /**
     * An implementation for {@link ElastictranscoderPresetVideoWatermarks}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ElastictranscoderPresetVideoWatermarks {
        private final java.lang.String horizontalAlign;
        private final java.lang.String horizontalOffset;
        private final java.lang.String id;
        private final java.lang.String maxHeight;
        private final java.lang.String maxWidth;
        private final java.lang.String opacity;
        private final java.lang.String sizingPolicy;
        private final java.lang.String target;
        private final java.lang.String verticalAlign;
        private final java.lang.String verticalOffset;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.horizontalAlign = software.amazon.jsii.Kernel.get(this, "horizontalAlign", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.horizontalOffset = software.amazon.jsii.Kernel.get(this, "horizontalOffset", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.maxHeight = software.amazon.jsii.Kernel.get(this, "maxHeight", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.maxWidth = software.amazon.jsii.Kernel.get(this, "maxWidth", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.opacity = software.amazon.jsii.Kernel.get(this, "opacity", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.sizingPolicy = software.amazon.jsii.Kernel.get(this, "sizingPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.target = software.amazon.jsii.Kernel.get(this, "target", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.verticalAlign = software.amazon.jsii.Kernel.get(this, "verticalAlign", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.verticalOffset = software.amazon.jsii.Kernel.get(this, "verticalOffset", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String horizontalAlign, final java.lang.String horizontalOffset, final java.lang.String id, final java.lang.String maxHeight, final java.lang.String maxWidth, final java.lang.String opacity, final java.lang.String sizingPolicy, final java.lang.String target, final java.lang.String verticalAlign, final java.lang.String verticalOffset) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.horizontalAlign = horizontalAlign;
            this.horizontalOffset = horizontalOffset;
            this.id = id;
            this.maxHeight = maxHeight;
            this.maxWidth = maxWidth;
            this.opacity = opacity;
            this.sizingPolicy = sizingPolicy;
            this.target = target;
            this.verticalAlign = verticalAlign;
            this.verticalOffset = verticalOffset;
        }

        @Override
        public final java.lang.String getHorizontalAlign() {
            return this.horizontalAlign;
        }

        @Override
        public final java.lang.String getHorizontalOffset() {
            return this.horizontalOffset;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
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
        public final java.lang.String getOpacity() {
            return this.opacity;
        }

        @Override
        public final java.lang.String getSizingPolicy() {
            return this.sizingPolicy;
        }

        @Override
        public final java.lang.String getTarget() {
            return this.target;
        }

        @Override
        public final java.lang.String getVerticalAlign() {
            return this.verticalAlign;
        }

        @Override
        public final java.lang.String getVerticalOffset() {
            return this.verticalOffset;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getHorizontalAlign() != null) {
                data.set("horizontalAlign", om.valueToTree(this.getHorizontalAlign()));
            }
            if (this.getHorizontalOffset() != null) {
                data.set("horizontalOffset", om.valueToTree(this.getHorizontalOffset()));
            }
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
            }
            if (this.getMaxHeight() != null) {
                data.set("maxHeight", om.valueToTree(this.getMaxHeight()));
            }
            if (this.getMaxWidth() != null) {
                data.set("maxWidth", om.valueToTree(this.getMaxWidth()));
            }
            if (this.getOpacity() != null) {
                data.set("opacity", om.valueToTree(this.getOpacity()));
            }
            if (this.getSizingPolicy() != null) {
                data.set("sizingPolicy", om.valueToTree(this.getSizingPolicy()));
            }
            if (this.getTarget() != null) {
                data.set("target", om.valueToTree(this.getTarget()));
            }
            if (this.getVerticalAlign() != null) {
                data.set("verticalAlign", om.valueToTree(this.getVerticalAlign()));
            }
            if (this.getVerticalOffset() != null) {
                data.set("verticalOffset", om.valueToTree(this.getVerticalOffset()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.ElastictranscoderPresetVideoWatermarks"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ElastictranscoderPresetVideoWatermarks.Jsii$Proxy that = (ElastictranscoderPresetVideoWatermarks.Jsii$Proxy) o;

            if (this.horizontalAlign != null ? !this.horizontalAlign.equals(that.horizontalAlign) : that.horizontalAlign != null) return false;
            if (this.horizontalOffset != null ? !this.horizontalOffset.equals(that.horizontalOffset) : that.horizontalOffset != null) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
            if (this.maxHeight != null ? !this.maxHeight.equals(that.maxHeight) : that.maxHeight != null) return false;
            if (this.maxWidth != null ? !this.maxWidth.equals(that.maxWidth) : that.maxWidth != null) return false;
            if (this.opacity != null ? !this.opacity.equals(that.opacity) : that.opacity != null) return false;
            if (this.sizingPolicy != null ? !this.sizingPolicy.equals(that.sizingPolicy) : that.sizingPolicy != null) return false;
            if (this.target != null ? !this.target.equals(that.target) : that.target != null) return false;
            if (this.verticalAlign != null ? !this.verticalAlign.equals(that.verticalAlign) : that.verticalAlign != null) return false;
            return this.verticalOffset != null ? this.verticalOffset.equals(that.verticalOffset) : that.verticalOffset == null;
        }

        @Override
        public final int hashCode() {
            int result = this.horizontalAlign != null ? this.horizontalAlign.hashCode() : 0;
            result = 31 * result + (this.horizontalOffset != null ? this.horizontalOffset.hashCode() : 0);
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
            result = 31 * result + (this.maxHeight != null ? this.maxHeight.hashCode() : 0);
            result = 31 * result + (this.maxWidth != null ? this.maxWidth.hashCode() : 0);
            result = 31 * result + (this.opacity != null ? this.opacity.hashCode() : 0);
            result = 31 * result + (this.sizingPolicy != null ? this.sizingPolicy.hashCode() : 0);
            result = 31 * result + (this.target != null ? this.target.hashCode() : 0);
            result = 31 * result + (this.verticalAlign != null ? this.verticalAlign.hashCode() : 0);
            result = 31 * result + (this.verticalOffset != null ? this.verticalOffset.hashCode() : 0);
            return result;
        }
    }
}
