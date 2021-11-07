package com.company;

public class VareData {
    private int antal;
    private String varenavn;
    private double stkPris;

    public VareData() {

    }

    public VareData(int antal, String varenavn, double stkPris) {
        this.antal = antal;
        this.varenavn = varenavn;
        this.stkPris = stkPris;
    }

    public int getAntal() {
        return antal;
    }

    public void setAntal(int antal) {
        this.antal = antal;
    }

    public String getVarenavn() {
        return varenavn;
    }

    public void setVarenavn(String varenavn) {
        this.varenavn = varenavn;
    }

    public double getStkPris() {
        return stkPris;
    }

    public void setStkPris(double stkPris) {
        this.stkPris = stkPris;
    }


}

/*

Opgave 1  den 28/10-2021

        Et fritidshjem bestiller dagligvarer. I en tekstfil ”bestilling.txt” ligger information om de varer der bestilles.

        Antal: angiver hvor mange stk. af varen der bestilles.
        Varenavn: Navnet på varen.
        Stkpris: Hvad 1 stk. af varen koster.

        Hvis der købes mere end 10 stk. af en vare, så gives der 15% rabat på prisen på den pågældende vare.

        Programmet skal:
        -	Opret en klasse VareData, med konstruktør, set og get funktioner.
        -	Opret et array af VareData objekter.
        -	Indlæs informationerne fra tekstfilen ”bestilling.txt” i VareData-objekter.
        -	Lav en funktion udskriv, som modtager et array af VareData og som udskriver indholdet til skærm.
        -	Skriv indholdet af arrayet med VareData til en datafil “varer.ser” med ObjectOutputStream (DATAOUTPUTSTREAM?).
        -	Indlæs fra datafil “varer.ser” med ObjectInputStream til et array af VareData objekter. Kald funktionen udskriv.
        -	Lav funktion som beregner den samlede pris for hver vare med og uden rabat.
        -	Lav funktion, som beregner saldoen for det samlede varekøb med og uden rabatter.
        -	Lav funktion, som udskriver faktura hvor der er informationer om: hvilke varer der er købt, antallet af hver vare, prisen for hver vare med og uden rabat, og den samlede saldo med og uden rabat. Fakturaen skal både udskrives til skærm og til en ny tekstfil ”faktura.txt”.


        Tekstfilen ”bestilling.txt” skal indeholde:
        20	maelk		10,50
        7	smoer		15,75
        12	franskbroed	25,00
        8 	rugbroed	17,75
        18	yoghurt		12,25
*/
