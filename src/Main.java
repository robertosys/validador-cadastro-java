public class Main {
    static void main() {
        login pessoa1 = new login();
        pessoa1.cadastro();
        validador val = new validador();
        val.cpfval(pessoa1.CPF);
        val.nomeval(pessoa1.nome);
        val.numeroval(pessoa1.telefone);
        pessoa1.status();




    }
}
