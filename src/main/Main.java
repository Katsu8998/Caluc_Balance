package main;

import java.util.Scanner;

/**
 *
 * @author pm
 * このクラスには、Mainクラス、Balanceクラス、Invoiceクラスがあります。
 * Balanceクラスは、name(カード名)、残高(balance)、cancel(払い戻し)を表します。
 * Invoiceクラスには、totalamount(合計金額）を表します。
 *
 */

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Balance currentBalance = new Balance();

		//標準入力からユーザ名、残高設定
		System.out.println("氏名と残高を入力してください");
		currentBalance.name = sc.nextLine();
		currentBalance.balance = sc.nextInt();
		currentBalance.cancel = 0;

		Invoice invoicePrice = new Invoice();
		invoicePrice.totalAmount = 0;

		//税率10%
		double tax = 1.1;

		//入力後の残高を算出
		String balanceSetting = currentBalance.name + "様の現在の残高は\n" +
				currentBalance.balance + "円" + "\nです";

		while (currentBalance.balance >= 0) {
			System.out.println("購入金額を入力ください");

			//購入金額に税率をかけ、合計金額を算出
			int amount = sc.nextInt();
			int totalAmount = invoicePrice.purchase(tax, amount);
			System.out.println("購入金額は" + totalAmount + "円");

			//残高から合計金額を引く
			currentBalance.balance = currentBalance.calcu(currentBalance.balance, totalAmount);
			System.out.println("現在の残高は" + currentBalance.balance + "円\n" +
					"取引の取り消しがあれば金額を入力ください。なければ(0)と入力して下さい");

			//払い戻しがあった場合、残高に払い戻し額を足す。
			int cancel = sc.nextInt();
			currentBalance.balance = currentBalance.paymentCancel(cancel, currentBalance.balance);
			System.out.println("現在の残高は" + currentBalance.balance + "円");

			//残高が0より小さい場合、強制終了
			if (currentBalance.balance < 0) {
				System.out.println("残高不足です。");
				break;
			}

		}
	}
}