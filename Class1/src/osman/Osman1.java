

package osman;

import java.io.*;
import java.util.*;
import javax.swing.*;

class Osman1 {
    
    public void anything () throws IOException{
    
 Scanner hello = new Scanner(new File("hello.txt")); // this is where the file name goes
    
 String white = hello.next();
  hello.close();
        System.out.println(white);
 
        
        PrintWriter Blue = new PrintWriter(new FileWriter("hello.txt", true));
        Blue.append("Bye");// put at end or nex to
        
        Blue.println("Bye");//puts on a new line
        Blue.close();
        
        
        String name;
        while (){
            
        name = JOptionPane.showInputDialog("Enter your name");
        
        
        
        
        }
    }
}
