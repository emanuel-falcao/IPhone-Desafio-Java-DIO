package Iphone;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Reprodutor Musical
    public void tocar() {
        System.out.println("Tocando música...");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }

    // Aparelho Telefônico
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    // Navegador de Internet
    public void abrirPagina(String url) {
        System.out.println("Abrindo página: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }
}
