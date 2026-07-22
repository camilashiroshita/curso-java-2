package empresa;

public class Carro {
    private String volante;
    private String pedais;

    private Motor motor;
    private String airbag;   

    // Criando construtor para inicializar os atributos e não precisar setar na Main
    public Carro() {
        this.motor = new Motor();
        this.volante = "Volante";
        this.pedais = "Pedais";
    }

    public void ligarCarro() {
        System.out.println("Ligando o carro...");
    }

    public void acelerar() {
        motor.iniciar();
        System.out.println("Acelerando...");
    }

    public void frear() {
        System.out.println("Freando...");
    }

    public void ativarAirbags() {
        System.out.println("Ativando airbags");
    }

    private void detectarColisao() {
        ativarAirbags();    
    }

    public String getVolante() {
        return volante;
    }

    public void setVolante(String volante) {
        this.volante = volante;
    }

    public String getPedais() {
        return pedais;
    }

    public void setPedais(String pedais) {
        this.pedais = pedais;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public String getAirbag() {
        return airbag;
    }

    public void setAirbag(String airbag) {
        this.airbag = airbag;
    }

    

}
