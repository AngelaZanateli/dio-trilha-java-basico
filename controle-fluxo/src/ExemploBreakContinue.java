public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int numero =1; numero <= 5; numero ++){
            if(numero==3)
            continue; // pula o loop quando numero == 3
            //break; //   interrompe o loop quando numero == 3
            System.out.println("Numero: " + numero);
        }
    }
    
}
