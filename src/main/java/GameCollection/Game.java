package GameCollection;

public abstract class Game {

    // attributi

    private int id;
    private String title;
    private int year;
    private double price;


    // costruttore

    public Game(int idInput, String titleInput, int yearInput, double priceInput) {
        this.id = idInput;
        this.title = titleInput;
        this.year = yearInput;
        this.price = priceInput;
    }

    // getter


    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
