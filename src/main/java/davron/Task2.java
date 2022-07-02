package davron;

public class Task2 {
    public static int task2(int n) {
        /**
         *  ko'paytma  nechta bilan 0  tugashini bilish uchun ko'paytmadagi
         *  2 va 5 soni yoki shunga karrali sonlarni aniqlash kerak
         *  tub sonlardan iborat ko'paytma so'ralgani uchun ikki xil xolat bo'ladi
         *  agar n >= 5 bo'lsa bitta qolgan holatlarda 0 ta bo'ladi
         */
        if (n >= 5)
            return 1;
        else
            return 0;

    }

    public static void main(String[] args) {
        System.out.println(task2(5));
        // 2 *3*5 = 30
    }
}
