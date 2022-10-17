package hello;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.beans.*;
import java.io.Serializable;
import java.time.LocalTime;  

/**
 *
 * @author viter
 */
public class MessageBean implements Serializable {
     
    private String aut;
    private String lang;
    private String msg;
    private String msg2;
        
    public MessageBean() {
    }
    
    public String getAut() {
        return "José Viterbo";
    }
    
    public void setLang(String value) {
        lang = value;
    }
    
    public String getMsg() {
        LocalTime time = LocalTime.now();
        if (time.getHour() >= 5 && time.getHour() < 12) {
            return getAuxMsg();
        } else if (time.getHour() >= 12 && time.getHour() < 18) {
            return getAuxMsg2();
        }
        return getAuxMsg3();
    }
    public String getMsg2() {
        switch (this.lang){
            case "pt":
                return "Elaborado por";
            case "en":
                return "Created by";
            case "de":
                return "Erstellt von";
            case "fr":
                return "Créé par";
        }
        return "";
    }
    public String getAuxMsg() {
        switch (this.lang){
            case "pt":
                return "Bom dia";
            case "en":
                return "Good morning";
            case "de":
                return "Guten morgen";
            case "fr":
                return "Bonjour";
        }
        return "";
    }
    public String getAuxMsg2() {
        switch (this.lang){
            case "pt":
                return "Boa tarde";
            case "en":
                return "Good afternoon";
            case "de":
                return "Guten nachmittag";
            case "fr":
                return "Bon après-midi";
        }
        return "";
    }
    public String getAuxMsg3() {
        switch (this.lang){
            case "pt":
                return "Boa noite";
            case "en":
                return "Good evening";
            case "de":
                return "Guten abend";
            case "fr":
                return "Bonsoir";
        }
        return "";
    }
}
