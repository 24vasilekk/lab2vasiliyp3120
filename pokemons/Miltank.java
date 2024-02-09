package pokemons;

import moves.Facade;
import moves.Swagger;
import moves.Rest;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Miltank extends Pokemon {

    public Miltank(String name, int level){
        super(name,level);

        this.setType(Type.NORMAL);
        this.setStats(95, 80, 105, 40, 70, 100);

        Facade facade = new Facade();
        Rest rest = new Rest();
        Swagger swagger = new Swagger();

        this.setMove(facade, rest, swagger);
    }

}
