/*******************************************************
 * PROJETO SIMULADOR PARA TREINAMENTO DE OPERADORES DE *
 * SUBESTAÇAO. *
 * PROJETISTA E DESENVOLVEDOR: *
 * CARLOS MARDONIO BEZERRA MARTINS *
 * BACHAREL EM SISTEMAS DE INFORMAÇAO *
 * *
 * DATA - 18/08/2006 *
 * ATUALIZADO - 19/08/2008 *
 *******************************************************
 * MODULO - ACESSO *
 ******************************************************/
public class Acesso {
    private int codigoTotal;
    private int codigo;
    private int codigoMT;
    private String tagEquipamento;
    private String usuario;
    private String data;
    private String operacao;
    private String manobra;

    // Construtor padrão
    public Acesso() {
    }

    // --- Métodos SET ---
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setCodigoMT(int codigoMT) {
        this.codigoMT = codigoMT;
    }

    public void setCodigoTotal(int codigoTotal) {
        this.codigoTotal = codigoTotal;
    }

    public void setTagEquipamento(String tagEquipamento) {
        this.tagEquipamento = tagEquipamento;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    public void setManobra(String manobra) {
        this.manobra = manobra;
    }

    // --- Métodos GET ---
    public int getCodigo() {
        return codigo;
    }

    public int getCodigoMT() {
        return codigoMT;
    }

    public int getCodigoTotal() {
        return codigoTotal;
    }

    public String getTagEquipamento() {
        return tagEquipamento;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getData() {
        return data;
    }

    public String getOperacao() {
        return operacao;
    }

    public String getManobra() {
        return manobra;
    }
}