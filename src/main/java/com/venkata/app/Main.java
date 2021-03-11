package com.venkata.app;

import imports.aws.*;
import org.jetbrains.annotations.NotNull;
import software.constructs.Construct;

import com.hashicorp.cdktf.App;
import com.hashicorp.cdktf.TerraformStack;

public class Main extends TerraformStack
{
    private static final String CIDR_VPC = "10.0.0.0/16";
    private static final String CIDR_SUBNET = "10.0.0.0/24";

    public Main(final Construct scope, final String id) {
        super(scope, id);
        // define resources here
        AwsProvider.Builder.create(this, "aws").region("eu-west-1").build();
        DataAwsRegion region = new DataAwsRegion(this, "region");
        Vpc vpc = Vpc.Builder.create(this, "venkata-vpc").cidrBlock(CIDR_VPC).build();

        Subnet subnet = new Subnet(this, "venkata-vpc-subnet", new SubnetConfig() {
            @NotNull
            @Override
            public String getCidrBlock() {
                return CIDR_SUBNET;
            }

            @NotNull
            @Override
            public String getVpcId() {
                return vpc.getId();
            }
        });

        System.out.println("VPC Id : " + vpc.getId());

    }

    public static void main(String[] args) {
        final App app = new App();
        new Main(app, "cdktf-java-vpc");
        app.synth();
    }
}