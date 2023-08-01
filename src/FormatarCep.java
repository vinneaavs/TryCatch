public class FormatarCep {
    public static void main(String[] args) {
        try {
            FormatarCep("2132323");
        } catch (CepExceptionJava e) {
            // TODO Auto-generated catch block

            System.out.println("Cep não corresponde com a regra");

        }
    }

    public static String FormatarCep(String cepString) throws CepExceptionJava{
        if (cepString.length() != 8) {
            throw new CepExceptionJava();
        }
        return cepString;
    }
}
