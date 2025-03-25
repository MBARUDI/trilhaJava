package ex02.Metodo3.src;

public class Smarttv {

    int volume=25;

    int canal=1;

    boolean ligada=false;



    public void ligar() {

        ligada = true;

    }



    public void desligar() {

        ligada = false;

    }



    public void aumentarVolume() {

        volume++;

    }



    public void diminuirVolume() {

        volume--;

    }



    public void mudarCanal(int novoCanal) {

        canal = novoCanal;

    }



    public boolean ligada() {

        return ligada;

    }



    public int canal() {

        return canal;

    }

    public void ligada(boolean estado) {

        ligada = estado;

    }   

}
