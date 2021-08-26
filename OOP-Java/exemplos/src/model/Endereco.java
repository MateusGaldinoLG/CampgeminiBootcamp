package model;

public class Endereco {

    enum TipoEndereco {
        RESIDENCIAL,
        ENTREGA,
        TRABALHO
    }

    public TipoEndereco tipo;

    public String endereco;
    public String numero;
    public String complemento;
    public String cidade;
    public String bairro;
    public String estado;
    public String cep;
}
