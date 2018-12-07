<%@ include file = "header.jsp" %>
         <div class="col-md-9">
                    
            
                Books
                <table class="table table-striped">
            <thead>
              <tr>
                <th>ISBN</th>
                <th>TITLE</th>
                <th>NUMBER OF PAGES</th>
                <th></th>
              </tr>
            </thead>
            <tbody>
            <ul class="nav">
                <c:forEach items="${allbooks}" var="b">
               
               
              <tr  href="#" >
                <td>${b.isbn}</td>
                <td>${b.title}</td>
                <td>${b.numberOfPages}</td>
                <td><a href="#" id="sold" name="isbn" value="${b.isbn}" ><i class="fas fa-cart-plus"></i></a></td>
              </tr>
               </c:forEach>
            </ul>
            </tbody>
          </table>
                


            </div>
            <!--/.well -->
        </div>
        <!--/sidebar-nav-fixed -->
    </div>
</div>
</div>
    </body>
</html>
