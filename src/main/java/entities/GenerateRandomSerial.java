package entities;

import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;

public class GenerateRandomSerial {
    private static final String ALFANUMERIC = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz0123456789";
    private static final Integer TAMANHO_MAXIMO_URL = 8;

    public String generateSerial(){

        String serial = "";

        int i;
        for (i=0;i<(TAMANHO_MAXIMO_URL);i++) {
            serial += String.valueOf(
                    ALFANUMERIC.charAt(
                            new Random()
                                    .nextInt(ALFANUMERIC.length()-1)
                    )
            );
        }
        return serial;
    }

}
