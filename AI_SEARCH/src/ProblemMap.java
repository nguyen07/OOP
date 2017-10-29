import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ProblemMap extends Problem {
	Map<String, Map<String, Double>> map;
	Map<String, Double> sld;
	
	public Object goalState;
	
	public ProblemMap(String mapfilename) throws Exception {
		map = new HashMap<String, Map<String, Double>>();
		//read map from file of source-destination-cost triples (tab separated)
    	BufferedReader reader = new BufferedReader( new FileReader (mapfilename));
        String line;
        while( ( line = reader.readLine() ) != null ) {
        	String[] strA = line.split("\t");
        	
        	String 	from_city = strA[0], 
        			to_city   = strA[1];
        	Double 	cost 	  = Double.parseDouble(strA[2]);
        	// save in the hashtable 
        	// Arad
        	// {Zerind=75.0}
        	//  Arad
        	// {Zerind=75.0, Sibiu=140.0}
        	//  Arad
        	// {Zerind=75.0, Sibiu=140.0, Timisoara=118.0}
        	
        	if(!map.containsKey(from_city)) 
        		map.put(from_city, new HashMap<String, Double>());
        	map.get(from_city).put(to_city,cost);
        	//System.out.println(from_city);
        	//System.out.println(map.get(from_city));
        	
        	//putting the reverse edge as well
        	if(!map.containsKey(to_city)) 
        		map.put(to_city, new HashMap<String, Double>());
        	map.get(to_city).put(from_city,cost);
        }
        reader.close();
	}
	
	public ProblemMap(String mapfilename, String heuristicfilename) throws Exception {
		this(mapfilename);
		
		sld = new HashMap<String, Double>();
    	BufferedReader reader = new BufferedReader( new FileReader (heuristicfilename));
        String line;
        while( ( line = reader.readLine() ) != null ) {
        	String[] strA = line.split("\t");
        
        	String 	city = strA[0]; 
        	double 	h 	 = Double.parseDouble(strA[1]);
        	//System.out.println(city + " " + h);
        	sld.put(city, h);
        	//System.out.println(sld.get(city));
        }
        reader.close();
	}
	boolean goal_test(Object state){
		return state.equals(goalState);
	}

	
	Set<Object> getSuccessors(Object state){
		Set<Object> result = new HashSet<Object>();
		for(Object successor_state : map.get(state).keySet()){
			result.add(successor_state);
		}
		return result;
	}
	
	double step_cost(Object fromState, Object toState){
		return map.get(fromState).get(toState);
	}
	
	public double h(Object state){
		return sld.get(state);
	}
	
	public static void main(String[] args) throws Exception {
		ProblemMap problem = new ProblemMap("src/romania.txt","src/romaniaSLD.txt");
		
		problem.initialState = "Timisoara";
		problem.goalState = "Bucharest";
		
		Search search  = new Search(problem);
		
		System.out.println("BreadthFirstTreeSearch:\t\t" + search.BreadthFirstTreeSearch());
		
		//System.out.println("BreadthFirstGraphSearch:\t" + search.BreadthFirstGraphSearch());
	}	
}
