package mnms;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Produces;

@Controller("/hello")
public class HelloController {

    @Produces(MediaType.TEXT_PLAIN)
    @Get
    public String index() {
        return "Hello World";
    }
    
    @SuppressWarnings("unchecked")
    @Produces(MediaType.APPLICATION_JSON)
    @Post
    public String helloPost(@Body String body) {
        JSONParser parser = new JSONParser();

        try {
            JSONObject json = (JSONObject) parser.parse(body);
            json.put("id", Integer.valueOf(0));
            return json.toJSONString();
        } catch (org.json.simple.parser.ParseException e) {
            e.printStackTrace();
        }

        return null;
    }
}
