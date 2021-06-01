package mnms;

import io.micronaut.rabbitmq.annotation.Binding;
import io.micronaut.rabbitmq.annotation.RabbitClient;

@RabbitClient
public interface StatusClient {
    @Binding("status")
    void send(String data);
}
