/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vasil
 */
@XmlRootElement(name = "user1")
public class user1 {

    /*
    <request reqType="CREATE_USER" 
            user="petrov" 
            surname="Петров" 
            name="Петр" 
            patronymic="Иванович" 
            dob="1985-08-08T00:00:00+06:00" 
            region="23" 
            contactEmail="petrov@gmail.com" 
            contactPhone="9652323232" />
    
    
            <response resultCode ="36" 
            resultComment="Пользователь petrov существует"/>
     */
    @XmlAttribute(name = "user")
    private String user;
    @XmlAttribute(name = "surname")
    private String surname;
    @XmlAttribute(name = "name")
    private String name;
    @XmlAttribute(name = "patronymic")
    private String patronymic;
    @XmlAttribute(name = "dob")
    private String dob;
    @XmlAttribute(name = "region")
    private int region;
    @XmlAttribute(name = "contactEmail")
    private String email;
    @XmlAttribute(name = "contactPhone")
    private String phone;

    public user1() {
    }

    public user1(String user, String surname, String name, String patronymic, String dob, int region, String email, String phone) {
        this.user = user;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.dob = dob;
        this.region = region;
        this.email = email;
        this.phone = phone;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getRegion() {
        return region;
    }

    public void setRegion(int region) {
        this.region = region;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "user1{" + "user=" + user + ", surname=" + surname + ", name=" + name + ", patronymic=" + patronymic + ", dob=" + dob + ", region=" + region + ", email=" + email + ", phone=" + phone + '}';
    }

}