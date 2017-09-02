/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vasil
 */

@XmlRootElement
public class users {
    Long id;
    String first_name;
    String second_name;
    String third_name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
}
