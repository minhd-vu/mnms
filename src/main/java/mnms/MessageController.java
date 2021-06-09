package mnms;

import javax.inject.Inject;
import javax.validation.Valid;

import io.micronaut.context.ApplicationContext;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Produces;

@Controller("/")
public class MessageController {

    private final MessageClient messageClient;
    @Inject
    ApplicationContext applicationContext;

    public MessageController(MessageClient messageClient) {
        this.messageClient = messageClient;
    }

    @Produces(MediaType.TEXT_PLAIN)
    @Get
    public String index() {
        return "Hello World";
    }

    @Post(produces = MediaType.APPLICATION_JSON)
    public Message postMessage(@Body @Valid Message body) {
        messageClient.sendMessage(Integer.toString(body.hashCode()), body);
        body.setMessage("Hello World");
        return body;
    }
}