public class Main {
    public static void main(String[] args) {
        login pessoa1 = new login();
        pessoa1.cadastro();
        validador val = new validador();
        val.cpfval(pessoa1.getCPF());
        val.nomeval(pessoa1.getNome());
        val.numeroval(pessoa1.getTelefone());
        pessoa1.status();




    }
}
