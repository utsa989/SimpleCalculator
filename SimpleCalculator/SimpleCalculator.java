

package simple.calculator;
 
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;  
import javax.swing.JTextArea;
import javax.swing.border.Border;


public class SimpleCalculator implements ActionListener{
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JTextArea textarea = new JTextArea(2,10);
    
    JButton icon1 =new JButton();
    JButton icon2 =new JButton();
    JButton icon3 =new JButton();
    JButton icon4 =new JButton();
    JButton icon5 =new JButton();
    JButton icon6 =new JButton();
    JButton icon7 =new JButton();
    JButton icon8 =new JButton();
    JButton icon9 =new JButton();
    JButton icon0 =new JButton();
  
    JButton iconadd =new JButton();
    JButton iconsub =new JButton();
    JButton iconmul =new JButton();
    JButton icondiv =new JButton();
    JButton iconclear =new JButton();
    JButton icondot =new JButton();
    JButton iconequal =new JButton();
    
    double digit1,digit2,result;
    int add=0,mul=0,div=0,sub=0;
    
    public SimpleCalculator(){
        frame.setSize(350,370);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setTitle("Calculator ");
        
        frame.setResizable(false);
        frame.add(panel);
        panel.setBackground(Color.LIGHT_GRAY);
        Border border = BorderFactory.createLineBorder(Color.GRAY,2);
        panel.setBorder(border);
        
        panel.add(textarea);
        
        textarea.setBackground(Color.BLACK);
        Border tborder = BorderFactory.createLineBorder(Color.BLUE,4);
        textarea.setBorder(tborder);
        Font font = new Font("arial",Font.BOLD,33);
        textarea.setFont(font);
        textarea.setForeground(Color.WHITE);
        
        textarea.setPreferredSize(new Dimension(2,10));
        textarea.setLineWrap(true);
        
        icon1.setPreferredSize(new Dimension(70,42));
        icon1.setIcon(new ImageIcon("C:\\Users\\Imranul Hassan Akib\\Downloads\\Icon1.png "));
        icon2.setPreferredSize(new Dimension(70,42));
        icon2.setIcon(new ImageIcon("C:\\Users\\Imranul Hassan Akib\\Downloads\\Icon2.png"));
        icon3.setPreferredSize(new Dimension(70,42));
        icon3.setIcon(new ImageIcon("C:\\Users\\Imranul Hassan Akib\\Downloads\\Icon3.png"));
        icon4.setPreferredSize(new Dimension(70,42));
        icon4.setIcon(new ImageIcon("C:\\Users\\Imranul Hassan Akib\\Downloads\\Icon4.png"));
        icon5.setPreferredSize(new Dimension(70,42));
        icon5.setIcon(new ImageIcon("C:\\Users\\Imranul Hassan Akib\\Downloads\\Icon5.png"));
        icon6.setPreferredSize(new Dimension(70,42));
        icon6.setIcon(new ImageIcon("C:\\Users\\Imranul Hassan Akib\\Downloads\\Icon6.png"));
        icon7.setPreferredSize(new Dimension(70,42));
        icon7.setIcon(new ImageIcon("C:\\Users\\Imranul Hassan Akib\\Downloads\\Icon7.png"));
        icon8.setPreferredSize(new Dimension(70,42));
        icon8.setIcon(new ImageIcon("C:\\Users\\Imranul Hassan Akib\\Downloads\\Icon8.png"));
        icon9.setPreferredSize(new Dimension(70,42));
        icon9.setIcon(new ImageIcon("C:\\Users\\Imranul Hassan Akib\\Downloads\\Icon9.png"));
        icon0.setPreferredSize(new Dimension(70,42));
        icon0.setIcon(new ImageIcon("C:\\Users\\Imranul Hassan Akib\\Downloads\\Icon0.png"));
        
        icondot.setPreferredSize(new Dimension(70,42));
        icondot.setIcon(new ImageIcon("C:\\Users\\Imranul Hassan Akib\\Downloads\\Icondot.png"));
        iconsub.setPreferredSize(new Dimension(70,42));
        iconsub.setIcon(new ImageIcon("C:\\Users\\Imranul Hassan Akib\\Downloads\\Iconsub.png"));
        iconmul.setPreferredSize(new Dimension(70,42));
        iconmul.setIcon(new ImageIcon("C:\\Users\\Imranul Hassan Akib\\Downloads\\Iconmul.png"));
        icondiv.setPreferredSize(new Dimension(70,42));
        icondiv.setIcon(new ImageIcon("C:\\Users\\Imranul Hassan Akib\\Downloads\\Icondiv.png"));
        iconadd.setPreferredSize(new Dimension(70,42));
        iconadd.setIcon(new ImageIcon("C:\\Users\\Imranul Hassan Akib\\Downloads\\Iconadd.png"));
        iconequal.setPreferredSize(new Dimension(70,42));
        iconequal.setIcon(new ImageIcon("C:\\Users\\Imranul Hassan Akib\\Downloads\\Iconequal.png"));
        iconclear.setPreferredSize(new Dimension(70,42));
        iconclear.setIcon(new ImageIcon("C:\\Users\\Imranul Hassan Akib\\Downloads\\Iconac.png"));
        
        
        panel.add(icon7);
        panel.add(icon8);
        panel.add(icon9);
        panel.add(icondiv);
        panel.add(icon4);
        panel.add(icon5);
        panel.add(icon6);
        panel.add(iconmul);
        panel.add(icon1);
        panel.add(icon2);
        panel.add(icon3);
        panel.add(iconsub);
        panel.add(icon0);
        panel.add(icondot);
        panel.add(iconequal);
        panel.add(iconadd);
        panel.add(iconclear);
        
        icon1.addActionListener((ActionListener) this);
        icon2.addActionListener((ActionListener) this);
        icon3.addActionListener((ActionListener) this);
        icon4.addActionListener((ActionListener) this);
        icon5.addActionListener((ActionListener) this);
        icon6.addActionListener((ActionListener) this);
        icon7.addActionListener((ActionListener) this);
        icon8.addActionListener((ActionListener) this);
        icon9.addActionListener((ActionListener) this);
        icon0.addActionListener((ActionListener) this);
        iconadd.addActionListener((ActionListener) this);
        iconsub.addActionListener((ActionListener) this);
        iconmul.addActionListener((ActionListener) this);
        icondiv.addActionListener((ActionListener) this);
        iconclear.addActionListener((ActionListener) this);
        icondot.addActionListener((ActionListener) this);
        iconequal.addActionListener((ActionListener) this);
      
    }
    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();
        if(source==iconclear){
            digit1=0.0;
            digit2=0.0;
            textarea.setText(" ");
        }
        if(source==icon1){
            textarea.append("1");
        }
        if(source==icon2){
            textarea.append("2");
        }
        if(source==icon3){
            textarea.append("3");
        }
        if(source==icon4){
            textarea.append("4");
        }
        if(source==icon5){
            textarea.append("5");
        }
        if(source==icon6){
            textarea.append("6");
        }
        if(source==icon7){
            textarea.append("7");
        }
        if(source==icon8){
            textarea.append("8");
        }
        if(source==icon9){
            textarea.append("9");
        }
        if(source==icon0){
            textarea.append("0");
        }
        if(source==icondot){
            textarea.append(".");
        }
         
