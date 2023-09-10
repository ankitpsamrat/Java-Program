public class array {
    public static void main(String[] args) {

        // first method
        // int num[];
        // num = new int[5];

        // second method
        // int[] num;
        // num=new int[5];

        // third method
        // int[] num = new int[5];

        int num[] = new int[5];
        num[0] = 10;
        num[1] = 20;
        num[2] = 30;
        num[3] = 40;
        num[4] = 50;

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}