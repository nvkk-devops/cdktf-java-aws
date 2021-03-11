package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.557Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.ElastictranscoderPreset")
public class ElastictranscoderPreset extends com.hashicorp.cdktf.TerraformResource {

    protected ElastictranscoderPreset(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ElastictranscoderPreset(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public ElastictranscoderPreset(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.ElastictranscoderPresetConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetAudio() {
        software.amazon.jsii.Kernel.call(this, "resetAudio", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAudioCodecOptions() {
        software.amazon.jsii.Kernel.call(this, "resetAudioCodecOptions", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDescription() {
        software.amazon.jsii.Kernel.call(this, "resetDescription", software.amazon.jsii.NativeType.VOID);
    }

    public void resetName() {
        software.amazon.jsii.Kernel.call(this, "resetName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetThumbnails() {
        software.amazon.jsii.Kernel.call(this, "resetThumbnails", software.amazon.jsii.NativeType.VOID);
    }

    public void resetType() {
        software.amazon.jsii.Kernel.call(this, "resetType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVideo() {
        software.amazon.jsii.Kernel.call(this, "resetVideo", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVideoCodecOptions() {
        software.amazon.jsii.Kernel.call(this, "resetVideoCodecOptions", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVideoWatermarks() {
        software.amazon.jsii.Kernel.call(this, "resetVideoWatermarks", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getContainerInput() {
        return software.amazon.jsii.Kernel.get(this, "containerInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ElastictranscoderPresetAudioCodecOptions> getAudioCodecOptionsInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.ElastictranscoderPresetAudioCodecOptions>)(software.amazon.jsii.Kernel.get(this, "audioCodecOptionsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElastictranscoderPresetAudioCodecOptions.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ElastictranscoderPresetAudio> getAudioInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.ElastictranscoderPresetAudio>)(software.amazon.jsii.Kernel.get(this, "audioInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElastictranscoderPresetAudio.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDescriptionInput() {
        return software.amazon.jsii.Kernel.get(this, "descriptionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ElastictranscoderPresetThumbnails> getThumbnailsInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.ElastictranscoderPresetThumbnails>)(software.amazon.jsii.Kernel.get(this, "thumbnailsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElastictranscoderPresetThumbnails.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "typeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getVideoCodecOptionsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "videoCodecOptionsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ElastictranscoderPresetVideo> getVideoInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.ElastictranscoderPresetVideo>)(software.amazon.jsii.Kernel.get(this, "videoInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElastictranscoderPresetVideo.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<imports.aws.ElastictranscoderPresetVideoWatermarks> getVideoWatermarksInput() {
        return java.util.Optional.ofNullable((java.util.List<imports.aws.ElastictranscoderPresetVideoWatermarks>)(software.amazon.jsii.Kernel.get(this, "videoWatermarksInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElastictranscoderPresetVideoWatermarks.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ElastictranscoderPresetAudio> getAudio() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "audio", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElastictranscoderPresetAudio.class))));
    }

    public void setAudio(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ElastictranscoderPresetAudio> value) {
        software.amazon.jsii.Kernel.set(this, "audio", java.util.Objects.requireNonNull(value, "audio is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ElastictranscoderPresetAudioCodecOptions> getAudioCodecOptions() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "audioCodecOptions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElastictranscoderPresetAudioCodecOptions.class))));
    }

    public void setAudioCodecOptions(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ElastictranscoderPresetAudioCodecOptions> value) {
        software.amazon.jsii.Kernel.set(this, "audioCodecOptions", java.util.Objects.requireNonNull(value, "audioCodecOptions is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getContainer() {
        return software.amazon.jsii.Kernel.get(this, "container", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setContainer(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "container", java.util.Objects.requireNonNull(value, "container is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDescription() {
        return software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDescription(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "description", java.util.Objects.requireNonNull(value, "description is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ElastictranscoderPresetThumbnails> getThumbnails() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "thumbnails", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElastictranscoderPresetThumbnails.class))));
    }

    public void setThumbnails(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ElastictranscoderPresetThumbnails> value) {
        software.amazon.jsii.Kernel.set(this, "thumbnails", java.util.Objects.requireNonNull(value, "thumbnails is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getType() {
        return software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "type", java.util.Objects.requireNonNull(value, "type is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ElastictranscoderPresetVideo> getVideo() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "video", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElastictranscoderPresetVideo.class))));
    }

    public void setVideo(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ElastictranscoderPresetVideo> value) {
        software.amazon.jsii.Kernel.set(this, "video", java.util.Objects.requireNonNull(value, "video is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getVideoCodecOptions() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "videoCodecOptions", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setVideoCodecOptions(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "videoCodecOptions", java.util.Objects.requireNonNull(value, "videoCodecOptions is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ElastictranscoderPresetVideoWatermarks> getVideoWatermarks() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "videoWatermarks", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.ElastictranscoderPresetVideoWatermarks.class))));
    }

    public void setVideoWatermarks(final @org.jetbrains.annotations.NotNull java.util.List<imports.aws.ElastictranscoderPresetVideoWatermarks> value) {
        software.amazon.jsii.Kernel.set(this, "videoWatermarks", java.util.Objects.requireNonNull(value, "videoWatermarks is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.ElastictranscoderPreset}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.ElastictranscoderPreset> {
        /**
         * @return a new instance of {@link Builder}.
         * @param scope This parameter is required.
         * @param id This parameter is required.
         */
        public static Builder create(final software.constructs.Construct scope, final java.lang.String id) {
            return new Builder(scope, id);
        }

        private final software.constructs.Construct scope;
        private final java.lang.String id;
        private final imports.aws.ElastictranscoderPresetConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.ElastictranscoderPresetConfig.Builder();
        }

        /**
         * @return {@code this}
         * @param count This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(final java.lang.Number count) {
            this.config.count(count);
            return this;
        }

        /**
         * @return {@code this}
         * @param dependsOn This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder dependsOn(final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.config.dependsOn(dependsOn);
            return this;
        }

        /**
         * @return {@code this}
         * @param lifecycle This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.config.lifecycle(lifecycle);
            return this;
        }

        /**
         * @return {@code this}
         * @param provider This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(final com.hashicorp.cdktf.TerraformProvider provider) {
            this.config.provider(provider);
            return this;
        }

        /**
         * @return {@code this}
         * @param container This parameter is required.
         */
        public Builder container(final java.lang.String container) {
            this.config.container(container);
            return this;
        }

        /**
         * audio block.
         * <p>
         * @return {@code this}
         * @param audio audio block. This parameter is required.
         */
        public Builder audio(final java.util.List<? extends imports.aws.ElastictranscoderPresetAudio> audio) {
            this.config.audio(audio);
            return this;
        }

        /**
         * audio_codec_options block.
         * <p>
         * @return {@code this}
         * @param audioCodecOptions audio_codec_options block. This parameter is required.
         */
        public Builder audioCodecOptions(final java.util.List<? extends imports.aws.ElastictranscoderPresetAudioCodecOptions> audioCodecOptions) {
            this.config.audioCodecOptions(audioCodecOptions);
            return this;
        }

        /**
         * @return {@code this}
         * @param description This parameter is required.
         */
        public Builder description(final java.lang.String description) {
            this.config.description(description);
            return this;
        }

        /**
         * @return {@code this}
         * @param name This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * thumbnails block.
         * <p>
         * @return {@code this}
         * @param thumbnails thumbnails block. This parameter is required.
         */
        public Builder thumbnails(final java.util.List<? extends imports.aws.ElastictranscoderPresetThumbnails> thumbnails) {
            this.config.thumbnails(thumbnails);
            return this;
        }

        /**
         * @return {@code this}
         * @param type This parameter is required.
         */
        public Builder type(final java.lang.String type) {
            this.config.type(type);
            return this;
        }

        /**
         * video block.
         * <p>
         * @return {@code this}
         * @param video video block. This parameter is required.
         */
        public Builder video(final java.util.List<? extends imports.aws.ElastictranscoderPresetVideo> video) {
            this.config.video(video);
            return this;
        }

        /**
         * @return {@code this}
         * @param videoCodecOptions This parameter is required.
         */
        public Builder videoCodecOptions(final java.util.Map<java.lang.String, java.lang.String> videoCodecOptions) {
            this.config.videoCodecOptions(videoCodecOptions);
            return this;
        }

        /**
         * video_watermarks block.
         * <p>
         * @return {@code this}
         * @param videoWatermarks video_watermarks block. This parameter is required.
         */
        public Builder videoWatermarks(final java.util.List<? extends imports.aws.ElastictranscoderPresetVideoWatermarks> videoWatermarks) {
            this.config.videoWatermarks(videoWatermarks);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.ElastictranscoderPreset}.
         */
        @Override
        public imports.aws.ElastictranscoderPreset build() {
            return new imports.aws.ElastictranscoderPreset(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
