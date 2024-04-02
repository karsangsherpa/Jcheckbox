import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MyFrame extends JFrame implements ActionListener{
    JButton button;
    JCheckBox checkBox;
    ImageIcon image;
MyFrame() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new FlowLayout());

    button = new JButton();
    button.setText("Submit haita");
    button.addActionListener(this);




checkBox = new JCheckBox();
checkBox.setText("I'm not a robot broski");
checkBox.setFocusable(false);
checkBox.setFont(new Font("insolas", Font.PLAIN, 35));
checkBox.setIcon(image);

    this.add(checkBox);
    this.add(button);
    this.pack();
    this.setVisible(true);
}

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
        System.out.println(checkBox.isSelected());
        
        }
    }

}
