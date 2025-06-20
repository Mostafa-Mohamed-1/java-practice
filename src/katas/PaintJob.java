package katas;

public class PaintJob {

    public static void main(String[] args) {
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(10,5,2));
        System.out.println(getBucketCount(3.4, 2));
    }

    public static int getBucketCount(double width, double height , double areaPerBucket, int extraBuckets) {

        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }

        double area = width * height;
        double neededBuckets = area / areaPerBucket;
        int remainingBuckets =(int) (Math.ceil(neededBuckets)- extraBuckets);

        return remainingBuckets > 0 ? remainingBuckets : 0;
    }
    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        double area = width * height;
        int totalBuckets = (int) Math.ceil(area / areaPerBucket);

        return totalBuckets;
    }
    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        int buckets = (int) Math.ceil(area / areaPerBucket);
        return buckets;
    }





}
