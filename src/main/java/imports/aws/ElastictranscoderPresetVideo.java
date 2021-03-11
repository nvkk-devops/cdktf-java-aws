package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.558Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.ElastictranscoderPresetVideo")
@software.amazon.jsii.Jsii.Proxy(ElastictranscoderPresetVideo.Jsii$Proxy.class)
public interface ElastictranscoderPresetVideo extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.String getAspectRatio() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getBitRate() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getCodec() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDisplayAspectRatio() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getFixedGop() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getFrameRate() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getKeyframesMaxDist() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getMaxFrameRate() {
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
     * @return a {@link Builder} of {@link ElastictranscoderPresetVideo}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ElastictranscoderPresetVideo}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ElastictranscoderPresetVideo> {
        private java.lang.String aspectRatio;
        private java.lang.String bitRate;
        private java.lang.String codec;
        private java.lang.String displayAspectRatio;
        private java.lang.String fixedGop;
        private java.lang.String frameRate;
        private java.lang.String keyframesMaxDist;
        private java.lang.String maxFrameRate;
        private java.lang.String maxHeight;
        private java.lang.String maxWidth;
        private java.lang.String paddingPolicy;
        private java.lang.String resolution;
        private java.lang.String sizingPolicy;

        /**
         * Sets the value of {@link ElastictranscoderPresetVideo#getAspectRatio}
         * @param aspectRatio the value to be set.
         * @return {@code this}
         */
        public Builder aspectRatio(java.lang.String aspectRatio) {
            this.aspectRatio = aspectRatio;
            return this;
        }

        /**
         * Sets the value of {@link ElastictranscoderPresetVideo#getBitRate}
         * @param bitRate the value to be set.
         * @return {@code this}
         */
        public Builder bitRate(java.lang.String bitRate) {
            this.bitRate = bitRate;
            return this;
        }

        /**
         * Sets the value of {@link ElastictranscoderPresetVideo#getCodec}
         * @param codec the value to be set.
         * @return {@code this}
         */
        public Builder codec(java.lang.String codec) {
            this.codec = codec;
            return this;
        }

        /**
         * Sets the value of {@link ElastictranscoderPresetVideo#getDisplayAspectRatio}
         * @param displayAspectRatio the value to be set.
         * @return {@code this}
         */
        public Builder displayAspectRatio(java.lang.String displayAspectRatio) {
            this.displayAspectRatio = displayAspectRatio;
            return this;
        }

        /**
         * Sets the value of {@link ElastictranscoderPresetVideo#getFixedGop}
         * @param fixedGop the value to be set.
         * @return {@code this}
         */
        public Builder fixedGop(java.lang.String fixedGop) {
            this.fixedGop = fixedGop;
            return this;
        }

        /**
         * Sets the value of {@link ElastictranscoderPresetVideo#getFrameRate}
         * @param frameRate the value to be set.
         * @return {@code this}
         */
        public Builder frameRate(java.lang.String frameRate) {
            this.frameRate = frameRate;
            return this;
        }

        /**
         * Sets the value of {@link ElastictranscoderPresetVideo#getKeyframesMaxDist}
         * @param keyframesMaxDist the value to be set.
         * @return {@code this}
         */
        public Builder keyframesMaxDist(java.lang.String keyframesMaxDist) {
            this.keyframesMaxDist = keyframesMaxDist;
            return this;
        }

        /**
         * Sets the value of {@link ElastictranscoderPresetVideo#getMaxFrameRate}
         * @param maxFrameRate the value to be set.
         * @return {@code this}
         */
        public Builder maxFrameRate(java.lang.String maxFrameRate) {
            this.maxFrameRate = maxFrameRate;
            return this;
        }

        /**
         * Sets the value of {@link ElastictranscoderPresetVideo#getMaxHeight}
         * @param maxHeight the value to be set.
         * @return {@code this}
         */
        public Builder maxHeight(java.lang.String maxHeight) {
            this.maxHeight = maxHeight;
            return this;
        }

        /**
         * Sets the value of {@link ElastictranscoderPresetVideo#getMaxWidth}
         * @param maxWidth the value to be set.
         * @return {@code this}
         */
        public Builder maxWidth(java.lang.String maxWidth) {
            this.maxWidth = maxWidth;
            return this;
        }

        /**
         * Sets the value of {@link ElastictranscoderPresetVideo#getPaddingPolicy}
         * @param paddingPolicy the value to be set.
         * @return {@code this}
         */
        public Builder paddingPolicy(java.lang.String paddingPolicy) {
            this.paddingPolicy = paddingPolicy;
            return this;
        }

        /**
         * Sets the value of {@link ElastictranscoderPresetVideo#getResolution}
         * @param resolution the value to be set.
         * @return {@code this}
         */
        public Builder resolution(java.lang.String resolution) {
            this.resolution = resolution;
            return this;
        }

        /**
         * Sets the value of {@link ElastictranscoderPresetVideo#getSizingPolicy}
         * @param sizingPolicy the value to be set.
         * @return {@code this}
         */
        public Builder sizingPolicy(java.lang.String sizingPolicy) {
            this.sizingPolicy = sizingPolicy;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ElastictranscoderPresetVideo}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ElastictranscoderPresetVideo build() {
            return new Jsii$Proxy(aspectRatio, bitRate, codec, displayAspectRatio, fixedGop, frameRate, keyframesMaxDist, maxFrameRate, maxHeight, maxWidth, paddingPolicy, resolution, sizingPolicy);
        }
    }

    /**
     * An implementation for {@link ElastictranscoderPresetVideo}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ElastictranscoderPresetVideo {
        private final java.lang.String aspectRatio;
        private final java.lang.String bitRate;
        private final java.lang.String codec;
        private final java.lang.String displayAspectRatio;
        private final java.lang.String fixedGop;
        private final java.lang.String frameRate;
        private final java.lang.String keyframesMaxDist;
        private final java.lang.String maxFrameRate;
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
            this.bitRate = software.amazon.jsii.Kernel.get(this, "bitRate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.codec = software.amazon.jsii.Kernel.get(this, "codec", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.displayAspectRatio = software.amazon.jsii.Kernel.get(this, "displayAspectRatio", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.fixedGop = software.amazon.jsii.Kernel.get(this, "fixedGop", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.frameRate = software.amazon.jsii.Kernel.get(this, "frameRate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.keyframesMaxDist = software.amazon.jsii.Kernel.get(this, "keyframesMaxDist", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.maxFrameRate = software.amazon.jsii.Kernel.get(this, "maxFrameRate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.maxHeight = software.amazon.jsii.Kernel.get(this, "maxHeight", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.maxWidth = software.amazon.jsii.Kernel.get(this, "maxWidth", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.paddingPolicy = software.amazon.jsii.Kernel.get(this, "paddingPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.resolution = software.amazon.jsii.Kernel.get(this, "resolution", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.sizingPolicy = software.amazon.jsii.Kernel.get(this, "sizingPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String aspectRatio, final java.lang.String bitRate, final java.lang.String codec, final java.lang.String displayAspectRatio, final java.lang.String fixedGop, final java.lang.String frameRate, final java.lang.String keyframesMaxDist, final java.lang.String maxFrameRate, final java.lang.String maxHeight, final java.lang.String maxWidth, final java.lang.String paddingPolicy, final java.lang.String resolution, final java.lang.String sizingPolicy) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.aspectRatio = aspectRatio;
            this.bitRate = bitRate;
            this.codec = codec;
            this.displayAspectRatio = displayAspectRatio;
            this.fixedGop = fixedGop;
            this.frameRate = frameRate;
            this.keyframesMaxDist = keyframesMaxDist;
            this.maxFrameRate = maxFrameRate;
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
        public final java.lang.String getBitRate() {
            return this.bitRate;
        }

        @Override
        public final java.lang.String getCodec() {
            return this.codec;
        }

        @Override
        public final java.lang.String getDisplayAspectRatio() {
            return this.displayAspectRatio;
        }

        @Override
        public final java.lang.String getFixedGop() {
            return this.fixedGop;
        }

        @Override
        public final java.lang.String getFrameRate() {
            return this.frameRate;
        }

        @Override
        public final java.lang.String getKeyframesMaxDist() {
            return this.keyframesMaxDist;
        }

        @Override
        public final java.lang.String getMaxFrameRate() {
            return this.maxFrameRate;
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
            if (this.getBitRate() != null) {
                data.set("bitRate", om.valueToTree(this.getBitRate()));
            }
            if (this.getCodec() != null) {
                data.set("codec", om.valueToTree(this.getCodec()));
            }
            if (this.getDisplayAspectRatio() != null) {
                data.set("displayAspectRatio", om.valueToTree(this.getDisplayAspectRatio()));
            }
            if (this.getFixedGop() != null) {
                data.set("fixedGop", om.valueToTree(this.getFixedGop()));
            }
            if (this.getFrameRate() != null) {
                data.set("frameRate", om.valueToTree(this.getFrameRate()));
            }
            if (this.getKeyframesMaxDist() != null) {
                data.set("keyframesMaxDist", om.valueToTree(this.getKeyframesMaxDist()));
            }
            if (this.getMaxFrameRate() != null) {
                data.set("maxFrameRate", om.valueToTree(this.getMaxFrameRate()));
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
            struct.set("fqn", om.valueToTree("aws.ElastictranscoderPresetVideo"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ElastictranscoderPresetVideo.Jsii$Proxy that = (ElastictranscoderPresetVideo.Jsii$Proxy) o;

            if (this.aspectRatio != null ? !this.aspectRatio.equals(that.aspectRatio) : that.aspectRatio != null) return false;
            if (this.bitRate != null ? !this.bitRate.equals(that.bitRate) : that.bitRate != null) return false;
            if (this.codec != null ? !this.codec.equals(that.codec) : that.codec != null) return false;
            if (this.displayAspectRatio != null ? !this.displayAspectRatio.equals(that.displayAspectRatio) : that.displayAspectRatio != null) return false;
            if (this.fixedGop != null ? !this.fixedGop.equals(that.fixedGop) : that.fixedGop != null) return false;
            if (this.frameRate != null ? !this.frameRate.equals(that.frameRate) : that.frameRate != null) return false;
            if (this.keyframesMaxDist != null ? !this.keyframesMaxDist.equals(that.keyframesMaxDist) : that.keyframesMaxDist != null) return false;
            if (this.maxFrameRate != null ? !this.maxFrameRate.equals(that.maxFrameRate) : that.maxFrameRate != null) return false;
            if (this.maxHeight != null ? !this.maxHeight.equals(that.maxHeight) : that.maxHeight != null) return false;
            if (this.maxWidth != null ? !this.maxWidth.equals(that.maxWidth) : that.maxWidth != null) return false;
            if (this.paddingPolicy != null ? !this.paddingPolicy.equals(that.paddingPolicy) : that.paddingPolicy != null) return false;
            if (this.resolution != null ? !this.resolution.equals(that.resolution) : that.resolution != null) return false;
            return this.sizingPolicy != null ? this.sizingPolicy.equals(that.sizingPolicy) : that.sizingPolicy == null;
        }

        @Override
        public final int hashCode() {
            int result = this.aspectRatio != null ? this.aspectRatio.hashCode() : 0;
            result = 31 * result + (this.bitRate != null ? this.bitRate.hashCode() : 0);
            result = 31 * result + (this.codec != null ? this.codec.hashCode() : 0);
            result = 31 * result + (this.displayAspectRatio != null ? this.displayAspectRatio.hashCode() : 0);
            result = 31 * result + (this.fixedGop != null ? this.fixedGop.hashCode() : 0);
            result = 31 * result + (this.frameRate != null ? this.frameRate.hashCode() : 0);
            result = 31 * result + (this.keyframesMaxDist != null ? this.keyframesMaxDist.hashCode() : 0);
            result = 31 * result + (this.maxFrameRate != null ? this.maxFrameRate.hashCode() : 0);
            result = 31 * result + (this.maxHeight != null ? this.maxHeight.hashCode() : 0);
            result = 31 * result + (this.maxWidth != null ? this.maxWidth.hashCode() : 0);
            result = 31 * result + (this.paddingPolicy != null ? this.paddingPolicy.hashCode() : 0);
            result = 31 * result + (this.resolution != null ? this.resolution.hashCode() : 0);
            result = 31 * result + (this.sizingPolicy != null ? this.sizingPolicy.hashCode() : 0);
            return result;
        }
    }
}
