package mnms;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import io.micronaut.core.annotation.Introspected;

@Introspected
class Message {
    @NotBlank
    private String name;
    @NotNull
    private String message;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
