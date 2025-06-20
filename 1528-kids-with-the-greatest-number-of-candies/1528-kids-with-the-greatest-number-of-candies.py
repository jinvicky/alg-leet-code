class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        
        answer = []
        currentMax = max(candies)

        for c in candies:
            if(c+extraCandies >= currentMax):
                answer.append(True)
            else:
                answer.append(False)

        return answer
