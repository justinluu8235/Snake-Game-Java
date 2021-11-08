import javax.swing.*;

public class GameFrame extends JFrame {


    public GameFrame()  {
        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        //if we add components to JFrame - takes the frame and fit it around component
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }


}

