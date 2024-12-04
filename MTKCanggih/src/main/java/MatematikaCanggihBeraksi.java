/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class MatematikaCanggihBeraksi {
    
    public static void main(String[] args){
        MatematikaCanggih call = new MatematikaCanggih();
        call.pertambahan(15, 7);
        System.out.println("pertambahan 15 + 7 =" + call.x);
        call.pertambahan(25, 2, 15);
        System.out.println("pertambahan 20 + 20 + 22 =" + call.x);
        call.pertambahan(2.5, 3.1);
        System.out.println("pertambahan 2.5 + 3.1 =" + call.y);
        call.pertambahan(2.5, 4.1, 2.1);
        System.out.println("pertambahan 2.5 + 4.1 + 2.1 =" + call.y);
       
        call.pengurangan(30, 10);
        System.out.println("pengurangan 30 - 10 =" + call.x);
        call.pengurangan(15, 30, 12);
        System.out.println("pengurangan 15 - 30 - 12 =" + call.x);
        call.pengurangan(4.0, 2.5);   
        System.out.println("pengurangan 4.0 - 2.5 =" + call.y);
        call.pengurangan(2.0, 2.5, 2.6);   
        System.out.println("pengurangan 2.0 - 2.5 - 2.6 =" + call.y);
         
        call.pembagian (9, 3);
        System.out.println("pembagian 9 / 3 =" + call.x);
        call.pembagian (12, 2, 3);
        System.out.println("pembagian 12 / 2 / 3 =" + call.x);
        call.pembagian (6.2, 2.0);
        System.out.println("pembagian 6.2 / 2.0 =" + call.y);
        call.pembagian (6.0, 2.1, 2.4);
        System.out.println("pembagian 6.0 / 2.1 / 2.4 =" + call.y);
        
        call.perkalian(2, 20);
        System.out.println("perkalian 2 * 20 =" + call.x);
        call.perkalian(2, 3, 12);
        System.out.println("perkalian 2 * 3 * 12 =" + call.x);
        call.perkalian(2.5, 4.2);
        System.out.println("perkalian 2.5 * 4.2 =" + call.y);
        call.perkalian(2.0, 2.5, 2.2);
        System.out.println("perkalian 2.0 * 2.5 * 2.2 =" + call.y);
        
        call.modulus (6 , 2);
        System.out.println("modulus 6 % 2 =" + call.operasi);
        call.modulus (10 , 12 , 21);
        System.out.println("modulus 10 % 12 % 21 =" + call.operasi);
        call.modulus (1.5, 5.2);
        System.out.println("modulus 1.5 % 5.2 =" + call.operasiDouble);
        call.modulus (2.0, 1.2, 2.1);
        System.out.println("modulus 2.0 % 1.2 % 2.1 =" + call.operasiDouble);
    }
}