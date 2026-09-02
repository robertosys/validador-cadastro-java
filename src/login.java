import java.util.Scanner;
public class login {
   private String CPF;
   private String nome;
   private String telefone;
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
    public String getCPF(){
       return this.CPF;
    }
    public String getNome(){
        return this.nome;
    }
    public String getTelefone(){
        return this.telefone;
    }


}
