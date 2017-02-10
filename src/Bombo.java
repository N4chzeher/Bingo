import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by NACHZEHER on 03/02/2017.
 */
public class Bombo {

    private List <Integer> numeros =new ArrayList<>();

    public Bombo(){

        for (int i=0; i<10;i++){

            numeros.add(i);
        }

        Collections.shuffle(numeros);

    }

    public Integer entregarNum() {

        return numeros.remove(numeros.size()-1);



    }
    public boolean quedanNum(){

        return numeros.isEmpty();


    }


}
