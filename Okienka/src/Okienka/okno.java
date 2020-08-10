package Okienka;

import Generator.SudokuGenerator;

import javax.swing.*;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class okno {
    private JPanel mainPanel;
    private JButton startButton;
    private JTable table1;
    private JComboBox comboBox;




    public okno() {
        startButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {


            }
        });
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("Sudoku");
        frame.setContentPane(new okno().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();   //dopasowanie rozmiaru okna do zawartości
        frame.setVisible(true);

        SudokuGenerator x = new SudokuGenerator();
        int[][] sudokuList = x.generateSudoku();
        if (x.validate(sudokuList)) {
            x.generate(sudokuList);
        }
    }

}
