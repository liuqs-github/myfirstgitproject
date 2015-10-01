package com.base.dp.structure.facade;

public class Client {
	
	private SecurityFacade securityFacade;
	
	public SecurityFacade getSecurityFacade() {
		return securityFacade;
	}


	public void setSecurityFacade(SecurityFacade securityFacade) {
		this.securityFacade = securityFacade;
	}


	public static void main(String[] args) {
		Client c = new Client();
		c.setSecurityFacade(new SecurityFacade());
		c.active();
	}
	
	public void active(){
		securityFacade.turnOn();
	}
	
	public void deactive(){
		securityFacade.turnOff();
	}
}
