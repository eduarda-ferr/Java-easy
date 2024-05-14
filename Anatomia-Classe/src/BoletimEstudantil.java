public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 8;

        if (mediaFinal < 6) {
            System.out.println("Reprovado(a)");
        }
        else if (mediaFinal == 6) {
            System.out.println("Prova Minerva");
        }
        else
            System.out.println("Aprovado(a)");
    }
}
