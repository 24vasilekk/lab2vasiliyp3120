package pokemons;

import moves.Bite;
import moves.Tackle;
import moves.WorkUp;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Eevee extends Pokemon {

    public Eevee(String name, int level){
        super(name,level);

        this.setType(Type.NORMAL);
        this.setStats(55,55,50,45,65,55);

        Tackle tackle = new Tackle();
        WorkUp workUp = new WorkUp();
        Bite bite = new Bite();

        this.setMove(tackle, workUp, bite);
    }

}
