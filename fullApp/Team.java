package fullApp;

public class Team {
	
	public int _number;
	public String _name;
	
	public Team(int number, String name) {
		_number = number;
		_name = name;
	}
	
	public int getNumber() {
		return _number;
	}
	
	public String getName() {
		return _name;
	}

	public String toString() {
		return "" + _number;
	}
}
