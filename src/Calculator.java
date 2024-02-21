import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Math.sqrt;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame implements ActionListener {

   private JMenu menu;
   private JMenuBar bar;
   private JMenuItem i1, i2;
   private JTextField field1;
   JTextField field2;
   private JButton t, br0, b1, b2, b3, b4, br1, br2,
         br3, br4, br5, br6, br7, br8, br9, eq,
         sqr, a2, clear;
   private JLabel l1, l2;
   private JPanel p, p2;
   public double x = 0;
   public double temp = 1;
   public String znak = "";
   public int bool = 0;

   public Calculator() {

      super("Calculator");
      setSize(400, 290);
      this.setResizable(false);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new BorderLayout());
      bar = new JMenuBar();
      add(bar, "North");
      bar.setBackground(Color.gray);
      menu = new JMenu("Menu");
      menu.setForeground(Color.white);
      bar.add(menu);
      i1 = new JMenuItem("EXIT");
      i2 = new JMenuItem("CLEAR");
      menu.add(i2);
      menu.add(i1);
      p = new JPanel();
      p.setLayout(new FlowLayout());
      add(p);
      l1 = new JLabel("INPUT: ");
      l1.setForeground(Color.WHITE);
      l2 = new JLabel("Error: ");
      l2.setForeground(Color.WHITE);
      field1 = new JTextField(30);
      field2 = new JTextField(30);
      i2.addActionListener(this);
      field2.setEditable(false);
      i1.addActionListener(this);
      p.add(l1);
      p.add(field1);
      p.add(l2);
      p.add(field2);

      l2.setVisible(false);
      field2.setVisible(false);
      p.setBackground(Color.GRAY);
      p2 = new JPanel();
      add(p2, "South");

      p2.setLayout(new GridLayout(4, 3, 10, 10));
      p2.setBackground(Color.GRAY);
      b1 = new JButton("+");
      b1.addActionListener(this);
      b2 = new JButton("-");
      b2.addActionListener(this);
      b3 = new JButton("*");
      b3.addActionListener(this);
      b4 = new JButton("/");
      b4.addActionListener(this);

      p.add(b1);
      p.add(b2);
      p.add(b3);
      p.add(b4);

      a2 = new JButton("x*x");
      sqr = new JButton("√");
      p.add(a2);
      p.add(sqr);

      eq = new JButton("=");
      eq.addActionListener(this);
      a2.addActionListener(this);
      sqr.addActionListener(this);

      clear = new JButton("C");
      p.add(clear);
      clear.setBackground(new Color(137, 207, 240));
      clear.addActionListener(this);

      br1 = new JButton("1");
      br2 = new JButton("2");
      br3 = new JButton("3");
      br4 = new JButton("4");
      br5 = new JButton("5");
      br6 = new JButton("6");
      br7 = new JButton("7");
      br8 = new JButton("8");
      br9 = new JButton("9");
      br0 = new JButton("0");
      t = new JButton(".");
      p2.add(br1);
      br1.addActionListener(this);
      p2.add(br2);
      br2.addActionListener(this);
      p2.add(br3);
      br3.addActionListener(this);
      p2.add(br4);
      br4.addActionListener(this);
      p2.add(br5);
      br5.addActionListener(this);
      p2.add(br6);
      br6.addActionListener(this);
      p2.add(br7);
      br7.addActionListener(this);
      p2.add(br8);
      br8.addActionListener(this);
      p2.add(br9);
      br9.addActionListener(this);
      br0.addActionListener(this);
      p2.add(br0);
      t.addActionListener(this);
      p2.add(t);
      p2.add(eq);

      t.setBackground(new Color(137, 207, 240));
      eq.setBackground(new Color(137, 207, 240));
      b1.setBackground(new Color(137, 207, 240));
      b2.setBackground(new Color(137, 207, 240));
      b3.setBackground(new Color(137, 207, 240));
      b4.setBackground(new Color(137, 207, 240));
      a2.setBackground(new Color(137, 207, 240));
      sqr.setBackground(new Color(137, 207, 240));
      br0.setBackground(new Color(137, 207, 240));
      br1.setBackground(new Color(137, 207, 240));
      br2.setBackground(new Color(137, 207, 240));
      br3.setBackground(new Color(137, 207, 240));
      br4.setBackground(new Color(137, 207, 240));
      br5.setBackground(new Color(137, 207, 240));
      br6.setBackground(new Color(137, 207, 240));
      br7.setBackground(new Color(137, 207, 240));
      br8.setBackground(new Color(137, 207, 240));
      br9.setBackground(new Color(137, 207, 240));
      setVisible(true);
   }

   public void check() {
      try {
         x = Double.parseDouble(field1.getText());
      } catch (NumberFormatException e) {
         l2.setVisible(true);
         field2.setVisible(true);
         field2.setText("Wrong input, press Clear!");
         x = 0;
         temp = 1;
         bool = 1;
         field1.setText("");
      } catch (Exception e) {
         field2.setText("HUH?");
      }
   }

   public void actionPerformed(ActionEvent a) {
      String text = a.getActionCommand();

      if (text.equals("EXIT")) {
         System.exit(0);
      } else if (text.equals("CLEAR")) {
         field1.setText("");
         field2.setVisible(false);
         l2.setVisible(false);
         bool = 0;

      } else if (text.equals("1")) {
         field1.setText(field1.getText() + "1");
         check();

      } else if (text.equals("2")) {
         field1.setText(field1.getText() + "2");
         check();

      } else if (text.equals("3")) {
         field1.setText(field1.getText() + "3");
         check();

      } else if (text.equals("4")) {
         field1.setText(field1.getText() + "4");
         check();

      } else if (text.equals("5")) {
         field1.setText(field1.getText() + "5");
         check();

      } else if (text.equals("6")) {
         field1.setText(field1.getText() + "6");
         check();

      } else if (text.equals("7")) {
         field1.setText(field1.getText() + "7");
         check();

      } else if (text.equals("8")) {
         field1.setText(field1.getText() + "8");
         check();

      } else if (text.equals("9")) {
         field1.setText(field1.getText() + "9");
         check();

      } else if (text.equals("0")) {
         field1.setText(field1.getText() + "0");
         check();
      } else if (text.equals(".")) {
         field1.setText(field1.getText() + ".");
      } else if (text.equals("+")) {
         znak = "+";
         check();
         temp = x;
         field1.setText("");

      } else if (text.equals("-")) {
         if (field1.getText().equals("")) {
            field1.setText("-");
         } else {
            znak = "-";
            check();
            temp = x;
            field1.setText("");
         }

      } else if (text.equals("*")) {
         znak = "*";
         check();
         temp = x;
         field1.setText("");

      } else if (text.equals("/")) {
         znak = "/";
         check();
         temp = x;
         field1.setText("");

      } else if (text.equals("x*x")) {
         check();
         x = x * x;
         field1.setText(Double.toString(x));

      } else if (text.equals("√")) {
         try {
            check();
            if (x < 0) {
               throw new NegativeNumberException();
            }
            x = sqrt(x);
            field1.setText(Double.toString(x));
         } catch (NegativeNumberException e) {
            l2.setVisible(true);
            field2.setVisible(true);
            field2.setText("Negative number error!");
            x = 0;
            temp = 1;
         } catch (Exception e) {
            field2.setText("Unexpected exception.");
         }
      } else if (text.equals("=")) {
         check();
         try {
            switch (znak) {
               case "+":
                  x = temp + x;
                  break;
               case "-":
                  x = temp - x;
                  break;
               case "*":
                  x = temp * x;
                  break;
               case "/":
                  if (x == 0) {
                     throw new DivisionByZero();
                  }
                  x = temp / x;
                  break;
               default:
                  break;
            }
            if (bool == 0) {
               field1.setText(Double.toString(x));
            } else {
               field1.setText("");
            }
         } catch (DivisionByZero e) {
            field2.setVisible(true);
            l2.setVisible(true);
            field1.setText("");
            field2.setText("Division by zero error!");
            x = 0;
            temp = 1;
         } catch (NullPointerException e) {
            field2.setVisible(true);
            l2.setVisible(true);
            field2.setText("Input is empty.");
         } catch (Exception e) {
            field2.setVisible(true);
            l2.setVisible(true);
            field2.setText("Exception!");
         }
         znak = "";
      } else if (text.equals("C")) {
         field1.setText("");
         field2.setVisible(false);
         l2.setVisible(false);
         bool = 0;
      }
   }

   private class NegativeNumberException extends Exception {

      public NegativeNumberException() {
         field2.setText("Negative Number Exception.");
      }
   }

   public class DivisionByZero extends Exception {

      public DivisionByZero() {
         field2.setText("Division by zero not possible.");
      }

      public DivisionByZero(String m) {
         field2.setText(m);
      }
   }

   public static void main(String[] args) {
      new Calculator();
   }

}