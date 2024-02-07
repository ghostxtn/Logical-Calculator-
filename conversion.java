import java.util.Objects;

public class conversion {
    public static String[] hexa = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
    public static String decimaltobinary(double numbr) {
        double fractionalPart = 0, number;
        int rem = 0, integralPart;
        StringBuilder aftervi = new StringBuilder();
        StringBuilder beforvir = new StringBuilder();
        int k = 4;
        int n = (int) numbr;
        fractionalPart = numbr - n;
        while (n != 0) {
            rem = n % 2;
            n = n / 2;
            aftervi.insert(0, rem);
        }
        while (k != 0) {
            integralPart = (int) (fractionalPart * 2);
            beforvir.append(integralPart);
            number = fractionalPart * 2;
            fractionalPart = number - integralPart;
            k--;
        }
        String result=" ";
        result+= aftervi +"."+ beforvir;
        return result;
    }
    public static double binarytodecimal (String binary){
        int count = 0, index = 0, integralPart = 0, counter = -1;
        double fractionalPart = 0;
        index = binary.indexOf(".");
        if(index>0){
            for (int i = index - 1; i >= 0; i--) {
                int number = binary.charAt(i) - '0';
                double temp = number * Math.pow(2, count);
                integralPart += (int) temp;
                count++;
            }

            for (int i = index + 1; i < binary.length(); i++) {
                int number = binary.charAt(i) - '0';
                double temp = number * Math.pow(2, counter);
                fractionalPart += temp;
                counter--;
            }
            fractionalPart += integralPart;
        }
        else {
            int decimal=Integer.parseInt(binary,2);
            fractionalPart= (double) decimal;
            return fractionalPart;
        }
        return fractionalPart;
    }
    public static String sumbinary(String num,String num2){
        double last=0;
        last=binarytodecimal(num.replace(" ",""))+binarytodecimal(num2.replace(" ",""));
        return decimaltobinary(last);
    }
    public static String substractionbinary(String num,String num2){
        String sum="";
        double last=0;
        last=binarytodecimal(num)-binarytodecimal(num2);
        if(binarytodecimal(num)<binarytodecimal(num2)){
            last=binarytodecimal(num2)-binarytodecimal(num);
            sum+="-"+decimaltobinary(last);
            return sum;
        } else if (binarytodecimal(num)==binarytodecimal(num2)) {
            return "0";
        } else {
            sum=decimaltobinary(last);
        }
        return sum;
    }
    public static String multiplcationbin(String num1,String num2){
        int multibin=1;
        String lastnumber="";
        multibin*= (int) (binarytodecimal(num1)*binarytodecimal(num2));
        if(multibin<0){
            multibin=Math.abs(multibin);
            lastnumber+=("-");
            lastnumber+=(decimaltobinary(multibin));
        }
        else{
            lastnumber=decimaltobinary(multibin);
        }
        return lastnumber;
    }
    public static String duvidedbinary(String num1,String num2){
        double divdeddecimal=0;
        String lastnumber=null;
        divdeddecimal=binarytodecimal(num1)/binarytodecimal(num2);
        if(binarytodecimal(num1)*binarytodecimal(num2)<0){
            divdeddecimal=Math.abs(divdeddecimal);
            lastnumber+=("-");
            lastnumber+=(decimaltobinary(divdeddecimal));
        }
        else{
            lastnumber=decimaltobinary(divdeddecimal);
        }
        if(binarytodecimal(num1)<binarytodecimal(num2)){
            lastnumber+=("0");
        }
        return lastnumber;
    }
    public static String decimaltohexa(int decimal) {
        String values = "";
        String reversevalue = " ";
        int reminder = 0;
        while (decimal > 0) {
            reminder = decimal % 16;
            values += hexa[reminder];
            decimal = decimal / 16;

        }
        for (int num = values.length() - 1; num >= 0; num--) {
            reversevalue += values.charAt(num); //adds each character in front of the existing string
        }
        return reversevalue;
    }
    public static int number(String str) {
        if(str.contains("-")){
            str=str.substring(1);
            str=str.replaceAll("\\s", "");
        } else if (str.contains("+")) {
            str=str.substring(1);
            str=str.replaceAll("\\s", "");
        } else if (str.contains("/")) {
            str=str.substring(1);
            str=str.replaceAll("\\s", "");
        }

        int decimal = Integer.parseInt(str.trim(), 16);
        return decimal;

    }
    public static String sumoftwohex(String num1, String num2) {
        int sumdecimal = 0;
        sumdecimal = number(num1) + number(num2);
        return decimaltohexa(sumdecimal);
    }
    public static String substractionoftwohex(String num1, String num2) {
        int sumdecimal = 0;
        String lastnumber = "";
        if (number(num1) < number(num2)) {
            sumdecimal = number(num2) - number(num1);
            lastnumber = "-" + decimaltohexa(sumdecimal);
        }
        System.out.println(lastnumber);
        return lastnumber;
    }
    public static String multiplcationhex(String num1, String num2) {
        int multidecimal = 1;
        String lastnumber = "";
        multidecimal = number(num1) * number(num2);
        if (multidecimal < 0) {
            multidecimal = Math.abs(multidecimal);
            lastnumber = "-" + decimaltohexa(multidecimal);
        } else {
            lastnumber = decimaltohexa(multidecimal);
        }
        return lastnumber;
    }
    public static String duvidedhex(String num1, String num2) {
        if(Objects.equals(num1, "")){
            num1="1";
        }
        if(Objects.equals(num2, "")){
            num1="1";
        }
        int divdeddecimal = 0;
        String lastnumber = "";
        divdeddecimal = number(num1) / number(num2);

        if (number(num1) * number(num2) < 0) {
            divdeddecimal = Math.abs(divdeddecimal);
            lastnumber = "-" + decimaltohexa(divdeddecimal);
        } else {
            lastnumber = decimaltohexa(divdeddecimal);
        }
        if (number(num1) < number(num2)) {
            lastnumber = "0";
        }
        return lastnumber;
    }
    public static String andoperation(String num1,String num2){
        StringBuilder lastresult= new StringBuilder();
        for(int j=0;j<Math.abs(num1.length()-num2.length());j++){
            if(num1.length()-num2.length()<0){
                StringBuilder sb = new StringBuilder(num1);
                sb.insert(0,"0");
                num1=sb.toString();
            }
            else{
                StringBuilder sb = new StringBuilder(num2);
                sb.insert(0,"0");
            }

        }
        for(int jk=0;num1.length()>jk;jk++) {
            if (String.valueOf((num1.charAt(jk))).equals("1") && String.valueOf((num1.charAt(jk))).equals("1")){
                lastresult.append(1);
            }
            else {
                lastresult.append(0);
            }
        }

        return lastresult.toString();
    }
    public static String xoroperation(String num1,String num2){
        StringBuilder lastresult= new StringBuilder();
        for(int j=0;j<Math.abs(num1.length()-num2.length());j++){
            if(num1.length()-num2.length()<0){
                StringBuilder sb = new StringBuilder(num1);
                sb.insert(0,"0");
                num1=sb.toString();
            }
            else{
                StringBuilder sb = new StringBuilder(num2);
                sb.insert(0,"0");
            }

        }
        for(int jk=num1.length()-1;jk>=0;jk--) {
            if (String.valueOf(num1.charAt(jk)).equals(String.valueOf(num2.charAt(jk)))){
                lastresult.append(0);
            }
            else {
                lastresult.append(1);
            }
        }

        return lastresult.toString();
    }
    public static String oroperation(String num1,String num2){
        if(binarytodecimal(num1)>binarytodecimal(num2)){
            return num1;
        } else if (binarytodecimal(num1)<binarytodecimal(num2)) {
            return num2;
        }
        return num1;

    }
    public static String Rightshift(String num1){
        String nu = num1.substring(0,num1.length()-1);
        String result=String.valueOf(num1.charAt(0));
        String finale=result+nu;
        return finale;

    }
    public static String Leftshift(String num1) {
        num1= num1.substring(1);
        num1= num1.concat("0");
        return num1;

    }
}
