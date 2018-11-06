package com.edgelab;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.boot.SpringApplication.run;

@RestController
@EnableAutoConfiguration
@RequiredArgsConstructor
public class Potato {

    private final UserRepository repository;

    @PostMapping()
    String findUsers(@RequestBody List<Integer> userIds) {
        List<User> users = repository.findAllById(userIds);
        return String.format("Found %d users", users.size());
    }

    public static void main(String[] args) {
        run(Potato.class, args);
    }

}
