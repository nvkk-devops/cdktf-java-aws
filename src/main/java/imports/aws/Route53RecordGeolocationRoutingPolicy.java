package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.815Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.Route53RecordGeolocationRoutingPolicy")
@software.amazon.jsii.Jsii.Proxy(Route53RecordGeolocationRoutingPolicy.Jsii$Proxy.class)
public interface Route53RecordGeolocationRoutingPolicy extends software.amazon.jsii.JsiiSerializable {

    default @org.jetbrains.annotations.Nullable java.lang.String getContinent() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getCountry() {
        return null;
    }

    default @org.jetbrains.annotations.Nullable java.lang.String getSubdivision() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Route53RecordGeolocationRoutingPolicy}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Route53RecordGeolocationRoutingPolicy}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Route53RecordGeolocationRoutingPolicy> {
        private java.lang.String continent;
        private java.lang.String country;
        private java.lang.String subdivision;

        /**
         * Sets the value of {@link Route53RecordGeolocationRoutingPolicy#getContinent}
         * @param continent the value to be set.
         * @return {@code this}
         */
        public Builder continent(java.lang.String continent) {
            this.continent = continent;
            return this;
        }

        /**
         * Sets the value of {@link Route53RecordGeolocationRoutingPolicy#getCountry}
         * @param country the value to be set.
         * @return {@code this}
         */
        public Builder country(java.lang.String country) {
            this.country = country;
            return this;
        }

        /**
         * Sets the value of {@link Route53RecordGeolocationRoutingPolicy#getSubdivision}
         * @param subdivision the value to be set.
         * @return {@code this}
         */
        public Builder subdivision(java.lang.String subdivision) {
            this.subdivision = subdivision;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Route53RecordGeolocationRoutingPolicy}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Route53RecordGeolocationRoutingPolicy build() {
            return new Jsii$Proxy(continent, country, subdivision);
        }
    }

    /**
     * An implementation for {@link Route53RecordGeolocationRoutingPolicy}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Route53RecordGeolocationRoutingPolicy {
        private final java.lang.String continent;
        private final java.lang.String country;
        private final java.lang.String subdivision;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.continent = software.amazon.jsii.Kernel.get(this, "continent", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.country = software.amazon.jsii.Kernel.get(this, "country", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.subdivision = software.amazon.jsii.Kernel.get(this, "subdivision", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String continent, final java.lang.String country, final java.lang.String subdivision) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.continent = continent;
            this.country = country;
            this.subdivision = subdivision;
        }

        @Override
        public final java.lang.String getContinent() {
            return this.continent;
        }

        @Override
        public final java.lang.String getCountry() {
            return this.country;
        }

        @Override
        public final java.lang.String getSubdivision() {
            return this.subdivision;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getContinent() != null) {
                data.set("continent", om.valueToTree(this.getContinent()));
            }
            if (this.getCountry() != null) {
                data.set("country", om.valueToTree(this.getCountry()));
            }
            if (this.getSubdivision() != null) {
                data.set("subdivision", om.valueToTree(this.getSubdivision()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("aws.Route53RecordGeolocationRoutingPolicy"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Route53RecordGeolocationRoutingPolicy.Jsii$Proxy that = (Route53RecordGeolocationRoutingPolicy.Jsii$Proxy) o;

            if (this.continent != null ? !this.continent.equals(that.continent) : that.continent != null) return false;
            if (this.country != null ? !this.country.equals(that.country) : that.country != null) return false;
            return this.subdivision != null ? this.subdivision.equals(that.subdivision) : that.subdivision == null;
        }

        @Override
        public final int hashCode() {
            int result = this.continent != null ? this.continent.hashCode() : 0;
            result = 31 * result + (this.country != null ? this.country.hashCode() : 0);
            result = 31 * result + (this.subdivision != null ? this.subdivision.hashCode() : 0);
            return result;
        }
    }
}
