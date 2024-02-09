package pokemons;
import moves.DazzlingGleam;
import pokemons.Jigglypuff;
import ru.ifmo.se.pokemon.Type;

public class Wigglytuff extends Jigglypuff{

    public Wigglytuff(String name, int level){

        super(name,level);

        this.setType(Type.NORMAL, Type.FAIRY);
        this.setStats(140,70,45,85,50,45);

        DazzlingGleam dazzlingGleam = new DazzlingGleam();

        this.addMove(dazzlingGleam);

    }

}
