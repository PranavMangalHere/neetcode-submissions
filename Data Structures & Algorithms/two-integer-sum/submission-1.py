class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:

        prev_map = {}

        for i in range(0, len(nums)):

            val = target - nums[i]

            if val in prev_map:
                return [prev_map[val], i]
            else:
                prev_map[nums[i]] = i
        
        return [-1, -1]
        