import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Set<String> myTreeSet = new TreeSet <>();
        myTreeSet.add("Dante");
        myTreeSet.add("Karina");
        myTreeSet.add("Alan");
        myTreeSet.add("Lucas");
        myTreeSet.add("Demis");
        myTreeSet.add("Vincent");
        myTreeSet.add("Demis");
        myTreeSet.add("Alan");
        
        for (String element : myTreeSet) {
            System.out.println(element);
        }
    }
}