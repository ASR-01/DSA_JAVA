
public class Optimal {

    public static void main(String[] args) {
        int arr[] = { 4, 1, 6, -2, 7 };
        int Prefix[] = new int[5];
        Prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) 
            Prefix[i] = Prefix[i - 1] + arr[i];

        for (int val : Prefix) 
         System.out.print(val + " ");
        

    }
}

/*
 * Prefix[1] = Prefix[0] + arr[1];
 *               |
 *               |
 *             arr[0]
 * 
 * Prefix[2] = arr[0] + arr[1] + arr[2];
 *               |          |
 *              Prefix[0]   |
 *               |__________|
 *                   ||
 *               Prefix[1]
 * 
 * Prefix[2] = arr[0] + arr[1] + arr[2] + arr[3];
 *                |        |         |
 *             Prefix[0]   |         |
 *               |_________|_________|
 *                    ||         |
 *                  Prefix[1]    |
 *                    |__________|
 *                         ||
 *                     Prefix[2]
 * 
 *      ThereFore Prefix of arr[i] will be
 * 
 *      Prefix[i] = Prefix[i-1] + Prefix[i];
 */
