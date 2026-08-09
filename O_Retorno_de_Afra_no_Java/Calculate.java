package O_Retorno_de_Afra_no_Java;

public class Calculate {
    public static void main (String[] args){
        if (args.length < 3) {
            System.out.println("Uso: java O_Retorno_de_Afra_no_Java.Calculate <somar|subtrair> <x> <y>");
            return;}
    int x = Integer.parseInt(args[1]);
    int y = Integer.parseInt(args[2]);
    if (args[0].equals("somar")){
        sum(x,y);
    } else if (args[0].equals("subtrair")) {
        minus(x,y);
    } else {
        System.out.println("nenhuma instrução definida");}
    }


static void sum(int x, int y){
    System.out.println(x+y);}

    static void minus(int x, int y){
        System.out.println(x-y);
    }

}