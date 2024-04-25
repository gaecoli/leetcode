package main

import "fmt"

/*
给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。

你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。

你可以按任意顺序返回答案。
示例 1：

输入：nums = [2,7,11,15], target = 9
输出：[0,1]
解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
*/
func twoSum(nums []int, target int) []int {
	// 创建 map，用于存储满足的nums[i]和它的下标
	// 只有满足条件的值才会被存储进去
	var hashTable = map[int]int{}
	// hashTable := make(map[int]int)
	for i := 0; i < len(nums); i++ {
		// 如果 hashTable 中存在 target - nums[i] 的值则返回它的下标
		if v, ok := hashTable[target-nums[i]]; ok {
			return []int{v, i}
		}
		hashTable[nums[i]] = i
	}
	return nil
}

func main() {
	var nums = []int{2, 7, 11, 15}

	target := 9

	result := twoSum(nums, target)

	fmt.Println(result)
}
