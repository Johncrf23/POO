public class Main {

public static void main(String[] args) {
        Mamifero mamifero1 = new Mamifero("Urso-do-canadá", 1.8f, 4, "Vermelho", "Terra", 0.5f, "mel");
        mamifero1.dados();

        Mamifero mamifero = new Mamifero("Camelo", 1.5f, 4, "Amarelo", "terra", 2.0f, "cacto");
mamifero.dados();
        Peixe peixe1 = new Peixe("Tubarão", 3.0f, 0, "Cinzento", "Mar", 1.5f, "Barbatanas e Cauda");
        peixe1.dadosPeixe();
}

}