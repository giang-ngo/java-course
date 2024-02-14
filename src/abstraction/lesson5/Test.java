package abstraction.lesson5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Thor", 2011, "ABC", 59, 4.3f));
        movies.add(new Movie("Iron man 3", 2013, "DEF", 79, 4.5f));
        movies.add(new Movie("Ant man", 2015, "MNO", 75, 4.5f));
        movies.add(new Movie("Captain Marvel", 2019, "GHI", 59, 4.7f));
        movies.add(new Movie("Avengers: Infinity War", 2018, "ONL", 50, 4.8f));
        movies.add(new Movie("Avengers: End game", 2019, "XYZ", 99, 4.9f));

        System.out.println("===> Trước khi sắp xếp: ");
        showMovies(movies);

        System.out.println("\n===> Sau khi sắp xếp theo tên tăng dần a-z: ");
        Collections.sort(movies,new SortByName());
        showMovies(movies);

        System.out.println("\n===> Sau khi sắp xếp theo tên giảm dần z-a: ");
        Collections.sort(movies,new SortByNameDESC());
        showMovies(movies);

        System.out.println("\n===> Sau khi sắp xếp theo năm sản xuất: ");
        Collections.sort(movies,new SortByYear());
        showMovies(movies);
    }

    private static void showMovies(ArrayList<Movie> movies) {
        System.out.printf("%-25s%-10s%-10s%-10s%-10s\n",
                "Tên phim", "Năm SX", "Đạo diễn", "giá vé", "Số sao");
        for (var movie : movies) {
            System.out.printf("%-25s%-10d%-10s%-10.2f%-10.2f\n",
                    movie.getName(), movie.getYear(), movie.getDirector(),
                    movie.getPrice(), movie.getStar());
        }
    }
}

/**
 * sắp xếp movie theo tên tăng dần từ a-z
 */
class SortByName implements Comparator<Movie> {
    @Override
    public int compare(Movie other1, Movie other2) {
        return other1.getName().compareTo(other2.getName());
    }
}

/**
 * sắp xếp movie theo tên giảm dần từ z-a
 */
class SortByNameDESC implements Comparator<Movie> {
    @Override
    public int compare(Movie other1, Movie other2) {
        return other2.getName().compareTo(other1.getName());
    }
}

/**
 * sắp xếp movie theo năm sản xuất từ cũ -> mới
 */
class SortByYear implements Comparator<Movie> {
    @Override
    public int compare(Movie other1, Movie other2) {
        return other1.getYear() - other2.getYear();
    }
}