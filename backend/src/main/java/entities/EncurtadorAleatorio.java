package entities;

import services.Encurtador;

public class EncurtadorAleatorio extends Encurtador {

    public static String gerarNovaUrl(){
        return EncurtadorAleatorio.getBaseUrl() + new GenerateRandomSerial().generateSerial();
    }





}
