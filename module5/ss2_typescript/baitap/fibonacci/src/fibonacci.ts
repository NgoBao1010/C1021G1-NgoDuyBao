let fibonacci = (num: number): number => {
    if (num <= 1) {
        return num;
    }else {
        return fibonacci(num - 1 ) + fibonacci(num - 2);
    }
}
let sum = 0;
let number = 10;
for (let i = 0; i < number; i++) {
    console.log(fibonacci(i));
    sum += fibonacci(i);
}
console.log(`Tổng ${number} số fibonacci đầu tiên là: ` + sum);
