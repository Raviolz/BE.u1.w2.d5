package GameCollection;

public class Videogame extends Game {

// attributi

    private String platform;
    private double playtime;
    private Genre genre;

// costruttore

    public Videogame(int idInput, String titleInput, int yearInput, double priceInput, String platformInput, double playtimeInput, Genre genreInput) {
        super(idInput, titleInput, yearInput, priceInput);
        this.platform = platformInput;
        this.playtime = playtimeInput;
        this.genre = genreInput;
    }


    // getter


    public String getPlatform() {
        return platform;
    }

    public double getPlaytime() {
        return playtime;
    }

    public Genre getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Videogame{" +
                super.toString() +
                "platform='" + platform + '\'' +
                ", playtime=" + playtime +
                ", genre=" + genre +
                '}';
    }
}


