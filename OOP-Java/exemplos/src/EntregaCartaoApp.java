import model.Cliente;
import model.Endereco;

public class EntregaCartaoApp {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.cep = "000000000";
        //dados do endereço

        Cliente cliente = new Cliente();
        //dados do cliente

        cliente.adicionaEndereco(endereco);
        System.out.println("Endereço adicionado com sucesso");

    }
}
