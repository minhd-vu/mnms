package mnms;

import io.micronaut.context.ApplicationContext;
import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@OpenAPIDefinition(info = @Info(title = "mnms", version = "0.0", description = "Micronaut Microservice", license = @License(name = "Apache 2.0", url = "http://localhost:8080"), contact = @Contact(url = "sas.com", name = "Minh", email = "minh.vu@sas.com")))
public class Application {
    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
    }
}
