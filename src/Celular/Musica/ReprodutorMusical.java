package Celular.Musica;

public interface ReprodutorMusical {
    default void tocar(){
    }
    default void pausar(){

    }
    default String selecionarMusica(String musica){
    return "";}
}
