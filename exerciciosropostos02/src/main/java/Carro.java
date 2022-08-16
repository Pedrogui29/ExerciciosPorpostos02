public class Carro {

    String cor;
    String marca;
    String modelo;
    double velocidadeMax;
    double velocidadeAtual;

    //Composicao
    Motor mot = new Motor();

    void ligar(){
        System.out.println("O carro da marca "+ marca +"ligou");
    }

    void acelerar(){

        System.out.println("O carro da marca "+ marca +"acelerou");
    }

    void mostraInfo(){
        System.out.println("O carro possui cor "+ cor + ", marca "+ marca + ", modelo "+ modelo+
                " valocidade maxima "+ velocidadeMax +" e valocidade atual "+ velocidadeAtual);
    }

}
