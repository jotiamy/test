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
        
        System.out.println("请输人选择的实现方式:1.主程序-子程序  2.面向对象  3.事件系统    4.管道-过滤");
        Scanner sc =new Scanner(System.in);
        int flag=sc.nextInt();
        if(flag==1) {
        	demo1.main(args);
        	pt.main(flag);
        	System.out.println("");
        	System.out.println("文件已由主程序-子程序方式更改");
        	}
        else if (flag==2) {
        	demo2.main(args);
        	pt.main(flag);
        	System.out.println("文件已由面向对象方式更改");
        }
        else if(flag==3) {
        	demo3.main(args);
        	pt.main(flag);
        	System.out.println("文件已由事件系统方式更改");
        }
        else if(flag == 4) {
        	demo4.main(args);
        	pt.main(flag);
        	System.out.println("文件已由管道-过滤方式更改");
        }
        else {
        	System.out.print("输入有误");
        }
        }
}

