public class Calculator {

    public int countDigits(int n) {

        if (n == 0)
            return 1;
        int count = 0;
        while (n != 0) {
            n = n / 10;
            ++count;
        }
        return count;
    }


    public boolean evenOdd(int num) {
        int evenNumber = 0;
        int singleNumber = 0;
        while (num != 0) {
            int a = num % 10;
            num = num / 10;

            if (a % 2 == 0)
                evenNumber = evenNumber + a;
            else

                singleNumber = singleNumber + a;

        }
        if (evenNumber > singleNumber) {
            return true;

        } else {
            return false;

        }

    }


    public int getLastDigit(int number) {
        int lastDigit = number % 10;
        return lastDigit;

    }

    public int getDigit(int num, int k) {
        int count = 0;


        while (num != 0) {
            if (count == k) {
                num = num % 10;
                return num;
            } else {
                num = num / 10;
                count++;

            }
        }
        return num;
    }


    public int setDigit(int num, int k, int d) {


        int result = 0, multiply = 1, count = 0;

        while (num != 0) {
            int reminder = num % 10;
            if (count == k)
                result = result + d * multiply;
            else
                result = result + reminder * multiply;
            multiply *= 10;
            num = num / 10;
            count++;


        }
        if (num == 0) {
            return result;
        }

        if (num == k)
            result = result + d * multiply;
        else
            result = result + num * multiply;
        return result;
    }


    public int getDigit2(int num) {
        int count = 0;
        int result = 0;
        int multiply = 1;

        while (num != 0) {
            int reminder = num % 10;
            result = result + reminder * multiply;
            multiply *= 10;
            num = num / 10;
            if (num != 0)
                count++;

        }
        return getDigit(result, count);

    }

    public int countMinDigit(int num) {
        int min = num;
        int neNum = num;
        int a;
        int b;
        int sum = 0;
        int count = countDigits(num);
        for (int i = 0; i < count; i++) {
            a = neNum % 10;
            if (a < min)
                min = a;
            neNum = neNum / 10;
        }
        for (int i = 0; i < count; i++) {
            b = num % 10;
            if (b == min)
                sum++;

            num = num / 10;
        }
        return sum;
    }

    public boolean isSymmetric(int num) {

        int revers = +num;
        int sum = 0;
        while (num != 0) {

            int remender = num % 10;
            num = num / 10;
            sum = sum * 10 + remender;

        }
        if (sum == revers) {
            return true;
        } else {
            return false;
        }
    }

    public int Search(int num, int d) {
        int count = 0;
        while (num != 0) {

            int remender = num % 10;
            num = num / 10;
            if(remender == d){
                count ++;

            }

        }
        return count;

    }
}


















