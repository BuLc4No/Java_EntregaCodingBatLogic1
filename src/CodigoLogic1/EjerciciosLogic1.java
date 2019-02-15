/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodigoLogic1;

/**
 *
 * @author Sergio Garcia (al que se le borro el proyecto de netbeans,siguiendo tus indicaciones no pongo los comentarios ni los enunciados ¡¡¡¡¡) :) DAM-UFV
 */
public class EjerciciosLogic1 {
    
    public static void main(String[] args) {
        EjerciciosLogic1 ejercicios = new EjerciciosLogic1();
        
        
        
    }
    // metodos de cada ejercicio

            // 1º cigarParty
            public boolean cigarParty(int cigars, boolean isWeekend) {
          if(cigars>=40 && cigars<=60){
            return true;
          }
         if(cigars>=40 && isWeekend==true){
           return true;
         }
         return false;
        }
            
            // 2º datefashion
            public int dateFashion(int you, int date) {
          if(you<=2 || date<=2){
            return 0;

          }
          if(you!=2 && date!=2 && you<8 && date<8 ){
            return 1;
          }
          if(you>=8 || date>=8){
            return 2;
          }
          return 0;
        }
            
            // 3º squirrelPlay
            public boolean squirrelPlay(int temp, boolean isSummer) {
          if( temp>=60 && temp<=90){
            return true;
          } 
          if( temp>=60 && temp<=100 && isSummer==true){
            return true;
          }
          return false;

        }
            
            // 4º caughtSpeeding
            public int caughtSpeeding(int speed, boolean isBirthday) {
          //Si la velocidad es 60 o menos y no es tu cumple devuelve 0
          if(speed<=60 && isBirthday==false){
            return 0;
          }
          //Si la velocidad es 65 o menos y si es tu cumple devuelve 0
          if(speed<=65 && isBirthday==true){
            return 0;
          }
          // si la velocidad es ma
          if(speed>60 && speed <=80 && isBirthday==false){
            return 1;
          }
          //
           if(speed>=61 && speed <=85 && isBirthday==true){
            return 1;
          }
          if(speed>=81){
            return 2;
          }
         return 0; 
        }

         // 5º sortaSum
        public int sortaSum(int a, int b) {
        int suma=a+b;

        if(suma<=9 && suma>=20){
          suma=a+b;
        }

        if(suma>=10 && suma<=19){
          suma=20;
        }
        return suma;

        }
        
        //6º alarmClock
        public String alarmClock(int day, boolean vacation) {
          //Si vacaciones es true
        if(vacation==true){
          // y si dia esta entre el 1 o el 5 devuelve 10:00
           if(day>=1 && day<=5){
            return "10:00";
        }
        // si no devuelve off
          else{
            return "off";
          }
          }
          // si dia esta entre 1 y 5 y ya no son vaciones devuelve 7:00
          if(day>=1 && day<=5){
           return "7:00";
          }
          // si no devuelve 10:00
          else {
           return "10:00";
          }
        }
        
            // 8º love6
            public boolean love6(int a, int b) {
            // suma vale a+b
              int suma = a+b;
              //si a es 6 o b es 6 devuelve true
               if(a==6 || b==6){
              return true;
             }
             // si suma vale 6 devuelve true
             if(suma==6){
              return true;
            }
            // si a-b vale 6 o b-a vale 6 devuelve true
            if(a-b==6 ){
          return true;
        }
          return false;
          }

            //9º iniTo10
            public boolean in1To10(int n, boolean outsideMode) {
          if(n>=1 && n<=10 && outsideMode==false ){
            return true;
          }
          if(outsideMode==true && n<=1){
            return true;
          }
          if(outsideMode==true && n>=10){
            return true;
          }
          return false;
        }
            
            //10º specialEleven
            public boolean specialEleven(int n) {
          if(n % 11==0 || n % 11 ==1){
            return true;
          }
          return false;
        }

              // 11º more20
            public boolean more20(int n) {
          if( n % 20 ==1 || n % 20==2){
            return true;
          }
          return false;
        }
            
            // 12º old35
            public boolean old35(int n) {
          // si n es multiplo de 3 y n no es multiplo de 5 devuelve true
          if( n % 3==0 &&  n % 5 !=0){
            return true;
          }
          // si n es multiplo de 5 y n no es multiplo de 3 devuelve true
           if( n % 5==0 && n % 3 !=0){
            return true;
          }
          // si no devuelve false
          return false;
        }
            
            // 13º less20
            public boolean less20(int n) {
            int n1=n+1;
            int  n2=n+2;
             if(n1 % 20 == 0 || n2 % 20 == 0){
             return true;
            }
            return false;

        }

               //14º nearTen
            public boolean nearTen(int num) {
         if (num%10 <= 2 || num%10 >= 8){
                return true;
        }
            return false;    
        }
        
            // 15º teenSum
        public int teenSum(int a, int b) {
          if(a>=13 && a<=19 || b>=13 && b<=19){
          return 19;
          }
          return a+b;
        }

