import java.util.ArrayList;
import java.util.List;

//Clase abstracta Vehiculo
abstract class Vehiculo {
    abstract void acelerar();
}

class Bicicleta extends Vehiculo{
    @Override
    void acelerar() {
        System.out.println("Lento, con las piernas");
    }
    
}

class Auto extends Vehiculo{
    @Override
    void acelerar() {
        System.out.println("Rapido, con los pies");
    }
    
}

class Main {
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList <>();
        vehiculos.add(new Auto());
        vehiculos.add(new Bicicleta());

        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.acelerar();  
        }
    }
}
