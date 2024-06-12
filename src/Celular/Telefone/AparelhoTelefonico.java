package Celular.Telefone;

public interface AparelhoTelefonico {

    default void ligar(String numero){

    }

    default void atender(){
    }

    private void iniciarCorreioVoz(){
    }
}
