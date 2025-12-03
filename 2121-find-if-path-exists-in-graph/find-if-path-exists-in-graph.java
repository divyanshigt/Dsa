class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
List<List<Integer>>list=new ArrayList<>();
boolean vis[]=new boolean[n];
for(int i=0;i<n;i++){
    list.add(new ArrayList<>());
}
for(int[]e:edges){
list.get(e[0]).add(e[1]);
list.get(e[1]).add(e[0]);
}
Queue<Integer>q=new LinkedList<>();
q.add(source);
vis[source]=true;
while(!q.isEmpty()){
    int node=q.poll();
    if(node==destination) return true;
    for(int next:list.get(node)){
        if(!vis[next]){
            vis[next]=true;
            q.add(next);
        }
    }
}
return false;
    }
}