function tinhBinhPhuong(number) {
    let result = number * number;
    return result;
}
function tinhToan() {
    let input = document.getElementById("input").value;
    let result = square(input);
    document.getElementById("result").innerHTML = result;
}
function nhapDoF(valNumber) {
    valNumber = parseFloat(valNumber);
    document.getElementById("result").innerHTML = (valNumber - 32)/1.8;
}
function kiemTraGiaTriMin(arr){
    if (arr4.length === 0){
        return "Mảng trống";
    }else {
        let min = arr[0];
        for (let i = 0;i < arr.length;i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

}
function kiemTraGiaTriMax(arr){
    if (arr4.length === 0){
        return "Mảng trống";
    }else {
        let max = arr[0];
        for (let i = 0;i < arr.length;i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

}