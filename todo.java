import java.util.*;

public class todo{
 private static ArrayList<String>list=new ArrayList<>();
public static void main(String[]args){
   Scanner kb = new Scanner(System.in);
   String choice="";
   
  
            System.out.println( "Welcome to TODO, here are your options");
            while(!choice.equals("-1")){
            
            System.out.println( "1.add task to list"+"\n"+"2.remove task from list"+"\n"+"3.view list"+"\n");
            choice =kb.nextLine();

           
      
            switch(choice) {
                
                case "1": 
                String a=kb.nextLine();
                add(a);
                break;
               case "2":
               String b=kb.nextLine();
                    remove(b);             
               break;
                case "3":
                view();
                break;
            }
            
            }
}

public  static void view(){
Object[]a=list.toArray();
for(int i=0;i<a.length;i++){
System.out.println(i+1+"."+a[i] );
System.out.println();


}

}

public  static void add(String c){
list.add(c);

}

public  static void remove(String c){
list.remove(c);

}

}
