package src.main.java.Lesson_8;

import javax.swing.*;
import javax.swing.tree.VariableHeightLayoutCache;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterApp extends JFrame {

    public static final String VALIDATIONMESSAGE = "Число должно быть в пределах от -10 до 10";

    private int value;

    CounterApp(int initialValue) {
        setTitle("Простой счётчик");
        setBounds(300, 300, 500, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Font font = new Font("Arial", Font.BOLD, 60);


        //Cам счётчик

        JLabel label = new JLabel();
        label.setFont(font);
        label.setHorizontalAlignment(SwingConstants.HORIZONTAL);

        value = initialValue;
        label.setText(String.valueOf(value));
        add(label);

        //Сообщение об ошибке

        JLabel errorLabel = new JLabel();
        Font errorFont = new Font("Arial", Font.BOLD, 20);
        errorLabel.setFont(errorFont);
        errorLabel.setHorizontalAlignment(SwingConstants.HORIZONTAL);
        add(errorLabel, BorderLayout.SOUTH);

        //Кнопка увеличения

        //Рисуем кнопку
        JButton incButton = new JButton(">");
        incButton.setFont(font);
        add(incButton, BorderLayout.EAST);

        //Добавляем логику кнопке
        incButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value++;
                label.setText(String.valueOf(value));
                errorLabel.setText(value >= 11 ? VALIDATIONMESSAGE : "");

            }
        });

        //Кнопка уменьшения

        //Рисуем кнопку
        JButton decButton = new JButton("<");
        decButton.setFont(font);
        add(decButton, BorderLayout.WEST);

        //Добавляем логику кнопке
        decButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value--;
                label.setText(String.valueOf(value));
                errorLabel.setText(value <= -11 ? VALIDATIONMESSAGE : "");
            }
        });


        setVisible(true);
    }

    public static void main(String[] args) {

        new CounterApp(1);

    }


}
