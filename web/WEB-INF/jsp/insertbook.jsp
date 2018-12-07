<%@ include file = "header.jsp" %>
 <div class="col-md-9">
        <spring:form modelAttribute="book" action="insertbook.htm" method="POST" id="fileForm" role="form" enctype="multipart/form-data" >
                
            <div class="form-group">
                 <div class="col-xs-6">
		        <div class="text-center">
                            <img src="http://ssl.gstatic.com/accounts/ui/avatar_2x.png" class="avatar img-thumbnail" alt="avatar">
                            <h6>Upload a different photo...</h6>
                            <spring:input path="cover" name="cover" type="file" class="text-center center-block file-upload"  /> 
                            <spring:errors path="cover" />
                        </div>
                 </div>
            </div>
            
            <div class="form-group">
                <div class="col-xs-6">
                    <spring:label path="isbn" for="isbn" ><h4> ISBN </h4></spring:label>
                    <spring:input path="isbn" class="form-control" type="number" name="isbn" value="" min="0" max="9799999999999" required="required" title="enter book's isbn." /> 
                    <spring:errors path="isbn" />
                </div>
            </div>           
                
            <div class="form-group">
                <div class="col-xs-6">
                    <spring:label path="title" for="title" ><h4> Title </h4></spring:label>
                    <spring:input path="title" class="form-control" required="required" type="text" name="title" title="enter book's title." />   
                    <spring:errors path="title" />
                </div>
            </div>
                 
            <div class="form-group">
                <div class="col-xs-6">
                    <spring:label path="numberOfPages" for="numberOfPages"><h4> Number Of Pages </h4></spring:label>
                    <spring:input path="numberOfPages" class="form-control" type="number" name="numberOfPages" value="" min="0" max="5000" title="enter number of pages." />  
                    <spring:errors path="numberOfPages" />
                </div>
            </div>
            <div class="form-group">
                <div class="col-xs-6"> 
                    <spring:label path="title" for="catego"><h4> Choose Category </h4></spring:label>
                    <spring:select path="categoryId" items="${categ}" itemLabel="title" itemValue="id" name = "catego"/>
                    <spring:errors path="categoryId" />
                </div>
            </div>
                
                <div class="form-group">
                           <div class="col-xs-12">
                                <br>
                              	<button class="btn btn-lg btn-success pull-right" type="submit" name="submit_reg" ><i class="glyphicon glyphicon-ok-sign"></i> Save</button>
                               	<button class="btn btn-lg pull-right" type="reset"><i class="glyphicon glyphicon-repeat"></i> Reset</button>
                            </div>
                </div>
 
           
       </spring:form>
        </div>
        <!--/sidebar-nav-fixed -->
        </div>
    </div>
</div>
</div>
<script>
	$(document).ready(function() {

    
    var readURL = function(input) {
        if (input.files && input.files[0]) {
            var reader = new FileReader();

            reader.onload = function (e) {
                $('.avatar').attr('src', e.target);
            }
    
            reader.readAsDataURL(input.files[0]);
        }
    }
    

    $(".file-upload").on('change', function(){
        readURL(this);
    });
});
</script>
    </body>
</html>
