package sk.stefanlevoca.restApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import sk.stefanlevoca.restApi.services.implementations.RestApiServiceImpl;

@SpringBootApplication
public class RestApiApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(RestApiApplication.class, args);
        System.out.println(context.getBean(RestApiServiceImpl.class).getData());
    }
}
