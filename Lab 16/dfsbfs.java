import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
class graph  {
	private Map<Integer,List<Integer>>adjList;

	public graph()
	{
		adjList=new HashMap<>();
	}

	public void addEdeg(int u,int v){
		adjList.putIfAbsent(u,new ArrayList<>());
		adjList.putIfAbsent(v,new ArrayList<>());
		adjList.get(u).add(v);
		adjList.get(v).add(u);//undirected graph
	}
	public void dfs(int start){
		Set<Integer>visited=new HashSet<>();
		dfsHelper(start,visited);
	}
	private void dfsHelper(int vertex,Set<Integer> visited)
	{
		visited.add(vertex);
		System.out.println(vertex+"");
		for(int neighbor:adjList.getOrDefault(vertex,new ArrayList<>()))
		{
			if(!visited.contains(neighbor)){
				dfsHelper(neighbor,visited);
			}
		}
	}


	public void bfs(int start)
	{
		Set<Integer>visited=new HashSet<>();
		Queue<Integer> queue=new LinkedList<>();
		visited.add(start);
		queue.add(start);

		while(!queue.isEmpty())
		{
			int vertex=queue.poll();
			System.out.println(vertex+"");
			for(int neighbor:adjList.getOrDefault(vertex,new ArrayList<>())){
				if(!visited.contains(neighbor))
				{
					visited.add(neighbor);
					queue.add(neighbor);
				}
			}
		}

	}
}
class dfsbfs  {
	public static void main(String[] args) {
		graph g=new graph();
		g.addEdeg(0,1);
		g.addEdeg(0,2);
		g.addEdeg(1,2);
		g.addEdeg(1,3);
		g.addEdeg(2,4);
		g.addEdeg(3,4);

		
		System.out.println("DFS starting form vartex :");
		g.dfs(0);
		System.out.println("\nBFS starting form vartex :");
		g.bfs(0);
	}
	
}