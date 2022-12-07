class RandomNumbers {
    public static void main(String[] args) {
        System.out.println("Outputting 5 Random Numbers:");
        System.out.println();

        int rNumAmount = 5;

        for (int i = 1; i <= rNumAmount; i++) {
            int rNum = (int) (Math.random() * 90 + 1);
            System.out.println("Random Number: " + rNum);
        }
    }
}