package ryxandy.com.example.cep;

import androidx.annotation.NonNull;

public class CEP {



    private String ibge;
    private String codestado;
    private String logradouro;
    private String complemento;
    private String cep;
    private String bairro;
    private String localidade;
    private String uf;


    public String getCodibge() {
        return ibge;
    }

    public void setCodibge(String codibge) {
        this.ibge = codibge;
    }

    public String getCodestado() {
        return codestado;
    }

    public void setCodestado(String codestado) {
        this.codestado = codestado;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }


    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "CEP: " + getCep()
                + "\nLogradouro: " + getLogradouro()
                + "\nComplemento: " + getComplemento()
                + "\nBairro: " + getBairro()
                + "\nCidade: " + getLocalidade()
                + "\nEstado: " + getUf()
                + "\nCódigo IBGE : " + getCodibge();

    }
}
