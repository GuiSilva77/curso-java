package entities;

public class Rent {
	private String name;
	private String email;
	private int room;

	public Rent(String name, String email, int room) {
		super();
		this.name = name;
		this.email = email;
		this.room = room;
	}

	@Override
	public String toString() {
		return String.format("%d: %s, %s", room, name, email);
	}

}
