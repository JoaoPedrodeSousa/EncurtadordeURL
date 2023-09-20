package entities;

public class Encurtador {
    private static final String BASE_URL = "www.encurti.com/";

    public static String getBaseUrl() {
        return BASE_URL;
    }

    public static String gerarNovaUrl(){
        return Encurtador.getBaseUrl() + new GenerateRandomSerial().generateSerial();
    }





}
