package com.naxanria.mappy.util;

import net.minecraft.util.math.BlockPos;

public class MathUtil {
    public static int clamp(int val, int min, int max) {
        return val < min ? min : val > max ? max : val;
    }

    public static float clamp(float val, float min, float max) {
        return val < min ? min : val > max ? max : val;
    }

    public static double getDistance(BlockPos a, BlockPos b) {
        return getDistance(a, b, false);
    }

    public static double getDistance(BlockPos a, BlockPos b, boolean horizontalOnly) {
        int dist;
        int distX = (a.getX() - b.getX());
        int distZ = (a.getZ() - b.getZ());

        dist = distX * distX + distZ * distZ;
        if (horizontalOnly) {
            int distY = (a.getY() - b.getY());
            dist += distY * distY;
        }

        return Math.sqrt(dist);
    }
}
