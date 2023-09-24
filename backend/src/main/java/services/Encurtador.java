package services;

public abstract class Encurtador {
    static final String BASE_URL = "www.encurte.com/";

    public static String getBaseUrl() {
        return BASE_URL;
    }
    //deixar null gerara uma excessao de funcionamento
    public static String gerarNovaUrl() {
        return null;
    }
}

