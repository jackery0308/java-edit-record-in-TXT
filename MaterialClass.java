/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author PANG
 */
public class Material extends Product{
    private String proid,maid,mabody,madisc,macover,pin,macon,mapressure,approval;
    public Material(String proid,String maid,String mabody, String madisc,String macover,String pin,String macon,String mapressure,String approval){
        this.proid=proid;
        this.maid=maid;
        this.mabody=mabody;
        this.madisc=madisc;
        this.macover=macover;
        this.pin=pin;
        this.macon=macon; 
        this.mapressure=mapressure;
        this.approval=approval;
        
    }
    public Material(String maid){
        this.maid=maid;
    }
    public Material(){
        
    }
   
    @Override
     public void write(){
         try
        {
            BufferedReader br=new BufferedReader(new FileReader("Material.txt"));
          Scanner x = new Scanner (new File("Material.txt"));
          int count=1;
          while (br.readLine()!=null){
              count+=1;
          }
        FileWriter fw = new FileWriter("Material.txt",true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(bw);
        pw.println(proid+","+"MA"+count+","+madisc+","+mabody+","+ macover +","+pin+","+macon+","+mapressure+","+approval);
        pw.flush();
        pw.close();
        JOptionPane.showMessageDialog(null,"Successfully Create Material.");
      }
      catch (Exception e)
      {
          JOptionPane.showMessageDialog(null,"Invalid File.","Error",JOptionPane.ERROR_MESSAGE);
      }
    }
     
      public String checkma(){
          //proid,maid,mabody,madisc,macover,macon,mapressure,approval
               String Proid=""; String Maid="" ;String Mabody=""; String Madisc=""; String Macover=""; String Pin="";String Macon=""; String Mapressure=""; String Approval="";
          try
        {
          BufferedReader br=new BufferedReader(new FileReader("Material.txt"));
                  String reader;
                Scanner x = new Scanner (new File("Material.txt"));
                x.useDelimiter("[,\n]");
                while (x.hasNext()){
                    Proid=x.next();
                    Maid=x.next();
                    Mabody=x.next();
                    Madisc=x.next();
                    Macover=x.next();
                    Pin=x.next();
                    Macon=x.next();
                    Mapressure=x.next();
                    Approval=x.next();
                    System.out.println(Maid+","+maid);
                    if (Maid.equals(maid))
                    {
                       return Proid+","+Madisc+","+Mabody+","+Macover+","+Pin+","+Macon+","+Mapressure+","+Approval;
                    }   
                }
                x.close();       
               return "Fail";
         
        }
        catch(FileNotFoundException ex)
        {
        Logger.getLogger(Product .class.getName()).log(Level.SEVERE, null, ex);
        return "GG";
        
        }
        catch(IOException ex)
        {
        Logger.getLogger(Product.class.getName()).log(Level.SEVERE ,null, ex);
        return "GG";
        }
    }
      
      
    @Override
       public void del(){
        String tempfile= "temp.txt";
        File oldfile =new File("Material.txt");
        File newfile =new File(tempfile);
         String Proid=""; String Maid="" ;String Mabody=""; String Madisc=""; String Macover=""; String Macon="";String Pin=""; String Mapressure=""; String Approval="";
         try
        {
                FileWriter rd=new FileWriter (tempfile,false);
                BufferedWriter bw= new BufferedWriter(rd);
                PrintWriter pw=new PrintWriter(bw);
                Scanner x = new Scanner (new File("Material.txt"));
                x.useDelimiter("[,\n]");
                while (x.hasNext()){
                 Proid=x.next();
                    Maid=x.next();
                    Mabody=x.next();
                    Madisc=x.next();
                    Macover=x.next();
                    Pin=x.next();
                    Macon=x.next();
                    Mapressure=x.next();
                    Approval=x.next();
                    
                    if (!Maid.equals(maid))
                    {
                        pw.println(Proid+","+Maid+","+Mabody+","+Madisc+","+Macover+","+Pin+","+Macon+","+Mapressure+","+Approval);
                    }
                }
                x.close();
                pw.flush();
                pw.close();
                Scanner y = new Scanner (new File(tempfile));
                FileWriter fw= new FileWriter("Material.txt",false);
                BufferedWriter bb=new BufferedWriter(fw);
                PrintWriter pp=new PrintWriter(bb);
                while (y.hasNext()){
                    pp.println(y.next());
                }
                y.close();
                pp.flush();
                pp.close();
                 JOptionPane.showMessageDialog(null,"Successfully Delete Material.");
                
                                    
                  
                  
        }    

        catch(FileNotFoundException ex)
        {
        Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null,"Invalid File.","Error",JOptionPane.ERROR_MESSAGE);
        
        }
        catch(IOException ex)
        {
        Logger.getLogger(Admin.class.getName()).log(Level.SEVERE ,null, ex);
        JOptionPane.showMessageDialog(null,"Invalid File.","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
       
       
    @Override
        public void update(){
          String filepath= "Material.txt";
        String tempfile= "temp.txt";
        File oldfile =new File(filepath);
        File newfile =new File(tempfile);
    String Proid=""; String Maid="" ;String Mabody=""; String Madisc=""; String Macover=""; String Pin="";String Macon=""; String Mapressure=""; String Approval="";
         try
        {
                FileWriter rd=new FileWriter (tempfile,false);
                BufferedWriter bw= new BufferedWriter(rd);
                PrintWriter pw=new PrintWriter(bw);
                Scanner x = new Scanner (new File(filepath));
                x.useDelimiter("[,\n]");
                while (x.hasNext()){
                    Proid=x.next();
                    Maid=x.next();
                    Mabody=x.next();
                    Madisc=x.next();
                    Macover=x.next();
                    Pin=x.next();
                    Macon=x.next();
                    Mapressure=x.next();
                    Approval=x.next();
                    
                    
                    if (Maid.equals(maid))
                    {
                       pw.println(proid+","+maid+","+mabody+","+madisc+","+macover+","+pin+","+macon+","+mapressure+","+approval);
                       
                    }
                    else
                   {                        
                      pw.println(Proid+","+Mabody+","+Maid+","+Madisc+","+Macover+","+Pin+","+Macon+","+Mapressure+","+Approval);
                   }
                }
                x.close();
                pw.flush();
                pw.close();
                Scanner y = new Scanner (new File(tempfile));
                FileWriter fw= new FileWriter(filepath,false);
                BufferedWriter bb=new BufferedWriter(fw);
                PrintWriter pp=new PrintWriter(bb);
                while (y.hasNext()){
                    pp.println(y.next());
                }
                y.close();
                pp.flush();
                pp.close();
                 JOptionPane.showMessageDialog(null,"Successfully Update Product.");
                
                  
        }    
        catch(FileNotFoundException ex)
        {
        Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
         JOptionPane.showMessageDialog(null,"Invalid File.","Error",JOptionPane.ERROR_MESSAGE);
        
        }
        catch(IOException ex)
        {
        Logger.getLogger(Admin.class.getName()).log(Level.SEVERE ,null, ex);
        JOptionPane.showMessageDialog(null,"Invalid File.","Error",JOptionPane.ERROR_MESSAGE);
        }
 
    }
    
}
