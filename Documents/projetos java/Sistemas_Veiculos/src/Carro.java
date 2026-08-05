public class Carro {
    //atributos
    public String Placa;
    public Float Preco;
    public Integer Potencia;
    public String Marca;
    public String Modelo;
    public String Tipo;

    //metodo construtor
    public Carro(String placa, Float preco, Integer potencia, String marca, String modelo, String tipo) {
        Placa = placa;
        Preco = preco;
        Potencia = potencia;
        Marca = marca;
        Modelo = modelo;
        Tipo = tipo;
    }
//metodos
public String ligar (){
    return "voce ligou o carro";
}

    public String desligar (){
        return "voce desligou o carro";
    }
    public String acelerar (){
        return "voce acelerou o carro";
    }

    public String freiar (){
        return "voce acelerou o carro";
    }

    public String marcha (){
        return "voce usou a marcha";
    }

    public String baixar_vidro (){
        return "voce baixou o vidro";
    }

    public String levantar_vidro (){
        return "voce levantou o vidro";
    }








    //main
    @Override
    public String toString() {
        return "Carro " +
                "Placa='" + Placa + '\'' +
                ", Preco=" + Preco +
                ", Potencia=" + Potencia + "cavalos" +
                ", Marca='" + Marca + '\'' +
                ", Modelo='" + Modelo + '\'' +
                ", Tipo='" + Tipo ;
    }
}
