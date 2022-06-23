import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class FunctionsInHashMap {

   public static void main(String[] args) {
      Map<Integer,String>hm=new HashMap<Integer,String>();
      
      //1)put
      hm.put(1,"Apoorv");
      hm.put(2,"Ajay");
      hm.put(3,"Himanshu");
      hm.put(4,"Avinash");
      hm.put(5,"Ashish");
      hm.put(5,"Apoorv");
      
      //2)isEmpty()
      if(hm.isEmpty()) {
        System.out.println("Map is empty");
     }
     else {
        System.out.println("Map is not empty");
     }
      
     //3Remove
      hm.remove(1);
      System.out.println(hm);
   	
      //4.containsKey()
      System.out.println("contains key "+hm.containsKey(2));
      
      //5.equals()
      HashMap<Integer , String> hm1 = new HashMap<>();
      System.out.println("Equals  "+hm.equals(hm1));
   
      //6.get
      System.out.println("Get  "+hm.get(1));
      
      //7.containsValue()
      System.out.println("containsValue  "+hm.containsValue("Apoorv"));
      
      //8.size()
      System.out.println("Size  "+hm.size());
      
      //9.keySet
      System.out.println("KeySet  "+hm.keySet());
      
      //10.entrySet
      System.out.println("EntrySet  "+hm.entrySet());
      
      
      //11 putAll
      System.out.println("Size before putAll: "+hm1.size());
   	  hm1.putAll(hm);
   	  System.out.println("Size after putAll: "+hm1.size()); 
   	  
   	  //12.replace()
   	  System.out.println("Value replaced is: "+hm.replace(5 , "Praduman"));
   	  
   	  //13.getOrDefault(Object key, V defaultValue)
   	  System.out.println("GetOrDefault: "+hm.getOrDefault(15 , "defaultValue"));
   	  
   	  //14. putIfAbsent(K key, V value)
   	  System.out.println("Put if absent: "+hm.putIfAbsent(5 , "defaultValue"));
   	  
   	  //15.printing hashmap
   	  System.out.println("Values in HashMap: ");
   	  Set<Entry<Integer, String>> set = hm.entrySet();
   	  for(Entry<Integer, String> setObj:set ) {
		String val = setObj.getValue();
		//System.out.println("Policy id: "+insuranceObj.nPolicyID + " ,Policy Holder Name "+ insuranceObj.policyHoldersName + " ,Insurance Amount: "+insuranceObj.insuranceAmt);
		System.out.println(val);
	}
   	  
   	  
   	  }
   }
