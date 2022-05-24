package chap01;

import java.util.*;

public class Basic01 {
    static boolean[] visited;
    static String[] answer;
    
    public String[] solution(String[][] tickets) {
        answer = new String[tickets.length + 1];
        
        visited = new boolean[tickets.length]; // �湮 ����
        ArrayList<String> list = new ArrayList<String>(); // ��� list 
        String route = "ICN"; // ���
        dfs(tickets, list, "ICN", route);
        
        Collections.sort(list);
        answer = list.get(0).split(",");
        return answer;
    }
    
    public void dfs(String[][] tickets, ArrayList<String> list, String depart, String route) {
       // depart : �����
    	for(int i = 0; i < tickets.length; i++) {
    		if(visited[i] == true) {
    			continue;
    		}
    		if(depart.equals(tickets[i][0])) {
    			visited[i] = true;
    			dfs(tickets, list, tickets[i][1], route + "," + tickets[i][1]);
    			
    			visited[i] = false;
    		}
    	}
    	
    	boolean end = true;
    	for(int i = 0 ; i < visited.length ; i++) {
    		if(visited[i] == false) {
    			end = false;
    		}
    	}
    	if(end) {
//    		String[] routeList = route.split(",");
    		list.add(route);
    	}
    }
}
