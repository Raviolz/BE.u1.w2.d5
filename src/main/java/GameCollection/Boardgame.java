package GameCollection;

public class Boardgame extends Game {

    // attributi

    private int players;
    private double duration;
    private double averagePlaytime;


    // costruttore

    public Boardgame(int idInput, String titleInput, int yearInput, double priceInput, int playersInput, double durationInput, double averagePlaytimeInput) {
        super(idInput, titleInput, yearInput, priceInput);
        // eccezioni

        if (playersInput <= 1 || playersInput > 10) {
            throw new IllegalArgumentException("Enter a range between 2 and 10");
        }
        if (durationInput <= 0) {
            throw new IllegalArgumentException("Game cannot last less than 1 minute");
        }
        if (averagePlaytimeInput < 1) {
            throw new IllegalArgumentException("That is impossible");
        }

        this.players = playersInput;
        this.duration = durationInput;
        this.averagePlaytime = averagePlaytimeInput;

    }

    // getter


    public int getPlayers() {
        return players;
    }

    public double getDuration() {
        return duration;
    }

    public double getAveragePlaytime() {
        return averagePlaytime;
    }

    @Override
    public String toString() {
        return "Boardgame{" + super.toString() +
                ", players=" + players +
                ", duration=" + duration +
                ", averagePlaytime=" + averagePlaytime +
                '}';
    }
}
