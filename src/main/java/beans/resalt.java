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
@XmlRootElement(name = "result")
public class resalt {
    /*
     <response resultCode ="36" 
            resultComment="Пользователь petrov существует"/>
    */
    @XmlAttribute(name = "resultCode")
    int resultCode;
    @XmlAttribute(name = "resultComment")
    String resultComment;
}
