class Pile {
    private Integer[] array;

    public Pile(Integer[] array) {
        this.array = array;
    }

    public Integer[] getArray() {
        return array;
    }

    public void sort(int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;

            sort(p, q);

            sort(q + 1, r);

            merge(p, q, r);
        }
    }

    private void merge(int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;

        Integer[] L = new Integer[n1 + 1];
        Integer[] R = new Integer[n2 + 1];

        for (int i = 0; i < n1; i++) {
            L[i] = array[p + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = array[q + 1 + j];
        }

        L[n1] = Integer.MAX_VALUE;
        R[n2] = Integer.MAX_VALUE;

        int i = 0;
        int j = 0;

        for (int k = p; k <= r; k++) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
        }
    }

    public void printArray() {
        for (Integer val : array) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}

public class merge_sort {
    public static void main(String[] args) {
        Integer[] data = { 2, 4, 1, 3, 5, 3, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        Pile pile = new Pile(data);

        System.out.println("Original Array:");
        pile.printArray();

        pile.sort(0, data.length - 1);

        System.out.println("Sorted Array:");
        pile.printArray();
    }
}