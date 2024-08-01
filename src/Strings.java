public class Strings {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello"); //s1 and s2 have same reference while s3 does not

        s1 += " ";

        boolean st = s1.equals(s2);
        System.out.println(st);

        int val = s1.compareTo(s3);
        System.out.println(val);

        for(int i = 0;i<s3.length();i++){
            System.out.println(s3.charAt(i));
        }
        s1.trim();
        System.out.println(s1);

        String s = s1.substring(0,2);

        s1 += " World";
        String[] strings  = s1.split(" ");
    }
}
