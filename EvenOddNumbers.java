
class EvenOddNumber {

 
    public boolean findEvenOrOdd(int i) {
        if (i % 2 == 0) {
            return true;  // It is even
        } else {
            return false; // It is odd
        }
    }
}


public class EvenOddNumbers {
    public static void main(String[] args) {
        
        
        EvenOddNumber checker = new EvenOddNumber();
        
        int testNumber = 7; 
        
        
        boolean isEven = checker.findEvenOrOdd(testNumber);
        
        if (isEven) {
            System.out.println(testNumber + " is an even number.");
        } else {
            System.out.println(testNumber + " is an odd number.");
        }
    }
}