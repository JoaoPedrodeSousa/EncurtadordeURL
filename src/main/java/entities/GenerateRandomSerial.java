package entities;

import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;

public class GenerateRandomSerial {
    private static final String ALFABETO_MAIUSCULO = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String ALFABETO_MINUSCULO = "abcdefghijklmnopqrstuvwxyz";
    private static final Integer TAMANHO_MAXIMO_URL = 8;
    private static final String NUMEROS = "0123456789";
    private String serial = "";
    private  String random;

    private  String getRandom() {
        return generateRandom();
    }

    private String generateRandom(){
        int i;
        for (i=0;i<(TAMANHO_MAXIMO_URL);i++){
            random += String.valueOf(NUMEROS.charAt(new Random().nextInt(NUMEROS.length())));
            random += String.valueOf(ALFABETO_MAIUSCULO.charAt(new Random().nextInt(ALFABETO_MAIUSCULO.length())));
            random += String.valueOf(ALFABETO_MINUSCULO.charAt(new Random().nextInt(ALFABETO_MINUSCULO.length())));
        }
        return random;
    }

    public String generateSerial(){
        int i;
        for (i=0;i<(TAMANHO_MAXIMO_URL);i++) {
            serial += String.valueOf(new GenerateRandomSerial().generateRandom().charAt(new Random().nextInt(24)));
        }
        return serial;
    }

}
