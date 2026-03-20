package GameCollection;

public class Main {
    static void main(String[] args) {

        // TEST

        Videogame v1 = new Videogame(1, "The Witcher 3", 2015, 29.99, "PC", 120, Genre.RPG);
        Videogame v2 = new Videogame(2, "FIFA 23", 2023, 59.99, "PS5", 80, Genre.SPORT);
        Videogame v3 = new Videogame(3, "Call of Duty MW2", 2022, 69.99, "Xbox", 60, Genre.SHOOTER);
        Videogame v4 = new Videogame(4, "Minecraft", 2011, 26.95, "PC", 200, Genre.SIMULATION);
        Videogame v5 = new Videogame(5, "The Legend of Zelda BOTW", 2017, 59.99, "Switch", 150, Genre.ADVENTURE);
        Videogame v6 = new Videogame(6, "Elden Ring", 2022, 59.99, "PC", 140, Genre.RPG);
        Videogame v7 = new Videogame(7, "Cyberpunk 2077", 2020, 49.99, "PS5", 100, Genre.ACTION);
        Videogame v8 = new Videogame(8, "Civilization VI", 2016, 39.99, "PC", 180, Genre.STRATEGY);
        Videogame v9 = new Videogame(9, "NBA 2K24", 2024, 69.99, "PS5", 90, Genre.SPORT);
        Videogame v10 = new Videogame(10, "Assassin's Creed Valhalla", 2020, 59.99, "Xbox", 110, Genre.ACTION);

        // exception  Videogame v11 = new Videogame(10, "Assassin's Creed Valhalla", 2020, 0, "Xbox", 110, Genre.ACTION);
        // exception  Videogame v11 = new Videogame(10, "Assassin's Creed Valhalla", 1200, 10, "Xbox", 110, Genre.ACTION);


        Boardgame b1 = new Boardgame(11, "Catan", 1995, 35.00, 4, 90, 75);
        Boardgame b2 = new Boardgame(12, "Monopoly", 1985, 25.00, 6, 120, 100);
        Boardgame b3 = new Boardgame(13, "Ticket to Ride", 2004, 40.00, 5, 60, 50);
        Boardgame b4 = new Boardgame(14, "Carcassonne", 2000, 30.00, 5, 45, 40);
        Boardgame b5 = new Boardgame(15, "Pandemic", 2008, 38.00, 4, 60, 55);
        Boardgame b6 = new Boardgame(16, "Chess", 1999, 20.00, 2, 60, 45);
        Boardgame b7 = new Boardgame(17, "Risiko", 1997, 35.00, 6, 180, 150);
        Boardgame b8 = new Boardgame(18, "7 Wonders", 2010, 45.00, 7, 30, 25);
        Boardgame b9 = new Boardgame(19, "Uno", 2026, 10.00, 10, 20, 15);
        Boardgame b10 = new Boardgame(20, "Taboo", 2008, 30.00, 6, 40, 35);

        // exception  Boardgame b11 = new Boardgame(19, "Uno",  3035, 10.00, 10, 20, 15);
        // exception  Boardgame b11 = new Boardgame(19, "Uno", 2024, 10.00, 10, 0, 0);

        System.out.println(v3);
        System.out.println(v9);
        System.out.println(b6);
        System.out.println(b7);

        // test per prendere errori

        try {
            Videogame vError = new Videogame(12, "", 2020, 20.0, "PC", 50, Genre.ACTION);
            System.out.println(vError);
        } catch (IllegalArgumentException e) {
            System.out.println("Errore videogame: " + e.getMessage());
        }

        try {
            Boardgame bError = new Boardgame(14, "Uno", 2026, 10.0, 16, 20, 15);
            System.out.println(bError);
        } catch (IllegalArgumentException e) {
            System.out.println("Errore boardgame: " + e.getMessage());
        }
    }
}
