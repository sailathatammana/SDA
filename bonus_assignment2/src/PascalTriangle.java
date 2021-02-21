public class PascalTriangle {
    public static void  printPascaltriangle()
    {
        int[][] myarray = new int[20][20];
        StringBuilder builder = new StringBuilder();
        int number = 20;
        int s = number - 1;
        //filling the 2D matrix.
        for (int i = 0; i < number; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                if (j == 0 || j == i)
                {
                    myarray[i][j] = 1;
                } else {
                    myarray[i][j] = myarray[i - 1][j - 1] + myarray[i - 1][j];
                }
                if (myarray[19][j] != 0)
                    builder.append(myarray[19][j]).append(" ");

            }
        }
        System.out.print("The 20th row of the Pascal Pyramid is: " + builder.toString());

        //displaying the Pascal's Triangle as the output.
        System.out.println("\nOUTPUT:\n");
        for (int i = 0; i < number; i++)
        {
            for (int j = 0; j <= s; j++)
                System.out.print("  ");
            //printing blank spaces at the beginning of rows

            s--;

            for (int j = 0; j <= i; j++)
                System.out.print(myarray[i][j] + "  ");
            {
                System.out.println();
            }
        }

    }

    public static void main(String[] args) {

        printPascaltriangle();
    }
}


