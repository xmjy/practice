<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>51_index</title>
    <script src="/static/js/jquery.min.js"></script>
</head>
<body>
<table id = "table_list" border="1">
    <thead>
        <th>类别id</th>
        <th>类别名称</th>
        <th>类别类型</th>
        <th>创建时间</th>
        <th>更新时间</th>
    </thead>
    <tbody id="tbody">
        
    </tbody>
</table>
当前页：<input  id="currentPage"  readonly><br>
共<input id="totalPage" readonly>几页<br>
<button onclick="getAllCategory(1,2)">首页</button>
<button onclick='getAllCategory(Number($("#currentPage").val())-1,2)'>上一页</button>
<button onclick='getAllCategory(Number($("#currentPage").val())+1,2)'>下一页</button>
<button onclick='getAllCategory(Number($("#totalPage").val()),2)'>尾页</button><br>
<a href="/51/page/index2Paging">another page</a><br>
<a href="/51/login/loginOut">退出登录</a>
</body>
<script>
    $(function () {
       getAllCategory(1,2);
    });
    function getAllCategory(pageNum,pageSize) {
        if (pageNum < 1 && $("#currentPage").val() != "" ){
            alert("当前是首页，不能上一页")
            return;
        }
        if (pageNum > $("#totalPage").val() && $("#totalPage").val() != ""){
            alert("当前是尾页，不能下一页");
            return;
        }
        $.ajax({
            type:"get",
            url:"/51/getAllProductCategory",
            data:{
                pageNum:pageNum,
                pageSize:pageSize
            },
            dataType:"json",
            success:function (data) {
                $("#totalPage").val(Math.ceil(data.totalCount/pageSize));
                $("#currentPage").val(pageNum);
                $("#tbody").html("");
                for (var i = 0; i < data.result.length; i++){
                    var content = "<tr><td>"+data.result[i].categoryId+"</td><td>"+data.result[i].categoryName+"</td>"
                            +"<td>"+data.result[i].categoryType+"</td><td>"+data.result[i].createTime+"</td>"
                            +"<td>"+data.result[i].updateTime+"</td></tr>";
                    $("#tbody").append(content);
                }
            },
            error:function () {
                // 失败的话跳转回登录页面
                window.location.href="/51/page/toLoginPage";
            }
        })

    }
</script>
</html>