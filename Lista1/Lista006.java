package Lista1;
import Lista1.Classes.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;
public class Lista006 {
    public static void main(String[] args){
       
    //Exercicio 1
    /*
        String nome = JOptionPane.showInputDialog("Digite o nome: ");
        String cpf = JOptionPane.showInputDialog("Digite o cpf: ");
        PessoaFisica p = new PessoaFisica(nome, cpf);
        System.out.println(p);
    */

    //Exercicio 2
    /*
        String nome = JOptionPane.showInputDialog("Digite o nome: ");
        String cpf = JOptionPane.showInputDialog("Digite o cpf: ");
        PessoaFisica p = new PessoaFisica(nome, cpf);
        System.out.println(p.getNome());
        System.out.println(p.getCpf()); 

    */
    //Exercicio 3
        ArrayList<PessoaFisica> cadrastro = new ArrayList<>();
            for(int i=0;i<5;i++){ 
                String nome = JOptionPane.showInputDialog("Digite o nome: ");
                String cpf = JOptionPane.showInputDialog("Digite o cpf: ");
                PessoaFisica p = new PessoaFisica(nome, cpf);
                cadrastro.add(p);       
        }

        String letra = JOptionPane.showInputDialog("Digite a letra desejada: ");
        for (PessoaFisica pessoaFisica : cadrastro) {
            if(pessoaFisica.getNome().startsWith(letra)){
                System.out.println(pessoaFisica.toString());
            }
        }
    }
}