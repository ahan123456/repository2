package cn.itcast;


import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Welcome {
    public void show() {
        JFrame jf = new JFrame("Result");
        // 设置窗体大小
        jf.setSize(360, 450);
        // 设置窗体居中
        jf.setLocationRelativeTo(null);
        // 设置退出方式
        jf.setDefaultCloseOperation(3);

        JLabel jl = new JLabel("欢迎登录", SwingConstants.CENTER);
        jl.setFont(new Font("宋体", Font.BOLD, 30));
        jf.add(jl);
        jf.setVisible(true);
    }
}

