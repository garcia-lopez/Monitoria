/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import model.Movie;

/**
 *
 * @author isi7
 */
public class MovieRepository {
    
    private List<Movie> movies = new ArrayList<>();
    
    public void insert(Movie movie){ //aca solo resive uno
        movies.add(movie);
    }
    
    //overloading
    public void insert(Movie... nMovies){ //los tres puntos significan que acepta varios argumentos de un mismo tipo Variable Arguments(...)
        
        List<Movie> listOfMovies = Arrays.asList(nMovies);
        movies.addAll(listOfMovies);
        
    
    }   
    public List<Movie> getAll() {
        return movies;
    }
    
}
