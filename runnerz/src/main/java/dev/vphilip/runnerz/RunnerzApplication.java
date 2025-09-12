package dev.vphilip.runnerz;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RunnerzApplication {

	private static final Logger log = LoggerFactory.getLogger(RunnerzApplication.class);

	public static void main(String[] args) {
//		ConfigurableApplicationContext context =
		SpringApplication.run(RunnerzApplication.class, args);

//		var welcomeMessage = new dev.vphilip.runnerz.WelcomeMessage();
//		System.out.println(welcomeMessage.getWelcomeMessage());

//		WelcomeMessage welcomeMessage = (WelcomeMessage) context.getBean("welcomeMessage");
//		System.out.println(welcomeMessage);
//		log.info("Application started successfully!");
	}
}
