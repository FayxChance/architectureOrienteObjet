package com.example.td;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import javax.xml.ws.Endpoint;

//@ApplicationPath("/api")
@WebService
public class HelloApplication extends Application {
    @WebMethod
    public String sayHelloWorld(String from){
        String result = "hello"+from;
        System.out.println(result);
        return result;
    }
    public static void main(String[] args) {
        Object implementor = new HelloApplication();
        String adress = "http://localhost:9000/HelloApplication";
        Endpoint.publish(adress,implementor);
    }
}