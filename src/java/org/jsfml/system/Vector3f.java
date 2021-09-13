package org.jsfml.system;

import java.io.Serializable;

/**
 * Represents three-dimensional vectors using floating point coordinates and provides
 * arithmetic operations on floating point 3D vectors.
 */
public final strictfp class Vector3f implements Serializable {
    private static final long serialVersionUID = -2176250005619169432L;

    /**
     * The zero vector.
     */
    public static final Vector3f ZERO = new Vector3f(0, 0, 0);
///////////////////////////////////////////////////////////////////////////////////////
    /**
     * Adds two vectors.
     *
     * @param a the first vector.
     * @param b the second vector.
     * @return a new vector, representing the sum of the two vectors.
     */
    public static Vector3f add(Vector3f a, Vector3f b) {
        return new Vector3f(
                a.x + b.x,
                a.y + b.y,
                a.z + b.z);
    }
    /**
     * Adds two vectors.
     *
     * @param vec the vector you would like to add to the current vector
     * @return a new vector, representing the sum of the two vectors.
     */
    public Vector3f add(Vector3f vec) {
        return new Vector3f(
                this.x + vec.x,
                this.y + vec.y,
                this.z + vec.z);
    }
/////////////////////////////////////////////////////////////////////////////////////
    /**
     * Subtracts two vectors.
     *
     * @param a the first vector.
     * @param b the second vector.
     * @return a new vector, representing the difference between the two vectors.
     */
    public static Vector3f sub(Vector3f a, Vector3f b) {
        return new Vector3f(
                a.x - b.x,
                a.y - b.y,
                a.z - b.z);
    }
    /**
     * Subtracts two vectors.
     *
     * @param vec the vector you would like to subtract from the current vector
     * @return a new vector, representing the difference between the two vectors.
     */
    public Vector3f sub(Vector3f vec) {
        return new Vector3f(
                this.x - vec.x,
                this.y - vec.y,
                this.z - vec.z);
    }
/////////////////////////////////////////////////////////////////////////////
    /**
     * Performs a component-wise multiplication of two vectors.
     *
     * @param a the first vector.
     * @param b the second vector.
     * @return a new vector, representing the "product" of the two vectors.
     */
    public static Vector3f componentwiseMul(Vector3f a, Vector3f b) {
        return new Vector3f(
                a.x * b.x,
                a.y * b.y,
                a.z * b.z);
    }
    /**
     * Performs a component-wise multiplication of two vectors.
     *
     * @param vec the first vector.
     * @return a new vector, representing the "product" of the two vectors.
     */
    public Vector3f componentwiseMul(Vector3f vec) {
        return new Vector3f(
                this.x * vec.x,
                this.y * vec.y,
                this.z * vec.z);
    }
////////////////////////////////////////////////////////////////////////
    /**
     * Performs a component-wise division of two vectors.
     *
     * @param a the first vector.
     * @param b the second vector.
     * @return a new vector, representing the "quotient" of the two vectors.
     */
    public static Vector3f componentwiseDiv(Vector3f a, Vector3f b) {
        return new Vector3f(
                a.x / b.x,
                a.y / b.y,
                a.z / b.z);
    }
    /**
     * Performs a component-wise division of two vectors.
     *
     * @param vec the vector you would like to divide the current vector by
     * @return a new vector, representing the "quotient" of the two vectors.
     */
    public Vector3f componentwiseDiv(Vector3f vec) {
        return new Vector3f(
                this.x / vec.x,
                this.y / vec.y,
                this.z / vec.z);
    }
///////////////////////////////////////////////////////////////////////////////
    /**
     * Multiplies a vector by a scalar.
     *
     * @param a the vector.
     * @param s the scalar to multiply by.
     * @return a new vector, representing the scaled vector.
     */
    public static Vector3f mul(Vector3f a, float s) {
        return new Vector3f(
                a.x * s,
                a.y * s,
                a.z * s);
    }
    /**
     * Multiplies a vector by a scalar.
     *
     * @param s the scalar to multiply by.
     * @return a new vector, representing the scaled vector.
     */
    public Vector3f mul(float s) {
        return new Vector3f(
                this.x * s,
                this.y * s,
                this.z * s);
    }
///////////////////////////////////////////////////////////////////////////////
    /**
     * Multiplies a vector by the inverse of a scalar.
     *
     * @param a the vector.
     * @param s the scalar to divide by.
     * @return a new vector, representing the scaled vector.
     */
    public static Vector3f div(Vector3f a, float s) {
        return new Vector3f(
                a.x / s,
                a.y / s,
                a.z / s);
    }
    /**
     * Multiplies a vector by the inverse of a scalar.
     *
     * @param s the scalar to divide by.
     * @return a new vector, representing the scaled vector.
     */
    public Vector3f div(float s) {
        return new Vector3f(
                this.x / s,
                this.y / s,
                this.z / s);
    }
//////////////////////////////////////////////////////////////////////////////////
    /**
     * Computes the negation of a vector.
     *
     * @param v the vector.
     * @return a new vector, representing the negation of the given vector.
     */
    public static Vector3f neg(Vector3f v) {
        return new Vector3f(-v.x, -v.y, -v.z);
    }
    /**
     * Computes the negation of a vector.
     *
     * @return a new vector, representing the negation of the current vector.
     */
    public Vector3f neg() {
        return new Vector3f(-this.x, -this.y, -this.z);
    }
////////////////////////////////////////////////////////////////////////////////////
    /**
     * The vector's X coordinate.
     */
    public final float x;

    /**
     * The vector's Y coordinate.
     */
    public final float y;

    /**
     * The vector's Z coordinate.
     */
    public final float z;

    /**
     * Constructs a new vector with the given coordinates.
     *
     * @param x the X coordinate.
     * @param y the Y coordinate.
     * @param z the Z coordinate.
     */
    public Vector3f(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Constructs a new vector by converting an integral vector.
     * <p/>
     * The fractions of the coordinates will be zero.
     *
     * @param v the vector to convert.
     */
    public Vector3f(Vector3i v) {
        this((float) v.x, (float) v.y, (float) v.z);
    }

    @Override
    public boolean equals(Object o) {
        return (o instanceof Vector3f &&
                ((Vector3f) o).x == x && ((Vector3f) o).y == y && ((Vector3f) o).z == z);
    }

    @Override
    public int hashCode() {
        final int ix = x != 0.0f ? Float.floatToIntBits(x) : 0;
        final int iy = y != 0.0f ? Float.floatToIntBits(y) : 0;
        final int iz = y != 0.0f ? Float.floatToIntBits(z) : 0;
        return (ix * 0x1F1F1F1F) ^ (iy * 0x0F0F0F0F) ^ iz;
    }

    @Override
    public String toString() {
        return "Vector3f{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
