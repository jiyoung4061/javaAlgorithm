package mainPackage;

import chap01.Basic01;

public class index {

	public static void main(String[] args) {
		// 프로그래머스 dfs - 여행경로 문제
		Basic01 b = new Basic01();
		String[][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};
		
		b.solution(tickets);
	}

}
