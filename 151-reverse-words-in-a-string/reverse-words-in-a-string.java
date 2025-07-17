class Solution {
    public String reverseWords(String s) {
        String str = "";
        char[] arr = s.toCharArray();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            char x = s.charAt(i);
            if (x == ' ' ) {
                if (!str.isEmpty()) {
                    list.add(str);
                    str = "";
                }

            } else {
                str += x;
                if( i == arr.length - 1){
                    list.add(str);
                }
            }
        }

        Collections.reverse(list);
        return String.join(" ", list);
    }
}