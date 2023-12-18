package editor;

import javax.swing.JFrame;

/**
 *
 * @author LENOVO
 */
public class Editor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JFrame f = new JFrame("Editor");
        PanelEditor panel = new PanelEditor();
        f.setSize(800,600);
        f.setLocation(100,100);
        f.setContentPane(panel);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
    }
    
}
