package Iphone;
// Classe de teste para mostrar o iPhone em ação 🚀

// Emanuel testando tudo antes de entregar com confiança!

public class Main {
    public static void main(String[] args) {
        IPhone meuIPhone = new IPhone();

        // Testando Reprodutor Musical
        meuIPhone.selecionarMusica("Imagine - John Lennon");
        meuIPhone.tocar();

        // Testando Aparelho Telefônico
        meuIPhone.ligar("81-99999-9999");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();

        // Testando Navegador de Internet
        meuIPhone.abrirPagina("https://www.apple.com");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}