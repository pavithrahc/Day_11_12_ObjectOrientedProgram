/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author PAVITHRA C
 *
 */
public class Stock {

	/**
	 * @param args
	 */
	String shareName;
    int noOfShare;
    float sharePrice;

    public Stock(String shareName, int noOfShare, float sharePrice) {
        this.shareName = shareName;
        this.noOfShare = noOfShare;
        this.sharePrice = sharePrice;
    }

    public void setShareName(String shareName) {
        this.shareName = shareName;
    }

    public void setNoOfShare(int noOfShare) {
        this.noOfShare = noOfShare;
    }

    public void setSharePrice(float sharePrice) {
        this.sharePrice = sharePrice;
    }

    public String getShareName() {
        return shareName;
    }

    public int getNoOfShare() {
        return noOfShare;
    }

    public float getSharePrice() {
        return sharePrice;
    }



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Stock Maintenance Program");
        StockPortfolio value = new StockPortfolio();
        value.stockValue();

        int i = 0;
        while (i < 1) {
            System.out.println();
            System.out.println("Press 1 to create another Stock Account/Press 2 to Update Shares in an existing Account/Press 3 to delete a Stock detail from an Account/Press 4 to Add a Stock to an Account/ Press 0 to exit");
            Scanner in = new Scanner(System.in);
            switch (in.nextInt()) {
                case 0 -> {
                    System.out.println("Thank You");
                    i = 1;
                }
                case 1 -> value.updateA();
                case 2 -> value.updateC();
                case 3 -> value.delete();
                case 4 ->value.add();

                default -> System.out.println("Invalid Input");
            }
        }
        System.out.println();
    }

	}


