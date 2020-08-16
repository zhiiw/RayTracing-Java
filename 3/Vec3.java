/* *****************************************************************************
 *  Name:              Zhiiw
 *  Last modified:     16/8/2020
 **************************************************************************** */

public class Vec3 {
    public double[] e = new double[3];

    public Vec3() {
    }

    public Vec3(double x, double y, double z) {
        e[0] = x;
        e[1] = y;
        e[2] = z;
    }

    public double x() {
        return e[0];
    }

    public double y() {
        return e[1];
    }

    public double z() {
        return e[2];
    }

    public Vec3 Add(Vec3 v) {
        return new Vec3(e[0] + v.e[0], e[1] + v.e[1], e[2] + v.e[2]);
    }

    public Vec3 Add(Vec3 c, Vec3 d) {
        return new Vec3(c.e[0] + d.e[0], c.e[1] + d.e[1], c.e[2] + d.e[2]);
    }

    public Vec3 Sub(Vec3 v) {
        return new Vec3(e[0] - v.e[0], e[1] - v.e[1], e[2] - v.e[2]);
    }

    public Vec3 Sub(Vec3 c, Vec3 d) {
        return new Vec3(c.e[0] + d.e[0], c.e[1] + d.e[1], c.e[2] + d.e[2]);
    }

    public Vec3 Mul(Vec3 v) {
        return new Vec3(e[0] * v.e[0], e[1] * v.e[1], e[2] * v.e[2]);
    }

    public Vec3 Mul(Vec3 c, Vec3 d) {
        return new Vec3(c.e[0] + d.e[0], c.e[1] + d.e[1], c.e[2] + d.e[2]);
    }

    public Vec3 div(Vec3 v) {
        return new Vec3(e[0] * 1 / v.e[0], e[1] * 1 / v.e[1], e[2] * 1 / v.e[2]);
    }

    public Vec3 div(Vec3 c, Vec3 d) {
        return new Vec3(c.e[0] + d.e[0], c.e[1] + d.e[1], c.e[2] + d.e[2]);
    }

    public double length() {
        return (double) Math.sqrt(e[0] * e[0] + e[1] * e[1] + e[2] * e[2]);
    }

    public double lengthSquared() {
        return (double) (e[0] * e[0] + e[1] * e[1] + e[2] * e[2]);
    }

    public Vec3 dotAdd(Vec3 c, double t) {
        return new Vec3(t * c.e[0], t * c.e[1], t * c.e[2]);
    }

    public double dot(Vec3 a, Vec3 b) {
        return (a.x() * b.x() + a.y() * b.y() + a.x() * b.y());
    }

    public double dot(Vec3 c) {
        return (e[0] * c.x() + e[1] * c.y() + e[2] * c.y());
    }

    public Vec3 cross(Vec3 a, Vec3 b) {
        return new Vec3(a.y() * b.z() - a.z() * b.y(),
                        a.z() * b.x() - a.x() * b.z(),
                        a.x() * b.y() - a.y() * b.x());
    }

    public Vec3 normalize(Vec3 v) {
        double length = v.length();
        return new Vec3(v.x() / length, v.y() / length, v.z() / length);
    }

    public Vec3 normalize() {
        double length = this.length();
        return new Vec3(e[0] / length, e[1] / length, e[2] / length);
    }

}


