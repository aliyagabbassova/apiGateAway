package ru.gb.apiGateAway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApiGateAwayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGateAwayApplication.class, args);
	}
	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
		return builder.routes()
				.route("NoteService",r->r.path("/note-service/**")
						.uri("http://localhost:8084/"))
				.route("NoteService",r->r.path("/note-service/**")
						.uri("http://localhost:8084/")).build();}
}
