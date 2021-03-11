package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.558Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.ElastictranscoderPresetAudioCodecOptions")
@software.amazon.jsii.Jsii.Proxy(ElastictranscoderPresetAudioCodecOptions.Jsii$Proxy.class)
public interface ElastictranscoderPresetAudioCodecOptions extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.String getBitDepth() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getBitOrder() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getProfile() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSigned() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ElastictranscoderPresetAudioCodecOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ElastictranscoderPresetAudioCodecOptions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ElastictranscoderPresetAudioCodecOptions> {
        private java.lang.String bitDepth;
        private java.lang.String bitOrder;
        private java.lang.String profile;
        private java.lang.String signed;

        /**
         * Sets the value of {@link ElastictranscoderPresetAudioCodecOptions#getBitDepth}
         * @param bitDepth the value to be set.
         * @return {@code this}
         */
        public Builder bitDepth(java.lang.String bitDepth) {
            this.bitDepth = bitDepth;
            return this;
        }

        /**
         * Sets the value of {@link ElastictranscoderPresetAudioCodecOptions#getBitOrder}
         * @param bitOrder the value to be set.
         * @return {@code this}
         */
        public Builder bitOrder(java.lang.String bitOrder) {
            this.bitOrder = bitOrder;
            return this;
        }

        /**
         * Sets the value of {@link ElastictranscoderPresetAudioCodecOptions#getProfile}
         * @param profile the value to be set.
         * @return {@code this}
         */
        public Builder profile(java.lang.String profile) {
            this.profile = profile;
            return this;
        }

        /**
         * Sets the value of {@link ElastictranscoderPresetAudioCodecOptions#getSigned}
         * @param signed the value to be set.
         * @return {@code this}
         */
        public Builder signed(java.lang.String signed) {
            this.signed = signed;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ElastictranscoderPresetAudioCodecOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ElastictranscoderPresetAudioCodecOptions build() {
            return new Jsii$Proxy(bitDepth, bitOrder, profile, signed);
        }
    }

    /**
     * An implementation for {@link ElastictranscoderPresetAudioCodecOptions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ElastictranscoderPresetAudioCodecOptions {
        private final java.lang.String bitDepth;
        private final java.lang.String bitOrder;
        private final java.lang.String profile;
        private final java.lang.String signed;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.bitDepth = software.amazon.jsii.Kernel.get(this, "bitDepth", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.bitOrder = software.amazon.jsii.Kernel.get(this, "bitOrder", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.profile = software.amazon.jsii.Kernel.get(this, "profile", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.signed = software.amazon.jsii.Kernel.get(this, "signed", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String bitDepth, final java.lang.String bitOrder, final java.lang.String profile, final java.lang.String signed) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.bitDepth = bitDepth;
            this.bitOrder = bitOrder;
            this.profile = profile;
            this.signed = signed;
        }

        @Override
        public final java.lang.String getBitDepth() {
            return this.bitDepth;
        }

        @Override
        public final java.lang.String getBitOrder() {
            return this.bitOrder;
        }

        @Override
        public final java.lang.String getProfile() {
            return this.profile;
        }

        @Override
        public final java.lang.String getSigned() {
            return this.signed;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getBitDepth() != null) {
                data.set("bitDepth", om.valueToTree(this.getBitDepth()));
            }
            if (this.getBitOrder() != null) {
                data.set("bitOrder", om.valueToTree(this.getBitOrder()));
            }
            if (this.getProfile() != null) {
                data.set("profile", om.valueToTree(this.getProfile()));
            }
            if (this.getSigned() != null) {
                data.set("signed", om.valueToTree(this.getSigned()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.ElastictranscoderPresetAudioCodecOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ElastictranscoderPresetAudioCodecOptions.Jsii$Proxy that = (ElastictranscoderPresetAudioCodecOptions.Jsii$Proxy) o;

            if (this.bitDepth != null ? !this.bitDepth.equals(that.bitDepth) : that.bitDepth != null) return false;
            if (this.bitOrder != null ? !this.bitOrder.equals(that.bitOrder) : that.bitOrder != null) return false;
            if (this.profile != null ? !this.profile.equals(that.profile) : that.profile != null) return false;
            return this.signed != null ? this.signed.equals(that.signed) : that.signed == null;
        }

        @Override
        public final int hashCode() {
            int result = this.bitDepth != null ? this.bitDepth.hashCode() : 0;
            result = 31 * result + (this.bitOrder != null ? this.bitOrder.hashCode() : 0);
            result = 31 * result + (this.profile != null ? this.profile.hashCode() : 0);
            result = 31 * result + (this.signed != null ? this.signed.hashCode() : 0);
            return result;
        }
    }
}
