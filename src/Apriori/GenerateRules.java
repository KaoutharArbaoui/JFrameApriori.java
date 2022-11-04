/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Apriori;

/**
 *
 * @author pc
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GenerateRules {
    
    //Cette fonction utilisé dans la fanction aprioriStart dans la classe FrequentItem pour générer les RA
    public static List<String> generateAssociationRules(List<String> finalFrequentItemSet, HashMap <String, Integer> frequentItems, double minimumConfidence)
    {
        List<String> res = new ArrayList();
        double confidence,confidence1;
        for (String item : finalFrequentItemSet) {
            int count = 0;
            double value = frequentItems.get(item);
            String str = "";
            StringBuilder str1 = new StringBuilder();
            String[] words = item.split(" ");
            int wordCountInString = words.length;
            if (wordCountInString == 2) /* for FrequentItemSet = 2*/ {
                double s = frequentItems.get(words[0]);
                confidence = value / s;
                count++;
                if (confidence >= minimumConfidence) {
                    res.add(words[0] + " -> " + words[1] + " , Confiance = " + confidence * 100 /*+ " , Support = " + (int) value + ""*/);
                    res.add("\n");
                }
                double s1 = frequentItems.get(words[1]);
                confidence = value / s1;
                count++;
                if (confidence >= minimumConfidence) {
                    res.add(words[1] + " -> " + words[0] + " , Confiance = " + confidence * 100/* + " , Support = " + (int) value + ""*/);
                    res.add("\n");
                }
            } else /* for FrequentItemSet > 2 */ {
                for (int a = 0; a < wordCountInString - 1; a++) {
                    if (a == 0) {
                        str = str + words[a];
                        count++;
                    } else {
                        str = str + " " + words[a];
                        count++;
                    }
                    for (int j = a + 1; j < wordCountInString; j++) {
                        {
                            str1.append(" ").append(words[j]);
                            count++;
                        }
                    }
                    double s = frequentItems.get(str);
                    confidence = value / s;
                    String st = str1.toString().trim();
                    double s1 = frequentItems.get(st);
                    confidence1 = value / s1;
                    if (confidence >= minimumConfidence) {
                        res.add(str + " -> " + str1 + " , Confiance = " + confidence * 100 /*+ " , Support = " + (int) value + ""*/);
                        res.add("\n");

                    }
                    if (confidence1 >= minimumConfidence) {
                        res.add(st + " -> " + str + " , Confiance = " + confidence1 * 100 /*+ " , Support = " + (int) value + ""*/);
                        res.add("\n");

                    }
                    str1 = new StringBuilder();
                }
                str1 = new StringBuilder();
            }

        }
        return res;
    }
    

}

