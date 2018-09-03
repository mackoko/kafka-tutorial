import java.util.Properties;

public class KafkaProducer {

	public static void main(String[] args) {
		Properties properties = new Properties();

		// kafka bootstrap server
		properties.setProperty("bootstrap.servers", "127.0.0.1:9092");
		properties.setProperty("key.serializer", "");
		properties.setProperty("value.serializer", "");
		// producer acks
		properties.setProperty("acks", "1"); // leader ack
		properties.setProperty("retries", "3");




	}
}