// 实现一个简单的断言函数
function assert(value,desc) {
    var li = document.createElement("li");
    li.className = value ? "pass" : "fail";
    li.appendChild(document.createTextNode(desc));
    document.getElementById("results").appendChild(li);
}

// 创建一个report()方法
function report(text){
    assert(true,text);
}