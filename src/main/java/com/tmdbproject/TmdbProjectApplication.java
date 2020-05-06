package com.tmdbproject;

import com.tmdbproject.repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories (basePackageClasses = UserRepository.class)
public class TmdbProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(TmdbProjectApplication.class, args);
    }

}
