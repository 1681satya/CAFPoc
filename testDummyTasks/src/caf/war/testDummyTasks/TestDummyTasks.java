/**
 * 
 */
package caf.war.testDummyTasks;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * @author SATM
 *
 */
@ManagedBean(name = "TestDummyTasks")
@ApplicationScoped
@DTManagedBean(displayName = "testDummyTasks", beanType = BeanType.APPLICATION)
public class TestDummyTasks extends com.webmethods.caf.faces.bean.BaseApplicationBean 
{
	public TestDummyTasks()
	{
		super();
		setCategoryName( "CafApplication" );
		setSubCategoryName( "testDummyTasks" );
	}
}