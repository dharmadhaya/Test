//A $(document).ready() block.
$(document).ready(function () {
	//alert("11");

	$('#success_usr_msg').hide();
	$('#error_usr_msg').hide();
	$('#Invalid_usr_msg').hide();
	$('#logOut_usr_msg').hide();
	
	//window.history.forward(1);

	window.history.pushState(null, "", window.location.href);
	window.onpopstate = function () {
		alert('hai2');
		window.history.pushState(null, "", window.location.href);

	};

})


var userAcc={
	useFullName : "",
	useName 	: "",
	usePassword : ""
}

function getUserAccountDetails(){

	userAcc.useFullName 	= $('#txtFullName').val();
	userAcc.useName     	= $('#txtUseName').val();
	userAcc.usePassword     = $('#txtUsePassword').val();

	$.ajax({
		type: "post",
		url: "/library/user/createAccount", // Controller
		contentType: "Application/json", // JSON Format
		data: JSON.stringify(userAcc),
		success: function (response) {
			alert(response);
		},
		error: function () {
			alert("Error occured");
		}
	});

}




function getUserDetails() {
	user.userName = $('#txtUserName').val();
	user.password = $('#txtPassword').val();
	if (user.userName == "") {
		alert("Sorry! Empty Not Allowed to Submit.. ");
		return;
	}
	$.ajax({
		type: "post",
		url: "/library/user/login", // Controller
		contentType: "Application/json", // JSON Format
		data: JSON.stringify(user),
		success: function (response) {
			window.location.href = "index.html";
		},
		error: function () {
			$('#Invalid_usr_msg').show();
		}
	});
}


