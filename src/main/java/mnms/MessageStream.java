package mnms;

import io.micronaut.configuration.kafka.streams.ConfiguredStreamBuilder;
import io.micronaut.context.annotation.Factory;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.Grouped;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.KTable;
import org.apache.kafka.streams.kstream.Materialized;
import org.apache.kafka.streams.kstream.Produced;

import javax.inject.Named;
import javax.inject.Singleton;
import java.util.Arrays;
import java.util.Locale;
import java.util.Properties;

@Factory
public class MessageStream {
    public static final String STREAM_MESSAGE_COUNT = "message-stream";
    public static final String INPUT = "message-topic";
    public static final String OUTPUT = "message-topic-output";

    @Singleton
    @Named(STREAM_MESSAGE_COUNT)
    KStream<Long, Message> messageStream(ConfiguredStreamBuilder builder) {
        Properties props = builder.getConfiguration();
        props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");

        KStream<Long, Message> source = builder.stream(INPUT);
        source.to(OUTPUT);

        return source;
    }

}