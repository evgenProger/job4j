function testArray(a, b) {
    var sum1 = 0;
    var sum2 = 0;
    for (var i = 0; i < a.length; i++) {
        sum1 += a[i];
    }
    for (var i = 0; i < b.length; i++) {
        sum2 += b[i];
    }
    return sum1 + sum2;
}

console.log(testArray([0, 1, 5, 3], [3]))