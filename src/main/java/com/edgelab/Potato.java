package com.edgelab;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

import static org.springframework.boot.SpringApplication.run;

@RestController
@EnableAutoConfiguration
@RequiredArgsConstructor
@Slf4j
public class Potato {

    private final UserRepository repository;

    @RequestMapping()
    String listUsers() {
        List<Integer> ids = new LinkedList<>();

        for(int i = 1; i <= 3000; i++) {
            ids.add(i);

            List<User> users = repository.findAllById(ids);
            log.info("Found {} users", users.size());
        }

        return "Successfully executed!";
    }

    public static void main(String[] args) {
        run(Potato.class, args);
    }

}
