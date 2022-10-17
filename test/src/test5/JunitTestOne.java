package test5;
import org.junit.Assert;
import org.junit.Test;

/**类描述：
 *@author: zk
 *@date： 日期：2018-6-6 时间：下午3:56:17
 *@version 1.0
 */

public class JunitTestOne {

    @Test
    public void test() {
        System.out.println("测试一。。。");  
        Assert.assertTrue(true);  
    }

}