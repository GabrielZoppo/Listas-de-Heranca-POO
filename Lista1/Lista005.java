package Lista1;
import Lista1.Classes.*;
import javax.swing.JOptionPane;
public class Lista005 {
    public static void main(String[] args) throws Exception {
        
    //Exercicio 1
    /*
        Pessoa p = new Pessoa("gabriel");
        System.out.println(p);
    */
    

    //Exercicio 2
        String nome = JOptionPane.showInputDialog("Digite o nome: ");
        Pessoa p = new Pessoa(nome);
        System.out.println(p);
        System.out.println(p.getNome());
    }
}