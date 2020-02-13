package coding_test_preperation;

public class _20200213_DFS_target_num {
	public static void main(String[] args) {

		int[] numbers = new int[] { 1, 1, 1, 1, 1 };
		int target = 3;

		int answer = 0;
		answer = dfs(numbers, 0, 0, target);
		System.out.println(answer);

	}
	
	public static int dfs(int[] numbers, int n, int sum, int target) {
		if (n == numbers.length) {
			if (sum == target) {
				return 1;
			}
			return 0;
		}
		return dfs(numbers, n + 1, sum + numbers[n], target) + dfs(numbers, n + 1, sum - numbers[n], target);
	}

	
}
