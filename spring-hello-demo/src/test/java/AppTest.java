import com.chenhao.ignoreDependency.IgnoreInterface;
import com.chenhao.ignoreDependency.IngoreInterfaceImpl;
import com.chenhao.spring.MyTestBean;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @author: ChenHao
 * @Description:
 * @Date: Created in 10:36 2019/6/19
 * @Modified by:
 */
public class AppTest {

	@Test
	public void MyTestBeanTest() {
		XmlBeanFactory bf = new XmlBeanFactory( new ClassPathResource("spring-config.xml"));
		// 对IgnoreInterface使用ingnoreDependency
//		bf.ignoreDependencyInterface(IgnoreInterface.class);
		MyTestBean myTestBean = (MyTestBean) bf.getBean("myTestBean");
		System.out.println(myTestBean.getName());
		IngoreInterfaceImpl ignoreInterface = (IngoreInterfaceImpl)bf.getBean("ii");
		System.out.println(ignoreInterface.getList());
		System.out.println(ignoreInterface.getList());
	}
}