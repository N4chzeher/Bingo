import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by NACHZEHER on 03/02/2017.
 */
public class GameState {

    private Integer numeroJugador1;
    private Line linePlayer1;
    private Line linePlayer2;
    private Integer numeroJugador2;

    // inicializa los numeros de los jugadores de manera aleatoria //


    public void initPlayerLines() {

        // Inicializar los numeros de los jugadores aleatoriamente


    }



    public int checkNumber(int num) {

        if (numeroJugador1== num){

            return 1;
        }
        else if (numeroJugador2 == num){

            return  2;
        }
        else {

            return 0;
        }
    }

    public Integer getNumeroJugador1() {
        return numeroJugador1;
    }

    public Integer getNumeroJugador2() {
        return numeroJugador2;
    }
}
