import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton addBtn = new JButton();
    JButton extBtn = new JButton();
    JTextField textField = new JTextField();
    JLabel label = new JLabel();

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);

        textField.setPreferredSize(new Dimension(470,20));
        textField.setCaretColor(Color.black);

        addBtn.setText("Add");
        addBtn.setFocusable(false);
        addBtn.setSize(100,100);
        addBtn.addActionListener(this);

        extBtn.setText("Exit");
        extBtn.setFocusable(false);
        extBtn.setSize(100,100);
        extBtn.addActionListener(this);

        label.setText("Hello World");
        label.setBackground(Color.WHITE);
        label.setOpaque(true);
        label.setForeground(Color.BLACK);

        
        //-------------------------------------------- Panel Button --------------------------------------
        JPanel panelBtn = new JPanel();
        panelBtn.setBackground(Color.lightGray);
        panelBtn.setBounds(0,360,500,100);
        panelBtn.setLayout(new FlowLayout(FlowLayout.CENTER,20,30));
        panelBtn.add(addBtn);
        panelBtn.add(new JButton("Delete"));
        panelBtn.add(new JButton("Duplicate"));
        panelBtn.add(extBtn);
        //-------------------------------------------- Panel Button --------------------------------------

        //-------------------------------------------- Panel TextField --------------------------------------
        JPanel panelTxtFld = new JPanel();
        panelTxtFld.setBackground(Color.darkGray);
        panelTxtFld.setBounds(0,330,500,30);
        panelTxtFld.setLayout(new FlowLayout(FlowLayout.LEADING));
        panelTxtFld.add(textField);
        //-------------------------------------------- Panel TextField --------------------------------------

        //-------------------------------------------- Panel Label --------------------------------------
        JPanel panelLbl = new JPanel();
        panelLbl.setBackground(Color.GRAY);
        panelLbl.setBounds(0,0,500,330);
        panelLbl.setLayout(new GridLayout(11,1,5,5));
        panelLbl.add(label);
        panelLbl.add(new JLabel("Label 1"));
        panelLbl.add(new JLabel("Label 2"));
        panelLbl.add(new JLabel("Label 3"));
        panelLbl.add(new JLabel("Label 4"));
        panelLbl.add(new JLabel("Label 5"));
        panelLbl.add(new JLabel("Label 6"));
        panelLbl.add(new JLabel("Label 7"));
        panelLbl.add(new JLabel("Label 8"));
        panelLbl.add(new JLabel("Label 9"));
        panelLbl.add(new JLabel("Label 10"));
        //-------------------------------------------- Panel Label --------------------------------------

        this.add(panelLbl);
        this.add(panelTxtFld);
        this.add(panelBtn);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == addBtn){
            label.setText(textField.getText());
        }
        else if(e.getSource() == extBtn){
            System.exit(0);
        }
    }
}
