package io.abritov.example.swaggerapp.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Collections;

@RestController
@RequestMapping("/api/book")
public class SwaggerExampleController {
    @GetMapping("/{id}")
    public String findById(@PathVariable long id) {
        return "ok";
    }

    @GetMapping("/")
    public Collection<String> findBooks() {
        return Collections.singletonList("ok");
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String updateBook(
            @PathVariable("id") final String id, @RequestBody final String book) {
        return "ok";
    }
}
