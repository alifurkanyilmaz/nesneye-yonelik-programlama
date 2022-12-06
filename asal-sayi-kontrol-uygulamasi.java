package java2017;

import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class firstApplication implements WindowListener, ActionListener{
    Frame a;
    Panel b;
    TextField t;
    Button d;
    Label textAlani;
    
    
    public firstApplication() {
        a = new Frame();
        b = new Panel();
        t = new TextField(20);

        b.add(t);
        
        String butonYazisi = "KONTROL";
        d = new Button(butonYazisi);
        b.add(d);
        
        textAlani = new Label("Lütfen yukarıdaki kutucuğa bir sayı gir", Label.CENTER);
        textAlani.setForeground(Color.WHITE);   
        b.add(textAlani);
        
        b.setBackground(new Color(52,73,94));
        a.add(b);
        d.addActionListener(this);
        a.addWindowListener(this);
        a.pack();
        a.setSize(400,100);
        a.setResizable(false);
        a.setVisible(true);
    }
    
    public static void main(String args[])
    {
        firstApplication uygulama = new firstApplication();
        
    }
    
    public void actionPerformed(ActionEvent e) {
        String s = t.getText();
        //System.out.println(s);
        
        Scanner kontrol = new Scanner(s);
        int sayi = kontrol.nextInt();
        int sayac = 0;
        
        for(int i = 2; i<sayi; i++) {
            if(sayi % i == 0) {
                sayac++;
            }
        }
        if(sayi < 0) {
            textAlani.setText("Negatif sayı giremezsin.");
            textAlani.setForeground(new Color(189,195,199));
        }else if(sayi == 1) {
        	textAlani.setText(t.getText()+ " ASAL SAYI DEĞİLDİR.");
            textAlani.setForeground(new Color(250,105,90));
        }else if(sayi == 0) {
        	textAlani.setText(t.getText()+ " rakamını giremezsin.");
        	textAlani.setForeground(new Color(189,195,199));
        }else {
	        if(sayac == 0) {
	            textAlani.setText(t.getText()+ " ASAL SAYIDIR.");
	            textAlani.setForeground(new Color(46,204,113));
	            
	        }else {
	            textAlani.setText(t.getText()+ " ASAL SAYI DEĞİLDİR.");
	            textAlani.setForeground(new Color(250,105,90));
	        }        
        }
    }
    
    public void windowOpened(WindowEvent e) {}
    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }
    public void windowClosed(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
}
