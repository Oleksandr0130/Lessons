package lessons_14;

public class task2 {
    public static void main(String[] args) {
        String str = "0123456789";
        System.out.println(substring(str, 2, 5));

    }

    public static String substring(String string, int startIdx, int endIdx){
        String result = "";
        if (string == null || startIdx < 0 || endIdx >= string.length() || endIdx <= startIdx ) return result;

        char[] chars = new char[endIdx - startIdx];

        for (int i = 0; i < chars.length; i++){
            chars[i] = string.charAt(i + startIdx);
        }
       // return result;
        return String.valueOf(chars);
    }

}
