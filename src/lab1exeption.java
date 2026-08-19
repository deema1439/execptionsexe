import java.util.InputMismatchException;
import java.util.Scanner;

public class lab1exeption {

        public static void cheak (int sum, int num3) {
            try {
                if (sum == num3) {
                    System.out.println("the result is: true equal");
                } else {
                    throw new Exception("the result is: false not EQUALL !!!");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        public static void even(int num) {
            try {
                if (num % 2 == 0) {
                    System.out.println("the number is even");
                } else {
                   throw new Exception("this number is odd not even !!!!!!! ");
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

      public static void comper (int f, int ss) throws Exception{
          if (f < ss)  {
              System.out.println(f + "<" + ss);
          }if (f <= ss) {
              System.out.println(f + "<=" + ss);
          }if (f != ss) {
              System.out.println(f + "!=" + ss);
          }if(f>ss){
              throw new Exception(f + " dont make the first number larger!!!" + ss);
          }
      }

      public static void equal(int num1,int num2,int num3,int num4){
            try {
                if ((num1 == num2) && (num3 == num4)) {
                    if ((num1 == num3) && (num2 == num4)) {
                        System.out.println("equal");
                    } else {
                       throw new Exception("the numbers need to be equal !!! ");
                    }
                }else {
                    throw new Exception("the numbers need to be equal !!! ");
                }
            } catch (Exception e){
              System.out.println(e.getMessage());
            }
      }


     public static void postivenegative(int num) throws Exception{
            if(num<0){
             System.out.println("negative number");
         }else if (num>0){
             System.out.println("postive number ");
         }else{
          throw new Exception("do not enter zero !!");
         }

     }




    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        //Q1 :
        try{
        System.out.println("Enter the first number : ");
        int firstnum=s.nextInt();
           System.out.println("Enter the secend number :");
       int secandnum=s.nextInt();
         int sum=(firstnum+secandnum);
         int multiply=(firstnum*secandnum);
         int sub=(firstnum-secandnum);
         int dvid=(firstnum/secandnum);
         int mod =(firstnum%secandnum);
            System.out.println(firstnum+"+"+secandnum+"= "+sum);
       System.out.println(firstnum+"-"+secandnum+"= "+sub);
       System.out.println(firstnum+"*"+secandnum+"= "+multiply);
       System.out.println(firstnum+"/"+secandnum+"= "+dvid);
       System.out.println(firstnum+"%"+secandnum+"= "+mod);
        }catch (InputMismatchException e){
            System.out.println("enter just an int number");
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println(" خطأ ");
        }
        s.nextLine();
        try {
            System.out.println("Enter the number that you want to multi : ");
            int num = s.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + "*" + i + " = " + num * i);
            }
        }catch (InputMismatchException e){
            System.out.println("enter just an int number");
        }catch(Exception e){
            System.out.println(" خطأ ");
        }
        s.nextLine();
        //Q3:
        try {
            System.out.println("print the r ");
            double r2 = s.nextDouble();
            double area2 = ((r2 * r2) * 3.14);
            System.out.println("area of the circle is " + area2);
            double permeter = (2 * 3.14 * r2);
            System.out.println("permeter of the circle " + permeter);
        } catch (InputMismatchException e) {
            System.out.println("enter a number");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        s.nextLine();

        //Q4
        try {
            System.out.println("to find the avrage enter the count of the numbers:");
            int count = s.nextInt();
            double sum = 0;
            for (int i = 1; i <= count; i++) {
                System.out.println("enter an integer:");
                int num = s.nextInt();
                sum += num;
            }
            double avrg = sum / count;
            System.out.println("the avrg is : " + avrg);
        } catch (InputMismatchException e) {
            System.out.println("enter a int numbers ");
        }
           s.nextLine();

        //Q5
           try {
               System.out.println("enter the first");
               int num1 = s.nextInt();
               System.out.println("enter the secend");
               int num2 = s.nextInt();
               System.out.println("enter the thired");
               int num3 = s.nextInt();
               int sum = num1 + num2;
               cheak( sum, num3);
           }catch (InputMismatchException e){
               System.out.println("enter a intger number!! ");
           }
           s.nextLine();

////           //Q6 //no Exception need

        System.out.println("enter the word :");
        String word1=s.nextLine();
        String revarce="";
        for(int i =word1.length()-1;i>=0;i--){
            revarce+=word1.charAt(i);
        }
        System.out.println("the revarce word is: "+revarce);
        s.nextLine();

        //Q7
        try {
            System.out.println("enter a count of numbers for loops: ");
            int count = s.nextInt();
            for (int i = 1; i <= count; i++) {
                System.out.println("enter a numbers :");
                int num = s.nextInt();
                even(num);
            }
        }catch(InputMismatchException e){
            System.out.println("enter only integer numbers please ! ");
        }
        s.nextLine();

         //Q8
        try {
            System.out.println("enter the value in centigrade that you want to convert it to Fahrenheit : ");
            int centigrade = s.nextInt();
            Double f = (centigrade * 1.8) + 32;
            System.out.println("your temperature is " + f);
        }catch (InputMismatchException e){
            System.out.println("enter only integer numbers please ! ");
        }

        s.nextLine();
        //Q9
        try {
            System.out.println("the word is : ");
            String word = s.nextLine();
            System.out.println("the number is :");
            int number = s.nextInt();
            System.out.println(word.charAt(number));
        }catch(StringIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }catch (InputMismatchException e){
            System.out.println("enter intger numbers only!!");
        }
        s.nextLine();

        //Q10
        try{
        System.out.println("write a number of width : ");
        double width= s.nextDouble();
        System.out.println("enter the height : ");
        double height=s.nextDouble();
        double area=width*height;
        System.out.println("the are is "+area);
        double perim=2*(width+height);
        System.out.println("the perimeter "+perim);
        }catch (InputMismatchException e){
            System.out.println("numbersss onlyy !!");
        }

          s.nextLine();

        //Q11
        try {
            System.out.println("enter the first number : ");
            int f = s.nextInt();
            System.out.println("enter the second number: ");
            int ss = s.nextInt();
            comper(f, ss);
        }catch (InputMismatchException e){
            System.out.println("enter integer numbers!!! ");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        s.nextLine();
        //Q12
        try {System.out.println("enter the secands");
        int secand=s.nextInt();
        int hours=secand/3600;
        int mints=secand%3600/60;
        int secand1=secand%60;
        System.out.println("the convert is "+hours+":"+mints+":"+secand1);}
        catch (InputMismatchException e){
            System.out.println("error enter number fix it!!!");
        }

        s.nextLine();

//        //Q13
        try {
            System.out.println("enter the first num");
            int num1 = s.nextInt();
            System.out.println("enter the second  num");
            int num2 = s.nextInt();
            System.out.println("enter the third num");
            int num3 = s.nextInt();
            System.out.println("enter the fourth num");
            int num4 = s.nextInt();
            equal(num1, num2, num3, num4);
        }catch (InputMismatchException e){
            System.out.println("not a number !!!");
        }
        s.nextLine();
//
//        //Q14
        try {
            System.out.println("enter a number:");
            int num = s.nextInt();
            postivenegative(num);
        } catch (InputMismatchException e){
            System.out.println("you did not enter a number");
            }catch (Exception e){
            System.out.println(e.getMessage());
        }
        s.nextLine();

//        //Q15
        int countpos=0;
        int countneg=0;
        int countzer=0;
        int numbers;
        do {
              try {

            System.out.println("enter the numbers if you want to stopenter -1 :");
            numbers = s.nextInt();
            if (numbers > 0) {
                countpos++;
            } else if (numbers < 0) {
                countneg++;
            } else {
                countzer++;
            }
              }catch (InputMismatchException e){
                  System.out.println("enter numbers only!!");
                  s.nextLine();
                  numbers=0;
              }
        }while (numbers!=-1);
        System.out.println(countpos+" positives ");
        System.out.println(countzer+" zero ");
        System.out.println(countneg+" negative ");

        s.nextLine();

//       //Q16:
        try {
            System.out.println("enter the numbers : ");
            int numberss = s.nextInt();
            int revarcenumber = 0;
            while (numberss > 0) {
                int lastdigit = numberss % 10;
                revarcenumber = revarcenumber * 10 + lastdigit;
                numberss = numberss / 10;
            }
            System.out.println("the revarce digte are :" + revarcenumber);
        }catch (InputMismatchException e){
            System.out.println("it has to be a number ");
        }
        s.nextLine();

//        //Q17
//
        try {
            System.out.println("enter a number : ");
            int number = s.nextInt();
            int largest = number;
            int smallest = number;
            char stop;
            do {
                System.out.println("if you want to stop enter y : ");
                stop = s.next().charAt(0);
                if (stop != 'y') {
                    System.out.println("enter a number : ");
                    int num = s.nextInt();
                    if (num > largest) {
                        largest = num;
                    } else if (num < smallest) {
                        smallest = number;
                    }
                }
            } while (stop != 'y');

            System.out.println("the largest number is:" + largest);
            System.out.println("the smallest number is: " + smallest);
        }catch (InputMismatchException e){
            System.out.println("enter only a number!!!!!");
        }

        s.nextLine();

//        //Q17 no Exception

        System.out.println("enter the word: ");
        String word=s.nextLine();
        System.out.println("enter the char : ");
        char thewanted=s.next().charAt(0);
        int count=0;
        for(int i = 0;i<word.length();i++){
           if(word.charAt(i)==thewanted){
              count++;
           }
        }
        System.out.println("the number of "+thewanted+":"+count);















































    }



























    }
