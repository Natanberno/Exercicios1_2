public class Motor {
    private String modelo;
    private int potencia;
    private TipoCombustivel tipoCombustivel;
    private int cilindradas;
    private boolean ligado;
    private int rpm;

    // Construtor
    public Motor(String modelo, int potencia, TipoCombustivel tipoCombustivel, int cilindradas) {
        this.modelo = modelo;
        this.potencia = potencia;
        this.tipoCombustivel = tipoCombustivel;
        this.cilindradas = cilindradas;
        this.ligado = false;
        this.rpm = 0;
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            rpm = 1000;
            System.out.println("Motor ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            rpm = 0;
            System.out.println("Motor desligado.");
        }
    }

    public void aumentarPotencia(int incremento) {
        potencia += incremento;
        System.out.println("Potência aumentada para: " + potencia + " cavalos.");
    }

    public void reduzirPotencia(int decremento) {
        potencia = Math.max(potencia - decremento, 0); // Evita valores negativos
        System.out.println("Potência reduzida para: " + potencia + " cavalos.");
    }

    public void acelerar(int incrementoRpm) {
        if (ligado) {
            rpm += incrementoRpm;
            System.out.println("RPM aumentado para: " + rpm);
        } else {
            System.out.println("O motor está desligado.");
        }
    }

    public void reduzirRpm(int decrementoRpm) {
        if (ligado && rpm - decrementoRpm >= 0) {
            rpm -= decrementoRpm;
            System.out.println("RPM reduzido para: " + rpm);
        } else {
            System.out.println("O motor está desligado ou RPM inválido.");
        }
    }

    @Override
    public String toString() {
        return "Motor: " + modelo + ", Tipo de Combustível: " + tipoCombustivel;
    }
}
