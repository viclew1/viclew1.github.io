package admin.admindatas;


public class Client {
	
	private String name,address;
	private boolean busy;
	private boolean connected;
	private boolean controlled;
    private boolean selected = false;
	
	public Client(String name, String address, boolean busy, boolean controlled, boolean connected)
	{
		this.name = name;
		this.address = address;
		this.busy = busy;
		this.connected = connected;
		this.controlled = controlled;
	}
	
	public String getName()
	{
		return name;
	}

	public String getAddress() {
		return this.address;
	}
	
	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	public boolean isBusy()
	{
		return busy;
	}

	public boolean isControlled()
	{
		return controlled;
	}
	
	public boolean isConnected()
	{
		return connected;
	}
	
	public void setBusy(boolean busy)
	{
		this.busy = busy;
	}
}
