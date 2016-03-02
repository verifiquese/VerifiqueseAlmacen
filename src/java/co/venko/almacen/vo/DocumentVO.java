/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.venko.almacen.vo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class DocumentVO {

    private String user;
    private String firstName;
    private String secondName;
    private String firstSurname;
    private String secondSurname;
    private String citizenID;
    private String birthDate;
    private String bloodType;
    private String bloodRH;
    private String country;
    private String documentType;
    private String readingDate;
    private String latidud;
    private String longitud;

    public DocumentVO() {
    }

    public DocumentVO(String user, String firstName, String secondName, String firstSurname,
            String secondSurname, String citizenID, String birthDate, String bloodType, String bloodRH,
            String country, String documentType, String readingDate, String latitud, String longitud) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.firstSurname = firstSurname;
        this.secondSurname = secondSurname;
        this.citizenID = citizenID;
        this.birthDate = birthDate;
        this.bloodType = bloodType;
        this.bloodRH = bloodRH;
        this.country = country;
        this.documentType = documentType;
        this.user = user;
        this.readingDate = readingDate;
        this.latidud = latitud;
        this.longitud = longitud;
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

    public String getCitizenID() {
        return citizenID;
    }

    public void setCitizenID(String citizenID) {
        this.citizenID = citizenID;
    }

    public String getBirthDate(){
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getBloodRH() {
        return bloodRH;
    }

    public void setBloodRH(String bloodRH) {
        this.bloodRH = bloodRH;
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

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getReadingDate() {
        return readingDate;
    }

    public void setReadingDate(String readingDate) {
        this.readingDate = readingDate;
    }

    public String getLatidud() {
        return latidud;
    }

    public void setLatidud(String latidud) {
        this.latidud = latidud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

}