        if(source==iconadd){
            digit1=digit_reader();
            textarea.setText(" ");
            add=1;
            div=0;
            sub=0;
            mul=0;
        }
        if(source==iconmul){
            digit1=digit_reader();
            textarea.setText(" ");
            add=0;
            div=0;
            sub=0;
            mul=1;
        }
        if(source==icondiv){
            digit1=digit_reader();
            textarea.setText(" ");
            add=0;
            div=1;
            sub=0;
            mul=0;
        }
        if(source==iconsub){
            digit1=digit_reader();
            textarea.setText(" ");
            add=0;
            div=0;
            sub=1;
            mul=0;
        }
        if(source==iconequal){
            digit2=digit_reader();
            if(add>0){
                result = digit1+digit2;
                textarea.setText(Double.toString(result));
            }
            if(sub>0){
                result = digit1-digit2;
                textarea.setText(Double.toString(result));
            }
            if(mul>0){
                result = digit1*digit2;
                textarea.setText(Double.toString(result));
            }
            if(div>0){
                result = digit1/digit2;
                textarea.setText(Double.toString(result));
            }
        }    
    }
    public double digit_reader(){
        double number1;
        String s;
        s=textarea.getText();
        number1=Double.valueOf(s);
        return number1;
    }
    
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
         
    }
    
}
