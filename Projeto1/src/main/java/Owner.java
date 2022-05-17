public class Owner {
    private String Nome;
    private String CPF;
    private String RG;
    private String Data_de_Nascimento;
    private Endereço Endereço;

    public Owner(String Nome, String CPF, String RG, Endereço Endereço){
        this.Nome=Nome;
        this.CPF=CPF;
        this.RG=RG;
        this.Endereço=Endereço;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getData_de_Nascimento() {
        return Data_de_Nascimento;
    }

    public void setData_de_Nascimento(String data_de_Nascimento) {
        Data_de_Nascimento = data_de_Nascimento;
    }
    public String getBairro() {
        return Endereço.getBairro();
    }

    public void setBairro(String Bairro) {
        Endereço.setBairro(Bairro);
    }
    public String getCidade() {
        return Endereço.getCidade();
    }

    public void setCidade(String cidade) {
        Endereço.setCidade(cidade);
    }

    public String getEstado() {
        return Endereço.getEstado();
    }

    public void setEstado(String estado) {
        Endereço.setEstado(estado);
    }

    public String getCep() {
        return Endereço.getCep();
    }

    public void setCep(String cep) {
        Endereço.setCep(cep);
    }
    public String getComplemento() {
        return Endereço.getComplemento();
    }

    public void setComplemento(String complemento) {
        Endereço.setComplemento(complemento);
    }


}

class Endereço{
    private String Bairro;
    private String Cidade;
    private String Estado;
    private String Cep;
    private String Complemento;

    public Endereço(String Bairro, String Cidade, String Estado, String Cep, String Complemento){
        this.setBairro(Bairro);
        this.setCidade(Cidade);
        this.setEstado(Estado);
        this.setCep(Cep);
        this.setComplemento(Complemento);
    }
    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String bairro) {
        Bairro = bairro;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String cidade) {
        Cidade = cidade;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public String getCep() {
        return Cep;
    }

    public void setCep(String cep) {
        Cep = cep;
    }

    public String getComplemento() {
        return Complemento;
    }

    public void setComplemento(String complemento) {
        Complemento = complemento;
    }
}
