package Eercice3_personne;

public class Personne {
    String name,firstName;
    int dayNaisent ,monthNaissent, yearNaaissent;

    public void setName(String name) {
        this.name = name;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setDaeNaiss(int j,int m, int a){
        dayNaisent=j;
        monthNaissent=m;
        yearNaaissent=a;
    }
    public int ageEn2023(){
        return 2023-yearNaaissent;
    }
}
