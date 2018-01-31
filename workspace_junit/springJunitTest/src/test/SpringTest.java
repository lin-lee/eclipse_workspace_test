package test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import sun.rmi.runtime.Log;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath*:spring-applicationContext.xml" })
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
public class SpringTest {
	
	protected Log logger = LogFactory.getLog(TestBase.class);

}
