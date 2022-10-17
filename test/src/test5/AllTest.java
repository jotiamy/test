package test5;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**类描述：
 *@author: zk
 *@date： 日期：2018-6-6 时间：下午4:00:06
 *@version 1.0
 */

@RunWith(Suite.class)
@SuiteClasses({ JunitTestOne.class,JunitTestTwo.class })
public class AllTest {

}