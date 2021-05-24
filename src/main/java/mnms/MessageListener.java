package mnms;

import javax.inject.Inject;

import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.OffsetReset;
import io.micronaut.configuration.kafka.annotation.Topic;

@KafkaListener(offsetReset = OffsetReset.EARLIEST)
public class MessageListener {
    @Inject
    MessageRepository messageRepository;

    @Topic("message-topic")
    public void receive(@KafkaKey String key, Message message) {
        System.out.println(key + "\t" + message);
        messageRepository.save(message);
    }
}