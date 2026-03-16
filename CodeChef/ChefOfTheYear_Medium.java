// https://www.codechef.com/problems/CVOTE

import java.util.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int m=input.nextInt();
        HashMap<String, String> chefToCountry=new HashMap<>();
        TreeMap<String, Integer> chefVotes=new TreeMap<>();
        TreeMap<String, Integer> countryVotes=new TreeMap<>();
        for(int i=0;i<n;i++){
            String name=input.next();
            String country=input.next();
            chefToCountry.put(name,country);
        }
        for(int i=0;i<m;i++){
            String votedChef=input.next();
            String country=chefToCountry.get(votedChef);
            chefVotes.put(votedChef,chefVotes.getOrDefault(votedChef, 0)+1);
            countryVotes.put(country,countryVotes.getOrDefault(country, 0)+1);
        }
        String winnerCountry="";
        int maxCountryVotes=-1;
        for(Map.Entry<String,Integer> entry:countryVotes.entrySet()){
            if (entry.getValue()>maxCountryVotes){
                maxCountryVotes=entry.getValue();
                winnerCountry=entry.getKey();
            }
        }
        String winnerChef="";
        int maxChefVotes=-1;
        for(Map.Entry<String, Integer> entry:chefVotes.entrySet()) {
            if(entry.getValue()>maxChefVotes){
                maxChefVotes=entry.getValue();
                winnerChef=entry.getKey();
            }
        }
        System.out.println(winnerCountry);
        System.out.println(winnerChef);
    }
}
