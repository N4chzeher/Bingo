/**
 * Created by NACHZEHER on 03/02/2017.
 */
public class GameRunner {

    private GameState game;
    private Jugador player1;
    private Jugador player2;
    private Bonbo bombo;

    public void run (){

        game = new GameState();
        bombo =new Bonbo();

        player1 =new Jugador("Diego");
        player2 = new Jugador("Alvaro");

        System.out.println("Player 1 "+ player1.getNombre() + " Juegas con el numero: " + game.getNumeroJugador1());;
        System.out.println("Player 2 "+ player2.getNombre() + " Juegas con el numero: " + game.getNumeroJugador2());;


        game.initPlayerNumbers();

        int resultado=0;
        while (resultado == 0){

            int num = bombo.entregarNum();
            resultado = game.checkNumber(num);

        }
        if (resultado == 1){

            System.out.println("the winner is " + player1.getNombre());
        }
        else {
            System.out.println("The winner is " + player2.getNombre());
        }



    }
}
