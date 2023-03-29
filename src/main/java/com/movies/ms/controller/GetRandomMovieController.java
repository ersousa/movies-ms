package com.movies.ms.controller;

import com.movies.ms.model.MovieEntity;
import com.movies.ms.service.GetAllMoviesService;
import com.movies.ms.service.GetRandomMovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/movies/random")
@RequiredArgsConstructor
public class GetRandomMovieController {

    private final GetRandomMovieService getRandomMovieService;

    @GetMapping
    public ResponseEntity<Optional<MovieEntity>> getRandomMovies(){
        var randomMovies = getRandomMovieService.listRandomMovies();
        return ResponseEntity.ok(randomMovies);
    }
}
