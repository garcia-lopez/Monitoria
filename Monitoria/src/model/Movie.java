/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;

/**
 *
 * @author isi7
 */
public class Movie {
     private int id;
     private String title;
     private int publishedYear;

    public Movie() {
    }

    public Movie(int id, String title, int publishedYear) {
        this.id = id;
        this.title = title;
        this.publishedYear = publishedYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    @Override
    public String toString() { //SIRVE PARA VER QUE IMPRIME UNA CLASE EN DETERMINADO MOMENTO
        return "Pelicula{" + "id=" + id + ", Titulo =" + title + ", Año de publicación" + publishedYear + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Movie other = (Movie) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.publishedYear != other.publishedYear) {
            return false;
        }
        return Objects.equals(this.title, other.title);
    }
     
     

 
    
    
}
