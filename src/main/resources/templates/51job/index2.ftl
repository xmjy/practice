<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>51_index2</title>
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
        <#list voPage.TList as pc>
            <tr>
                <td>
                    ${pc.categoryId}
                </td>
                <td>
                    ${pc.categoryName}
                </td>
                <td>
                    ${pc.categoryType}
                </td>
                <td>
                    <#-- freemarker将date类型转成指定格式字符串日期-->
                    ${pc.createTime ? string('yyyy-MM-dd HH:mm:ss')}
                </td>
                <td>
                    ${pc.updateTime ? string('yyyy-MM-dd HH:mm:ss')}
                </td>
            </tr>
        </#list>
    </tbody>
</table>
<form id = "operate">
当前第<input name="pageNum" id="pageNum" value="${voPage.currentPage}" onchange="jumpPage()">页/共<span style="color:red">${voPage.totalPage}</span>页 每页显示<input id = "pageSize" name="pageSize" onchange="everyPageShow()" value="${voPage.pageSize}">条/共<span style="color:red">${voPage.totalCount}</span>条
<br>
<a href="/51/page/index2Paging?pageNum=1&pageSize=${voPage.pageSize}">首 页</a>
<#if voPage.currentPage lte 1>
    <a href="javascript:void(0)">上一页</a>
</#if>
<#if voPage.currentPage gt 1>
    <a href="/51/page/index2Paging?pageNum=${voPage.currentPage - 1}&pageSize=${voPage.pageSize}">上一页</a>
</#if>
<#if voPage.currentPage gte voPage.totalPage>
    <a href="javascript:void(0)">下一页</a>
</#if>
<#if voPage.currentPage lt voPage.totalPage>
    <a href="/51/page/index2Paging?pageNum=${voPage.currentPage + 1}&pageSize=${voPage.pageSize}">下一页</a>
</#if>
<a href="/51/page/index2Paging?pageNum=${voPage.totalPage}&pageSize=${voPage.pageSize}">尾 页</a>
</form>
</body>
<script>
    //日期格式化成：yyyy-MM-dd HH:mm:ss
    function formatDate(date) {
        var year = date.getFullYear();
        var month = date.getMonth()+1;
        var day = date.getDate();
        var hour = date.getHours();
        var minute = date.getMinutes();
        var second = date.getSeconds();
        var formatDate = year+"-"+month+"-"+day+" "+hour+":"+minute+":"+second;
        return formatDate;
    }

    // 每页显示多少条
    function everyPageShow(){
        var pageNum = $("#pageNum").val();
        var pageSize = $("#pageSize").val();
        if (pageSize > 16){
            alert("每页最多显示15条记录");
            $("#pageSize").val(${voPage.pageSize});
            return;
        }
        var url = "/51/page/index2Paging";
        $("#operate").action = url;
        $("#operate").submit();
    }

    // 跳转到第几页
    function jumpPage() {
        var pageNum = $("#pageNum").val();
        var pageSize = $("#pageSize").val();
        if (pageNum > ${voPage.totalPage}){
            pageNum = ${voPage.totalPage};
            $("#pageNum").val(pageNum);
        }
        var url = "/51/page/index2Paging";
        $("#operate").action = url;
        $("#operate").submit();
    }
</script>
</html>