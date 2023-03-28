package com.movies.ms.service;

import com.movies.ms.exception.NotFoundException;
import com.movies.ms.model.MovieEntity;
import com.movies.ms.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GetMovieByImdbIdService {

    private final MovieRepository movieRepository;

    public Optional<MovieEntity> get(String id) {

        return Optional.ofNullable(movieRepository.findByImdbIdIgnoreCase(id).orElseThrow(
                () -> new NotFoundException("validation.movie.notfound")
        ));
    }
}
