package com.itmuch.cloud.study;


import com.itmuch.cloud.study.entity.User;
import com.itmuch.cloud.study.repository.UserRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.util.stream.Stream;

@SpringBootApplication
public class ProviderUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderUserApplication.class, args);
    }


    /**
     * @param repository repo
     * @return runner
     */
    @Bean
    ApplicationRunner init(UserRepository repository) {
        return args -> {
            User user1 = new User(new Long(1), "account1", "Mark", 20, new BigDecimal(100.00));
            User user2 = new User(new Long(2), "account2", "Jone", 28, new BigDecimal(180.00));
            User user3 = new User(new Long(3), "account3", "Lie", 32, new BigDecimal(280.00));
            Stream.of(user1, user2, user3)
                    .forEach(repository::save);
        };
    }
}
