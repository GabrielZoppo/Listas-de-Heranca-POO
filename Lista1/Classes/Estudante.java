package Lista1.Classes;

public class Estudante extends PessoaFisica {
    private double media;

    public Estudante(String nome, String cpf){
        super(nome, cpf);
        this.media = -1;
    }

    public double getMedia(){
        return this.media;
    }
    public double getmedia(double media){
        return this.media;
    }

    public void setMedia(double media){
        this.media = media;
    }

    public double calculadoraDeMedia(double p1, double p2){
        return this.media = (p1 + p2)/2;
    }

    @Override
    public String toString(){
        return "Nome:" + super.getNome() + "\n" + "CPF: " + super.getCpf() + "\n" + "Media:" + this.media;
    }
}