package com.stackroute.moviesdb.repository;

import com.stackroute.moviesdb.domain.Movies;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends MongoRepository<Movies,String> {

  //  @Query(value = "select * from movies",nativeQuery = true)
   // List<Movies> getallMovies();

    /*@Query(value="delete from movies m  where m.imdb_Id = :name",nativeQuery = true)
    public List<Movies> delete(@Param("name") String id);*/
}
