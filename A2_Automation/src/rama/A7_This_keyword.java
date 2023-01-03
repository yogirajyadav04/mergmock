package rama;

public class A7_This_keyword {
	
	 /*   static int a=10;
	           int b=20;
	           
	            
	  A7_This_keyword ()
	  {
		  b=100;
	  }
	   
	  A7_This_keyword (int g)
	  {
		  b=200;
	  }
	           
	  void test()
	  {
		  System.out.println(a);
		  System.out.println(b);
		  
	   }
	  
	  public static void main(String[] args) {
		
		  A7_This_keyword j= new A7_This_keyword();  // if non static variable called in non static then object of non static method used for non static variable 
		        j.test();////j.b
		  A7_This_keyword k= new A7_This_keyword(40);      
		        k.test(); ////k.b	  
	*/
	
	              //global variable        
	
	         static int a=10;
                    int b=20;
	 
             void test()
              	    {
            	 // local variable
            	      int a=100;
                      int b=200;
              		  System.out.println(a);
              		  System.out.println(b);
              		  System.out.println(this.a);
             		  System.out.println(this.b);
              	     }        
	
             public static void main(String[] args) {
         		
       		  A7_This_keyword j= new A7_This_keyword();
       		      j.test();
       		      
       		// SUPER KEYWORD:-  super keyword is used to call global variable of super class in sub class(extended) having same name .    
       		
      /*
               void test()
              	    {
              		  System.out.println(super.a);
             		  System.out.println(super.b);
              	     }   		      
       */
       		      
	}
}
	  
	  


