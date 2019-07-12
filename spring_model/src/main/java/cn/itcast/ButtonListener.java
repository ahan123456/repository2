package cn.itcast;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

    public class ButtonListener implements ActionListener {

        private JFrame jf;
        private JTextField jt1;
        private JTextField jt2;

        public void setJt3(JFrame jframe) {
            jf = jframe;
        }

        public void setJt1(JTextField jtext) {
            jt1 = jtext;
        }

        public void setJt2(JTextField jtext) {
            jt2 = jtext;
        }

        public void actionPerformed(ActionEvent e) {
            String name1 = jt1.getText();// 输入的帐号
            String name2 = jt2.getText();// 输入的密码
            //创建欢迎窗口对象
            Welcome wel = new Welcome();
            //设置QQ登录主界面窗口不可见
            jf.setVisible(false);
            //帐号密码正确弹出欢迎窗口，错误弹出确认信息
            if ("123".equals(name1) && "456".equals(name2)) {
                wel.show();
            } else {
                JOptionPane pane = new JOptionPane();
                JOptionPane.showMessageDialog(pane, "帐号密码错误");
            }

        }
    }

