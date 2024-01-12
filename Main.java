public class Main {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 3");

        System.out.println(vetor.getTamanho());
        vetor.adiciona1(0, "novo elemento");

//        System.out.println(vetor.busca("Elemento 3"));
        System.out.println(vetor);
    }
}
