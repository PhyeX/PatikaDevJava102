package com.company;

public class Main {

    public static void main(String[] args) {
    MatchFilter matchFilter = new MatchFilter();
    matchFilter.add("Galatasaray");
    matchFilter.add("Bursaspor");
    matchFilter.add("Fenerbahçe");
    matchFilter.add("Beşiktaş");
    matchFilter.add("Başakşehir");
    matchFilter.add("Bursaspor");
    matchFilter.generateMatches();

    /*
    Takımlar
    - Galatasaray
    - Bursaspor
    - Fenerbahçe
    - Beşiktaş
    - Başakşehir
    - Bursaspor
     */
    }
}
