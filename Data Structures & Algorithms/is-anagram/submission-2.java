class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        Hashtable<Character,Integer>ht1=new Hashtable<>();
        Hashtable<Character,Integer>ht2=new Hashtable<>();
        for(char ch:s.toCharArray()){
            if(ht1.containsKey(ch)){
                int n=ht1.get(ch);
                ht1.put(ch,n+1);
            }
            else{
                ht1.put(ch,1);
            }
        }
        for(char ch:t.toCharArray()){
            if(ht2.containsKey(ch)){
                int n=ht2.get(ch);
                ht2.put(ch,n+1);
            }
            else{
                ht2.put(ch,1);
            }
        }
        boolean isEqual=ht1.equals(ht2);
        return isEqual;
    }
}
