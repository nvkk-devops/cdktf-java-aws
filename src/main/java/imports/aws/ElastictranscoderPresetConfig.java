package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.558Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.ElastictranscoderPresetConfig")
@software.amazon.jsii.Jsii.Proxy(ElastictranscoderPresetConfig.Jsii$Proxy.class)
public interface ElastictranscoderPresetConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    @org.jetbrains.annotations.NotNull java.lang.String getContainer();

    /**
     * audio block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ElastictranscoderPresetAudio> getAudio() {
        return null;
    }

    /**
     * audio_codec_options block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ElastictranscoderPresetAudioCodecOptions> getAudioCodecOptions() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    /**
     * thumbnails block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ElastictranscoderPresetThumbnails> getThumbnails() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getType() {
        return null;
    }

    /**
     * video block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ElastictranscoderPresetVideo> getVideo() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getVideoCodecOptions() {
        return null;
    }

    /**
     * video_watermarks block.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ElastictranscoderPresetVideoWatermarks> getVideoWatermarks() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ElastictranscoderPresetConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ElastictranscoderPresetConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ElastictranscoderPresetConfig> {
        private java.lang.String container;
        private java.util.List<imports.aws.ElastictranscoderPresetAudio> audio;
        private java.util.List<imports.aws.ElastictranscoderPresetAudioCodecOptions> audioCodecOptions;
        private java.lang.String description;
        private java.lang.String name;
        private java.util.List<imports.aws.ElastictranscoderPresetThumbnails> thumbnails;
        private java.lang.String type;
        private java.util.List<imports.aws.ElastictranscoderPresetVideo> video;
        private java.util.Map<java.lang.String, java.lang.String> videoCodecOptions;
        private java.util.List<imports.aws.ElastictranscoderPresetVideoWatermarks> videoWatermarks;
        private java.lang.Number count;
        private java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private com.hashicorp.cdktf.TerraformProvider provider;

        /**
         * Sets the value of {@link ElastictranscoderPresetConfig#getContainer}
         * @param container the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder container(java.lang.String container) {
            this.container = container;
            return this;
        }

        /**
         * Sets the value of {@link ElastictranscoderPresetConfig#getAudio}
         * @param audio audio block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder audio(java.util.List<? extends imports.aws.ElastictranscoderPresetAudio> audio) {
            this.audio = (java.util.List<imports.aws.ElastictranscoderPresetAudio>)audio;
            return this;
        }

        /**
         * Sets the value of {@link ElastictranscoderPresetConfig#getAudioCodecOptions}
         * @param audioCodecOptions audio_codec_options block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder audioCodecOptions(java.util.List<? extends imports.aws.ElastictranscoderPresetAudioCodecOptions> audioCodecOptions) {
            this.audioCodecOptions = (java.util.List<imports.aws.ElastictranscoderPresetAudioCodecOptions>)audioCodecOptions;
            return this;
        }

        /**
         * Sets the value of {@link ElastictranscoderPresetConfig#getDescription}
         * @param description the value to be set.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link ElastictranscoderPresetConfig#getName}
         * @param name the value to be set.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link ElastictranscoderPresetConfig#getThumbnails}
         * @param thumbnails thumbnails block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder thumbnails(java.util.List<? extends imports.aws.ElastictranscoderPresetThumbnails> thumbnails) {
            this.thumbnails = (java.util.List<imports.aws.ElastictranscoderPresetThumbnails>)thumbnails;
            return this;
        }

        /**
         * Sets the value of {@link ElastictranscoderPresetConfig#getType}
         * @param type the value to be set.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link ElastictranscoderPresetConfig#getVideo}
         * @param video video block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder video(java.util.List<? extends imports.aws.ElastictranscoderPresetVideo> video) {
            this.video = (java.util.List<imports.aws.ElastictranscoderPresetVideo>)video;
            return this;
        }

        /**
         * Sets the value of {@link ElastictranscoderPresetConfig#getVideoCodecOptions}
         * @param videoCodecOptions the value to be set.
         * @return {@code this}
         */
        public Builder videoCodecOptions(java.util.Map<java.lang.String, java.lang.String> videoCodecOptions) {
            this.videoCodecOptions = videoCodecOptions;
            return this;
        }

        /**
         * Sets the value of {@link ElastictranscoderPresetConfig#getVideoWatermarks}
         * @param videoWatermarks video_watermarks block.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder videoWatermarks(java.util.List<? extends imports.aws.ElastictranscoderPresetVideoWatermarks> videoWatermarks) {
            this.videoWatermarks = (java.util.List<imports.aws.ElastictranscoderPresetVideoWatermarks>)videoWatermarks;
            return this;
        }

        /**
         * Sets the value of {@link ElastictranscoderPresetConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link ElastictranscoderPresetConfig#getDependsOn}
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
         * Sets the value of {@link ElastictranscoderPresetConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link ElastictranscoderPresetConfig#getProvider}
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
         * @return a new instance of {@link ElastictranscoderPresetConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ElastictranscoderPresetConfig build() {
            return new Jsii$Proxy(container, audio, audioCodecOptions, description, name, thumbnails, type, video, videoCodecOptions, videoWatermarks, count, dependsOn, lifecycle, provider);
        }
    }

    /**
     * An implementation for {@link ElastictranscoderPresetConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ElastictranscoderPresetConfig {
        private final java.lang.String container;
        private final java.util.List<imports.aws.ElastictranscoderPresetAudio> audio;
        private final java.util.List<imports.aws.ElastictranscoderPresetAudioCodecOptions> audioCodecOptions;
        private final java.lang.String description;
        private final java.lang.String name;
        private final java.util.List<imports.aws.ElastictranscoderPresetThumbnails> thumbnails;
        private final java.lang.String type;
        private final java.util.List<imports.aws.ElastictranscoderPresetVideo> video;
        private final java.util.Map<java.lang.String, java.lang.String> videoCodecOptions;
        private final java.util.List<imports.aws.ElastictranscoderPresetVideoWatermarks> videoWatermarks;
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
            this.container = software.amazon.jsii.Kernel.get(this, "container", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.audio = software.amazon.jsii.Kernel.get(this, "audio", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElastictranscoderPresetAudio.class)));
            this.audioCodecOptions = software.amazon.jsii.Kernel.get(this, "audioCodecOptions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElastictranscoderPresetAudioCodecOptions.class)));
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.thumbnails = software.amazon.jsii.Kernel.get(this, "thumbnails", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElastictranscoderPresetThumbnails.class)));
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.video = software.amazon.jsii.Kernel.get(this, "video", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElastictranscoderPresetVideo.class)));
            this.videoCodecOptions = software.amazon.jsii.Kernel.get(this, "videoCodecOptions", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.videoWatermarks = software.amazon.jsii.Kernel.get(this, "videoWatermarks", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElastictranscoderPresetVideoWatermarks.class)));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String container, final java.util.List<? extends imports.aws.ElastictranscoderPresetAudio> audio, final java.util.List<? extends imports.aws.ElastictranscoderPresetAudioCodecOptions> audioCodecOptions, final java.lang.String description, final java.lang.String name, final java.util.List<? extends imports.aws.ElastictranscoderPresetThumbnails> thumbnails, final java.lang.String type, final java.util.List<? extends imports.aws.ElastictranscoderPresetVideo> video, final java.util.Map<java.lang.String, java.lang.String> videoCodecOptions, final java.util.List<? extends imports.aws.ElastictranscoderPresetVideoWatermarks> videoWatermarks, final java.lang.Number count, final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn, final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle, final com.hashicorp.cdktf.TerraformProvider provider) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.container = java.util.Objects.requireNonNull(container, "container is required");
            this.audio = (java.util.List<imports.aws.ElastictranscoderPresetAudio>)audio;
            this.audioCodecOptions = (java.util.List<imports.aws.ElastictranscoderPresetAudioCodecOptions>)audioCodecOptions;
            this.description = description;
            this.name = name;
            this.thumbnails = (java.util.List<imports.aws.ElastictranscoderPresetThumbnails>)thumbnails;
            this.type = type;
            this.video = (java.util.List<imports.aws.ElastictranscoderPresetVideo>)video;
            this.videoCodecOptions = videoCodecOptions;
            this.videoWatermarks = (java.util.List<imports.aws.ElastictranscoderPresetVideoWatermarks>)videoWatermarks;
            this.count = count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            this.lifecycle = lifecycle;
            this.provider = provider;
        }

        @Override
        public final java.lang.String getContainer() {
            return this.container;
        }

        @Override
        public final java.util.List<imports.aws.ElastictranscoderPresetAudio> getAudio() {
            return this.audio;
        }

        @Override
        public final java.util.List<imports.aws.ElastictranscoderPresetAudioCodecOptions> getAudioCodecOptions() {
            return this.audioCodecOptions;
        }

        @Override
        public final java.lang.String getDescription() {
            return this.description;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.util.List<imports.aws.ElastictranscoderPresetThumbnails> getThumbnails() {
            return this.thumbnails;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        public final java.util.List<imports.aws.ElastictranscoderPresetVideo> getVideo() {
            return this.video;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getVideoCodecOptions() {
            return this.videoCodecOptions;
        }

        @Override
        public final java.util.List<imports.aws.ElastictranscoderPresetVideoWatermarks> getVideoWatermarks() {
            return this.videoWatermarks;
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

            data.set("container", om.valueToTree(this.getContainer()));
            if (this.getAudio() != null) {
                data.set("audio", om.valueToTree(this.getAudio()));
            }
            if (this.getAudioCodecOptions() != null) {
                data.set("audioCodecOptions", om.valueToTree(this.getAudioCodecOptions()));
            }
            if (this.getDescription() != null) {
                data.set("description", om.valueToTree(this.getDescription()));
            }
            if (this.getName() != null) {
                data.set("name", om.valueToTree(this.getName()));
            }
            if (this.getThumbnails() != null) {
                data.set("thumbnails", om.valueToTree(this.getThumbnails()));
            }
            if (this.getType() != null) {
                data.set("type", om.valueToTree(this.getType()));
            }
            if (this.getVideo() != null) {
                data.set("video", om.valueToTree(this.getVideo()));
            }
            if (this.getVideoCodecOptions() != null) {
                data.set("videoCodecOptions", om.valueToTree(this.getVideoCodecOptions()));
            }
            if (this.getVideoWatermarks() != null) {
                data.set("videoWatermarks", om.valueToTree(this.getVideoWatermarks()));
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
            struct.set("fqn", om.valueToTree("aws.ElastictranscoderPresetConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ElastictranscoderPresetConfig.Jsii$Proxy that = (ElastictranscoderPresetConfig.Jsii$Proxy) o;

            if (!container.equals(that.container)) return false;
            if (this.audio != null ? !this.audio.equals(that.audio) : that.audio != null) return false;
            if (this.audioCodecOptions != null ? !this.audioCodecOptions.equals(that.audioCodecOptions) : that.audioCodecOptions != null) return false;
            if (this.description != null ? !this.description.equals(that.description) : that.description != null) return false;
            if (this.name != null ? !this.name.equals(that.name) : that.name != null) return false;
            if (this.thumbnails != null ? !this.thumbnails.equals(that.thumbnails) : that.thumbnails != null) return false;
            if (this.type != null ? !this.type.equals(that.type) : that.type != null) return false;
            if (this.video != null ? !this.video.equals(that.video) : that.video != null) return false;
            if (this.videoCodecOptions != null ? !this.videoCodecOptions.equals(that.videoCodecOptions) : that.videoCodecOptions != null) return false;
            if (this.videoWatermarks != null ? !this.videoWatermarks.equals(that.videoWatermarks) : that.videoWatermarks != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            return this.provider != null ? this.provider.equals(that.provider) : that.provider == null;
        }

        @Override
        public final int hashCode() {
            int result = this.container.hashCode();
            result = 31 * result + (this.audio != null ? this.audio.hashCode() : 0);
            result = 31 * result + (this.audioCodecOptions != null ? this.audioCodecOptions.hashCode() : 0);
            result = 31 * result + (this.description != null ? this.description.hashCode() : 0);
            result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
            result = 31 * result + (this.thumbnails != null ? this.thumbnails.hashCode() : 0);
            result = 31 * result + (this.type != null ? this.type.hashCode() : 0);
            result = 31 * result + (this.video != null ? this.video.hashCode() : 0);
            result = 31 * result + (this.videoCodecOptions != null ? this.videoCodecOptions.hashCode() : 0);
            result = 31 * result + (this.videoWatermarks != null ? this.videoWatermarks.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            return result;
        }
    }
}
