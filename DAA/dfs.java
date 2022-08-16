import java.util.*;

public class dfs {

    static class Edge{
        int src;
        int des;
        Edge(int s, int d){
            this.src=s;
            this.des=d;
        }
    }


    public static void printAllPath(ArrayList<Edge>[] graph, int src, int dest, boolean[] visited, String psf){

        if(src==dest){
            System.out.println(psf+src);
            return;
        }

        visited[src]=true;
        for(Edge e:graph[src]){
            if(visited[e.des]==false){

                printAllPath(graph,e.des, dest, visited, psf+e.src);
            }
        }

        visited[src]=false;
    }






    
    public static void main(String[] args) {
        // given vertices count
        // all the verticel   
        //source 
        // destination

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

            graph[v1].add(new Edge(v1,v2));
            graph[v2].add(new Edge(v2,v1));

        }

        int start=sc.nextInt();
        int dest=sc.nextInt();



    boolean[] visited=new boolean[vertices];

    printAllPath(graph,start,dest,visited,"");


    }
    
}
