package abstraction.lesson5;

public class Movie {
    private String name;
    private int year;
    private String director;
    private float price;
    private float star;

    public Movie() {
    }

    public Movie(String name, int year,
                 String director, float price, float star) {
        this.name = name;
        this.year = year;
        this.director = director;
        this.price = price;
        this.star = star;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getStar() {
        return star;
    }

    public void setStar(float star) {
        this.star = star;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}