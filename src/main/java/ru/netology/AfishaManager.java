package ru.netology;

public class AfishaManager {
    private Movie[] movies = new Movie[0];
    private int countMovies = 10;

    public AfishaManager() {
    }

    public AfishaManager(int countMovies) {
        this.countMovies = countMovies;
    }

    public void add(Movie movie) {
        int length = movies.length + 1;
        Movie[] tmp = new Movie[length];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    public Movie[] getLastMovies() {
        int resultlenght;
        if (movies.length > countMovies) {
            resultlenght = countMovies;
        } else {
            resultlenght = movies.length;
        }
        Movie[] result = new Movie[resultlenght];
        for (int i = 0; i < resultlenght; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }
}