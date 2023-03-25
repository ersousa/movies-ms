package com.movies.ms.service;

import com.movies.ms.model.MovieEntity;
import com.movies.ms.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GetAllMoviesService {
    private final MovieRepository movieRepository;

    public List<MovieEntity> listAllMovies(){
        return movieRepository.findAll();
    }

}
