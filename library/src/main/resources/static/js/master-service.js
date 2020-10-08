function insertAuthorName(){
	var authorName = $("#txtAuthorName").val();
	$.ajax({

		type: "post",
		url: "/library/master/addAuthor?authName="+authorName,      //Controller
		headers: {
			'Authorization':'Admin',
			'Content-Type':'application/json'
		},
		success: function(response){
			alert(response);
		},
		error: function(){
			alert("Error occured");
		}
	});
}

function insertPublishName(){
	var publisherName = $("#txtPublishName").val();
	$.ajax({

		type: "post",
		url: "/library/master/addPublisher?publishName="+publisherName,      //Controller
		headers: {
			'Authorization':'Admin',
			'Content-Type':'application/json'
		},
		success: function(response){
			alert(response);
		},
		error: function(){
			alert("Error occured");
		}
	});
}


function getPublisher(){
	$.ajax({

		type: "get",
		url: "/library/master/getPublisher",     
		headers: {
			'Authorization':'Admin',
			'Content-Type':'application/json'
		},
		success: function(response){
			$.each(response,function(i,obj)
			{
			 var div_data="<option value="+obj.id+">"+obj.name+"</option>";
			$(div_data).appendTo('#publishId'); 
			});  
		},
		error: function(){
			alert("Error occured");
		}
	});
}


function getAuthor(){

	$.ajax({

		type: "get",
		url: "/library/master/getAuthor",      //Controller
		headers: {
			'Authorization':'Admin',
			'Content-Type':'application/json'
		},
		success: function(response){
			$.each(response,function(i,obj)
			{
			 var div_data="<option value="+obj.id+">"+obj.name+"</option>";
			$(div_data).appendTo('#authorId'); 
			}); 
		},
		error: function(){
			alert("Error occured");
		}
	});
}

function insertBookDetails(){
	// e.preventDefault();
	debugger
	var bookDetails={
		bookName 		: $("#title").val(),
		bookCode  		: $("#code").val(),
		bookAuthor		: $("#authorId").val(),
		volume 			: $("#volume").val(),
		publisher		: $("#publishId").val(),
	}

	$.ajax({

		type: "post",
		url: "/library/master/addBook",      //Controller
		data: JSON.stringify(bookDetails),
		headers: {
			'Authorization':'Admin',
			'Content-Type':'application/json'
		},
		success: function(response){
			alert(response); 
		},
		error: function(){
			alert("Error occured");
		}
	});
}


function getBookDetails(){

	$.ajax({

		type: "get",
		url: "/library/master/getBookDetails",      //Controller
		headers: {
			'Authorization':'Admin',
			'Content-Type':'application/json'
		},
		success: function(response){
			$.each(response,function(i,obj)
			{
			 var div_data="<tr><td>"+obj.bookName+"</td><td>"+obj.bookCode+"</td><td>"+obj.volume+"</td><td>"+obj.authorName+"</td><td>"+obj.publisherName+"</td><td onClick=''>edit</td></tr>";
			$(div_data).appendTo('#allBookDetails'); 
			}); 
		},
		error: function(){
			alert("Error occured");
		}
	});
}