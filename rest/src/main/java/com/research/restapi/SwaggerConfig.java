package com.research.restapi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMethod;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.ResponseMessage;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	private String version;
    private String title;
	
	@Bean
	public Docket api() {
		
		version = "V1";
        title = "RESEARCH API " + version;
		
		return new Docket(DocumentationType.SWAGGER_2)
				.useDefaultResponseMessages(false)
                .groupName(version)
				.select()
//				.apis(RequestHandlerSelectors.basePackage("com.research.restapi.controller"))
//				.paths(PathSelectors.ant("/research/**"))
				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any())
				.build()
				.apiInfo(apiInfo(title, version))
				.globalResponseMessage(RequestMethod.GET, responseMessages());
	}
	
	private ApiInfo apiInfo(String title, String version) {
        return new ApiInfo(
                title,
                "Swagger Example API Docs",
                version,
                "www.example.com",
                new Contact("Contact Me", "www.example.com", "test@example.com"),
                "Licenses",

                "www.example.com",

                new ArrayList<>());
    }
	
	private List<ResponseMessage> responseMessages() {
        List<ResponseMessage> responseMessages = new ArrayList<>();
        responseMessages.add(new ResponseMessageBuilder()
                .code(200)
                .message("OK!!!!! ~~")
                .build());
        responseMessages.add(new ResponseMessageBuilder()
                .code(404)
                .message("Not Found ~~")
                .build());
        responseMessages.add(new ResponseMessageBuilder()
                .code(500)
                .message("Internal Server Error ~~")
                .build());
        
        return responseMessages;
    }
	
}
