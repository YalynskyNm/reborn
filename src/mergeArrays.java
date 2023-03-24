public class mergeArrays {
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int n = a1.length, m = a2.length;
        int i = 0, j = 0;
        int[] array = new int[n + m];

        while (i < n || j < m)
            array[i + j] = (i < n && (j == m || a1[i] < a2[j])) ? a1[i++] : a2[j++];

        return array;
    }
}


