public class firstandlastpos {

        public int[] searchRange(int[] nums, int target)
        {
            int[] result = {-1, -1};

            result[0] = findLeftmostIndex(nums, target);
            result[1] = findRightmostIndex(nums, target);

            return result;
        }

        private int findLeftmostIndex(int[] nums, int target) {
            int index = -1;
            int low = 0;
            int high = nums.length - 1;

            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (nums[mid] >= target) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }

                if (nums[mid] == target) {
                    index = mid;
                }
            }

            return index;
        }

        private int findRightmostIndex(int[] nums, int target) {
            int index = -1;
            int low = 0;
            int high = nums.length - 1;

            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (nums[mid] <= target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }

                if (nums[mid] == target) {
                    index = mid;
                }
            }

            return index;
        }

        public static void main(String[] args) {
            firstandlastpos solution = new firstandlastpos();

            int[] nums1 = {5, 7, 7, 8, 8, 10};
            int target1 = 8;
            int[] result1 = solution.searchRange(nums1, target1);
            System.out.println("Output:" + result1[0] + "," + result1[1] );
        }
    }
