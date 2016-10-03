/**
 * 
 */
package caf.war.testDummyTasks.task1overview;

/**
 * @author SATM
 *
 */

import com.webmethods.caf.faces.data.task.TaskDisplayProvider;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

@ManagedBean(name = "Task1OverviewDefaultviewView")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(displayName = "Task1Overview/default", beanType = BeanType.PAGE)
public class Task1OverviewDefaultviewView extends com.webmethods.caf.faces.bean.BasePageBean {


	private static final long serialVersionUID = 1L;
	private static final String[][] INITIALIZE_PROPERTY_BINDINGS = new String[][] {
		{"#{activePreferencesBean.currentTab}", "TaskData"},
	};

	// binding the Task Display Provider to the current taskID (passed to the Portlet Bean via the URL)
	private TaskDisplayProvider taskDisplayProvider = null;
	private static final String[][] TASKDISPLAYPROVIDER_PROPERTY_BINDINGS = new String[][] { {
			"#{TaskDisplayProvider.taskID}", "#{Task1Overview.taskID}" }, };
	private transient caf.war.testDummyTasks.task1overview.Task1Overview task1Overview = null;
	private caf.war.testDummyTasks.taskclient.Task1 task1 = null;
	private static final String[][] TASK1_PROPERTY_BINDINGS = new String[][] {
		{"#{Task1.taskID}", "#{Task1Overview.taskID}"},
	};

	/**
	 * Initialize page
	 */
	public String initialize() {
		try {
		    resolveDataBinding(INITIALIZE_PROPERTY_BINDINGS, null, "initialize", true, false);
		} catch (Exception e) {
			error(e);
			log(e);
		}
		return null;	
	}

	/*
	 * Get the Task Display Provider for the current taskID
	 */
	public TaskDisplayProvider getTaskDisplayProvider() {
		if (taskDisplayProvider == null) {
			taskDisplayProvider = (TaskDisplayProvider) resolveExpression("#{TaskDisplayProvider}");
		}
		resolveDataBinding(TASKDISPLAYPROVIDER_PROPERTY_BINDINGS,
				taskDisplayProvider, "taskDisplayProvider", false, false);
		return taskDisplayProvider;
	}

	public caf.war.testDummyTasks.task1overview.Task1Overview getTask1Overview()  {
		if (task1Overview == null) {
		    task1Overview = (caf.war.testDummyTasks.task1overview.Task1Overview)resolveExpression("#{Task1Overview}");
		}
		return task1Overview;
	}

	public caf.war.testDummyTasks.taskclient.Task1 getTask1()  {
		if (task1 == null) {
		    task1 = (caf.war.testDummyTasks.taskclient.Task1)resolveExpression("#{Task1}");
		}
	
	    resolveDataBinding(TASK1_PROPERTY_BINDINGS, task1, "task1", false, false);
		return task1;
	}

}