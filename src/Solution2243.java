import java.util.ArrayList;
import java.util.List;

public class Solution2243 {
        public String digitSum(String s, int k) {
            if (s.length() < k) return s;
            StringBuilder asd = new StringBuilder();
            for (int i = 1, sum = 0; i <= s.length(); i++){
                sum += s.charAt(i - 1) - '0';
                if (i % k == 0 || i == s.length()){
                    asd.append(sum);
                    sum = 0;
                }
            }
            return digitSum(asd.toString(), k);
        }

    public static void main(String[] args) {
        Solution2243 sol = new Solution2243();
        sol.digitSum("11111222223", 3);
    }
}
