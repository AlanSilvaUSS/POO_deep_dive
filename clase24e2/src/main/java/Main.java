import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Set<String> Informática = new TreeSet <>();
        Informática.add("Dante");
        Informática.add("Karina");
        Informática.add("Alan");
        Informática.add("Lucas");
        Informática.add("Demis");
        Informática.add("Vincent");
        Informática.add("Sebastian");
        
        Set<String> intersec = new TreeSet <>(Informática);
        
        Set<String> Mecánica = new TreeSet <>();
        Mecánica.add("Dante");
        Mecánica.add("Karina");
        Mecánica.add("Sarai");
        Mecánica.add("Lucas");
        Mecánica.add("Alonso");
        Mecánica.add("Vincent");
        Mecánica.add("Natha");
        Mecánica.add("Alan");
        Mecánica.add("Leo");
        
        Mecánica.retainAll(Informática);
        System.out.println("Los estudiantes que estan en abmos son: " + Mecánica);
        
        intersec.remove(args)
        
        }
        
            
        
    }
}