package exceptions;

import negocios.bean.Pessoa;

public class ContaNaoExisteException extends Exception {

    private String codigo, senha;

    public ContaNaoExisteException(String codigo, String senha) {
        super("Conta n�o existe");
        this.codigo = codigo;
        this.senha = senha;
    }
}
