package com.movies.ms.controller;

import com.movies.ms.model.MovieEntity;
import com.movies.ms.service.GetAllMoviesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/movies")
@RequiredArgsConstructor
public class GetAllMoviesController {

    private final GetAllMoviesService getAllMoviesService;

    @GetMapping
    public ResponseEntity<List<MovieEntity>> getAllMovies(){
        var allMovies = getAllMoviesService.listAllMovies();
        return ResponseEntity.ok(allMovies);
    }

}
