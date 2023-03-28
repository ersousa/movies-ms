package com.movies.ms.controller;

import com.movies.ms.model.MovieEntity;
import com.movies.ms.service.GetMovieByImdbIdService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/movies")
@RequiredArgsConstructor
public class GetMovieByImdbIdController {

    private final GetMovieByImdbIdService service;

    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional<MovieEntity>> getById(@PathVariable("id") final String id) {
        Optional<MovieEntity> movieEntity = service.get(id);
        return ResponseEntity.ok(movieEntity);
    }
}
