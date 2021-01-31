public class Graph {
    
    Vertex[] arrayofLists;
    int indexcounter=0;
    boolean undirected =true;

    class Node{
        public int vertexIdx;
        public Node next;
        public Node(int vertexIDx, Node node){
            this.vertexIdx=vertexIDx;
            this.next=node;
        }
    }
    class Vertex{
        String name;
        Node adjList;
        public Vertex(String name, Node anode){
            this.name=name;
            this.adjList=anode;
        }
    }
    public Graph(int Vcount, String graphType ){
        if(graphType.equals("directed")){
            undirected=false;
        }
        arrayofLists=new Vertex[Vcount];
    }
    public void addVertex(String name){
        arrayofLists[indexcounter]=new Vertex(name,null);
        indexcounter++;
    }
    public void addEdge(String x1, String x2){
        int p=indexforname(x1);
        int q=indexforname(x2);
        arrayofLists[p].adjList=new Node(q,arrayofLists[p].adjList);
        if(undirected){
            arrayofLists[q].adjList=new Node(p,arrayofLists[q].adjList);
        }
    }
    public int indexforname(String xox){
        for(int i=0;i<arrayofLists.length;i++){
            if(arrayofLists[i].name.equals(xox)){
                return i;
            }
        }
        return -1;
    }
    public void print(){
        for(int i=0;i<arrayofLists.length;i++){
            System.out.println(arrayofLists[i].name);
            for(Node anode=arrayofLists[i].adjList;anode!=null;anode=anode.next){
                System.out.println(" --> "+ arrayofLists[anode.vertexIdx].name);
            }
            System.out.println("\n");
        }
       
       
    }
}
