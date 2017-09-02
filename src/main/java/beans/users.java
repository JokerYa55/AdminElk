/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author vasil
 */
@XmlRootElement(name = "user")
@XmlType(propOrder = {"id", "first_name", "second_name", "third_name"})
public class users {

    Long id;
    private String first_name;
    private String second_name;
    private String third_name;

    @Override
    public String toString() {
        return "users{" + "id=" + id + ", first_name=" + first_name + ", second_name=" + second_name + ", third_name=" + third_name + '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public String getThird_name() {
        return third_name;
    }

    public void setThird_name(String third_name) {
        this.third_name = third_name;
    }

}
