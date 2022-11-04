/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Apriori;

/**
 *
 * @author pc
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.*;


public class Transaction {
    //les attributs
    int id ;
    String  Item;

    //les methodes

    //constructeur
    public Transaction(int id,String Item){
        this.id=id;
        this .Item=Item;
    }

    //lire un fichier de données et le transformer en une liste de type transaction
    public static List <Transaction> transformerfichier(File file) throws FileNotFoundException {
        int id=1;
        List<Transaction> transactions = new ArrayList<>();
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            transactions.add(new Transaction(id,str));
            id++;
        }
        return transactions;
    }

    //Retourne les articles uniques dans notre fichier, sans répétition
    public static List<String> uniqueItems(String separateur,int noOfTransactions, List <String> transactions)
    {
        String newLine = System.getProperty("line.separator");
        List<String> itemSet = new ArrayList<>();

        for(int i = 0; i<noOfTransactions;i++){
            String str = transactions.get(i);
            String[] words = str.split(separateur);
            for (String word : words) {
                if (i == 0) {
                    itemSet.add(word);
                } else {
                    if (!(itemSet.contains(word))) {
                        itemSet.add(word);
                    }
                }
            }
        }

        return itemSet;
    }
    
    //retourne le nombre des articles et les transactions, le support et la confiance minimale
    public static List<String> InforTransactions(String separateur,int noOfTransactions, List <String> transactions, int minimumSupport, double minimumConfidence) 
    {
        String newLine = System.getProperty("line.separator");
        List<String> itemSet = new ArrayList<>();
        List<String> affichage = new ArrayList<>();

        for(int i = 0; i<noOfTransactions;i++){
            String str = transactions.get(i);
            String[] words = str.split(separateur);
            for (String word : words) {
                if (i == 0) {
                    itemSet.add(word);
                } else {
                    if (!(itemSet.contains(word))) {
                        itemSet.add(word);
                    }
                }
            }
        }
        int itemsCount = itemSet.size();
        affichage.add(newLine +"Nombre d'articles = "+itemsCount);
        affichage.add("\n");
        affichage.add("Nombre de transactions = "+noOfTransactions);
        affichage.add("\n");
        affichage.add("Le support minimal = "+minimumSupport);
        affichage.add("\n");
        affichage.add("La confiance minimale = "+minimumConfidence+newLine);
 
        return affichage;
    }
}
