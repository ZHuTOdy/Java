import java.util.ArrayList;
import java.util.List;

public class Solution {
    private List<List<Integer>> ret = new ArrayList<>();
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        System.out.println(new Solution().subsets(nums));
    }
    private List<List<Integer>> subsets(int[] nums) {
        dfs(new ArrayList<>(), nums, 0);
        return ret;
    }

    private void dfs(List<Integer> list, int[] nums, int i) {
        if (i == nums.length) {
            ret.add(new ArrayList<>(list));
            return;
        }
        for (int j = i; j < nums.length; j++) {
            list.add(nums[j]);
            //使用j+1,避免出现重复
            dfs(list, nums, j + 1);
            list.remove(list.size() - 1);
        }
        dfs(list, nums, nums.length);
    }
}
