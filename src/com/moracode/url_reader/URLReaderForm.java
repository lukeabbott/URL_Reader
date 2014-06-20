package com.moracode.url_reader;

import javax.swing.*;

/**
 * Created by Luke on 6/12/2014.
 */
public class URLReaderForm extends JFrame{
    private JButton loadSourceButton;
    public JTextPane displaySourceTextPane;
    private JTextField urlTextField;
    private JPanel urlReaderRootPanel;

    public URLReaderForm(){
        setContentPane(urlReaderRootPanel);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }
}
