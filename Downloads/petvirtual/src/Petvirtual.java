public class Petvirtual {
    //encapsulate

    private String nome;
    private Integer fome = 0;
    private Integer energia = 0;
    private String humor;

    //metodo construtor
    private Petvirtual(String nome, Integer fome, Integer energia) {
        setNome(nome);
        setEnergia(energia);
        setFome(fome);
    }

//getter


     private String getNome() {
        return nome;
    }

    private Integer getfome() {
        return fome;
    }

    private Integer getEnergia() {
        return energia;
    }

     private String getHumor() {
        if (energia >= 0 && fome >= 0) {
            int feliz = (this.energia +this.fome)/2;

            if (feliz >= 70) {
                return "Muito feliz";
            } else if (feliz >= 40) {
                return "Esta feliz";
            } else {
                return "Esta infeliz";
            }
        }
        return humor;
    }

        //setter
        private void setFome ( int fome){
            if (this.fome >= 30) {
                IO.println("saciado");
            } else if (this.fome >= 70) {
                IO.println("faminto");
            } else if (this.fome<=0) {
                IO.println("nao e possivel");
            }
        }

        private void setEnergia ( int energia){
            if (energia >= 0 && energia <= 30) {
                this.energia += energia;
                IO.println("esgotado");
            } else if (this.energia <= 100) {

                IO.println("totalmente pilhado");
            } else if ((this.energia > 100 || this.energia < 0)) {
                IO.println("alem do limite de energia");
            }
        }

        private void setNome (String nome){
            this.nome = nome;


        }


    }
