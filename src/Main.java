import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] month=new int[30];
        month[0]=152367;
        month[1]=134767;
        month[2]=195667;
        month[3]=152747;
        month[4]=195434;
        month[5]=173477;
        month[6]=109768;
        month[7]=123575;
        month[8]=197645;
        month[9]=186558;
        month[10]=112564;
        month[11]=175477;
        month[12]=106767;
        month[13]=123667;
        month[14]=132567;
        month[15]=197699;
        month[16]=153256;
        month[17]=185488;
        month[18]=136786;
        month[19]=164363;
        month[20]=184586;
        month[21]=153257;
        month[22]=197696;
        month[23]=134667;
        month[24]=123632;
        month[25]=132523;
        month[26]=186589;
        month[27]=123575;
        month[28]=135235;
        month[29]=196599;
        int sum=0;
        for (int i=0;i<month.length;i++){

            sum+=month[i];
            if (i==29){

                System.out.printf("Сумма трат за месяц составила %s рублей",sum);
            }}
            System.out.println();


        //Задача 2
        int maximumNumber=100_000;
        int minimumNumber=200_000;
        for (int i = 0; i < month.length; i++){
        if(month[i]>maximumNumber){
            maximumNumber=month[i];
        }}
        System.out.printf("Максимальная сумма трат за день составила %s рублей",maximumNumber);
        System.out.println();

        for (int i = 0; i < month.length; i++){
            if(month[i]<minimumNumber){
                minimumNumber=month[i];
            }}
        System.out.printf("Минимальная сумма трат за день составила %s рублей",minimumNumber);
        System.out.println();

        //Задание 3
        int monthlyExpenses=sum;
        float averageAmount=monthlyExpenses/month.length;
        System.out.printf("Средняя сумма трат за месяц составила %s рублей",averageAmount);
        System.out.println();

        //Задание 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length; i >0; i--) {
            System.out.print(reverseFullName[i-1]);
        }




    }
}