/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array1;

/**
 *
 * @author ACER
 */
public class tugas1 {
     public static void main(String[] args) {
        
        String mobil[] = new String[3] ;
        
        /*
        Variabel array dideklarasikan dengan nama mobil, kemudian diciptakan 3 index ruang. 
        Dari index 0 hingga 2. 
        Ketiga indek tersebut belum terisi karena belum diberikan nilai ; 
        */
        
        /*
        Kemudian index array kita isikan satu persatu agar memiliki nilai 
        */
        
        mobil[0] = "Toyota" ;
        mobil[1] = "Honda" ;
        mobil[2] = "Suzuki" ;
        
        /*
        Setelah ketiga index array terisi, kita panggil untuk dicetak 

        */
        System.out.println(mobil[0] + " " + mobil[1] + " " + mobil[2]);
        
    }
    
}
