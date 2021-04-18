import java.util.*;

public class todo{
 private static Map<Integer,String>list=new HashMap<>();
public static void main(String[]args){
   Scanner kb = new Scanner(System.in);
   String choice="";
   
  
            System.out.println( "Welcome to TODO, here are your options");
            while(!choice.equals("-1")){
            
            System.out.println( "1.add task to list"+"\n"+"2.remove task from list"+"\n"+"3.view list"+"\n");
            choice =kb.nextLine();

           
      
            switch(choice) {
                
                case "1": 
                System.out.println("enter an item to add to the list: ");
                String a=kb.nextLine();
                add(a);
                break;
               case "2":
               System.out.println("enter the number of the list entry you want to remove: ");
              int  b=kb.nextInt();
                    remove(b);             
               break;
                case "3":
                view();
                break;
            }
            
            }
            kb.close();
}

public  static void view(){
int i=0;
for(String a:list.values()){
System.out.println(i+1+"."+a );
i++;
System.out.println();


}

}

public  static void add(String c){
    int i=1;
list.put(i,c);
i++;

}

public  static void remove(int  c){
list.remove(c);

}

}