         // 16º answerCell
        public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
          if( isAsleep==true){
            return false;
          }
          if(isMorning==false && isAsleep==false){
            return true;
          }
          if(isMorning==true&& isMom==true && isAsleep==false){
            return true;
          }
          return false;
          }
        
        //17º teaParty
        public int teaParty(int tea, int candy) {

          if(tea<5 || candy <5){
            return 0;
          }
          if(tea>= candy*2|| candy>= tea*2){
           return 2;
         }
          if(tea>=5 && candy>=5){
            return 1;
          }

          return 0;
        }
        
        //18º fizzString
        public String fizzString(String str) {
           if(str.startsWith("f") && str.endsWith("b")){
            return "FizzBuzz";
          }
          if(str.startsWith("f")){
            return "Fizz";
          }
          if(str.endsWith("b")){
            return "Buzz";
          }

          return str;
        }

        //19º fizzString2
        public String fizzString2(int n) {
        if(n%3==0 && n%5==0){
           return "FizzBuzz!";
        }
         if(n%3==0){
           return "Fizz!";
         }
          if(n%5==0){
           return "Buzz!";
          }

           return n+"!";
        }

        // 20º twoAsOne
        public boolean twoAsOne(int a, int b, int c) {
          if( a+b==c || a-b==c || b-a==c){
            return true;
          }

          return false;
        }
        
        // 21º inOrder
         public boolean inOrder(int a, int b, int c, boolean bOk) {
          // si b vale a o mas y c vale b o mas y bOk es true devuelve true
          if(b>=a && c>=b && bOk==true){
            return true;
          }
          // si b vale a o mas  y c vale b o mas y bOk es false devuelve true
         if(b>=a && c>=b && bOk==false){
            return true;
          }
          // si b es menor que a y c es mayor que b y bOk es true devuelve true
          if(b<a && c>b && bOk==true){
            return true;
          }

          return false;
        }
         
         //22º inOrderEqual
         public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
          if( a<b &&  b<c){
            return true;
          }
          if(equalOk==true && a<=b && b<=c){
            return true;
          }
          return false;
        }
         
         // 23º lastDigit
        public boolean lastDigit(int a, int b, int c) {
          if(a%10==b%10 || a%10==c%10 || b%10==c%10){
            return true;
          }
          return false;
        }
        
        //24º lessBy10
        public boolean lessBy10(int a, int b, int c) {
          if(a-b>=10 ||a-c>=10||b-a>=10 || b-c>=10|| c-a>=10 || c-b>=10){
            return true;
          }
          return false;
        }
        
        //25º withoutDoubles
        public int withoutDoubles(int die1, int die2, boolean noDoubles) {

         if (noDoubles==false){
           return die1 + die2;
         } 
         if(die1==6 && die2==6 && noDoubles==true){
              return die1+1 ;
            }
            if (die1 == die2 && die1 != 6) {

              return  die1 + die2 + 1;
            }
            return die1 + die2;
        }
        
        //26º maxMod5
        public int maxMod5(int a, int b) {
          //mayor=0
          int mayor=0;
          //si a vale b o menos mayor es b
          if(a<=b){
            mayor=b;
          }
          // si a vale b o mas el mayor es a
          if(a>=b){
            mayor= a;
          }
          // si a
          if( a%5==b%5 && a<b){
            return a;
          }
           if( a%5==b%5 && a>b){
            return b;
          }
          if(a==b){
            return 0;
          }
          return mayor;
        }

        //27º redTicket
        public int redTicket(int a, int b, int c) {
          if(a==2 && b==2 && c==2){
            return 10;
          }
          if(a==b && b==c){
            return 5;
          }
          if(b!=a && c!=a){
            return 1;
          }
          return 0;
        }
        
        //28º greenTicket
        public int greenTicket(int a, int b, int c) {
          // si a es distinto de b y a es distinto de c y b es distinto de a y b distinto de c devuelve 0
          if(a!=b && a!=c && b!=a && b!=c){
            return 0;
          }
          // si a vale lo mismo que b y b lo mismo que c devuelve 20
          if(a==b && b==c){
            return 20;
          }
          // si a vale lo mismo que b o a que c o b que a o b que c o a que a o c que b devuelve 10
          if(a==b || a==c|| b==a|| b==c || c==a|| c==b){
            return 10;
          }

          return 0;
        }
        
        //29º blueTicket
        public int blueTicket(int a, int b, int c) {

          int ab=a+b;
          int bc=b+c;
          int ac=a+c;

          if(a+b==10 ||b+c==10 ||a+c==10 ){
            return 10;
          }
          if(ab-bc==10 || ab-ac==10){
            return 5;
          }
          return 0;
        }

        public boolean shareDigit(int a, int b) {
          if(a/10 == b/10 || a%10== b%10 || a/10 == b%10 || a%10==b/10){
            return true;
          }
          return false;
        }
        
        //30º sumLimit
        public int sumLimit(int a, int b) {
          // sum=a+b
          int sum = a + b;
            //declaro dos variables que valdran seran convertidas a una cadena de numeros 
            int alongi = String.valueOf(a).length();

            int sumlongi = String.valueOf(sum).length();
                // si valen lo mismo devuelve sum
            if(alongi == sumlongi){
                return sum;
            }
            // si no a            
            return a;
        }

        }
