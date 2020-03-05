class Finally{
    public static void main(String[] args) {
        // int data=100/0; 
        try
        {  
            int data=100/0;  
        }
        catch(Exception e)
        {
            System.out.println("tess..."); 
        }  
        finally
        {
            System.out.println("finally block is always executed");
        }
          
        //rest code of the program   
        System.out.println("rest of the code...");  
    }   
}