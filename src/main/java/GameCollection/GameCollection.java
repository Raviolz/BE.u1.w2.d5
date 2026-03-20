package GameCollection;

import java.util.ArrayList;
import java.util.List;

public class GameCollection {
    // attributi

    private List<Game> games;

    // Costruttore ... Devo creare lista vuota non passargli una lista nel parametro. Non avrebbe senso e inoltre avrebbe metodi di lista che bypassano i miei controlli. CREDO

    public GameCollection() {
        this.games = new ArrayList<>();
    }


    // metodi

    public void addGame(Game newGame) {

        boolean exists = games.stream()
                .anyMatch(g -> g.getId() == newGame.getId());

        if (exists) {
            throw new IllegalArgumentException("Game with this ID already exists !");
        }

        games.add(newGame);
    }


    public Game findGameById(int idInput) {
        return games.stream()
                .filter(g -> g.getId() == idInput)
                .findFirst()  // anche se solo 1 se no non esce dallo stream
                .orElseThrow(() -> new IllegalArgumentException("Game not found")); // eccezione con stream
    }


    public List<Game> filterByPriceLessThan(double priceInput) {
        return games.stream()
                .filter(g -> g.getPrice() < priceInput)
                .toList();
    }


    public List<Boardgame> filterByPlayers(int playersInput) {
        return games.stream()
                .filter(g -> g instanceof Boardgame) // lista di Boardgames ma per java ancora Game quindi map con cast
                .map(g -> (Boardgame) g)
                .filter(b -> b.getPlayers() == playersInput)
                .toList();
    }

//    public void removeGameById(int id) {
//
//        Game gameToRemove = games.stream()
//                .filter(g -> g.getId() == id)
//                .findFirst()
//                .orElseThrow(() -> new IllegalArgumentException("Game not found"));
//
//        games.remove(gameToRemove);
//    }

    public void removeGameById(int idInput) {
        Game gameToRemove = findGameById(idInput);
        games.remove(gameToRemove);
    }


    public void updateGameById(int idGameToUpdate, Game updatedGame) {
        if (updatedGame == null) {
            throw new IllegalArgumentException("Updated game cannot be null");
        }

        Game oldGame = findGameById(idGameToUpdate); // ho il gioco

        if (updatedGame.getId() != idGameToUpdate) {
            throw new IllegalArgumentException("ID cannot be changed");
        }

        int index = games.indexOf(oldGame); // indice della lista non id
        games.set(index, updatedGame); // sostituisco
    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Game Collection:\n");
        result.append("------------------\n");

        int i = 1;
        for (Game g : games) {
            result.append(i).append(") ").append(g).append("\n");
            i++;
        }

        return result.toString();
    }
}

