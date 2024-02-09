package pokemons;
import moves.BodySlam;
import pokemons.Igglybuff;
import ru.ifmo.se.pokemon.Type;


public class Jigglypuff extends Igglybuff{

    public Jigglypuff(String name, int level){
        super(name,level);

        this.setType(Type.NORMAL, Type.FAIRY);
        this.setStats(115,45,20,45,25,20);

        BodySlam bodySlam = new BodySlam();

        this.addMove(bodySlam);
    }

}
