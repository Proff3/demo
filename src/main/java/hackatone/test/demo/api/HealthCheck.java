package hackatone.test.demo.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {

    @Value("${login}")
    private String login;

    @GetMapping("/test")
    public String test() {
        return "Ok";
    }

    @GetMapping("/login")
    public String login() {
        return login;
    }

}
