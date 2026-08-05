public class Bicicleta {
    //atributos
    public Float Preco;
    public String Marca;
    public String Modelo;

    //metodo construtor
    public Bicicleta (String marca, String modelo, Float preco){
        Preco = preco;
        Marca = marca;
        modelo = modelo;
    }

    //metodos
     public String pedalar(){
        return "voce pedalou";
     }
    public String freiar(){
        return "voce freiou";
    }
//main
    @Override
    public String toString() {
        return "Bicicleta " +
                "Preco=" + Preco +
                ", Marca='" + Marca + '\'' +
                ", Modelo='" + Modelo + '\''
                ;
    }
}
