/*
Programa: Parejas
Autor: Borja
Web: http://www.todojava.tk
Version: 1.0

Descripcion: Este es el tipico juego de las parejas en que se trata de buscar 
todos los pares de fichas iguales en el menor numero de intentos posibles.

Dificultad: Principiante

 */

import java.awt.*;
import java.lang.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;
import java.io.*;

class Parejas extends JFrame implements ActionListener {
    //matriz de botones

    JButton boton[][] = new JButton[5][8];
    JLabel nombre = new JLabel("TodoJava.tk: Parejas", JLabel.CENTER);
    ImageIcon foto[] = new ImageIcon[20];
    ImageIcon vacia;
    JLabel Lintentos = new JLabel("Numero de intentos: 0        ");
    JLabel Puntos = new JLabel("Hola", JLabel.RIGHT);
    //Donde se coloca cada ficha? matriz de fichas!!
    int ficha[][] = new int[5][8];
    int comprobar = 0;
    int pos1, i1, j1, j2, i2, quedan, intentos = 0;

    Parejas() {
        //ficha por defecto
        vacia = new ImageIcon("quien.JPG");
        //cargar las imagenes . . . . las imagenes se encuentran en la misma carpeta que el archivo Parejas.java
        //y se nombran de la forma x.JPG.
        for (int i = 0; i < 20; i++) {
            foto[i] = new ImageIcon(Integer.toString(i) + ".JPG");
        }
        add(nombre, "North");
        JPanel central = new JPanel(new GridLayout(5, 8));
        //Aniadir Botones al panel principal de botones
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {

                boton[i][j] = new JButton();
                //aniade el actionlistener al boton
                boton[i][j].addActionListener(this);
                boton[i][j].setBackground(Color.WHITE);
                central.add(boton[i][j]);
            }
        }
        add(central, "Center");
        //Panel que muestra la puntuacion maxima
        JPanel Pun = new JPanel();
        Pun.setLayout(new GridLayout(1, 2));
        Pun.add(Lintentos);
        Pun.add(Puntos);
        add(Pun, "South");

        //Metodo que coloca las imagenes aleatoriamente en la matriz
        ImagenesAleatorias();
        VerPuntuacion();

        //Metodo para cerrar la ventana
        addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });


        // Propiedades de la ventana
        setTitle("Parejas");
        setResizable(false);
        setSize(800, 600);
        setVisible(true);
    }

    void ImagenesAleatorias() {
        int x, y = 0;
        int numero = -1;
        double x1, y1 = 0;

        //Pone la matriz de las fichas a -1. El numero -1 indica que no tiene ficha
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                ficha[i][j] = -1;
            }

        }

        //Crear Numeros aleatorios.
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                //Genera una posicion aleatoria dentro de la matriz dada
                do {
                    x1 = Math.random() * 5;
                    y1 = Math.random() * 8;
                    x = (int) x1;
                    y = (int) y1;
                } while (ficha[x][y] != -1);
                numero++;
                if (numero == 20) {
                    numero = 0;
                }
                ficha[x][y] = numero;
                boton[i][j].setIcon(vacia);
            }
        }
        /* Solucion: Poner esto para visualizar la matriz en la consola de java
        for (int i=0;i<5;i++)
        {
        for(int j=0;j<8;j++)
        {
        System.out.print(ficha[i][j] + "     ");
        }
        System.out.println(" ");
        }
         */
    }

    public void actionPerformed(ActionEvent ae) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                if (ae.getSource() == boton[i][j]) {
                    if (boton[i][j].getIcon().equals(vacia)) {
                        comprobar++;
                        //Cuando la pulsacion no es la n 3 muestra la carta de esa posicion
                        if (comprobar != 3) {
                            boton[i][j].setIcon(foto[ficha[i][j]]);
                        }
                        if (comprobar == 1) //Guarda las propiedades de la 1 carta
                        {
                            this.guardarProp(i, j);
                        }
                        if (comprobar == 2) //Guarda las propiedades de la 2 carta
                        {
                            if (pos1 == ficha[i][j]) //Las cartas coinciden
                            {
                                this.coincidencia();
                            } else //Has fallado. Las fichas son diferentes
                            {
                                this.noCoincidencia(i, j);
                            }
                        }

                        if (comprobar == 3) //El 3 Click, al ser distintas vuelve a ocultar las fichas
                        {
                            this.ocultarFichas();
                        }
                    }
                }
            }
        }
        //El numero de intentos que llevas.....
        Lintentos.setText("Numero de intentos: " + intentos + "		");
        //Ganar consigues descrubir el panel. Verifica puntuacion y vuelve a empezar
        if (quedan == 20) {
            this.quedan20();
        }
    }

    void ocultarFichas() {
        boton[i1][j1].setIcon(vacia);
        boton[i2][j2].setIcon(vacia);
        comprobar = 0;

    }

    void noCoincidencia(int i, int j) {
        i2 = i;
        j2 = j;
    }

    void coincidencia() {

        quedan++; //Contador de fichas que han salido
        comprobar = 0; //Poner a 0 la pulsacion
        intentos++; //contador de el numero de intentos

    }

    void guardarProp(int i, int j) {

        pos1 = ficha[i][j]; //guarda la ficha que se encuentra en esa posicion
        i1 = i; 	//coordenada i de la ficha
        j1 = j;		//cordenada j de la ficha
        intentos++; //contador del numero de intentos para establecer record

    }

    void quedan20() {

        JOptionPane.showMessageDialog(this, "El n de Intentos es:     " + intentos, "Conecta 4", JOptionPane.INFORMATION_MESSAGE, vacia);
        Puntuacion();
        VerPuntuacion();
        quedan = 0;
        intentos = 0;
        ImagenesAleatorias();
        Lintentos.setText("Numero de intentos: " + intentos);

    }

    void VerPuntuacion() //Muestra la puntuacion Record
    {
        String record = "";
        String nom = "";
        //Leer Record
        try {
            FileReader puntuacionmax = new FileReader("record.txt");
            BufferedReader leer = new BufferedReader(puntuacionmax);
            record = leer.readLine();
            nom = leer.readLine();
            puntuacionmax.close();
        } catch (IOException ioe) {
        }
        Puntos.setText(nom + ": " + record);
    }

    void Puntuacion() //Guarda la nueva puntuacion en caso de ser Record
    {
        String record = "";
        String nom = "Anonimo";
        //Leer Record
        try {
            FileReader puntuacionmax = new FileReader("record.txt");
            BufferedReader leer = new BufferedReader(puntuacionmax);
            record = leer.readLine();
            nom = leer.readLine();
            puntuacionmax.close();
        } catch (IOException ioe) {
        }
        //Tienes Menor numero de intentos que el anterior?
        try {
            Integer.parseInt(record);
        } catch (NumberFormatException NFE) {
            record = "100"; //en el caso de haber un error en el archivo inicia otra vez el record a 100
        }
        if (intentos < Integer.parseInt(record)) //se ha producidu un recor......
        {
            try {
                FileWriter puntuacionmax = new FileWriter("record.txt");
                nom = JOptionPane.showInputDialog("Nuevo Record, Introduce tu Nombre:");
                puntuacionmax.write(Integer.toString(intentos) + "\n");
                puntuacionmax.write(nom + "\n");
                puntuacionmax.close();
            } catch (IOException ioe) {
            }

        }
    }

    public static void main(String[] args) {
        //lanzar la aplicacion
        new Parejas();
    }
}
