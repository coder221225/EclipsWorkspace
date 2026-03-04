package in.sp.main;

import java.lang.System.Logger;

import org.hibernate.validator.internal.util.logging.LoggerFactory;
import org.slf4j.ILoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
		info=@Info(
				title = "User Service REST API documentation",
				description = "User Service REST API",
				version = "v1",
				contact = @Contact(
						name = "Harish",
						email="harish@gmail.com"
						)
				),
		externalDocs = @ExternalDocumentation(
				description ="sharpoint documents",
				url = "example.com")
		)
@SpringBootApplication
public class SpringBootReStFulWsApplication {
private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(SpringBootReStFulWsApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringBootReStFulWsApplication.class, args);
		String string="test for";
		log.info("This is {} Info",string);
		log.warn("This is Warning");
	}

}
