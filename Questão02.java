public class Questão02 {
    public static void main(String[] args) {
        
        String[] nome = new String[4];
        nome [0] = "Carlos";
        nome [1] = "João";
        nome [2] = "Maria";
        nome [3] = "Carlos";

        for(int i = 0; i < nome.length; i++){
            System.out.println((i+1) + " " + nome [i]);
        }
    }
}
