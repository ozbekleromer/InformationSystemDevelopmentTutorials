package ozbek.BYT8.Lab2A.edu.ncsu.monopoly;

public abstract class Cell implements IOwnable {
	private boolean available = true;
	private String name;
	protected Player theOwner;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Player getOwner() {
		return theOwner;
	}
	
	@Override
	public int getPrice() {
		return 0;
	}

	@Override
	public boolean isAvailable() {
		return available;
	}
	
	public abstract void playAction();

	@Override
	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void setOwner(Player theOwner) {
		this.theOwner = theOwner;
	}
    
    @Override
	public String toString() {
        return name;
    }
}
