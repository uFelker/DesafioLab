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

        if (verificarData(dia, mes, ano) ){
            System.out.println("Data Inválida.");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
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


    public boolean verificaAnoBissexto(){

        if (Year.isLeap(ano)){
            return true;
        }
        else {
            return false;
        }
    }

    private boolean verificarData(int dia, int mes, int ano){
        if (dia <= 0){
            return true;
        }
        else if (mes <= 0 || mes > 12){
            return true;
        }
        else if (ano <= 0){
            return true;
        }
        else if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)  && dia > 31){
            return true;
        }
        else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30){
            return true;
        }
        else if ((mes == 2 && verificaAnoBissexto() && dia > 29) || (mes == 2 && !verificaAnoBissexto() && dia > 28)){
            return true;
        }
        else{
            return false;
        }
    }
    public String toString() {
        return  "Dia = " + dia + "\n" +
                "Mes = " + mes + "\n" +
                "Ano = " + ano;
    }
}











