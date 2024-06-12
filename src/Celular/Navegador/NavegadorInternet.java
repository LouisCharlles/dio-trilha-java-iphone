package Celular.Navegador;

public interface NavegadorInternet {

    default void exibirPagina(String url){
    }

    private void validarConexao(){

    }

    default void adicionarNovaAba(){

    }

    default void atualizarPagina(){

    }
}
