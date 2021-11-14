package Kata5P2.view;

import java.util.List;
import Kata5P2.model.Histogram;
import Kata5P2.model.Mail;


public class MailHistogramBuilder {
    public static Histogram<String> build(List<Mail> emailList){
        Histogram<String> emailHistogram = new Histogram<String>();
        
        for (Mail mail : emailList) {
            emailHistogram.increment(mail.getDomain());
        }
        
        return emailHistogram;
    }
}
