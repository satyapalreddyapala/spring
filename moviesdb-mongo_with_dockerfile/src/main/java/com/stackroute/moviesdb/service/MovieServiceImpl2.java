package com.stackroute.moviesdb.service;

import com.stackroute.moviesdb.domain.Movies;
import com.stackroute.moviesdb.exceptions.MovieNameExistsException;
import com.stackroute.moviesdb.exceptions.NoSuchMovieException;
import com.stackroute.moviesdb.exceptions.NullDetailsException;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@Qualifier("2")
public class MovieServiceImpl2 implements MovieService {


    @Override
    public Movies saveMovie(Movies movies) throws MovieNameExistsException {
        return null;
    }

    @Override
    public List<Movies> getallMovies() throws NullDetailsException {
        return null;
    }

    @Override
    public Optional<Movies> getMovieById(String id) throws NoSuchMovieException {
        return Optional.empty();
    }

    @Override
    public List<Movies> delete(String id) throws NoSuchMovieException {
        return null;
    }

    @Override
    public List<Movies> update(Movies movies, String id) throws NoSuchMovieException {
        return null;
    }

    @Override
    public List<Movies> getMovieByName(String title) throws NoSuchMovieException {
        return null;
    }
}
