public class StringBufferImpl {
    public static void main(String[] args) {

        StringBuffer st = new StringBuffer("Hello");
        st.append(" ");

        System.out.println(st);

        for(int i = 0;i<st.length();i++)
            System.out.println(st.charAt(i));

        st.deleteCharAt(0);
        System.out.println(st);

        st.setCharAt(0,'i');
        System.out.println(st);
    }
}
