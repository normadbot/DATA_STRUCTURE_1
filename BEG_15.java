import java.awt.*;
import java.awt.event.*;
import javax .swing.*;
public class BEG_15 {
        public static void main(String [] args){
            EventQueue.invokeLater(new Runnable()
            {  @Override
                public void run(){
                    PlafFrame frame = new PlafFrame();
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setVisible(true);
            }
            });
        }
}

 class PlafFrame extends JFrame  {
     public static  final int DEFAULT_WIDTH=420;
     public static  final int DEFAULT_HEIGHT=420;
    private JPanel buttonpanel;
    public PlafFrame (){
        setTitle("PlafTest");
        setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
        buttonpanel = new JPanel();
        UIManager.LookAndFeelInfo[] infos = UIManager.getInstalledLookAndFeels();
        for (UIManager.LookAndFeelInfo info:infos){
            makeButton(info.getName(),info.getClassName());
        }
        add(buttonpanel);
    }
    void makeButton(String name,final String plafName){
        JButton button = new JButton(name);
        buttonpanel.add(button);
        button.addActionListener(new ActionListener()
        {  @Override 
            public void actionPerformed(ActionEvent event){
                try{
                    UIManager.setLookAndFeel(plafName);
                    SwingUtilities.updateComponentTreeUI(PlafFrame.this);
                }catch(Exception e){
                    e.printStackTrace();
                }
            } 
        
        });
    }
}

