package total;
import java.io.IOException;
import java.util.Scanner;
import method_1.*;
import method_2.*;
import method_3.*;
import method_4.*;
public class Main {
    public static  void main(String[] args) throws IOException {
        method_1.demo1 demo1=new method_1.demo1();
        
        method_2.Main demo2 =new method_2.Main();

       method_3.Main1 demo3 =new  method_3.Main1();

        method_4.Main demo4 =new method_4.Main();

        Photo pt=new Photo();
        
        System.out.println("������ѡ���ʵ�ַ�ʽ:1.������-�ӳ���  2.�������  3.�¼�ϵͳ    4.�ܵ�-����");
        Scanner sc =new Scanner(System.in);
        int flag=sc.nextInt();
        if(flag==1) {
        	demo1.main(args);
        	pt.main(flag);
        	System.out.println("");
        	System.out.println("�ļ�����������-�ӳ���ʽ����");
        	}
        else if (flag==2) {
        	demo2.main(args);
        	pt.main(flag);
        	System.out.println("�ļ������������ʽ����");
        }
        else if(flag==3) {
        	demo3.main(args);
        	pt.main(flag);
        	System.out.println("�ļ������¼�ϵͳ��ʽ����");
        }
        else if(flag == 4) {
        	demo4.main(args);
        	pt.main(flag);
        	System.out.println("�ļ����ɹܵ�-���˷�ʽ����");
        }
        else {
        	System.out.print("��������");
        }
        }
}

