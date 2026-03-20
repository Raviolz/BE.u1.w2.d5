package GameCollection;

public abstract class Game {

    // attributi

    private int id;
    private String title;
    private int year;
    private double price;


    // costruttore

    public Game(int idInput, String titleInput, int yearInput, double priceInput) {

        // eccezioni

        if (idInput <= 0) {
            throw new IllegalArgumentException("It must be a positive number");
        }

        if (titleInput == null || titleInput.isBlank()) {
            throw new IllegalArgumentException("The game must have a name");
        }

        if (yearInput <= 1960) {
            throw new IllegalArgumentException("Too old for us to keep, we're not a flea market");
        } else if (yearInput >= 2026) {
            throw new IllegalArgumentException("Come back when the game has been published!");
        }

        if (priceInput < 0) {
            throw new IllegalArgumentException("Are you giving it out for free?");
        }


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
