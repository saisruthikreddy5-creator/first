import java.util.HashMap;

public class string {
    public int wordcount(String word){
        int count=0;
        for(int i=0;i<word.length();i++){
if(word.charAt(i)!=' ')
       count++;


        }
        return count;
    }
    public String removeempty(String s){
        return s.replaceAll(" ","");
    }
    public void findduplicate(String s) {
        HashMap<String,Integer> map=new HashMap();
        for (int i = 0; i < s.length(); i++) {
            String charecter=""+s.charAt(i);
            if(map.containsKey(charecter))
            {

                int count = map.get(charecter) + 1;
                map.put(charecter, count);}

            else {
                map.put(charecter,1);
            }
        }
        for(String m : map.keySet()){
            if(map.get(m)>1)
            System.out.println(m+"      "+map.get(m));
        }
    }
}
