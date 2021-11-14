package Kata5P2.model;

public class Mail {
    private final String mail;
    
    public Mail(String mail){
        this.mail = mail;
    }
    
    public String getDomain(){
        return this.mail;
    }
}
