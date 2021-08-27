package com.company.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Observador {

    public static void main(String[] args) {

        JFrame janela = new JFrame("Observador");
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setSize(600,200);
        janela.setLayout(new FlowLayout());
        janela.setLocationRelativeTo(null); //centralizar na tela

        JButton botao = new JButton("Clicar!");
        janela.add(botao);

       /*
       botao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Evento ocorreu");
            }
        });
        */
        botao.addActionListener(e -> {
            System.out.println("Evento ocorreu via lambda");
        });

        janela.setVisible(true);
    }
}
