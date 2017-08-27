# Quickstart JSF 2.3 Samples
Quickstart __JSF 2.3__ application samples ready to be deployed on __GlassFish__, __Payara Server__, __WildFly__, __JBoss EAP__, __Apache TomEE__ or __Apache Tomcat__.

Tested on:
* [GlassFish 5.0-b23](https://javaee.github.io/glassfish/download) (Full or Web Profile)
* [Payara Server 5.0.0.174](https://www.payara.fish/upstream_builds) (Full or Web Profile)
* [WildFly 11.0.0.Beta1](http://wildfly.org/downloads/)
* [JBoss EAP 7.1.0 Beta](https://developers.redhat.com/products/eap/download/)
* [Apache TomEE Webprofile 7.0.3](http://tomee.apache.org/download-ng.html)
* [Apache Tomcat 9.0.0.M26 (alpha)](https://tomcat.apache.org/download-90.cgi)

## Installation
This guide covers how to install Oracle's implementation of __JSF 2.3__ specification. Apache MyFaces releases of __JSF 2.3__ are still in beta and can be found [here](https://myfaces.apache.org/download.html).

## On WildFly and JBoss EAP
Currently, for __WildFly 11.0.0.Beta1__ and __JBoss EAP 7.1.0 Beta__ you will need to manually install __JSF 2.3__ _jsf-impl.jar_ and _jsf-api.jar_. Instructions for this task can be found here: https://stackoverflow.com/questions/17085717/upgrade-jsf-mojarra-in-jboss-as-eap-wildfly. For __JSF 2.3.2__, I've already prepared the [jsf-impl-2.3.2.jar](https://github.com/ConstantinAlin/Quickstart-JSF2.3-Samples/blob/master/jsf-impl-2.3.2.jar) and [jsf-api-2.3.2.jar](https://github.com/ConstantinAlin/Quickstart-JSF2.3-Samples/blob/master/jsf-api-2.3.2.jar) which you can download and use.

If you wish to install other __JSF 2.3.x__ version on __WildFly__ or __JBoss EAP__, follow [this guide](https://stackoverflow.com/questions/35899887/how-to-install-one-jar-variant-of-jsf-javax-faces-jar-on-wildfly) on how to package the _jsf-impl.jar_ and _jsf-api.jar_.

## On Apache TomEE Webprofile
Currently, for __Apache TomEE Webprofile 7.0.3__ you will need to delete the _myfaces-api-2.2.11.jar_ and _myfaces-impl-2.2.11.jar_ from the server install location _/lib_ folder and add _javax.faces-2.3.2.jar_ which you can download from [here](https://github.com/ConstantinAlin/Quickstart-JSF2.3-Samples/blob/master/javax.faces-2.3.2.jar) or from [Maven repository](https://mvnrepository.com/artifact/org.glassfish/javax.faces/2.3.2).

___

Additional information for running __JSF 2.3__ on different application servers can be found here: 
https://github.com/javaserverfaces/mojarra/blob/master/README.md (Many thanks to BalusC).
