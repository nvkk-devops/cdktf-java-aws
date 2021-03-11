package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.558Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.ElastictranscoderPresetAudio")
@software.amazon.jsii.Jsii.Proxy(ElastictranscoderPresetAudio.Jsii$Proxy.class)
public interface ElastictranscoderPresetAudio extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.String getAudioPackingMode() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getBitRate() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getChannels() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getCodec() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSampleRate() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ElastictranscoderPresetAudio}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ElastictranscoderPresetAudio}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ElastictranscoderPresetAudio> {
        private java.lang.String audioPackingMode;
        private java.lang.String bitRate;
        private java.lang.String channels;
        private java.lang.String codec;
        private java.lang.String sampleRate;

        /**
         * Sets the value of {@link ElastictranscoderPresetAudio#getAudioPackingMode}
         * @param audioPackingMode the value to be set.
         * @return {@code this}
         */
        public Builder audioPackingMode(java.lang.String audioPackingMode) {
            this.audioPackingMode = audioPackingMode;
            return this;
        }

        /**
         * Sets the value of {@link ElastictranscoderPresetAudio#getBitRate}
         * @param bitRate the value to be set.
         * @return {@code this}
         */
        public Builder bitRate(java.lang.String bitRate) {
            this.bitRate = bitRate;
            return this;
        }

        /**
         * Sets the value of {@link ElastictranscoderPresetAudio#getChannels}
         * @param channels the value to be set.
         * @return {@code this}
         */
        public Builder channels(java.lang.String channels) {
            this.channels = channels;
            return this;
        }

        /**
         * Sets the value of {@link ElastictranscoderPresetAudio#getCodec}
         * @param codec the value to be set.
         * @return {@code this}
         */
        public Builder codec(java.lang.String codec) {
            this.codec = codec;
            return this;
        }

        /**
         * Sets the value of {@link ElastictranscoderPresetAudio#getSampleRate}
         * @param sampleRate the value to be set.
         * @return {@code this}
         */
        public Builder sampleRate(java.lang.String sampleRate) {
            this.sampleRate = sampleRate;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ElastictranscoderPresetAudio}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ElastictranscoderPresetAudio build() {
            return new Jsii$Proxy(audioPackingMode, bitRate, channels, codec, sampleRate);
        }
    }

    /**
     * An implementation for {@link ElastictranscoderPresetAudio}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ElastictranscoderPresetAudio {
        private final java.lang.String audioPackingMode;
        private final java.lang.String bitRate;
        private final java.lang.String channels;
        private final java.lang.String codec;
        private final java.lang.String sampleRate;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.audioPackingMode = software.amazon.jsii.Kernel.get(this, "audioPackingMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.bitRate = software.amazon.jsii.Kernel.get(this, "bitRate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.channels = software.amazon.jsii.Kernel.get(this, "channels", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.codec = software.amazon.jsii.Kernel.get(this, "codec", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.sampleRate = software.amazon.jsii.Kernel.get(this, "sampleRate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String audioPackingMode, final java.lang.String bitRate, final java.lang.String channels, final java.lang.String codec, final java.lang.String sampleRate) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.audioPackingMode = audioPackingMode;
            this.bitRate = bitRate;
            this.channels = channels;
            this.codec = codec;
            this.sampleRate = sampleRate;
        }

        @Override
        public final java.lang.String getAudioPackingMode() {
            return this.audioPackingMode;
        }

        @Override
        public final java.lang.String getBitRate() {
            return this.bitRate;
        }

        @Override
        public final java.lang.String getChannels() {
            return this.channels;
        }

        @Override
        public final java.lang.String getCodec() {
            return this.codec;
        }

        @Override
        public final java.lang.String getSampleRate() {
            return this.sampleRate;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAudioPackingMode() != null) {
                data.set("audioPackingMode", om.valueToTree(this.getAudioPackingMode()));
            }
            if (this.getBitRate() != null) {
                data.set("bitRate", om.valueToTree(this.getBitRate()));
            }
            if (this.getChannels() != null) {
                data.set("channels", om.valueToTree(this.getChannels()));
            }
            if (this.getCodec() != null) {
                data.set("codec", om.valueToTree(this.getCodec()));
            }
            if (this.getSampleRate() != null) {
                data.set("sampleRate", om.valueToTree(this.getSampleRate()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.ElastictranscoderPresetAudio"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ElastictranscoderPresetAudio.Jsii$Proxy that = (ElastictranscoderPresetAudio.Jsii$Proxy) o;

            if (this.audioPackingMode != null ? !this.audioPackingMode.equals(that.audioPackingMode) : that.audioPackingMode != null) return false;
            if (this.bitRate != null ? !this.bitRate.equals(that.bitRate) : that.bitRate != null) return false;
            if (this.channels != null ? !this.channels.equals(that.channels) : that.channels != null) return false;
            if (this.codec != null ? !this.codec.equals(that.codec) : that.codec != null) return false;
            return this.sampleRate != null ? this.sampleRate.equals(that.sampleRate) : that.sampleRate == null;
        }

        @Override
        public final int hashCode() {
            int result = this.audioPackingMode != null ? this.audioPackingMode.hashCode() : 0;
            result = 31 * result + (this.bitRate != null ? this.bitRate.hashCode() : 0);
            result = 31 * result + (this.channels != null ? this.channels.hashCode() : 0);
            result = 31 * result + (this.codec != null ? this.codec.hashCode() : 0);
            result = 31 * result + (this.sampleRate != null ? this.sampleRate.hashCode() : 0);
            return result;
        }
    }
}
