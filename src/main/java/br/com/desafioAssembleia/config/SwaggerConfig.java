package br.com.desafioAssembleia.config;

import static springfox.documentation.builders.PathSelectors.regex;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfig {

	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("br.com.desafioAssembleia"))
				.paths(regex("/api.*"))
				.build()
				.apiInfo(metaInfo());
	}
	
	private ApiInfo metaInfo() {

        ApiInfo apiInfo = new ApiInfo(
                "Desafio Assembleia API REST",
                "Desenvolver um sistema em que os associados de uma cooperativa possam participar de uma assembleia, votando em pautas existentes",
                "1.0",
                "Terms of Service",
                new Contact("Galera do Chat UOL", "https://github.com/compasso-FT/desafio-assembleia", "@CompassoUOL"),
                "Apache License Version 2.0",
                "https://www.apache.org/licesen.html", new ArrayList<VendorExtension>());

        return apiInfo;
    }
}