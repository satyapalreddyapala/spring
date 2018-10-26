package com.stackroute.moviesdb;

import com.stackroute.moviesdb.domain.Movies;
import com.stackroute.moviesdb.repository.MovieRepository;
import javafx.scene.web.HTMLEditorSkin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class MoviesdbApplication implements ApplicationListener<ContextRefreshedEvent>, CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MoviesdbApplication.class, args);
	}

	@Autowired
    private MovieRepository movieRepository;
	@Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent ){
	    movieRepository.save(new Movies("tt214","manmarziyan","www.me.com", (float) 4.2,"2018","new love story"));
        movieRepository.save(new Movies("t4124","manyan","www.you.com", (float) 3.2,"2011","crime story"));
    }

    @Override
    public void run(String... args) throws Exception {


    }
}


/* sample json input


{
	"imdbId":"tt5474036",
	"movieTitle":"Manmarziyaan",
	"postedUrl":"https://m.media-amazon.com/images/M/MV5BNTU3ZjEzMTYtYThjMC00ZjljLWJjYjEtZGU5M2U5ODcwNTY4XkEyXkFqcGdeQXVyNTE4ODU0NzA@._V1_QL50_SY1000_CR0,0,666,1000_AL_.jpg",
	"rating":4.2,
	"yearOfRelease":"2018",
	"comments":"romantic love story"
}
 */
