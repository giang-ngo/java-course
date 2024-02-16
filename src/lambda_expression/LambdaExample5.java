package lambda_expression;

import javax.swing.*;
import java.awt.*;

public class LambdaExample5 extends JFrame {
    private final int width;
    private final int height;

    public LambdaExample5(String title, int width, int height) {
        this.width = width;
        this.height = height;
        this.setTitle(title);
        this.setSize(this.width, this.height);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        addComponents();
        this.setVisible(true);
    }

    private void addComponents() {
        JLabel label = new JLabel("Nhập họ và tên của bạn: ", JLabel.CENTER);
        label.setBounds(this.width / 2 - 100, this.height / 5 - 20, 200, 40);
        label.setFont(new Font("Arial", Font.PLAIN, 14));
        this.add(label);

        int width = 120;
        int height = 40;
        JButton btnClickMe = new JButton("Xác nhận");
        btnClickMe.setBounds(this.width / 2 - width / 2,
                3 * this.height / 5 - height / 2, width, height);
        btnClickMe.setBackground(Color.BLUE);
        btnClickMe.setForeground(Color.WHITE);
        this.add(btnClickMe);

        JTextField textField = new JTextField();
        textField.setFont(new Font("Arial", Font.PLAIN, 14));
        textField.setBounds(this.width / 2 - 90, 2 * this.height / 5 - 20, 180, 40);
        this.add(textField);

//        đăng ký sự kiện cho nút
        btnClickMe.addActionListener(e -> {
            var msg = "Xin chào " + textField.getText() + "!";
            JOptionPane.showMessageDialog(this, msg);
        });
    }

    public static void main(String[] args) {
        var title = "Síp Vy chảnh chọe soi gì đó =))\nThấy cái hình là c mê ai từ cái nhìn đầu tiên rồi";
        var width = 400;
        var height = 250;
        new LambdaExample5(title, width, height);
    }

}