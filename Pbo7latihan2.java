import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Pbo7latihan2{
   public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a[] = new int[10];
        int i = 0;

        while (i < 10) {
            String x = JOptionPane.showInputDialog("Masukkan angka:");
            a[i] = Integer.parseInt(x);
            i = i + 1;
        }

        int b = a[0];

        i = 1;
        while (i < 10) {
            if (a[i] > b) {
                b = a[i];
            }
            i = i + 1;
        }

        JOptionPane.showMessageDialog(null, "Terbesar = " + b);
    }
}