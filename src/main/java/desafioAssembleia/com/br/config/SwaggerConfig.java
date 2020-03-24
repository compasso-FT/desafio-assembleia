package desafioAssembleia.com.br.config;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
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
				.apis(RequestHandlerSelectors.basePackage("desafioAssembleia.com.br"))
				.paths(regex("/.*"))
				.build()
				.apiInfo(apiEndPointsInfo());
	}

	private ApiInfo apiEndPointsInfo() {

		return new ApiInfoBuilder().title("Spring Boot REST API")
				.description("Desenvolver um sistema em que os associados de uma cooperativa possam participar de uma assembleia, votando em pautas existentes")
				.contact(new Contact("Galera do Chat UOL", "https://github.com/compasso-FT/desafio-assembleia", "@CompassoUOL"))
				.license("Apache 2.0")
				.licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
				.version("1.0.0")
				.build();
	}
}