/**
 * 
 */
package caf.war.testDummyTasks.portlet1;

/**
 * @author SATM
 *
 */

import javax.portlet.PortletPreferences;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

@ManagedBean(name = "Portlet1")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(displayName = "Portlet1", beanType = BeanType.PORTLET)
public class Portlet1  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	public static final String[] PREFERENCES_NAMES = new String[] {};
	private transient caf.war.testDummyTasks.TestDummyTasks testDummyTasks = null;
	
	/**
	 * Create new preferences bean with list of preference names
	 */
	public Portlet1() {
		super(PREFERENCES_NAMES);
	}
	
	/**
	 * Call this method in order to persist
	 * Portlet preferences
	 */
	public void storePreferences() throws Exception {
		updatePreferences();
		PortletPreferences preferences = getPreferences();
		preferences.store();
	}

	public caf.war.testDummyTasks.TestDummyTasks getTestDummyTasks()  {
		if (testDummyTasks == null) {
		    testDummyTasks = (caf.war.testDummyTasks.TestDummyTasks)resolveExpression("#{TestDummyTasks}");
		}
		return testDummyTasks;
	}
}