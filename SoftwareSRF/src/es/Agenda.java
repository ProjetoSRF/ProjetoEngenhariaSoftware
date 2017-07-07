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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author jeansb
 */
@Entity
@Table(name = "agenda", catalog = "projetosrf", schema = "")
@NamedQueries({
    @NamedQuery(name = "Agenda.findAll", query = "SELECT a FROM Agenda a")
    , @NamedQuery(name = "Agenda.findByIdAgenda", query = "SELECT a FROM Agenda a WHERE a.idAgenda = :idAgenda")
    , @NamedQuery(name = "Agenda.findByData", query = "SELECT a FROM Agenda a WHERE a.data = :data")
    , @NamedQuery(name = "Agenda.findByDocFuncionario", query = "SELECT a FROM Agenda a WHERE a.docFuncionario = :docFuncionario")
    , @NamedQuery(name = "Agenda.findByDocPaciente", query = "SELECT a FROM Agenda a WHERE a.docPaciente = :docPaciente")})
public class Agenda implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_agenda")
    private Integer idAgenda;
    @Basic(optional = false)
    @Column(name = "data")
    private String data;
    @Basic(optional = false)
    @Lob
    @Column(name = "descricao")
    private String descricao;
    @Basic(optional = false)
    @Column(name = "doc_funcionario")
    private String docFuncionario;
    @Basic(optional = false)
    @Column(name = "doc_paciente")
    private String docPaciente;

    public Agenda() {
    }

    public Agenda(Integer idAgenda) {
        this.idAgenda = idAgenda;
    }

    public Agenda(Integer idAgenda, String data, String descricao, String docFuncionario, String docPaciente) {
        this.idAgenda = idAgenda;
        this.data = data;
        this.descricao = descricao;
        this.docFuncionario = docFuncionario;
        this.docPaciente = docPaciente;
    }

    public Integer getIdAgenda() {
        return idAgenda;
    }

    public void setIdAgenda(Integer idAgenda) {
        Integer oldIdAgenda = this.idAgenda;
        this.idAgenda = idAgenda;
        changeSupport.firePropertyChange("idAgenda", oldIdAgenda, idAgenda);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        String oldData = this.data;
        this.data = data;
        changeSupport.firePropertyChange("data", oldData, data);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        String oldDescricao = this.descricao;
        this.descricao = descricao;
        changeSupport.firePropertyChange("descricao", oldDescricao, descricao);
    }

    public String getDocFuncionario() {
        return docFuncionario;
    }

    public void setDocFuncionario(String docFuncionario) {
        String oldDocFuncionario = this.docFuncionario;
        this.docFuncionario = docFuncionario;
        changeSupport.firePropertyChange("docFuncionario", oldDocFuncionario, docFuncionario);
    }

    public String getDocPaciente() {
        return docPaciente;
    }

    public void setDocPaciente(String docPaciente) {
        String oldDocPaciente = this.docPaciente;
        this.docPaciente = docPaciente;
        changeSupport.firePropertyChange("docPaciente", oldDocPaciente, docPaciente);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAgenda != null ? idAgenda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Agenda)) {
            return false;
        }
        Agenda other = (Agenda) object;
        if ((this.idAgenda == null && other.idAgenda != null) || (this.idAgenda != null && !this.idAgenda.equals(other.idAgenda))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "es.Agenda[ idAgenda=" + idAgenda + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
