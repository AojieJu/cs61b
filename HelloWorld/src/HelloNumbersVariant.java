public class HelloNumbersVariant {
    public static void main(String[] args){
        int x=0;
        int i=0;
        while (x<45){
           System.out.println(x+" ");
           i++; //Which is equivalent to i=i+1
           x+=i; //Which is equivalent to x=x+i
        }
    }
}
