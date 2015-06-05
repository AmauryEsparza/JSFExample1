package beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="user", eager=true)
@SessionScoped
public class User implements Serializable{
	
	private String userName = "Amaury";

	public String getName(){
		return userName;
	}
}
