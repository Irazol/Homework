/*Використовуючи IntelliJ IDEA, створіть клас . Уявіть, що ви реалізуєте програму для банку,
 яка допомагає визначити, погасив клієнт кредит чи ні. Припустимо, щомісячна сума платежу має
  становити 100 грн. Клієнт має виконати 7 платежів, але може платити рідше великими сумами.
  Тобто може двома платежами по 300 і 400 грн закрити весь борг.Створіть метод, який як аргумент
  прийматиме суму платежу, введену економістом банку. Метод виводить на екран
  інформацію про стан кредиту (сума заборгованості, сума переплат, повідомлення про відсутність боргу)*/

package Lesson6;

import java.util.Scanner;
public class Credit {
    public static int credit_amount = 1000;
    static void check( int repayment_amount) {
        int total_sum = 0;
        total_sum += repayment_amount;

        if  (credit_amount > total_sum )
            System.out.println("Cума заборгованості по кредиту становить: "+ (credit_amount - total_sum));
        else if(credit_amount == total_sum )
            System.out.println("Кредит погашено");
        else if (credit_amount < total_sum )
            System.out.println("Cума переплати по кредиту становить: "+ (credit_amount - total_sum)*-1);
        credit_amount-=repayment_amount;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while(credit_amount >0 ) {
            System.out.println("Введіть сумму платежу:");
            int repayment_amount1 = input.nextInt();
            check(repayment_amount1);
        }
    }
}