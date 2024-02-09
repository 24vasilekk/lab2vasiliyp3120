package pokemons;
import moves.FrostBreath;
import pokemons.Eevee;
import ru.ifmo.se.pokemon.Type;

public class Glaceon extends Eevee{

    public Glaceon(String name, int level){

        super(name,level);

        this.setType(Type.ICE);
        this.setStats(65,60,110,130,95,65);

        FrostBreath frostBreath = new FrostBreath();

        this.addMove(frostBreath);

    }

}
