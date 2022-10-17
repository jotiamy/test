package total;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
 
public class Photo extends JFrame{
	
		public  void main(int a) {
		
		//引入图片  路径改成"src/resources/picture/girl.jpg"依然可以
		ImageIcon image = new ImageIcon("bin/photo/"+a+".png");
		JLabel imageLabel = new JLabel(image);
		//设置图片的位置和大小
		imageLabel.setBounds(500, 150, 500, 800);
		
		JFrame j = new JFrame();
		//设置标题
		j.setTitle("显示图片");
		//设置窗口的初试位置和大小
		j.setBounds(500, 150, 500, 800);
		//添加JLabel组件
		j.add(imageLabel);
		//JFrame可见
		j.setVisible(true);
	}

}

