import java.time.Year;
import java.util.Date;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    Data(int dia, int mes, int ano){
    this.dia = dia;
    this.mes = mes;
    this.ano = ano;
        if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12  && dia > 31){
            System.out.println("Data Inválida.");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
        else if (mes == 4 || mes == 6 || mes == 9 || mes == 11 && dia > 30){
            System.out.println("Data inválida.");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;

        }
        else if (mes == 2 && verificaAnoBissexto() && dia >29 || mes == 2 && !verificaAnoBissexto() && dia >28){
            System.out.println("Data inválida");
            this.dia = 1;
            this.mes = 1;
            this.ano = 1;
        }

        else {
            System.out.println("Data válida.");
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public int getDia(){
        return dia;
    }

    public void setDia(int dia){
        this.dia = dia;
    }

    public int getMes(){
        return mes;
    }

    public void setMes(int mes){
        this.mes = mes;
    }


    public  boolean verificaAnoBissexto(){

        if (Year.isLeap(this.ano)){
            return true;
        }
        else {
            return false;
        }
    }
    public String toString() {
        return  "Dia = " + dia + "\n" +
                "Mes = " + mes + "\n" +
                "Ano = " + ano;
    }
}











