import java.util.Scanner;

//public class StudentMarks {
//
// public static void main(String[] args) {
//  // TODO Auto-generated method stub
//  Scanner scan = new Scanner(System.in);
//  System.out.println("Enter the number");
//  int number = scan.nextInt();
//  if(number < 1|| number > 99999) {
//   System.out.println("Invalid Number");
//  }else {
//   int a = number%10; //last digit
//   int b = number/10;
//   int c = b%10;
//   int g = number/100;
//   int d = g%10;
//   int e = number/1000;
//   int f = e%10;
//   int i = number/10000;
//   int j = g%10;
//   String sD[] = {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Ninteen"};
//   String ty[] = {"","Ten","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
//   String h = "Hundred";
//   String th = "Thousand";
//   if(number <20)
//    System.out.println(sD[number]);
//   else if (number >=20 && number <= 100)
//    System.out.println(ty[c]+" "+sD[a]);
//   else if(number >=100 && number <= 999)
//    System.out.println(sD[g]+" "+h+" "+ty[c]+" "+sD[a]);
//   else if(number >= 1000 && number <= 9999)
//    System.out.println(sD[f]+" "+th+" "+sD[d]+" "+h+" "+ty[c]+" "+sD[a]);  
//   else if(number >=10000 && number <= 99999)
//	   System.out.println(ty[f] +" "+sD[f]+ " " + th + " " + sD[d] + " " + h + " " + ty[c] + " " + sD[a]);
//  }  
//  scan.close();
// }
//
//}

public class StudentMarks {
    private static final String[] LESS_THAN_20 = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] TENS = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    private static final String[] THOUSANDS = {"", "Thousand", "Million", "Billion"};

    public static String numberToWords(int num) {
        if (num == 0) return "Zero";

        String words = "";
        int index = 0;

        while (num > 0) {
            if (num % 1000 != 0) {
                words = helper(num % 1000) + THOUSANDS[index] + " " + words;
            }
            num /= 1000;
            index++;
        }

        return words.trim();
    }

    private static String helper(int num) {
        if (num == 0) return "";
        else if (num < 20) return LESS_THAN_20[num] + " ";
        else if (num < 100) return TENS[num / 10] + " " + helper(num % 10);
        else return LESS_THAN_20[num / 100] + " Hundred " + helper(num % 100);
    }

    public static void main(String[] args) {
        int num = 12345;
        String words = numberToWords(num);
        System.out.println(words);
    }
}
