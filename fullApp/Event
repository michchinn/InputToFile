package fullApp;

import java.io.*;
import java.util.*;

import org.json.simple.*;
import org.json.simple.parser.*;

public class Event {
	public String _name;
	public String _abbreviation;
	public int _id;
	public ArrayList<Team> _teamList;
	
	public Event() {
		_name = "";
		_abbreviation = "";
		_id = 0;
		_teamList = new ArrayList<Team>();
	}

	public Event(String name, String abbreviation, int id) throws FileNotFoundException {
		_name = name;
		_abbreviation = abbreviation;
		_id = id;
		_teamList = new ArrayList<Team>();
		
		String teamsJson = "";
		File teamListFile = new File("data/" + abbreviation + "_teams.json");
		//InputStream teamListFile = ResourceLoader.load("/data/" + abbreviation + "_teams.json");
		 
		int teamNumber;
		String teamName;
			
			//if (teamListFile.exists()){
			
				teamsJson = new Scanner(teamListFile).useDelimiter("\\A").next();
			//} catch (IOException e) {
				//System.out.println("Team list file not found for" + abbreviation + ".");
			//}
			
			JSONParser parser = new JSONParser();
			JSONArray teamArray = null;
			try {
				teamArray = (JSONArray)((JSONObject)(parser.parse(teamsJson))).get("data");
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
			for (int i = 0; i < teamArray.size(); i++) {
				JSONObject eventObject = (JSONObject)(teamArray.get(i));
				teamName = (String)(eventObject.get("name"));
				teamNumber = Integer.parseInt((String)(eventObject.get("number")));
				_teamList.add(new Team(teamNumber, teamName));
			}
		//}
	}
	
	public String getName() {
		return _name;
	}
	
	public String getAbbreviation() {
		return _abbreviation;
	}
	
	public int getId() {
		return _id;
	}
	
	public ArrayList<Team> getTeamList() {
		return _teamList;
	}
	
}
