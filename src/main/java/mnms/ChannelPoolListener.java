package mnms;

import com.rabbitmq.client.Channel;
import io.micronaut.rabbitmq.connect.ChannelInitializer;

import javax.inject.Singleton;
import java.io.IOException;

@Singleton
public class ChannelPoolListener extends ChannelInitializer {
    @Override
    public void initialize(Channel channel) throws IOException {
        channel.queueDeclare("status", false, false, false, null);
    }
}