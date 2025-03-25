package ex02.Metodo3.src;

public  class Usuario {
    
    public static void main(String[] args) throws Exception {
        Smarttv smartTv = new Smarttv();
        smartTv.volume=25;
        smartTv.canal=1;
        smartTv.ligada=true;


        int volume = smartTv.volume;

        System.out.println("Ligada: " +smartTv.ligada());

        System.out.println("Volume: " +volume);
        System.out.println("Canal: " + smartTv.canal());
        System.out.println("Ligada: " +smartTv.ligada());
        smartTv.aumentarVolume();
        volume = smartTv.volume;
        System.out.println("Volume: " +volume);
        smartTv.diminuirVolume();
        volume = smartTv.volume;
        System.out.println("Volume: " +volume);
        smartTv.mudarCanal(5);
        System.out.println("Canal: " + smartTv.canal());
        smartTv.desligar();
        System.out.println("Ligada: " +smartTv.ligada());
        

       
    }

}