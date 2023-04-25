import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {

	public static void main(String[] args) {
		int num1, num2, resultado;
        String operacion, Snum;
        boolean salir;

        Scanner teclado = new Scanner(System.in);
        Pattern p = Pattern.compile("(suma|resta|multiplicacion|multiplicación|division|división)");
        salir = false;
        
        do{
            System.out.print("¿Qué operación desea realizar?: ");
            operacion = teclado.nextLine();
            operacion = operacion.toLowerCase();
            operacion = operacion.trim();
            Matcher m = p.matcher(operacion);
            if(m.matches())
                salir = true;
        } while(! salir);
        
        p = Pattern.compile("[0-9]{1,3}");
        salir = false;
        do{
            System.out.print("Introduce el primer numero: ");
            Snum = teclado.nextLine();
            num1 = Integer.parseInt(Snum);
            Matcher m = p.matcher(Snum);
            if(m.matches()){
                salir = true;
            }
        } while(! salir);
        
        salir = false;
        do{
            System.out.print("Introduce el segundo numero: ");
            Snum = teclado.nextLine();
            num2 = Integer.parseInt(Snum);
            Matcher m = p.matcher(Snum);
            if(m.matches()){
                salir = true;
            }
        } while(! salir);
        
        Calcula c1 = new Calcula();
        
        resultado = c1.calcular(num1, num2, operacion);
        
        System.out.println("RESULTADO: " + resultado);
        
}
}
