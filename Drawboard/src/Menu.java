
import java.awt.Dimension;
import java.awt.Color;

import javax.swing.JComponent;

public class Menu extends JComponent {

    private final int B_HEIGHT = 300;
    private final int B_WIDTH = 150;

    /**
     * Constructor for Board
     */
    public Menu() {
        initMenu();
    }

    private void initMenu() {
        System.out.println("Initiating Menu");

        // addKeyListener(new TAdapter());
        setBackground(Color.black);
        setFocusable(true);

        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));

    }
}
