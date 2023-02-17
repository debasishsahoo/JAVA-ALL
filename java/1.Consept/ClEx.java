public class ClEx {
    public static void main(String[] args) {
        Class c=ClEx.class;
        System.out.println(c.getClassLoader());

        System.out.println(String.class.getClassLoader());
    }
}
