import java.util.Scanner;
public class login {
   protected String CPF;
   protected String nome;
   protected String telefone;
   public void cadastro(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite o seu CPF sem pontuação e espaçamento:");
        this.CPF = entrada.nextLine();
        System.out.println("digite seu nome:");
        this.nome = entrada.nextLine();
        System.out.println("digite o seu numero de telefone:");
        this.telefone = entrada.nextLine();


    }
   public void status(){
        System.out.println("seus Dados são:");
        System.out.println(""+this.CPF);
        System.out.println(""+this.nome);
        System.out.println(""+this.telefone);

    }

}
