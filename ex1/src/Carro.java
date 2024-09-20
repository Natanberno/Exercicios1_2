public class Carro {
    private String modelo;
    private Motor motor;

    // Construtor
    public Carro(String modelo, Motor motor) {
        this.modelo = modelo;
        this.motor = motor;
    }

    public void ligarCarro() {
        motor.ligar();
    }

    public void desligarCarro() {
        motor.desligar();
    }

    public void turboBoost() {
        motor.aumentarPotencia(50);
    }

    public void reduzirPotenciaMotor() {
        motor.reduzirPotencia(30);
    }

    public void acionarFreio(int decrementoRpm) {
        motor.reduzirRpm(decrementoRpm);
    }

    public void acionarAcelerador(int incrementoRpm) {
        motor.acelerar(incrementoRpm);
    }

    @Override
    public String toString() {
        return "Carro: " + modelo + ", " + motor;
    }
}
