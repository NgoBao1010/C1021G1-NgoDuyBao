let array = ["C300","C250","C200","C180"];
let display = null;
let data = "";
let product = "";
let add = document.getElementById("add");
let update = document.getElementById("update");
let edit = "";
function displayData(){
    checkUpdate();
    display = document.getElementById("display");
    if(array.length>0){
        data = "<div><h3>The New C-CLass 2022</h3></div>";
        data += "<table border='1' style= 'cellspacing ='0' cellpadding='10px'> " +
            "<tr><th>Tên Sản Phẩm</th>" +
            "<th colspan='2' style='text-align: right; color: #f50146'>" + "Có " + array.length + " Sản Phẩm"+"</th></tr>";
        for(let i = 0;i<array.length;i++){
            if(i%2==0){
                data += "<tr>" +
                    "<td>"+array[i]+"</td>" +
                    "<td><button onclick='editData(this.id)' type='button' id='" + "edit" + i + "'" + ">Edit</button></td>"+
                    "<td><button onclick='deleteData(this.id)' type='button'  id='" + "delete" + i + "'" + ">Delete</button></td>"+
                    "</tr>";
            }else {
                data += "<tr>" +
                    "<td>"+array[i]+"</td>" +
                    "<td><button onclick='editData(this.id)' type='button'  id='"+"edit"+i+"'"+">Edit</button></td>"+
                    "<td><button onclick='deleteData(this.id)' type='button'  id='"+"edit"+i+"'"+">Delete</button></td>"+
                    "</tr>";
            }
        }
        data +="</table>";
    }
    display.innerHTML = data;
}
function checkUpdate() {
    if(add.innerText === "Add"){
        add.addEventListener("click", addData);
    }
    if (update.innerText === "Edit"){
        update.addEventListener("click", updateData);
    }
}

function addData(){
    product = document.getElementById("themVao");
    if(product.value !== ""){
        array.push(product.value);
        product.value = "";
        displayData();
    }
}
function editData(id) {
    let index = id.split("")[id.length-1];
    edit  = index;
    edit.innerText = "Edit";
    product = document.getElementById("edit");
    product.value = array[index];
    checkUpdate()
}

function updateData() {
    edit.innerText = "Edit";
    product = document.getElementById("edit");
    array[edit] = product.value;
    displayData();
    checkUpdate();
    product.value = "";
}
function deleteData(id) {
    let index = id.split("")[id.length-1];
    array.splice(index,1);
    displayData();
}