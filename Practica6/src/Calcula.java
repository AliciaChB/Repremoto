
public class Calcula {
	public int resultado;
    private int num1;
    private int num2;
    private String operacion;
    
    public int calcular(int n1, int n2, String paramOperacion){
        num1 = n1;
        num2 = n2;
        operacion = paramOperacion;
        switch(operacion){
            case "suma":
                resultado = sumar(num1, num2);
                break;
            case "resta":
                resultado = restar(num1, num2);
                break;
            case "multiplicacion":
            case "multiplicación":
                resultado = multiplicar(num1, num2);
                break;
            case "division":
            case "división":
                resultado = dividir(num1, num2);
                break;
            default:
                resultado = 0;
                break;
        }
        return resultado;
    }
    
    public int sumar (int num1, int num2) {
        int result = num1 + num2;
        return result;
    }
    
    public int restar (int num1, int num2) {
        int result = num1 - num2;
        return result;
    }
    
    public int multiplicar (int num1, int num2) {
        int result = num1 * num2;
        return result;
    }
    
    public int dividir (int num1, int num2) {
        int result = num1 / num2;
        return result;
    }
}
