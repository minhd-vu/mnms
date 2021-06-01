// package mnms;

// import io.micronaut.configuration.kafka.streams.ConfiguredStreamBuilder;
// import io.micronaut.context.annotation.Factory;
// import org.apache.kafka.clients.consumer.ConsumerConfig;
// import org.apache.kafka.common.serialization.Serdes;
// import org.apache.kafka.streams.KafkaStreams;
// import org.apache.kafka.streams.Topology;
// import org.apache.kafka.streams.kstream.KStream;

// import javax.inject.Named;
// import javax.inject.Singleton;

// import java.util.Arrays;
// import java.util.Properties;
// import java.util.concurrent.CountDownLatch;

// @Factory
// public class MessageStream {
//     public static final String STREAM_MESSAGE = "message-stream";
//     public static final String INPUT = "message-topic";
//     public static final String OUTPUT = "message-topic-output";

//     @Singleton
//     @Named(STREAM_MESSAGE)
//     KStream<Long, Message> messageStream(ConfiguredStreamBuilder builder) {
//         Properties props = builder.getConfiguration();
//         props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");

//         KStream<Long, Message> source = builder.stream(INPUT);
//         source.to(OUTPUT);

//         return source;
//     }
// }