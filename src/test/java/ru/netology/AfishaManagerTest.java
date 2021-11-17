package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AfishaManagerTest {

    @Test
    void getLastMoviesUpperLimit() {
        AfishaManager manager = new AfishaManager();
        Movie one = new Movie(1, "one", "action");
        Movie two = new Movie(2, "two", "cartoon");
        Movie three = new Movie(3, "three", "comedy");
        Movie four = new Movie(4, "four", "action");
        Movie five = new Movie(5, "five", "horror");
        Movie six = new Movie(6, "six", "comedy");
        Movie seven = new Movie(7, "seven", "western");
        Movie eight = new Movie(8, "eight", "drama");
        Movie nine = new Movie(9, "nine", "action");
        Movie ten = new Movie(10, "ten", "thriller");
        Movie eleven = new Movie(11, "eleven", "comedy");

        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(four);
        manager.add(five);
        manager.add(six);
        manager.add(seven);
        manager.add(eight);
        manager.add(nine);
        manager.add(ten);
        manager.add(eleven);

        Movie[] actual = manager.getLastMovies();
        Movie[] expected = new Movie[]{eleven, ten, nine, eight, seven,six, five, four, three, two};
        assertArrayEquals(expected, actual);
    }

    @Test
    void getLastMoviesIsLimit() {
        AfishaManager manager = new AfishaManager();
        Movie one = new Movie(1, "one", "action");
        Movie two = new Movie(2, "two", "cartoon");
        Movie three = new Movie(3, "three", "comedy");
        Movie four = new Movie(4, "four", "action");
        Movie five = new Movie(5, "five", "horror");
        Movie six = new Movie(6, "six", "comedy");
        Movie seven = new Movie(7, "seven", "western");
        Movie eight = new Movie(8, "eight", "drama");
        Movie nine = new Movie(9, "nine", "action");
        Movie ten = new Movie(10, "ten", "thriller");

        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(four);
        manager.add(five);
        manager.add(six);
        manager.add(seven);
        manager.add(eight);
        manager.add(nine);
        manager.add(ten);

        Movie[] actual = manager.getLastMovies();
        Movie[] expected = new Movie[]{ten, nine, eight, seven,six, five, four, three, two, one};
        assertArrayEquals(expected, actual);
    }

    @Test
    void getLastMovieUnderLimit() {
        AfishaManager manager = new AfishaManager();
        Movie one = new Movie(1, "one", "action");
        Movie two = new Movie(2, "two", "cartoon");
        Movie three = new Movie(3, "three", "comedy");
        Movie four = new Movie(4, "four", "action");
        Movie five = new Movie(5, "five", "horror");

        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(four);
        manager.add(five);


        Movie[] actual = manager.getLastMovies();
        Movie[] expected = new Movie[]{five, four, three, two, one};
        assertArrayEquals(expected, actual);
    }

    @Test
    void addMovie() {
        AfishaManager manager = new AfishaManager();
        Movie one = new Movie(1, "one", "action");
        Movie two = new Movie(2, "two", "cartoon");

        manager.add(one);
        manager.add(two);

        Movie[] expected = new Movie[]{two,one};
        Movie[] actual = manager.getLastMovies();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void getLastMovieChangeCountMovies() {
        AfishaManager manager = new AfishaManager(4);

        Movie one = new Movie(1, "one", "action");
        Movie two = new Movie(2, "two", "cartoon");
        Movie three = new Movie(3, "three", "comedy");
        Movie four = new Movie(4, "four", "action");
        Movie five = new Movie(5, "five", "horror");

        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(four);
        manager.add(five);

        Movie[] actual = manager.getLastMovies();
        Movie[] expected = new Movie[]{five, four, three, two};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void NoArg() {
        AfishaManager manager = new AfishaManager();
        Movie one = new Movie();
        Movie[] actual = manager.getLastMovies();
        Movie[] expected = new Movie[]{};
        assertArrayEquals(expected, actual);
    }
}