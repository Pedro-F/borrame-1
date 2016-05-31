package com.meccano.MicroservicioB;

import javax.websocket.server.ServerEndpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * Hello world!
 *
 */

@EnableAutoConfiguration
@ComponentScan(basePackages = { "com.meccano.MicroservicioB" })
@PropertySource({ "classpath:application.properties" })
public class MicroservicioB {

	@Autowired
	private Environment env;

	@Bean(name = "gitHubuserApiUrl")
	public String gitHubUserApiUrl() {
		return env.getProperty("api.github.user.url");
	}

	// Variables del servicio
	private Integer sumando1 = 0;
	private Integer sumando2 = 0;

	// static {
	// restTemplate = new RestTemplate();
	// }

	@Autowired
	public MicroservicioB(Integer sum1, Integer sum2) {
		// this.gitHubUserApiUrl = gitHubUserApiUrl;

		this.sumando1 = sum1;
		this.sumando2 = sum2;
	}

	// public GitHubUser getUser(String username) {
	// String url = gitHubUserApiUrl + username;
	// return restTemplate.getForObject(url, GitHubUser.class);
	// }

	// public static void main( String[] args )
	// {
	// System.out.println( "Hello World!" );
	// }
	//
	@RequestMapping("/")
	String home() {

		Integer resultado = sumando1 + sumando2;
		return "Hello World! by PA (Servicio B: Sumando1 = " + sumando1 + "; Sumando2 = " + sumando2
				+ ";\n ##====>> TOTAL = " + resultado + ".";
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(MicroservicioB.class, args);
	}
}
