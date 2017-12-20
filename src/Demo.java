/**
 * Craete with Intellij IDEA
 * Author:wgt
 * Date:17-8-25
 * Description:
 */
public class Demo {
    public static void main(String[] args) {
        double[][] score = {{87.5, 93.5, 68}, {82.5, 90, 80.5}, {36, 48, 92.5}, {92.5, 58, 73.5}};
        double max = score[0][0];
        int i = 0, j = 0;
        for (int x = 0; x < score.length; x++) {
            for (int y = 0; y < score[x].length; y++) {
                max = Math.max(max, score[x][y]);
                i=x;
                j=y;
            }
        }
        System.out.println("max="+max);
        System.out.println("i="+i+"  j="+j);
    }
}
