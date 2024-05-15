import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(bf.readLine()); // 숫자 개수
		Set<Integer> set = new HashSet<>(); // 중복제거용 set
		ArrayList<Integer> arr = new ArrayList<>(); // 정렬용 arraylist

		String[] str = bf.readLine().split(" ");
		int[] nums = new int[n]; // 기존 숫자 저장용 배열

		for (int j = 0; j < n; j++) {
			int temp = Integer.parseInt(str[j]);
			set.add(temp); 
			nums[j] = temp;
		} // 숫자 set과 배열에 저장

		for (int s : set) {
			arr.add(s); 
      	// set에 있는 숫자들 arraylist로 이동
		}

		Collections.sort(arr);

		for (int j = 0; j < n; j++) {
			bw.write(binary(arr, nums[j]) + " "); 
      	// 이진탐색하고, 숫자가 있는 위치 반환
      	// 위치 = 해당 숫자보다 작은 숫자의 수
		}

		bw.flush();
		bw.close();

	}

	public static int binary(ArrayList<Integer> a, int data) {
    // 이진 탐색
		int start = 0;
		int end = a.size();

		while (start < end) {
			int mid = (start + end) / 2; // 중간값
			if (a.get(mid) >= data) { // 찾으려는 숫자보다 같거나 크면
				end = mid; // 그 뒤의 숫자는 필요 없음
			} else { // 작으면
				start = mid + 1; // 앞의 값은 필요없음 
			}
		}

		return end; // 인덱스 값 반환
	}
}