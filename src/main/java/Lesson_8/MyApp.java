package src.main.java.Lesson_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyApp extends JFrame {

    MyApp() {

        setTitle("Мое окошко");
        //НЕОБХОДИМОСТЬ ЗАВЕРШИТЬ ВЫПОЛНЕНИЕ ПРИ ЗАКРЫТИИ ФОРМЫ (ОКНА);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //задали дефолтный (когда запускается) размер окна;
        setBounds(300, 300, 400, 400);

        /**
         * вводим кнопочки, 1 вариант, кнопочки
         */

//        JButton button1 = new JButton("Button_1");
//        JButton button2 = new JButton("Button_2");
//        add(button1, BorderLayout.NORTH);
//        add(button2, BorderLayout.SOUTH);

        /**
         * вводим кнопочки, 2 вариант, выравнивание в ряд
         */

//        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
//
//        for (int i = 1; i < 11; i++){
//            add(new JButton(String.valueOf(i)));
//        }

        /**
         * вводим кнопочки, 3 вариант, выравнивание в линию, строки с кнопками переносятся сами по размеру окна
         */
//        setLayout(new FlowLayout());
//        for (int i = 1; i < 21; i++){
//            add(new JButton(String.valueOf(i)));
//        }

        /**
         * вводим кнопочки, 4 вариант, выравнивание по сетке(матрице)
         */
//        setLayout(new GridLayout(3,3));
//        for (int i = 1; i < 10; i++) {
//            add(new JButton(String.valueOf(i)));
//        }

        setLayout(null);
        JTextField textField = new JTextField();
        textField.setBounds(20,20,150,40);
        add(textField);
        JButton button = new JButton("Мне повезёт");
        button.setBounds(20,60,150,40);
        add(button);



        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("Нажали кнопку?");
                button.setText("Повезло");
            }
        });

        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("Нажали Enter?");
            }
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Осторожно окно закрывается");
            }
        });

        //прописываем в самом коце, чтобы программа сначала прогрузилась, а затем показалась;
        setVisible(true);

    }

    public static void main(String[] args) {
        new MyApp();
    }

}

/**
 * Jframe - окно
 * jbutton - кнопка
 * Jlabel -надпись (вывод текста)
 * JTextField - текстовое поле
 * JTextArea - текстовые поля
 * JScrollPane - прокрутка (ползунок справа)
 * JMenuBar - строчка меню
 * JTable - таблица
 * JRadioButton -
 * JCheckBox -
 */