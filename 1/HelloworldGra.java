/* *****************************************************************************
 *  Name:              zhiiw
 *  Last modified:     8/16/2020
 **************************************************************************** */

public class HelloworldGra {
    public static void main(String[] args) {
        int imageWidth = 256;
        int imageHeight = 256;

        System.out.printf("P3\n");
        System.out.printf("%d %d\n", imageHeight, imageWidth);
        System.out.printf("255\n");
        for (int j = imageWidth - 1; j >= 0; j--) {
            for (int i = 0; i < imageHeight; i++) {
                double r = (double) i / (imageHeight - 1);
                double g = (double) j / (imageWidth - 1);
                double b = 0.25;

                int ir = (int) (255.999 * r);
                int ig = (int) (255.999 * g);
                int ib = (int) (255.999 * b);
                System.out.printf("%d %d %d\n", ir, ig, ib);
            }
        }

    }
}
