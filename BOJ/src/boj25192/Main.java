package boj25192;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		HashMap<String, Integer> list = new HashMap<String, Integer>();
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;

		while (n-->0) {
			String input = br.readLine();
			if (input.equals("ENTER")) {	//입장했을경우
				list.clear();
				list.put(input, 0);
			} else if (!list.containsKey(input)) {	//리스트에 없을경우
				cnt++;
				list.put(input, null);
			}

		}

		System.out.println(cnt);
		br.close();
	}

}
