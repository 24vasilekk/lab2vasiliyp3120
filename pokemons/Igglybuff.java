package pokemons;

import moves.Facade;
import moves.Flamethrower;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Igglybuff extends Pokemon {
    public Igglybuff(String name, int level){
        super(name,level);

        this.setType(Type.NORMAL, Type.FAIRY);
        this.setStats(90,30,15,40,20,15);

        Flamethrower flamethrower = new Flamethrower();
        Facade facade = new Facade();

        this.setMove(flamethrower, facade);
    }

}
