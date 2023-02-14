import java.awt.EventQueue;

import javax.swing.JFrame;

/**
 * my App
 */
public class App extends JFrame {

    /**
     * Constructor for the App
     */
    public App() {
        initApp();
    }

    private void initApp() {
        add(new Menu());

        setResizable(false);
        pack();

        setTitle("App");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        EventQueue.invokeLater(() -> {
            JFrame ex = new App();
            ex.setVisible(true);
        });
    }
}
