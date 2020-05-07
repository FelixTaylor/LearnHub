package exceptions;

public class NullPointerExample {
    static class MyObject {
        private Integer num;
        public MyObject() {
            this.num = null;
        }
        public int getNum() {
            return this.num;
        }
    }

    /**
     * <p> Minimal example of a NullPointerException.
     * @since 2020-05-06
     */
    public static void main(String[] args) {
        int n = doStuff(new MyObject());
        System.out.println(n);
    }

    private static int doStuff(MyObject obj) {
        return obj.getNum();
    }
}