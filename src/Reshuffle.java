import java.util.Scanner;

public class Reshuffle {

 public static void main(String[] args) {
  // TODO Auto-generated method stub

  Scanner in = new Scanner(System.in);
  int n = in.nextInt();
  boolean[] arr = new boolean[10000];

  int a;
  for (int i = 0; i < n; i++)
   if ((a = in.nextInt()) < 1e4)
    arr[a - 1] = true;
  int i = 0;

  while (arr[i] && i < n)
   i++;
  int res = 0;
  if (i != n)
   res = i + 1;
  System.out.println(res);
 }
}