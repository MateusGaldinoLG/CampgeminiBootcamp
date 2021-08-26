package model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {

    public String numCartao;
    private List<Endereco> enderecos;

    // public void setEnderecos(List<Endereco> enderecos){
    //     this.enderecos = enderecos;
    // }

    public void adicionaEndereco(Endereco endereco){
        if (endereco == null){
            throw new NullPointerException("Endereço não pode ser nulo");
        }

        if(endereco.cep == null){
            throw new NullPointerException("CEP não pode ser nulo");

        }
        getEnderecos().add(endereco);
    }

    private List<Endereco> getEnderecos(){
        if(this.enderecos == null){
            this.enderecos = new ArrayList<Endereco>();
        }
        return this.enderecos;
    }

}
