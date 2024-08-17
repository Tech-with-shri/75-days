class A {

    public static void main(String[] args) {

        int count = 10;
        int a = 0;
        int b = 1;
        {
            for (int i = 0; i <= count; i++) {
                int c = a + b;
                System.out.println(c);
                a = b;
                b = c;
            }
        }
    }
}
