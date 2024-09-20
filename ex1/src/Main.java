public class Main {
    public static void main(String[] args) {
        Motor motorMustang = new Motor("V8", 450, TipoCombustivel.GASOLINA, 5000);
        Carro carro1 = new Carro("Mustang", motorMustang);

        Motor motorF150 = new Motor("V6", 250, TipoCombustivel.DIESEL, 3500);
        Carro carro2 = new Carro("F-150", motorF150);

        Motor motorTesla = new Motor("Elétrico", 500, TipoCombustivel.ELETRICO, 0);
        Carro carro3 = new Carro("Tesla Model S", motorTesla);

        System.out.println(carro1);
        carro1.ligarCarro();
        carro1.acionarAcelerador(2000);
        carro1.turboBoost();

        System.out.println(carro2);
        carro2.ligarCarro();
        carro2.acionarAcelerador(1500);
        carro2.reduzirPotenciaMotor();

        System.out.println(carro3);
        carro3.ligarCarro();
        carro3.acionarAcelerador(3000);
    }
}
