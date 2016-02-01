import java.util.*;
import java.io.*;

public class GrowthSort {

 public static void main(String args[])

 throws IOException {

  int n, b;

  int k;

  int i;

  FileReader fin = new FileReader("input.txt");
  FileWriter fout = new FileWriter("output.txt");
  Scanner inp = new Scanner(fin);
  int x1, x2, count;
  while (inp.hasNextInt()) {
   n = inp.nextInt();

   int a[] = new int[n];

   for (i = 0; i < n; i++) {

    k = inp.nextInt();

    a[i] = k;

   }
   x1 = inp.nextInt();
   x2 = inp.nextInt();

   count = 0;
   
   for (i = 0; i < n; i++) {

    if (a[i] >= Math.min(x1, x2) && a[i] <= Math.max(x1, x2)) {
     count++;
    }

   }

   fout.write(count + "\n");

  }

  fin.close();

  fout.close();

 }

}