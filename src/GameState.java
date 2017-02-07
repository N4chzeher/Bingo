import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by NACHZEHER on 03/02/2017.
 */
public class GameState {

    private Integer numeroJugador1;
    private Integer numeroJugador2;

    // inicializa los numeros de los jugadores de manera aleatoria //


    public void initPlayerNumbers() {

        this.numeroJugador1 = ThreadLocalRandom.current().nextInt(0,10);


        while (true){

            int randomNum = ThreadLocalRandom.current().nextInt(0,10);

            if (randomNum !=numeroJugador1){
                this.numeroJugador2=randomNum;
                return;
            }


        }
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
