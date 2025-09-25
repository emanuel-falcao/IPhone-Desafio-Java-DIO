package Iphone;
// Classe principal que junta tudo: música, telefone e internet 📱

// Desenvolvido por Emanuel Falcão — simula o iPhone com estilo!

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // 🎵 Reprodutor Musical

    public void tocar() {
        // Emanuel mandando ver no som!
        System.out.println("Tocando música...");
    }

    public void selecionarMusica(String musica) {
        // Escolhendo a trilha sonora do momento 🎶
        System.out.println("Selecionando a música: " + musica);
    }

    // 📞 Aparelho Telefônico

    public void ligar(String numero) {
        // Fazendo aquela ligação importante ☎️
        System.out.println("Ligando para: " + numero);
    }

    public void atender() {
        // Alô? Emanuel na linha!
        System.out.println("Atendendo chamada...");
    }

    public void iniciarCorreioVoz() {
        // Deixando recado com estilo 📩
        System.out.println("Iniciando correio de voz...");
    }

    // 🌐 Navegador de Internet

    public void abrirPagina(String url) {
        // Navegando pela web com classe 💻
        System.out.println("Abrindo página: " + url);
    }

    public void adicionarNovaAba() {
        // Multitarefas ativadas! 🧠
        System.out.println("Nova aba adicionada.");
    }

    public void atualizarPagina() {
        // Atualizando pra não perder nada 🔄
        System.out.println("Página atualizada.");
    }
}