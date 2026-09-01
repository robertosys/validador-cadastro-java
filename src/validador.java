public class validador {
      protected   void cpfval(String CPF){
        int resultado = 0;
        int mult = 11;
        int verificador = 0;
        int resultado2 = 0;


        int[] CPFnum = new int[11];
        for (int i = 0; i < CPF.length(); i++) {
            CPFnum[i] = CPF.charAt(i) - '0';
        }

        if(CPFnum.length == 11) {


            for (int x = 0; x < 9; x++) {

                mult--;
                resultado = resultado + CPFnum[x] * mult;


            }
            resultado = resultado % 11;
            resultado = 11 - resultado;
            if (resultado == 10 || resultado == 11) {
                if (CPFnum[9] == 0) {
                    verificador++;
                }
            } else if (CPFnum[9] == resultado) {
                verificador++;
            }


            mult = 11;
            for (int x = 0; x < 10; x++) {

                resultado2 = resultado2 + CPFnum[x] * mult;
                mult--;


            }
            resultado2 = resultado2 % 11;
            resultado2 = 11 - resultado2;
            if (resultado2 == 10 || resultado2 == 11) {
                if (CPFnum[10] == 0) {
                    verificador++;
                }
            } else if (CPFnum[10] == resultado2) {
                verificador++;
            }
            if (verificador == 2) {
                System.out.println("CPF valido.");
            } else {
                System.out.println("Cpf invalido");
            }
        }else{
            System.out.println("Cpf invalido ");
        }



    }
    protected   void numeroval(String telefone){
        if(telefone.length() == 11 ){

            System.out.println("numero valido.");

        }else{
            System.out.println("numero invalido");
        }

    }
    protected   void nomeval(String nome){
        if(nome.length() > 30){
            System.out.println("nome comprido da peste, abrevia ai");
        }else if(nome.length() < 2){
            System.out.println("que nome é esse que só tem duas letras?");

        }else{
            System.out.println("nome valido");
        }

    }
}
