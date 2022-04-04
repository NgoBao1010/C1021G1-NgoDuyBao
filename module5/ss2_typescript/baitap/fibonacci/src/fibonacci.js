var fibonacci = function (num) {
    if (num <= 1) {
        return num;
    }
    else {
        return fibonacci(num - 1) + fibonacci(num - 2);
    }
};
var sum = 0;
for (var i = 0; i < 10; i++) {
    console.log(fibonacci(i));
    sum += fibonacci(i);
}
console.log("T\u1ED5ng 10 s\u1ED1 fibonacci \u0111\u1EA7u ti\u00EAn l\u00E0: " + sum);
