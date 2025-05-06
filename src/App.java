public class App {
    public static void main(String[] args) throws Exception {
        String nomi[] = new String[] { "Marco", "Diego", "Filippo", "Daniele" };
        for (int i = 0; i < nomi.length; i++) {
            new Corridore(nomi[i]).start();
        }
    }
}

class Corridore extends Thread {
    private String nome;

    public Corridore(String nome) {
        this.nome = nome;
    }

    @Override
    public void run() {
        int count = 0;
        for (int i = 0; i < 100; i++) {
            count++;
            System.out.println("nome : " + nome + " ---------> " + count + " metri");

            if (count == 100) {
                System.out.println("Il corridore " + nome + " e' arivato ");
            }
        }
    }
}