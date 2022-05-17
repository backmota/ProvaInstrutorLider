public class Carro {
    private String Modelo;
    private String Cor;
    private String Ano;
    private Marca Marca;
    private String Chassi;
    private String Proprietario;
    private int Velocidade_máxima;
    private int Velocidade_atual;
    private int Numero_de_portas;
    private boolean teto_solar;
    private int Numero_de_Marchas;
    private boolean automatico;
    private int Volume_de_combusvel;
    private int marcha;
    private Owner Owner;

    public Carro(Owner Owner, Marca Marca){
        this.Velocidade_atual=0;
        this.Owner=Owner;
        this.Marca= Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String cor) {
        Cor = cor;
    }

    public String getAno() {
        return Ano;
    }

    public void setAno(String ano) {
        Ano = ano;
    }

    public Marca getMarca() {
        return Marca;
    }

    public void setMarca(Marca marca) {
        Marca = marca;
    }

    public String getChassi() {
        return Chassi;
    }

    public void setChassi(String chassi) {
        Chassi = chassi;
    }

    public String getProprietario() {
        return Proprietario;
    }

    public void setProprietario(String proprietario) {
        Proprietario = proprietario;
    }

    public int getVelocidade_máxima() {
        return Velocidade_máxima;
    }

    public void setVelocidade_máxima(int velocidade_máxima) {
        Velocidade_máxima = velocidade_máxima;
    }

    public int getVelocidade_atual() {
        return Velocidade_atual;
    }

    public void setVelocidade_atual(int velocidade_atual) {
        Velocidade_atual = velocidade_atual;
    }

    public int getNumero_de_portas() {
        return Numero_de_portas;
    }

    public void setNumero_de_portas(int numero_de_portas) {
        Numero_de_portas = numero_de_portas;
    }

    public boolean isTeto_solar() {
        return teto_solar;
    }

    public void setTeto_solar(boolean teto_solar) {
        this.teto_solar = teto_solar;
    }

    public int getNumero_de_Marchas() {
        return Numero_de_Marchas;
    }

    public void setNumero_de_Marchas(int numero_de_Marchas) {
        Numero_de_Marchas = numero_de_Marchas;
    }

    public boolean isAutomatico() {
        return automatico;
    }

    public void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }

    public int getVolume_de_combusvel() {
        return Volume_de_combusvel;
    }

    public void setVolume_de_combusvel(int volume_de_combusvel) {
        Volume_de_combusvel = volume_de_combusvel;
    }

    public int getMarcha() {
        return marcha;
    }

    public void acelera(){
        Velocidade_atual++;
    }

    public void freia(){
        Velocidade_atual=0;
    }

    public void troca_marcha(int marcha){
        this.marcha=marcha;
    }

    public void reduz_a_marcha(){
        if(getVelocidade_atual()<=0){
            marcha--;
        }else{
            System.out.println("16- A marcha ré nao pode ser engatada se o a velocidade for superior a 0 KM/h;");
        }
    }

    public int calcule_autonomia(int consumo){
        //considerando que la autonomia se calcula como consumo * volumen de combustible
        return consumo*this.Volume_de_combusvel;
    }

    public void exibir_volume_combustivel(){
        System.out.println("El volumen del combustible es: "+this.Volume_de_combusvel);
    }
}

class Marca{
    private String nome;
    private int nrDeModelos;
    private String ano_de_lançamento;
    private String codigo_idenficador;

    public Marca(String nome, int nrDeModelos, String ano_de_lançamento, String codigo_idenficador){
        this.setNome(nome);
        this.setNrDeModelos(nrDeModelos);
        this.setAno_de_lançamento(ano_de_lançamento);
        this.setCodigo_idenficador(codigo_idenficador);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNrDeModelos() {
        return nrDeModelos;
    }

    public void setNrDeModelos(int nrDeModelos) {
        this.nrDeModelos = nrDeModelos;
    }

    public String getAno_de_lançamento() {
        return ano_de_lançamento;
    }

    public void setAno_de_lançamento(String ano_de_lançamento) {
        this.ano_de_lançamento = ano_de_lançamento;
    }

    public String getCodigo_idenficador() {
        return codigo_idenficador;
    }

    public void setCodigo_idenficador(String codigo_idenficador) {
        this.codigo_idenficador = codigo_idenficador;
    }
}
