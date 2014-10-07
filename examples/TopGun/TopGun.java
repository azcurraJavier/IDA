
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import static java.lang.Thread.sleep;

public class TopGun extends JFrame implements KeyListener, ActionListener {

    //	Attributes
    JButton start_button = new JButton("Press Space to Start");

    JPanel status_panel = new JPanel();
    
    JLabel score_label = new JLabel("Score");
    JTextField score_textfield = new JTextField(5);
    
    JLabel life_label = new JLabel("Life");
    
    JProgressBar life_progressBar = new JProgressBar(0, 100);

    boolean initiated = false;

    //shoot number
    public int shoot_number = 0;

    //plane position
    public int xar = 0;
    public int yac = 0;

    //plane movement
    int plane_mov = 20;

    //Classes
    Shot[] shot = new Shot[20];
    Enemy[] enemy = new Enemy[20];
    LaunchEnemies lnEne;
    RefreshScreen rfScreen;
    
    //Constructor
    public TopGun() {

        //To close the window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        //KeyListener for JFrame
        addKeyListener(this);
        
        
        //Status Panel
        add(start_button);
        Font font = new Font("Roman", Font.BOLD, 35);
        start_button.setFont(font);
        start_button.setForeground(Color.RED);
        start_button.addActionListener(this);

        //Size
        setSize(600, 650);

        for (int i = 0; i < 20; i++) {
            //initiate the enemies
            enemy[i] = new Enemy(this);
            enemy[i].start();
            enemy[i].prepare();
        }

        setTitle("TopGun v 1.0");
        setResizable(false);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        
        if (ae.getSource() == start_button) {
            
            //hide button
            start_button.setVisible(false);
            
            //Focus in JFrame
            requestFocus();
            
            //plane position
            yac = this.getWidth() - 50;
            xar = (this.getHeight() - 50) / 2;

            initiated = true;

            for (int i = 0; i < 20; i++) {
                //start shooting
                if (i < 10) {
                    shot[i] = new Shot(this); //plane's shot
                } else {
                    shot[i] = new Shot(this, true); //enemies' shot
                }
                shot[i].start();
                
                //Prepare the shots
                shot[i].prepare();
            }

            lnEne = new LaunchEnemies(this);
            lnEne.start();

            rfScreen = new RefreshScreen(this);
            rfScreen.start();

            //Status panel
            status_panel.setLayout(new FlowLayout());
            status_panel.add(score_label);
            status_panel.add(score_textfield);
            //Score zero
            score_textfield.setText("0");
            status_panel.add(life_label);
            status_panel.add(life_progressBar);
            //plane's lives
            life_progressBar.setValue(100);
            life_progressBar.setForeground(Color.RED);
            add(status_panel, "South");
        }
    }

    
    public void keyReleased(KeyEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {
        if (initiated) {
            if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                shot();
            }
            if (e.getKeyCode() == KeyEvent.VK_UP) {
                if (yac > 100) {
                    up();
                }
            }
            if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                if (yac < 550) {
                    down();
                }
            }
            if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                if (xar > plane_mov) {
                    left();
                }
            }
            if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                if (xar < 550) {
                    right();
                }
            }
        }
    }

    void shot() {
        shoot_number++;
        if (shoot_number == 10) {
            shoot_number = 0;
        }
        shot[shoot_number].fire();
    }

    void down() {
        yac = yac + plane_mov;
    }

    void up() {
        yac = yac - plane_mov;
    }

    void left() {
        xar = xar - plane_mov;
    }

    void right() {
        xar = xar + plane_mov;
    }

    public int getXar() {
        return xar;
    }

    public int getYac() {
        return yac;
    }

    public void hitPlane() {
        //plane's energy
        int energy = life_progressBar.getValue();
        energy = energy - 10;
        life_progressBar.setValue(energy);
        if (energy <= 0) {
            //Game Over
            String msgDialog = "Game Over!!!";
            JOptionPane.showMessageDialog(this, msgDialog, "Message", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);            
        }
    }
    
    public static void main(String[] args) {
        new TopGun();
    }
}

