
package javaapplication451;
public class JavaApplication451 {
   
    public static void main(String[] args) {        
        int[] m = {1, 0, 1, 2, 1, 2, 3, 4};
        System.out.println("Kol-vo razlichnix elementov: " + kolRaznixelementov(m));
    }

    private static int kolRaznixelementov(int[] m) {
        int num = 0;
        for (int i = 0; i < m.length; i++) {
            int count = 0;
            for (int j = 0; j < i; j++) {
                if(m[j] == m[i]) {
                    count++;                
                }                
            }    
            if(count == 0){
                num++;
            }
        } 
        return num;
    }
    
}
