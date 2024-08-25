/**
 * @param {string} ransomNote
 * @param {string} magazine
 * @return {boolean}
 */
var canConstruct = function(ransomNote, magazine) {
    let result = true;
    let mz = magazine;

    for (let char of ransomNote) {
        if(mz.indexOf(char) === -1) {
            result = false;
            break;
        }
        mz = mz.replace(char, '');
    }
    return result;
};