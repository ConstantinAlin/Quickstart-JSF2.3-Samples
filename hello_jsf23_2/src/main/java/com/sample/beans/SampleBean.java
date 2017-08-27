package com.sample.beans;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class SampleBean {

    @Inject
    private FacesContext facesContext;

    private String specTitle;
    private String specVersion;
    private String implTitle;
    private String implVersion;

    public SampleBean() {
        Package info = FacesContext.class.getPackage();

        specTitle = info.getSpecificationTitle();
        specVersion = info.getSpecificationVersion();
        implTitle = info.getImplementationTitle();
        implVersion = info.getImplementationVersion();
    }

    public String getSpecTitle() {
        return specTitle;
    }

    public String getSpecVersion() {
        return specVersion;
    }

    public String getImplTitle() {
        return implTitle;
    }

    public String getImplVersion() {
        return implVersion;
    }

    public String getFacesContextValue() {
        return facesContext.toString();
    }
}
