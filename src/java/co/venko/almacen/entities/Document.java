/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.venko.almacen.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Dayron
 */
@Entity
@Table(name = "document")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Document.findAll", query = "SELECT d FROM Document d"),
    @NamedQuery(name = "Document.findByIdDocument", query = "SELECT d FROM Document d WHERE d.idDocument = :idDocument"),
    @NamedQuery(name = "Document.findByFirstName", query = "SELECT d FROM Document d WHERE d.firstName = :firstName"),
    @NamedQuery(name = "Document.findBySecondName", query = "SELECT d FROM Document d WHERE d.secondName = :secondName"),
    @NamedQuery(name = "Document.findByFirstSurname", query = "SELECT d FROM Document d WHERE d.firstSurname = :firstSurname"),
    @NamedQuery(name = "Document.findBySecondSurname", query = "SELECT d FROM Document d WHERE d.secondSurname = :secondSurname"),
    @NamedQuery(name = "Document.findByCitizenId", query = "SELECT d FROM Document d WHERE d.citizenId = :citizenId"),
    @NamedQuery(name = "Document.findByBirthdate", query = "SELECT d FROM Document d WHERE d.birthdate = :birthdate"),
    @NamedQuery(name = "Document.findByBloodType", query = "SELECT d FROM Document d WHERE d.bloodType = :bloodType"),
    @NamedQuery(name = "Document.findByBloodRh", query = "SELECT d FROM Document d WHERE d.bloodRh = :bloodRh"),
    @NamedQuery(name = "Document.findByCreationDate", query = "SELECT d FROM Document d WHERE d.creationDate = :creationDate"),
    @NamedQuery(name = "Document.findByCountry", query = "SELECT d FROM Document d WHERE d.country = :country"),
    @NamedQuery(name = "Document.findByDocumentType", query = "SELECT d FROM Document d WHERE d.documentType = :documentType"),
    @NamedQuery(name = "Document.findByReadingDate", query = "SELECT d FROM Document d WHERE d.readingDate = :readingDate"),
    @NamedQuery(name = "Document.findByLatitud", query = "SELECT d FROM Document d WHERE d.latitud = :latitud"),
    @NamedQuery(name = "Document.findByLongitud", query = "SELECT d FROM Document d WHERE d.longitud = :longitud")})
public class Document implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_document")
    private Long idDocument;
    @Size(max = 300)
    @Column(name = "first_name")
    private String firstName;
    @Size(max = 300)
    @Column(name = "second_name")
    private String secondName;
    @Size(max = 300)
    @Column(name = "first_surname")
    private String firstSurname;
    @Size(max = 300)
    @Column(name = "second_surname")
    private String secondSurname;
    @Size(max = 300)
    @Column(name = "citizen_id")
    private String citizenId;
    @Size(max = 100)
    @Column(name = "birthdate")
    private String birthdate;
    @Size(max = 45)
    @Column(name = "blood_type")
    private String bloodType;
    @Size(max = 45)
    @Column(name = "blood_rh")
    private String bloodRh;
    @Column(name = "creation_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;
    @Size(max = 100)
    @Column(name = "country")
    private String country;
    @Size(max = 100)
    @Column(name = "document_type")
    private String documentType;
    @Size(max = 100)
    @Column(name = "reading_date")
    private String readingDate;
    @Size(max = 100)
    @Column(name = "latitud")
    private String latitud;
    @Size(max = 45)
    @Column(name = "longitud")
    private String longitud;
    @JoinColumn(name = "user_name", referencedColumnName = "user_name")
    @ManyToOne
    private Users userName;

    public Document() {
    }

    public Document(Long idDocument) {
        this.idDocument = idDocument;
    }

    public Long getIdDocument() {
        return idDocument;
    }

    public void setIdDocument(Long idDocument) {
        this.idDocument = idDocument;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFirstSurname() {
        return firstSurname;
    }

    public void setFirstSurname(String firstSurname) {
        this.firstSurname = firstSurname;
    }

    public String getSecondSurname() {
        return secondSurname;
    }

    public void setSecondSurname(String secondSurname) {
        this.secondSurname = secondSurname;
    }

    public String getCitizenId() {
        return citizenId;
    }

    public void setCitizenId(String citizenId) {
        this.citizenId = citizenId;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getBloodRh() {
        return bloodRh;
    }

    public void setBloodRh(String bloodRh) {
        this.bloodRh = bloodRh;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getReadingDate() {
        return readingDate;
    }

    public void setReadingDate(String readingDate) {
        this.readingDate = readingDate;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public Users getUserName() {
        return userName;
    }

    public void setUserName(Users userName) {
        this.userName = userName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDocument != null ? idDocument.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Document)) {
            return false;
        }
        Document other = (Document) object;
        if ((this.idDocument == null && other.idDocument != null) || (this.idDocument != null && !this.idDocument.equals(other.idDocument))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.venko.almacen.entities.Document[ idDocument=" + idDocument + " ]";
    }
    
}
