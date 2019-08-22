public class Carro{

    //Atributos
    private double velocidade;
    private String marca; 

    //Métodos

    public void acelerar(double incremento){
        velocidade = this.velocidade + incremento; 
    }

    public void frear(double decremento){
        velocidade = this.velocidade - decremento;
    }

    public String getMarca(){
        return this.marca;
    } 

    public void alterarMarca(String nova){
        this.marca = nova;
    }

    public void imprimirMarca(){
        System.out.println(this.marca);
    }

    public void imprirmirVelocidade(){
        System.out.println(velocidade);
    }


}