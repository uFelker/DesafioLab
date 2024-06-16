//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


        public int menorNumero(int n1, int n2, int n3) {
          
            if (n1 <= n2 && n1 <= n3) {
                return n1;
            } else if (n2 <= n1 && n2 <= n3) {
                return n2;
            } else {
                return n3;
            }
        }
    }
