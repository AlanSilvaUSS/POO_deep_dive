import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        positiveIntegerChecker positiveIntegerChecker = new positiveIntegerChecker();

        List<userDiscount> userDiscounts = new ArrayList<>();
        /*
         * LLama a la clase positiveIntegerCheker para obtener el salario del usuario
         */
        positiveIntegerChecker.setQuestion("Ingrese su sueldo base: ");
        userDiscounts.add(positiveIntegerChecker.askInteger());

        /*
         * Llama a la clase GratificationCacl para obtener la gratificación del usuario. Después sumarla con el salario
         */
        GratificationCalc gratificationCalc = new GratificationCalc(userDiscounts.get(0).userDiscount());
        int gratification = gratificationCalc.userDiscount();
        userDiscounts.add(userDiscounts.get(0).userDiscount() + gratification);

        /*
         * Llama a la clase contractType para obtener el contrato del usuario, además de calcular el descuento
         */
        contratcType contratcType = new contratcType(grossSalary);
        int seguroCesantia = contratcType.userDiscount();


        /*
         * Llama a la clase AFPcalc para obtener el modelo de AFP del usuario, además de calcular el descuento
         */
        AFPcalc afpCalc = new AFPcalc(grossSalary);
        int userAFPDiscount = afpCalc.userDiscount();

        /*
         * LLama a la clase previtionCalc para obtener el tipo de previsión del usuario, además de calcular el descuento
         */
        previtionCalc previtionCalc = new previtionCalc(grossSalary);
        int userPrevitionDiscount = previtionCalc.userDiscount();

        /*
         * Muestra un resumen de las elecciones del usuario, el decuento aplicado por cada categoria y el salario líquido
         */
        System.out.println("============================================");
        System.out.println("Resumen: \n");
        System.out.printf("- Sueldo base: %d$\n", basicSalary);
        System.out.printf("- Gratifiación (%s): +%d$\n", gratificationCalc.getUserGratificationElection(), gratification);
        System.out.printf("- Contrato (%s): -%d$\n", contratcType.getUserContractType(), seguroCesantia);
        System.out.printf("- Modelo AFP (%s) (%.2f%%): -%d$\n", afpCalc.getUserAFPmodel(), afpCalc.getUserAFPPercentage() * 100, userAFPDiscount);
        if(previtionCalc.getUserPrevition().equalsIgnoreCase("fonasa")){
            System.out.printf("- Prevision (%s) (7%%): -%d$\n", previtionCalc.getUserPrevition(), userPrevitionDiscount);
        }
        else {
            System.out.printf("- Previsión (%s) (%.2f UF plan): -%d$\n", previtionCalc.getUserPrevition(), previtionCalc.getUFPlan() ,userPrevitionDiscount);
        }

        int finalSalary = Math.round(grossSalary - userAFPDiscount - userPrevitionDiscount - seguroCesantia);
        System.out.printf("\nSu sueldo líquido es: %d$\n", finalSalary);
        System.out.println("============================================");
    }
}