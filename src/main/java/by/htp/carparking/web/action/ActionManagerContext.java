package by.htp.carparking.web.action;

//import static by.htp.carparking.web.util.WebConstantDeclaration.*;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.context.WebApplicationContext;

import by.htp.carparking.web.action.impl.CarListViewAction;
import by.htp.carparking.web.action.impl.OrderCarAction;
import by.htp.carparking.web.action.impl.ReturnCarAction;

public final class ActionManagerContext {
	
	private ActionManagerContext(){	
	}
	
	public static BaseAction getAction(String action,
				WebApplicationContext webApplicationContext){
		return (BaseAction) webApplicationContext.getBean(action);
	}
}
