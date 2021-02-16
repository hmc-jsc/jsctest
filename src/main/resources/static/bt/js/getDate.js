$(function () {
    $.post({
        url:"http://localhost:8181/user/getAll",
        success:function (data) {
            for (var i = 0;i<data.length;i++){
                var text = "    <tr>\n" +
                    "                <th>"+data[i].id+"</th>\n" +
                    "                <th>"+data[i].username+"</th>\n" +
                    "                <th>"+data[i].pwd+"</th>\n" +
                    "                <th>"+data[i].createtime+"</th>\n" +
                    "                <th>"+data[i].status+"</th>\n" +
                    "                <th>\n" +
                    "                    <a href=\"http://localhost:8181/user/delById?id="+data[i].id+"\" class=\"btn btn-danger\">删除</a>\n" +
                    "                    <a href=\"#\" class=\"btn btn-success\">修改</a>\n" +
                    "                </th>\n" +
                    "            </tr>"
                $(".pool").append(text);
                console.log(text)
            }
        }
    })
})