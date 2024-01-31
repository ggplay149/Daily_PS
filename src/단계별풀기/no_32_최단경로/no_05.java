package 단계별풀기.no_32_최단경로;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

class edge{
    int from;
    int to;
    int cost;
    public edge(int from, int to, int cost){
        this.from = from;
        this.to = to;
        this.cost = cost;
    }
}
public class no_05{
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int nodeNum = Integer.parseInt(st.nextToken());
        int edgeNum = Integer.parseInt(st.nextToken());
        long INF = Long.MAX_VALUE;

        long[] minDistance = new long[nodeNum+1];

        List<edge> edgeList = new ArrayList<>();

        for(int i = 0 ; i < edgeNum ; i++){
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            edge temp = new edge(from,to,cost);
            edgeList.add(temp);
        }

        Arrays.fill(minDistance,INF);
        minDistance[1] = 0;

        for(int i = 1 ; i < nodeNum+1 ; i ++){
            for(edge e : edgeList){
                if(minDistance[e.from] == INF) continue;
                if(minDistance[e.to]>minDistance[e.from]+e.cost){

                    minDistance[e.to] =minDistance[e.from]+e.cost;

                    if( i == nodeNum ){
                        System.out.println(-1);
                        System.exit(0);
                    }
                }
            }
        }

        for(int i = 2 ; i < nodeNum+1 ; i++){
            if(minDistance[i] == INF) System.out.println(-1);
            else System.out.println(minDistance[i]);
        }
    }
}
