import java.util.*;
class Solution {
    static String [] words = {"A", "E", "I", "O", "U"};
    public int solution(String word) {
        int answer = 0;
        ArrayList<String> list = new ArrayList<>();
        dfs("", 0, list);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).equals(word)) {
                answer = i;
                break;
            }
        }
        return answer;
    }

    void dfs(String str, int len, ArrayList<String> list) {
        list.add(str);
        if (len == 5) return;
        for (int i = 0; i < 5; i++) {
            dfs(str + words[i], len + 1, list);
        }
    }

}