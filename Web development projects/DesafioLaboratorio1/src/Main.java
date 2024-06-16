//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Data d1 = new Data(10, 3, 2023);
        System.out.println("\n[OK] Classe Data identificada");

        //public void setDia(int dia);
        d1.setDia(15);
        System.out.println("[OK] Método Dia.setDia()");

        //public int getDia();
        System.out.println(d1.getDia() == 15 ? "[OK] Método Dia.getDia()" : "[NOK] Método Dia.getDia()");

        //public void setMes(int mes);
        d1.setMes(12);
        System.out.println("[OK] Método Dia.setMes()");

        //public int getMes()
        System.out.println(d1.getMes() == 12 ? "[OK] Método Dia.getMes()" : "[NOK] Método Dia.getMes()");

        //public void setAno(int ano);
        d1.setAno(2024);
        System.out.println("[OK] Método Dia.setAno()");

        //public int getAno();
        System.out.println(d1.getAno() == 2024 ? "[OK] Método Dia.getAno()" : "[NOK] Método Dia.getAno()");

        //public String toString();
        d1.toString();
        System.out.println("[OK] Método Data.toString()");

        //public boolean verificaAnoBissexto();
        System.out.println(d1.verificaAnoBissexto() ? "[OK] Método Dia.verificaAnoBissexto()" : "[NOK] Método Dia.verificaAnoBissexto()");
        }
    }