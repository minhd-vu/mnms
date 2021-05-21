package mnms;

import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;

@KafkaClient
public interface MessageClient {

    @Topic("message-topic")
    void sendMessage(@KafkaKey String key, Message message);
}