import java.util.List;
import java.util.ArrayList;
public class Search {
	Problem problem;
	
	public Search(Problem problem){ this.problem = problem;}
	
	//Tree-search methods
	public String BreadthFirstTreeSearch(){
		return TreeSearch(new FrontierFIFO());
	}
	private Node MakeNode(Object state){
		// let node be a new node
		Node node = new Node();
		node.state = state;
		node.parent_node = null;
		node.path_cost = 0;
		node.depth = 0;
		return node;
	}
	
	// Create a string to print solution
	private String Solution(Node node)
	
	//For statistic purpose
	int cnt; // count expansion
	List<Node> node_list;
	Node initialNode; // store all nodes ever generated
	private String TreeSearch(Frontier frontier){
		//initial the frontier using the initial state of problem
		cnt = 0;
		node_list = new ArrayList<Node>();
		
		initialNode = MakeNode(problem.initialState);
		
		//add the node to the node list
		node_list.add(initialNode);
		
		//initialize the frontier
		frontier.Insert(initialNode);
		while(true){
			
			//if the frontier is empty then return failure
			if(frontier.isEmpty()){
				return null;
			}
			//remove node n from the frontier
			Node node = frontier.remove();
			
			//if n contains a goald state then return corresponding solution
			if(problem.goal_test(node.state)){
				return Solution(node);
			}
			
			// if tje state of n is not in explored,
			//      add the state of n to explored
			//      expand n adding the resulting nodes to the frontier
			frontier.insertAll(Expand(node,problem));
			cnt++;
		}
		
		
	}
}
