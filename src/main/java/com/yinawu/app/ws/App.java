package com.yinawu.app.ws;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * Created by ywu on 7/19/18.
 */
@ApplicationPath("api")
public class App extends ResourceConfig {

    public App() {
        packages("com.yinawu.app.ws.ui.entrypoints");
        register(AppConfig.class);
        register(RequestContextFilter.class);
    }
}
