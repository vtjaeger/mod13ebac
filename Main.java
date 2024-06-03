public class Main {
    public static void main(String[] args) {
        var pessoa = new PessoaFisica("Vinicius", "Bairro Centro, Rua 1", "054235325385");
        var empresa = new PessoaJuridica("Loja", "Av Principal, 123", "90472110000-0");

        System.out.println(pessoa.comprimentos("sou " + pessoa.getNome()));
        System.out.println(empresa.comprimentos("bem vindo a " + empresa.getNome() + " de cnpj " + empresa.getCnpj()));

        System.out.println(pessoa.classe());
        System.out.println(empresa.classe());
    }
}
