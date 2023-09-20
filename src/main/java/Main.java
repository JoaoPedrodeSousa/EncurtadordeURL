import entities.Encurtador;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        for(int i=0; i<50000; i++){
            String enc = new Encurtador().gerarNovaUrl();

            System.out.println(enc);

            if (list.contains(enc)){
                System.out.println(i + "-Repetido");
                break;
            }
            else{
                list.add(enc);
            }
        }
    }

}
