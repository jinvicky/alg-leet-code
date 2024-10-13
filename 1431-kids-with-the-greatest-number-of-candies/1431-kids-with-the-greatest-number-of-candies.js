/**
 * @param {number[]} candies
 * @param {number} extraCandies
 * @return {boolean[]}
 */
var kidsWithCandies = function(candies, extraCandies) {
    let result = [];

    const maxNum = Math.max(...candies);
    candies.map((item) => {
        if(item + extraCandies >= maxNum)
            result.push(true);
        else
            result.push(false);
    });

    console.log(result);
    return result;
};