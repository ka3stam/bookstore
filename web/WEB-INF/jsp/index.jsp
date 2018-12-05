<%@ include file = "header.jsp" %>
         <div class="col-md-9">
                    
            <ul class="nav">
                <li class="nav-header">Books</li>
                <table class="table table-striped">
            <thead>
              <tr>
                <th>ISBN</th>
                <th>TITLE</th>
                <th>numberOfPages</th>
              </tr>
            </thead>
            <tbody>
                <c:forEach items="${allbooks}" var="b">
               
               
              <tr  href="#" >
                <td>${b.isbn}</td>
                <td>${b.title}</td>
                <td>${b.numberOfPages}</td>
              </tr>
               </c:forEach>
            </tbody>
          </table>
                
            </ul>


            </div>
            <!--/.well -->
        </div>
        <!--/sidebar-nav-fixed -->
    </div>
</div>
</div>
    </body>
</html>
