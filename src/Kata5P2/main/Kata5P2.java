package Kata5P2.main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import Kata5P2.model.*;
import Kata5P2.view.*;

public class Kata5P2 {
    private String fileName;
    private List<Mail> mailList;
    private Histogram<String> mailHisto;

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Kata5P2 executable = new Kata5P2();
        executable.setFileName("KATA5.db");
        executable.execute();
        
    }
    
    
    public void execute() throws IOException{
        this.input();
        this.process();
        this.output();
    }

    public void setFileName(String fileName){
        this.fileName = fileName;
    }
    
    private void input() throws IOException{
        this.mailList = MailListReaderBD.read(this.fileName);
    }
    
    
    private void process(){
        this.mailHisto = MailHistogramBuilder.build(this.mailList);
    }
    
    private void output(){
        new HistogramDisplay(this.mailHisto).execute();
    }
    
}