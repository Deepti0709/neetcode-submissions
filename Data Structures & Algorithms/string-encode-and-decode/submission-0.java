class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder("");
        for(String s: strs){

            sb.append(s.length()+"#"+s);
        }
        String finalstr=sb.toString();
        return finalstr;
    }

    public List<String> decode(String str) {
        List<String> decoded=new ArrayList<>();
        int strlen=str.length();
        int len=0;
        for(int i=0;i<strlen;i++){
            while(Character.isDigit(str.charAt(i))){
                len=len*10+(str.charAt(i)-'0');
                i++;
            }
            if(str.charAt(i)=='#'){
                String substr=str.substring(i+1,i+1+len);
                decoded.add(substr);
                i+=len;
            }
            len=0;
        }
        return decoded;
    }
}
