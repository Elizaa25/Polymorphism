/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class MatematikaCanggih extends Matematika{
   int x;
   double y;
   
   void modulus (int a, int b){
       x = a % b;
   }
   void modulus (double a, double b){
       y = (a % b);
   }
   void modulus (int a, int b, int c){
       x = a % b % c;
   }
   void modulus (double a, double b, double c){
       y = (a % b % c);
   }
   
}
   
