package section_2;

public class Arrays {
    public static void main(String[] args) {
        int nums[];
        int[] nums2;

        nums = new int[4];

        nums2 = new int[]{1, 2, 3, 4, 5};

        int[] nums3 = new int[4];
        nums3[0] = 1;
        nums3[1] = 2;
        nums3[2] = 3;
        nums3[3] = 4;

        System.out.println(nums3[2]); // 3

        int lenght = nums3.length; // 4
        int last = nums3[nums3.length - 1];

        int[] one_array = new int[]{1, 2, 3, 4, 5, 6};
        int[][] two_array = {{1, 2, 3}, {4, 5, 6}};

        int[][] jagg_array = new int[3][];
        jagg_array[0] = new int[2];
        jagg_array[1] = new int[3];
        jagg_array[2] = new int[5];

        int[] foreach_array = new int[]{1, 2, 3, 4, 5};
        for (int i :
                foreach_array) {

            System.out.println(i);
        }

        for (int i = 0; i < foreach_array.length; i++) {
            foreach_array[i] = foreach_array[i] * 2;
            System.out.println(foreach_array[i]);
        }

        int[][] double_array = new int[][]
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };
        for (int i = 0; i < double_array.length; i++) {
            for (int j = 0; j < double_array[i].length; j++) {

                System.out.printf("%d ", double_array[i][j]);
            }
            System.out.println();
        }
    }
}
