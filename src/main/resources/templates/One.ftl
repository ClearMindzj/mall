    <html>
<link href="https://cdn.bootcss.com/twitter-bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet">
<div class="container">
   <#-- <#assign json=text ? eval/>-->
    <div class="row clearfix">
        <div class="col-md-12 column">
            <h3>
                柴油机最新污染信息
            </h3>
            <table class="table table-bordered">
                <thead>
                <tr>
                    <th>柴油机编号</th>
                    <th>柴油机编号</th>
                </tr>
                </thead>
                <tbody>

                    <tr>
                        <td>${text.status}</td>
                        <td>${text.data.pageNum}</td>
                    </tr>

                </tbody>
            </table>
        </div>
    </div>
</div>
</html>