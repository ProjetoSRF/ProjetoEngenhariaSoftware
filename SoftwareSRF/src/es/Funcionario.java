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
@Table(name = "funcionario", catalog = "projetosrf", schema = "")
@NamedQueries({
    @NamedQuery(name = "Funcionario.findAll", query = "SELECT f FROM Funcionario f")
    , @NamedQuery(name = "Funcionario.findByCpf", query = "SELECT f FROM Funcionario f WHERE f.cpf = :cpf")
    , @NamedQuery(name = "Funcionario.findByIdFunc", query = "SELECT f FROM Funcionario f WHERE f.idFunc = :idFunc")
    , @NamedQuery(name = "Funcionario.findByNome", query = "SELECT f FROM Funcionario f WHERE f.nome = :nome")
    , @NamedQuery(name = "Funcionario.findByEndereco", query = "SELECT f FROM Funcionario f WHERE f.endereco = :endereco")
    , @NamedQuery(name = "Funcionario.findByNumerocasa", query = "SELECT f FROM Funcionario f WHERE f.numerocasa = :numerocasa")
    , @NamedQuery(name = "Funcionario.findByComplemento", query = "SELECT f FROM Funcionario f WHERE f.complemento = :complemento")
    , @NamedQuery(name = "Funcionario.findByBairro", query = "SELECT f FROM Funcionario f WHERE f.bairro = :bairro")
    , @NamedQuery(name = "Funcionario.findByCidade", query = "SELECT f FROM Funcionario f WHERE f.cidade = :cidade")
    , @NamedQuery(name = "Funcionario.findByTelefone", query = "SELECT f FROM Funcionario f WHERE f.telefone = :telefone")
    , @NamedQuery(name = "Funcionario.findByNascimento", query = "SELECT f FROM Funcionario f WHERE f.nascimento = :nascimento")})
public class Funcionario implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "cpf")
    private String cpf;
    @Basic(optional = false)
    @Column(name = "id_func")
    private int idFunc;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "endereco")
    private String endereco;
    @Basic(optional = false)
    @Column(name = "numerocasa")
    private String numerocasa;
    @Basic(optional = false)
    @Column(name = "complemento")
    private String complemento;
    @Basic(optional = false)
    @Column(name = "bairro")
    private String bairro;
    @Basic(optional = false)
    @Column(name = "cidade")
    private String cidade;
    @Basic(optional = false)
    @Column(name = "telefone")
    private String telefone;
    @Basic(optional = false)
    @Column(name = "nascimento")
    private String nascimento;

    public Funcionario() {
    }

    public Funcionario(String cpf) {
        this.cpf = cpf;
    }

    public Funcionario(String cpf, int idFunc, String nome, String endereco, String numerocasa, String complemento, String bairro, String cidade, String telefone, String nascimento) {
        this.cpf = cpf;
        this.idFunc = idFunc;
        this.nome = nome;
        this.endereco = endereco;
        this.numerocasa = numerocasa;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.telefone = telefone;
        this.nascimento = nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        String oldCpf = this.cpf;
        this.cpf = cpf;
        changeSupport.firePropertyChange("cpf", oldCpf, cpf);
    }

    public int getIdFunc() {
        return idFunc;
    }

    public void setIdFunc(int idFunc) {
        int oldIdFunc = this.idFunc;
        this.idFunc = idFunc;
        changeSupport.firePropertyChange("idFunc", oldIdFunc, idFunc);
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

    public String getNumerocasa() {
        return numerocasa;
    }

    public void setNumerocasa(String numerocasa) {
        String oldNumerocasa = this.numerocasa;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cpf != null ? cpf.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Funcionario)) {
            return false;
        }
        Funcionario other = (Funcionario) object;
        if ((this.cpf == null && other.cpf != null) || (this.cpf != null && !this.cpf.equals(other.cpf))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "es.Funcionario[ cpf=" + cpf + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
