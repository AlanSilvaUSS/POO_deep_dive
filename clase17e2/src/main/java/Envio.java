// Clase abstracta ServicioEnvio
abstract class ServicioEnvio {
    protected double peso;
    protected double distancia;

    public ServicioEnvio(double peso, double distancia) {
        this.peso = peso;
        this.distancia = distancia;
    }

    public abstract double calcularCosto();
}

// Clase EnvioEstandar
class EnvioEstandar extends ServicioEnvio {
    public EnvioEstandar(double peso, double distancia) {
        super(peso, distancia);
    }

    @Override
    public double calcularCosto() {
        return peso * distancia * 0.01;
    }
}

// Clase EnvioExpress
class EnvioExpress extends ServicioEnvio {
    public EnvioExpress(double peso, double distancia) {
        super(peso, distancia);
    }

    @Override
    public double calcularCosto() {
        return (peso * distancia * 0.015) + 50;
    }
}

// Clase EnvioInternacional
class EnvioInternacional extends ServicioEnvio {
    public EnvioInternacional(double peso, double distancia) {
        super(peso, distancia);
    }

    @Override
    public double calcularCosto() {
        return (peso * distancia * 0.02) + 100;
    }
}

// Clase CalculadoraEnvio
class CalculadoraEnvio {
    public double calcularCostoEnvio(ServicioEnvio servicio) {
        return servicio.calcularCosto();
    }
}

// Clase principal
public class Envio{
    public static void main(String[] args) {
        EnvioEstandar envioEstandar = new EnvioEstandar(10, 500);
        EnvioExpress envioExpress = new EnvioExpress(10, 500);
        EnvioInternacional envioInternacional = new EnvioInternacional(10, 500);

        CalculadoraEnvio calculadora = new CalculadoraEnvio();

        double costoEstandar = calculadora.calcularCostoEnvio(envioEstandar);
        double costoExpress = calculadora.calcularCostoEnvio(envioExpress);
        double costoInternacional = calculadora.calcularCostoEnvio(envioInternacional);

        System.out.println("Costo envío estándar: " + costoEstandar);
        System.out.println("Costo envío express: " + costoExpress);
        System.out.println("Costo envío internacional: " + costoInternacional);
    }
}
