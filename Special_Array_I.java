class Solution:
    def isArraySpecial(self, nums):
        for i in range(len(nums) - 1):
            if nums[i] % 2 == nums[i + 1] % 2:
                return False
        return True

if __name__ == "__main__":
    solution = Solution()
    nums1 = [1]
    print(solution.isArraySpecial(nums1))
