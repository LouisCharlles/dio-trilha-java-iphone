package Celular;

import Celular.Musica.ReprodutorMusical;
import Celular.Navegador.NavegadorInternet;
import Celular.Telefone.AparelhoTelefonico;

import java.util.Scanner;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    public void tocar(){
        System.out.println("Tocando musica...");
    }
    public void pausar(){
        System.out.println("Musica pausada.");
    }
    public String selecionarMusica(String musica){
        return "tocando: "+musica;
    }

    public void exibirPagina(String url){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira aqui sua url");
        url = scanner.nextLine();
        validarConexao();
        System.out.println("Exibindo página "+url);
    }
    public void validarConexao(){
        System.out.println("Validando conexão...");
    }

    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba ao sistema...");
    }

    public void atualizarPagina(){
        validarConexao();
        System.out.println("Atualizando a pagina... ");
    }
    public void ligar(String numero){
        System.out.println("Ligando para "+numero+"...");

    }


    public void atender(){
        System.out.println("Atendeu.");
    }
    private void iniciarCorreioVoz(){
        System.out.println("Não foi possível completar a sua ligação, verifique o número e ligue novamente.");
    }



    public static void main(String[] args) {

    }
}