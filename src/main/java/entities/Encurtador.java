package entities;

import java.util.HashMap;
import java.util.Map;

public class Encurtador {
    private static final String BASE_URL = "www.encurti.com";
    private Map<String, String> mapEncurtador;

    public Encurtador(){
        mapEncurtador = new HashMap<>();
    }
    
    public Map<String, String> getMapEncurtador() {
        return mapEncurtador;
    }
    public static String getBaseUrl() {
        return BASE_URL;
    }


    private  void addChaveValorEmMapEncurtador(String chave, String valor){
        mapEncurtador.put(chave,valor);
    }

    private  String concatenarURL(){
        return BASE_URL + "/" + new GenerateRandomSerial().generateSerial();
    }

    public String encurtarURL(String originalURL){
        String novaURL = concatenarURL();
        addChaveValorEmMapEncurtador(novaURL,originalURL);
        return novaURL;
    }



}
