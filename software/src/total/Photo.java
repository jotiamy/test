package total;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
 
public class Photo extends JFrame{
	
		public  void main(int a) {
		
		//����ͼƬ  ·���ĳ�"src/resources/picture/girl.jpg"��Ȼ����
		ImageIcon image = new ImageIcon("bin/photo/"+a+".png");
		JLabel imageLabel = new JLabel(image);
		//����ͼƬ��λ�úʹ�С
		imageLabel.setBounds(500, 150, 500, 800);
		
		JFrame j = new JFrame();
		//���ñ���
		j.setTitle("��ʾͼƬ");
		//���ô��ڵĳ���λ�úʹ�С
		j.setBounds(500, 150, 500, 800);
		//���JLabel���
		j.add(imageLabel);
		//JFrame�ɼ�
		j.setVisible(true);
	}

}

