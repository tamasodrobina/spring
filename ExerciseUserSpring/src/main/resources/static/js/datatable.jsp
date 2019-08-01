$(document).ready( function () {
	 var table = $('#usersTable').DataTable({
			"sAjaxSource": "http://localhost:8080/users",
			"sAjaxDataProp": "",
			"order": [[ 0, "asc" ]],
			"aoColumns": [
			      { "mData": "id"},
		          { "mData": "name" },
				  { "mData": "email" }
			]
	 })
});