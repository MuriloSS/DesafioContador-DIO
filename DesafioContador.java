import java.util.Scanner;

public class DesafioContador {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

     try (scan) {
       System.out.println("Digite o primeiro parâmetro");
       int valor1 = scan.nextInt();
       System.out.println("Digite o segundo parâmetro");
       int valor2 = scan.nextInt();
       //chamando o método contendo a lógica de contagem
       contar(valor1, valor2);

     } catch (ParametrosInvalidosException exception) {
       //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
       exception.printStackTrace();

     }finally {
       scan.close();
     }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
      //validar se parametroUm é MAIOR que parametroDois e lançar a exceção

      int contagem = parametroDois - parametroUm;

      if(contagem<0){
        throw new ParametrosInvalidosException("Deu zika");

      }else {
        //realizar o for para imprimir os números com base na variável contagem
        for (int i = 1; i <= contagem; i++) {
          System.out.println("Imprimindo o número : " + i);
        }
      }
    }

    static class ParametrosInvalidosException extends Exception{
      public ParametrosInvalidosException(String err){
        super(err);
      }

      @Override
      public String toString() {
        return "O segundo parâmetro deve ser maior que o primeiro";
      }
    }

}
