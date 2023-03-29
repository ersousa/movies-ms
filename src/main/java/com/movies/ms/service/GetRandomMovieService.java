package com.movies.ms.service;

import com.movies.ms.exception.NotFoundException;
import com.movies.ms.model.MovieEntity;
import com.movies.ms.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GetRandomMovieService {

    private final MovieRepository movieRepository;

    public Optional<MovieEntity> listRandomMovies() {
        final long count = movieRepository.count();
        final int index = (int) (Math.random() * count);
        return Optional.ofNullable(movieRepository.findAll(PageRequest.of(index, 1)).stream().findFirst().orElseThrow(
                () -> new NotFoundException("validation.movie.notfound", index)
        ));
    }
}
