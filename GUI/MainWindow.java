import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

  private CustomLabel1 label1;
  private CustomLabel2 label2;
  private CustomButton1 button3;
  private CustomButton2 button4;
  private CustomButton3 button5;
  private CustomLabel3 label6;

  public MainWindow() {
    setTitle("MainWindow");
    setSize(1366, 768);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    getContentPane().setBackground(new Color(2, 10, 69));
    setLayout(null);

    label1 = new CustomLabel1();
    label1.setBounds(479, 87, 392, 118);
    this.add(label1);

    label2 = new CustomLabel2();
    label2.setBounds(376, 194, 605, 45);
    this.add(label2);

    button3 = new CustomButton1();
    button3.setBounds(555, 349, 226, 47);
    this.add(button3);

    button4 = new CustomButton2();
    button4.setBounds(555, 429, 226, 47);
    this.add(button4);

    button5 = new CustomButton3();
    button5.setBounds(555, 509, 226, 47);
    this.add(button5);

    label6 = new CustomLabel3();
    label6.setBounds(11, 676, 120, 46);
    this.add(label6);

    setLocationRelativeTo(null);
  }
  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
      MainWindow frame = new MainWindow();
      frame.setVisible(true);
    });
  }
}
