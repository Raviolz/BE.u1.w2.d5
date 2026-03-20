package GameCollection;

import java.util.Scanner;

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
        Boardgame b8 = new Boardgame(18, "7 Wonders", 2010, 45.00, 2, 30, 25);
        Boardgame b9 = new Boardgame(19, "Uno", 2026, 10.00, 5, 20, 15);
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

        // test collection method 1

        GameCollection collectionTest = new GameCollection();
        collectionTest.addGame(v2);
        collectionTest.addGame(v3);
        collectionTest.addGame(b3);
        collectionTest.addGame(b4);
        collectionTest.addGame(b10);
        collectionTest.addGame(new Videogame(100, "Gioco Test", 2008, 30, "PC", 120.50, Genre.ACTION));
        try {
            collectionTest.addGame(new Videogame(100, "Gioco Test", 2008, 30, "PC", 120.50, Genre.ACTION));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println(collectionTest);


        // test per method 2

        System.out.println(collectionTest.findGameById(3));

        try {
            System.out.println(collectionTest.findGameById(32));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }


        // test per method 3

        System.out.println(collectionTest.filterByPriceLessThan(60.23));


        // test per method 4

        System.out.println(collectionTest.filterByPlayers(5));

        // test per method 5

        System.out.println(collectionTest);
        collectionTest.removeGameById(13);
        System.out.println(collectionTest);
        try {
            collectionTest.removeGameById(13);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        //test per method 6

        Boardgame b12 = new Boardgame(20, "Boardgame Test", 2012, 20.40, 4, 1.20, 45);

        collectionTest.updateGameById(20, b12);
        System.out.println(collectionTest);


        //test per method 7

        System.out.println(collectionTest.getStats());


        System.out.println("**************************************************    APP    ********************************************************");

        Scanner scanner = new Scanner(System.in);

        GameCollection collection1 = new GameCollection();
        collection1.addGame(v1);
        collection1.addGame(b1);
        collection1.addGame(b2);
        collection1.addGame(v2);
        collection1.addGame(b3);
        collection1.addGame(b4);
        collection1.addGame(b5);
        collection1.addGame(b6);
        collection1.addGame(v3);
        collection1.addGame(v4);
        collection1.addGame(b7);
        collection1.addGame(v5);
        collection1.addGame(v6);
        collection1.addGame(b8);
        collection1.addGame(v7);
        collection1.addGame(v8);
        collection1.addGame(b9);
        collection1.addGame(v9);
        collection1.addGame(v10);
        collection1.addGame(b10);

        GameCollection collection = new GameCollection();

        // So che hai consigliato di usare sempre nextline() con lo scanner ma volevo provare a fare dei metodi helper (visti in internet) per controllare l input utente in base al tipo, gia dallo scanner
        // ma nulla non ho fatto in tempo quindi l input utente sbagliato al momento fa crashare tutto ... Buona fortuna ✨💀


        while (true) {

            System.out.println("""
                    MENU
                    1 - Add a game
                    2 - Find a game by ID
                    3 - Search games by maximum price
                    4 - Search board games by number of players
                    5 - Remove a game by ID
                    6 - Update a game by ID
                    7 - Show collection statistics
                    8 - Show all the collection
                    0 - Exit
                    """);

            System.out.print("Hello Admin! Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                //  ADD GAME
                case 1:
                    System.out.println("1 - Videogame");
                    System.out.println("2 - Boardgame");
                    System.out.print("Choose type: ");
                    int type = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter year: ");
                    int year = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();

                    try {
                        if (type == 1) {
                            System.out.print("Enter platform: ");
                            String platform = scanner.nextLine();

                            System.out.print("Enter playtime: ");
                            double playtime = scanner.nextDouble();
                            scanner.nextLine();

                            System.out.print("Enter genre: ");
                            Genre genre = Genre.valueOf(scanner.nextLine().toUpperCase());

                            collection1.addGame(new Videogame(id, title, year, price, platform, playtime, genre));

                        } else if (type == 2) {
                            System.out.print("Enter number of players: ");
                            int players = scanner.nextInt();
                            scanner.nextLine();

                            System.out.print("Enter duration: ");
                            double duration = scanner.nextDouble();
                            scanner.nextLine();

                            System.out.print("Enter average playtime: ");
                            double avg = scanner.nextDouble();
                            scanner.nextLine();

                            collection1.addGame(new Boardgame(id, title, year, price, players, duration, avg));
                        }

                        System.out.println("Game added successfully!");

                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                //  FIND BY ID
                case 2:
                    System.out.print("Enter ID: ");
                    int findId = scanner.nextInt();
                    scanner.nextLine();

                    try {
                        System.out.println(collection1.findGameById(findId));
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                //  FILTER BY PRICE
                case 3:
                    System.out.print("Enter max price: ");
                    double maxPrice = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.println(collection1.filterByPriceLessThan(maxPrice));
                    break;

                //  FILTER BY PLAYERS
                case 4:
                    System.out.print("Enter number of players: ");
                    int players = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println(collection1.filterByPlayers(players));
                    break;

                //  REMOVE
                case 5:
                    System.out.print("Enter ID to remove: ");
                    int removeId = scanner.nextInt();
                    scanner.nextLine();

                    try {
                        collection1.removeGameById(removeId);
                        System.out.println("Game removed!");
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                //  UPDATE
                case 6:
                    System.out.print("Enter ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter new title: ");
                    String newTitle = scanner.nextLine();

                    System.out.print("Enter new year: ");
                    int newYear = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter new price: ");
                    double newPrice = scanner.nextDouble();
                    scanner.nextLine();

                    try {
                        Game oldGame = collection1.findGameById(updateId);

                        if (oldGame instanceof Videogame v) {
                            System.out.print("Enter platform: ");
                            String platform = scanner.nextLine();

                            System.out.print("Enter playtime: ");
                            double playtime = scanner.nextDouble();
                            scanner.nextLine();

                            System.out.print("Enter genre: ");
                            Genre genre = Genre.valueOf(scanner.nextLine().toUpperCase());

                            collection1.updateGameById(updateId,
                                    new Videogame(updateId, newTitle, newYear, newPrice, platform, playtime, genre));

                        } else if (oldGame instanceof Boardgame b) {
                            System.out.print("Enter players: ");
                            int p = scanner.nextInt();
                            scanner.nextLine();

                            System.out.print("Enter duration: ");
                            double d = scanner.nextDouble();
                            scanner.nextLine();

                            System.out.print("Enter average playtime: ");
                            double avg = scanner.nextDouble();
                            scanner.nextLine();

                            collection1.updateGameById(updateId,
                                    new Boardgame(updateId, newTitle, newYear, newPrice, p, d, avg));
                        }

                        System.out.println("Game updated!");

                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                //  STATS
                case 7:
                    System.out.println(collection1.getStats());
                    break;
                case 8:
                    System.out.println(collection1);
                    break;

                //
                case 0:
                    System.out.println("Goodbye!");
                    return;

                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
