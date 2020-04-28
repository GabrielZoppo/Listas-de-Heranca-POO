package Lista1;
import Lista1.Classes.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;
public class Lista007 {
    public static void main(String[] args){

    //Exercicio 1
    /*
        String nome = JOptionPane.showInputDialog("Digite o nome: ");
        String cpf = JOptionPane.showInputDialog("Digite o cpf: ");
        Estudante e = new Estudante(nome, cpf);

        System.out.println(e);
    */
    //Exercicio 2
    /*
        String nome = JOptionPane.showInputDialog("Digite o nome: ");
        String cpf = JOptionPane.showInputDialog("Digite o cpf: ");
        Estudante e = new Estudante(nome, cpf);
           
        double p1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1: "));
        double p2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2: "));
        e.setMedia(e.calculadoraDeMedia(p1, p2)); 
        System.out.println(e);

    /*
    Exercicio 3
    /*
        ArrayList<Estudante> matricula = new ArrayList<>();
        for(int i=0;i<5;i++){
            String nome = JOptionPane.showInputDialog("Digite o nome: ");
            String cpf = JOptionPane.showInputDialog("Digite o cpf: ");
            Estudante e = new Estudante(nome, cpf);
            matricula.add(e);
    
            double p1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1: "));
            double p2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2: "));
            e.setMedia(e.calculadoraDeMedia(p1, p2)); 
        }
        double media = Double.parseDouble(JOptionPane.showInputDialog("Digite a media: "));
        for(Estudante st : matricula){
            if(st.getMedia() > media){
                System.out.println(st.toString());
            }   
         
        }
    */
    //Exercicio 4
        Boolean teste = true;
        ArrayList<Estudante> matricula2 = new ArrayList<>();
        while(teste){
            String nome2 = JOptionPane.showInputDialog("Digite o nome: ");
            if(nome2.equalsIgnoreCase("fim")){
                teste = false;
            }
            else{
                String cpf2 = JOptionPane.showInputDialog("Digite o cpf: ");
                Estudante estudante2 = new Estudante(nome2, cpf2);  
                double p3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1: "));
                double p4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2: "));
                estudante2.setMedia(estudante2.calculadoraDeMedia(p3, p4));
                matricula2.add(estudante2);
            }
        }

        ArrayList<Estudante> aprovados = new ArrayList<>();
        for(Estudante estudAp  : matricula2){
            if(estudAp.getMedia() > 7){
                aprovados.add(estudAp);   
            }
        }
        System.out.println(aprovados.toString());    
    }
}