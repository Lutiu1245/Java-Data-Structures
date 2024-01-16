public class Main {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(4);

        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("D");

        System.out.println(vetor.getTamanho());
//        vetor.adiciona1(1, "novo elemento");
        vetor.removeDeFatoUmElemento("C");
//        System.out.println(vetor.busca("Elemento 3"));
//        vetor.removeUmElemento(2);
        System.out.println(vetor);
        System.out.println(vetor.getTamanho());
    }
}
