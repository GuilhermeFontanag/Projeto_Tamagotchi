public class Moto {
   //atributos
    public String Placa;
    public Float Preco;
    public Integer Potencia;
    public String Marca;
    public String Modelo;
    public String Tipo;

    //metodo construtor
    public Moto(String placa, Float preco, Integer potencia, String marca, String modelo, String tipo) {
        Placa = placa;
        Preco = preco;
        Potencia = potencia;
        Marca = marca;
        Modelo = modelo;
        Tipo = tipo;
    }

    //metodos
    public String ligar (){
        return "voce ligou o moto";
    }

    public String desligar (){
        return "voce desligou o moto";
    }
    public String acelerar (){
        return "voce acelerou o moto";
    }

    public String freiar (){
        return "voce acelerou o moto";
    }



    //main
    @Override
    public String toString() {
        return "Moto " +
                "Placa='" + Placa + '\'' +
                ", Preco=" + Preco +
                ", Potencia=" + Potencia +
                ", Marca='" + Marca + "cavalos" + '\'' +
                ", Modelo='" + Modelo + '\'' +
                ", Tipo='" + Tipo + '\'' +
                '}';
    }
}
