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

