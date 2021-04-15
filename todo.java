import java.util.*;
public class todo{
ArrayList<String>list=new ArrayList<>();
public static void main(String[]args){

}

public  static void view(){
String[]a=list.toArray();
for(int i=0;i<a.length;i++){
System.out.println(a[i]);
}

}

public  static List<String> add(String c){
list.add(c)

}

public  static List<String> remove(String c){
list.remove(c);

}

}
