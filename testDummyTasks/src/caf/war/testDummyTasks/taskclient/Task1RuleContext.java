package caf.war.testDummyTasks.taskclient;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

@ManagedBean(name = "Task1RuleContext")
@SessionScoped
@DTManagedBean(displayName = "Task 1 Rule Context", beanType = BeanType.DEFAULT)
public class Task1RuleContext  extends  com.webmethods.caf.faces.data.task.impl.BaseTaskRuleContext {
}