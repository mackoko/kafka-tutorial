package potoc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import potoc.user.gatherer.UserGatherer;
import potoc.user.producer.UserProducer;


@Configuration
public class AppConfig {

	@Bean
	public UserProducer userProducer(UserGatherer userGatherer) {
		return new UserProducer(userGatherer);
	}

	@Bean
	public UserGatherer userGatherer(){
		return new UserGatherer();
	}
}