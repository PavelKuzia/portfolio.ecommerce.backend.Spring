package ecommerce_app.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class Initialization implements CommandLineRunner {
    @Value("${server.port}")
    private int serverPort;

    @Override
    public void run(String[] args) throws Exception {
        System.out.printf("Server is running on port %d. Waiting for requests...\n", serverPort);
    }
}
