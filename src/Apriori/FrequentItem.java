/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Apriori;

/**
 *
 * @author pc
 */

import java.util.*;

public class FrequentItem  {
    static List <String> finalFrequentItemSet = new ArrayList<>();
    static Vector<String> candidates = new Vector<>();
    static HashMap <String, Integer> frequentItems = new HashMap<>();
    static int i=2;

     //Générer le premier ensemble des éléments fréquents
    public static List<String> firstFrequentItemSet(List<String> itemSet, int noOfTransactions, List<String> transactions, int minimumSupport)
    {
        List<String> affichage = new ArrayList<>();
        affichage.add("\n");
        affichage.add("L'ensemble des éléments fréquent numèro 1");
        affichage.add("\n");
        for (String s : itemSet){
            int countItemOccurrence = 0;
            for (int t = 0; t < noOfTransactions; t++){
                String transactionStr = transactions.get(t);
                if (transactionStr.contains(s)){
                    countItemOccurrence++;
                }
            }
            if (countItemOccurrence >= minimumSupport){
                affichage.add(s + " => support = " + countItemOccurrence);
                affichage.add("\n");
                finalFrequentItemSet.add(s);
                frequentItems.put(s, countItemOccurrence);
            }
        }
        return affichage;
    }

    //Générer les ensembles des éléments fréquents qui restent en utilisant la fonction checkFrequentItems()
    public static List<String> AllFrequentItem(int noOfTransactions, List<String> transactions, int minimumSupport)
    {
        List <String> Resultat = new ArrayList<>();
        String newLine = System.getProperty("line.separator");
        int itemsetNumber=1;

        candidates.addAll(finalFrequentItemSet);

        do {
            itemsetNumber++;
            generateCombinations(itemsetNumber);
            List<String> res2 = checkFrequentItems(noOfTransactions,transactions,minimumSupport);
            Resultat.add(res2.toString());
        }while(candidates.size()>1);
        return Resultat;
    }
    
   //Générer les règles d'association en utilisant la fonction generateAssociationRules() qui existe dans la classe GenerateRules
    public static List<String> aprioriStart(int noOfTransactions, List<String> transactions, int minimumSupport, double minimumConfidence)
    {
        List <String> Resultat = new ArrayList<>();
        String newLine = System.getProperty("line.separator");
        int itemsetNumber=1;

        candidates.addAll(finalFrequentItemSet);

        do {
            itemsetNumber++;
            generateCombinations(itemsetNumber);
            checkFrequentItems(noOfTransactions,transactions,minimumSupport);
           
            
        }while(candidates.size()>1);

        Resultat.add("===> Les règles d'association générées à partir de l'ensemble des éléments fréquents final :"+newLine);

        List<String> res = GenerateRules.generateAssociationRules(finalFrequentItemSet,frequentItems, minimumConfidence);
        Resultat.add(res.toString());
        return Resultat;
    }

    //Créer les combinaisons entre les articles
    private static void generateCombinations(int itr){
        Vector<String> candidatesTemp = new Vector<>();
        StringBuilder s1;
        StringBuilder s2;
        StringTokenizer strToken1, strToken2;
        if(itr==2){
            for(int i=0; i<candidates.size(); i++){
                strToken1 = new StringTokenizer(candidates.get(i));
                s1 = new StringBuilder(strToken1.nextToken());
                for(int j=i+1; j<candidates.size(); j++){
                    strToken2 = new StringTokenizer(candidates.elementAt(j));
                    s2 = new StringBuilder(strToken2.nextToken());
                    String addString = s1+" "+s2;
                    candidatesTemp.add(addString);
                }
            }
        }
        else {
            for(int i=0; i<candidates.size(); i++){
                for(int j=i+1; j<candidates.size(); j++){
                    s1 = new StringBuilder();
                    s2 = new StringBuilder();

                    strToken1 = new StringTokenizer(candidates.get(i));
                    strToken2 = new StringTokenizer(candidates.get(j));

                    for(int s=0; s<itr-2; s++){
                        s1.append(" ").append(strToken1.nextToken());
                        s2.append(" ").append(strToken2.nextToken());
                    }

                    if(s2.toString().compareToIgnoreCase(s1.toString())==0){
                        String addString = (s1 + " " + strToken1.nextToken() + " " + strToken2.nextToken()).trim();
                        candidatesTemp.add(addString);
                    }
                }
            }
        }
        candidates.clear();
        candidates = new Vector<>(candidatesTemp);
        candidatesTemp.clear();
        System.out.println();
    }

    //Utiliser pour Générer les ensembles des éléments fréquents qui restent 
    public static List<String> checkFrequentItems(int noOfTransactions, List<String> transactions, int minimumSupport){
        List <String> Resultat = new ArrayList<>();
        List<String> combList = new ArrayList<>(candidates);
        Resultat.add("L'ensemble des éléments fréquent numèro "+i);
        Resultat.add("\n");

        for (String str : combList) {
            String[] words = str.split(" ");
            int count = words.length;
            int flag = 0, itemSetOccurence = 0;
            for (int t = 0; t < noOfTransactions; t++){
                String transac = transactions.get(t);
                for (String wordStr : words) {
                    if (transac.contains(wordStr)) {
                        flag++;
                    }
                }
                if (flag == count){
                    itemSetOccurence++;
                }
                flag = 0;
            }

            if (itemSetOccurence >= minimumSupport){
                Resultat.add(str + " => support = " + itemSetOccurence);
                Resultat.add("\n");
                frequentItems.put(str, itemSetOccurence);
                finalFrequentItemSet.add(str);
            }
            itemSetOccurence = 0;
        }
        i++;
        return Resultat;
    }



}

