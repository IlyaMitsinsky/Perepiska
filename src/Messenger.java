import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Date;

public class Messenger extends JFrame {
    private JTextField avtorNaim;
    private JTextArea chatText;
    private JTextField soobschenieTexst;
    private JButton otprButton;
    private JPanel mainPanel;

    Chat chat;

    public Messenger(){
        setSize(800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setContentPane(mainPanel);
        chat = new Chat("Общий");
        otprButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                chat.getSoobschenie().add(new Pismo(soobschenieTexst.getText(), avtorNaim.getText(), new Date()));

                chatText.setText("");
                printMessages(chat);
            }

        });

    }





    public void printMessages(Chat chat){
        if((chat != null)&&(chat.getSoobschenie()!= null)&&(chat.getSoobschenie().size()>0)){
            for(Pismo p: chat.getSoobschenie()){
                chatText.append(p.avtor+":");
                chatText.append(p.soobschenie);
                chatText.append("[Отправлено "+ p.data.toString()+"]");
            }
        }
    }


}
