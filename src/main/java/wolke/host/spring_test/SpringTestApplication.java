package wolke.host.spring_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController // Adiciona isto
public class SpringTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringTestApplication.class, args);
    }

    @GetMapping("/")
    public String hello() {
        return "Hello World from onwolke.app!";
    }

    @GetMapping("/healthz")
    public String health() {
        return "OK";
    }
}