package T4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Test4 {

	public static void main(String[] args) {
		 List<Integer> lists= null ;
		 
		
		
        
//         for(int j =0;j<zyw.length; j++){
//        	 zyw[j ]=j *2;
//                    }
//         for(int e =0;e<zyw.length; e++){
//
//        	 System.out.println( zyw[e ]);
//         }
		 
         lists  =new ArrayList<Integer>();
         for(int i=1;i<100;i++){
        	for(int j=1;j<51;j++){
        		if(i/10!=0){
        			lists.add(i/10);
        			int i1=1;
        			int i2=i;
        			int i3=i;
        			 int zyw[]= {i1,i2,i3};
        		}
        		 
        	}
         }
         int[] zyw = new int[3];
        
        for(int w=0;w<3;w++) {lists.add(
        		 zyw[w]);}
         Map< Integer,Integer > m =new TreeMap<Integer ,Integer>();
         Set<Integer> s=m.keySet();
        
         int[] m1=new int[lists.size()];
         for(int n=1;n<lists.size();n++){
         	m1[n]=lists.get(n);
         	 System.out.println(m1[n]);
         	}
         for(int h=0;h<2;h++){
          
          	 System.out.println(zyw[h]);
          	}
        
 		Iterator<Integer> l = s.iterator();
 		
 		while(l.hasNext()){
// 			System.out.println(l.next());
// 			System.out.println(l2.next());
 		};
 		Collection<Integer> c=m.keySet();
 		Iterator<Integer> e = c.iterator();
 		while(e.hasNext()){
 			System.out.println(e.next());
 			
 		};
     
     



	}

}
