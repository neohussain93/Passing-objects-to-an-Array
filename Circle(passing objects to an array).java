package javaapplication12;

/**
 *
 * @author neoHussain
 */
public class Circle {
    
    int rad =1;
    static double area;
    String color;
    
    
    Circle(){
        
    }
    
    Circle(int rad){
        this.rad = rad;
    }
    
        void getArea (){ 

        System.out.println(rad*rad*3.14);
            }
    
    public static void main(String[] args) { //  to run code
        
         //------------------------ PASSING OBJECTS TO ARRAYS --------------------------------
         Circle [] cc = new Circle[3]; // ClassName [] ArrayName = new ClassName[lenngth];
         for(int i=0; i<cc.length; i++){
             cc[i] = new Circle(); // instantiating the Circles
             cc[i].rad= 1+i;  
         }
            for(int i=0; i<cc.length; i++){
                cc[i].getArea();
            }
        //--------------------- END -------------------------------------------------------- 
        
    }
  
}
