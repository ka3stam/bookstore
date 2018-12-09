<%@ include file = "header.jsp" %>
         <div class="col-md-9">
                    
            
                Books
                <table class="table table-striped">
            <thead>
              <tr>
                <th>ISBN</th>
                <th>TITLE</th>
                <th>numberOfPages</th>
                <th>Add to cart</th>
              </tr>
            </thead>
            <tbody>
                 <ul class="nav">
             
               
               
              <tr  href="#" >
                <td>${bestseller.isbn}</td>
                <td>${bestseller.title}</td>
                <td>${bestseller.numberOfPages}</td>
                <td><a href="#" id="sold" name="isbn" value="${bestseller.isbn}" ><i class="fas fa-cart-plus"></i></a></td>
              </tr>
             </ul>
            </tbody>
          </table>
                
            
 <div id="ajaxoutput"></div>

            </div>
            <!--/.well -->
        </div>
        <!--/sidebar-nav-fixed -->
    </div>
</div>
</div>
<script>
             $(document).ready(function () { // ???? ???????? ? ?????? ?????....
                $("#sold").click(function () { 
                   var text = $(this).val();
                    $.ajax({
                        url: 'buybook.htm?isbn=' + text,
                        contentType: 'aplication/json',
                        success: function (result) {
                            $("#ajaxoutput").empty();
                            $("#ajaxoutput").append($.parseJSON(result)); }
                    });
                });
            });
        </script>     
    </body>
</html>
