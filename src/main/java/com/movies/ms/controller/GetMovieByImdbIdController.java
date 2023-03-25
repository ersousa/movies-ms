package com.movies.ms.controller;

import com.movies.ms.model.MovieEntity;
import com.movies.ms.service.GetMovieByImdbIdService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/movies")
@RequiredArgsConstructor
public class GetMovieByImdbIdController {

    private final GetMovieByImdbIdService service;

    @GetMapping(path = "/{id}")
    public ResponseEntity<MovieEntity> getById(@PathVariable("id") final String id) {
        return service.get(id);
    }
}
