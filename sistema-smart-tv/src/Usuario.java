public class Usuario {


    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar ();
        System.out.println("Novo Status -> TV Ligada ?" + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        
        System.out.println("Volume Atual:" + smartTv.volume);

        System.out.println("Canal Atual: " + smartTv.canal);
        smartTv.mudarCanal(13);
        
        System.out.println("Canal Atual: " + smartTv.canal);

        smartTv.desligar ();
        System.out.println("Novo Status -> Tv Ligada?" +smartTv.ligada );
        

    }
    
}
