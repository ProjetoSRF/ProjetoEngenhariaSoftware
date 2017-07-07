/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author jeansb
 */
@Entity
@Table(name = "paciente", catalog = "projetosrf", schema = "")
@NamedQueries({
    @NamedQuery(name = "Paciente.findAll", query = "SELECT p FROM Paciente p")
    , @NamedQuery(name = "Paciente.findByNumeroprontuario", query = "SELECT p FROM Paciente p WHERE p.numeroprontuario = :numeroprontuario")
    , @NamedQuery(name = "Paciente.findByNome", query = "SELECT p FROM Paciente p WHERE p.nome = :nome")
    , @NamedQuery(name = "Paciente.findByEndereco", query = "SELECT p FROM Paciente p WHERE p.endereco = :endereco")
    , @NamedQuery(name = "Paciente.findByNumerocasa", query = "SELECT p FROM Paciente p WHERE p.numerocasa = :numerocasa")
    , @NamedQuery(name = "Paciente.findByComplemento", query = "SELECT p FROM Paciente p WHERE p.complemento = :complemento")
    , @NamedQuery(name = "Paciente.findByBairro", query = "SELECT p FROM Paciente p WHERE p.bairro = :bairro")
    , @NamedQuery(name = "Paciente.findByCidade", query = "SELECT p FROM Paciente p WHERE p.cidade = :cidade")
    , @NamedQuery(name = "Paciente.findByCep", query = "SELECT p FROM Paciente p WHERE p.cep = :cep")
    , @NamedQuery(name = "Paciente.findByTelefone", query = "SELECT p FROM Paciente p WHERE p.telefone = :telefone")
    , @NamedQuery(name = "Paciente.findByNascimento", query = "SELECT p FROM Paciente p WHERE p.nascimento = :nascimento")
    , @NamedQuery(name = "Paciente.findByEscolaridade", query = "SELECT p FROM Paciente p WHERE p.escolaridade = :escolaridade")
    , @NamedQuery(name = "Paciente.findByProfissao", query = "SELECT p FROM Paciente p WHERE p.profissao = :profissao")
    , @NamedQuery(name = "Paciente.findByEstadocivil", query = "SELECT p FROM Paciente p WHERE p.estadocivil = :estadocivil")
    , @NamedQuery(name = "Paciente.findBySexo", query = "SELECT p FROM Paciente p WHERE p.sexo = :sexo")
    , @NamedQuery(name = "Paciente.findByCor", query = "SELECT p FROM Paciente p WHERE p.cor = :cor")
    , @NamedQuery(name = "Paciente.findByAltura", query = "SELECT p FROM Paciente p WHERE p.altura = :altura")
    , @NamedQuery(name = "Paciente.findByPeso", query = "SELECT p FROM Paciente p WHERE p.peso = :peso")
    , @NamedQuery(name = "Paciente.findByNomemae", query = "SELECT p FROM Paciente p WHERE p.nomemae = :nomemae")
    , @NamedQuery(name = "Paciente.findByNomeresponsavel", query = "SELECT p FROM Paciente p WHERE p.nomeresponsavel = :nomeresponsavel")
    , @NamedQuery(name = "Paciente.findByGrauparentesco", query = "SELECT p FROM Paciente p WHERE p.grauparentesco = :grauparentesco")
    , @NamedQuery(name = "Paciente.findByCartaosus", query = "SELECT p FROM Paciente p WHERE p.cartaosus = :cartaosus")
    , @NamedQuery(name = "Paciente.findByRg", query = "SELECT p FROM Paciente p WHERE p.rg = :rg")
    , @NamedQuery(name = "Paciente.findByCpf", query = "SELECT p FROM Paciente p WHERE p.cpf = :cpf")
    , @NamedQuery(name = "Paciente.findByCertidaonascimento", query = "SELECT p FROM Paciente p WHERE p.certidaonascimento = :certidaonascimento")
    , @NamedQuery(name = "Paciente.findByCid", query = "SELECT p FROM Paciente p WHERE p.cid = :cid")
    , @NamedQuery(name = "Paciente.findByDiagnostico", query = "SELECT p FROM Paciente p WHERE p.diagnostico = :diagnostico")
    , @NamedQuery(name = "Paciente.findByAvaliador", query = "SELECT p FROM Paciente p WHERE p.avaliador = :avaliador")
    , @NamedQuery(name = "Paciente.findByDataavaliacao", query = "SELECT p FROM Paciente p WHERE p.dataavaliacao = :dataavaliacao")})
