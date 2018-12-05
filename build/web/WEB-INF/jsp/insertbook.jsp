<%@ include file = "header.jsp" %>
 <div class="col-md-9">
        <spring:form modelAttribute="book" action="insertbook.htm" method="POST" id="fileForm" role="form" enctype="multipart/form-data" >
                
            
                <spring:label path="isbn"> ISBN: </spring:label>
                <spring:input path="isbn" class="form-control" type="number" name="isbn" required="required" /> 
                <spring:errors path="isbn" />
                       
          
                <spring:label path="title"> title: </spring:label>
                <spring:input path="title" class="form-control" required="required" type="text" name="title" />   
                <spring:errors path="title" />


                <spring:label path="numberOfPages"> number Of Pages: </spring:label>
                <spring:input path="numberOfPages" class="form-control" type="number" name="numberOfPages" />  
                <spring:errors path="numberOfPages" />

                <spring:select path="categoryId" items="${categ}" itemLabel="title" itemValue="id" name = "catego"/>
                <spring:errors path="categoryId" />

                <spring:label path="cover"> cover </spring:label>
                <spring:input path="cover" name="cover" type="file" /> 
                <spring:errors path="cover" />
         
                <input class="btn btn-success" type="submit" name="submit_reg" value="Add">
 
           
       </spring:form>
        </div>
        <!--/sidebar-nav-fixed -->
        </div>
    </div>
</div>
</div>
    </body>
</html>

    </body>
</html>
