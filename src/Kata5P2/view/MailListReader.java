package Kata5P2.view;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import Kata5P2.model.Mail;

public class MailListReader {
    public static List<Mail> read(String fileName) throws FileNotFoundException, IOException{
        List<Mail> result = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String[] aux;
            for(String line; (line = br.readLine()) != null; ) {
                aux = line.split("@");
                if (aux.length == 2){
                    result.add(new Mail(aux[1]));
                }
            }
        }
        
        return result;
    }
}

        