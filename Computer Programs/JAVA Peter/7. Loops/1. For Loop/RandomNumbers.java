class RandomNumbers {
    public static void main(String[] args) {
        System.out.println("Outputting 5 Random Numbers:");
        System.out.println();

        for (int i = 1; i <= 5; i++) {
            int rNum = (int) (Math.random() * 90 + 1);
            System.out.println("Random Number: " + rNum);
        }
    }
}