/* *****************************************************************************
 *  Name:              Zhiiw
 *  Last modified:     17/8/2020
 **************************************************************************** */

public class Color {
    public static void writeColor(Vec3 c) {
        int ir = (int) (255.999 * c.x());
        int ig = (int) (255.999 * c.y());
        int ib = (int) (255.999 * c.z());
        System.out.printf("%d %d %d\n", ir, ig, ib);
    }
}
