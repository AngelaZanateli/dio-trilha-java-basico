public class Operadores {
    public static void main(String[] args) {
        boolean coondicao1 = true;
        boolean coondicao2 = false;

        if (coondicao1 && coondicao2) {
            System.out.println("As duas condições são verdadeiras.");
        } else if (coondicao1 || coondicao2) {
            System.out.println("Uma das condições é verdadeira.");
        } else {
            System.out.println("Nenhuma condição é verdadeira.");
        }
    }
}
