import java.io.*;
public class CopyFile {

   public static void main(String args[]) throws IOException {  
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
       System.out.println("Enter input file:");
       String input=br.readLine();
       System.out.println("Enter output file");
       String output=br.readLine();
       
       
      FileReader in = null;
      FileWriter out = null;

      try {
         //in = new FileInputStream(".\\input.txt");
         
         //in = new FileInputStream("C:\\Java_Training_2018\\Programs\\input.txt");
         //out = new FileOutputStream("output.txt");
         
         in = new FileReader("C:\\Training\\SAMPLES\\input.txt");
         out = new FileWriter("C:\\Training\\\\SAMPLES\\output.txt");
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
         System.out.println("File copied");
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}