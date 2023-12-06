import java.util.Scanner;

public class Person {
    private String Name,SN;
    private int Ocenka;
    private String Status;
    public Person (String Name,String SN,int Ocenka,String Status){
        this.Name=Name;
        this.SN=SN;
        this.Ocenka=Ocenka;
        this.Status=Status;
    }
    public String getN() {return Name;}
    public String get_SN(){return SN;}
    public int getOcenka(){return Ocenka;}
    public String getStatus(){return Status;}

    @Override
public String toString() {
    return "ФИО" + this.getN() + "" + this.getN().charAt(0)+"."+this.get_SN().charAt(0)+"."+" Успеваемость:"+this.getStatus()+", оценка:"+ this.getOcenka();

    }
}
