function testArray(a, b) {
    let arr1 = a.split('');
    let str = '';
    Array.prototype.push.apply(arr1, b.split(''));
    arr1.unshift('Иванов');
    arr1.reverse();
    arr1.join('');
    for (var i = 0; i < arr1.length; i++) {
        str = str + arr1[i];
    }
    return str;
    // Тут нужно написать решение
}





