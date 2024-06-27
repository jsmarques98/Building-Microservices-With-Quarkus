package org.jsmarques.quarkus.microservices.number;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;
import org.eclipse.microprofile.openapi.annotations.ExternalDocumentation;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@ApplicationPath("/")
@OpenAPIDefinition(
        info = @Info(title = "Number Microservice",
        description = "This microservice generates book numbers",
        version = "1.0",
        contact = @Contact(name = "@jsmarques98", url = "https://www.facebook.com/joao.marques.94043626/?locale=pt_PT")),
        externalDocs = @ExternalDocumentation( url = "https://github.com/jsmarques98", description = "All the Microservice code"),
        tags = {
                @Tag(name = "api", description = "Public API that can be used by anybody"),
                @Tag(name = "numbers", description = "Anybody interested in numbers")
        }
)
public class NumberMicroservice  extends Application {
}
