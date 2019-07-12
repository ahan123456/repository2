package cn.itcast;


    public class Login {

        public static void main(String[] args) {
            Login log=new Login();
            log.showFrame();
        }

        public void showFrame(){
            //构造一个窗体
            javax.swing.JFrame frame=new javax.swing.JFrame();
            //设置标题
            frame.setTitle("qq");
            //设置窗体大小
            frame.setSize(360, 450);
            //设置窗体居中
            frame.setLocationRelativeTo(null);
            //设置退出方式
            frame.setDefaultCloseOperation(3);

            //窗体布局格式(流式布局管理器)
            java.awt.FlowLayout fl=new java.awt.FlowLayout();
            frame.setLayout(fl);

            //添加图片
            javax.swing.ImageIcon icon=new javax.swing.ImageIcon("D:\\develop\\0.jpg");
            //添加标签
            javax.swing.JLabel jla=new javax.swing.JLabel(icon);
            frame.add(jla);


            //添加文本框
            javax.swing.JTextField jta_name1=new javax.swing.JTextField();
            //设置文本框大小
            java.awt.Dimension d1=new java.awt.Dimension(200,30);
            jta_name1.setPreferredSize(d1);
            //将文本框加至窗口
            frame.add(jta_name1);

            //创建按钮
            javax.swing.JButton bu_register=new javax.swing.JButton("注册帐号");
            java.awt.Dimension d2=new java.awt.Dimension(100,30);
            bu_register.setPreferredSize(d2);
            frame.add(bu_register);

            //添加文本框
            javax.swing.JTextField jta_name2=new javax.swing.JTextField();
            java.awt.Dimension d3=new java.awt.Dimension(200,30);
            jta_name2.setPreferredSize(d3);
            frame.add(jta_name2);

            //创建按钮
            javax.swing.JButton bu_sec=new javax.swing.JButton("找回密码");
            java.awt.Dimension d4=new java.awt.Dimension(100,30);
            bu_sec.setPreferredSize(d4);
            frame.add(bu_sec);

            //记住密码复选框
            javax.swing.JCheckBox jcb1=new javax.swing.JCheckBox("记住密码");
            frame.add(jcb1);

            //找回密码复选框
            javax.swing.JCheckBox jcb2=new javax.swing.JCheckBox("找回密码");
            frame.add(jcb2);

            //创建按钮
            javax.swing.JButton bu_login=new javax.swing.JButton("登录");
            java.awt.Dimension d5=new java.awt.Dimension(300,30);
            bu_login.setPreferredSize(d5);
            frame.add(bu_login);

            //设置窗体显示出来
            frame.setVisible(true);

            //创建监听器
            ButtonListener bl=new ButtonListener();
            //给按钮加监听器
            bu_login.addActionListener(bl);

            //将文本框对象及窗口对象传至按钮监听器类
            bl.setJt1(jta_name1);

            bl.setJt2(jta_name2);

            bl.setJt3(frame);
        }
    }


