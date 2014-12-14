
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Minesweeper extends JFrame implements ActionListener {

    //buttons
    private JButton bttns[][];
    
    private int min_mtrx[][];
    //Text Fields
    private JTextField txtMin = new JTextField(3);
    
    //Labels
    private JLabel rm = new JLabel("Remaining Mines.");    

    //Mines images
    private ImageIcon min_imag[] = new ImageIcon[12];
    //Dimension
    private int dim = 10;
    //total mines
    private int TOTmin = 20;
    private int sq = dim * dim - TOTmin;


    //Time tp;
    public Minesweeper() {
        bttns = new JButton[dim][dim];
        min_mtrx = new int[dim][dim];
        //load Images
        for (int i = 0; i < 12; i++) {
            min_imag[i] = new ImageIcon(i + ".jpg");
        }

        //Top Panel
        JPanel topPanel = new JPanel();
        topPanel.add(rm);
        topPanel.add(txtMin);

        add(topPanel, "North");
        txtMin.setEditable(false);
        
        txtMin.setText(Integer.toString(sq));

        //Button panel
        JPanel middlePanel = new JPanel(new GridLayout(dim, dim));
        //Create and place button
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                //Create Button
                bttns[i][j] = new JButton();
                //Place button
                middlePanel.add(bttns[i][j]);
                //Action Listener
                bttns[i][j].addActionListener(this);
            }
        }
        this.add(middlePanel, "Center");
        plantmines(TOTmin);
        //Window properties
   
        setTitle("Minesweeper v 1.0                                            ");
        setResizable(false);
        setSize(600, 600);
        setVisible(true);
    }
    
    private void plantmines(int mins) {
        System.out.println("Planting Mines... \n");
        for (int i = 0; i < mins; i++) {
            
            int x, y = 0;
            double x1, y1 = 0;

            /*
             *  Legend of mines in Matrix
             *	1 contains Mine
             *	0 Not contains Mine
             */
            
            //Place random mine
            do {
                //Generate random position
                x1 = Math.random() * dim;
                y1 = Math.random() * dim;
                x = (int) x1;
                y = (int) y1;
            } while (min_mtrx[x][y] != 0);
            min_mtrx[x][y] = 1; //Place mine
        }
        //Display mines panel
        for (int i = 0; i < dim; i++) {
            System.out.println("");
            for (int j = 0; j < dim; j++) {
                System.out.print(" " + min_mtrx[i][j]);
            }
        }

    }

    public static void main(String[] args) {
        new Minesweeper();
    }

    //Action Event
    public void actionPerformed(ActionEvent ae) {
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                if (ae.getSource() == bttns[i][j] && bttns[i][j].getIcon() == null && 
                        bttns[i][j].getBackground() != Color.WHITE) {
                    bttns[i][j].setBackground(Color.WHITE);
                    if (min_mtrx[i][j] == 1) {
                        boom();
                    } else {
                        uncoverEmpty(i, j);
                    }
                }
            }
        }
    }

    private void uncoverEmpty(int i, int j) {
        //Uncover an empty square
        sq--;
        txtMin.setText(Integer.toString(sq));
        bttns[i][j].setText(Integer.toString(nearbyMines(i, j))); //Nearby Mines
        if (sq == 0) {
            win();
        }
    }

    private void restart() {
        //restart game
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                min_mtrx[i][j] = 0;
                bttns[i][j].setText("");
                bttns[i][j].setBackground(null);
                bttns[i][j].setIcon(null);
            }
        }
        plantmines(TOTmin);
        sq = dim * dim - TOTmin;
        txtMin.setText(Integer.toString(sq));	
        
    }

    private void win() {
	//Win the game
        String msgDialog = "You Win!!!  Game Over!!!";
        JOptionPane.showMessageDialog(this, msgDialog, "Message", JOptionPane.INFORMATION_MESSAGE);
        restart();
    }

    private void boom() {
	//lose the game        
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                if (min_mtrx[i][j] == 1) {                    
                    //Mines Random Images
                    double y1 = Math.random() * 12;
                    int y = (int) y1;
                    bttns[i][j].setIcon(min_imag[y]);
                }
            }
        }
        String msgDialog = "Boom!!! Game Over!!!";
        JOptionPane.showMessageDialog(this, msgDialog, "Message", JOptionPane.INFORMATION_MESSAGE);
        restart();
    }

    private int nearbyMines(int xar, int yac) {
        /*	
         *	x axe row
         *	y axe column
         *
         *	return the number of mines
         */

        int MINSnum = 0;
        for (int i = yac - 1; i <= yac + 1; i++) {
            //horizontal
            if (i > -1 && i < dim) {
                if (min_mtrx[xar][i] == 1) {
                    MINSnum++;
                }
            }
        }
        //vertical
        for (int j = xar - 1; j <= xar + 1; j++) {
            if (j > -1 && j < dim) {
                if (min_mtrx[j][yac] == 1) {
                    MINSnum++;
                }
            }
        }
	//diagonal
        //Top left corner
        //copy of axes
        
        int xar_cp = xar;
        int yac_cp = yac;
        xar_cp--;
        yac_cp--;
        for (int i = xar_cp; i < xar_cp + 3; i++) {
            if (i > -1 && i < dim && yac_cp > -1 && yac_cp < dim) {
                if (min_mtrx[i][yac_cp] == 1) {
                    MINSnum++;
                }
            }
            yac_cp++;
        }
        //top right corner
        xar_cp = xar;
        yac_cp = yac;
        xar_cp--;
        yac_cp++;
        for (int i = xar_cp; i < xar_cp + 3; i++) {
            if (i > -1 && i < dim && yac_cp > -1 && yac_cp < dim) {
                if (min_mtrx[i][yac_cp] == 1) {
                    MINSnum++;
                }
            }
            yac_cp--;
        }
        return MINSnum;
    }
}