//Refresh screen class
class RefreshScreen extends Thread {

    int xPos = 0, yPos = 0;

    //Images
    Image planeImage;
    Image planeShot;
    Image enemyImage;
    Image bangImage;

    //Clases
    TopGun tg;

    Graphics2D drawing;

    public RefreshScreen(JFrame jf) {
        
        //Load Imagen
        planeImage = Toolkit.getDefaultToolkit().getImage("plane.png");
        planeShot = Toolkit.getDefaultToolkit().getImage("shot.jpg");
        enemyImage = Toolkit.getDefaultToolkit().getImage("enemy.png");
        bangImage = Toolkit.getDefaultToolkit().getImage("exploit.png");
        //iniciar Clase topGun
        tg = (TopGun) jf;
    }

    //Refresh the screen with the new positions
    public void run() {
        
        while (true) {
            drawing = (Graphics2D) tg.getGraphics();
            //clean 
            drawing.clearRect(0, 0, 600, 600);
            //set background color
            tg.setBackground(Color.WHITE);

            //update the content
            updatePlane();
            updateShot();
            updateEnemy();

            hitPlaneEnemy();
            hitShotEnemy();

            //refresh the screen after delay 50 miliseconds
            try {
                sleep(50);
            } catch (InterruptedException ie) {
            }
        }
    }

    void updatePlane() {
        xPos = tg.getXar();
        yPos = tg.getYac();
        
        //drawing the plane
        drawing.drawImage(planeImage, xPos, yPos, 50, 50, null);
    }

    void updateShot() {
        for (int i = 0; i < 20; i++) {
            xPos = tg.shot[i].getXar();
            yPos = tg.shot[i].getYac();
            drawing.drawImage(planeShot, xPos + 40, yPos, 3, 9, null);
            drawing.drawImage(planeShot, xPos + 10, yPos, 3, 9, null);
        }
    }

    void updateEnemy() {
        for (int i = 0; i < 20; i++) {
            xPos = tg.enemy[i].getXar();
            yPos = tg.enemy[i].getYac();
            if (tg.enemy[i].dead() == false) {
                drawing.drawImage(enemyImage, xPos, yPos, 50, 50, null);
            } else {
                drawing.drawImage(bangImage, xPos, yPos, 50, 50, null);
            }
        }
    }

    void hitPlaneEnemy() {
        for (int i = 0; i < 20; i++) {
            int w1, h1, w2, h2, x1, y1, x2, y2;
            w1 = 50;
            h1 = 50;
            w2 = 50;
            h2 = 50;
            //plane's position
            x1 = tg.getXar();
            y1 = tg.getYac();
            //enemy's position
            x2 = tg.enemy[i].getXar();
            y2 = tg.enemy[i].getYac();

            //check the enemy and shot position
            if (((x1 + w1) > x2) && ((y1 + h1) > y2) && ((x2 + w2) > x1) && ((y2 + h2) > y1)) {
                if (tg.enemy[i].dead() == false) {
                    tg.hitPlane();
                }
                tg.enemy[i].exploit();
                tg.shot[i].exploit();
            }
        }
    }

    void hitShotEnemy() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                
                //if the shot is still active
                int w1, h1, w2, h2, x1, y1, x2, y2;

                w1 = 50;
                h1 = 50;
                w2 = 43;
                h2 = 9;
                //shot's position
                x1 = tg.shot[i].getXar();
                y1 = tg.shot[i].getYac();
                //enemy's position
                x2 = tg.enemy[j].getXar();
                y2 = tg.enemy[j].getYac();

                //check the enemy and shot position
                if (((x1 + w1) > x2) && ((y1 + h1) > y2) && ((x2 + w2) > x1) && ((y2 + h2) > y1)) {
                    tg.enemy[j].exploit();
                    tg.shot[i].exploit();
                }
            }
        }
    }

}

