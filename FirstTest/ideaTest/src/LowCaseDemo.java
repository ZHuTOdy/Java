public class LowCaseDemo {
    public static void main(String[] args){
        String str = "LOVE";
        System.out.println(new LowCaseDemo().toLowerCase(str));
        System.out.println(str.toLowerCase());
    }
    public String toLowerCase(String str) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0;i < str.length();i++){
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z'){
                ch = (char)(ch + 32);
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}
