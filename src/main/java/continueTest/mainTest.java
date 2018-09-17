package continueTest;


public class mainTest {
    public static void main(String[] args) {
        positions:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(i+" "+j);
                if(i<j){
                    continue positions;
                }
            }
        }
        System.out.println(mainTest.class.getName());
    }
}
