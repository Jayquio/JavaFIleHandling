import java.io.File;
 import java.io.IOException;

 
class Filecreation{
    

    
    public static void main(String[] args){
        File textFile = new File("main.txt");
        

        try{

            if(textFile.createNewFile()){
                System.out.println("File is Created");
            
            }else {
                System.out.println("File is existing already");
            }

            System.out.println("File successfully!");

        } catch (IOException e){
            System.out.println("nag error sya");

        }
    
    
     }
}