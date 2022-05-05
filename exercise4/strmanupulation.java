class StrManupulation
{
	public static void main(String[] args)
	{
        // new string using new
        char chs[]={'w','e','l','c','o','m','e'};
        String newStr = new String(chs);
        System.out.println("New string from char[] using new string:" +newStr);
        
        
        
        byte asciis[] = {65,66,67,68,69,70};
        newStr = new String(asciis);
        System.out.println("New string from byte[] using new string:" +newStr);


	       
	 String s1 = "good";
	 String s2= "Moring";
	       
	 //string length
	 System.out.println("string length of 'good' :" +s1.length());
	 	
	 	
	 //to uppercase and lowercase
	 System.out.println("------------string case change---------------");
	 System.out.println(s1 + "to uppercase :"+ s1.toUpperCase());
	 System.out.println(s2 + "to lowercase :"+ s2.toLowerCase());	

	//string concatenation
	 System.out.println("------------string concatenation---------------");
         System.out.println("using concat():"+ s1.concat(s2));
	 System.out.println("using + operator:"+ s1 + s2);	
	
	//character extraction
	 System.out.println("------------character extraction---------------");
	 System.out.println("character at 3rd position :"+ s1.charAt(3));
	 char c[] = new char[5];
	 s1.getChars(2,4,c,0);
	 System.out.println("character between 2 and 4 :"+ new String(c));
	 
	//character comparison
        System.out.println("---------Character Comparison----------");
        s1="welcome";
        s2="WELCOME";
        System.out.println(s1 + " Equals " + s2 + " : " +s1.equals(s2));
        System.out.println(s1 + "equalsIgnoreCase " + s2 + " : " +s1.equalsIgnoreCase(s2));
       
        System.out.println(s1 + " compareTo " + s2 + " : " + s1.compareTo(s2));
        System.out.println(s1 + " compareToignoreCase " + s2 + " : " + s1.compareToIgnoreCase(s2));


	 
	//startsWith and endsWith
        System.out.println("---------startswith and endswith----------");
        System.out.println(s1+ " startsWith 'w':" + s1.startsWith("w"));
        System.out.println(s1+ "ends with 'm':" + s1.endsWith("m"));
        
        
        
        //searcing substring
        System.out.println("---------Character Substring----------");
        String s3="Hello welcome to java,thank you";
        System.out.println("First occurence of 'this' in '" +s3+ "' is: " + s3.indexOf("this"));
        System.out.println("Last occurence of 'java' in '" +s3+ "' is: " + s3.lastIndexOf("java"));
       
        //modifying a string
        System.out.println("---------Modifying a string----------");
        System.out.println("Substring of the string '" +s3+ "' from (5,18) is: " + s3.substring(5,18));
        System.out.println("Replacing 'java' with 'python' in '" +s3+ "' : " + s3.replace("java","python"));
       
        //Data Conversion
        System.out.println("---------Data Conversion----------");
        int s4=50;
        System.out.println("Data Conversion of " +s4+ " is: " +String.valueOf(s4));




       }
}






/*output



New string from char[] using new string:welcome
New string from byte[] using new string:ABCDEF
string length of 'good' :4

------------string case change---------------
goodto uppercase :GOOD
Moringto lowercase :moring


------------string concatenation---------------
using concat():goodMoring
using + operator:goodMoring


------------character extraction---------------
character at 3rd position :d
character between 2 and 4 :od


---------Character Comparison----------
welcome Equals WELCOME : false
welcomeequalsIgnoreCase WELCOME : true
welcome compareTo WELCOME : 32
welcome compareToignoreCase WELCOME : 0


---------startswith and endswith----------
welcome startsWith 'w':true
welcomeends with 'm':false


---------Character Substring----------
First occurence of 'this' in 'Hello welcome to java,thank you' is: -1
Last occurence of 'java' in 'Hello welcome to java,thank you' is: 17


---------Modifying a string----------
Substring of the string 'Hello welcome to java,thank you' from (5,18) is:  welcome to j
Replacing 'java' with 'python' in 'Hello welcome to java,thank you' : Hello welcome to python,thank you

---------Data Conversion----------
Data Conversion of 50 is: 50
*/
       
