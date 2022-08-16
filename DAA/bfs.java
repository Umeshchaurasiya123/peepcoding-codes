import java.util.*;
public class bfs {

    static class Edge{
        int src;
        int dest;
        int wt;

        Edge(int s, int d, int wt){

            this.src=s;
            this.dest=d;
            this.wt=wt;
        }
    }

    public static void bfs(ArrayList<Edge>[] graph, int start){

        // bfs implmented by queue
        ArrayDeque<Integer> q=new ArrayDeque<>();
        boolean[] visited=new boolean[graph.length];

        q.add(start);

        while(q.size()>0){
            // remove
            int v=q.removeFirst();
            // marked

            if(visited[v]==true){
                continue;
            }

            visited[v]=true;

            // work
            System.out.print(v+" ");

            // add neigbour

            for(Edge e:graph[v]){
                if(visited[e.dest]==false){
                    q.add(e.dest);
                }
            }
        }


    }




    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int vertices=sc.nextInt();
        // now have to store graph 

        ArrayList<Edge> [] graph=new ArrayList[vertices];
        // create simple array in which each eleement store arraylist
        // here we have to inicialize eaxh arraylist with memory
        for(int i=0;i<vertices;i++){

            graph[i]=new ArrayList<>();
        }

        int edge=sc.nextInt();

        for(int i=0;i<edge;i++){
            int v1=sc.nextInt();
            int v2=sc.nextInt();
            int wt=sc.nextInt();

            graph[v1].add(new Edge(v1,v2,wt));
            graph[v2].add(new Edge(v2,v1,wt));

        }

        int start=sc.nextInt();

       // boolean [] visited =new boolean[vertices];

        bfs(graph,start);

    }
    
}