//game classes. 
//Launch the enemies 
class LaunchEnemies extends Thread {

    TopGun tp;
    int i = 0;

    LaunchEnemies(JFrame j) {
        tp = (TopGun) j;
    }

    public void run() {
        while (true) {
            i++;
            if (i == 20) {
                i = 0;
            }
            try {
                sleep(350);
            } catch (InterruptedException ie) {
            }
            tp.enemy[i].resume();            
        }
    }
}

class Enemy extends Thread {

    //shot's position
    int yac = -50;
    int xar = 0;

    boolean alive = true;
    boolean right = true;
    int movement = 6;

    //TopGun class
    TopGun tg;

    public Enemy(JFrame jf) {
        tg = (TopGun) jf;
    }

    public void run() { 

        //random position of enemy plane
        double aux = Math.random() * 550;
        xar = (int) aux;
        
        //random direction of enemy plane
        if (xar % 2 == 0) {
            right = true;
        } else {
            right = false;
        }
        
        //random enemy's speed
        aux = Math.random() * 5 + 6;
        movement = (int) aux;
        
        while (yac < 550 && alive == true) {
            try {
                sleep(50);
            } catch (InterruptedException ie) {
                System.out.println(ie);
            }
            if (right) {
                xar += movement;
            } else {
                xar -= movement;
            }
            if (xar < 10) {
                right = true;
            }
            if (xar > 550) {
                right = false;
            }
            yac += movement;
        }
                
        //return to the initial state to prepare a new shot
        if (!alive) {
            try {
                sleep(250);
            } catch (InterruptedException intExp) {
                System.out.println(intExp);
            }
        }
        yac = -60;
        prepare();
        alive = true;
        run();
    }

    boolean dead() {
        return !alive;
    }

    public void prepare() {
        suspend();
    }

    public void exploit() {
        int score;
        alive = false;
        score = Integer.valueOf(tg.score_textfield.getText());
        score += 10;
        tg.score_textfield.setText(String.valueOf(score));
    }

    public void fire() {
        //plane's position
        xar = tg.getXar();
        yac = tg.getYac();
        resume();
    }

    //get the position of the plane
    public int getYac() {
        return yac;
    }

    public int getXar() {
        return xar;
    }
}

class Shot extends Thread {

    //shot's position
    int yac = 0;
    int xar = 0;	
    
    boolean enemy = false;
    
    //enemyNumber returns the number of enemy plane hit 
    int enemyNumber = 0;

    TopGun tg;

    public Shot(JFrame jf) {
        tg = (TopGun) jf;
    }

    public Shot(JFrame jf, boolean e) {
        tg = (TopGun) jf;
        enemy = e;
    }

    public void run() {

        if (!enemy) {
            
            //plane's position
            xar = tg.getXar();
            yac = tg.getYac();
        } else {
            
            //enemy's position
            xar = tg.enemy[enemyNumber].getXar();
            yac = tg.enemy[enemyNumber].getYac();
        }
        while (yac > 0) {
            try {
                
                //move shot
                if (enemy) {
                    yac = yac + 12;
                } else {
                    yac = yac - 12;
                }
                
                //delay 30 miliseconds
                sleep(30);
            } catch (InterruptedException ie) {
                System.out.println(ie);
            }
        }
        
        //return to the initial state to prepare a new shot
        prepare();
        run();
    }

    public void prepare() {
        suspend();
    }

    public void exploit() {
        prepare();
        yac = 700;
    }

    public void fire() {
        //plane's position
        xar = tg.getXar();
        yac = tg.getYac();
        resume();
    }

    public void fire(int numero) {
        //plane's position
        xar = tg.getXar();
        yac = tg.getYac();
        enemyNumber = numero;
        resume();
    }

    //get the position of the shot
    public int getYac() {
        return yac;
    }

    public int getXar() {
        return xar;
    }
}
