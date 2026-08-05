void main() {
    Carro carro = new Carro("ABC1D23", 120.000f, 24,"Honda", "12Z","manual" );
    Moto moto = new Moto("ABC1D23", 90.12F, 120, "Toyota", "naosei", "eletrico");
    Caminhao caminhao = new Caminhao("ABC1D23", 12000.00f, 200, " Honda","naosei", "eletrico" );
    Bicicleta bicicleta = new Bicicleta("Nike", "ouro", 1400.00f );

    IO.println(carro);
    IO.println(moto);
    IO.println(caminhao);
    IO.println(bicicleta);
}