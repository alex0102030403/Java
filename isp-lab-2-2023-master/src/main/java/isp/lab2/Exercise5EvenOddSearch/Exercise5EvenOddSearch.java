package isp.lab2.Exercise5EvenOddSearch;

public class Exercise5EvenOddSearch {

    public static int[] findEvenOdd(String input) {

        int[] res = new int[4];
        int maxEven = -999999;
        int smallOdd = 999999;
        int posEven = 0;
        int posOdd = 0;
        int pos = 0;
        String[] ress = input.split("[,]", 0);
        for(String myStr: ress) {

            int x = Integer.valueOf(myStr);
            if(x % 2==0)
            {
                if(x>maxEven){
                    maxEven=x;
                    posEven = pos;
                }

            }
            else{
                if(x<smallOdd)
                {
                    smallOdd=x;
                    posOdd = pos;
                }
            }
            ++pos;

        }
        res[0] = maxEven;
        res[2] = smallOdd;
        res[1] = posEven;
        res[3] = posOdd;
        return res;
    }

    public static void main(String[] args) {
        String input = "5,2,4,7,3,8,1,6";
        int[] result = findEvenOdd(input);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
