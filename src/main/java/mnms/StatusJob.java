package mnms;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.inject.Inject;
import javax.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.micronaut.scheduling.annotation.Scheduled;

@Singleton
public class StatusJob {
    // private static final Logger LOG = LoggerFactory.getLogger(StatusJob.class);

    StatusClient statusClient;

    public StatusJob(StatusClient statusClient) {
        this.statusClient = statusClient;
    }

    @Scheduled(fixedDelay = "5s")
    void executeLogger() {
        // LOG.info("Status Job: {}", new SimpleDateFormat("dd/M/yyyy hh:mm:ss").format(new Date()));
        statusClient.send("Status Job: " + new SimpleDateFormat("dd/M/yyyy hh:mm:ss").format(new Date()));
    }
}
