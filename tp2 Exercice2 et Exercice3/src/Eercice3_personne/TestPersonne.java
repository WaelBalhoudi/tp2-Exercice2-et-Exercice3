package Eercice3_personne;

public class TestPersonne {
    public static void main(String[] args) {
        Personne personne=new Personne();
        personne.setFirstName("Wael");
        personne.setName("Balhoudi");
        personne.setDaeNaiss(5,6,2003);
        System.out.println(personne.firstName+" "+personne.name+" votre age est:"+personne.ageEn2023());
    }
}
