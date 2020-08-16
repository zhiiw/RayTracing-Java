/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class HelloWorldGra2 {
    public static void main(String[] args) {
        int imageWidth = 256;
        int imageHeight = 256;

        System.out.printf("P3\n");
        System.out.printf("%d %d\n", imageHeight, imageWidth);
        System.out.printf("255\n");
        for (int j = imageWidth - 1; j >= 0; j--) {
            for (int i = 0; i < imageHeight; i++) {

                Vec3 pixelColor = new Vec3((float) i / (imageHeight - 1),
                                           (float) j / (imageWidth - 1), 0.25);
                Color.writeColor(pixelColor);

            }
        }

    }
}
