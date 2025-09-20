package dev.vphilip.runnerz;
import dev.vphilip.runnerz.run.Location;
import dev.vphilip.runnerz.run.Run;
import dev.vphilip.runnerz.user.User;
import dev.vphilip.runnerz.user.UserHttpClient;
import dev.vphilip.runnerz.user.UserRestClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

@SpringBootApplication
public class  RunnerzApplication {

	private static final Logger log = LoggerFactory.getLogger(RunnerzApplication.class);

	public static void main(String[] args) {
//		ConfigurableApplicationContext context =
		SpringApplication.run(RunnerzApplication.class, args);
;
//		var welcomeMessage = new dev.vphilip.runnerz.WelcomeMessage();
//		System.out.println(welcomeMessage.getWelcomeMessage());

//		WelcomeMessage welcomeMessage = (WelcomeMessage) context.getBean("welcomeMessage");
//		System.out.println(welcomeMessage);
		log.info("Application started successfully!");
	}

	@Bean
	UserHttpClient userHttpClient(){
		RestClient restClient = RestClient.create("https://jsonplaceholder.typicode.com");
		HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(RestClientAdapter.create(restClient)).build();
		return factory.createClient(UserHttpClient.class);
	}

	@Bean
	CommandLineRunner runner(UserHttpClient client){
		return args -> {
//			Run run = new Run(1, "First run", LocalDateTime.now(), LocalDateTime.now().plus(1, ChronoUnit.HOURS), 5, Location.OUTDOOR);
//			log.info("Run: " + run);

			List<User> users = client.findAll();
			System.out.println(users);

		};
	}
}
