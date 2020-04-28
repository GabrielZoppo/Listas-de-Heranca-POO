package Lista1.Classes;
public class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica(String nome, String cpf){
        super(nome);
        this.cpf = cpf;
    }

    public String getCpf(){
        return this.cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    @Override 
    public String toString(){
        return "Nome:" + super.getNome() + "\n" + "CPF: " + this.cpf;
    }
}