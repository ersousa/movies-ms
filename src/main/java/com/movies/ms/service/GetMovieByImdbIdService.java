package com.movies.ms.service;

import com.movies.ms.model.MovieEntity;
import com.movies.ms.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GetMovieByImdbIdService {

    private final MovieRepository movieRepository;

    public ResponseEntity<MovieEntity> get(String id) {

        var optional = movieRepository.findByImdbIdIgnoreCase(id);
        if (optional.isEmpty()) {
            return ResponseEntity
                    .notFound()
                    .build();
        }
        return ResponseEntity
                .ok(optional.get());

    }
}
