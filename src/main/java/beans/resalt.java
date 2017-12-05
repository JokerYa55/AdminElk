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
@XmlRootElement(name = "response")
public class resalt {

    /*
     <response resultCode ="36" 
            resultComment="Пользователь petrov существует"/>
     */
    private String resultCode;
    private String resultComment;
    //private String lastCommand;

    public resalt() {
    }

    @XmlAttribute
    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    @XmlAttribute
    public String getResultComment() {
        return resultComment;
    }

    public void setResultComment(String resultComment) {
        this.resultComment = resultComment;
    }

//    @XmlAttribute
//    public String getLastCommand() {
//        return lastCommand;
//    }
//
//    public void setLastCommand(String lastCommand) {
//        this.lastCommand = lastCommand;
//    }

    @Override
    public String toString() {
        return "resalt{" + "resultCode=" + resultCode + ", resultComment=" + resultComment + '}';
    }

}
