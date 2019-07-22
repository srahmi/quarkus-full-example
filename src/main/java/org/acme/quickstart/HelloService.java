package org.acme.quickstart;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HelloService {

    public String hello(String sayHello){
        return "Hello, " + sayHello;
    }
}
