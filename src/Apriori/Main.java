/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Apriori;

/**
 *
 * @author pc
 */

import java.io.*;
import java.util.*;

public class Main {



   /*public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(System.in);
        List <String> transactions= new ArrayList<>();
        List <Transaction> DataSet ;
        System.out.println("Entrer le nom du fichier");
        String filename = s.nextLine();
        System.out.println("Entrer le separator");
        String separator = s.nextLine();
        //String separator=" ";
        System.out.println("Entrer le support minimal");
        int minimumSupport=s.nextInt();
        System.out.println("Entrer la confiance minimale (en %)");
        double minimumConfidence=s.nextDouble();
        minimumConfidence = minimumConfidence/100;
        File f = new File(".\\src\\Dataset\\"+filename);
        DataSet = Transaction.transformerfichier(f);

        System.out.println("L'ensemble des transaction est :\n");
        for (Transaction transaction : DataSet) {
            System.out.println("Transaction " + transaction.id + ": " + transaction.Item);
        }

        for (Transaction transaction : DataSet) {
            transactions.add(transaction.Item);
        }
        int noOfTransactions=transactions.size();
        System.out.println("NBTransaction " + noOfTransactions);

         List <String> itemSet = Transaction.uniqueItems(separator, noOfTransactions, transactions);
         FrequentItem.firstFrequentItemSet(itemSet,noOfTransactions,transactions,minimumSupport);

         List<String> res3=FrequentItem.aprioriStart(noOfTransactions,transactions,minimumSupport,minimumConfidence);
        for(int k=0; k<res3.size();k++){
             System.out.println(res3.get(k));
        }

   }*/
}

