/**
 * @param {number[]} candies
 * @param {number} extraCandies
 * @return {boolean[]}
 */
var kidsWithCandies = function(candies, extraCandies) {
    const maxNum = Math.max(...candies);
    return candies.map((item) => {
        if(item + extraCandies >= maxNum)
            return true;
        else
            return false;
    });
};