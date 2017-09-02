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
@XmlRootElement(name = "request")
public class user1 {

    //(name = "user")
    private String user;
    //@XmlAttribute(name = "surname")
    private String surname;
    //@XmlAttribute(name = "name")
    private String name;
    //@XmlAttribute(name = "patronymic")
    private String patronymic;
    //@XmlAttribute(name = "dob")
    private String dob;
    //@XmlAttribute(name = "region")
    private int region;
    //@XmlAttribute(name = "contactEmail")
    private String email;
    
    private String phone;

    public user1() {
    }

    @XmlAttribute(name = "user")
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @XmlAttribute(name = "surname")
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @XmlAttribute(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlAttribute(name = "patronymic")
    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    @XmlAttribute(name = "dob")
    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    @XmlAttribute(name = "region")
    public int getRegion() {
        return region;
    }

    public void setRegion(int region) {
        this.region = region;
    }

    @XmlAttribute(name = "contactEmail")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @XmlAttribute(name = "contactPhone")
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
