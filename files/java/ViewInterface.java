package java;

public interface ViewInterface {
 
	private ControllerInterface controllerInterface;
	 
	private ControllerInterface controllerInterface;
	 
	private ControllerInterface controllerInterface;
	 
	private ControllerImpl controllerImpl;
	 
	private User user;
	 
	public abstract void setController(ControllerInterface controller);
	public abstract void start();
	public abstract void readCredentials();
	public abstract User getUser();
	public abstract void welcome(String msg);
	public abstract void kickOff(String msg);
}
 
