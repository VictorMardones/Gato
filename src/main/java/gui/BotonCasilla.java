package gui;

import modelo.Casilla;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotonCasilla extends JButton implements ActionListener {

    /* Atributos */
    private Casilla casilla;

    /* Constructores */
    public BotonCasilla(Casilla casilla) {
        this.casilla = casilla;

        setBorder(BorderFactory.createLineBorder(Color.BLACK,3));
        setFont(new Font("Arial", Font.BOLD, 200));

        setHorizontalAlignment(CENTER);
        setVerticalAlignment(CENTER);

        cambiarEstado();
    }

    /* Métodos */
    public void cambiarEstado(){
        switch (casilla.getEstado()) {          // Dependiendo del estado, se elige el diseño de la casilla
            case VACIO -> {
                setForeground(Color.WHITE);
                setText("");
            }
            case CRUZ -> {
                setForeground(Color.RED);
                setText("X");
            }
            case CIRCULO -> {
                setForeground(Color.BLUE);
                setText("O");
            }
        }

        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this) {
            setForeground(Color.RED);
            setText("X");
        }
    }
}