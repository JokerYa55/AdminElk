/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.Date;
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
    private int resultCode;
    private String resultComment;
    private Date dateTime;

    
    
    @XmlAttribute(name = "resultCode")
    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    @XmlAttribute(name = "resultComment")
    public String getResultComment() {
        return resultComment;
    }

    public void setResultComment(String resultComment) {
        this.resultComment = resultComment;
    }

    @Override
    public String toString() {
        return "resalt{" + "resultCode=" + resultCode + ", resultComment=" + resultComment + '}';
    }

    @XmlAttribute(name = "dateTime")
    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

}
