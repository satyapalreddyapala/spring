package com.stackroute.moviesdb.service;

import com.stackroute.moviesdb.domain.Movies;
import com.stackroute.moviesdb.exceptions.MovieNameExistsException;
import com.stackroute.moviesdb.exceptions.NoSuchMovieException;
import com.stackroute.moviesdb.exceptions.NullDetailsException;

import java.util.List;
import java.util.Optional;

public interface MovieService {


    public Movies saveMovie(Movies movies) throws MovieNameExistsException;
    public List<Movies> getallMovies() throws NullDetailsException;
    public Optional<Movies> getMovieById(String id) throws NoSuchMovieException;
    public List<Movies> delete(String id) throws NoSuchMovieException;
    public List<Movies> update(Movies movies,String id) throws NoSuchMovieException;
    public List<Movies> getMovieByName(String title) throws NoSuchMovieException;

}
