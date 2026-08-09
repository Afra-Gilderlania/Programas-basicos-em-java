package O_Retorno_de_Afra_no_Java;

public class MeuSegundoPrograma {
    public static void main(String[] args){
        //var login = "Hello"; var password = "1234";
       //Anotações: tipo nomeDereferencia= conteudoDaReferencia
        //String login = "Hi"; int number1 = 10; double percent = 24.33;boolean isDriver= true;
        //System.out.println(login); System.out.println(number1);System.out.println(percent); System.out.println(isDriver);
        //System.out.println(number1);System.out.println(password);var chaves = "Porta fechada";
        //System.out.println(chaves);//var number1 = 220;// login = "Word";

        //funções
        calc(10, 5);
        //calc(15, 50);
        //calc(30, 70);
        NomesDesenhos("SBT,", "Bob Esponja");
        }
    static  void calc(int x, int y){
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
    }
    static void NomesDesenhos(String CanalDoDesenho, String nomef){
      System.out.println(CanalDoDesenho + nomef);}
}
