package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.24.0 (build b722f66)", date = "2021-03-10T09:47:02.253Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "aws.DataAwsCloudhsmV2ClusterClusterCertificates")
public class DataAwsCloudhsmV2ClusterClusterCertificates extends com.hashicorp.cdktf.ComplexComputedList {

    protected DataAwsCloudhsmV2ClusterClusterCertificates(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DataAwsCloudhsmV2ClusterClusterCertificates(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource This parameter is required.
     * @param terraformAttribute This parameter is required.
     * @param index This parameter is required.
     */
    @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
    public DataAwsCloudhsmV2ClusterClusterCertificates(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.ITerraformResource terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.String index) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(index, "index is required") });
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAwsHardwareCertificate() {
        return software.amazon.jsii.Kernel.get(this, "awsHardwareCertificate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getClusterCertificate() {
        return software.amazon.jsii.Kernel.get(this, "clusterCertificate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getClusterCsr() {
        return software.amazon.jsii.Kernel.get(this, "clusterCsr", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getHsmCertificate() {
        return software.amazon.jsii.Kernel.get(this, "hsmCertificate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getManufacturerHardwareCertificate() {
        return software.amazon.jsii.Kernel.get(this, "manufacturerHardwareCertificate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }
}
