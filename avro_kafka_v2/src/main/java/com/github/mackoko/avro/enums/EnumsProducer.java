package com.github.mackoko.avro.enums;


import static com.github.mackoko.avro.util.KafkaUtil.TOPIC_ENUMS;
import static com.github.mackoko.avro.util.KafkaUtil.producerProperties;
import static com.github.mackoko.avro.util.KafkaUtil.sendAndClose;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

public class EnumsProducer {
	public static void main(String[] args) {
		sendAndClose(
				new KafkaProducer<>(producerProperties()),
				new ProducerRecord<>(
						TOPIC_ENUMS,
						EnumWrapper.newBuilder()
								.setEnumWillBeAdded(EnumWillBeAdded.THREE)
								.setEnumWillBeRemoved(EnumWillBeRemoved.TWO)
								.setEnumWillBeRenamed(EnumWillBeRenamed.DOS)
								.setEnumWillSwitchOrder(EnumWillSwitchOrder.TWO)
						.build()
				)
		);
	}
}