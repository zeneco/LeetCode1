class Solution3174 {
    public String clearDigits(String s) {
        int c = 0;
        StringBuilder asd = new StringBuilder(s);

        while (c < asd.length()) {
            if(Character.isDigit(asd.charAt(c))){
                asd.deleteCharAt(c);
                asd.deleteCharAt(c - 1);
                c--;
            } else{
                c++;
            }
        }
        return asd.toString();
    }

    public String clearDigits2(String s){
        StringBuilder asd2 = new StringBuilder();
        for (char c : s.toCharArray()) {
            if(Character.isDigit(c)){
                if (asd2.length() > 0){
                    asd2.deleteCharAt(asd2.length() - 1);
                }
            } else {
                asd2.append(c);
            }
        }
        return asd2.toString();
    }

    public static void main(String[] args) {
        Solution3174 sol = new Solution3174();
        System.out.println(sol.clearDigits2("aa1bb2cc33"));
        System.out.println(sol.clearDigits("aa1bb2cc33"));
    }
}
