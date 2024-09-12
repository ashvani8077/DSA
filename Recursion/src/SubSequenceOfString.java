import java.util.ArrayList;

public class SubSequenceOfString {
    public static void main(String[] args) {
        String str="ABC";
        ArrayList<String> li=getSub(str);
        System.out.println(li);
    }
    public static ArrayList<String> getSub(String str){
        if(str.length()==0){
            ArrayList<String> baseResult=new ArrayList<>();
            baseResult.add("");
            return baseResult;
        }
        char currentChar=str.charAt(0);
        String restOfString=str.substring(1);
        ArrayList<String> myResult=new ArrayList<>();
        ArrayList<String> recResult=getSub(restOfString);
        for (int i=0;i<recResult.size();i++){
            myResult.add(recResult.get(i));
            myResult.add(currentChar+recResult.get(i));
        }
        return myResult;
    }
}
