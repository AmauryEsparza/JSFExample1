package beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="session2", eager=true)
@SessionScoped
public class Session{
	
	@ManagedProperty(value="#{user}")
	private User userBean;
	
	private String userName;
	
	public Session(){
		System.out.println("Session Started");
	}
	
	public String getUserName(){
		if(userBean != null){
			userName = userBean.getName();
		}
		return userName;
	}
	
	public void setUserBean(User user){
		this.userBean = user;
	}
	
	
}
