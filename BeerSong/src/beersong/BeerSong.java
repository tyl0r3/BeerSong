
package beersong;

//author @tylerm874@gmail.com

public class BeerSong {
  
    public static void  Ninety_Nine_Bottles_of_Beer(){
       for(int i=99; i > 0; i--){
       System.out.println(i +" Bottles of beer on the wall, " + i +" bottles of beer");
       System.out.println("Take one down, pass it around, " + (i-1) + " bottles of beer on the wall");

       }
     //this method will loop through and sing the song 
    }
   
    
    public static void main(String[] args) {
        //this calls the bottles of beer method 
       Ninety_Nine_Bottles_of_Beer();
    }
    
}
