package com.sample.config;

import javax.faces.annotation.FacesConfig;

/**
 * The presence of the @FacesConfig annotation on a managed bean deployed within an application enables version specific
 * features. In this case, it enables JSF CDI injection and EL resolution using CDI.
 *
 */
@FacesConfig(version = FacesConfig.Version.JSF_2_3)
public class ConfigurationBean {
}
