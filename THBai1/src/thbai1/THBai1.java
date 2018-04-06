/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thbai1;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import thbai1.THBai1.LangNgheCong.LangNgheTru;

/**
 *
 * @author chauvo
 */

public class THBai1 extends Frame{

    /**
     * @param args the command line arguments
     */
    Button btnA, btnB, btnKetQua, btnCong, btnTru, btnNhan, btnChia;
    TextField txtA, txtB, txtKetQua;
    public THBai1(){
        //Frame();
        setTitle("vi du");
        setSize(400,200);
        
        FlowLayout lay = new FlowLayout();
        
        setLayout(lay); // f.setLayout( new FlowLayout());
        
        // tạo điều khiển/ đối tượng hộp văn bản
         btnA = new Button("A");
        add(btnA);
         txtA = new TextField(20);
        
        // gắn vào frame
        add(txtA);
         btnB = new Button("B");
        add(btnB);
         txtB = new TextField(20);
        add(txtB);
        
         btnCong = new Button("+");
        
        btnCong.addActionListener(new LangNgheCong());
        add(btnCong);
        
        btnTru = new Button("-");
        btnTru.addActionListener(new LangNgheTru());    
        add(btnTru);
        
           
        btnNhan = new Button("x");
         btnNhan.addActionListener(new LangNgheNhan());    
        add(btnNhan);
        
         btnChia = new Button("/");
         btnChia.addActionListener(new LangNgheChia());    

        add(btnChia);
        
        txtKetQua = new TextField(20);
        add(txtKetQua);
        
        btnKetQua = new Button("Ket qua");
        add(btnKetQua);
        
         
        
        SuKienCuaSo BoLangNghe = new SuKienCuaSo();
        
        addWindowListener( BoLangNghe);
        setVisible(true);
        
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
         new THBai1();
        
    }
    // xây dựng lớp nội (bộ lắng nghe) xử lí các sự kiện cửa sổ)
     class SuKienCuaSo implements WindowListener {

        @Override
        public void windowOpened(WindowEvent e) {
           // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowClosing(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); 
            System.exit(0);
//To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowClosed(WindowEvent e) {
           // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowIconified(WindowEvent e) {
          //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
            //throw new UnsupportedOperationException(
            }

        @Override
        public void windowActivated(WindowEvent e) {
           // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
           // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    class LangNgheCong implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int a = Integer.parseInt(txtA.getText());
        
        int b = Integer.parseInt(txtB.getText());
        
        int Tong = a + b;
        
        txtKetQua.setText(String.valueOf(Tong));
         
        }

        class LangNgheTru {

            public LangNgheTru() {
            }
        }
    } 
    class LangNgheTru implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int a = Integer.parseInt(txtA.getText());
        
        int b = Integer.parseInt(txtB.getText());
        
        int Tru = a - b;
        
        txtKetQua.setText(String.valueOf(Tru));
         
        }
     }
         class LangNgheNhan implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int a = Integer.parseInt(txtA.getText());
        
        int b = Integer.parseInt(txtB.getText());
        
        int Nhan = a * b;
        
        txtKetQua.setText(String.valueOf(Nhan));
         
        }
     }
          class LangNgheChia implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int a = Integer.parseInt(txtA.getText());
        
        int b = Integer.parseInt(txtB.getText());
        
        int Chia = a / b;
        
        txtKetQua.setText(String.valueOf(Chia));
         
        }
        
  }
    
}