public class Paciente implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "numeroprontuario")
    private Integer numeroprontuario;
    @Column(name = "nome")
    private String nome;
    @Column(name = "endereco")
    private String endereco;
    @Column(name = "numerocasa")
    private Integer numerocasa;
    @Column(name = "complemento")
    private String complemento;
    @Column(name = "bairro")
    private String bairro;
    @Column(name = "cidade")
    private String cidade;
    @Column(name = "cep")
    private String cep;
    @Column(name = "telefone")
    private String telefone;
    @Column(name = "nascimento")
    private String nascimento;
    @Column(name = "escolaridade")
    private String escolaridade;
    @Column(name = "profissao")
    private String profissao;
    @Column(name = "estadocivil")
    private String estadocivil;
    @Column(name = "sexo")
    private String sexo;
    @Column(name = "cor")
    private String cor;
    @Column(name = "altura")
    private String altura;
    @Column(name = "peso")
    private String peso;
    @Column(name = "nomemae")
    private String nomemae;
    @Column(name = "nomeresponsavel")
    private String nomeresponsavel;
    @Column(name = "grauparentesco")
    private String grauparentesco;
    @Column(name = "cartaosus")
    private String cartaosus;
    @Column(name = "rg")
    private String rg;
    @Column(name = "cpf")
    private String cpf;
    @Column(name = "certidaonascimento")
    private String certidaonascimento;
    @Column(name = "cid")
    private String cid;
    @Column(name = "diagnostico")
    private String diagnostico;
    @Column(name = "avaliador")
    private String avaliador;
    @Column(name = "dataavaliacao")
    private String dataavaliacao;

    public Paciente() {
    }

    public Paciente(Integer numeroprontuario) {
        this.numeroprontuario = numeroprontuario;
    }

    public Integer getNumeroprontuario() {
        return numeroprontuario;
    }

    public void setNumeroprontuario(Integer numeroprontuario) {
        Integer oldNumeroprontuario = this.numeroprontuario;
        this.numeroprontuario = numeroprontuario;
        changeSupport.firePropertyChange("numeroprontuario", oldNumeroprontuario, numeroprontuario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        String oldEndereco = this.endereco;
        this.endereco = endereco;
        changeSupport.firePropertyChange("endereco", oldEndereco, endereco);
    }

    public Integer getNumerocasa() {
        return numerocasa;
    }

    public void setNumerocasa(Integer numerocasa) {
        Integer oldNumerocasa = this.numerocasa;
        this.numerocasa = numerocasa;
        changeSupport.firePropertyChange("numerocasa", oldNumerocasa, numerocasa);
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        String oldComplemento = this.complemento;
        this.complemento = complemento;
        changeSupport.firePropertyChange("complemento", oldComplemento, complemento);
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        String oldBairro = this.bairro;
        this.bairro = bairro;
        changeSupport.firePropertyChange("bairro", oldBairro, bairro);
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        String oldCidade = this.cidade;
        this.cidade = cidade;
        changeSupport.firePropertyChange("cidade", oldCidade, cidade);
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        String oldCep = this.cep;
        this.cep = cep;
        changeSupport.firePropertyChange("cep", oldCep, cep);
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        String oldTelefone = this.telefone;
        this.telefone = telefone;
        changeSupport.firePropertyChange("telefone", oldTelefone, telefone);
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        String oldNascimento = this.nascimento;
        this.nascimento = nascimento;
        changeSupport.firePropertyChange("nascimento", oldNascimento, nascimento);
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        String oldEscolaridade = this.escolaridade;
        this.escolaridade = escolaridade;
        changeSupport.firePropertyChange("escolaridade", oldEscolaridade, escolaridade);
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        String oldProfissao = this.profissao;
        this.profissao = profissao;
        changeSupport.firePropertyChange("profissao", oldProfissao, profissao);
    }

    public String getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(String estadocivil) {
        String oldEstadocivil = this.estadocivil;
        this.estadocivil = estadocivil;
        changeSupport.firePropertyChange("estadocivil", oldEstadocivil, estadocivil);
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        String oldSexo = this.sexo;
        this.sexo = sexo;
        changeSupport.firePropertyChange("sexo", oldSexo, sexo);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        String oldCor = this.cor;
        this.cor = cor;
        changeSupport.firePropertyChange("cor", oldCor, cor);
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        String oldAltura = this.altura;
        this.altura = altura;
        changeSupport.firePropertyChange("altura", oldAltura, altura);
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        String oldPeso = this.peso;
        this.peso = peso;
        changeSupport.firePropertyChange("peso", oldPeso, peso);
    }

    public String getNomemae() {
        return nomemae;
    }

    public void setNomemae(String nomemae) {
        String oldNomemae = this.nomemae;
        this.nomemae = nomemae;
        changeSupport.firePropertyChange("nomemae", oldNomemae, nomemae);
    }

    public String getNomeresponsavel() {
        return nomeresponsavel;
    }

    public void setNomeresponsavel(String nomeresponsavel) {
        String oldNomeresponsavel = this.nomeresponsavel;
        this.nomeresponsavel = nomeresponsavel;
        changeSupport.firePropertyChange("nomeresponsavel", oldNomeresponsavel, nomeresponsavel);
    }

    public String getGrauparentesco() {
        return grauparentesco;
    }

    public void setGrauparentesco(String grauparentesco) {
        String oldGrauparentesco = this.grauparentesco;
        this.grauparentesco = grauparentesco;
        changeSupport.firePropertyChange("grauparentesco", oldGrauparentesco, grauparentesco);
    }

    public String getCartaosus() {
        return cartaosus;
    }

    public void setCartaosus(String cartaosus) {
        String oldCartaosus = this.cartaosus;
        this.cartaosus = cartaosus;
        changeSupport.firePropertyChange("cartaosus", oldCartaosus, cartaosus);
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        String oldRg = this.rg;
        this.rg = rg;
        changeSupport.firePropertyChange("rg", oldRg, rg);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        String oldCpf = this.cpf;
        this.cpf = cpf;
        changeSupport.firePropertyChange("cpf", oldCpf, cpf);
    }

    public String getCertidaonascimento() {
        return certidaonascimento;
    }

    public void setCertidaonascimento(String certidaonascimento) {
        String oldCertidaonascimento = this.certidaonascimento;
        this.certidaonascimento = certidaonascimento;
        changeSupport.firePropertyChange("certidaonascimento", oldCertidaonascimento, certidaonascimento);
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        String oldCid = this.cid;
        this.cid = cid;
        changeSupport.firePropertyChange("cid", oldCid, cid);
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        String oldDiagnostico = this.diagnostico;
        this.diagnostico = diagnostico;
        changeSupport.firePropertyChange("diagnostico", oldDiagnostico, diagnostico);
    }

    public String getAvaliador() {
        return avaliador;
    }

    public void setAvaliador(String avaliador) {
        String oldAvaliador = this.avaliador;
        this.avaliador = avaliador;
        changeSupport.firePropertyChange("avaliador", oldAvaliador, avaliador);
    }

    public String getDataavaliacao() {
        return dataavaliacao;
    }

    public void setDataavaliacao(String dataavaliacao) {
        String oldDataavaliacao = this.dataavaliacao;
        this.dataavaliacao = dataavaliacao;
        changeSupport.firePropertyChange("dataavaliacao", oldDataavaliacao, dataavaliacao);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numeroprontuario != null ? numeroprontuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Paciente)) {
            return false;
        }
        Paciente other = (Paciente) object;
        if ((this.numeroprontuario == null && other.numeroprontuario != null) || (this.numeroprontuario != null && !this.numeroprontuario.equals(other.numeroprontuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "es.Paciente[ numeroprontuario=" + numeroprontuario + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
