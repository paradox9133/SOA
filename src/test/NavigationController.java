package test;

import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;


/**
 * 
 */

/**
 * @author adam
 *
 */
@RequestScoped
public class NavigationController {
	
	public String showPage(String pageId){
		
		if(pageId == null){
			return "index";
		}
		if(pageId.equals("1")){
			return "show";
		}else if(pageId.equals("2")){
			return "add";
		}else if(pageId.equals("3")){
			return "delete";
		}else if(pageId.equals("4")){
			return "edit";
		}else
			return "index";
	}
	public String moveToIndex(){
		return "index";
	}
}
