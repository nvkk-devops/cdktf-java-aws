package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.168Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.CodebuildProjectSecondaryArtifacts")
@software.amazon.jsii.Jsii.Proxy(CodebuildProjectSecondaryArtifacts.Jsii$Proxy.class)
public interface CodebuildProjectSecondaryArtifacts extends software.amazon.jsii.JsiiSerializable {

    @org.jetbrains.annotations.NotNull java.lang.String getArtifactIdentifier();

    @org.jetbrains.annotations.NotNull java.lang.String getType();

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getEncryptionDisabled() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getLocation() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getNamespaceType() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.Boolean getOverrideArtifactName() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPackaging() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getPath() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CodebuildProjectSecondaryArtifacts}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CodebuildProjectSecondaryArtifacts}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CodebuildProjectSecondaryArtifacts> {
        private java.lang.String artifactIdentifier;
        private java.lang.String type;
        private java.lang.Boolean encryptionDisabled;
        private java.lang.String location;
        private java.lang.String name;
        private java.lang.String namespaceType;
        private java.lang.Boolean overrideArtifactName;
        private java.lang.String packaging;
        private java.lang.String path;

        /**
         * Sets the value of {@link CodebuildProjectSecondaryArtifacts#getArtifactIdentifier}
         * @param artifactIdentifier the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder artifactIdentifier(java.lang.String artifactIdentifier) {
            this.artifactIdentifier = artifactIdentifier;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildProjectSecondaryArtifacts#getType}
         * @param type the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildProjectSecondaryArtifacts#getEncryptionDisabled}
         * @param encryptionDisabled the value to be set.
         * @return {@code this}
         */
        public Builder encryptionDisabled(java.lang.Boolean encryptionDisabled) {
            this.encryptionDisabled = encryptionDisabled;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildProjectSecondaryArtifacts#getLocation}
         * @param location the value to be set.
         * @return {@code this}
         */
        public Builder location(java.lang.String location) {
            this.location = location;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildProjectSecondaryArtifacts#getName}
         * @param name the value to be set.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildProjectSecondaryArtifacts#getNamespaceType}
         * @param namespaceType the value to be set.
         * @return {@code this}
         */
        public Builder namespaceType(java.lang.String namespaceType) {
            this.namespaceType = namespaceType;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildProjectSecondaryArtifacts#getOverrideArtifactName}
         * @param overrideArtifactName the value to be set.
         * @return {@code this}
         */
        public Builder overrideArtifactName(java.lang.Boolean overrideArtifactName) {
            this.overrideArtifactName = overrideArtifactName;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildProjectSecondaryArtifacts#getPackaging}
         * @param packaging the value to be set.
         * @return {@code this}
         */
        public Builder packaging(java.lang.String packaging) {
            this.packaging = packaging;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildProjectSecondaryArtifacts#getPath}
         * @param path the value to be set.
         * @return {@code this}
         */
        public Builder path(java.lang.String path) {
            this.path = path;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CodebuildProjectSecondaryArtifacts}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CodebuildProjectSecondaryArtifacts build() {
            return new Jsii$Proxy(artifactIdentifier, type, encryptionDisabled, location, name, namespaceType, overrideArtifactName, packaging, path);
        }
    }

    /**
     * An implementation for {@link CodebuildProjectSecondaryArtifacts}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CodebuildProjectSecondaryArtifacts {
        private final java.lang.String artifactIdentifier;
        private final java.lang.String type;
        private final java.lang.Boolean encryptionDisabled;
        private final java.lang.String location;
        private final java.lang.String name;
        private final java.lang.String namespaceType;
        private final java.lang.Boolean overrideArtifactName;
        private final java.lang.String packaging;
        private final java.lang.String path;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.artifactIdentifier = software.amazon.jsii.Kernel.get(this, "artifactIdentifier", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.encryptionDisabled = software.amazon.jsii.Kernel.get(this, "encryptionDisabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.location = software.amazon.jsii.Kernel.get(this, "location", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.namespaceType = software.amazon.jsii.Kernel.get(this, "namespaceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.overrideArtifactName = software.amazon.jsii.Kernel.get(this, "overrideArtifactName", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.packaging = software.amazon.jsii.Kernel.get(this, "packaging", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.path = software.amazon.jsii.Kernel.get(this, "path", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String artifactIdentifier, final java.lang.String type, final java.lang.Boolean encryptionDisabled, final java.lang.String location, final java.lang.String name, final java.lang.String namespaceType, final java.lang.Boolean overrideArtifactName, final java.lang.String packaging, final java.lang.String path) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.artifactIdentifier = java.util.Objects.requireNonNull(artifactIdentifier, "artifactIdentifier is required");
            this.type = java.util.Objects.requireNonNull(type, "type is required");
            this.encryptionDisabled = encryptionDisabled;
            this.location = location;
            this.name = name;
            this.namespaceType = namespaceType;
            this.overrideArtifactName = overrideArtifactName;
            this.packaging = packaging;
            this.path = path;
        }

        @Override
        public final java.lang.String getArtifactIdentifier() {
            return this.artifactIdentifier;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        public final java.lang.Boolean getEncryptionDisabled() {
            return this.encryptionDisabled;
        }

        @Override
        public final java.lang.String getLocation() {
            return this.location;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getNamespaceType() {
            return this.namespaceType;
        }

        @Override
        public final java.lang.Boolean getOverrideArtifactName() {
            return this.overrideArtifactName;
        }

        @Override
        public final java.lang.String getPackaging() {
            return this.packaging;
        }

        @Override
        public final java.lang.String getPath() {
            return this.path;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("artifactIdentifier", om.valueToTree(this.getArtifactIdentifier()));
            data.set("type", om.valueToTree(this.getType()));
            if (this.getEncryptionDisabled() != null) {
                data.set("encryptionDisabled", om.valueToTree(this.getEncryptionDisabled()));
            }
            if (this.getLocation() != null) {
                data.set("location", om.valueToTree(this.getLocation()));
            }
            if (this.getName() != null) {
                data.set("name", om.valueToTree(this.getName()));
            }
            if (this.getNamespaceType() != null) {
                data.set("namespaceType", om.valueToTree(this.getNamespaceType()));
            }
            if (this.getOverrideArtifactName() != null) {
                data.set("overrideArtifactName", om.valueToTree(this.getOverrideArtifactName()));
            }
            if (this.getPackaging() != null) {
                data.set("packaging", om.valueToTree(this.getPackaging()));
            }
            if (this.getPath() != null) {
                data.set("path", om.valueToTree(this.getPath()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.CodebuildProjectSecondaryArtifacts"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CodebuildProjectSecondaryArtifacts.Jsii$Proxy that = (CodebuildProjectSecondaryArtifacts.Jsii$Proxy) o;

            if (!artifactIdentifier.equals(that.artifactIdentifier)) return false;
            if (!type.equals(that.type)) return false;
            if (this.encryptionDisabled != null ? !this.encryptionDisabled.equals(that.encryptionDisabled) : that.encryptionDisabled != null) return false;
            if (this.location != null ? !this.location.equals(that.location) : that.location != null) return false;
            if (this.name != null ? !this.name.equals(that.name) : that.name != null) return false;
            if (this.namespaceType != null ? !this.namespaceType.equals(that.namespaceType) : that.namespaceType != null) return false;
            if (this.overrideArtifactName != null ? !this.overrideArtifactName.equals(that.overrideArtifactName) : that.overrideArtifactName != null) return false;
            if (this.packaging != null ? !this.packaging.equals(that.packaging) : that.packaging != null) return false;
            return this.path != null ? this.path.equals(that.path) : that.path == null;
        }

        @Override
        public final int hashCode() {
            int result = this.artifactIdentifier.hashCode();
            result = 31 * result + (this.type.hashCode());
            result = 31 * result + (this.encryptionDisabled != null ? this.encryptionDisabled.hashCode() : 0);
            result = 31 * result + (this.location != null ? this.location.hashCode() : 0);
            result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
            result = 31 * result + (this.namespaceType != null ? this.namespaceType.hashCode() : 0);
            result = 31 * result + (this.overrideArtifactName != null ? this.overrideArtifactName.hashCode() : 0);
            result = 31 * result + (this.packaging != null ? this.packaging.hashCode() : 0);
            result = 31 * result + (this.path != null ? this.path.hashCode() : 0);
            return result;
        }
    }
}
