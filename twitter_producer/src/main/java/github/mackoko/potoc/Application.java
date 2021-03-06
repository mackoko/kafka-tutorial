package github.mackoko.potoc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import github.mackoko.potoc.twitter.producer.TwitterProducer;


@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private TwitterProducer twitterProducer;

	private static Logger LOG = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		LOG.info("STARTING THE APPLICATION");
		SpringApplication.run(Application.class, args);
		LOG.info("APPLICATION FINISHED");
	}

	@Override
	public void run(String... args) {
		LOG.info("EXECUTING : command line runner");
//		userProducer.produce(10);
		twitterProducer.produceTweets();
	}
}
